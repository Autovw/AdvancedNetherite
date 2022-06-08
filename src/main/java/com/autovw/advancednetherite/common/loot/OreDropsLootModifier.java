package com.autovw.advancednetherite.common.loot;

import com.autovw.advancednetherite.config.Config;
import com.google.gson.JsonObject;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.GsonHelper;
import net.minecraft.util.RandomSource;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.storage.loot.parameters.LootContextParams;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraftforge.common.loot.GlobalLootModifierSerializer;
import net.minecraftforge.common.loot.LootModifier;
import net.minecraftforge.registries.ForgeRegistries;
import org.jetbrains.annotations.NotNull;

/**
 * Author: Autovw
 * <br/>
 * A loot modifier for adding additional drops to blocks.
 * See {@link com.autovw.advancednetherite.datagen.providers.ModLootModifierProvider} for example implementation.
 * @apiNote This loot modifier can be disabled by {@link com.autovw.advancednetherite.config.Config.AdditionalDropsConfig#enableAdditionalOreDrops}
 */
public class OreDropsLootModifier extends LootModifier {
    private final Item bonusDropItem;
    private final float bonusDropChance;
    private final int minDropAmount, maxDropAmount;

    /**
     * Constructs a LootModifier.
     *
     * @param conditionsIn the ILootConditions that need to be matched before the loot is modified.
     * @param bonusDropItem additional drop item
     * @param bonusDropChance chance of the additional item being dropped
     * @param minDropAmount the minimum amount of items to be dropped
     * @param maxDropAmount the maximum amount of items to be dropped
     */
    public OreDropsLootModifier(LootItemCondition[] conditionsIn, Item bonusDropItem, float bonusDropChance, int minDropAmount, int maxDropAmount) {
        super(conditionsIn);
        this.bonusDropItem = bonusDropItem;
        this.bonusDropChance = bonusDropChance;
        this.minDropAmount = minDropAmount;
        this.maxDropAmount = maxDropAmount;
    }

    @NotNull
    @Override
    protected ObjectArrayList<ItemStack> doApply(ObjectArrayList<ItemStack> generatedLoot, LootContext context) {
        ItemStack tool = context.getParamOrNull(LootContextParams.TOOL);
        if (tool != null && Config.AdditionalDropsConfig.enableAdditionalOreDrops.get()) {
            if (EnchantmentHelper.getEnchantments(tool).containsKey(Enchantments.SILK_TOUCH)) {
                return generatedLoot; // return early if tool is enchanted with silk touch
            }
            if (bonusDropChance > 0.0 && bonusDropItem != null) {
                RandomSource random = context.getRandom();
                if (maxDropAmount >= minDropAmount && random.nextFloat() <= bonusDropChance) { // apply the chance
                    generatedLoot.add(new ItemStack(bonusDropItem, random.nextIntBetweenInclusive(minDropAmount, maxDropAmount + 1)));
                }
            }
        }
        return generatedLoot;
    }

    public static class Serializer extends GlobalLootModifierSerializer<OreDropsLootModifier> {

        @Override
        public OreDropsLootModifier read(ResourceLocation location, JsonObject object, LootItemCondition[] ailootcondition) {
            JsonObject bonusDropObject = GsonHelper.getAsJsonObject(object, "bonus_drop");
            Item bonusDropItem = ForgeRegistries.ITEMS.getValue(new ResourceLocation(GsonHelper.getAsString(bonusDropObject, "item")));
            float bonusDropChance = GsonHelper.getAsFloat(bonusDropObject, "chance");
            int minDropAmount = GsonHelper.getAsInt(bonusDropObject, "min");
            int maxDropAmount = GsonHelper.getAsInt(bonusDropObject, "max");
            return new OreDropsLootModifier(ailootcondition, bonusDropItem, bonusDropChance, minDropAmount, maxDropAmount);
        }

        @Override
        public JsonObject write(OreDropsLootModifier instance) {
            JsonObject object = makeConditions(instance.conditions);
            JsonObject bonusDropObject = new JsonObject();
            object.add("bonus_drop", bonusDropObject);
            bonusDropObject.addProperty("item", ForgeRegistries.ITEMS.getKey(instance.bonusDropItem).toString());
            bonusDropObject.addProperty("chance", instance.bonusDropChance);
            bonusDropObject.addProperty("min", instance.minDropAmount);
            bonusDropObject.addProperty("max", instance.maxDropAmount);
            return object;
        }
    }
}
