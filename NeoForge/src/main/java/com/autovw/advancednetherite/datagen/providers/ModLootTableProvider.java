package com.autovw.advancednetherite.datagen.providers;

import com.autovw.advancednetherite.core.registry.ModBlockRegistry;
import net.minecraft.core.registries.SingleRegistryBootstrap;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.data.loot.LootTableSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.neoforged.neoforge.registries.DeferredHolder;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author Autovw
 */
public class ModLootTableProvider extends LootTableProvider
{
    public ModLootTableProvider()
    {
        super(Set.of(), List.of(new SubProviderEntry(ModLootTableProvider.BlockSubProvider::new, LootContextParamSets.BLOCK)));
    }

    public static SingleRegistryBootstrap<LootTable> create()
    {
        return new ModLootTableProvider();
    }

    private static class BlockSubProvider extends BlockLootSubProvider
    {
        protected BlockSubProvider(LootTableSubProvider.Context context)
        {
            super(Set.of(), FeatureFlags.REGISTRY.allFlags(), context);
        }

        @Override
        protected void generate()
        {
            ModBlockRegistry.BLOCKS.getEntries().stream().map(DeferredHolder::get).forEach(this::dropSelf);
        }

        @Override
        protected Iterable<Block> getKnownBlocks()
        {
            return ModBlockRegistry.BLOCKS.getEntries().stream().map(DeferredHolder::get).collect(Collectors.toList());
        }
    }
}
