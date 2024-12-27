package com.autovw.advancednetherite.datagen.providers;

import com.autovw.advancednetherite.core.ModBlocks;
import com.autovw.advancednetherite.core.ModItems;
import com.autovw.advancednetherite.core.util.ModEquipmentAssets;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.CachedOutput;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.equipment.EquipmentAsset;
import net.minecraft.world.level.block.Block;

import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;

/**
 * @author Autovw
 */
public class ModModelProvider extends ModelProvider
{
    private final PackOutput.PathProvider blockStatePathProvider;
    private final PackOutput.PathProvider itemInfoPathProvider;
    private final PackOutput.PathProvider modelPathProvider;
    protected final String modId;

    public ModModelProvider(PackOutput packOutput, String modId)
    {
        super(packOutput);
        this.blockStatePathProvider = packOutput.createPathProvider(PackOutput.Target.RESOURCE_PACK, "blockstates");
        this.itemInfoPathProvider = packOutput.createPathProvider(PackOutput.Target.RESOURCE_PACK, "items");
        this.modelPathProvider = packOutput.createPathProvider(PackOutput.Target.RESOURCE_PACK, "models");
        this.modId = modId;
    }

    protected void registerModels(BlockModelGenerators blockModels, ItemModelGenerators itemModels)
    {
        /* Blocks */
        blockModel(blockModels, ModBlocks.NETHERITE_IRON_BLOCK);
        blockModel(blockModels, ModBlocks.NETHERITE_GOLD_BLOCK);
        blockModel(blockModels, ModBlocks.NETHERITE_EMERALD_BLOCK);
        blockModel(blockModels, ModBlocks.NETHERITE_DIAMOND_BLOCK);

        /* Ingots */
        itemModel(itemModels, ModItems.NETHERITE_IRON_INGOT);
        itemModel(itemModels, ModItems.NETHERITE_GOLD_INGOT);
        itemModel(itemModels, ModItems.NETHERITE_EMERALD_INGOT);
        itemModel(itemModels, ModItems.NETHERITE_DIAMOND_INGOT);

        /* Armor sets */
        armorModel(itemModels, ModItems.NETHERITE_IRON_HELMET, ModEquipmentAssets.NETHERITE_IRON);
        armorModel(itemModels, ModItems.NETHERITE_IRON_CHESTPLATE, ModEquipmentAssets.NETHERITE_IRON);
        armorModel(itemModels, ModItems.NETHERITE_IRON_LEGGINGS, ModEquipmentAssets.NETHERITE_IRON);
        armorModel(itemModels, ModItems.NETHERITE_IRON_BOOTS, ModEquipmentAssets.NETHERITE_IRON);

        armorModel(itemModels, ModItems.NETHERITE_GOLD_HELMET, ModEquipmentAssets.NETHERITE_GOLD);
        armorModel(itemModels, ModItems.NETHERITE_GOLD_CHESTPLATE, ModEquipmentAssets.NETHERITE_GOLD);
        armorModel(itemModels, ModItems.NETHERITE_GOLD_LEGGINGS, ModEquipmentAssets.NETHERITE_GOLD);
        armorModel(itemModels, ModItems.NETHERITE_GOLD_BOOTS, ModEquipmentAssets.NETHERITE_GOLD);

        armorModel(itemModels, ModItems.NETHERITE_EMERALD_HELMET, ModEquipmentAssets.NETHERITE_EMERALD);
        armorModel(itemModels, ModItems.NETHERITE_EMERALD_CHESTPLATE, ModEquipmentAssets.NETHERITE_EMERALD);
        armorModel(itemModels, ModItems.NETHERITE_EMERALD_LEGGINGS, ModEquipmentAssets.NETHERITE_EMERALD);
        armorModel(itemModels, ModItems.NETHERITE_EMERALD_BOOTS, ModEquipmentAssets.NETHERITE_EMERALD);

        armorModel(itemModels, ModItems.NETHERITE_DIAMOND_HELMET, ModEquipmentAssets.NETHERITE_DIAMOND);
        armorModel(itemModels, ModItems.NETHERITE_DIAMOND_CHESTPLATE, ModEquipmentAssets.NETHERITE_DIAMOND);
        armorModel(itemModels, ModItems.NETHERITE_DIAMOND_LEGGINGS, ModEquipmentAssets.NETHERITE_DIAMOND);
        armorModel(itemModels, ModItems.NETHERITE_DIAMOND_BOOTS, ModEquipmentAssets.NETHERITE_DIAMOND);

        /* Axes */
        toolModel(itemModels, ModItems.NETHERITE_IRON_AXE);
        toolModel(itemModels, ModItems.NETHERITE_GOLD_AXE);
        toolModel(itemModels, ModItems.NETHERITE_EMERALD_AXE);
        toolModel(itemModels, ModItems.NETHERITE_DIAMOND_AXE);

        /* Hoes */
        toolModel(itemModels, ModItems.NETHERITE_IRON_HOE);
        toolModel(itemModels, ModItems.NETHERITE_GOLD_HOE);
        toolModel(itemModels, ModItems.NETHERITE_EMERALD_HOE);
        toolModel(itemModels, ModItems.NETHERITE_DIAMOND_HOE);

        /* Pickaxes */
        toolModel(itemModels, ModItems.NETHERITE_IRON_PICKAXE);
        toolModel(itemModels, ModItems.NETHERITE_GOLD_PICKAXE);
        toolModel(itemModels, ModItems.NETHERITE_EMERALD_PICKAXE);
        toolModel(itemModels, ModItems.NETHERITE_DIAMOND_PICKAXE);

        /* Shovels */
        toolModel(itemModels, ModItems.NETHERITE_IRON_SHOVEL);
        toolModel(itemModels, ModItems.NETHERITE_GOLD_SHOVEL);
        toolModel(itemModels, ModItems.NETHERITE_EMERALD_SHOVEL);
        toolModel(itemModels, ModItems.NETHERITE_DIAMOND_SHOVEL);

        /* Swords */
        toolModel(itemModels, ModItems.NETHERITE_IRON_SWORD);
        toolModel(itemModels, ModItems.NETHERITE_GOLD_SWORD);
        toolModel(itemModels, ModItems.NETHERITE_EMERALD_SWORD);
        toolModel(itemModels, ModItems.NETHERITE_DIAMOND_SWORD);
    }

