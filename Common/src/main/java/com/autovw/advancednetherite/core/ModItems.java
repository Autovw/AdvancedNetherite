package com.autovw.advancednetherite.core;

import com.autovw.advancednetherite.common.item.*;
import com.autovw.advancednetherite.core.util.ModArmorMaterials;
import com.autovw.advancednetherite.core.util.ModToolTiers;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;

/**
 * @author Autovw
 */
public final class ModItems
{
    // Ingots
    public static final AdvancedItem NETHERITE_IRON_INGOT = new AdvancedItem(new Item.Properties());
    public static final AdvancedItem NETHERITE_GOLD_INGOT = new AdvancedItem(new Item.Properties());
    public static final AdvancedItem NETHERITE_EMERALD_INGOT = new AdvancedItem(new Item.Properties());
    public static final AdvancedItem NETHERITE_DIAMOND_INGOT = new AdvancedItem(new Item.Properties());

    // ARMOR SETS
    // Netherite-Iron
    public static final AdvancedArmorItem NETHERITE_IRON_HELMET = new AdvancedArmorItem(ModArmorMaterials.NETHERITE_IRON, ArmorItem.Type.HELMET);
    public static final AdvancedArmorItem NETHERITE_IRON_CHESTPLATE = new AdvancedArmorItem(ModArmorMaterials.NETHERITE_IRON, ArmorItem.Type.CHESTPLATE);
    public static final AdvancedArmorItem NETHERITE_IRON_LEGGINGS = new AdvancedArmorItem(ModArmorMaterials.NETHERITE_IRON, ArmorItem.Type.LEGGINGS);
    public static final AdvancedArmorItem NETHERITE_IRON_BOOTS = new AdvancedArmorItem(ModArmorMaterials.NETHERITE_IRON, ArmorItem.Type.BOOTS);

    // Netherite-Gold
    public static final AdvancedArmorItem NETHERITE_GOLD_HELMET = new AdvancedArmorItem(ModArmorMaterials.NETHERITE_GOLD, ArmorItem.Type.HELMET);
    public static final AdvancedArmorItem NETHERITE_GOLD_CHESTPLATE = new AdvancedArmorItem(ModArmorMaterials.NETHERITE_GOLD, ArmorItem.Type.CHESTPLATE);
    public static final AdvancedArmorItem NETHERITE_GOLD_LEGGINGS = new AdvancedArmorItem(ModArmorMaterials.NETHERITE_GOLD, ArmorItem.Type.LEGGINGS);
    public static final AdvancedArmorItem NETHERITE_GOLD_BOOTS = new AdvancedArmorItem(ModArmorMaterials.NETHERITE_GOLD, ArmorItem.Type.BOOTS);

    // Netherite-Emerald
    public static final AdvancedArmorItem NETHERITE_EMERALD_HELMET = new AdvancedArmorItem(ModArmorMaterials.NETHERITE_EMERALD, ArmorItem.Type.HELMET);
    public static final AdvancedArmorItem NETHERITE_EMERALD_CHESTPLATE = new AdvancedArmorItem(ModArmorMaterials.NETHERITE_EMERALD, ArmorItem.Type.CHESTPLATE);
    public static final AdvancedArmorItem NETHERITE_EMERALD_LEGGINGS = new AdvancedArmorItem(ModArmorMaterials.NETHERITE_EMERALD, ArmorItem.Type.LEGGINGS);
    public static final AdvancedArmorItem NETHERITE_EMERALD_BOOTS = new AdvancedArmorItem(ModArmorMaterials.NETHERITE_EMERALD, ArmorItem.Type.BOOTS);

    // Netherite-Diamond
    public static final AdvancedArmorItem NETHERITE_DIAMOND_HELMET = new AdvancedArmorItem(ModArmorMaterials.NETHERITE_DIAMOND, ArmorItem.Type.HELMET);
    public static final AdvancedArmorItem NETHERITE_DIAMOND_CHESTPLATE = new AdvancedArmorItem(ModArmorMaterials.NETHERITE_DIAMOND, ArmorItem.Type.CHESTPLATE);
    public static final AdvancedArmorItem NETHERITE_DIAMOND_LEGGINGS = new AdvancedArmorItem(ModArmorMaterials.NETHERITE_DIAMOND, ArmorItem.Type.LEGGINGS);
    public static final AdvancedArmorItem NETHERITE_DIAMOND_BOOTS = new AdvancedArmorItem(ModArmorMaterials.NETHERITE_DIAMOND, ArmorItem.Type.BOOTS);

