package com.autovw.advancednetherite.core.util;

import com.autovw.advancednetherite.AdvancedNetherite;
import com.autovw.advancednetherite.core.ModItems;
import net.minecraft.Util;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.EnumMap;
import java.util.List;
import java.util.function.Supplier;

/**
 * @author Autovw
 */
public final class ModArmorMaterials
{
    public static final Holder<ArmorMaterial> NETHERITE_IRON;
    public static final Holder<ArmorMaterial> NETHERITE_GOLD;
    public static final Holder<ArmorMaterial> NETHERITE_EMERALD;
    public static final Holder<ArmorMaterial> NETHERITE_DIAMOND;

    private ModArmorMaterials()
    {
    }

    static
    {
        NETHERITE_IRON = register("netherite_iron", Util.make(new EnumMap<>(ArmorItem.Type.class), (attribute) -> {
            attribute.put(ArmorItem.Type.BOOTS, 4);
            attribute.put(ArmorItem.Type.LEGGINGS, 6);
            attribute.put(ArmorItem.Type.CHESTPLATE, 8);
            attribute.put(ArmorItem.Type.HELMET, 4);
            attribute.put(ArmorItem.Type.BODY, 11);
        }), 15, 3.5F, 0.1F, ModItems.NETHERITE_IRON_INGOT);
        NETHERITE_GOLD = register("netherite_gold", Util.make(new EnumMap<>(ArmorItem.Type.class), (attribute) -> {
            attribute.put(ArmorItem.Type.BOOTS, 4);
            attribute.put(ArmorItem.Type.LEGGINGS, 7);
            attribute.put(ArmorItem.Type.CHESTPLATE, 9);
            attribute.put(ArmorItem.Type.HELMET, 4);
            attribute.put(ArmorItem.Type.BODY, 11);
        }), 25, 3.5F, 0.1F, ModItems.NETHERITE_GOLD_INGOT);
        NETHERITE_EMERALD = register("netherite_emerald", Util.make(new EnumMap<>(ArmorItem.Type.class), (attribute) -> {
            attribute.put(ArmorItem.Type.BOOTS, 4);
            attribute.put(ArmorItem.Type.LEGGINGS, 7);
            attribute.put(ArmorItem.Type.CHESTPLATE, 9);
            attribute.put(ArmorItem.Type.HELMET, 4);
            attribute.put(ArmorItem.Type.BODY, 11);
        }), 20, 3.5F, 0.1F, ModItems.NETHERITE_EMERALD_INGOT);
        NETHERITE_DIAMOND = register("netherite_diamond", Util.make(new EnumMap<>(ArmorItem.Type.class), (attribute) -> {
            attribute.put(ArmorItem.Type.BOOTS, 5);
            attribute.put(ArmorItem.Type.LEGGINGS, 7);
            attribute.put(ArmorItem.Type.CHESTPLATE, 9);
            attribute.put(ArmorItem.Type.HELMET, 5);
            attribute.put(ArmorItem.Type.BODY, 11);
        }), 15, 4.0F, 0.1F, ModItems.NETHERITE_DIAMOND_INGOT);
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
    private static Holder<ArmorMaterial> register(String name, EnumMap<ArmorItem.Type, Integer> typeProtections, int enchantability, float toughness, float knockbackResistance, Item ingredientItem)
    {
        ResourceLocation loc = ResourceLocation.fromNamespaceAndPath(AdvancedNetherite.MOD_ID, name);
        Holder<SoundEvent> equipSound = SoundEvents.ARMOR_EQUIP_NETHERITE;
        Supplier<Ingredient> ingredient = () -> Ingredient.of(ingredientItem);
        List<ArmorMaterial.Layer> layers = List.of(new ArmorMaterial.Layer(loc));

        EnumMap<ArmorItem.Type, Integer> typeMap = new EnumMap<>(ArmorItem.Type.class);
        for (ArmorItem.Type type : ArmorItem.Type.values())
        {
            typeMap.put(type, typeProtections.get(type));
        }

        return Registry.registerForHolder(BuiltInRegistries.ARMOR_MATERIAL, loc, new ArmorMaterial(typeProtections, enchantability, equipSound, ingredient, layers, toughness, knockbackResistance));
    }
}
