package com.autovw.advancednetherite.content.armor;

import com.autovw.advancednetherite.common.item.AdvancedArmorItem;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.TextFormatting;

/**
 * Author: Autovw
 */
public class NetheriteIronArmorItem extends AdvancedArmorItem {
    public NetheriteIronArmorItem(IArmorMaterial material, EquipmentSlotType equipmentSlot, Properties properties) {
        super(material, equipmentSlot, properties);
    }

    @Override
    public TextFormatting customDurabilityBarColor(ItemStack stack) {
        return TextFormatting.GRAY;
    }
}
