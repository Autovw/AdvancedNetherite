package com.autovw.advancednetherite.core;

import com.autovw.advancednetherite.Reference;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.TierSortingRegistry;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

/**
 * Add-on developers: Create your own enum that implements {@link Tier} if you are adding new tools!
 * @author Autovw
 */
public enum ModToolTiers implements Tier {
    // Tool materials are registered here.
    NETHERITE_IRON(4, 2281, 4.0F, 15, ModItems.NETHERITE_IRON_INGOT),
    NETHERITE_GOLD(4, 2313, 4.0F, 25, ModItems.NETHERITE_GOLD_INGOT),
    NETHERITE_EMERALD(4, 2651, 5.0F, 20, ModItems.NETHERITE_EMERALD_INGOT),
    NETHERITE_DIAMOND(4, 3092,  5.0F, 15, ModItems.NETHERITE_DIAMOND_INGOT);

    private final float attackDamage;
    private final int level, durability, enchantability;
    private final RegistryObject<Item> repairIngredient;

    /**
     * @param level Level of the tool
     * @param durability The in-game durability of the tool
     * @param attackDamage The default attack damage of the tool, this number can be modified later in the item registry class
     * @param enchantability The higher the number, the more likely better enchantments can be applied when using the enchantment table
     * @param repairIngredient Item used to repair the tool
     */
    private ModToolTiers(int level, int durability, float attackDamage, int enchantability, RegistryObject<Item> repairIngredient) {
        this.level = level;
        this.durability = durability;
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
        return 1.0F;
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

    /**
     * This method is called inside {@link com.autovw.advancednetherite.AdvancedNetherite#commonSetup(FMLCommonSetupEvent)} in order to register the tool tiers.
     */
    public static void onCommonSetup() {
        TierSortingRegistry.registerTier(NETHERITE_IRON, new ResourceLocation(Reference.MOD_ID, "netherite_iron"), List.of(Tiers.NETHERITE), List.of());
        TierSortingRegistry.registerTier(NETHERITE_GOLD, new ResourceLocation(Reference.MOD_ID, "netherite_gold"), List.of(NETHERITE_IRON), List.of());
        TierSortingRegistry.registerTier(NETHERITE_EMERALD, new ResourceLocation(Reference.MOD_ID, "netherite_emerald"), List.of(NETHERITE_GOLD), List.of());
        TierSortingRegistry.registerTier(NETHERITE_DIAMOND, new ResourceLocation(Reference.MOD_ID, "netherite_diamond"), List.of(NETHERITE_EMERALD), List.of());
    }
}
