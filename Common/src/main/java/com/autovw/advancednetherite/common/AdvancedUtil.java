package com.autovw.advancednetherite.common;

import com.autovw.advancednetherite.config.ConfigHelper;
import com.autovw.advancednetherite.core.util.ModArmorMaterials;
import com.autovw.advancednetherite.core.util.ModToolTiers;
import net.minecraft.ChatFormatting;
import net.minecraft.core.Holder;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.state.BlockState;

/**
 * @author Autovw
 */
public class AdvancedUtil
{
    /**
     * Helper method for getting the durability multiplier of an armor material
     * @param material The material to get the multiplier for
     * @return Durability multiplier for the appropriate armor material
     */
    public static int getArmorDurabilityMultiplier(Holder<ArmorMaterial> material)
    {
        if (material == ModArmorMaterials.NETHERITE_IRON)
            return 39;
        if (material == ModArmorMaterials.NETHERITE_GOLD)
            return 41;
        if (material == ModArmorMaterials.NETHERITE_EMERALD)
            return 43;
        if (material == ModArmorMaterials.NETHERITE_DIAMOND)
            return 47;
        return 0;
    }

    /**
     * Helper method for getting the appropriate durability bar color on tools
     * @param originalColor The original durability bar color
     * @param stack Tool stack
     * @return The appropriate bar color, based on tier and config settings
     */
    public static int getDurabilityBarColor(int originalColor, ItemStack stack)
    {
        int newColor = originalColor;

        if (ConfigHelper.get().getClient().matchingDurabilityBars())
        {
            // Tools
            if (stack.getItem() instanceof DiggerItem item)
            {
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
            if (stack.getItem() instanceof ArmorItem item)
            {
                Holder<ArmorMaterial> material = item.getMaterial();

                if (material == ModArmorMaterials.NETHERITE_IRON)
                    newColor = ChatFormatting.GRAY.getColor();
                if (material == ModArmorMaterials.NETHERITE_GOLD)
                    newColor = ChatFormatting.GOLD.getColor();
                if (material == ModArmorMaterials.NETHERITE_EMERALD)
                    newColor = ChatFormatting.DARK_GREEN.getColor();
                if (material == ModArmorMaterials.NETHERITE_DIAMOND)
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
    public static float getDestroySpeed(float originalSpeed, ItemStack stack, BlockState state)
    {
        float newSpeed = originalSpeed;

        if (stack.getItem() instanceof DiggerItem diggerItem)
        {
            Tier tier = diggerItem.getTier();

            if (diggerItem.isCorrectToolForDrops(stack, state))
            {
                if (tier == ModToolTiers.NETHERITE_IRON)
                    newSpeed *= ConfigHelper.get().getServer().getToolProperties().getIronBreakingSpeedMultiplier();
                if (tier == ModToolTiers.NETHERITE_GOLD)
                    newSpeed *= ConfigHelper.get().getServer().getToolProperties().getGoldBreakingSpeedMultiplier();
                if (tier == ModToolTiers.NETHERITE_EMERALD)
                    newSpeed *= ConfigHelper.get().getServer().getToolProperties().getEmeraldBreakingSpeedMultiplier();
                if (tier == ModToolTiers.NETHERITE_DIAMOND)
                    newSpeed *= ConfigHelper.get().getServer().getToolProperties().getDiamondBreakingSpeedMultiplier();
            }
        }

        return newSpeed;
    }
}
