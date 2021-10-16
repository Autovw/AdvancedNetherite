package com.autovw.advancednetherite.core;

import com.autovw.advancednetherite.Reference;
import com.autovw.advancednetherite.content.armor.EnderMaskArmorItem;
import com.autovw.advancednetherite.content.armor.PiglinPassiveArmorItem;
import com.autovw.advancednetherite.content.armor.UltimateArmorItem;
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
    public static final RegistryObject<Item> NETHERITE_IRON_INGOT = register("netherite_iron_ingot", new Item(new Item.Properties().tab(Reference.TAB_ADVANCEDNETHERITE).fireResistant()));
    public static final RegistryObject<Item> NETHERITE_GOLD_INGOT = register("netherite_gold_ingot", new Item(new Item.Properties().tab(Reference.TAB_ADVANCEDNETHERITE).fireResistant()));
    public static final RegistryObject<Item> NETHERITE_EMERALD_INGOT = register("netherite_emerald_ingot", new Item(new Item.Properties().tab(Reference.TAB_ADVANCEDNETHERITE).fireResistant()));
    public static final RegistryObject<Item> NETHERITE_DIAMOND_INGOT = register("netherite_diamond_ingot", new Item(new Item.Properties().tab(Reference.TAB_ADVANCEDNETHERITE).fireResistant()));

    // ARMOR SETS
    // Netherite/Iron
    public static final RegistryObject<Item> NETHERITE_IRON_HELMET = register("netherite_iron_helmet", new ArmorItem(ModArmorTiers.NETHERITE_IRON, EquipmentSlotType.HEAD, (new Item.Properties().tab(Reference.TAB_ADVANCEDNETHERITE).fireResistant())));
    public static final RegistryObject<Item> NETHERITE_IRON_CHESTPLATE = register("netherite_iron_chestplate", new ArmorItem(ModArmorTiers.NETHERITE_IRON, EquipmentSlotType.CHEST, (new Item.Properties().tab(Reference.TAB_ADVANCEDNETHERITE).fireResistant())));
    public static final RegistryObject<Item> NETHERITE_IRON_LEGGINGS = register("netherite_iron_leggings", new ArmorItem(ModArmorTiers.NETHERITE_IRON, EquipmentSlotType.LEGS, (new Item.Properties().tab(Reference.TAB_ADVANCEDNETHERITE).fireResistant())));
    public static final RegistryObject<Item> NETHERITE_IRON_BOOTS = register("netherite_iron_boots", new ArmorItem(ModArmorTiers.NETHERITE_IRON, EquipmentSlotType.FEET, (new Item.Properties().tab(Reference.TAB_ADVANCEDNETHERITE).fireResistant())));

    // Netherite/Gold
    public static final RegistryObject<Item> NETHERITE_GOLD_HELMET = register("netherite_gold_helmet", new PiglinPassiveArmorItem(ModArmorTiers.NETHERITE_GOLD, EquipmentSlotType.HEAD, (new Item.Properties().tab(Reference.TAB_ADVANCEDNETHERITE).fireResistant())));
    public static final RegistryObject<Item> NETHERITE_GOLD_CHESTPLATE = register("netherite_gold_chestplate", new PiglinPassiveArmorItem(ModArmorTiers.NETHERITE_GOLD, EquipmentSlotType.CHEST, (new Item.Properties().tab(Reference.TAB_ADVANCEDNETHERITE).fireResistant())));
    public static final RegistryObject<Item> NETHERITE_GOLD_LEGGINGS = register("netherite_gold_leggings", new PiglinPassiveArmorItem(ModArmorTiers.NETHERITE_GOLD, EquipmentSlotType.LEGS, (new Item.Properties().tab(Reference.TAB_ADVANCEDNETHERITE).fireResistant())));
    public static final RegistryObject<Item> NETHERITE_GOLD_BOOTS = register("netherite_gold_boots", new PiglinPassiveArmorItem(ModArmorTiers.NETHERITE_GOLD, EquipmentSlotType.FEET, (new Item.Properties().tab(Reference.TAB_ADVANCEDNETHERITE).fireResistant())));

    // Netherite/Emerald
    public static final RegistryObject<Item> NETHERITE_EMERALD_HELMET = register("netherite_emerald_helmet", new EnderMaskArmorItem(ModArmorTiers.NETHERITE_EMERALD, EquipmentSlotType.HEAD, (new Item.Properties().tab(Reference.TAB_ADVANCEDNETHERITE).fireResistant())));
    public static final RegistryObject<Item> NETHERITE_EMERALD_CHESTPLATE = register("netherite_emerald_chestplate", new EnderMaskArmorItem(ModArmorTiers.NETHERITE_EMERALD, EquipmentSlotType.CHEST, (new Item.Properties().tab(Reference.TAB_ADVANCEDNETHERITE).fireResistant())));
    public static final RegistryObject<Item> NETHERITE_EMERALD_LEGGINGS = register("netherite_emerald_leggings", new EnderMaskArmorItem(ModArmorTiers.NETHERITE_EMERALD, EquipmentSlotType.LEGS, (new Item.Properties().tab(Reference.TAB_ADVANCEDNETHERITE).fireResistant())));
    public static final RegistryObject<Item> NETHERITE_EMERALD_BOOTS = register("netherite_emerald_boots", new EnderMaskArmorItem(ModArmorTiers.NETHERITE_EMERALD, EquipmentSlotType.FEET, (new Item.Properties().tab(Reference.TAB_ADVANCEDNETHERITE).fireResistant())));

    // Netherite/Diamond
    public static final RegistryObject<Item> NETHERITE_DIAMOND_HELMET = register("netherite_diamond_helmet", new UltimateArmorItem(ModArmorTiers.NETHERITE_DIAMOND, EquipmentSlotType.HEAD, (new Item.Properties().tab(Reference.TAB_ADVANCEDNETHERITE).fireResistant())));
    public static final RegistryObject<Item> NETHERITE_DIAMOND_CHESTPLATE = register("netherite_diamond_chestplate", new UltimateArmorItem(ModArmorTiers.NETHERITE_DIAMOND, EquipmentSlotType.CHEST, (new Item.Properties().tab(Reference.TAB_ADVANCEDNETHERITE).fireResistant())));
    public static final RegistryObject<Item> NETHERITE_DIAMOND_LEGGINGS = register("netherite_diamond_leggings", new UltimateArmorItem(ModArmorTiers.NETHERITE_DIAMOND, EquipmentSlotType.LEGS, (new Item.Properties().tab(Reference.TAB_ADVANCEDNETHERITE).fireResistant())));
    public static final RegistryObject<Item> NETHERITE_DIAMOND_BOOTS = register("netherite_diamond_boots", new UltimateArmorItem(ModArmorTiers.NETHERITE_DIAMOND, EquipmentSlotType.FEET, (new Item.Properties().tab(Reference.TAB_ADVANCEDNETHERITE).fireResistant())));

    // TOOLS (int = attackDamageIn, float = attackSpeedIn)
    // Axes
    public static final RegistryObject<Item> NETHERITE_IRON_AXE = register("netherite_iron_axe", new AxeItem(ModToolTiers.NETHERITE_IRON, 5, -3.0f, (new Item.Properties().tab(Reference.TAB_ADVANCEDNETHERITE).fireResistant())));
    public static final RegistryObject<Item> NETHERITE_GOLD_AXE = register("netherite_gold_axe", new AxeItem(ModToolTiers.NETHERITE_GOLD, 6, -3.0f, (new Item.Properties().tab(Reference.TAB_ADVANCEDNETHERITE).fireResistant())));
    public static final RegistryObject<Item> NETHERITE_EMERALD_AXE = register("netherite_emerald_axe", new AxeItem(ModToolTiers.NETHERITE_EMERALD, 6, -3.0f, (new Item.Properties().tab(Reference.TAB_ADVANCEDNETHERITE).fireResistant())));
    public static final RegistryObject<Item> NETHERITE_DIAMOND_AXE = register("netherite_diamond_axe", new AxeItem(ModToolTiers.NETHERITE_DIAMOND, 7, -3.0f, (new Item.Properties().tab(Reference.TAB_ADVANCEDNETHERITE).fireResistant())));

    // Hoes
    public static final RegistryObject<Item> NETHERITE_IRON_HOE = register("netherite_iron_hoe", new HoeItem(ModToolTiers.NETHERITE_IRON, -4, 0.0F, (new Item.Properties().tab(Reference.TAB_ADVANCEDNETHERITE).fireResistant())));
    public static final RegistryObject<Item> NETHERITE_GOLD_HOE = register("netherite_gold_hoe", new HoeItem(ModToolTiers.NETHERITE_GOLD, -4, 0.0F, (new Item.Properties().tab(Reference.TAB_ADVANCEDNETHERITE).fireResistant())));
    public static final RegistryObject<Item> NETHERITE_EMERALD_HOE = register("netherite_emerald_hoe", new HoeItem(ModToolTiers.NETHERITE_EMERALD, -5, 0.0F, (new Item.Properties().tab(Reference.TAB_ADVANCEDNETHERITE).fireResistant())));
    public static final RegistryObject<Item> NETHERITE_DIAMOND_HOE = register("netherite_diamond_hoe", new HoeItem(ModToolTiers.NETHERITE_DIAMOND, -5, 0.0F, (new Item.Properties().tab(Reference.TAB_ADVANCEDNETHERITE).fireResistant())));

    // Pickaxes
    public static final RegistryObject<Item> NETHERITE_IRON_PICKAXE = register("netherite_iron_pickaxe", new PickaxeItem(ModToolTiers.NETHERITE_IRON, 1, -2.8F, (new Item.Properties().tab(Reference.TAB_ADVANCEDNETHERITE).fireResistant())));
    public static final RegistryObject<Item> NETHERITE_GOLD_PICKAXE = register("netherite_gold_pickaxe", new PickaxeItem(ModToolTiers.NETHERITE_GOLD, 1, -2.8F, (new Item.Properties().tab(Reference.TAB_ADVANCEDNETHERITE).fireResistant())));
    public static final RegistryObject<Item> NETHERITE_EMERALD_PICKAXE = register("netherite_emerald_pickaxe", new PickaxeItem(ModToolTiers.NETHERITE_EMERALD, 1, -2.8F, (new Item.Properties().tab(Reference.TAB_ADVANCEDNETHERITE).fireResistant())));
    public static final RegistryObject<Item> NETHERITE_DIAMOND_PICKAXE = register("netherite_diamond_pickaxe", new PickaxeItem(ModToolTiers.NETHERITE_DIAMOND, 1, -2.8F, (new Item.Properties().tab(Reference.TAB_ADVANCEDNETHERITE).fireResistant())));

    // Shovels
    public static final RegistryObject<Item> NETHERITE_IRON_SHOVEL = register("netherite_iron_shovel", new ShovelItem(ModToolTiers.NETHERITE_IRON, 1.5F, -3.0F, (new Item.Properties().tab(Reference.TAB_ADVANCEDNETHERITE).fireResistant())));
    public static final RegistryObject<Item> NETHERITE_GOLD_SHOVEL = register("netherite_gold_shovel", new ShovelItem(ModToolTiers.NETHERITE_GOLD, 1.5F, -3.0F, (new Item.Properties().tab(Reference.TAB_ADVANCEDNETHERITE).fireResistant())));
    public static final RegistryObject<Item> NETHERITE_EMERALD_SHOVEL = register("netherite_emerald_shovel", new ShovelItem(ModToolTiers.NETHERITE_EMERALD, 1, -3.0F, (new Item.Properties().tab(Reference.TAB_ADVANCEDNETHERITE).fireResistant())));
    public static final RegistryObject<Item> NETHERITE_DIAMOND_SHOVEL = register("netherite_diamond_shovel", new ShovelItem(ModToolTiers.NETHERITE_DIAMOND, 1, -3.0F, (new Item.Properties().tab(Reference.TAB_ADVANCEDNETHERITE).fireResistant())));

    // Swords
    public static final RegistryObject<Item> NETHERITE_IRON_SWORD = register("netherite_iron_sword", new SwordItem(ModToolTiers.NETHERITE_IRON, 3, -2.4F, (new Item.Properties().tab(Reference.TAB_ADVANCEDNETHERITE).fireResistant())));
    public static final RegistryObject<Item> NETHERITE_GOLD_SWORD = register("netherite_gold_sword", new SwordItem(ModToolTiers.NETHERITE_GOLD, 4, -2.4F, (new Item.Properties().tab(Reference.TAB_ADVANCEDNETHERITE).fireResistant())));
    public static final RegistryObject<Item> NETHERITE_EMERALD_SWORD = register("netherite_emerald_sword", new SwordItem(ModToolTiers.NETHERITE_EMERALD, 4, -2.4F, (new Item.Properties().tab(Reference.TAB_ADVANCEDNETHERITE).fireResistant())));
    public static final RegistryObject<Item> NETHERITE_DIAMOND_SWORD = register("netherite_diamond_sword", new SwordItem(ModToolTiers.NETHERITE_DIAMOND, 5, -2.4F, (new Item.Properties().tab(Reference.TAB_ADVANCEDNETHERITE).fireResistant())));

    // Helper method used to register items
    private static RegistryObject<Item> register(String name, Item item) {
        return ITEMS.register(name, () -> item);
    }
}
