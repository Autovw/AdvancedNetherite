package com.autovw.advancednetherite.datagen.providers;

import com.autovw.advancednetherite.core.ModBlocks;
import com.autovw.advancednetherite.core.ModItems;
import com.autovw.advancednetherite.core.util.ModEquipmentAssets;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.client.data.models.model.ModelTemplate;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.client.data.models.model.TextureMapping;
import net.minecraft.client.data.models.model.TextureSlot;
import net.minecraft.client.renderer.item.BlockModelWrapper;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.equipment.EquipmentAsset;
import net.minecraft.world.level.block.Block;

import java.util.Collections;

/**
 * @author Autovw
 */
public class ModModelProvider extends ModelProvider
{
    public ModModelProvider(PackOutput packOutput, String modId)
    {
        super(packOutput, modId);
    }

    @Override
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
        this.itemModel(itemModels, item, ModelTemplates.FLAT_ITEM);
    }

    public void toolModel(ItemModelGenerators itemModels, Item item)
    {
        this.itemModel(itemModels, item, ModelTemplates.FLAT_HANDHELD_ITEM);
    }

    public void itemModel(ItemModelGenerators itemModels, Item item, ModelTemplate template)
    {
        ResourceLocation itemId = BuiltInRegistries.ITEM.getKey(item);
        ResourceLocation textureLoc = ResourceLocation.fromNamespaceAndPath(itemId.getNamespace(), "item/" + itemId.getPath());
        TextureMapping textureMapping = new TextureMapping().put(TextureSlot.LAYER0, textureLoc);
        itemModels.itemModelOutput.accept(item, new BlockModelWrapper.Unbaked(template.create(item, textureMapping, itemModels.modelOutput), Collections.emptyList()));
    }

    public void armorModel(ItemModelGenerators itemModels, Item item, ResourceKey<EquipmentAsset> equipmentKey)
    {
        ResourceLocation id = BuiltInRegistries.ITEM.getKey(item);
        ResourceLocation armorType = null;
        if (id.getPath().contains("helmet"))
            armorType = ItemModelGenerators.TRIM_PREFIX_HELMET;
        else if (id.getPath().contains("chestplate"))
            armorType = ItemModelGenerators.TRIM_PREFIX_CHESTPLATE;
        else if (id.getPath().contains("leggings"))
            armorType = ItemModelGenerators.TRIM_PREFIX_LEGGINGS;
        else if (id.getPath().contains("boots"))
            armorType = ItemModelGenerators.TRIM_PREFIX_BOOTS;
        itemModels.generateTrimmableItem(item, equipmentKey, armorType, false);
    }
}
