package com.autovw.advancednetherite.core.util;

import net.minecraft.Util;
import net.minecraft.core.Holder;
import net.minecraft.resources.ResourceKey;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorType;
import net.minecraft.world.item.equipment.EquipmentAsset;

import java.util.EnumMap;

/**
 * @author Autovw
 */
public final class ModArmorMaterials
{
    public static final ArmorMaterial NETHERITE_IRON = register(37, Util.make(new EnumMap<>(ArmorType.class), (attribute) -> {
        attribute.put(ArmorType.BOOTS, 4);
        attribute.put(ArmorType.LEGGINGS, 6);
        attribute.put(ArmorType.CHESTPLATE, 8);
        attribute.put(ArmorType.HELMET, 4);
        attribute.put(ArmorType.BODY, 11);
    }), 15, 3.5F, 0.1F, ModTags.REPAIRS_NETHERITE_IRON_ARMOR, ModEquipmentAssets.NETHERITE_IRON);
    public static final ArmorMaterial NETHERITE_GOLD = register(37, Util.make(new EnumMap<>(ArmorType.class), (attribute) -> {
        attribute.put(ArmorType.BOOTS, 4);
        attribute.put(ArmorType.LEGGINGS, 7);
        attribute.put(ArmorType.CHESTPLATE, 9);
        attribute.put(ArmorType.HELMET, 4);
        attribute.put(ArmorType.BODY, 11);
    }), 25, 3.5F, 0.1F, ModTags.REPAIRS_NETHERITE_GOLD_ARMOR, ModEquipmentAssets.NETHERITE_GOLD);
    public static final ArmorMaterial NETHERITE_EMERALD = register(37, Util.make(new EnumMap<>(ArmorType.class), (attribute) -> {
        attribute.put(ArmorType.BOOTS, 4);
        attribute.put(ArmorType.LEGGINGS, 7);
        attribute.put(ArmorType.CHESTPLATE, 9);
        attribute.put(ArmorType.HELMET, 4);
        attribute.put(ArmorType.BODY, 11);
    }), 20, 3.5F, 0.1F, ModTags.REPAIRS_NETHERITE_EMERALD_ARMOR, ModEquipmentAssets.NETHERITE_EMERALD);
    public static final ArmorMaterial NETHERITE_DIAMOND = register(37, Util.make(new EnumMap<>(ArmorType.class), (attribute) -> {
        attribute.put(ArmorType.BOOTS, 5);
        attribute.put(ArmorType.LEGGINGS, 7);
        attribute.put(ArmorType.CHESTPLATE, 9);
        attribute.put(ArmorType.HELMET, 5);
        attribute.put(ArmorType.BODY, 11);
    }), 15, 4.0F, 0.1F, ModTags.REPAIRS_NETHERITE_DIAMOND_ARMOR, ModEquipmentAssets.NETHERITE_DIAMOND);

    /**
     * @param typeProtections       The amount of protection per slot
     * @param enchantability        The higher the number, the more likely better enchantments will be applied when using the enchanting table
     * @param toughness             Toughness for netherite armor
     * @param knockbackResistance   The knockback resistance for armor
     * @return Registered armor material
     */
    private static ArmorMaterial register(int durability, EnumMap<ArmorType, Integer> typeProtections, int enchantability, float toughness, float knockbackResistance, TagKey<Item> repairIngredient, ResourceKey<EquipmentAsset> equipmentAsset)
    {
        Holder<SoundEvent> equipSound = SoundEvents.ARMOR_EQUIP_NETHERITE;

        EnumMap<ArmorType, Integer> typeMap = new EnumMap<>(ArmorType.class);
        for (ArmorType type : ArmorType.values())
        {
            typeMap.put(type, typeProtections.get(type));
        }

        return new ArmorMaterial(durability, typeProtections, enchantability, equipSound, toughness, knockbackResistance, repairIngredient, equipmentAsset);
    }

    private ModArmorMaterials()
    {
    }
}
