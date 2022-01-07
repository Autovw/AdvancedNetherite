package com.autovw.advancednetherite.core;

import com.autovw.advancednetherite.Reference;
import com.autovw.advancednetherite.common.item.*;
import com.autovw.advancednetherite.content.armor.*;
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
    public static final RegistryObject<Item> NETHERITE_IRON_INGOT = register("netherite_iron_ingot", new AdvancedItem(new Item.Properties().tab(Reference.TAB_ADVANCEDNETHERITE)));
    public static final RegistryObject<Item> NETHERITE_GOLD_INGOT = register("netherite_gold_ingot", new AdvancedItem(new Item.Properties().tab(Reference.TAB_ADVANCEDNETHERITE)));
    public static final RegistryObject<Item> NETHERITE_EMERALD_INGOT = register("netherite_emerald_ingot", new AdvancedItem(new Item.Properties().tab(Reference.TAB_ADVANCEDNETHERITE)));
    public static final RegistryObject<Item> NETHERITE_DIAMOND_INGOT = register("netherite_diamond_ingot", new AdvancedItem(new Item.Properties().tab(Reference.TAB_ADVANCEDNETHERITE)));

    // ARMOR SETS
    // Netherite/Iron
    public static final RegistryObject<Item> NETHERITE_IRON_HELMET = register("netherite_iron_helmet", new AdvancedArmorItem(ModArmorTiers.NETHERITE_IRON, EquipmentSlot.HEAD, (new Item.Properties().tab(Reference.TAB_ADVANCEDNETHERITE))));
    public static final RegistryObject<Item> NETHERITE_IRON_CHESTPLATE = register("netherite_iron_chestplate", new AdvancedArmorItem(ModArmorTiers.NETHERITE_IRON, EquipmentSlot.CHEST, (new Item.Properties().tab(Reference.TAB_ADVANCEDNETHERITE))));
    public static final RegistryObject<Item> NETHERITE_IRON_LEGGINGS = register("netherite_iron_leggings", new AdvancedArmorItem(ModArmorTiers.NETHERITE_IRON, EquipmentSlot.LEGS, (new Item.Properties().tab(Reference.TAB_ADVANCEDNETHERITE))));
    public static final RegistryObject<Item> NETHERITE_IRON_BOOTS = register("netherite_iron_boots", new AdvancedArmorItem(ModArmorTiers.NETHERITE_IRON, EquipmentSlot.FEET, (new Item.Properties().tab(Reference.TAB_ADVANCEDNETHERITE))));

    // Netherite/Gold
    public static final RegistryObject<Item> NETHERITE_GOLD_HELMET = register("netherite_gold_helmet", new NetheriteGoldArmorItem(ModArmorTiers.NETHERITE_GOLD, EquipmentSlot.HEAD, (new Item.Properties().tab(Reference.TAB_ADVANCEDNETHERITE))));
    public static final RegistryObject<Item> NETHERITE_GOLD_CHESTPLATE = register("netherite_gold_chestplate", new NetheriteGoldArmorItem(ModArmorTiers.NETHERITE_GOLD, EquipmentSlot.CHEST, (new Item.Properties().tab(Reference.TAB_ADVANCEDNETHERITE))));
    public static final RegistryObject<Item> NETHERITE_GOLD_LEGGINGS = register("netherite_gold_leggings", new NetheriteGoldArmorItem(ModArmorTiers.NETHERITE_GOLD, EquipmentSlot.LEGS, (new Item.Properties().tab(Reference.TAB_ADVANCEDNETHERITE))));
    public static final RegistryObject<Item> NETHERITE_GOLD_BOOTS = register("netherite_gold_boots", new NetheriteGoldArmorItem(ModArmorTiers.NETHERITE_GOLD, EquipmentSlot.FEET, (new Item.Properties().tab(Reference.TAB_ADVANCEDNETHERITE))));

    // Netherite/Emerald
    public static final RegistryObject<Item> NETHERITE_EMERALD_HELMET = register("netherite_emerald_helmet", new NetheriteEmeraldArmorItem(ModArmorTiers.NETHERITE_EMERALD, EquipmentSlot.HEAD, (new Item.Properties().tab(Reference.TAB_ADVANCEDNETHERITE))));
    public static final RegistryObject<Item> NETHERITE_EMERALD_CHESTPLATE = register("netherite_emerald_chestplate", new NetheriteEmeraldArmorItem(ModArmorTiers.NETHERITE_EMERALD, EquipmentSlot.CHEST, (new Item.Properties().tab(Reference.TAB_ADVANCEDNETHERITE))));
    public static final RegistryObject<Item> NETHERITE_EMERALD_LEGGINGS = register("netherite_emerald_leggings", new NetheriteEmeraldArmorItem(ModArmorTiers.NETHERITE_EMERALD, EquipmentSlot.LEGS, (new Item.Properties().tab(Reference.TAB_ADVANCEDNETHERITE))));
    public static final RegistryObject<Item> NETHERITE_EMERALD_BOOTS = register("netherite_emerald_boots", new NetheriteEmeraldArmorItem(ModArmorTiers.NETHERITE_EMERALD, EquipmentSlot.FEET, (new Item.Properties().tab(Reference.TAB_ADVANCEDNETHERITE))));

    // Netherite/Diamond
    public static final RegistryObject<Item> NETHERITE_DIAMOND_HELMET = register("netherite_diamond_helmet", new NetheriteDiamondArmorItem(ModArmorTiers.NETHERITE_DIAMOND, EquipmentSlot.HEAD, (new Item.Properties().tab(Reference.TAB_ADVANCEDNETHERITE))));
    public static final RegistryObject<Item> NETHERITE_DIAMOND_CHESTPLATE = register("netherite_diamond_chestplate", new NetheriteDiamondArmorItem(ModArmorTiers.NETHERITE_DIAMOND, EquipmentSlot.CHEST, (new Item.Properties().tab(Reference.TAB_ADVANCEDNETHERITE))));
    public static final RegistryObject<Item> NETHERITE_DIAMOND_LEGGINGS = register("netherite_diamond_leggings", new NetheriteDiamondArmorItem(ModArmorTiers.NETHERITE_DIAMOND, EquipmentSlot.LEGS, (new Item.Properties().tab(Reference.TAB_ADVANCEDNETHERITE))));
    public static final RegistryObject<Item> NETHERITE_DIAMOND_BOOTS = register("netherite_diamond_boots", new NetheriteDiamondArmorItem(ModArmorTiers.NETHERITE_DIAMOND, EquipmentSlot.FEET, (new Item.Properties().tab(Reference.TAB_ADVANCEDNETHERITE))));

    // TOOLS (int = attackDamageIn, float = attackSpeedIn)
    // Axes
    public static final RegistryObject<Item> NETHERITE_IRON_AXE = register("netherite_iron_axe", new AdvancedAxeItem(ModToolTiers.NETHERITE_IRON, 5, -3.0f, (new Item.Properties().tab(Reference.TAB_ADVANCEDNETHERITE))));
    public static final RegistryObject<Item> NETHERITE_GOLD_AXE = register("netherite_gold_axe", new AdvancedAxeItem(ModToolTiers.NETHERITE_GOLD, 6, -3.0f, (new Item.Properties().tab(Reference.TAB_ADVANCEDNETHERITE))));
    public static final RegistryObject<Item> NETHERITE_EMERALD_AXE = register("netherite_emerald_axe", new AdvancedAxeItem(ModToolTiers.NETHERITE_EMERALD, 6, -3.0f, (new Item.Properties().tab(Reference.TAB_ADVANCEDNETHERITE))));
    public static final RegistryObject<Item> NETHERITE_DIAMOND_AXE = register("netherite_diamond_axe", new AdvancedAxeItem(ModToolTiers.NETHERITE_DIAMOND, 7, -3.0f, (new Item.Properties().tab(Reference.TAB_ADVANCEDNETHERITE))));

    // Hoes
    public static final RegistryObject<Item> NETHERITE_IRON_HOE = register("netherite_iron_hoe", new AdvancedHoeItem(ModToolTiers.NETHERITE_IRON, -4, 0.0F, (new Item.Properties().tab(Reference.TAB_ADVANCEDNETHERITE))));
    public static final RegistryObject<Item> NETHERITE_GOLD_HOE = register("netherite_gold_hoe", new AdvancedHoeItem(ModToolTiers.NETHERITE_GOLD, -4, 0.0F, (new Item.Properties().tab(Reference.TAB_ADVANCEDNETHERITE))));
    public static final RegistryObject<Item> NETHERITE_EMERALD_HOE = register("netherite_emerald_hoe", new AdvancedHoeItem(ModToolTiers.NETHERITE_EMERALD, -5, 0.0F, (new Item.Properties().tab(Reference.TAB_ADVANCEDNETHERITE))));
    public static final RegistryObject<Item> NETHERITE_DIAMOND_HOE = register("netherite_diamond_hoe", new AdvancedHoeItem(ModToolTiers.NETHERITE_DIAMOND, -5, 0.0F, (new Item.Properties().tab(Reference.TAB_ADVANCEDNETHERITE))));

    // Pickaxes
    public static final RegistryObject<Item> NETHERITE_IRON_PICKAXE = register("netherite_iron_pickaxe", new AdvancedPickaxeItem(ModToolTiers.NETHERITE_IRON, 1, -2.8F, (new Item.Properties().tab(Reference.TAB_ADVANCEDNETHERITE))));
    public static final RegistryObject<Item> NETHERITE_GOLD_PICKAXE = register("netherite_gold_pickaxe", new AdvancedPickaxeItem(ModToolTiers.NETHERITE_GOLD, 1, -2.8F, (new Item.Properties().tab(Reference.TAB_ADVANCEDNETHERITE))));
    public static final RegistryObject<Item> NETHERITE_EMERALD_PICKAXE = register("netherite_emerald_pickaxe", new AdvancedPickaxeItem(ModToolTiers.NETHERITE_EMERALD, 1, -2.8F, (new Item.Properties().tab(Reference.TAB_ADVANCEDNETHERITE))));
    public static final RegistryObject<Item> NETHERITE_DIAMOND_PICKAXE = register("netherite_diamond_pickaxe", new AdvancedPickaxeItem(ModToolTiers.NETHERITE_DIAMOND, 1, -2.8F, (new Item.Properties().tab(Reference.TAB_ADVANCEDNETHERITE))));

    // Shovels
    public static final RegistryObject<Item> NETHERITE_IRON_SHOVEL = register("netherite_iron_shovel", new AdvancedShovelItem(ModToolTiers.NETHERITE_IRON, 1.5F, -3.0F, (new Item.Properties().tab(Reference.TAB_ADVANCEDNETHERITE))));
    public static final RegistryObject<Item> NETHERITE_GOLD_SHOVEL = register("netherite_gold_shovel", new AdvancedShovelItem(ModToolTiers.NETHERITE_GOLD, 1.5F, -3.0F, (new Item.Properties().tab(Reference.TAB_ADVANCEDNETHERITE))));
    public static final RegistryObject<Item> NETHERITE_EMERALD_SHOVEL = register("netherite_emerald_shovel", new AdvancedShovelItem(ModToolTiers.NETHERITE_EMERALD, 1, -3.0F, (new Item.Properties().tab(Reference.TAB_ADVANCEDNETHERITE))));
    public static final RegistryObject<Item> NETHERITE_DIAMOND_SHOVEL = register("netherite_diamond_shovel", new AdvancedShovelItem(ModToolTiers.NETHERITE_DIAMOND, 1, -3.0F, (new Item.Properties().tab(Reference.TAB_ADVANCEDNETHERITE))));

    // Swords
    public static final RegistryObject<Item> NETHERITE_IRON_SWORD = register("netherite_iron_sword", new AdvancedSwordItem(ModToolTiers.NETHERITE_IRON, 3, -2.4F, (new Item.Properties().tab(Reference.TAB_ADVANCEDNETHERITE))));
    public static final RegistryObject<Item> NETHERITE_GOLD_SWORD = register("netherite_gold_sword", new AdvancedSwordItem(ModToolTiers.NETHERITE_GOLD, 4, -2.4F, (new Item.Properties().tab(Reference.TAB_ADVANCEDNETHERITE))));
    public static final RegistryObject<Item> NETHERITE_EMERALD_SWORD = register("netherite_emerald_sword", new AdvancedSwordItem(ModToolTiers.NETHERITE_EMERALD, 4, -2.4F, (new Item.Properties().tab(Reference.TAB_ADVANCEDNETHERITE))));
    public static final RegistryObject<Item> NETHERITE_DIAMOND_SWORD = register("netherite_diamond_sword", new AdvancedSwordItem(ModToolTiers.NETHERITE_DIAMOND, 5, -2.4F, (new Item.Properties().tab(Reference.TAB_ADVANCEDNETHERITE))));

    // Helper method used to register items
    private static RegistryObject<Item> register(String name, Item item) {
        return ITEMS.register(name, () -> item);
    }
}
