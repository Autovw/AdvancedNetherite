package com.autovw.advancednetherite.content;

import com.autovw.advancednetherite.Reference;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.TranslatableComponent;

/**
 * Author: Autovw
 */
public class Tooltips {
    public static final String ID = "tooltip.";

    // Endermask Tooltip
    public static final TranslatableComponent endermaskTooltip = (TranslatableComponent) new TranslatableComponent(
            ID + Reference.MOD_ID + ".endermask_armor.perk_one").withStyle(ChatFormatting.DARK_GREEN);

    // Piglin Passive Tooltip
    public static final TranslatableComponent piglinPassiveTooltip = (TranslatableComponent) new TranslatableComponent(
            ID + Reference.MOD_ID + ".piglinpassive_armor.perk_one").withStyle(ChatFormatting.GOLD);
}