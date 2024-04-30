package com.autovw.advancednetherite.datagen.providers;

import com.autovw.advancednetherite.core.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.core.HolderLookup;

import java.util.concurrent.CompletableFuture;

/**
 * @author Autovw
 */
public class ModBlockLootTablesProvider extends FabricBlockLootTableProvider
{
    public ModBlockLootTablesProvider(FabricDataOutput dataOutput, CompletableFuture<HolderLookup.Provider> registryLookup)
    {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate()
    {
        this.dropSelf(ModBlocks.NETHERITE_IRON_BLOCK);
        this.dropSelf(ModBlocks.NETHERITE_GOLD_BLOCK);
        this.dropSelf(ModBlocks.NETHERITE_EMERALD_BLOCK);
        this.dropSelf(ModBlocks.NETHERITE_DIAMOND_BLOCK);
    }
}
