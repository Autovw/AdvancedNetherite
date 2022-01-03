package com.autovw.advancednetherite.content.armor;

import com.autovw.advancednetherite.common.item.AdvancedArmorItem;
import com.autovw.advancednetherite.config.Config;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;

/**
 * Author: Autovw
 */
public class NetheriteGoldArmorItem extends AdvancedArmorItem {
    public NetheriteGoldArmorItem(ArmorMaterial material, EquipmentSlot equipmentSlot, Properties properties) {
        super(material, equipmentSlot, properties);
    }

    @Override
    public boolean pacifiesPiglins() {
        return Config.ArmorConfig.goldPiglinPassiveArmor.get();
    }
}
