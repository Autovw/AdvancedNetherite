package com.autovw.advancednetherite.datagen.providers;

import com.autovw.advancednetherite.core.ModBlocks;
import com.autovw.advancednetherite.core.ModTags;
import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.ExistingFileHelper;

/**
 * Author: Autovw
 */
public class ModBlockTagsProvider extends BlockTagsProvider {
    public ModBlockTagsProvider(DataGenerator generator, String modId, ExistingFileHelper existingFileHelper) {
        super(generator, modId, existingFileHelper);
    }

    @Override
    protected void addTags() {
        /* Mod Tags */
        tag(ModTags.NETHERITE_BLOCKS)
                .add(ModBlocks.NETHERITE_IRON_BLOCK.get())
                .add(ModBlocks.NETHERITE_GOLD_BLOCK.get())
                .add(ModBlocks.NETHERITE_EMERALD_BLOCK.get())
                .add(ModBlocks.NETHERITE_DIAMOND_BLOCK.get());

        /* Vanilla Tags */
        tag(BlockTags.BEACON_BASE_BLOCKS).addTag(ModTags.NETHERITE_BLOCKS);

        tag(BlockTags.GUARDED_BY_PIGLINS).add(ModBlocks.NETHERITE_GOLD_BLOCK.get());
    }
}
