package com.autovw.advancednetherite.content;

import com.autovw.advancednetherite.Reference;
import com.autovw.advancednetherite.api.AdvancedNetheriteAPI;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.TranslatableComponent;

/**
 * Author: Autovw
 */
public class ModTooltips {

    // Endermask Tooltip
    public static final TranslatableComponent endermaskText = AdvancedNetheriteAPI.tooltip(Reference.MOD_ID, "endermask_armor.perk_one", ChatFormatting.DARK_GREEN);
    public static final TranslatableComponent endermaskTooltip = AdvancedNetheriteAPI.appendingTooltip(Reference.MOD_ID, "endermask_armor.plus", ChatFormatting.DARK_GREEN, endermaskText);

    // Piglin Passive Tooltip
    public static final TranslatableComponent piglinPassiveText = AdvancedNetheriteAPI.tooltip(Reference.MOD_ID, "piglinpassive_armor.perk_one", ChatFormatting.GOLD);
    public static final TranslatableComponent piglinPassiveTooltip = AdvancedNetheriteAPI.appendingTooltip(Reference.MOD_ID, "piglinpassive_armor.plus", ChatFormatting.GOLD, piglinPassiveText);
}
