package com.autovw.advancednetherite.content.armor;

import com.autovw.advancednetherite.common.item.AdvancedArmorItem;
import com.autovw.advancednetherite.config.Config;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;

/**
 * Author: Autovw
 */
public class NetheriteEmeraldArmorItem extends AdvancedArmorItem {
    public NetheriteEmeraldArmorItem(ArmorMaterial material, EquipmentSlot equipmentSlot, Properties properties) {
        super(material, equipmentSlot, properties);
    }

    @Override
    public boolean pacifiesEndermen() {
        return Config.ArmorConfig.emeraldEndermanPassiveArmor.get();
    }
}