    // TOOLS
    // Axes
    public static final AdvancedAxeItem NETHERITE_IRON_AXE = new AdvancedAxeItem(ModToolTiers.NETHERITE_IRON, 5, -3.0f);
    public static final AdvancedAxeItem NETHERITE_GOLD_AXE = new AdvancedAxeItem(ModToolTiers.NETHERITE_GOLD, 6, -3.0f);
    public static final AdvancedAxeItem NETHERITE_EMERALD_AXE = new AdvancedAxeItem(ModToolTiers.NETHERITE_EMERALD, 6, -3.0f);
    public static final AdvancedAxeItem NETHERITE_DIAMOND_AXE = new AdvancedAxeItem(ModToolTiers.NETHERITE_DIAMOND, 7, -3.0f);

    // Hoes
    public static final AdvancedHoeItem NETHERITE_IRON_HOE = new AdvancedHoeItem(ModToolTiers.NETHERITE_IRON, -4, 0.0F);
    public static final AdvancedHoeItem NETHERITE_GOLD_HOE = new AdvancedHoeItem(ModToolTiers.NETHERITE_GOLD, -4, 0.0F);
    public static final AdvancedHoeItem NETHERITE_EMERALD_HOE = new AdvancedHoeItem(ModToolTiers.NETHERITE_EMERALD, -5, 0.0F);
    public static final AdvancedHoeItem NETHERITE_DIAMOND_HOE = new AdvancedHoeItem(ModToolTiers.NETHERITE_DIAMOND, -5, 0.0F);

    // Pickaxes
    public static final AdvancedPickaxeItem NETHERITE_IRON_PICKAXE = new AdvancedPickaxeItem(ModToolTiers.NETHERITE_IRON, 1, -2.8F);
    public static final AdvancedPickaxeItem NETHERITE_GOLD_PICKAXE = new AdvancedPickaxeItem(ModToolTiers.NETHERITE_GOLD, 1, -2.8F);
    public static final AdvancedPickaxeItem NETHERITE_EMERALD_PICKAXE = new AdvancedPickaxeItem(ModToolTiers.NETHERITE_EMERALD, 1, -2.8F);
    public static final AdvancedPickaxeItem NETHERITE_DIAMOND_PICKAXE = new AdvancedPickaxeItem(ModToolTiers.NETHERITE_DIAMOND, 1, -2.8F);

    // Shovels
    public static final AdvancedShovelItem NETHERITE_IRON_SHOVEL = new AdvancedShovelItem(ModToolTiers.NETHERITE_IRON, 1.5F, -3.0F);
    public static final AdvancedShovelItem NETHERITE_GOLD_SHOVEL = new AdvancedShovelItem(ModToolTiers.NETHERITE_GOLD, 1.5F, -3.0F);
    public static final AdvancedShovelItem NETHERITE_EMERALD_SHOVEL = new AdvancedShovelItem(ModToolTiers.NETHERITE_EMERALD, 1, -3.0F);
    public static final AdvancedShovelItem NETHERITE_DIAMOND_SHOVEL = new AdvancedShovelItem(ModToolTiers.NETHERITE_DIAMOND, 1, -3.0F);

    // Swords
    public static final AdvancedSwordItem NETHERITE_IRON_SWORD = new AdvancedSwordItem(ModToolTiers.NETHERITE_IRON, 3, -2.4F);
    public static final AdvancedSwordItem NETHERITE_GOLD_SWORD = new AdvancedSwordItem(ModToolTiers.NETHERITE_GOLD, 4, -2.4F);
    public static final AdvancedSwordItem NETHERITE_EMERALD_SWORD = new AdvancedSwordItem(ModToolTiers.NETHERITE_EMERALD, 4, -2.4F);
    public static final AdvancedSwordItem NETHERITE_DIAMOND_SWORD = new AdvancedSwordItem(ModToolTiers.NETHERITE_DIAMOND, 5, -2.4F);

    // Blocks
    public static final AdvancedBlockItem NETHERITE_IRON_BLOCK = new AdvancedBlockItem(ModBlocks.NETHERITE_IRON_BLOCK);
    public static final AdvancedBlockItem NETHERITE_GOLD_BLOCK = new AdvancedBlockItem(ModBlocks.NETHERITE_GOLD_BLOCK);
    public static final AdvancedBlockItem NETHERITE_EMERALD_BLOCK = new AdvancedBlockItem(ModBlocks.NETHERITE_EMERALD_BLOCK);
    public static final AdvancedBlockItem NETHERITE_DIAMOND_BLOCK = new AdvancedBlockItem(ModBlocks.NETHERITE_DIAMOND_BLOCK);
}
