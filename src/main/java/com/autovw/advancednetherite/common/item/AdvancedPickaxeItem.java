package com.autovw.advancednetherite.common.item;

import com.autovw.advancednetherite.Reference;
import com.autovw.advancednetherite.config.Config;
import com.autovw.advancednetherite.content.ModTooltips;
import com.autovw.advancednetherite.core.ModToolTiers;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.PickaxeItem;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Objects;

/**
 * Author: Autovw
 */
public class AdvancedPickaxeItem extends PickaxeItem {
    private final IItemTier tier;

    public AdvancedPickaxeItem(IItemTier tier, int attackDamage, float attackSpeed, Properties properties) {
        super(tier, attackDamage, attackSpeed, properties);
        this.tier = tier;
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
     * Don't override this method, use {@link AdvancedPickaxeItem#addTooltips(ItemStack, List, ITooltipFlag)} if you want to add your own custom tooltips.
     */
    @Override
    public void appendHoverText(ItemStack stack, @Nullable World world, List<ITextComponent> tooltip, ITooltipFlag flag) {
        if (Config.Client.showTooltips.get()) {
            if (stack.getItem().getRegistryName().getNamespace().equals(Reference.MOD_ID) && Config.AdditionalDropsConfig.enableAdditionalOreDrops.get()) {
                if (Screen.hasShiftDown()) {
                    if (tier == ModToolTiers.NETHERITE_IRON) tooltip.add(ModTooltips.ironDropTooltip);
                    if (tier == ModToolTiers.NETHERITE_GOLD) tooltip.add(ModTooltips.goldDropTooltip);
                    if (tier == ModToolTiers.NETHERITE_EMERALD) tooltip.add(ModTooltips.emeraldDropTooltip);
                    if (tier == ModToolTiers.NETHERITE_DIAMOND) tooltip.add(ModTooltips.diamondDropTooltip);
                } else {
                    tooltip.add(ModTooltips.shiftKeyTooltip);
                }
            }

            addTooltips(stack, tooltip, flag); // Add tooltips from add-ons
        }
    }

    /**
     * Don't override this method, use {@link AdvancedPickaxeItem#customDurabilityBarColor(ItemStack)} to change the custom durability bar color.
     */
    @Override
    public int getRGBDurabilityForDisplay(ItemStack stack) {
        if (Config.Client.matchingDurabilityBars.get()) {
            if (tier == ModToolTiers.NETHERITE_IRON) {
                return Objects.requireNonNull(TextFormatting.GRAY.getColor());
            }
            if (tier == ModToolTiers.NETHERITE_GOLD) {
                return Objects.requireNonNull(TextFormatting.GOLD.getColor());
            }
            if (tier == ModToolTiers.NETHERITE_EMERALD) {
                return Objects.requireNonNull(TextFormatting.DARK_GREEN.getColor());
            }
            if (tier == ModToolTiers.NETHERITE_DIAMOND) {
                return Objects.requireNonNull(TextFormatting.AQUA.getColor());
            }
        }

        return customDurabilityBarColor(stack) != null && Config.Client.matchingDurabilityBars.get() ? Objects.requireNonNull(customDurabilityBarColor(stack).getColor()) : super.getRGBDurabilityForDisplay(stack);
    }
}
