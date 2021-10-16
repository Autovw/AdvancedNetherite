package com.autovw.advancednetherite.core;

import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.Ingredient;
import net.minecraftforge.fml.RegistryObject;

/**
 * Author: Autovw
 *
 * Create your own enum that implements Tier if you are adding new tools!
 */
public enum ModToolTiers implements IItemTier {
    // Tool materials are registered here.
    NETHERITE_IRON(4, 2281, 9.0F, 4.0F, 15, ModItems.NETHERITE_IRON_INGOT),
    NETHERITE_GOLD(4, 2313, 11.0F, 4.0F, 25, ModItems.NETHERITE_GOLD_INGOT),
    NETHERITE_EMERALD(4, 2651, 12.0F, 5.0F, 20, ModItems.NETHERITE_EMERALD_INGOT),
    NETHERITE_DIAMOND(4, 3092, 14.0F, 5.0F, 15, ModItems.NETHERITE_DIAMOND_INGOT);

    private final float speed, attackDamage;
    private final int level, durability, enchantability;
    private final RegistryObject<Item> repairIngredient;

    /**
     * @param level Level of the tool
     * @param durability The in-game durability of the tool
     * @param speed The breaking speed of the tool
     * @param attackDamage The default attack damage of the tool, this number can be modified later in the item registry class
     * @param enchantability The higher the number, the more likely better enchantments can be applied when using the enchantment table
     * @param repairIngredient Item used to repair the tool
     */
    private ModToolTiers(int level, int durability, float speed, float attackDamage, int enchantability, RegistryObject<Item> repairIngredient) {
        this.level = level;
        this.durability = durability;
        this.speed = speed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
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
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.of(this.repairIngredient.get());
    }
}
