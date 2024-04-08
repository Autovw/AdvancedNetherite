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
        getOrCreateTagBuilder(ModTags.NETHERITE_BLOCKS)
                .add(ModBlocks.NETHERITE_IRON_BLOCK)
                .add(ModBlocks.NETHERITE_GOLD_BLOCK)
                .add(ModBlocks.NETHERITE_EMERALD_BLOCK)
                .add(ModBlocks.NETHERITE_DIAMOND_BLOCK);


        // Vanilla block tags
        getOrCreateTagBuilder(BlockTags.MINEABLE_WITH_PICKAXE)
                .addTag(ModTags.NETHERITE_BLOCKS);
        getOrCreateTagBuilder(BlockTags.BEACON_BASE_BLOCKS)
                .addTag(ModTags.NETHERITE_BLOCKS);
        getOrCreateTagBuilder(BlockTags.GUARDED_BY_PIGLINS)
                .add(ModBlocks.NETHERITE_GOLD_BLOCK);
        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                .addTag(ModTags.NETHERITE_BLOCKS);


        // Common block tags
        getOrCreateTagBuilder(FabricModTags.COMMON_NETHERITE_BLOCKS)
                .addTag(ModTags.NETHERITE_BLOCKS);
    }
}
