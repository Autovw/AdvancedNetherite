package com.autovw.advancednetherite.datagen.providers;

import com.autovw.advancednetherite.core.registry.ModBlockRegistry;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.Registry;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.data.loot.packs.VanillaLootTableProvider;
import net.minecraft.util.ProblemReporter;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.ValidationContext;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

/**
 * @author Autovw
 */
public class ModLootTableProvider extends LootTableProvider
{
    private final List<SubProviderEntry> tables = List.of(new LootTableProvider.SubProviderEntry(ModBlockLootSubProvider::new, LootContextParamSets.BLOCK));

    public ModLootTableProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries)
    {
        super(output, Set.of(), VanillaLootTableProvider.create(output, registries).getTables(), registries);
    }

    @Override
    public List<SubProviderEntry> getTables()
    {
        return this.tables;
    }

    @Override
    protected void validate(Registry<LootTable> registry, ValidationContext context, ProblemReporter report)
    {
    }

    private static class ModBlockLootSubProvider extends BlockLootSubProvider
    {
        protected ModBlockLootSubProvider(HolderLookup.Provider provider)
        {
            super(Set.of(), FeatureFlags.REGISTRY.allFlags(), provider);
        }

        @Override
        protected void generate()
        {
            ModBlockRegistry.BLOCKS.getEntries().stream().map(RegistryObject::get).forEach(this::dropSelf);
        }

        @Override
        protected Iterable<Block> getKnownBlocks()
        {
            return ModBlockRegistry.BLOCKS.getEntries().stream().map(RegistryObject::get).collect(Collectors.toList());
        }
    }
}
