package com.autovw.advancednetherite.common.loot;

import com.autovw.advancednetherite.config.Config;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import net.minecraft.util.RandomSource;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.storage.loot.parameters.LootContextParams;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraftforge.common.loot.LootModifier;
import org.jetbrains.annotations.NotNull;

// TODO rework loot modifiers
/**
 * A loot modifier for adding additional drops to crop blocks.
 * See {@link com.autovw.advancednetherite.datagen.providers.ModLootModifierProvider} for example implementation.
 * @apiNote This loot modifier can be disabled by {@link com.autovw.advancednetherite.config.Config.AdditionalDropsConfig#enableAdditionalCropDrops}
 * @author Autovw
 */
public class CropDropsLootModifier extends LootModifier {
    public static final Codec<CropDropsLootModifier> CODEC = RecordCodecBuilder.create(instance -> codecStart(instance)
            .apply(instance, CropDropsLootModifier::new));

    /**
     * Constructs a LootModifier.
     *
     * @param conditionsIn the ILootConditions that need to be matched before the loot is modified.
     */
    public CropDropsLootModifier(LootItemCondition[] conditionsIn) {
        super(conditionsIn);
    }

    @NotNull
    @Override
    protected ObjectArrayList<ItemStack> doApply(ObjectArrayList<ItemStack> generatedLoot, LootContext context) {
        ItemStack tool = context.getParamOrNull(LootContextParams.TOOL);
        BlockState blockState = context.getParamOrNull(LootContextParams.BLOCK_STATE);

        if (tool != null && blockState != null && Config.AdditionalDropsConfig.enableAdditionalCropDrops.get()) {
            Block block = blockState.getBlock();
            if (block instanceof CropBlock cropBlock && cropBlock.isMaxAge(blockState)) {
                RandomSource random = context.getRandom();

                if (cropBlock == Blocks.WHEAT && random.nextFloat() <= Config.AdditionalDropProperties.additionalWheatDropChance.get()) {
                    generatedLoot.add(new ItemStack(Items.WHEAT, random.nextIntBetweenInclusive(0, 2)));
                }
                if (cropBlock == Blocks.CARROTS && random.nextFloat() <= Config.AdditionalDropProperties.additionalCarrotsDropChance.get()) {
                    generatedLoot.add(new ItemStack(Items.CARROT, random.nextIntBetweenInclusive(0, 2)));
                }
                if (cropBlock == Blocks.POTATOES && random.nextFloat() <= Config.AdditionalDropProperties.additionalPotatoesDropChance.get()) {
                    generatedLoot.add(new ItemStack(Items.POTATO, random.nextIntBetweenInclusive(0, 1)));
                }
                if (cropBlock == Blocks.BEETROOTS && random.nextFloat() <= Config.AdditionalDropProperties.additionalBeetrootsDropChance.get()) {
                    generatedLoot.add(new ItemStack(Items.BEETROOT, random.nextIntBetweenInclusive(1, 2)));
                }
            }
        }
        return generatedLoot;
    }

    @Override
    public Codec<CropDropsLootModifier> codec() {
        return CODEC;
    }
}
