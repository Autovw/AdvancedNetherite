package com.autovw.advancednetherite.datagen.providers;

import com.autovw.advancednetherite.AdvancedNetherite;
import com.autovw.advancednetherite.core.ModBlocks;
import com.autovw.advancednetherite.core.ModItems;
import com.autovw.advancednetherite.core.util.ModEquipmentModels;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.models.BlockModelGenerators;
import net.minecraft.data.models.ItemModelGenerators;
import net.minecraft.data.models.model.ModelTemplates;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EquipmentSlot;

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

        generator.delegateItemModel(ModBlocks.NETHERITE_IRON_BLOCK, ResourceLocation.fromNamespaceAndPath(AdvancedNetherite.MOD_ID, "block/netherite_iron_block"));
        generator.delegateItemModel(ModBlocks.NETHERITE_GOLD_BLOCK, ResourceLocation.fromNamespaceAndPath(AdvancedNetherite.MOD_ID, "block/netherite_gold_block"));
        generator.delegateItemModel(ModBlocks.NETHERITE_EMERALD_BLOCK, ResourceLocation.fromNamespaceAndPath(AdvancedNetherite.MOD_ID, "block/netherite_emerald_block"));
        generator.delegateItemModel(ModBlocks.NETHERITE_DIAMOND_BLOCK, ResourceLocation.fromNamespaceAndPath(AdvancedNetherite.MOD_ID, "block/netherite_diamond_block"));
    }

    @Override
    public void generateItemModels(ItemModelGenerators generator)
    {
        generator.generateFlatItem(ModItems.NETHERITE_IRON_INGOT, ModelTemplates.FLAT_ITEM);
        generator.generateFlatItem(ModItems.NETHERITE_GOLD_INGOT, ModelTemplates.FLAT_ITEM);
        generator.generateFlatItem(ModItems.NETHERITE_EMERALD_INGOT, ModelTemplates.FLAT_ITEM);
        generator.generateFlatItem(ModItems.NETHERITE_DIAMOND_INGOT, ModelTemplates.FLAT_ITEM);

        generator.generateArmorTrims(ModItems.NETHERITE_IRON_HELMET, ResourceLocation.fromNamespaceAndPath(AdvancedNetherite.MOD_ID, "netherite_iron"), ModEquipmentModels.NETHERITE_IRON, EquipmentSlot.HEAD);
        generator.generateArmorTrims(ModItems.NETHERITE_IRON_CHESTPLATE, ResourceLocation.fromNamespaceAndPath(AdvancedNetherite.MOD_ID, "netherite_iron"), ModEquipmentModels.NETHERITE_IRON, EquipmentSlot.CHEST);
        generator.generateArmorTrims(ModItems.NETHERITE_IRON_LEGGINGS, ResourceLocation.fromNamespaceAndPath(AdvancedNetherite.MOD_ID, "netherite_iron"), ModEquipmentModels.NETHERITE_IRON, EquipmentSlot.LEGS);
        generator.generateArmorTrims(ModItems.NETHERITE_IRON_BOOTS, ResourceLocation.fromNamespaceAndPath(AdvancedNetherite.MOD_ID, "netherite_iron"), ModEquipmentModels.NETHERITE_IRON, EquipmentSlot.FEET);

        generator.generateArmorTrims(ModItems.NETHERITE_GOLD_HELMET, ResourceLocation.fromNamespaceAndPath(AdvancedNetherite.MOD_ID, "netherite_gold"), ModEquipmentModels.NETHERITE_GOLD, EquipmentSlot.HEAD);
        generator.generateArmorTrims(ModItems.NETHERITE_GOLD_CHESTPLATE, ResourceLocation.fromNamespaceAndPath(AdvancedNetherite.MOD_ID, "netherite_gold"), ModEquipmentModels.NETHERITE_GOLD, EquipmentSlot.CHEST);
        generator.generateArmorTrims(ModItems.NETHERITE_GOLD_LEGGINGS, ResourceLocation.fromNamespaceAndPath(AdvancedNetherite.MOD_ID, "netherite_gold"), ModEquipmentModels.NETHERITE_GOLD, EquipmentSlot.LEGS);
        generator.generateArmorTrims(ModItems.NETHERITE_GOLD_BOOTS, ResourceLocation.fromNamespaceAndPath(AdvancedNetherite.MOD_ID, "netherite_gold"), ModEquipmentModels.NETHERITE_GOLD, EquipmentSlot.FEET);

        generator.generateArmorTrims(ModItems.NETHERITE_EMERALD_HELMET, ResourceLocation.fromNamespaceAndPath(AdvancedNetherite.MOD_ID, "netherite_emerald"), ModEquipmentModels.NETHERITE_EMERALD, EquipmentSlot.HEAD);
        generator.generateArmorTrims(ModItems.NETHERITE_EMERALD_CHESTPLATE, ResourceLocation.fromNamespaceAndPath(AdvancedNetherite.MOD_ID, "netherite_emerald"), ModEquipmentModels.NETHERITE_EMERALD, EquipmentSlot.CHEST);
        generator.generateArmorTrims(ModItems.NETHERITE_EMERALD_LEGGINGS, ResourceLocation.fromNamespaceAndPath(AdvancedNetherite.MOD_ID, "netherite_emerald"), ModEquipmentModels.NETHERITE_EMERALD, EquipmentSlot.LEGS);
        generator.generateArmorTrims(ModItems.NETHERITE_EMERALD_BOOTS, ResourceLocation.fromNamespaceAndPath(AdvancedNetherite.MOD_ID, "netherite_emerald"), ModEquipmentModels.NETHERITE_EMERALD, EquipmentSlot.FEET);

        generator.generateArmorTrims(ModItems.NETHERITE_DIAMOND_HELMET, ResourceLocation.fromNamespaceAndPath(AdvancedNetherite.MOD_ID, "netherite_diamond"), ModEquipmentModels.NETHERITE_DIAMOND, EquipmentSlot.HEAD);
        generator.generateArmorTrims(ModItems.NETHERITE_DIAMOND_CHESTPLATE, ResourceLocation.fromNamespaceAndPath(AdvancedNetherite.MOD_ID, "netherite_diamond"), ModEquipmentModels.NETHERITE_DIAMOND, EquipmentSlot.CHEST);
        generator.generateArmorTrims(ModItems.NETHERITE_DIAMOND_LEGGINGS, ResourceLocation.fromNamespaceAndPath(AdvancedNetherite.MOD_ID, "netherite_diamond"), ModEquipmentModels.NETHERITE_DIAMOND, EquipmentSlot.LEGS);
        generator.generateArmorTrims(ModItems.NETHERITE_DIAMOND_BOOTS, ResourceLocation.fromNamespaceAndPath(AdvancedNetherite.MOD_ID, "netherite_diamond"), ModEquipmentModels.NETHERITE_DIAMOND, EquipmentSlot.FEET);

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
