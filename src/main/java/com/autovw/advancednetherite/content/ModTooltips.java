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

    /* Armor related tooltips */
    // Endermask Tooltip
    public static final TranslationTextComponent endermaskTooltip = Tooltips.tooltip(Reference.MOD_ID, "endermask_armor.perk_one", TextFormatting.DARK_GREEN);

    // Piglin Passive Tooltip
    public static final TranslationTextComponent piglinPassiveTooltip = Tooltips.tooltip(Reference.MOD_ID, "piglinpassive_armor.perk_one", TextFormatting.GOLD);

    // Phantom Passive Tooltip
    public static final TranslationTextComponent phantomPassiveTooltip = Tooltips.tooltip(Reference.MOD_ID, "phantompassive_armor.perk_one", TextFormatting.GRAY);

    /* Tool related tooltips */
    // Pickaxes
    public static final TranslationTextComponent diamondDropTooltip = Tooltips.tooltip(Reference.MOD_ID, "pickaxe.additional_diamond_drop", TextFormatting.AQUA);
    public static final TranslationTextComponent emeraldDropTooltip = Tooltips.tooltip(Reference.MOD_ID, "pickaxe.additional_emerald_drop", TextFormatting.DARK_GREEN);
    public static final TranslationTextComponent goldDropTooltip = Tooltips.tooltip(Reference.MOD_ID, "pickaxe.additional_gold_drop", TextFormatting.GOLD);
    public static final TranslationTextComponent ironDropTooltip = Tooltips.tooltip(Reference.MOD_ID, "pickaxe.additional_iron_drop", TextFormatting.GRAY);

    // Swords
    public static final TranslationTextComponent endermanMobDropTooltip = Tooltips.tooltip(Reference.MOD_ID, "sword.additional_enderman_mob_drop", TextFormatting.DARK_GREEN);
    public static final TranslationTextComponent piglinMobDropTooltip = Tooltips.tooltip(Reference.MOD_ID, "sword.additional_piglin_mob_drop", TextFormatting.GOLD);
    public static final TranslationTextComponent zombifiedPiglinMobDropTooltip = Tooltips.tooltip(Reference.MOD_ID, "sword.additional_zombified_piglin_mob_drop", TextFormatting.GOLD);
    public static final TranslationTextComponent phantomMobDropTooltip = Tooltips.tooltip(Reference.MOD_ID, "sword.additional_phantom_mob_drop", TextFormatting.GRAY);

    /* Misc */
    public static final TranslationTextComponent shiftKeyTooltip = new TranslationTextComponent("tooltip." + Reference.MOD_ID + ".misc.press_shift_key", new TranslationTextComponent("tooltip." + Reference.MOD_ID + ".misc.shift").withStyle(TextFormatting.YELLOW));
}
