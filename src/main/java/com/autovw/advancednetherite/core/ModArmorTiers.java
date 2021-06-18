package com.autovw.advancednetherite.core;

import com.autovw.advancednetherite.Reference;
import net.minecraft.entity.IRendersAsItem;
import net.minecraft.entity.LivingEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.RegistryObject;

/**
 * Author: Autovw
 */
public enum ModArmorTiers implements IArmorMaterial {
    NETHERITE_IRON("netherite_iron", 38, new int[] { 3, 6, 8, 3 }, 15, SoundEvents.ARMOR_EQUIP_NETHERITE,
            3.25F, 0.1F, ModItems.NETHERITE_IRON_INGOT),
    NETHERITE_GOLD("netherite_gold", 39, new int[] { 3, 6, 8, 3 }, 18, SoundEvents.ARMOR_EQUIP_NETHERITE,
            3.5F, 0.1F, ModItems.NETHERITE_GOLD_INGOT),
    NETHERITE_EMERALD("netherite_emerald", 41, new int[] { 3, 6, 8, 3 }, 18, SoundEvents.ARMOR_EQUIP_NETHERITE,
            3.75F, 0.1F, ModItems.NETHERITE_EMERALD_INGOT),
    NETHERITE_DIAMOND("netherite_diamond", 45, new int[] { 3, 6, 8, 3 }, 20, SoundEvents.ARMOR_EQUIP_NETHERITE,
            4.0F, 0.1F, ModItems.NETHERITE_DIAMOND_INGOT);

    private static final int[] HEALTH_PER_SLOT = new int[] { 13, 15, 16, 11 };
    private String name;
    private int durability, enchantmentValue;
    private int[] slotProtections;
    private SoundEvent sound;
    private float toughness, knockbackResistance;
    private RegistryObject<Item> repairIngredient;

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

    @Override
    public int getDurabilityForSlot(EquipmentSlotType slot) {
        return HEALTH_PER_SLOT[slot.getIndex()] * this.durability;
    }

    @Override
    public int getDefenseForSlot(EquipmentSlotType slot) {
        return this.slotProtections[slot.getIndex()];
    }

    @Override
    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    @Override
    public SoundEvent getEquipSound() {
        return this.sound;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.of(this.repairIngredient.get());
    }

    @OnlyIn(Dist.CLIENT)
    @Override
    public String getName() {
        return Reference.MOD_ID + ":" + this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}