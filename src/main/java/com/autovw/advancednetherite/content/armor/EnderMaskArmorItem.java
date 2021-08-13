package com.autovw.advancednetherite.content.armor;

import com.autovw.advancednetherite.Reference;
import com.autovw.advancednetherite.config.Config;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.monster.EndermanEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.*;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import javax.annotation.Nullable;
import java.util.List;

/**
 * Author: Autovw
 */
public class EnderMaskArmorItem extends ArmorItem {

    // Endermask Tooltip
    public static final TranslationTextComponent endermaskTooltip = (TranslationTextComponent) new
            TranslationTextComponent(Reference.TOOLTIP + Reference.MOD_ID + ".endermask_armor.perk_one").withStyle(TextFormatting.DARK_GREEN);

    public EnderMaskArmorItem(IArmorMaterial material, EquipmentSlotType slot, Properties builder) {
        super(material, slot, builder);
    }

    @Override
    public boolean isEnderMask(ItemStack stack, PlayerEntity player, EndermanEntity enderman) {
        return Config.ArmorConfig.emeraldEndermanPassiveArmor.get();
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public void appendHoverText(ItemStack stack, @Nullable World world, List<ITextComponent> tooltip, ITooltipFlag flag) {
        // If Netherite/Emerald armor is Endermask Armor (set to true in the config) the game displays the tooltip client-side.
        if (Config.ArmorConfig.emeraldEndermanPassiveArmor.get()) {
            tooltip.add(endermaskTooltip);
        } else {
            tooltip.remove(endermaskTooltip);
        }
    }
}