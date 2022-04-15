package com.autovw.advancednetherite.common.loot;

import com.google.gson.JsonObject;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.loot.LootContext;
import net.minecraft.loot.LootParameters;
import net.minecraft.loot.conditions.ILootCondition;
import net.minecraft.util.JSONUtils;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.loot.GlobalLootModifierSerializer;
import net.minecraftforge.common.loot.LootModifier;
import net.minecraftforge.registries.ForgeRegistries;

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
    public OreDropsLootModifier(ILootCondition[] conditionsIn, Item bonusDropItem, float bonusDropChance) {
        super(conditionsIn);
        this.bonusDropItem = bonusDropItem;
        this.bonusDropChance = bonusDropChance;
    }

    @Override
    protected List<ItemStack> doApply(List<ItemStack> generatedLoot, LootContext context) {
        ItemStack tool = context.getParamOrNull(LootParameters.TOOL);
        if (tool != null) {
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
        public OreDropsLootModifier read(ResourceLocation location, JsonObject object, ILootCondition[] ailootcondition) {
            Item bonusDropItem = ForgeRegistries.ITEMS.getValue(new ResourceLocation(JSONUtils.getAsString(object, "bonus_drop_item")));
            float bonusDropChance = JSONUtils.getAsFloat(object, "bonus_drop_chance");
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
