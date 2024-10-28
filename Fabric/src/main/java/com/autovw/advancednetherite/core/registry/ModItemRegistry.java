package com.autovw.advancednetherite.core.registry;

import com.autovw.advancednetherite.AdvancedNetherite;
import com.autovw.advancednetherite.api.annotation.Internal;
import com.autovw.advancednetherite.core.ModItems;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;

/**
 * @author Autovw
 */
@Internal
public final class ModItemRegistry
{
    public static void registerItems()
    {
        Registry.register(BuiltInRegistries.ITEM, id("netherite_iron_ingot"), ModItems.NETHERITE_IRON_INGOT);
        Registry.register(BuiltInRegistries.ITEM, id("netherite_gold_ingot"), ModItems.NETHERITE_GOLD_INGOT);
        Registry.register(BuiltInRegistries.ITEM, id("netherite_emerald_ingot"), ModItems.NETHERITE_EMERALD_INGOT);
        Registry.register(BuiltInRegistries.ITEM, id("netherite_diamond_ingot"), ModItems.NETHERITE_DIAMOND_INGOT);

        Registry.register(BuiltInRegistries.ITEM, id("netherite_iron_helmet"), ModItems.NETHERITE_IRON_HELMET);
        Registry.register(BuiltInRegistries.ITEM, id("netherite_iron_chestplate"), ModItems.NETHERITE_IRON_CHESTPLATE);
        Registry.register(BuiltInRegistries.ITEM, id("netherite_iron_leggings"), ModItems.NETHERITE_IRON_LEGGINGS);
        Registry.register(BuiltInRegistries.ITEM, id("netherite_iron_boots"), ModItems.NETHERITE_IRON_BOOTS);
        Registry.register(BuiltInRegistries.ITEM, id("netherite_gold_helmet"), ModItems.NETHERITE_GOLD_HELMET);
        Registry.register(BuiltInRegistries.ITEM, id("netherite_gold_chestplate"), ModItems.NETHERITE_GOLD_CHESTPLATE);
        Registry.register(BuiltInRegistries.ITEM, id("netherite_gold_leggings"), ModItems.NETHERITE_GOLD_LEGGINGS);
        Registry.register(BuiltInRegistries.ITEM, id("netherite_gold_boots"), ModItems.NETHERITE_GOLD_BOOTS);
        Registry.register(BuiltInRegistries.ITEM, id("netherite_emerald_helmet"), ModItems.NETHERITE_EMERALD_HELMET);
        Registry.register(BuiltInRegistries.ITEM, id("netherite_emerald_chestplate"), ModItems.NETHERITE_EMERALD_CHESTPLATE);
        Registry.register(BuiltInRegistries.ITEM, id("netherite_emerald_leggings"), ModItems.NETHERITE_EMERALD_LEGGINGS);
        Registry.register(BuiltInRegistries.ITEM, id("netherite_emerald_boots"), ModItems.NETHERITE_EMERALD_BOOTS);
        Registry.register(BuiltInRegistries.ITEM, id("netherite_diamond_helmet"), ModItems.NETHERITE_DIAMOND_HELMET);
        Registry.register(BuiltInRegistries.ITEM, id("netherite_diamond_chestplate"), ModItems.NETHERITE_DIAMOND_CHESTPLATE);
        Registry.register(BuiltInRegistries.ITEM, id("netherite_diamond_leggings"), ModItems.NETHERITE_DIAMOND_LEGGINGS);
        Registry.register(BuiltInRegistries.ITEM, id("netherite_diamond_boots"), ModItems.NETHERITE_DIAMOND_BOOTS);

        Registry.register(BuiltInRegistries.ITEM, id("netherite_iron_axe"), ModItems.NETHERITE_IRON_AXE);
        Registry.register(BuiltInRegistries.ITEM, id("netherite_gold_axe"), ModItems.NETHERITE_GOLD_AXE);
        Registry.register(BuiltInRegistries.ITEM, id("netherite_emerald_axe"), ModItems.NETHERITE_EMERALD_AXE);
        Registry.register(BuiltInRegistries.ITEM, id("netherite_diamond_axe"), ModItems.NETHERITE_DIAMOND_AXE);

        Registry.register(BuiltInRegistries.ITEM, id("netherite_iron_hoe"), ModItems.NETHERITE_IRON_HOE);
        Registry.register(BuiltInRegistries.ITEM, id("netherite_gold_hoe"), ModItems.NETHERITE_GOLD_HOE);
        Registry.register(BuiltInRegistries.ITEM, id("netherite_emerald_hoe"), ModItems.NETHERITE_EMERALD_HOE);
        Registry.register(BuiltInRegistries.ITEM, id("netherite_diamond_hoe"), ModItems.NETHERITE_DIAMOND_HOE);

        Registry.register(BuiltInRegistries.ITEM, id("netherite_iron_pickaxe"), ModItems.NETHERITE_IRON_PICKAXE);
        Registry.register(BuiltInRegistries.ITEM, id("netherite_gold_pickaxe"), ModItems.NETHERITE_GOLD_PICKAXE);
        Registry.register(BuiltInRegistries.ITEM, id("netherite_emerald_pickaxe"), ModItems.NETHERITE_EMERALD_PICKAXE);
        Registry.register(BuiltInRegistries.ITEM, id("netherite_diamond_pickaxe"), ModItems.NETHERITE_DIAMOND_PICKAXE);

        Registry.register(BuiltInRegistries.ITEM, id("netherite_iron_shovel"), ModItems.NETHERITE_IRON_SHOVEL);
        Registry.register(BuiltInRegistries.ITEM, id("netherite_gold_shovel"), ModItems.NETHERITE_GOLD_SHOVEL);
        Registry.register(BuiltInRegistries.ITEM, id("netherite_emerald_shovel"), ModItems.NETHERITE_EMERALD_SHOVEL);
        Registry.register(BuiltInRegistries.ITEM, id("netherite_diamond_shovel"), ModItems.NETHERITE_DIAMOND_SHOVEL);

        Registry.register(BuiltInRegistries.ITEM, id("netherite_iron_sword"), ModItems.NETHERITE_IRON_SWORD);
        Registry.register(BuiltInRegistries.ITEM, id("netherite_gold_sword"), ModItems.NETHERITE_GOLD_SWORD);
        Registry.register(BuiltInRegistries.ITEM, id("netherite_emerald_sword"), ModItems.NETHERITE_EMERALD_SWORD);
        Registry.register(BuiltInRegistries.ITEM, id("netherite_diamond_sword"), ModItems.NETHERITE_DIAMOND_SWORD);

        Registry.register(BuiltInRegistries.ITEM, id("netherite_iron_block"), ModItems.NETHERITE_IRON_BLOCK);
        Registry.register(BuiltInRegistries.ITEM, id("netherite_gold_block"), ModItems.NETHERITE_GOLD_BLOCK);
        Registry.register(BuiltInRegistries.ITEM, id("netherite_emerald_block"), ModItems.NETHERITE_EMERALD_BLOCK);
        Registry.register(BuiltInRegistries.ITEM, id("netherite_diamond_block"), ModItems.NETHERITE_DIAMOND_BLOCK);
    }
    
    private static ResourceLocation id(String name)
    {
        return ResourceLocation.fromNamespaceAndPath(AdvancedNetherite.MOD_ID, name);
    }
}
