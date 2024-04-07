package com.autovw.advancednetherite.datagen.providers;

import com.autovw.advancednetherite.AdvancedNetherite;
import com.autovw.advancednetherite.api.annotation.Internal;
import com.autovw.advancednetherite.core.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.PackType;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.armortrim.TrimMaterial;
import net.minecraft.world.item.armortrim.TrimMaterials;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;

import java.util.LinkedHashMap;

/**
 * @author Autovw
 */
public class ModItemModelProvider extends ItemModelProvider
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

    public ModItemModelProvider(PackOutput packOutput, String modId, ExistingFileHelper existingFileHelper)
    {
        super(packOutput, modId, existingFileHelper);
    }

    @Override
    protected void registerModels()
    {
        /* Ingots */
        itemModel(ModItems.NETHERITE_IRON_INGOT);
        itemModel(ModItems.NETHERITE_GOLD_INGOT);
        itemModel(ModItems.NETHERITE_EMERALD_INGOT);
        itemModel(ModItems.NETHERITE_DIAMOND_INGOT);

        /* Armor sets */
        armorModel(ModItems.NETHERITE_IRON_HELMET);
        armorModel(ModItems.NETHERITE_IRON_CHESTPLATE);
        armorModel(ModItems.NETHERITE_IRON_LEGGINGS);
        armorModel(ModItems.NETHERITE_IRON_BOOTS);

        armorModel(ModItems.NETHERITE_GOLD_HELMET);
        armorModel(ModItems.NETHERITE_GOLD_CHESTPLATE);
        armorModel(ModItems.NETHERITE_GOLD_LEGGINGS);
        armorModel(ModItems.NETHERITE_GOLD_BOOTS);

        armorModel(ModItems.NETHERITE_EMERALD_HELMET);
        armorModel(ModItems.NETHERITE_EMERALD_CHESTPLATE);
        armorModel(ModItems.NETHERITE_EMERALD_LEGGINGS);
        armorModel(ModItems.NETHERITE_EMERALD_BOOTS);

        armorModel(ModItems.NETHERITE_DIAMOND_HELMET);
        armorModel(ModItems.NETHERITE_DIAMOND_CHESTPLATE);
        armorModel(ModItems.NETHERITE_DIAMOND_LEGGINGS);
        armorModel(ModItems.NETHERITE_DIAMOND_BOOTS);

        /* Axes */
        toolModel(ModItems.NETHERITE_IRON_AXE);
        toolModel(ModItems.NETHERITE_GOLD_AXE);
        toolModel(ModItems.NETHERITE_EMERALD_AXE);
        toolModel(ModItems.NETHERITE_DIAMOND_AXE);

        /* Hoes */
        toolModel(ModItems.NETHERITE_IRON_HOE);
        toolModel(ModItems.NETHERITE_GOLD_HOE);
        toolModel(ModItems.NETHERITE_EMERALD_HOE);
        toolModel(ModItems.NETHERITE_DIAMOND_HOE);

        /* Pickaxes */
        toolModel(ModItems.NETHERITE_IRON_PICKAXE);
        toolModel(ModItems.NETHERITE_GOLD_PICKAXE);
        toolModel(ModItems.NETHERITE_EMERALD_PICKAXE);
        toolModel(ModItems.NETHERITE_DIAMOND_PICKAXE);

        /* Shovels */
        toolModel(ModItems.NETHERITE_IRON_SHOVEL);
        toolModel(ModItems.NETHERITE_GOLD_SHOVEL);
        toolModel(ModItems.NETHERITE_EMERALD_SHOVEL);
        toolModel(ModItems.NETHERITE_DIAMOND_SHOVEL);

        /* Swords */
        toolModel(ModItems.NETHERITE_IRON_SWORD);
        toolModel(ModItems.NETHERITE_GOLD_SWORD);
        toolModel(ModItems.NETHERITE_EMERALD_SWORD);
        toolModel(ModItems.NETHERITE_DIAMOND_SWORD);
    }

    /**
     * Helper method for creating a simple item model
     *
     * @param item The item for which the model is made
     * @param texture The location of the item texture
     */
    public void itemModel(Item item, ResourceLocation texture)
    {
        singleTexture(item.toString(), mcLoc("item/generated"), "layer0", texture);
    }

    @Internal
    private void itemModel(Item item)
    {
        itemModel(item, new ResourceLocation(AdvancedNetherite.MOD_ID, "item/" + item.toString()));
    }

    /**
     * Helper method for creating a simple item model for tools
     *
     * @param item The item for which the model is made
     * @param texture The location of the item texture
     */
    public void toolModel(Item item, ResourceLocation texture)
    {
        singleTexture(item.toString(), mcLoc("item/handheld"), "layer0", texture);
    }

    @Internal
    private void toolModel(Item item)
    {
        toolModel(item, new ResourceLocation(AdvancedNetherite.MOD_ID, "item/" + item.toString()));
    }

    public void armorModel(Item item)
    {
        if (!(item instanceof ArmorItem armorItem))
            return;

        TRIM_MATERIALS.forEach((trimMaterial, trimValue) ->
        {
            ResourceLocation id = AdvancedNetherite.getRegistryHelper().getItemById(armorItem);
            String armorType = switch (armorItem.getEquipmentSlot())
            {
                case HEAD -> "helmet";
                case CHEST -> "chestplate";
                case LEGS -> "leggings";
                case FEET -> "boots";
                default -> "";
            };

            ResourceLocation armorTexture = new ResourceLocation(id.getNamespace(), "item/" + id.getPath());
            ResourceLocation trimTexture = mcLoc("trims/items/" + armorType + "_trim_" + trimMaterial.location().getPath());
            ResourceLocation currentTrimTexture = new ResourceLocation(id.getNamespace(), "item/" + id.getPath() + "_" + trimMaterial.location().getPath() + "_trim");

            // Make sure the ExistingFileHelper does not throw an IllegalArgumentException
            this.existingFileHelper.trackGenerated(trimTexture, PackType.CLIENT_RESOURCES, ".png", "textures");

            this.trimmedArmorModel(currentTrimTexture, armorTexture, trimTexture);

            this.nonTrimmedArmorModel(id, currentTrimTexture, trimValue);
        });
    }

    private void trimmedArmorModel(ResourceLocation currentTrimTexture, ResourceLocation armorTexture, ResourceLocation trimTexture)
    {
        this.getBuilder(currentTrimTexture.getPath())
                .parent(new ModelFile.UncheckedModelFile("item/generated"))
                .texture("layer0", armorTexture)
                .texture("layer1", trimTexture);
    }

    private void nonTrimmedArmorModel(ResourceLocation id, ResourceLocation currentTrimTexture, float trimValue)
    {
        this.withExistingParent(id.getPath(), mcLoc("item/generated"))
                .override()
                .model(new ModelFile.UncheckedModelFile(currentTrimTexture))
                .predicate(mcLoc("trim_type"), trimValue).end()
                .texture("layer0", new ResourceLocation(id.getNamespace(), "item/" + id.getPath()));
    }
}
