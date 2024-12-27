package com.autovw.advancednetherite.datagen.providers;

import com.autovw.advancednetherite.core.ModBlocks;
import com.autovw.advancednetherite.core.ModItems;
import com.autovw.advancednetherite.core.util.ModEquipmentAssets;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.equipment.EquipmentAsset;

/**
 * @author Autovw
 */
public class ModModelProvider extends FabricModelProvider
{
    public ModModelProvider(FabricDataOutput dataOutput)
    {
        super(dataOutput);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators generator)
    {
        generator.createTrivialCube(ModBlocks.NETHERITE_IRON_BLOCK);
        generator.createTrivialCube(ModBlocks.NETHERITE_GOLD_BLOCK);
        generator.createTrivialCube(ModBlocks.NETHERITE_EMERALD_BLOCK);
        generator.createTrivialCube(ModBlocks.NETHERITE_DIAMOND_BLOCK);
    }

    @Override
    public void generateItemModels(ItemModelGenerators generator)
    {
        itemModel(generator, ModItems.NETHERITE_IRON_INGOT);
        itemModel(generator, ModItems.NETHERITE_GOLD_INGOT);
        itemModel(generator, ModItems.NETHERITE_EMERALD_INGOT);
        itemModel(generator, ModItems.NETHERITE_DIAMOND_INGOT);

        armorModel(generator, ModItems.NETHERITE_IRON_HELMET, ModEquipmentAssets.NETHERITE_IRON);
        armorModel(generator, ModItems.NETHERITE_IRON_CHESTPLATE, ModEquipmentAssets.NETHERITE_IRON);
        armorModel(generator, ModItems.NETHERITE_IRON_LEGGINGS, ModEquipmentAssets.NETHERITE_IRON);
        armorModel(generator, ModItems.NETHERITE_IRON_BOOTS, ModEquipmentAssets.NETHERITE_IRON);

        armorModel(generator, ModItems.NETHERITE_GOLD_HELMET, ModEquipmentAssets.NETHERITE_GOLD);
        armorModel(generator, ModItems.NETHERITE_GOLD_CHESTPLATE, ModEquipmentAssets.NETHERITE_GOLD);
        armorModel(generator, ModItems.NETHERITE_GOLD_LEGGINGS, ModEquipmentAssets.NETHERITE_GOLD);
        armorModel(generator, ModItems.NETHERITE_GOLD_BOOTS, ModEquipmentAssets.NETHERITE_GOLD);

        armorModel(generator, ModItems.NETHERITE_EMERALD_HELMET, ModEquipmentAssets.NETHERITE_EMERALD);
        armorModel(generator, ModItems.NETHERITE_EMERALD_CHESTPLATE, ModEquipmentAssets.NETHERITE_EMERALD);
        armorModel(generator, ModItems.NETHERITE_EMERALD_LEGGINGS, ModEquipmentAssets.NETHERITE_EMERALD);
        armorModel(generator, ModItems.NETHERITE_EMERALD_BOOTS, ModEquipmentAssets.NETHERITE_EMERALD);

        armorModel(generator, ModItems.NETHERITE_DIAMOND_HELMET, ModEquipmentAssets.NETHERITE_DIAMOND);
        armorModel(generator, ModItems.NETHERITE_DIAMOND_CHESTPLATE, ModEquipmentAssets.NETHERITE_DIAMOND);
        armorModel(generator, ModItems.NETHERITE_DIAMOND_LEGGINGS, ModEquipmentAssets.NETHERITE_DIAMOND);
        armorModel(generator, ModItems.NETHERITE_DIAMOND_BOOTS, ModEquipmentAssets.NETHERITE_DIAMOND);

        toolModel(generator, ModItems.NETHERITE_IRON_AXE);
        toolModel(generator, ModItems.NETHERITE_GOLD_AXE);
        toolModel(generator, ModItems.NETHERITE_EMERALD_AXE);
        toolModel(generator, ModItems.NETHERITE_DIAMOND_AXE);

        toolModel(generator, ModItems.NETHERITE_IRON_HOE);
        toolModel(generator, ModItems.NETHERITE_GOLD_HOE);
        toolModel(generator, ModItems.NETHERITE_EMERALD_HOE);
        toolModel(generator, ModItems.NETHERITE_DIAMOND_HOE);

        toolModel(generator, ModItems.NETHERITE_IRON_PICKAXE);
        toolModel(generator, ModItems.NETHERITE_GOLD_PICKAXE);
        toolModel(generator, ModItems.NETHERITE_EMERALD_PICKAXE);
        toolModel(generator, ModItems.NETHERITE_DIAMOND_PICKAXE);

        toolModel(generator, ModItems.NETHERITE_IRON_SHOVEL);
        toolModel(generator, ModItems.NETHERITE_GOLD_SHOVEL);
        toolModel(generator, ModItems.NETHERITE_EMERALD_SHOVEL);
        toolModel(generator, ModItems.NETHERITE_DIAMOND_SHOVEL);

        toolModel(generator, ModItems.NETHERITE_IRON_SWORD);
        toolModel(generator, ModItems.NETHERITE_GOLD_SWORD);
        toolModel(generator, ModItems.NETHERITE_EMERALD_SWORD);
        toolModel(generator, ModItems.NETHERITE_DIAMOND_SWORD);
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
}
