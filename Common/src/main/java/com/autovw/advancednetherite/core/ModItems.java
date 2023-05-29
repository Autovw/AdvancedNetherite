package com.autovw.advancednetherite.core;

import com.autovw.advancednetherite.common.item.*;
import com.autovw.advancednetherite.core.util.ModArmorTiers;
import com.autovw.advancednetherite.core.util.ModToolTiers;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;

/**
 * @author Autovw
 */
public final class ModItems
{
    // Ingots
    public static final Item NETHERITE_IRON_INGOT = new AdvancedItem(new Item.Properties());
    public static final Item NETHERITE_GOLD_INGOT = new AdvancedItem(new Item.Properties());
    public static final Item NETHERITE_EMERALD_INGOT = new AdvancedItem(new Item.Properties());
    public static final Item NETHERITE_DIAMOND_INGOT = new AdvancedItem(new Item.Properties());

    // ARMOR SETS
    // Netherite-Iron
    public static final Item NETHERITE_IRON_HELMET = new AdvancedArmorItem(ModArmorTiers.NETHERITE_IRON, ArmorItem.Type.HELMET, new Item.Properties());
    public static final Item NETHERITE_IRON_CHESTPLATE = new AdvancedArmorItem(ModArmorTiers.NETHERITE_IRON, ArmorItem.Type.CHESTPLATE, (new Item.Properties()));
    public static final Item NETHERITE_IRON_LEGGINGS = new AdvancedArmorItem(ModArmorTiers.NETHERITE_IRON, ArmorItem.Type.LEGGINGS, (new Item.Properties()));
    public static final Item NETHERITE_IRON_BOOTS = new AdvancedArmorItem(ModArmorTiers.NETHERITE_IRON, ArmorItem.Type.BOOTS, (new Item.Properties()));

    // Netherite-Gold
    public static final Item NETHERITE_GOLD_HELMET = new AdvancedArmorItem(ModArmorTiers.NETHERITE_GOLD, ArmorItem.Type.HELMET, (new Item.Properties()));
    public static final Item NETHERITE_GOLD_CHESTPLATE = new AdvancedArmorItem(ModArmorTiers.NETHERITE_GOLD, ArmorItem.Type.CHESTPLATE, (new Item.Properties()));
    public static final Item NETHERITE_GOLD_LEGGINGS = new AdvancedArmorItem(ModArmorTiers.NETHERITE_GOLD, ArmorItem.Type.LEGGINGS, (new Item.Properties()));
    public static final Item NETHERITE_GOLD_BOOTS = new AdvancedArmorItem(ModArmorTiers.NETHERITE_GOLD, ArmorItem.Type.BOOTS, (new Item.Properties()));

    // Netherite-Emerald
    public static final Item NETHERITE_EMERALD_HELMET = new AdvancedArmorItem(ModArmorTiers.NETHERITE_EMERALD, ArmorItem.Type.HELMET, (new Item.Properties()));
    public static final Item NETHERITE_EMERALD_CHESTPLATE = new AdvancedArmorItem(ModArmorTiers.NETHERITE_EMERALD, ArmorItem.Type.CHESTPLATE, (new Item.Properties()));
    public static final Item NETHERITE_EMERALD_LEGGINGS = new AdvancedArmorItem(ModArmorTiers.NETHERITE_EMERALD, ArmorItem.Type.LEGGINGS, (new Item.Properties()));
    public static final Item NETHERITE_EMERALD_BOOTS = new AdvancedArmorItem(ModArmorTiers.NETHERITE_EMERALD, ArmorItem.Type.BOOTS, (new Item.Properties()));

    // Netherite-Diamond
    public static final Item NETHERITE_DIAMOND_HELMET = new AdvancedArmorItem(ModArmorTiers.NETHERITE_DIAMOND, ArmorItem.Type.HELMET, (new Item.Properties()));
    public static final Item NETHERITE_DIAMOND_CHESTPLATE = new AdvancedArmorItem(ModArmorTiers.NETHERITE_DIAMOND, ArmorItem.Type.CHESTPLATE, (new Item.Properties()));
    public static final Item NETHERITE_DIAMOND_LEGGINGS = new AdvancedArmorItem(ModArmorTiers.NETHERITE_DIAMOND, ArmorItem.Type.LEGGINGS, (new Item.Properties()));
    public static final Item NETHERITE_DIAMOND_BOOTS = new AdvancedArmorItem(ModArmorTiers.NETHERITE_DIAMOND, ArmorItem.Type.BOOTS, (new Item.Properties()));

