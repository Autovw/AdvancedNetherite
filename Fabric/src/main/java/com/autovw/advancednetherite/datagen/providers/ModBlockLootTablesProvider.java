package com.autovw.advancednetherite.datagen.providers;

import com.autovw.advancednetherite.core.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.storage.loot.LootTable;

import java.util.function.BiConsumer;

/**
 * @author Autovw
 */
public class ModBlockLootTablesProvider extends FabricBlockLootTableProvider
{
    public ModBlockLootTablesProvider(FabricDataOutput dataOutput)
    {
        super(dataOutput);
    }

    @Override
    public void generate()
    {
        this.dropSelf(ModBlocks.NETHERITE_IRON_BLOCK);
        this.dropSelf(ModBlocks.NETHERITE_GOLD_BLOCK);
        this.dropSelf(ModBlocks.NETHERITE_EMERALD_BLOCK);
        this.dropSelf(ModBlocks.NETHERITE_DIAMOND_BLOCK);
    }

    @Override
    public void accept(BiConsumer<ResourceLocation, LootTable.Builder> resourceLocationBuilderBiConsumer)
    {
    }
}
