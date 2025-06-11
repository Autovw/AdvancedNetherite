package com.autovw.advancednetherite.common.loot;

import com.autovw.advancednetherite.common.item.AdvancedHoeItem;
import com.autovw.advancednetherite.config.ConfigHelper;
import com.mojang.serialization.MapCodec;
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
import net.neoforged.neoforge.common.loot.LootModifier;
import org.jetbrains.annotations.NotNull;

// TODO rework loot modifiers
/**
 * A loot modifier for adding additional drops to crop blocks.
 * See {@link com.autovw.advancednetherite.datagen.providers.ModLootModifierProvider} for example implementation.
 * @apiNote This loot modifier can be disabled by {@link com.autovw.advancednetherite.config.Config.AdditionalDropsConfig#enableAdditionalCropDrops}
 * @author Autovw
 */
public class CropDropsLootModifier extends LootModifier
{
    public static final MapCodec<CropDropsLootModifier> CODEC = RecordCodecBuilder.mapCodec(instance -> codecStart(instance).apply(instance, CropDropsLootModifier::new));

    /**
     * Constructs a LootModifier.
     *
     * @param conditionsIn the ILootConditions that need to be matched before the loot is modified.
     */
    public CropDropsLootModifier(LootItemCondition[] conditionsIn)
    {
        super(conditionsIn);
    }

    @NotNull
    @Override
    protected ObjectArrayList<ItemStack> doApply(ObjectArrayList<ItemStack> generatedLoot, LootContext context)
    {
        ItemStack tool = context.getOptionalParameter(LootContextParams.TOOL);
        BlockState blockState = context.getOptionalParameter(LootContextParams.BLOCK_STATE);

        if (tool != null && blockState != null && ConfigHelper.get().getCommon().getAdditionalDrops().enableAdditionalCropDrops())
        {
            if (!(tool.getItem() instanceof AdvancedHoeItem))
            {
                return generatedLoot;
            }

            Block block = blockState.getBlock();
            if (block instanceof CropBlock cropBlock && cropBlock.isMaxAge(blockState))
            {
                RandomSource random = context.getRandom();

                if (cropBlock == Blocks.WHEAT && random.nextFloat() <= ConfigHelper.get().getServer().getAdditionalDropProperties().getAdditionalWheatDropChance())
                {
                    generatedLoot.add(new ItemStack(Items.WHEAT, random.nextIntBetweenInclusive(0, 2)));
                }
                if (cropBlock == Blocks.CARROTS && random.nextFloat() <= ConfigHelper.get().getServer().getAdditionalDropProperties().getAdditionalCarrotsDropChance())
                {
                    generatedLoot.add(new ItemStack(Items.CARROT, random.nextIntBetweenInclusive(0, 2)));
                }
                if (cropBlock == Blocks.POTATOES && random.nextFloat() <= ConfigHelper.get().getServer().getAdditionalDropProperties().getAdditionalPotatoesDropChance())
                {
                    generatedLoot.add(new ItemStack(Items.POTATO, random.nextIntBetweenInclusive(0, 1)));
                }
                if (cropBlock == Blocks.BEETROOTS && random.nextFloat() <= ConfigHelper.get().getServer().getAdditionalDropProperties().getAdditionalBeetrootsDropChance())
                {
                    generatedLoot.add(new ItemStack(Items.BEETROOT, random.nextIntBetweenInclusive(1, 2)));
                }
            }
        }
        return generatedLoot;
    }

    @Override
    public MapCodec<CropDropsLootModifier> codec()
    {
        return CODEC;
    }
}
