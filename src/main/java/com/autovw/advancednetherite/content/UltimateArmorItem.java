package com.autovw.advancednetherite.content;

import com.autovw.advancednetherite.config.Config;
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