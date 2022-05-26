package com.autovw.advancednetherite.common.loot;

import com.autovw.advancednetherite.config.Config;
import com.google.gson.JsonObject;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.CropsBlock;
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

import javax.annotation.Nonnull;
import java.util.List;
import java.util.Random;

/**
 * Author: Autovw
 * <br/>
 * A loot modifier for adding additional drops to crop blocks.
 * See {@link com.autovw.advancednetherite.datagen.providers.ModLootModifierProvider} for example implementation.
 * @apiNote This loot modifier can be disabled by {@link com.autovw.advancednetherite.config.Config.AdditionalDropsConfig#enableAdditionalCropDrops}
 */
public class CropDropsLootModifier extends LootModifier {
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
    public CropDropsLootModifier(ILootCondition[] conditionsIn, Item bonusDropItem, float bonusDropChance, int minDropAmount, int maxDropAmount) {
        super(conditionsIn);
        this.bonusDropItem = bonusDropItem;
        this.bonusDropChance = bonusDropChance;
        this.minDropAmount = minDropAmount;
        this.maxDropAmount = maxDropAmount;
    }

    @Nonnull
    @Override
    protected List<ItemStack> doApply(List<ItemStack> generatedLoot, LootContext context) {
        ItemStack tool = context.getParamOrNull(LootParameters.TOOL);
        BlockState blockState = context.getParamOrNull(LootParameters.BLOCK_STATE);
        if (tool != null && blockState != null && Config.AdditionalDropsConfig.enableAdditionalCropDrops.get()) {
            if (bonusDropChance > 0.0 && bonusDropItem != null) {
                Block block = blockState.getBlock();
                if (block instanceof CropsBlock && ((CropsBlock) block).isMaxAge(blockState)) {
                    Random random = context.getRandom();
                    if (maxDropAmount >= minDropAmount && random.nextFloat() <= bonusDropChance) {
                        generatedLoot.add(new ItemStack(bonusDropItem, random.ints(minDropAmount, maxDropAmount + 1).iterator().nextInt()));
                    }
                }
            }
        }
        return generatedLoot;
    }

    public static class Serializer extends GlobalLootModifierSerializer<CropDropsLootModifier> {

        @Override
        public CropDropsLootModifier read(ResourceLocation location, JsonObject object, ILootCondition[] ailootcondition) {
            JsonObject bonusDropObject = JSONUtils.getAsJsonObject(object, "bonus_drop");
            Item bonusDropItem = ForgeRegistries.ITEMS.getValue(new ResourceLocation(JSONUtils.getAsString(bonusDropObject, "item")));
            float bonusDropChance = JSONUtils.getAsFloat(bonusDropObject, "chance");
            int minDropAmount = JSONUtils.getAsInt(bonusDropObject, "min");
            int maxDropAmount = JSONUtils.getAsInt(bonusDropObject, "max");
            return new CropDropsLootModifier(ailootcondition, bonusDropItem, bonusDropChance, minDropAmount, maxDropAmount);
        }

        @Override
        public JsonObject write(CropDropsLootModifier instance) {
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
