package com.autovw.advancednetherite.common;

import com.autovw.advancednetherite.config.Config;
import com.autovw.advancednetherite.core.util.ModArmorTiers;
import com.autovw.advancednetherite.core.util.ModToolTiers;
import net.minecraft.ChatFormatting;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.state.BlockState;

/**
 * @author Autovw
 */
public class AdvancedUtil {
    /**
     * Helper method for getting the appropriate durability bar color on tools
     * @param originalColor The original durability bar color
     * @param stack Tool stack
     * @return The appropriate bar color, based on tier and config settings
     */
    public static int getDurabilityBarColor(int originalColor, ItemStack stack) {
        int newColor = originalColor;

        if (Config.Client.matchingDurabilityBars.get()) {
            // Tools
            if (stack.getItem() instanceof DiggerItem item) {
                Tier tier = item.getTier();

                if (tier == ModToolTiers.NETHERITE_IRON)
                    newColor = ChatFormatting.GRAY.getColor();
                if (tier == ModToolTiers.NETHERITE_GOLD)
                    newColor = ChatFormatting.GOLD.getColor();
                if (tier == ModToolTiers.NETHERITE_EMERALD)
                    newColor = ChatFormatting.DARK_GREEN.getColor();
                if (tier == ModToolTiers.NETHERITE_DIAMOND)
                    newColor = ChatFormatting.AQUA.getColor();
            }

            // Armor
            if (stack.getItem() instanceof ArmorItem item) {
                ArmorMaterial material = item.getMaterial();

                if (material == ModArmorTiers.NETHERITE_IRON)
                    newColor = ChatFormatting.GRAY.getColor();
                if (material == ModArmorTiers.NETHERITE_GOLD)
                    newColor = ChatFormatting.GOLD.getColor();
                if (material == ModArmorTiers.NETHERITE_EMERALD)
                    newColor = ChatFormatting.DARK_GREEN.getColor();
                if (material == ModArmorTiers.NETHERITE_DIAMOND)
                    newColor = ChatFormatting.AQUA.getColor();
            }
        }

        return newColor;
    }

    /**
     * Helper method for applying the appropriate block destroy speed to tools
     * @param originalSpeed The original destroy speed
     * @param stack Tool stack
     * @param state State of block being broken
     * @return New destroy speed
     */
    public static float getDestroySpeed(float originalSpeed, ItemStack stack, BlockState state) {
        float newSpeed = originalSpeed;

        if (stack.getItem() instanceof DiggerItem diggerItem) {
            Tier tier = diggerItem.getTier();

            if (diggerItem.isCorrectToolForDrops(stack, state)) {
                if (tier == ModToolTiers.NETHERITE_IRON)
                    newSpeed *= Config.ToolProperties.ironBreakingSpeedMultiplier.get();
                if (tier == ModToolTiers.NETHERITE_GOLD)
                    newSpeed *= Config.ToolProperties.goldBreakingSpeedMultiplier.get();
                if (tier == ModToolTiers.NETHERITE_EMERALD)
                    newSpeed *= Config.ToolProperties.emeraldBreakingSpeedMultiplier.get();
                if (tier == ModToolTiers.NETHERITE_DIAMOND)
                    newSpeed *= Config.ToolProperties.diamondBreakingSpeedMultiplier.get();
            }
        }

        return newSpeed;
    }
}
