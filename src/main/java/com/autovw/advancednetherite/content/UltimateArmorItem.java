package com.autovw.advancednetherite.content;

import com.autovw.advancednetherite.config.Config;
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
        return Config.ArmorConfig.diamondUltimatePassiveArmor.get();
    }

    @Override
    public boolean isEnderMask(ItemStack stack, Player player, EnderMan enderman) {
        return Config.ArmorConfig.diamondUltimatePassiveArmor.get();
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public void appendHoverText(ItemStack stack, @Nullable Level world, List<Component> tooltip, TooltipFlag flag) {
        // If Netherite/Diamond armor is Ultimate Armor (set to true in the config) the game displays the tooltips client-side.
        if (Config.ArmorConfig.diamondUltimatePassiveArmor.get()) {
            tooltip.add(EnderMaskArmorItem.endermaskTooltip);
            tooltip.add(PiglinPassiveArmorItem.piglinPassiveTooltip);
        } else {
            tooltip.remove(EnderMaskArmorItem.endermaskTooltip);
            tooltip.remove(PiglinPassiveArmorItem.piglinPassiveTooltip);
        }
    }
}