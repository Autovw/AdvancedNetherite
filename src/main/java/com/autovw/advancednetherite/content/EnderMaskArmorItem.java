package com.autovw.advancednetherite.content;

import com.autovw.advancednetherite.Reference;
import com.autovw.advancednetherite.config.Config;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.entity.EquipmentSlot;
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
public class EnderMaskArmorItem extends ArmorItem {

    // Endermask Tooltip
    public static final TranslatableComponent endermaskTooltip = (TranslatableComponent) new
            TranslatableComponent(Reference.TOOLTIP + Reference.MOD_ID + ".endermask_armor.perk_one").withStyle(ChatFormatting.DARK_GREEN);

    public EnderMaskArmorItem(ArmorMaterial material, EquipmentSlot slot, Properties builder) {
        super(material, slot, builder);
    }

    @Override
    public boolean isEnderMask(ItemStack stack, Player player, EnderMan enderman) {
        return Config.ArmorConfig.emeraldEndermanPassiveArmor.get();
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public void appendHoverText(ItemStack stack, @Nullable Level world, List<Component> tooltip, TooltipFlag flag) {
        // If Netherite/Emerald armor is Endermask Armor (set to true in the config) the game displays the tooltip client-side.
        if (Config.ArmorConfig.emeraldEndermanPassiveArmor.get()) {
            tooltip.add(endermaskTooltip);
        } else {
            tooltip.remove(endermaskTooltip);
        }
    }
}