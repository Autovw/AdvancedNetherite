package com.autovw.advancednetherite.core.util;

import com.autovw.advancednetherite.AdvancedNetherite;
import net.minecraft.Util;
import net.minecraft.core.Holder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorType;

import java.util.EnumMap;

/**
 * @author Autovw
 */
public final class ModArmorMaterials
{
    // TODO cleanup
    public static final ArmorMaterial NETHERITE_IRON;
    public static final ArmorMaterial NETHERITE_GOLD;
    public static final ArmorMaterial NETHERITE_EMERALD;
    public static final ArmorMaterial NETHERITE_DIAMOND;

    private ModArmorMaterials()
    {
    }

    static
    {
        NETHERITE_IRON = register(37, Util.make(new EnumMap<>(ArmorType.class), (attribute) -> {
            attribute.put(ArmorType.BOOTS, 4);
            attribute.put(ArmorType.LEGGINGS, 6);
            attribute.put(ArmorType.CHESTPLATE, 8);
            attribute.put(ArmorType.HELMET, 4);
            attribute.put(ArmorType.BODY, 11);
        }), 15, 3.5F, 0.1F, ModTags.REPAIRS_NETHERITE_IRON_ARMOR, "netherite_iron");
        NETHERITE_GOLD = register(37, Util.make(new EnumMap<>(ArmorType.class), (attribute) -> {
            attribute.put(ArmorType.BOOTS, 4);
            attribute.put(ArmorType.LEGGINGS, 7);
            attribute.put(ArmorType.CHESTPLATE, 9);
            attribute.put(ArmorType.HELMET, 4);
            attribute.put(ArmorType.BODY, 11);
        }), 25, 3.5F, 0.1F, ModTags.REPAIRS_NETHERITE_GOLD_ARMOR, "netherite_gold");
        NETHERITE_EMERALD = register(37, Util.make(new EnumMap<>(ArmorType.class), (attribute) -> {
            attribute.put(ArmorType.BOOTS, 4);
            attribute.put(ArmorType.LEGGINGS, 7);
            attribute.put(ArmorType.CHESTPLATE, 9);
            attribute.put(ArmorType.HELMET, 4);
            attribute.put(ArmorType.BODY, 11);
        }), 20, 3.5F, 0.1F, ModTags.REPAIRS_NETHERITE_EMERALD_ARMOR, "netherite_emerald");
        NETHERITE_DIAMOND = register(37, Util.make(new EnumMap<>(ArmorType.class), (attribute) -> {
            attribute.put(ArmorType.BOOTS, 5);
            attribute.put(ArmorType.LEGGINGS, 7);
            attribute.put(ArmorType.CHESTPLATE, 9);
            attribute.put(ArmorType.HELMET, 5);
            attribute.put(ArmorType.BODY, 11);
        }), 15, 4.0F, 0.1F, ModTags.REPAIRS_NETHERITE_DIAMOND_ARMOR, "netherite_diamond");
    }

    /**
     * @param name                  Name of the armor material
     * @param typeProtections       The amount of protection per slot
     * @param enchantability        The higher the number, the more likely better enchantments will be applied when using the enchanting table
     * @param toughness             Toughness for netherite armor
     * @param knockbackResistance   The knockback resistance for armor
     * @param ingredientItem        Item used in anvil to repair the armor piece
     * @return Registered armor material
     */
    private static ArmorMaterial register(int durability, EnumMap<ArmorType, Integer> typeProtections, int enchantability, float toughness, float knockbackResistance, TagKey<Item> repairIngredient, String modelId)
    {
        ResourceLocation loc = ResourceLocation.fromNamespaceAndPath(AdvancedNetherite.MOD_ID, modelId);
        Holder<SoundEvent> equipSound = SoundEvents.ARMOR_EQUIP_NETHERITE;
        //List<ArmorMaterial.Layer> layers = List.of(new ArmorMaterial.Layer(loc));

        EnumMap<ArmorType, Integer> typeMap = new EnumMap<>(ArmorType.class);
        for (ArmorType type : ArmorType.values())
        {
            typeMap.put(type, typeProtections.get(type));
        }

        //return Registry.registerForHolder(BuiltInRegistries.ARMOR_MATERIAL, loc, new ArmorMaterial(typeProtections, enchantability, equipSound, ingredient, layers, toughness, knockbackResistance));
        return new ArmorMaterial(durability, typeProtections, enchantability, equipSound, toughness, knockbackResistance, repairIngredient, loc);
    }
}
