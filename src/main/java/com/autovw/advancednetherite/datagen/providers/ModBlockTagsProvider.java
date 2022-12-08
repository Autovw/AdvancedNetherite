package com.autovw.advancednetherite.datagen.providers;

import com.autovw.advancednetherite.core.registry.ModBlocks;
import com.autovw.advancednetherite.core.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

/**
 * Author: Autovw
 */
public class ModBlockTagsProvider extends BlockTagsProvider {
    public ModBlockTagsProvider(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> lookupProvider, String modId, @Nullable ExistingFileHelper existingFileHelper) {
        super(packOutput, lookupProvider, modId, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider lookupProvider) {
        /* Mod Tags */
        tag(ModTags.NETHERITE_BLOCKS)
                .add(
                        ModBlocks.NETHERITE_IRON_BLOCK.get(),
                        ModBlocks.NETHERITE_GOLD_BLOCK.get(),
                        ModBlocks.NETHERITE_EMERALD_BLOCK.get(),
                        ModBlocks.NETHERITE_DIAMOND_BLOCK.get()
                );

        /* Vanilla Tags */
        tag(BlockTags.MINEABLE_WITH_PICKAXE).addTag(ModTags.NETHERITE_BLOCKS);

        tag(BlockTags.NEEDS_DIAMOND_TOOL).addTag(ModTags.NETHERITE_BLOCKS);

        tag(BlockTags.BEACON_BASE_BLOCKS).addTag(ModTags.NETHERITE_BLOCKS);

        tag(BlockTags.GUARDED_BY_PIGLINS).add(ModBlocks.NETHERITE_GOLD_BLOCK.get());
    }
}
