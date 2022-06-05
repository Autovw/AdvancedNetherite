package com.autovw.advancednetherite.core.registry;

import com.autovw.advancednetherite.Reference;
import com.autovw.advancednetherite.common.item.*;
import com.autovw.advancednetherite.core.util.ModArmorTiers;
import com.autovw.advancednetherite.core.util.ModToolTiers;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

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
    public static final RegistryObject<Item> NETHERITE_IRON_HELMET = ITEMS.register("netherite_iron_helmet", () -> new AdvancedArmorItem(ModArmorTiers.NETHERITE_IRON, EquipmentSlot.HEAD, new Item.Properties().tab(Reference.TAB_ADVANCEDNETHERITE)));
    public static final RegistryObject<Item> NETHERITE_IRON_CHESTPLATE = ITEMS.register("netherite_iron_chestplate", () -> new AdvancedArmorItem(ModArmorTiers.NETHERITE_IRON, EquipmentSlot.CHEST, (new Item.Properties().tab(Reference.TAB_ADVANCEDNETHERITE))));
    public static final RegistryObject<Item> NETHERITE_IRON_LEGGINGS = ITEMS.register("netherite_iron_leggings", () -> new AdvancedArmorItem(ModArmorTiers.NETHERITE_IRON, EquipmentSlot.LEGS, (new Item.Properties().tab(Reference.TAB_ADVANCEDNETHERITE))));
    public static final RegistryObject<Item> NETHERITE_IRON_BOOTS = ITEMS.register("netherite_iron_boots", () -> new AdvancedArmorItem(ModArmorTiers.NETHERITE_IRON, EquipmentSlot.FEET, (new Item.Properties().tab(Reference.TAB_ADVANCEDNETHERITE))));

    // Netherite/Gold
    public static final RegistryObject<Item> NETHERITE_GOLD_HELMET = ITEMS.register("netherite_gold_helmet", () -> new AdvancedArmorItem(ModArmorTiers.NETHERITE_GOLD, EquipmentSlot.HEAD, (new Item.Properties().tab(Reference.TAB_ADVANCEDNETHERITE))));
    public static final RegistryObject<Item> NETHERITE_GOLD_CHESTPLATE = ITEMS.register("netherite_gold_chestplate", () -> new AdvancedArmorItem(ModArmorTiers.NETHERITE_GOLD, EquipmentSlot.CHEST, (new Item.Properties().tab(Reference.TAB_ADVANCEDNETHERITE))));
    public static final RegistryObject<Item> NETHERITE_GOLD_LEGGINGS = ITEMS.register("netherite_gold_leggings", () -> new AdvancedArmorItem(ModArmorTiers.NETHERITE_GOLD, EquipmentSlot.LEGS, (new Item.Properties().tab(Reference.TAB_ADVANCEDNETHERITE))));
    public static final RegistryObject<Item> NETHERITE_GOLD_BOOTS = ITEMS.register("netherite_gold_boots", () -> new AdvancedArmorItem(ModArmorTiers.NETHERITE_GOLD, EquipmentSlot.FEET, (new Item.Properties().tab(Reference.TAB_ADVANCEDNETHERITE))));

    // Netherite/Emerald
    public static final RegistryObject<Item> NETHERITE_EMERALD_HELMET = ITEMS.register("netherite_emerald_helmet", () -> new AdvancedArmorItem(ModArmorTiers.NETHERITE_EMERALD, EquipmentSlot.HEAD, (new Item.Properties().tab(Reference.TAB_ADVANCEDNETHERITE))));
    public static final RegistryObject<Item> NETHERITE_EMERALD_CHESTPLATE = ITEMS.register("netherite_emerald_chestplate", () -> new AdvancedArmorItem(ModArmorTiers.NETHERITE_EMERALD, EquipmentSlot.CHEST, (new Item.Properties().tab(Reference.TAB_ADVANCEDNETHERITE))));
    public static final RegistryObject<Item> NETHERITE_EMERALD_LEGGINGS = ITEMS.register("netherite_emerald_leggings", () -> new AdvancedArmorItem(ModArmorTiers.NETHERITE_EMERALD, EquipmentSlot.LEGS, (new Item.Properties().tab(Reference.TAB_ADVANCEDNETHERITE))));
    public static final RegistryObject<Item> NETHERITE_EMERALD_BOOTS = ITEMS.register("netherite_emerald_boots", () -> new AdvancedArmorItem(ModArmorTiers.NETHERITE_EMERALD, EquipmentSlot.FEET, (new Item.Properties().tab(Reference.TAB_ADVANCEDNETHERITE))));

    // Netherite/Diamond
    public static final RegistryObject<Item> NETHERITE_DIAMOND_HELMET = ITEMS.register("netherite_diamond_helmet", () -> new AdvancedArmorItem(ModArmorTiers.NETHERITE_DIAMOND, EquipmentSlot.HEAD, (new Item.Properties().tab(Reference.TAB_ADVANCEDNETHERITE))));
    public static final RegistryObject<Item> NETHERITE_DIAMOND_CHESTPLATE = ITEMS.register("netherite_diamond_chestplate", () -> new AdvancedArmorItem(ModArmorTiers.NETHERITE_DIAMOND, EquipmentSlot.CHEST, (new Item.Properties().tab(Reference.TAB_ADVANCEDNETHERITE))));
    public static final RegistryObject<Item> NETHERITE_DIAMOND_LEGGINGS = ITEMS.register("netherite_diamond_leggings", () -> new AdvancedArmorItem(ModArmorTiers.NETHERITE_DIAMOND, EquipmentSlot.LEGS, (new Item.Properties().tab(Reference.TAB_ADVANCEDNETHERITE))));
    public static final RegistryObject<Item> NETHERITE_DIAMOND_BOOTS = ITEMS.register("netherite_diamond_boots", () -> new AdvancedArmorItem(ModArmorTiers.NETHERITE_DIAMOND, EquipmentSlot.FEET, (new Item.Properties().tab(Reference.TAB_ADVANCEDNETHERITE))));

    // TOOLS
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
