package com.autovw.advancednetherite.core;

import com.autovw.advancednetherite.AdvancedNetherite;
import com.autovw.advancednetherite.common.item.*;
import com.autovw.advancednetherite.core.util.ModArmorMaterials;
import com.autovw.advancednetherite.core.util.ModToolMaterials;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.equipment.ArmorType;

/**
 * @author Autovw
 */
public final class ModItems
{
    // Ingots
    public static final AdvancedItem NETHERITE_IRON_INGOT = new AdvancedItem(new Item.Properties().setId(key("netherite_iron_ingot")));
    public static final AdvancedItem NETHERITE_GOLD_INGOT = new AdvancedItem(new Item.Properties().setId(key("netherite_gold_ingot")));
    public static final AdvancedItem NETHERITE_EMERALD_INGOT = new AdvancedItem(new Item.Properties().setId(key("netherite_emerald_ingot")));
    public static final AdvancedItem NETHERITE_DIAMOND_INGOT = new AdvancedItem(new Item.Properties().setId(key("netherite_diamond_ingot")));

    // ARMOR SETS
    // Netherite-Iron
    public static final AdvancedArmorItem NETHERITE_IRON_HELMET = new AdvancedArmorItem(ModArmorMaterials.NETHERITE_IRON, ArmorType.HELMET, new Item.Properties().setId(key("netherite_iron_helmet")));
    public static final AdvancedArmorItem NETHERITE_IRON_CHESTPLATE = new AdvancedArmorItem(ModArmorMaterials.NETHERITE_IRON, ArmorType.CHESTPLATE, new Item.Properties().setId(key("netherite_iron_chestplate")));
    public static final AdvancedArmorItem NETHERITE_IRON_LEGGINGS = new AdvancedArmorItem(ModArmorMaterials.NETHERITE_IRON, ArmorType.LEGGINGS, new Item.Properties().setId(key("netherite_iron_leggings")));
    public static final AdvancedArmorItem NETHERITE_IRON_BOOTS = new AdvancedArmorItem(ModArmorMaterials.NETHERITE_IRON, ArmorType.BOOTS, new Item.Properties().setId(key("netherite_iron_boots")));

    // Netherite-Gold
    public static final AdvancedArmorItem NETHERITE_GOLD_HELMET = new AdvancedArmorItem(ModArmorMaterials.NETHERITE_GOLD, ArmorType.HELMET, new Item.Properties().setId(key("netherite_gold_helmet")));
    public static final AdvancedArmorItem NETHERITE_GOLD_CHESTPLATE = new AdvancedArmorItem(ModArmorMaterials.NETHERITE_GOLD, ArmorType.CHESTPLATE, new Item.Properties().setId(key("netherite_gold_chestplate")));
    public static final AdvancedArmorItem NETHERITE_GOLD_LEGGINGS = new AdvancedArmorItem(ModArmorMaterials.NETHERITE_GOLD, ArmorType.LEGGINGS, new Item.Properties().setId(key("netherite_gold_leggings")));
    public static final AdvancedArmorItem NETHERITE_GOLD_BOOTS = new AdvancedArmorItem(ModArmorMaterials.NETHERITE_GOLD, ArmorType.BOOTS, new Item.Properties().setId(key("netherite_gold_boots")));

    // Netherite-Emerald
    public static final AdvancedArmorItem NETHERITE_EMERALD_HELMET = new AdvancedArmorItem(ModArmorMaterials.NETHERITE_EMERALD, ArmorType.HELMET, new Item.Properties().setId(key("netherite_emerald_helmet")));
    public static final AdvancedArmorItem NETHERITE_EMERALD_CHESTPLATE = new AdvancedArmorItem(ModArmorMaterials.NETHERITE_EMERALD, ArmorType.CHESTPLATE, new Item.Properties().setId(key("netherite_emerald_chestplate")));
    public static final AdvancedArmorItem NETHERITE_EMERALD_LEGGINGS = new AdvancedArmorItem(ModArmorMaterials.NETHERITE_EMERALD, ArmorType.LEGGINGS, new Item.Properties().setId(key("netherite_emerald_leggings")));
    public static final AdvancedArmorItem NETHERITE_EMERALD_BOOTS = new AdvancedArmorItem(ModArmorMaterials.NETHERITE_EMERALD, ArmorType.BOOTS, new Item.Properties().setId(key("netherite_emerald_boots")));

