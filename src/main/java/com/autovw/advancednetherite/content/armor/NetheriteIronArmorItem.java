package com.autovw.advancednetherite.content.armor;

import com.autovw.advancednetherite.common.item.AdvancedArmorItem;
import net.minecraft.ChatFormatting;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;

/**
 * Author: Autovw
 */
public class NetheriteIronArmorItem extends AdvancedArmorItem {
    public NetheriteIronArmorItem(ArmorMaterial material, EquipmentSlot equipmentSlot, Properties properties) {
        super(material, equipmentSlot, properties);
    }

    @Override
    public ChatFormatting customDurabilityBarColor(ItemStack stack) {
        return ChatFormatting.GRAY;
    }
}
