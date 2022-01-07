package com.autovw.advancednetherite.content.armor;

import com.autovw.advancednetherite.common.item.AdvancedArmorItem;
import com.autovw.advancednetherite.config.Config;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;

/**
 * Author: Autovw
 */
public class NetheriteGoldArmorItem extends AdvancedArmorItem {
    public NetheriteGoldArmorItem(IArmorMaterial material, EquipmentSlotType equipmentSlot, Properties properties) {
        super(material, equipmentSlot, properties);
    }

    @Override
    public boolean pacifiesPiglins() {
        return Config.ArmorConfig.goldPiglinPassiveArmor.get();
    }
}
