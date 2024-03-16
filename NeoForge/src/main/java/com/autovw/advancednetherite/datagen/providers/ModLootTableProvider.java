package com.autovw.advancednetherite.datagen.providers;

import com.autovw.advancednetherite.core.registry.ModBlockRegistry;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.data.loot.packs.VanillaLootTableProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.ValidationContext;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.neoforged.neoforge.registries.DeferredHolder;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author Autovw
 */
public class ModLootTableProvider extends LootTableProvider
{
    private final List<SubProviderEntry> tables = List.of(new SubProviderEntry(ModBlockLootSubProvider::new, LootContextParamSets.BLOCK));

    public ModLootTableProvider(PackOutput packOutput)
    {
        super(packOutput, Set.of(), VanillaLootTableProvider.create(packOutput).getTables());
    }

    @Override
    public List<SubProviderEntry> getTables()
    {
        return this.tables;
    }

    @Override
    protected void validate(Map<ResourceLocation, LootTable> map, ValidationContext context)
    {
    }

    private static class ModBlockLootSubProvider extends BlockLootSubProvider
    {
        protected ModBlockLootSubProvider()
        {
            super(Set.of(), FeatureFlags.REGISTRY.allFlags());
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
