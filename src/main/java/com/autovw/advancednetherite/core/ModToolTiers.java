package com.autovw.advancednetherite.core;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.fmllegacy.RegistryObject;

/**
 * Author: Autovw
 */
public enum ModToolTiers implements Tier {
    // Tool materials are registered here.
    NETHERITE_IRON(4, 2281, 9.0F, 4.0F, 15, ModItems.NETHERITE_IRON_INGOT),
    NETHERITE_GOLD(4, 2313, 11.0F, 4.0F, 25, ModItems.NETHERITE_GOLD_INGOT),
    NETHERITE_EMERALD(4, 2651, 11.0F, 5.0F, 20, ModItems.NETHERITE_EMERALD_INGOT),
    NETHERITE_DIAMOND(4, 3092, 12.0F, 5.0F, 15, ModItems.NETHERITE_DIAMOND_INGOT);

    private final float speed, attackDamage;
    private final int level, durability, enchantmentValue;
    private final RegistryObject<Item> repairIngredient;

    private ModToolTiers(int level, int durability, float speed, float attackDamage, int enchantmentValue, RegistryObject<Item> repairIngredient) {
        this.level = level;
        this.durability = durability;
        this.speed = speed;
        this.attackDamage = attackDamage;
        this.enchantmentValue = enchantmentValue;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public int m_6609_() {
        return this.durability;
    }

    @Override
    public float m_6624_() {
        return this.speed;
    }

    @Override
    public float m_6631_() {
        return this.attackDamage;
    }

    @Override
    public int m_6604_() {
        return this.level;
    }

    @Override
    public int m_6601_() {
        return this.enchantmentValue;
    }

    // m_43929_ = of
    @Override
    public Ingredient m_6282_() {
        return Ingredient.m_43929_(this.repairIngredient.get());
    }
}