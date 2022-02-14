package com.autovw.advancednetherite.common.item;

import com.autovw.advancednetherite.config.Config;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Objects;

/**
 * Author: Autovw
 */
public class AdvancedItem extends Item {
    private final boolean isFireResistant;

    public AdvancedItem(Properties properties) {
        super(properties);
        this.isFireResistant  = true;
    }

    public AdvancedItem(Properties properties, boolean isFireResistant) {
        super(properties);
        this.isFireResistant = isFireResistant;
    }

    /**
     * Netherite items do not burn by default,
     * {@link Override} or use {@link AdvancedItem#AdvancedItem(Properties, boolean)} to disable this feature.
     *
     * @return If true, item does not burn when on fire
     */
    @Override
    public boolean isFireResistant() {
        return this.isFireResistant;
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
     * Don't override this method, use: {@link AdvancedItem#addTooltips(ItemStack, List, TooltipFlag)} if you want to add your own custom tooltips.
     */
    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level world, List<Component> tooltip, TooltipFlag flag) {
        if (Config.Client.showTooltips.get()) {
            addTooltips(stack, tooltip, flag);
        }
    }

    /**
     * {@link Override} this method if you want to give your item a custom durability bar color.
     * Feature is disabled by default, can be enabled in Advanced Netherite's Client config.
     *
     * @param stack The item stack
     * @return The custom durability bar color
     */
    public ChatFormatting customDurabilityBarColor(ItemStack stack) {
        return null;
    }

    /**
     * Don't override this method, use {@link AdvancedItem#customDurabilityBarColor(ItemStack)} to change the custom durability bar color.
     */
    @Override
    public int getBarColor(ItemStack stack) {
        return customDurabilityBarColor(stack) != null && Config.Client.matchingDurabilityBars.get() ? Objects.requireNonNull(customDurabilityBarColor(stack).getColor()) : super.getBarColor(stack);
    }
}
