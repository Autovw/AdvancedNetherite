package com.autovw.advancednetherite.datagen.providers;

import com.autovw.advancednetherite.core.ModBlocks;
import com.autovw.advancednetherite.core.util.FabricModTags;
import com.autovw.advancednetherite.core.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.BlockTags;

import java.util.concurrent.CompletableFuture;

/**
 * @author Autovw
 */
public class ModBlockTagsProvider extends FabricTagProvider.BlockTagProvider
{
    public ModBlockTagsProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture)
    {
        super(output, registriesFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider arg)
    {
        // Mod block tags
        valueLookupBuilder(ModTags.NETHERITE_BLOCKS)
                .add(ModBlocks.NETHERITE_IRON_BLOCK)
                .add(ModBlocks.NETHERITE_GOLD_BLOCK)
                .add(ModBlocks.NETHERITE_EMERALD_BLOCK)
                .add(ModBlocks.NETHERITE_DIAMOND_BLOCK);

        valueLookupBuilder(ModTags.INCORRECT_FOR_NETHERITE_IRON_TOOL)
                //.addTag(BlockTags.INCORRECT_FOR_NETHERITE_TOOL)
        ;
        valueLookupBuilder(ModTags.INCORRECT_FOR_NETHERITE_GOLD_TOOL)
                //.addTag(BlockTags.INCORRECT_FOR_NETHERITE_TOOL)
        ;
        valueLookupBuilder(ModTags.INCORRECT_FOR_NETHERITE_EMERALD_TOOL)
                //.addTag(BlockTags.INCORRECT_FOR_NETHERITE_TOOL)
        ;
        valueLookupBuilder(ModTags.INCORRECT_FOR_NETHERITE_DIAMOND_TOOL)
                //.addTag(BlockTags.INCORRECT_FOR_NETHERITE_TOOL)
        ;


        // Vanilla block tags
        valueLookupBuilder(BlockTags.MINEABLE_WITH_PICKAXE)
                .addTag(ModTags.NETHERITE_BLOCKS);
        valueLookupBuilder(BlockTags.BEACON_BASE_BLOCKS)
                .addTag(ModTags.NETHERITE_BLOCKS);
        valueLookupBuilder(BlockTags.GUARDED_BY_PIGLINS)
                .add(ModBlocks.NETHERITE_GOLD_BLOCK);
        valueLookupBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                .addTag(ModTags.NETHERITE_BLOCKS);


        // Common block tags
        valueLookupBuilder(FabricModTags.COMMON_NETHERITE_BLOCKS)
                .addTag(ModTags.NETHERITE_BLOCKS);
    }
}
