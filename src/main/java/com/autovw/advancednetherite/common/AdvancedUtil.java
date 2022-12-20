package com.autovw.advancednetherite.common;

import com.autovw.advancednetherite.config.Config;
import com.autovw.advancednetherite.core.util.ModToolTiers;
import net.minecraft.world.item.DiggerItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;
import net.minecraft.world.level.block.state.BlockState;

/**
 * @author Autovw
 */
public class AdvancedUtil {
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
