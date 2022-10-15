package com.autovw.advancednetherite.common.item;

import com.autovw.advancednetherite.Reference;
import com.autovw.advancednetherite.api.annotation.Internal;
import com.autovw.advancednetherite.config.Config;
import com.autovw.advancednetherite.core.util.ModTooltips;
import com.autovw.advancednetherite.core.util.ModToolTiers;
import net.minecraft.ChatFormatting;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.registries.ForgeRegistries;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Objects;

/**
 * @author Autovw
 */
public class AdvancedHoeItem extends HoeItem {
    private final Tier tier;

    public AdvancedHoeItem(Tier tier, int attackDamage, float attackSpeed, Properties properties) {
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
     * Don't override this method, use {@link AdvancedHoeItem#addTooltips(ItemStack, Level, List, TooltipFlag)} if you want to add your own custom tooltips.
     */
    @Internal
    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level world, List<Component> tooltip, TooltipFlag flag) {
        if (Config.Client.showTooltips.get()) {
            if (ForgeRegistries.ITEMS.getKey(stack.getItem()).getNamespace().equals(Reference.MOD_ID) && Config.AdditionalDropsConfig.enableAdditionalCropDrops.get()) {
                if (Screen.hasShiftDown()) {
                    tooltip.add(ModTooltips.ADDITIONAL_CROP_DROPS_TOOLTIP);
                } else {
                    tooltip.add(ModTooltips.SHIFT_KEY_TOOLTIP);
                }
            }

            addTooltips(stack, world, tooltip, flag); // Add tooltips from add-ons
        }
    }

    /**
     * Don't override this method, use {@link AdvancedHoeItem#customDurabilityBarColor(ItemStack)} to change the custom durability bar color.
     */
    @Internal
    @Override
    public int getBarColor(ItemStack stack) {
        if (Config.Client.matchingDurabilityBars.get()) {
            if (tier == ModToolTiers.NETHERITE_IRON) {
                return Objects.requireNonNull(ChatFormatting.GRAY.getColor());
            }
            if (tier == ModToolTiers.NETHERITE_GOLD) {
                return Objects.requireNonNull(ChatFormatting.GOLD.getColor());
            }
            if (tier == ModToolTiers.NETHERITE_EMERALD) {
                return Objects.requireNonNull(ChatFormatting.DARK_GREEN.getColor());
            }
            if (tier == ModToolTiers.NETHERITE_DIAMOND) {
                return Objects.requireNonNull(ChatFormatting.AQUA.getColor());
            }
        }

        return customDurabilityBarColor(stack) != null && Config.Client.matchingDurabilityBars.get() ? Objects.requireNonNull(customDurabilityBarColor(stack).getColor()) : super.getBarColor(stack);
    }

    @Override
    public float getDestroySpeed(ItemStack stack, BlockState state) {
        float speed = super.getDestroySpeed(stack, state);

        if (tier == ModToolTiers.NETHERITE_IRON)
            speed *= Config.ToolProperties.ironBreakingSpeedMultiplier.get();
        if (tier == ModToolTiers.NETHERITE_GOLD)
            speed *= Config.ToolProperties.goldBreakingSpeedMultiplier.get();
        if (tier == ModToolTiers.NETHERITE_EMERALD)
            speed *= Config.ToolProperties.emeraldBreakingSpeedMultiplier.get();
        if (tier == ModToolTiers.NETHERITE_DIAMOND)
            speed *= Config.ToolProperties.diamondBreakingSpeedMultiplier.get();

        return speed;
    }
}
