package com.autovw.advancednetherite.content;

import com.autovw.advancednetherite.config.Config;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

/**
 * Author: Autovw
 */
public class PiglinPassiveArmorItem extends ArmorItem {
    public PiglinPassiveArmorItem(ArmorMaterial material, EquipmentSlot slot, Item.Properties builder) {
        super(material, slot, builder);
    }

    @Override
    public boolean makesPiglinsNeutral(ItemStack stack, LivingEntity wearer) {
        return Config.ArmorConfig.goldPiglinPassiveArmor.get();
    }
}