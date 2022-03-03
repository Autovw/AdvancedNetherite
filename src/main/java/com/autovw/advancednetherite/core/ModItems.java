package com.autovw.advancednetherite.core;

import com.autovw.advancednetherite.Reference;
import com.autovw.advancednetherite.common.item.*;
import com.autovw.advancednetherite.content.armor.*;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

/**
 * Author: Autovw
 */
public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Reference.MOD_ID);

    // Ingots
    public static final RegistryObject<Item> NETHERITE_IRON_INGOT = ITEMS.register("netherite_iron_ingot", () -> new AdvancedItem(new Item.Properties().tab(Reference.TAB_ADVANCEDNETHERITE)));
    public static final RegistryObject<Item> NETHERITE_GOLD_INGOT = ITEMS.register("netherite_gold_ingot", () -> new AdvancedItem(new Item.Properties().tab(Reference.TAB_ADVANCEDNETHERITE)));
    public static final RegistryObject<Item> NETHERITE_EMERALD_INGOT = ITEMS.register("netherite_emerald_ingot", () -> new AdvancedItem(new Item.Properties().tab(Reference.TAB_ADVANCEDNETHERITE)));
    public static final RegistryObject<Item> NETHERITE_DIAMOND_INGOT = ITEMS.register("netherite_diamond_ingot", () -> new AdvancedItem(new Item.Properties().tab(Reference.TAB_ADVANCEDNETHERITE)));

    // ARMOR SETS
    // Netherite/Iron
    public static final RegistryObject<Item> NETHERITE_IRON_HELMET = ITEMS.register("netherite_iron_helmet", () -> new NetheriteIronArmorItem(ModArmorTiers.NETHERITE_IRON, EquipmentSlotType.HEAD, (new Item.Properties().tab(Reference.TAB_ADVANCEDNETHERITE))));
    public static final RegistryObject<Item> NETHERITE_IRON_CHESTPLATE = ITEMS.register("netherite_iron_chestplate", () -> new NetheriteIronArmorItem(ModArmorTiers.NETHERITE_IRON, EquipmentSlotType.CHEST, (new Item.Properties().tab(Reference.TAB_ADVANCEDNETHERITE))));
    public static final RegistryObject<Item> NETHERITE_IRON_LEGGINGS = ITEMS.register("netherite_iron_leggings", () -> new NetheriteIronArmorItem(ModArmorTiers.NETHERITE_IRON, EquipmentSlotType.LEGS, (new Item.Properties().tab(Reference.TAB_ADVANCEDNETHERITE))));
    public static final RegistryObject<Item> NETHERITE_IRON_BOOTS = ITEMS.register("netherite_iron_boots", () -> new NetheriteIronArmorItem(ModArmorTiers.NETHERITE_IRON, EquipmentSlotType.FEET, (new Item.Properties().tab(Reference.TAB_ADVANCEDNETHERITE))));

    // Netherite/Gold
    public static final RegistryObject<Item> NETHERITE_GOLD_HELMET = ITEMS.register("netherite_gold_helmet", () -> new NetheriteGoldArmorItem(ModArmorTiers.NETHERITE_GOLD, EquipmentSlotType.HEAD, (new Item.Properties().tab(Reference.TAB_ADVANCEDNETHERITE))));
    public static final RegistryObject<Item> NETHERITE_GOLD_CHESTPLATE = ITEMS.register("netherite_gold_chestplate", () -> new NetheriteGoldArmorItem(ModArmorTiers.NETHERITE_GOLD, EquipmentSlotType.CHEST, (new Item.Properties().tab(Reference.TAB_ADVANCEDNETHERITE))));
    public static final RegistryObject<Item> NETHERITE_GOLD_LEGGINGS = ITEMS.register("netherite_gold_leggings", () -> new NetheriteGoldArmorItem(ModArmorTiers.NETHERITE_GOLD, EquipmentSlotType.LEGS, (new Item.Properties().tab(Reference.TAB_ADVANCEDNETHERITE))));
    public static final RegistryObject<Item> NETHERITE_GOLD_BOOTS = ITEMS.register("netherite_gold_boots", () -> new NetheriteGoldArmorItem(ModArmorTiers.NETHERITE_GOLD, EquipmentSlotType.FEET, (new Item.Properties().tab(Reference.TAB_ADVANCEDNETHERITE))));

    // Netherite/Emerald
    public static final RegistryObject<Item> NETHERITE_EMERALD_HELMET = ITEMS.register("netherite_emerald_helmet", () -> new NetheriteEmeraldArmorItem(ModArmorTiers.NETHERITE_EMERALD, EquipmentSlotType.HEAD, (new Item.Properties().tab(Reference.TAB_ADVANCEDNETHERITE))));
    public static final RegistryObject<Item> NETHERITE_EMERALD_CHESTPLATE = ITEMS.register("netherite_emerald_chestplate", () -> new NetheriteEmeraldArmorItem(ModArmorTiers.NETHERITE_EMERALD, EquipmentSlotType.CHEST, (new Item.Properties().tab(Reference.TAB_ADVANCEDNETHERITE))));
    public static final RegistryObject<Item> NETHERITE_EMERALD_LEGGINGS = ITEMS.register("netherite_emerald_leggings", () -> new NetheriteEmeraldArmorItem(ModArmorTiers.NETHERITE_EMERALD, EquipmentSlotType.LEGS, (new Item.Properties().tab(Reference.TAB_ADVANCEDNETHERITE))));
    public static final RegistryObject<Item> NETHERITE_EMERALD_BOOTS = ITEMS.register("netherite_emerald_boots", () -> new NetheriteEmeraldArmorItem(ModArmorTiers.NETHERITE_EMERALD, EquipmentSlotType.FEET, (new Item.Properties().tab(Reference.TAB_ADVANCEDNETHERITE))));

    // Netherite/Diamond
    public static final RegistryObject<Item> NETHERITE_DIAMOND_HELMET = ITEMS.register("netherite_diamond_helmet", () -> new NetheriteDiamondArmorItem(ModArmorTiers.NETHERITE_DIAMOND, EquipmentSlotType.HEAD, (new Item.Properties().tab(Reference.TAB_ADVANCEDNETHERITE))));
    public static final RegistryObject<Item> NETHERITE_DIAMOND_CHESTPLATE = ITEMS.register("netherite_diamond_chestplate", () -> new NetheriteDiamondArmorItem(ModArmorTiers.NETHERITE_DIAMOND, EquipmentSlotType.CHEST, (new Item.Properties().tab(Reference.TAB_ADVANCEDNETHERITE))));
    public static final RegistryObject<Item> NETHERITE_DIAMOND_LEGGINGS = ITEMS.register("netherite_diamond_leggings", () -> new NetheriteDiamondArmorItem(ModArmorTiers.NETHERITE_DIAMOND, EquipmentSlotType.LEGS, (new Item.Properties().tab(Reference.TAB_ADVANCEDNETHERITE))));
    public static final RegistryObject<Item> NETHERITE_DIAMOND_BOOTS = ITEMS.register("netherite_diamond_boots", () -> new NetheriteDiamondArmorItem(ModArmorTiers.NETHERITE_DIAMOND, EquipmentSlotType.FEET, (new Item.Properties().tab(Reference.TAB_ADVANCEDNETHERITE))));

    // TOOLS (int = attackDamageIn, float = attackSpeedIn)
    // Axes
    public static final RegistryObject<Item> NETHERITE_IRON_AXE = ITEMS.register("netherite_iron_axe", () -> new AdvancedAxeItem(ModToolTiers.NETHERITE_IRON, 5, -3.0f, (new Item.Properties().tab(Reference.TAB_ADVANCEDNETHERITE))));
    public static final RegistryObject<Item> NETHERITE_GOLD_AXE = ITEMS.register("netherite_gold_axe", () -> new AdvancedAxeItem(ModToolTiers.NETHERITE_GOLD, 6, -3.0f, (new Item.Properties().tab(Reference.TAB_ADVANCEDNETHERITE))));
    public static final RegistryObject<Item> NETHERITE_EMERALD_AXE = ITEMS.register("netherite_emerald_axe", () -> new AdvancedAxeItem(ModToolTiers.NETHERITE_EMERALD, 6, -3.0f, (new Item.Properties().tab(Reference.TAB_ADVANCEDNETHERITE))));
    public static final RegistryObject<Item> NETHERITE_DIAMOND_AXE = ITEMS.register("netherite_diamond_axe", () -> new AdvancedAxeItem(ModToolTiers.NETHERITE_DIAMOND, 7, -3.0f, (new Item.Properties().tab(Reference.TAB_ADVANCEDNETHERITE))));

    // Hoes
    public static final RegistryObject<Item> NETHERITE_IRON_HOE = ITEMS.register("netherite_iron_hoe", () -> new AdvancedHoeItem(ModToolTiers.NETHERITE_IRON, -4, 0.0F, (new Item.Properties().tab(Reference.TAB_ADVANCEDNETHERITE))));
    public static final RegistryObject<Item> NETHERITE_GOLD_HOE = ITEMS.register("netherite_gold_hoe", () -> new AdvancedHoeItem(ModToolTiers.NETHERITE_GOLD, -4, 0.0F, (new Item.Properties().tab(Reference.TAB_ADVANCEDNETHERITE))));
    public static final RegistryObject<Item> NETHERITE_EMERALD_HOE = ITEMS.register("netherite_emerald_hoe", () -> new AdvancedHoeItem(ModToolTiers.NETHERITE_EMERALD, -5, 0.0F, (new Item.Properties().tab(Reference.TAB_ADVANCEDNETHERITE))));
    public static final RegistryObject<Item> NETHERITE_DIAMOND_HOE = ITEMS.register("netherite_diamond_hoe", () -> new AdvancedHoeItem(ModToolTiers.NETHERITE_DIAMOND, -5, 0.0F, (new Item.Properties().tab(Reference.TAB_ADVANCEDNETHERITE))));

    // Pickaxes
    public static final RegistryObject<Item> NETHERITE_IRON_PICKAXE = ITEMS.register("netherite_iron_pickaxe", () -> new AdvancedPickaxeItem(ModToolTiers.NETHERITE_IRON, 1, -2.8F, (new Item.Properties().tab(Reference.TAB_ADVANCEDNETHERITE))));
    public static final RegistryObject<Item> NETHERITE_GOLD_PICKAXE = ITEMS.register("netherite_gold_pickaxe", () -> new AdvancedPickaxeItem(ModToolTiers.NETHERITE_GOLD, 1, -2.8F, (new Item.Properties().tab(Reference.TAB_ADVANCEDNETHERITE))));
    public static final RegistryObject<Item> NETHERITE_EMERALD_PICKAXE = ITEMS.register("netherite_emerald_pickaxe", () -> new AdvancedPickaxeItem(ModToolTiers.NETHERITE_EMERALD, 1, -2.8F, (new Item.Properties().tab(Reference.TAB_ADVANCEDNETHERITE))));
    public static final RegistryObject<Item> NETHERITE_DIAMOND_PICKAXE = ITEMS.register("netherite_diamond_pickaxe", () -> new AdvancedPickaxeItem(ModToolTiers.NETHERITE_DIAMOND, 1, -2.8F, (new Item.Properties().tab(Reference.TAB_ADVANCEDNETHERITE))));

    // Shovels
    public static final RegistryObject<Item> NETHERITE_IRON_SHOVEL = ITEMS.register("netherite_iron_shovel", () -> new AdvancedShovelItem(ModToolTiers.NETHERITE_IRON, 1.5F, -3.0F, (new Item.Properties().tab(Reference.TAB_ADVANCEDNETHERITE))));
    public static final RegistryObject<Item> NETHERITE_GOLD_SHOVEL = ITEMS.register("netherite_gold_shovel", () -> new AdvancedShovelItem(ModToolTiers.NETHERITE_GOLD, 1.5F, -3.0F, (new Item.Properties().tab(Reference.TAB_ADVANCEDNETHERITE))));
    public static final RegistryObject<Item> NETHERITE_EMERALD_SHOVEL = ITEMS.register("netherite_emerald_shovel", () -> new AdvancedShovelItem(ModToolTiers.NETHERITE_EMERALD, 1, -3.0F, (new Item.Properties().tab(Reference.TAB_ADVANCEDNETHERITE))));
    public static final RegistryObject<Item> NETHERITE_DIAMOND_SHOVEL = ITEMS.register("netherite_diamond_shovel", () -> new AdvancedShovelItem(ModToolTiers.NETHERITE_DIAMOND, 1, -3.0F, (new Item.Properties().tab(Reference.TAB_ADVANCEDNETHERITE))));

    // Swords
    public static final RegistryObject<Item> NETHERITE_IRON_SWORD = ITEMS.register("netherite_iron_sword", () -> new AdvancedSwordItem(ModToolTiers.NETHERITE_IRON, 3, -2.4F, (new Item.Properties().tab(Reference.TAB_ADVANCEDNETHERITE))));
    public static final RegistryObject<Item> NETHERITE_GOLD_SWORD = ITEMS.register("netherite_gold_sword", () -> new AdvancedSwordItem(ModToolTiers.NETHERITE_GOLD, 4, -2.4F, (new Item.Properties().tab(Reference.TAB_ADVANCEDNETHERITE))));
    public static final RegistryObject<Item> NETHERITE_EMERALD_SWORD = ITEMS.register("netherite_emerald_sword", () -> new AdvancedSwordItem(ModToolTiers.NETHERITE_EMERALD, 4, -2.4F, (new Item.Properties().tab(Reference.TAB_ADVANCEDNETHERITE))));
    public static final RegistryObject<Item> NETHERITE_DIAMOND_SWORD = ITEMS.register("netherite_diamond_sword", () -> new AdvancedSwordItem(ModToolTiers.NETHERITE_DIAMOND, 5, -2.4F, (new Item.Properties().tab(Reference.TAB_ADVANCEDNETHERITE))));
}
