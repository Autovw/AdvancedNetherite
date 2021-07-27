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
    NETHERITE_DIAMOND(4, 3092, 13.0F, 5.0F, 15, ModItems.NETHERITE_DIAMOND_INGOT);

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
    public int getUses() {
        return this.durability;
    }

    @Override
    public float getSpeed() {
        return this.speed;
    }

    @Override
    public float getAttackDamageBonus() {
        return this.attackDamage;
    }

    @Override
    public int getLevel() {
        return this.level;
    }

    @Override
    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.of(this.repairIngredient.get());
    }
}