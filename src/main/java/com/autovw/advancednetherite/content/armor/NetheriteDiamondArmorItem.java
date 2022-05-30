package com.autovw.advancednetherite.content.armor;

import com.autovw.advancednetherite.api.annotation.Internal;
import com.autovw.advancednetherite.common.item.AdvancedArmorItem;
import com.autovw.advancednetherite.config.Config;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.TextFormatting;

/**
 * Author: Autovw
 */
@Internal
public class NetheriteDiamondArmorItem extends AdvancedArmorItem {
    public NetheriteDiamondArmorItem(IArmorMaterial material, EquipmentSlotType equipmentSlot, Properties properties) {
        super(material, equipmentSlot, properties);
    }

    @Override
    public boolean pacifiesEndermen() {
        return Config.ArmorConfig.diamondEndermanPassiveArmor.get();
    }

    @Override
    public boolean pacifiesPiglins() {
        return Config.ArmorConfig.diamondPiglinPassiveArmor.get();
    }

    @Override
    public boolean pacifiesPhantoms() {
        return Config.ArmorConfig.diamondPhantomPassiveArmor.get();
    }

    @Override
    public TextFormatting customDurabilityBarColor(ItemStack stack) {
        return TextFormatting.AQUA;
    }
}
