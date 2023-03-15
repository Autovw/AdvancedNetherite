package com.autovw.advancednetherite.common.item;

import com.autovw.advancednetherite.Reference;
import com.autovw.advancednetherite.api.annotation.Internal;
import com.autovw.advancednetherite.common.AdvancedUtil;
import com.autovw.advancednetherite.config.Config;
import com.autovw.advancednetherite.content.ModTooltips;
import com.autovw.advancednetherite.core.ModToolTiers;
import net.minecraft.ChatFormatting;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Objects;

/**
 * @author Autovw
 */
public class AdvancedPickaxeItem extends PickaxeItem {
    private final Tier tier;

    public AdvancedPickaxeItem(Tier tier, int attackDamage, float attackSpeed, Properties properties) {
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
     * @param stack     The item stack
     * @param level     The world/level
     * @param tooltips  List of tooltips
     * @param flag      Used to determine if a tooltip is only visible when debug mode (F3 + H) is enabled
     */
    public void addTooltips(ItemStack stack, Level level, List<Component> tooltips, TooltipFlag flag) {
    }

    /**
     * Use {@link AdvancedPickaxeItem#addTooltips(ItemStack, Level, List, TooltipFlag)} instead
     */
    @Deprecated(forRemoval = true, since = "1.11.0") // TODO remove in MC 1.19
    public void addTooltips(ItemStack stack, List<Component> tooltip, TooltipFlag flag) {
    }

    /**
     * {@link Override} this method if you want to give your item a custom durability bar color.
     * Feature is disabled by default, can be enabled in Advanced Netherite's Client config.
     *
     * @param stack The item stack
     * @return The custom durability bar color
     */
    @Nullable
    public ChatFormatting customDurabilityBarColor(ItemStack stack) {
        return null;
    }

    /* ================ INTERNAL, use alternatives linked in javadoc ================ */

    /**
     * Don't override this method, use {@link AdvancedPickaxeItem#addTooltips(ItemStack, List, TooltipFlag)} if you want to add your own custom tooltips.
     */
    @Internal
    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level world, List<Component> tooltip, TooltipFlag flag) {
        if (Config.Client.showTooltips.get()) {
            if (stack.getItem().getRegistryName().getNamespace().equals(Reference.MOD_ID) && Config.AdditionalDropsConfig.enableAdditionalOreDrops.get()) {
                if (Screen.hasShiftDown()) {
                    if (tier == ModToolTiers.NETHERITE_IRON) tooltip.add(ModTooltips.ironDropTooltip);
                    if (tier == ModToolTiers.NETHERITE_GOLD) tooltip.add(ModTooltips.goldDropTooltip);
                    if (tier == ModToolTiers.NETHERITE_EMERALD) tooltip.add(ModTooltips.emeraldDropTooltip);
                    if (tier == ModToolTiers.NETHERITE_DIAMOND) tooltip.add(ModTooltips.diamondDropTooltip);
                } else {
                    tooltip.add(ModTooltips.SHIFT_KEY_TOOLTIP);
                }
            }

            addTooltips(stack, world, tooltip, flag); // Add tooltips from add-ons
            addTooltips(stack, tooltip, flag); // TODO remove in MC 1.19
        }
    }

    /**
     * Don't override this method, use {@link AdvancedPickaxeItem#customDurabilityBarColor(ItemStack)} to change the custom durability bar color.
     */
    @Internal
    @Override
    public int getBarColor(ItemStack stack) {
        int originalColor = super.getBarColor(stack);

        if (customDurabilityBarColor(stack) != null && Config.Client.matchingDurabilityBars.get()) {
            return Objects.requireNonNull(customDurabilityBarColor(stack).getColor());
        }

        return AdvancedUtil.getDurabilityBarColor(originalColor, stack);
    }

    @Override
    public float getDestroySpeed(ItemStack stack, BlockState state) {
        float originalSpeed = super.getDestroySpeed(stack, state);
        return AdvancedUtil.getDestroySpeed(originalSpeed, stack, state);
    }
}
