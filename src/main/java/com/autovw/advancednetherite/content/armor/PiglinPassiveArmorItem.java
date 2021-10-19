package com.autovw.advancednetherite.content.armor;

import com.autovw.advancednetherite.config.Config;
import com.autovw.advancednetherite.content.ModTooltips;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

import javax.annotation.Nullable;
import java.util.List;

/**
 * Author: Autovw
 */
public class PiglinPassiveArmorItem extends ArmorItem {
    public PiglinPassiveArmorItem(ArmorMaterial material, EquipmentSlot slot, Properties builder) {
        super(material, slot, builder);
    }

    @Override
    public boolean makesPiglinsNeutral(ItemStack stack, LivingEntity wearer) {
        return Config.ArmorConfig.goldPiglinPassiveArmor.get();
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level world, List<Component> tooltip, TooltipFlag flag) {
        // The tooltips are added here, they are removed later if a config option is set to false.
        tooltip.add(ModTooltips.piglinPassiveTooltip);

        // If showTooltips is set to false in the config it removes the tooltips client-side.
        if (!Config.Client.showTooltips.get()) {
            tooltip.remove(ModTooltips.piglinPassiveTooltip);
        } else {
            // If Netherite/Gold armor is not Piglin Passive Armor (set to false in the config) the game removes the tooltip client-side.
            if (!Config.ArmorConfig.goldPiglinPassiveArmor.get()) {
                tooltip.remove(ModTooltips.piglinPassiveTooltip);
            }
        }
    }
}