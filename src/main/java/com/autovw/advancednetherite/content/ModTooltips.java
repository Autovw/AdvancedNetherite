package com.autovw.advancednetherite.content;

import com.autovw.advancednetherite.Reference;
import com.autovw.advancednetherite.api.Tooltips;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;

/**
 * Author: Autovw
 * <br>
 * A class that contains tooltips registered by Advanced Netherite.
 */
// This is where tooltips are stored
public class ModTooltips {

    // Endermask Tooltip
    public static final TranslationTextComponent endermaskTooltip = Tooltips.tooltip(Reference.MOD_ID, "endermask_armor.perk_one", TextFormatting.DARK_GREEN);

    // Piglin Passive Tooltip
    public static final TranslationTextComponent piglinPassiveTooltip = Tooltips.tooltip(Reference.MOD_ID, "piglinpassive_armor.perk_one", TextFormatting.GOLD);

    // Phantom Passive Tooltip
    public static final TranslationTextComponent phantomPassiveTooltip = Tooltips.tooltip(Reference.MOD_ID, "phantompassive_armor.perk_one", TextFormatting.GRAY);
}
