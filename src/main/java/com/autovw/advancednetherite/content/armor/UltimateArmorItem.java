package com.autovw.advancednetherite.content.armor;

import com.autovw.advancednetherite.config.Config;
import com.autovw.advancednetherite.content.Tooltips;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.monster.EndermanEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import javax.annotation.Nullable;
import java.util.List;

/**
 * Author: Autovw
 */
public class UltimateArmorItem extends ArmorItem {
    public UltimateArmorItem(IArmorMaterial material, EquipmentSlotType slot, Properties builder) {
        super(material, slot, builder);
    }

    @Override
    public boolean makesPiglinsNeutral(ItemStack stack, LivingEntity wearer) {
        return Config.ArmorConfig.diamondUltimatePassiveArmor.get();
    }

    @Override
    public boolean isEnderMask(ItemStack stack, PlayerEntity player, EndermanEntity enderman) {
        return Config.ArmorConfig.diamondUltimatePassiveArmor.get();
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public void appendHoverText(ItemStack stack, @Nullable World world, List<ITextComponent> tooltip, ITooltipFlag flag) {
        // If showTooltips is set to false in the config it removes the tooltips client-side.
        if (!Config.Client.showTooltips.get()) {
            tooltip.remove(Tooltips.endermaskTooltip);
            tooltip.remove(Tooltips.piglinPassiveTooltip);
        // If Netherite/Diamond armor is not Ultimate Armor (set to false in the config) the game removes the tooltips client-side.
        } else {
            if (!Config.ArmorConfig.diamondUltimatePassiveArmor.get()) {
                tooltip.remove(Tooltips.endermaskTooltip);
                tooltip.remove(Tooltips.piglinPassiveTooltip);
            // Else: display the tooltips.
            } else {
                tooltip.add(Tooltips.endermaskTooltip);
                tooltip.add(Tooltips.piglinPassiveTooltip);
            }
        }
    }
}