    public void blockModel(BlockModelGenerators blockModels, Block block)
    {
        blockModels.createTrivialCube(block);
    }

    public void itemModel(ItemModelGenerators itemModels, Item item)
    {
        itemModels.createFlatItemModel(item, ModelTemplates.FLAT_ITEM);
    }

    public void toolModel(ItemModelGenerators itemModels, Item item)
    {
        itemModels.createFlatItemModel(item, ModelTemplates.FLAT_HANDHELD_ITEM);
    }

    public void armorModel(ItemModelGenerators itemModels, Item item, ResourceKey<EquipmentAsset> equipmentKey)
    {
        itemModels.generateTrimmableItem(item, equipmentKey, equipmentKey.location().getPath(), false);
    }

    @Override
    public CompletableFuture<?> run(CachedOutput output)
    {
        ItemInfoCollector itemCollector = new ItemInfoCollector(this::getKnownItems);
        BlockStateGeneratorCollector blockStateCollector = new BlockStateGeneratorCollector(this::getKnownBlocks);
        SimpleModelCollector simpleModelCollector = new SimpleModelCollector();
        this.registerModels(new BlockModelGenerators(blockStateCollector, itemCollector, simpleModelCollector), new ItemModelGenerators(itemCollector, simpleModelCollector));
        blockStateCollector.validate();
        itemCollector.finalizeAndValidate();
        return CompletableFuture.allOf(
                blockStateCollector.save(output, this.blockStatePathProvider),
                simpleModelCollector.save(output, this.modelPathProvider),
                itemCollector.save(output, this.itemInfoPathProvider)
        );
    }

    @Override
    protected Stream<Block> getKnownBlocks()
    {
        return BuiltInRegistries.BLOCK.stream()
                .filter((block) -> Optional.of(BuiltInRegistries.BLOCK.getKey(block))
                        .filter((key) -> key.getNamespace().equals(this.modId))
                        .isPresent());
    }

    @Override
    protected Stream<Item> getKnownItems()
    {
        return BuiltInRegistries.ITEM.stream()
                .filter((item) -> Optional.of(BuiltInRegistries.ITEM.getKey(item))
                        .filter((key) -> key.getNamespace().equals(this.modId))
                        .isPresent());
    }
}
