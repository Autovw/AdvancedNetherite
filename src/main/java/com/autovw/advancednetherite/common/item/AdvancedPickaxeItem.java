package com.autovw.advancednetherite.common.item;

import com.autovw.advancednetherite.config.Config;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

import javax.annotation.Nullable;
import java.util.List;

/**
 * Author: Autovw
 */
public class AdvancedPickaxeItem extends PickaxeItem {
    public AdvancedPickaxeItem(Tier tier, int attackDamage, float attackSpeed, Properties properties) {
        super(tier, attackDamage, attackSpeed, properties);
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
     * {@link Override} this method if you want to add your own custom tooltips.
     *
     * @param stack The item stack
     * @param tooltip Collection of tooltips
     * @param flag Tooltip flag. Used to determine if a tooltip is only visible when debug mode (F3 + H) is enabled.
     */
    public void addTooltips(ItemStack stack, List<Component> tooltip, TooltipFlag flag) {}

    /**
     * Don't override this method, use {@link AdvancedPickaxeItem#addTooltips(ItemStack, List, TooltipFlag)} if you want to add your own custom tooltips.
     */
    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level world, List<Component> tooltip, TooltipFlag flag) {
        if (Config.Client.showTooltips.get()) {
            addTooltips(stack, tooltip, flag);
        }
    }
}
