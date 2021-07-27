package com.autovw.advancednetherite.content;

import com.autovw.advancednetherite.Reference;
import com.autovw.advancednetherite.config.Config;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
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
public class PiglinPassiveArmorItem extends ArmorItem {

    // Piglin Passive Tooltip
    public static final TranslatableComponent piglinPassiveTooltip = (TranslatableComponent) new TranslatableComponent(
            Reference.TOOLTIP + Reference.MOD_ID + ".piglinpassive_armor.perk_one").withStyle(ChatFormatting.GOLD);

    public PiglinPassiveArmorItem(ArmorMaterial material, EquipmentSlot slot, Properties builder) {
        super(material, slot, builder);
    }

    @Override
    public boolean makesPiglinsNeutral(ItemStack stack, LivingEntity wearer) {
        return Config.ArmorConfig.goldPiglinPassiveArmor.get();
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public void appendHoverText(ItemStack stack, @Nullable Level world, List<Component> tooltip, TooltipFlag flag) {
        // If Netherite/Gold armor is Piglin Passive Armor (set to true in the config) the game displays the tooltip client-side.
        if (Config.ArmorConfig.goldPiglinPassiveArmor.get()) {
            tooltip.add(piglinPassiveTooltip);
        } else {
            tooltip.remove(piglinPassiveTooltip);
        }
    }
}