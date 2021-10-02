package com.autovw.advancednetherite.content.armor;

import com.autovw.advancednetherite.config.Config;
import com.autovw.advancednetherite.content.Tooltips;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.monster.EnderMan;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import javax.annotation.Nullable;
import java.util.List;

/**
 * Author: Autovw
 */
public class UltimateArmorItem extends ArmorItem {
    public UltimateArmorItem(ArmorMaterial material, EquipmentSlot slot, Properties builder) {
        super(material, slot, builder);
    }

    @Override
    public boolean makesPiglinsNeutral(ItemStack stack, LivingEntity wearer) {
        return Config.ArmorConfig.diamondPiglinPassiveArmor.get();
    }

    @Override
    public boolean isEnderMask(ItemStack stack, Player player, EnderMan enderman) {
        return Config.ArmorConfig.diamondEndermanPassiveArmor.get();
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public void appendHoverText(ItemStack stack, @Nullable Level world, List<Component> tooltip, TooltipFlag flag) {
        // The tooltips are added here, they are removed later if a config option is set to false.
        tooltip.add(Tooltips.endermaskTooltip);
        tooltip.add(Tooltips.piglinPassiveTooltip);

        // If showTooltips is set to false in the config it removes the tooltips client-side.
        if (!Config.Client.showTooltips.get()) {
            tooltip.remove(Tooltips.endermaskTooltip);
            tooltip.remove(Tooltips.piglinPassiveTooltip);
        } else {
            // Remove the enderman passive tooltip if the option is set to false in the config.
            if (!Config.ArmorConfig.diamondEndermanPassiveArmor.get()) {
                tooltip.remove(Tooltips.endermaskTooltip);
            }
            // Remove the piglin passive tooltip if the option is set to false in the config.
            if (!Config.ArmorConfig.diamondPiglinPassiveArmor.get()) {
                tooltip.remove(Tooltips.piglinPassiveTooltip);
            }
        }
    }
}
