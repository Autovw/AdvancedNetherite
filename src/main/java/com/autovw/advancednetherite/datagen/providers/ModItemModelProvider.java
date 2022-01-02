package com.autovw.advancednetherite.datagen.providers;

import com.autovw.advancednetherite.Reference;
import com.autovw.advancednetherite.core.ModItems;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

/**
 * Author: Autovw
 */
public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, Reference.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        /* Ingots */
        itemModel(ModItems.NETHERITE_IRON_INGOT.get());
        itemModel(ModItems.NETHERITE_GOLD_INGOT.get());
        itemModel(ModItems.NETHERITE_EMERALD_INGOT.get());
        itemModel(ModItems.NETHERITE_DIAMOND_INGOT.get());

        /* Armor sets */
        itemModel(ModItems.NETHERITE_IRON_HELMET.get());
        itemModel(ModItems.NETHERITE_IRON_CHESTPLATE.get());
        itemModel(ModItems.NETHERITE_IRON_LEGGINGS.get());
        itemModel(ModItems.NETHERITE_IRON_BOOTS.get());

        itemModel(ModItems.NETHERITE_GOLD_HELMET.get());
        itemModel(ModItems.NETHERITE_GOLD_CHESTPLATE.get());
        itemModel(ModItems.NETHERITE_GOLD_LEGGINGS.get());
        itemModel(ModItems.NETHERITE_GOLD_BOOTS.get());

        itemModel(ModItems.NETHERITE_EMERALD_HELMET.get());
        itemModel(ModItems.NETHERITE_EMERALD_CHESTPLATE.get());
        itemModel(ModItems.NETHERITE_EMERALD_LEGGINGS.get());
        itemModel(ModItems.NETHERITE_EMERALD_BOOTS.get());

        itemModel(ModItems.NETHERITE_DIAMOND_HELMET.get());
        itemModel(ModItems.NETHERITE_DIAMOND_CHESTPLATE.get());
        itemModel(ModItems.NETHERITE_DIAMOND_LEGGINGS.get());
        itemModel(ModItems.NETHERITE_DIAMOND_BOOTS.get());

        /* Axes */
        toolModel(ModItems.NETHERITE_IRON_AXE.get());
        toolModel(ModItems.NETHERITE_GOLD_AXE.get());
        toolModel(ModItems.NETHERITE_EMERALD_AXE.get());
        toolModel(ModItems.NETHERITE_DIAMOND_AXE.get());

        /* Hoes */
        toolModel(ModItems.NETHERITE_IRON_HOE.get());
        toolModel(ModItems.NETHERITE_GOLD_HOE.get());
        toolModel(ModItems.NETHERITE_EMERALD_HOE.get());
        toolModel(ModItems.NETHERITE_DIAMOND_HOE.get());

        /* Pickaxes */
        toolModel(ModItems.NETHERITE_IRON_PICKAXE.get());
        toolModel(ModItems.NETHERITE_GOLD_PICKAXE.get());
        toolModel(ModItems.NETHERITE_EMERALD_PICKAXE.get());
        toolModel(ModItems.NETHERITE_DIAMOND_PICKAXE.get());

        /* Shovels */
        toolModel(ModItems.NETHERITE_IRON_SHOVEL.get());
        toolModel(ModItems.NETHERITE_GOLD_SHOVEL.get());
        toolModel(ModItems.NETHERITE_EMERALD_SHOVEL.get());
        toolModel(ModItems.NETHERITE_DIAMOND_SHOVEL.get());

        /* Swords */
        toolModel(ModItems.NETHERITE_IRON_SWORD.get());
        toolModel(ModItems.NETHERITE_GOLD_SWORD.get());
        toolModel(ModItems.NETHERITE_EMERALD_SWORD.get());
        toolModel(ModItems.NETHERITE_DIAMOND_SWORD.get());
    }

    /**
     * Helper method for creating a simple item model
     *
     * @param item The item for which the model is made
     * @param texture The location of the item texture
     */
    public void itemModel(Item item, ResourceLocation texture) {
        singleTexture(item.toString(), mcLoc("item/generated"), "layer0", texture);
    }

    // For internal use only, use above method instead
    private void itemModel(Item item) {
        itemModel(item, new ResourceLocation(Reference.MOD_ID, "items/" + item.toString()));
    }

    /**
     * Helper method for creating a simple item model for tools
     *
     * @param item The item for which the model is made
     * @param texture The location of the item texture
     */
    public void toolModel(Item item, ResourceLocation texture) {
        singleTexture(item.toString(), mcLoc("item/handheld"), "layer0", texture);
    }

    // For internal use only, use above method instead
    private void toolModel(Item item) {
        toolModel(item, new ResourceLocation(Reference.MOD_ID, "items/" + item.toString()));
    }
}
