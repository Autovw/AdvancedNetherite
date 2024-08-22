package com.autovw.advancednetherite.core.util;

import com.autovw.advancednetherite.AdvancedNetherite;
import com.autovw.advancednetherite.core.ModItems;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.Ingredient;

/**
 * Add-on developers: Create your own enum that implements {@link ArmorMaterial} if you are adding new armor!
 * @author Autovw
 */
public enum ModArmorTiers implements ArmorMaterial
{
    // Armor material is registered here.
    NETHERITE_IRON("netherite_iron", 135, new int[] { 4, 6, 8, 4 }, 15, SoundEvents.ARMOR_EQUIP_NETHERITE,
            3.5F, 0.1F, ModItems.NETHERITE_IRON_INGOT),
    NETHERITE_GOLD("netherite_gold", 142, new int[] { 4, 7, 9, 4 }, 25, SoundEvents.ARMOR_EQUIP_NETHERITE,
            3.5F, 0.1F, ModItems.NETHERITE_GOLD_INGOT),
    NETHERITE_EMERALD("netherite_emerald", 151, new int[] { 4, 7, 9, 4 }, 20, SoundEvents.ARMOR_EQUIP_NETHERITE,
            3.5F, 0.1F, ModItems.NETHERITE_EMERALD_INGOT),
    NETHERITE_DIAMOND("netherite_diamond", 165, new int[] { 5, 7, 9, 5 }, 15, SoundEvents.ARMOR_EQUIP_NETHERITE,
            4.0F, 0.1F, ModItems.NETHERITE_DIAMOND_INGOT);

    private static final int[] HEALTH_PER_SLOT = new int[] { 13, 15, 16, 11 };
    private final String name;
    private final int durability, enchantability;
    private final int[] slotProtections;
    private final SoundEvent sound;
    private final float toughness, knockbackResistance;
    private final Item repairIngredient;

    /**
     * @param name The name of the tier. Bear in mind that this name will be used for the armor texture too!
     * @param durability The durability is used to multiply slotProtections. For example: if the durability is set to 40, and the slotProtection of a chestplate is set to 16, then the in-game durability will be calculated like this: 16 * 40 = 640
     * @param slotProtections Protection per slot; this will be multiplied by the durability
     * @param enchantability The higher the number, the more likely better enchantments can be applied when using the enchantment table
     * @param sound Sound used when equipping armor piece
     * @param toughness How much toughness the armor gets, in vanilla only used by netherite armor (float)
     * @param knockbackResistance How much knockback resistance the armor has (float)
     * @param repairIngredient Item used to repair armor
     */
    private ModArmorTiers(String name, int durability, int[] slotProtections, int enchantability, SoundEvent sound, float toughness, float knockbackResistance, Item repairIngredient)
    {
        this.name = name;
        this.durability = durability;
        this.slotProtections = slotProtections;
        this.enchantability = enchantability;
        this.sound = sound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public int getDurabilityForType(ArmorItem.Type type)
    {
        return HEALTH_PER_SLOT[type.getSlot().getIndex()] * this.durability;
    }

    @Override
    public int getDefenseForType(ArmorItem.Type type)
    {
        return this.slotProtections[type.getSlot().getIndex()];
    }

    @Override
    public int getEnchantmentValue()
    {
        return this.enchantability;
    }

    @Override
    public SoundEvent getEquipSound()
    {
        return this.sound;
    }

    @Override
    public Ingredient getRepairIngredient()
    {
        return Ingredient.of(this.repairIngredient);
    }

    @Override
    public String getName()
    {
        return AdvancedNetherite.MOD_ID + ":" + this.name;
    }

    @Override
    public float getToughness()
    {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance()
    {
        return this.knockbackResistance;
    }
}
