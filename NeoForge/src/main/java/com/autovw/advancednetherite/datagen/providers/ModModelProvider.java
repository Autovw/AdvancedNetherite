package com.autovw.advancednetherite.datagen.providers;

import com.autovw.advancednetherite.core.ModBlocks;
import com.autovw.advancednetherite.core.ModItems;
import com.autovw.advancednetherite.core.util.ModEquipmentAssets;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.equipment.EquipmentAsset;
import net.minecraft.world.item.equipment.trim.TrimMaterial;
import net.minecraft.world.item.equipment.trim.TrimMaterials;
import net.minecraft.world.level.block.Block;

import java.util.LinkedHashMap;

/**
 * @author Autovw
 */
public class ModModelProvider extends ModelProvider
{
    private static final LinkedHashMap<ResourceKey<TrimMaterial>, Float> TRIM_MATERIALS = new LinkedHashMap<>();
    static
    {
        TRIM_MATERIALS.put(TrimMaterials.QUARTZ, 0.1F);
        TRIM_MATERIALS.put(TrimMaterials.IRON, 0.2F);
        TRIM_MATERIALS.put(TrimMaterials.NETHERITE, 0.3F);
        TRIM_MATERIALS.put(TrimMaterials.REDSTONE, 0.4F);
        TRIM_MATERIALS.put(TrimMaterials.COPPER, 0.5F);
        TRIM_MATERIALS.put(TrimMaterials.GOLD, 0.6F);
        TRIM_MATERIALS.put(TrimMaterials.EMERALD, 0.7F);
        TRIM_MATERIALS.put(TrimMaterials.DIAMOND, 0.8F);
        TRIM_MATERIALS.put(TrimMaterials.LAPIS, 0.9F);
        TRIM_MATERIALS.put(TrimMaterials.AMETHYST, 1.0F);
    }

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
        itemModels.createFlatItemModel(item, ModelTemplates.FLAT_ITEM);
    }

    public void toolModel(ItemModelGenerators itemModels, Item item)
    {
        itemModels.createFlatItemModel(item, ModelTemplates.FLAT_HANDHELD_ITEM);
    }

    public void armorModel(ItemModelGenerators itemModels, Item item, ResourceKey<EquipmentAsset> equipmentKey)
    {
        if (!(item instanceof ArmorItem armorItem))
            return;

        itemModels.generateTrimmableItem(item, equipmentKey, equipmentKey.location().getPath(), false);

        /*
        TRIM_MATERIALS.forEach((trimMaterial, trimValue) ->
        {
            ResourceLocation id = AdvancedNetherite.getRegistryHelper().getItemById(armorItem);
            String armorType = "";
            if (id.getPath().contains("helmet"))
                armorType = "helmet";
            else if (id.getPath().contains("chestplate"))
                armorType = "chestplate";
            else if (id.getPath().contains("leggings"))
                armorType = "leggings";
            else if (id.getPath().contains("boots"))
                armorType = "boots";

            ResourceLocation armorTexture = ResourceLocation.fromNamespaceAndPath(id.getNamespace(), "item/" + id.getPath());
            ResourceLocation trimTexture = ResourceLocation.withDefaultNamespace("trims/items/" + armorType + "_trim_" + trimMaterial.location().getPath());
            ResourceLocation currentTrimTexture = ResourceLocation.fromNamespaceAndPath(id.getNamespace(), "item/" + id.getPath() + "_" + trimMaterial.location().getPath() + "_trim");

            // Make sure the ExistingFileHelper does not throw an IllegalArgumentException
            //this.existingFileHelper.trackGenerated(trimTexture, PackType.CLIENT_RESOURCES, ".png", "textures");

            this.trimmedArmorModel(itemModels, currentTrimTexture, armorTexture, trimTexture);

            this.nonTrimmedArmorModel(itemModels, id, currentTrimTexture, trimValue);
        });
         */
    }

    /*
    private void trimmedArmorModel(ItemModelGenerators itemModels, ResourceLocation currentTrimTexture, ResourceLocation armorTexture, ResourceLocation trimTexture)
    {
        this.getBuilder(currentTrimTexture.getPath())
                .parent(new ModelFile.UncheckedModelFile("item/generated"))
                .texture("layer0", armorTexture)
                .texture("layer1", trimTexture);
    }

    private void nonTrimmedArmorModel(ItemModelGenerators itemModels, ResourceLocation id, ResourceLocation currentTrimTexture, float trimValue)
    {
        this.withExistingParent(id.getPath(), mcLoc("item/generated"))
                .override()
                .model(new ModelFile.UncheckedModelFile(currentTrimTexture))
                .predicate(mcLoc("trim_type"), trimValue).end()
                .texture("layer0", ResourceLocation.fromNamespaceAndPath(id.getNamespace(), "item/" + id.getPath()));
    }
     */
}
