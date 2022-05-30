package com.autovw.advancednetherite.content.armor;

import com.autovw.advancednetherite.api.annotation.Internal;
import com.autovw.advancednetherite.common.item.AdvancedArmorItem;
import com.autovw.advancednetherite.config.Config;
import net.minecraft.ChatFormatting;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;

/**
 * Author: Autovw
 */
@Internal
public class NetheriteGoldArmorItem extends AdvancedArmorItem {
    public NetheriteGoldArmorItem(ArmorMaterial material, EquipmentSlot equipmentSlot, Properties properties) {
        super(material, equipmentSlot, properties);
    }

    @Override
    public boolean pacifiesEndermen() {
        return Config.ArmorConfig.goldEndermanPassiveArmor.get();
    }

    @Override
    public boolean pacifiesPiglins() {
        return Config.ArmorConfig.goldPiglinPassiveArmor.get();
    }

    @Override
    public boolean pacifiesPhantoms() {
        return Config.ArmorConfig.goldPhantomPassiveArmor.get();
    }

    @Override
    public ChatFormatting customDurabilityBarColor(ItemStack stack) {
        return ChatFormatting.GOLD;
    }
}
