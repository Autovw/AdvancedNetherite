package com.autovw.advancednetherite.datagen.providers;

import com.autovw.advancednetherite.core.registry.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.data.loot.packs.VanillaLootTableProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.ValidationContext;
import net.minecraftforge.registries.RegistryObject;

import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Author: Autovw
 */
public class ModLootTableProvider extends LootTableProvider {
    //private final List<LootTableProvider.SubProviderEntry> tables = ImmutableList.of(Pair.of(ModBlockProvider::new, LootContextParamSets.BLOCK));

    public ModLootTableProvider(PackOutput packOutput) {
        super(packOutput, Set.of(), VanillaLootTableProvider.create(packOutput).getTables());
    }

    /*
    @Override
    public List<LootTableProvider.SubProviderEntry> getTables() {
        return this.tables;
    }
     */

    @Override
    protected void validate(Map<ResourceLocation, LootTable> map, ValidationContext context) {
    }

    private static class ModBlockProvider extends BlockLootSubProvider {
        protected ModBlockProvider(Set<Item> items, FeatureFlagSet flagSet) {
            super(items, flagSet);
        }

        @Override
        protected void generate() {
            this.dropSelf(ModBlocks.NETHERITE_IRON_BLOCK.get());
            this.dropSelf(ModBlocks.NETHERITE_GOLD_BLOCK.get());
            this.dropSelf(ModBlocks.NETHERITE_EMERALD_BLOCK.get());
            this.dropSelf(ModBlocks.NETHERITE_DIAMOND_BLOCK.get());
        }

        @Override
        protected Iterable<Block> getKnownBlocks() {
            return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get).collect(Collectors.toList());
        }
    }
}
