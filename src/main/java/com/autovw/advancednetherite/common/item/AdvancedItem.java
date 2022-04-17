package com.autovw.advancednetherite.common.item;

import com.autovw.advancednetherite.config.Config;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Objects;

/**
 * Author: Autovw
 */
public class AdvancedItem extends Item {
    private final boolean isFireResistant;

    public AdvancedItem(Item.Properties properties) {
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
     * @param stack     The item stack
     * @param world     The world/level
     * @param tooltips  List of tooltips
     * @param flag      Used to determine if a tooltip is only visible when debug mode (F3 + H) is enabled
     */
    public void addTooltips(ItemStack stack, World world, List<ITextComponent> tooltips, ITooltipFlag flag) {
    }

    /**
     * Use {@link AdvancedItem#addTooltips(ItemStack, World, List, ITooltipFlag)} instead
     */
    @Deprecated
    public void addTooltips(ItemStack stack, List<ITextComponent> tooltip, ITooltipFlag flag) {
    }

    /**
     * {@link Override} this method if you want to give your item a custom durability bar color.
     * Feature is disabled by default, can be enabled in Advanced Netherite's Client config.
     *
     * @param stack The item stack
     * @return The custom durability bar color
     */
    @Nullable
    public TextFormatting customDurabilityBarColor(ItemStack stack) {
        return null;
    }

    /* ================ INTERNAL, use alternatives linked in javadoc ================ */

    /**
     * Don't override this method, use: {@link AdvancedItem#addTooltips(ItemStack, List, ITooltipFlag)} if you want to add your own custom tooltips.
     */
    @Override
    public void appendHoverText(ItemStack stack, @Nullable World world, List<ITextComponent> tooltip, ITooltipFlag flag) {
        if (Config.Client.showTooltips.get()) {
            addTooltips(stack, world, tooltip, flag); // Add tooltips from add-ons
            addTooltips(stack, tooltip, flag);
        }
    }

    /**
     * Don't override this method, use {@link AdvancedItem#customDurabilityBarColor(ItemStack)} to change the custom durability bar color.
     */
    @Override
    public int getRGBDurabilityForDisplay(ItemStack stack) {
        return customDurabilityBarColor(stack) != null && Config.Client.matchingDurabilityBars.get() ? Objects.requireNonNull(customDurabilityBarColor(stack).getColor()) : super.getRGBDurabilityForDisplay(stack);
    }
}
