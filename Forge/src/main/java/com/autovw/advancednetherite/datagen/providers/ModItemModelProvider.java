package com.autovw.advancednetherite.datagen.providers;

import com.autovw.advancednetherite.AdvancedNetherite;
import com.autovw.advancednetherite.api.annotation.Internal;
import com.autovw.advancednetherite.core.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

/**
 * @author Autovw
 */
public class ModItemModelProvider extends ItemModelProvider
{
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
        itemModel(ModItems.NETHERITE_IRON_HELMET);
        itemModel(ModItems.NETHERITE_IRON_CHESTPLATE);
        itemModel(ModItems.NETHERITE_IRON_LEGGINGS);
        itemModel(ModItems.NETHERITE_IRON_BOOTS);

        itemModel(ModItems.NETHERITE_GOLD_HELMET);
        itemModel(ModItems.NETHERITE_GOLD_CHESTPLATE);
        itemModel(ModItems.NETHERITE_GOLD_LEGGINGS);
        itemModel(ModItems.NETHERITE_GOLD_BOOTS);

        itemModel(ModItems.NETHERITE_EMERALD_HELMET);
        itemModel(ModItems.NETHERITE_EMERALD_CHESTPLATE);
        itemModel(ModItems.NETHERITE_EMERALD_LEGGINGS);
        itemModel(ModItems.NETHERITE_EMERALD_BOOTS);

        itemModel(ModItems.NETHERITE_DIAMOND_HELMET);
        itemModel(ModItems.NETHERITE_DIAMOND_CHESTPLATE);
        itemModel(ModItems.NETHERITE_DIAMOND_LEGGINGS);
        itemModel(ModItems.NETHERITE_DIAMOND_BOOTS);

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
}
