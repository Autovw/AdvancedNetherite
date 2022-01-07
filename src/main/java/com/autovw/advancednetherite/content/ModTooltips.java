package com.autovw.advancednetherite.content;

import com.autovw.advancednetherite.Reference;
import com.autovw.advancednetherite.api.Tooltips;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.TranslatableComponent;

/**
 * Author: Autovw
 * <br>
 * A class that contains tooltips registered by Advanced Netherite.
 */
public class ModTooltips {

    // Endermask Tooltip
    public static final TranslatableComponent endermaskTooltip = Tooltips.tooltip(Reference.MOD_ID, "endermask_armor.perk_one", ChatFormatting.DARK_GREEN);

    // Piglin Passive Tooltip
    public static final TranslatableComponent piglinPassiveTooltip = Tooltips.tooltip(Reference.MOD_ID, "piglinpassive_armor.perk_one", ChatFormatting.GOLD);
}
