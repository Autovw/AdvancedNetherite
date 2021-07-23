package com.autovw.advancednetherite.core;

import com.autovw.advancednetherite.Reference;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fmllegacy.RegistryObject;

/**
 * Author: Autovw
 */
public enum ModArmorTiers implements ArmorMaterial {
    // Armor material is registered here.
    // f_11679_ should be the Netherite Armor equip sound.
    NETHERITE_IRON("netherite_iron", 39, new int[] { 4, 6, 8, 4 }, 15, SoundEvents.f_11679_,
            3.5F, 0.1F, ModItems.NETHERITE_IRON_INGOT),
    NETHERITE_GOLD("netherite_gold", 41, new int[] { 4, 7, 9, 4 }, 25, SoundEvents.f_11679_,
            3.5F, 0.1F, ModItems.NETHERITE_GOLD_INGOT),
    NETHERITE_EMERALD("netherite_emerald", 43, new int[] { 4, 7, 9, 4 }, 20, SoundEvents.f_11679_,
            3.5F, 0.1F, ModItems.NETHERITE_EMERALD_INGOT),
    NETHERITE_DIAMOND("netherite_diamond", 47, new int[] { 5, 7, 9, 5 }, 15, SoundEvents.f_11679_,
            4.0F, 0.1F, ModItems.NETHERITE_DIAMOND_INGOT);

    private static final int[] HEALTH_PER_SLOT = new int[] { 13, 15, 16, 11 };
    private final String name;
    private final int durability, enchantmentValue;
    private final int[] slotProtections;
    private final SoundEvent sound;
    private final float toughness, knockbackResistance;
    private final RegistryObject<Item> repairIngredient;

    private ModArmorTiers(String name, int durability, int[] slotProtections, int enchantmentValue, SoundEvent sound, float toughness,
                          float knockbackResistance, RegistryObject<Item> repairIngredient) {
        this.name = name;
        this.durability = durability;
        this.slotProtections = slotProtections;
        this.enchantmentValue = enchantmentValue;
        this.sound = sound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredient = repairIngredient;
    }

    // m_20749_ = getIndex
    @Override
    public int m_7366_(EquipmentSlot slot) {
        return HEALTH_PER_SLOT[slot.m_20749_()] * this.durability;
    }

    @Override
    public int m_7365_(EquipmentSlot slot) {
        return this.slotProtections[slot.m_20749_()];
    }

    @Override
    public int m_6646_() {
        return this.enchantmentValue;
    }

    @Override
    public SoundEvent m_7344_() {
        return this.sound;
    }

    // m_43929_ = of
    @Override
    public Ingredient m_6230_() {
        return Ingredient.m_43929_(this.repairIngredient.get());
    }

    @OnlyIn(Dist.CLIENT)
    @Override
    public String m_6082_() {
        return Reference.MOD_ID + ":" + this.name;
    }

    @Override
    public float m_6651_() {
        return this.toughness;
    }

    @Override
    public float m_6649_() {
        return this.knockbackResistance;
    }
}