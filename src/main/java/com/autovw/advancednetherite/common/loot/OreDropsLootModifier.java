package com.autovw.advancednetherite.common.loot;

import com.autovw.advancednetherite.config.Config;
import com.google.gson.JsonObject;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.GsonHelper;
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

import java.util.List;

/**
 * Author: Autovw
 */
public class OreDropsLootModifier extends LootModifier {
    private final Item bonusDropItem;
    private final float bonusDropChance;

    /**
     * Constructs a LootModifier.
     *
     * @param conditionsIn the ILootConditions that need to be matched before the loot is modified.
     */
    public OreDropsLootModifier(LootItemCondition[] conditionsIn, Item bonusDropItem, float bonusDropChance) {
        super(conditionsIn);
        this.bonusDropItem = bonusDropItem;
        this.bonusDropChance = bonusDropChance;
    }

    @NotNull
    @Override
    protected List<ItemStack> doApply(List<ItemStack> generatedLoot, LootContext context) {
        ItemStack tool = context.getParamOrNull(LootContextParams.TOOL);
        if (tool != null && Config.AdditionalDropsConfig.enableAdditionalOreDrops.get()) {
            if (EnchantmentHelper.getEnchantments(tool).containsKey(Enchantments.SILK_TOUCH)) {
                return generatedLoot; // return early if tool is enchanted with silk touch
            }
            if (bonusDropChance > 0.0 && bonusDropItem != null) {
                if (context.getRandom().nextFloat() <= bonusDropChance) { // apply the chance
                    generatedLoot.add(new ItemStack(bonusDropItem, 1));
                }
            }
        }
        return generatedLoot;
    }

    public static class Serializer extends GlobalLootModifierSerializer<OreDropsLootModifier> {

        @Override
        public OreDropsLootModifier read(ResourceLocation location, JsonObject object, LootItemCondition[] ailootcondition) {
            Item bonusDropItem = ForgeRegistries.ITEMS.getValue(new ResourceLocation(GsonHelper.getAsString(object, "bonus_drop_item")));
            float bonusDropChance = GsonHelper.getAsFloat(object, "bonus_drop_chance");
            return new OreDropsLootModifier(ailootcondition, bonusDropItem, bonusDropChance);
        }

        @Override
        public JsonObject write(OreDropsLootModifier instance) {
            JsonObject object = makeConditions(instance.conditions);
            object.addProperty("bonus_drop_item", ForgeRegistries.ITEMS.getKey(instance.bonusDropItem).toString());
            object.addProperty("bonus_drop_chance", instance.bonusDropChance);
            return object;
        }
    }
}
