package com.autovw.advancednetherite.core.util;

import com.autovw.advancednetherite.core.ModItems;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;

/**
 * Add-on developers: Create your own enum that implements {@link Tier} if you are adding new tools!
 * @author Autovw
 */
public enum ModToolTiers implements Tier
{
    // Tool materials are registered here.
    NETHERITE_IRON(ModTags.INCORRECT_FOR_NETHERITE_IRON_TOOL, 2281, 4.0F, 15, ModItems.NETHERITE_IRON_INGOT),
    NETHERITE_GOLD(ModTags.INCORRECT_FOR_NETHERITE_GOLD_TOOL, 2313, 4.0F, 25, ModItems.NETHERITE_GOLD_INGOT),
    NETHERITE_EMERALD(ModTags.INCORRECT_FOR_NETHERITE_EMERALD_TOOL, 2651, 5.0F, 20, ModItems.NETHERITE_EMERALD_INGOT),
    NETHERITE_DIAMOND(ModTags.INCORRECT_FOR_NETHERITE_DIAMOND_TOOL, 3092, 5.0F, 15, ModItems.NETHERITE_DIAMOND_INGOT);

    private final TagKey<Block> incorrectBlocksForDrops;
    private final float attackDamage;
    private final int durability, enchantability;
    private final Item repairIngredient;

    /**
     * @param incorrectBlocksForDrops Incorrect tools to use on blocks
     * @param durability The in-game durability of the tool
     * @param attackDamage The default attack damage of the tool, this number can be modified later in the item registry class
     * @param enchantability The higher the number, the more likely better enchantments can be applied when using the enchantment table
     * @param repairIngredient Item used to repair the tool
     */
    private ModToolTiers(TagKey<Block> incorrectBlocksForDrops, int durability, float attackDamage, int enchantability, Item repairIngredient)
    {
        this.incorrectBlocksForDrops = incorrectBlocksForDrops;
        this.durability = durability;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public int getUses()
    {
        return this.durability;
    }

    /**
     * Breaking speed is multiplied by config values later on
     */
    @Override
    public float getSpeed()
    {
        return 1.0F;
    }

    @Override
    public float getAttackDamageBonus()
    {
        return this.attackDamage;
    }

    @Override
    public TagKey<Block> getIncorrectBlocksForDrops()
    {
        return this.incorrectBlocksForDrops;
    }

    @Override
    public int getEnchantmentValue()
    {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient()
    {
        return Ingredient.of(this.repairIngredient);
    }
}
