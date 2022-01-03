package com.autovw.advancednetherite.common.item;

import com.autovw.advancednetherite.config.Config;
import com.autovw.advancednetherite.content.ModTooltips;
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

import javax.annotation.Nullable;
import java.util.List;

/**
 * Author: Autovw
 */
public class AdvancedArmorItem extends ArmorItem {
    public AdvancedArmorItem(ArmorMaterial material, EquipmentSlot equipmentSlot, Properties properties) {
        super(material, equipmentSlot, properties);
    }

    /**
     * {@link Override} this method if you want endermen to behave neutral towards the player when wearing the armor.
     *
     * @return If true, pacifies endermen. Also applies the tooltip.
     */
    public boolean pacifiesEndermen() {
        return false;
    }

    /**
     * {@link Override} this method if you want piglins to behave neutral towards the player when wearing the armor.
     *
     * @return If true, pacifies piglins. Also applies the tooltip.
     */
    public boolean pacifiesPiglins() {
        return false;
    }

    /**
     * Netherite items do not burn by default.
     * {@link Override} if you want to disable this feature.
     *
     * @return If true, item does not burn when on fire
     */
    @Override
    public boolean isFireResistant() {
        return true;
    }

    /**
     * Don't override this method, use: {@link AdvancedArmorItem#pacifiesEndermen()}
     */
    @Override
    public boolean isEnderMask(ItemStack stack, Player player, EnderMan enderman) {
        return pacifiesEndermen();
    }

    /**
     * Don't override this method, use: {@link AdvancedArmorItem#pacifiesPiglins()}
     */
    @Override
    public boolean makesPiglinsNeutral(ItemStack stack, LivingEntity wearer) {
        return pacifiesPiglins();
    }

    /**
     * {@link Override} this method if you want to add your own custom tooltips.
     *
     * @param stack The item stack
     * @param tooltip Collection of tooltips
     * @param flag Tooltip flag. Used to determine if a tooltip is only visible when debug mode (F3 + H) is enabled.
     */
    public void addTooltips(ItemStack stack, List<Component> tooltip, TooltipFlag flag) {}

    /**
     * Don't override this method, use: {@link AdvancedArmorItem#addTooltips(ItemStack, List, TooltipFlag)} if you want to add your own custom tooltips.
     */
    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level world, List<Component> tooltip, TooltipFlag flag) {
        tooltip.add(ModTooltips.endermaskTooltip);
        tooltip.add(ModTooltips.piglinPassiveTooltip);

        if (!Config.Client.showTooltips.get()) {
            tooltip.remove(ModTooltips.endermaskTooltip);
            tooltip.remove(ModTooltips.piglinPassiveTooltip);
        } else {
            if (!pacifiesEndermen()) {
                tooltip.remove(ModTooltips.endermaskTooltip);
            }
            if (!pacifiesPiglins()) {
                tooltip.remove(ModTooltips.piglinPassiveTooltip);
            }
        }

        // Adds all the tooltips from add-ons
        if (Config.Client.showTooltips.get()) {
            addTooltips(stack, tooltip, flag);
        }
    }
}
