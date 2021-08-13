package com.autovw.advancednetherite.content;

import com.autovw.advancednetherite.Reference;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;

/**
 * Author: Autovw
 */
// This is where tooltips are stored
public class Tooltips {
    public static final String ID = "tooltip.";

    // Endermask Tooltip
    public static final TranslationTextComponent endermaskTooltip = (TranslationTextComponent) new
            TranslationTextComponent(ID + Reference.MOD_ID + ".endermask_armor.perk_one").withStyle(TextFormatting.DARK_GREEN);

    // Piglin Passive Tooltip
    public static final TranslationTextComponent piglinPassiveTooltip = (TranslationTextComponent) new TranslationTextComponent(
            ID + Reference.MOD_ID + ".piglinpassive_armor.perk_one").withStyle(TextFormatting.GOLD);
}