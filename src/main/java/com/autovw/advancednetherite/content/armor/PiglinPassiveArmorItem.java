package com.autovw.advancednetherite.content.armor;

import com.autovw.advancednetherite.Reference;
import com.autovw.advancednetherite.config.Config;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.LivingEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import javax.annotation.Nullable;
import java.util.List;

/**
 * Author: Autovw
 */
public class PiglinPassiveArmorItem extends ArmorItem {

    // Piglin Passive Tooltip
    public static final TranslationTextComponent piglinPassiveTooltip = (TranslationTextComponent) new TranslationTextComponent(
            Reference.TOOLTIP + Reference.MOD_ID + ".piglinpassive_armor.perk_one").withStyle(TextFormatting.GOLD);

    public PiglinPassiveArmorItem(IArmorMaterial material, EquipmentSlotType slot, Properties builder) {
        super(material, slot, builder);
    }

    @Override
    public boolean makesPiglinsNeutral(ItemStack stack, LivingEntity wearer) {
        return Config.ArmorConfig.goldPiglinPassiveArmor.get();
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public void appendHoverText(ItemStack stack, @Nullable World world, List<ITextComponent> tooltip, ITooltipFlag flag) {
        // If Netherite/Gold armor is Piglin Passive Armor (set to true in the config) the game displays the tooltip client-side.
        if (Config.ArmorConfig.goldPiglinPassiveArmor.get()) {
            tooltip.add(piglinPassiveTooltip);
        } else {
            tooltip.remove(piglinPassiveTooltip);
        }
    }
}