    // TOOLS
    // Axes
    public static final Item NETHERITE_IRON_AXE = new AdvancedAxeItem(ModToolTiers.NETHERITE_IRON, 5, -3.0f, (new Item.Properties()));
    public static final Item NETHERITE_GOLD_AXE = new AdvancedAxeItem(ModToolTiers.NETHERITE_GOLD, 6, -3.0f, (new Item.Properties()));
    public static final Item NETHERITE_EMERALD_AXE = new AdvancedAxeItem(ModToolTiers.NETHERITE_EMERALD, 6, -3.0f, (new Item.Properties()));
    public static final Item NETHERITE_DIAMOND_AXE = new AdvancedAxeItem(ModToolTiers.NETHERITE_DIAMOND, 7, -3.0f, (new Item.Properties()));

    // Hoes
    public static final Item NETHERITE_IRON_HOE = new AdvancedHoeItem(ModToolTiers.NETHERITE_IRON, -4, 0.0F, (new Item.Properties()));
    public static final Item NETHERITE_GOLD_HOE = new AdvancedHoeItem(ModToolTiers.NETHERITE_GOLD, -4, 0.0F, (new Item.Properties()));
    public static final Item NETHERITE_EMERALD_HOE = new AdvancedHoeItem(ModToolTiers.NETHERITE_EMERALD, -5, 0.0F, (new Item.Properties()));
    public static final Item NETHERITE_DIAMOND_HOE = new AdvancedHoeItem(ModToolTiers.NETHERITE_DIAMOND, -5, 0.0F, (new Item.Properties()));

    // Pickaxes
    public static final Item NETHERITE_IRON_PICKAXE = new AdvancedPickaxeItem(ModToolTiers.NETHERITE_IRON, 1, -2.8F, (new Item.Properties()));
    public static final Item NETHERITE_GOLD_PICKAXE = new AdvancedPickaxeItem(ModToolTiers.NETHERITE_GOLD, 1, -2.8F, (new Item.Properties()));
    public static final Item NETHERITE_EMERALD_PICKAXE = new AdvancedPickaxeItem(ModToolTiers.NETHERITE_EMERALD, 1, -2.8F, (new Item.Properties()));
    public static final Item NETHERITE_DIAMOND_PICKAXE = new AdvancedPickaxeItem(ModToolTiers.NETHERITE_DIAMOND, 1, -2.8F, (new Item.Properties()));

    // Shovels
    public static final Item NETHERITE_IRON_SHOVEL = new AdvancedShovelItem(ModToolTiers.NETHERITE_IRON, 1.5F, -3.0F, (new Item.Properties()));
    public static final Item NETHERITE_GOLD_SHOVEL = new AdvancedShovelItem(ModToolTiers.NETHERITE_GOLD, 1.5F, -3.0F, (new Item.Properties()));
    public static final Item NETHERITE_EMERALD_SHOVEL = new AdvancedShovelItem(ModToolTiers.NETHERITE_EMERALD, 1, -3.0F, (new Item.Properties()));
    public static final Item NETHERITE_DIAMOND_SHOVEL = new AdvancedShovelItem(ModToolTiers.NETHERITE_DIAMOND, 1, -3.0F, (new Item.Properties()));

    // Swords
    public static final Item NETHERITE_IRON_SWORD = new AdvancedSwordItem(ModToolTiers.NETHERITE_IRON, 3, -2.4F, (new Item.Properties()));
    public static final Item NETHERITE_GOLD_SWORD = new AdvancedSwordItem(ModToolTiers.NETHERITE_GOLD, 4, -2.4F, (new Item.Properties()));
    public static final Item NETHERITE_EMERALD_SWORD = new AdvancedSwordItem(ModToolTiers.NETHERITE_EMERALD, 4, -2.4F, (new Item.Properties()));
    public static final Item NETHERITE_DIAMOND_SWORD = new AdvancedSwordItem(ModToolTiers.NETHERITE_DIAMOND, 5, -2.4F, (new Item.Properties()));

    // Blocks
    public static final BlockItem NETHERITE_IRON_BLOCK = new AdvancedBlockItem(ModBlocks.NETHERITE_IRON_BLOCK, new Item.Properties());
    public static final BlockItem NETHERITE_GOLD_BLOCK = new AdvancedBlockItem(ModBlocks.NETHERITE_GOLD_BLOCK, new Item.Properties());
    public static final BlockItem NETHERITE_EMERALD_BLOCK = new AdvancedBlockItem(ModBlocks.NETHERITE_EMERALD_BLOCK, new Item.Properties());
    public static final BlockItem NETHERITE_DIAMOND_BLOCK = new AdvancedBlockItem(ModBlocks.NETHERITE_DIAMOND_BLOCK, new Item.Properties());
}
