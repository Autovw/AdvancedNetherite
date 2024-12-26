package com.autovw.advancednetherite.datagen.providers;

import com.autovw.advancednetherite.core.ModBlocks;
import com.autovw.advancednetherite.core.ModItems;
import com.autovw.advancednetherite.core.util.ModEquipmentAssets;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.ModelTemplates;

/**
 * @author Autovw
 */
public class ModBlockStatesProvider extends FabricModelProvider
{
    public ModBlockStatesProvider(FabricDataOutput dataOutput)
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

        //generator.delegateItemModel(ModBlocks.NETHERITE_IRON_BLOCK, ResourceLocation.fromNamespaceAndPath(AdvancedNetherite.MOD_ID, "block/netherite_iron_block"));
        //generator.delegateItemModel(ModBlocks.NETHERITE_GOLD_BLOCK, ResourceLocation.fromNamespaceAndPath(AdvancedNetherite.MOD_ID, "block/netherite_gold_block"));
        //generator.delegateItemModel(ModBlocks.NETHERITE_EMERALD_BLOCK, ResourceLocation.fromNamespaceAndPath(AdvancedNetherite.MOD_ID, "block/netherite_emerald_block"));
        //generator.delegateItemModel(ModBlocks.NETHERITE_DIAMOND_BLOCK, ResourceLocation.fromNamespaceAndPath(AdvancedNetherite.MOD_ID, "block/netherite_diamond_block"));
    }

    @Override
    public void generateItemModels(ItemModelGenerators generator)
    {
        generator.generateFlatItem(ModItems.NETHERITE_IRON_INGOT, ModelTemplates.FLAT_ITEM);
        generator.generateFlatItem(ModItems.NETHERITE_GOLD_INGOT, ModelTemplates.FLAT_ITEM);
        generator.generateFlatItem(ModItems.NETHERITE_EMERALD_INGOT, ModelTemplates.FLAT_ITEM);
        generator.generateFlatItem(ModItems.NETHERITE_DIAMOND_INGOT, ModelTemplates.FLAT_ITEM);

        generator.generateTrimmableItem(ModItems.NETHERITE_IRON_HELMET, ModEquipmentAssets.NETHERITE_IRON, "netherite_iron", false);
        generator.generateTrimmableItem(ModItems.NETHERITE_IRON_CHESTPLATE, ModEquipmentAssets.NETHERITE_IRON, "netherite_iron", false);
        generator.generateTrimmableItem(ModItems.NETHERITE_IRON_LEGGINGS, ModEquipmentAssets.NETHERITE_IRON, "netherite_iron", false);
        generator.generateTrimmableItem(ModItems.NETHERITE_IRON_BOOTS, ModEquipmentAssets.NETHERITE_IRON, "netherite_iron", false);

        generator.generateTrimmableItem(ModItems.NETHERITE_GOLD_HELMET, ModEquipmentAssets.NETHERITE_GOLD, "netherite_gold", false);
        generator.generateTrimmableItem(ModItems.NETHERITE_GOLD_CHESTPLATE, ModEquipmentAssets.NETHERITE_GOLD, "netherite_gold", false);
        generator.generateTrimmableItem(ModItems.NETHERITE_GOLD_LEGGINGS, ModEquipmentAssets.NETHERITE_GOLD, "netherite_gold", false);
        generator.generateTrimmableItem(ModItems.NETHERITE_GOLD_BOOTS, ModEquipmentAssets.NETHERITE_GOLD, "netherite_gold", false);

        generator.generateTrimmableItem(ModItems.NETHERITE_EMERALD_HELMET, ModEquipmentAssets.NETHERITE_EMERALD, "netherite_emerald", false);
        generator.generateTrimmableItem(ModItems.NETHERITE_EMERALD_CHESTPLATE, ModEquipmentAssets.NETHERITE_EMERALD, "netherite_emerald", false);
        generator.generateTrimmableItem(ModItems.NETHERITE_EMERALD_LEGGINGS, ModEquipmentAssets.NETHERITE_EMERALD, "netherite_emerald", false);
        generator.generateTrimmableItem(ModItems.NETHERITE_EMERALD_BOOTS, ModEquipmentAssets.NETHERITE_EMERALD, "netherite_emerald", false);

        generator.generateTrimmableItem(ModItems.NETHERITE_DIAMOND_HELMET, ModEquipmentAssets.NETHERITE_DIAMOND, "netherite_diamond", false);
        generator.generateTrimmableItem(ModItems.NETHERITE_DIAMOND_CHESTPLATE, ModEquipmentAssets.NETHERITE_DIAMOND, "netherite_diamond", false);
        generator.generateTrimmableItem(ModItems.NETHERITE_DIAMOND_LEGGINGS, ModEquipmentAssets.NETHERITE_DIAMOND, "netherite_diamond", false);
        generator.generateTrimmableItem(ModItems.NETHERITE_DIAMOND_BOOTS, ModEquipmentAssets.NETHERITE_DIAMOND, "netherite_diamond", false);

        generator.generateFlatItem(ModItems.NETHERITE_IRON_AXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        generator.generateFlatItem(ModItems.NETHERITE_IRON_HOE, ModelTemplates.FLAT_HANDHELD_ITEM);
        generator.generateFlatItem(ModItems.NETHERITE_IRON_PICKAXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        generator.generateFlatItem(ModItems.NETHERITE_IRON_SHOVEL, ModelTemplates.FLAT_HANDHELD_ITEM);
        generator.generateFlatItem(ModItems.NETHERITE_IRON_SWORD, ModelTemplates.FLAT_HANDHELD_ITEM);

        generator.generateFlatItem(ModItems.NETHERITE_GOLD_AXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        generator.generateFlatItem(ModItems.NETHERITE_GOLD_HOE, ModelTemplates.FLAT_HANDHELD_ITEM);
        generator.generateFlatItem(ModItems.NETHERITE_GOLD_PICKAXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        generator.generateFlatItem(ModItems.NETHERITE_GOLD_SHOVEL, ModelTemplates.FLAT_HANDHELD_ITEM);
        generator.generateFlatItem(ModItems.NETHERITE_GOLD_SWORD, ModelTemplates.FLAT_HANDHELD_ITEM);

        generator.generateFlatItem(ModItems.NETHERITE_EMERALD_AXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        generator.generateFlatItem(ModItems.NETHERITE_EMERALD_HOE, ModelTemplates.FLAT_HANDHELD_ITEM);
        generator.generateFlatItem(ModItems.NETHERITE_EMERALD_PICKAXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        generator.generateFlatItem(ModItems.NETHERITE_EMERALD_SHOVEL, ModelTemplates.FLAT_HANDHELD_ITEM);
        generator.generateFlatItem(ModItems.NETHERITE_EMERALD_SWORD, ModelTemplates.FLAT_HANDHELD_ITEM);

        generator.generateFlatItem(ModItems.NETHERITE_DIAMOND_AXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        generator.generateFlatItem(ModItems.NETHERITE_DIAMOND_HOE, ModelTemplates.FLAT_HANDHELD_ITEM);
        generator.generateFlatItem(ModItems.NETHERITE_DIAMOND_PICKAXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        generator.generateFlatItem(ModItems.NETHERITE_DIAMOND_SHOVEL, ModelTemplates.FLAT_HANDHELD_ITEM);
        generator.generateFlatItem(ModItems.NETHERITE_DIAMOND_SWORD, ModelTemplates.FLAT_HANDHELD_ITEM);
    }
}
