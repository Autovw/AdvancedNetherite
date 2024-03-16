package com.autovw.advancednetherite.datagen.providers;

import com.autovw.advancednetherite.core.ModBlocks;
import com.autovw.advancednetherite.core.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

/**
 * @author Autovw
 */
public class ModBlockTagsProvider extends BlockTagsProvider
{
    public ModBlockTagsProvider(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> lookupProvider, String modId, @Nullable ExistingFileHelper existingFileHelper)
    {
        super(packOutput, lookupProvider, modId, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider lookupProvider)
    {
        /* Mod Tags */
        tag(ModTags.NETHERITE_BLOCKS)
                .add(
                        ModBlocks.NETHERITE_IRON_BLOCK,
                        ModBlocks.NETHERITE_GOLD_BLOCK,
                        ModBlocks.NETHERITE_EMERALD_BLOCK,
                        ModBlocks.NETHERITE_DIAMOND_BLOCK
                );

        /* Vanilla Tags */
        tag(BlockTags.MINEABLE_WITH_PICKAXE).addTag(ModTags.NETHERITE_BLOCKS);

        tag(BlockTags.NEEDS_DIAMOND_TOOL).addTag(ModTags.NETHERITE_BLOCKS);

        tag(BlockTags.BEACON_BASE_BLOCKS).addTag(ModTags.NETHERITE_BLOCKS);

        tag(BlockTags.GUARDED_BY_PIGLINS).add(ModBlocks.NETHERITE_GOLD_BLOCK);
    }
}