    // Netherite-Diamond
    public static final AdvancedArmorItem NETHERITE_DIAMOND_HELMET = new AdvancedArmorItem(ModArmorMaterials.NETHERITE_DIAMOND, ArmorType.HELMET, new Item.Properties().setId(key("netherite_diamond_helmet")));
    public static final AdvancedArmorItem NETHERITE_DIAMOND_CHESTPLATE = new AdvancedArmorItem(ModArmorMaterials.NETHERITE_DIAMOND, ArmorType.CHESTPLATE, new Item.Properties().setId(key("netherite_diamond_chestplate")));
    public static final AdvancedArmorItem NETHERITE_DIAMOND_LEGGINGS = new AdvancedArmorItem(ModArmorMaterials.NETHERITE_DIAMOND, ArmorType.LEGGINGS, new Item.Properties().setId(key("netherite_diamond_leggings")));
    public static final AdvancedArmorItem NETHERITE_DIAMOND_BOOTS = new AdvancedArmorItem(ModArmorMaterials.NETHERITE_DIAMOND, ArmorType.BOOTS, new Item.Properties().setId(key("netherite_diamond_boots")));

    // TOOLS
    // Axes
    public static final AdvancedAxeItem NETHERITE_IRON_AXE = new AdvancedAxeItem(ModToolMaterials.NETHERITE_IRON, 5, -3.0f, new Item.Properties().setId(key("netherite_iron_axe")));
    public static final AdvancedAxeItem NETHERITE_GOLD_AXE = new AdvancedAxeItem(ModToolMaterials.NETHERITE_GOLD, 6, -3.0f, new Item.Properties().setId(key("netherite_gold_axe")));
    public static final AdvancedAxeItem NETHERITE_EMERALD_AXE = new AdvancedAxeItem(ModToolMaterials.NETHERITE_EMERALD, 6, -3.0f, new Item.Properties().setId(key("netherite_emerald_axe")));
    public static final AdvancedAxeItem NETHERITE_DIAMOND_AXE = new AdvancedAxeItem(ModToolMaterials.NETHERITE_DIAMOND, 7, -3.0f, new Item.Properties().setId(key("netherite_diamond_axe")));

    // Hoes
    public static final AdvancedHoeItem NETHERITE_IRON_HOE = new AdvancedHoeItem(ModToolMaterials.NETHERITE_IRON, -4, 0.0F, new Item.Properties().setId(key("netherite_iron_hoe")));
    public static final AdvancedHoeItem NETHERITE_GOLD_HOE = new AdvancedHoeItem(ModToolMaterials.NETHERITE_GOLD, -4, 0.0F, new Item.Properties().setId(key("netherite_gold_hoe")));
    public static final AdvancedHoeItem NETHERITE_EMERALD_HOE = new AdvancedHoeItem(ModToolMaterials.NETHERITE_EMERALD, -5, 0.0F, new Item.Properties().setId(key("netherite_emerald_hoe")));
    public static final AdvancedHoeItem NETHERITE_DIAMOND_HOE = new AdvancedHoeItem(ModToolMaterials.NETHERITE_DIAMOND, -5, 0.0F, new Item.Properties().setId(key("netherite_diamond_hoe")));

