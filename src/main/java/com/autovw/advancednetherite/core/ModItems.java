package com.autovw.advancednetherite.core;

import com.autovw.advancednetherite.Reference;
import com.autovw.advancednetherite.content.EnderMaskArmorItem;
import com.autovw.advancednetherite.content.PiglinPassiveArmorItem;
import com.autovw.advancednetherite.content.UltimateArmorItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

/**
 * Author: Autovw
 */
public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Reference.MOD_ID);

    // Ingots
    public static final RegistryObject<Item> NETHERITE_IRON_INGOT = ITEMS.register("netherite_iron_ingot",
            () -> new Item(new Item.Properties().tab(Reference.TAB_ADVANCEDNETHERITE).fireResistant()));
    public static final RegistryObject<Item> NETHERITE_GOLD_INGOT = ITEMS.register("netherite_gold_ingot",
            () -> new Item(new Item.Properties().tab(Reference.TAB_ADVANCEDNETHERITE).fireResistant()));
    public static final RegistryObject<Item> NETHERITE_EMERALD_INGOT = ITEMS.register("netherite_emerald_ingot",
            () -> new Item(new Item.Properties().tab(Reference.TAB_ADVANCEDNETHERITE).fireResistant()));
    public static final RegistryObject<Item> NETHERITE_DIAMOND_INGOT = ITEMS.register("netherite_diamond_ingot",
            () -> new Item(new Item.Properties().tab(Reference.TAB_ADVANCEDNETHERITE).fireResistant()));

    // ARMOR SETS
    // Netherite/Iron
    public static final RegistryObject<Item> NETHERITE_IRON_HELMET = ITEMS.register("netherite_iron_helmet",
            () -> new ArmorItem(ModArmorTiers.NETHERITE_IRON, EquipmentSlot.HEAD, (new Item.Properties()
                    .tab(Reference.TAB_ADVANCEDNETHERITE).fireResistant())));
    public static final RegistryObject<Item> NETHERITE_IRON_CHESTPLATE = ITEMS.register("netherite_iron_chestplate",
            () -> new ArmorItem(ModArmorTiers.NETHERITE_IRON, EquipmentSlot.CHEST, (new Item.Properties()
                    .tab(Reference.TAB_ADVANCEDNETHERITE).fireResistant())));
    public static final RegistryObject<Item> NETHERITE_IRON_LEGGINGS = ITEMS.register("netherite_iron_leggings",
            () -> new ArmorItem(ModArmorTiers.NETHERITE_IRON, EquipmentSlot.LEGS, (new Item.Properties()
                    .tab(Reference.TAB_ADVANCEDNETHERITE).fireResistant())));
    public static final RegistryObject<Item> NETHERITE_IRON_BOOTS = ITEMS.register("netherite_iron_boots",
            () -> new ArmorItem(ModArmorTiers.NETHERITE_IRON, EquipmentSlot.FEET, (new Item.Properties()
                    .tab(Reference.TAB_ADVANCEDNETHERITE).fireResistant())));

    // Netherite/Gold
    public static final RegistryObject<Item> NETHERITE_GOLD_HELMET = ITEMS.register("netherite_gold_helmet",
            () -> new PiglinPassiveArmorItem(ModArmorTiers.NETHERITE_GOLD, EquipmentSlot.HEAD, (new Item.Properties()
                    .tab(Reference.TAB_ADVANCEDNETHERITE).fireResistant())));
    public static final RegistryObject<Item> NETHERITE_GOLD_CHESTPLATE = ITEMS.register("netherite_gold_chestplate",
            () -> new PiglinPassiveArmorItem(ModArmorTiers.NETHERITE_GOLD, EquipmentSlot.CHEST, (new Item.Properties()
                    .tab(Reference.TAB_ADVANCEDNETHERITE).fireResistant())));
    public static final RegistryObject<Item> NETHERITE_GOLD_LEGGINGS = ITEMS.register("netherite_gold_leggings",
            () -> new PiglinPassiveArmorItem(ModArmorTiers.NETHERITE_GOLD, EquipmentSlot.LEGS, (new Item.Properties()
                    .tab(Reference.TAB_ADVANCEDNETHERITE).fireResistant())));
    public static final RegistryObject<Item> NETHERITE_GOLD_BOOTS = ITEMS.register("netherite_gold_boots",
            () -> new PiglinPassiveArmorItem(ModArmorTiers.NETHERITE_GOLD, EquipmentSlot.FEET, (new Item.Properties()
                    .tab(Reference.TAB_ADVANCEDNETHERITE).fireResistant())));

    // Netherite/Emerald
    public static final RegistryObject<Item> NETHERITE_EMERALD_HELMET = ITEMS.register("netherite_emerald_helmet",
            () -> new EnderMaskArmorItem(ModArmorTiers.NETHERITE_EMERALD, EquipmentSlot.HEAD, (new Item.Properties()
                    .tab(Reference.TAB_ADVANCEDNETHERITE).fireResistant())));
    public static final RegistryObject<Item> NETHERITE_EMERALD_CHESTPLATE = ITEMS.register("netherite_emerald_chestplate",
            () -> new EnderMaskArmorItem(ModArmorTiers.NETHERITE_EMERALD, EquipmentSlot.CHEST, (new Item.Properties()
                    .tab(Reference.TAB_ADVANCEDNETHERITE).fireResistant())));
    public static final RegistryObject<Item> NETHERITE_EMERALD_LEGGINGS = ITEMS.register("netherite_emerald_leggings",
            () -> new EnderMaskArmorItem(ModArmorTiers.NETHERITE_EMERALD, EquipmentSlot.LEGS, (new Item.Properties()
                    .tab(Reference.TAB_ADVANCEDNETHERITE).fireResistant())));
    public static final RegistryObject<Item> NETHERITE_EMERALD_BOOTS = ITEMS.register("netherite_emerald_boots",
            () -> new EnderMaskArmorItem(ModArmorTiers.NETHERITE_EMERALD, EquipmentSlot.FEET, (new Item.Properties()
                    .tab(Reference.TAB_ADVANCEDNETHERITE).fireResistant())));

    // Netherite/Diamond
    public static final RegistryObject<Item> NETHERITE_DIAMOND_HELMET = ITEMS.register("netherite_diamond_helmet",
            () -> new UltimateArmorItem(ModArmorTiers.NETHERITE_DIAMOND, EquipmentSlot.HEAD, (new Item.Properties()
                    .tab(Reference.TAB_ADVANCEDNETHERITE).fireResistant())));
    public static final RegistryObject<Item> NETHERITE_DIAMOND_CHESTPLATE = ITEMS.register("netherite_diamond_chestplate",
            () -> new UltimateArmorItem(ModArmorTiers.NETHERITE_DIAMOND, EquipmentSlot.CHEST, (new Item.Properties()
                    .tab(Reference.TAB_ADVANCEDNETHERITE).fireResistant())));
    public static final RegistryObject<Item> NETHERITE_DIAMOND_LEGGINGS = ITEMS.register("netherite_diamond_leggings",
            () -> new UltimateArmorItem(ModArmorTiers.NETHERITE_DIAMOND, EquipmentSlot.LEGS, (new Item.Properties()
                    .tab(Reference.TAB_ADVANCEDNETHERITE).fireResistant())));
    public static final RegistryObject<Item> NETHERITE_DIAMOND_BOOTS = ITEMS.register("netherite_diamond_boots",
            () -> new UltimateArmorItem(ModArmorTiers.NETHERITE_DIAMOND, EquipmentSlot.FEET, (new Item.Properties()
                    .tab(Reference.TAB_ADVANCEDNETHERITE).fireResistant())));

    // TOOLS (int = attackDamageIn, float = attackSpeedIn)
    // Axes
    public static final RegistryObject<Item> NETHERITE_IRON_AXE = ITEMS.register("netherite_iron_axe",
            () -> new AxeItem(ModToolTiers.NETHERITE_IRON, 5, -3.0f, (new Item.Properties()
                    .tab(Reference.TAB_ADVANCEDNETHERITE).fireResistant())));
    public static final RegistryObject<Item> NETHERITE_GOLD_AXE = ITEMS.register("netherite_gold_axe",
            () -> new AxeItem(ModToolTiers.NETHERITE_GOLD, 6, -3.0f, (new Item.Properties()
                    .tab(Reference.TAB_ADVANCEDNETHERITE).fireResistant())));
    public static final RegistryObject<Item> NETHERITE_EMERALD_AXE = ITEMS.register("netherite_emerald_axe",
            () -> new AxeItem(ModToolTiers.NETHERITE_EMERALD, 6, -3.0f, (new Item.Properties()
                    .tab(Reference.TAB_ADVANCEDNETHERITE).fireResistant())));
    public static final RegistryObject<Item> NETHERITE_DIAMOND_AXE = ITEMS.register("netherite_diamond_axe",
            () -> new AxeItem(ModToolTiers.NETHERITE_DIAMOND, 7, -3.0f, (new Item.Properties()
                    .tab(Reference.TAB_ADVANCEDNETHERITE).fireResistant())));

    // Hoes
    public static final RegistryObject<Item> NETHERITE_IRON_HOE = ITEMS.register("netherite_iron_hoe",
            () -> new HoeItem(ModToolTiers.NETHERITE_IRON, -4, 0.0F, (new Item.Properties()
                    .tab(Reference.TAB_ADVANCEDNETHERITE).fireResistant())));
    public static final RegistryObject<Item> NETHERITE_GOLD_HOE = ITEMS.register("netherite_gold_hoe",
            () -> new HoeItem(ModToolTiers.NETHERITE_GOLD, -4, 0.0F, (new Item.Properties()
                    .tab(Reference.TAB_ADVANCEDNETHERITE).fireResistant())));
    public static final RegistryObject<Item> NETHERITE_EMERALD_HOE = ITEMS.register("netherite_emerald_hoe",
            () -> new HoeItem(ModToolTiers.NETHERITE_EMERALD, -5, 0.0F, (new Item.Properties()
                    .tab(Reference.TAB_ADVANCEDNETHERITE).fireResistant())));
    public static final RegistryObject<Item> NETHERITE_DIAMOND_HOE = ITEMS.register("netherite_diamond_hoe",
            () -> new HoeItem(ModToolTiers.NETHERITE_DIAMOND, -5, 0.0F, (new Item.Properties()
                    .tab(Reference.TAB_ADVANCEDNETHERITE).fireResistant())));

    // Pickaxes
    public static final RegistryObject<Item> NETHERITE_IRON_PICKAXE = ITEMS.register("netherite_iron_pickaxe",
            () -> new PickaxeItem(ModToolTiers.NETHERITE_IRON, 1, -2.8F, (new Item.Properties()
                    .tab(Reference.TAB_ADVANCEDNETHERITE).fireResistant())));
    public static final RegistryObject<Item> NETHERITE_GOLD_PICKAXE = ITEMS.register("netherite_gold_pickaxe",
            () -> new PickaxeItem(ModToolTiers.NETHERITE_GOLD, 1, -2.8F, (new Item.Properties()
                    .tab(Reference.TAB_ADVANCEDNETHERITE).fireResistant())));
    public static final RegistryObject<Item> NETHERITE_EMERALD_PICKAXE = ITEMS.register("netherite_emerald_pickaxe",
            () -> new PickaxeItem(ModToolTiers.NETHERITE_EMERALD, 1, -2.8F, (new Item.Properties()
                    .tab(Reference.TAB_ADVANCEDNETHERITE).fireResistant())));
    public static final RegistryObject<Item> NETHERITE_DIAMOND_PICKAXE = ITEMS.register("netherite_diamond_pickaxe",
            () -> new PickaxeItem(ModToolTiers.NETHERITE_DIAMOND, 1, -2.8F, (new Item.Properties()
                    .tab(Reference.TAB_ADVANCEDNETHERITE).fireResistant())));

    // Shovels
    public static final RegistryObject<Item> NETHERITE_IRON_SHOVEL = ITEMS.register("netherite_iron_shovel",
            () -> new ShovelItem(ModToolTiers.NETHERITE_IRON, 1.5F, -3.0F, (new Item.Properties()
                    .tab(Reference.TAB_ADVANCEDNETHERITE).fireResistant())));
    public static final RegistryObject<Item> NETHERITE_GOLD_SHOVEL = ITEMS.register("netherite_gold_shovel",
            () -> new ShovelItem(ModToolTiers.NETHERITE_GOLD, 1.5F, -3.0F, (new Item.Properties()
                    .tab(Reference.TAB_ADVANCEDNETHERITE).fireResistant())));
    public static final RegistryObject<Item> NETHERITE_EMERALD_SHOVEL = ITEMS.register("netherite_emerald_shovel",
            () -> new ShovelItem(ModToolTiers.NETHERITE_EMERALD, 1, -3.0F, (new Item.Properties()
                    .tab(Reference.TAB_ADVANCEDNETHERITE).fireResistant())));
    public static final RegistryObject<Item> NETHERITE_DIAMOND_SHOVEL = ITEMS.register("netherite_diamond_shovel",
            () -> new ShovelItem(ModToolTiers.NETHERITE_DIAMOND, 1, -3.0F, (new Item.Properties()
                    .tab(Reference.TAB_ADVANCEDNETHERITE).fireResistant())));

    // Swords
    public static final RegistryObject<Item> NETHERITE_IRON_SWORD = ITEMS.register("netherite_iron_sword",
            () -> new SwordItem(ModToolTiers.NETHERITE_IRON, 3, -2.4F, (new Item.Properties()
                    .tab(Reference.TAB_ADVANCEDNETHERITE).fireResistant())));
    public static final RegistryObject<Item> NETHERITE_GOLD_SWORD = ITEMS.register("netherite_gold_sword",
            () -> new SwordItem(ModToolTiers.NETHERITE_GOLD, 4, -2.4F, (new Item.Properties()
                    .tab(Reference.TAB_ADVANCEDNETHERITE).fireResistant())));
    public static final RegistryObject<Item> NETHERITE_EMERALD_SWORD = ITEMS.register("netherite_emerald_sword",
            () -> new SwordItem(ModToolTiers.NETHERITE_EMERALD, 4, -2.4F, (new Item.Properties()
                    .tab(Reference.TAB_ADVANCEDNETHERITE).fireResistant())));
    public static final RegistryObject<Item> NETHERITE_DIAMOND_SWORD = ITEMS.register("netherite_diamond_sword",
            () -> new SwordItem(ModToolTiers.NETHERITE_DIAMOND, 5, -2.4F, (new Item.Properties()
                    .tab(Reference.TAB_ADVANCEDNETHERITE).fireResistant())));
}