    // Pickaxes
    public static final AdvancedPickaxeItem NETHERITE_IRON_PICKAXE = new AdvancedPickaxeItem(ModToolMaterials.NETHERITE_IRON, 1, -2.8F, new Item.Properties().setId(key("netherite_iron_pickaxe")));
    public static final AdvancedPickaxeItem NETHERITE_GOLD_PICKAXE = new AdvancedPickaxeItem(ModToolMaterials.NETHERITE_GOLD, 1, -2.8F, new Item.Properties().setId(key("netherite_gold_pickaxe")));
    public static final AdvancedPickaxeItem NETHERITE_EMERALD_PICKAXE = new AdvancedPickaxeItem(ModToolMaterials.NETHERITE_EMERALD, 1, -2.8F, new Item.Properties().setId(key("netherite_emerald_pickaxe")));
    public static final AdvancedPickaxeItem NETHERITE_DIAMOND_PICKAXE = new AdvancedPickaxeItem(ModToolMaterials.NETHERITE_DIAMOND, 1, -2.8F, new Item.Properties().setId(key("netherite_diamond_pickaxe")));

    // Shovels
    public static final AdvancedShovelItem NETHERITE_IRON_SHOVEL = new AdvancedShovelItem(ModToolMaterials.NETHERITE_IRON, 1.5F, -3.0F, new Item.Properties().setId(key("netherite_iron_shovel")));
    public static final AdvancedShovelItem NETHERITE_GOLD_SHOVEL = new AdvancedShovelItem(ModToolMaterials.NETHERITE_GOLD, 1.5F, -3.0F, new Item.Properties().setId(key("netherite_gold_shovel")));
    public static final AdvancedShovelItem NETHERITE_EMERALD_SHOVEL = new AdvancedShovelItem(ModToolMaterials.NETHERITE_EMERALD, 1, -3.0F, new Item.Properties().setId(key("netherite_emerald_shovel")));
    public static final AdvancedShovelItem NETHERITE_DIAMOND_SHOVEL = new AdvancedShovelItem(ModToolMaterials.NETHERITE_DIAMOND, 1, -3.0F, new Item.Properties().setId(key("netherite_diamond_shovel")));

    // Swords
    public static final AdvancedSwordItem NETHERITE_IRON_SWORD = new AdvancedSwordItem(ModToolMaterials.NETHERITE_IRON, 3, -2.4F, new Item.Properties().setId(key("netherite_iron_sword")));
    public static final AdvancedSwordItem NETHERITE_GOLD_SWORD = new AdvancedSwordItem(ModToolMaterials.NETHERITE_GOLD, 4, -2.4F, new Item.Properties().setId(key("netherite_gold_sword")));
    public static final AdvancedSwordItem NETHERITE_EMERALD_SWORD = new AdvancedSwordItem(ModToolMaterials.NETHERITE_EMERALD, 4, -2.4F, new Item.Properties().setId(key("netherite_emerald_sword")));
    public static final AdvancedSwordItem NETHERITE_DIAMOND_SWORD = new AdvancedSwordItem(ModToolMaterials.NETHERITE_DIAMOND, 5, -2.4F, new Item.Properties().setId(key("netherite_diamond_sword")));

    // Blocks
    public static final AdvancedBlockItem NETHERITE_IRON_BLOCK = new AdvancedBlockItem(ModBlocks.NETHERITE_IRON_BLOCK, new Item.Properties().useBlockDescriptionPrefix().setId(key("netherite_iron_block")));
    public static final AdvancedBlockItem NETHERITE_GOLD_BLOCK = new AdvancedBlockItem(ModBlocks.NETHERITE_GOLD_BLOCK, new Item.Properties().useBlockDescriptionPrefix().setId(key("netherite_gold_block")));
    public static final AdvancedBlockItem NETHERITE_EMERALD_BLOCK = new AdvancedBlockItem(ModBlocks.NETHERITE_EMERALD_BLOCK, new Item.Properties().useBlockDescriptionPrefix().setId(key("netherite_emerald_block")));
    public static final AdvancedBlockItem NETHERITE_DIAMOND_BLOCK = new AdvancedBlockItem(ModBlocks.NETHERITE_DIAMOND_BLOCK, new Item.Properties().useBlockDescriptionPrefix().setId(key("netherite_diamond_block")));

    private static ResourceKey<Item> key(String name)
    {
        return ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(AdvancedNetherite.MOD_ID, name));
    }
}
