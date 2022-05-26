package com.autovw.advancednetherite.content;

import com.autovw.advancednetherite.Reference;
import com.autovw.advancednetherite.api.TooltipBuilder;
import com.autovw.advancednetherite.api.Tooltips;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.IFormattableTextComponent;
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
    /**
     * @deprecated use {@link #ENDERMAN_PASSIVE_TOOLTIP} instead
     */
    @Deprecated
    public static final TranslationTextComponent endermaskTooltip = Tooltips.tooltip(Reference.MOD_ID, "armor.enderman_passive", TextFormatting.DARK_GREEN);
    public static final IFormattableTextComponent ENDERMAN_PASSIVE_TOOLTIP = TooltipBuilder.create(new ResourceLocation(Reference.MOD_ID, "armor.enderman_passive")).withStyle(TextFormatting.DARK_GREEN);

    /**
     * @deprecated use {@link #PIGLIN_PASSIVE_TOOLTIP} instead
     */
    @Deprecated
    public static final TranslationTextComponent piglinPassiveTooltip = Tooltips.tooltip(Reference.MOD_ID, "armor.piglin_passive", TextFormatting.GOLD);
    public static final IFormattableTextComponent PIGLIN_PASSIVE_TOOLTIP = TooltipBuilder.create(new ResourceLocation(Reference.MOD_ID, "armor.piglin_passive")).withStyle(TextFormatting.GOLD);

    /**
     * @deprecated use {@link #PHANTOM_PASSIVE_TOOLTIP} instead
     */
    @Deprecated
    public static final TranslationTextComponent phantomPassiveTooltip = Tooltips.tooltip(Reference.MOD_ID, "armor.phantom_passive", TextFormatting.GRAY);
    public static final IFormattableTextComponent PHANTOM_PASSIVE_TOOLTIP = TooltipBuilder.create(new ResourceLocation(Reference.MOD_ID, "armor.phantom_passive")).withStyle(TextFormatting.GRAY);

    /* Tool related tooltips */
    // Hoes
    public static final IFormattableTextComponent ADDITIONAL_CROP_DROPS_TOOLTIP = TooltipBuilder.create(new ResourceLocation(Reference.MOD_ID, "hoe.additional_crop_drops"));

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
    /**
     * @deprecated use {@link #SHIFT_KEY_TOOLTIP} instead
     */
    @Deprecated
    public static final TranslationTextComponent shiftKeyTooltip = new TranslationTextComponent("tooltip." + Reference.MOD_ID + ".misc.press_shift_key", new TranslationTextComponent("tooltip." + Reference.MOD_ID + ".misc.shift").withStyle(TextFormatting.YELLOW));
    public static final IFormattableTextComponent SHIFT_KEY_TOOLTIP = TooltipBuilder.create(new ResourceLocation(Reference.MOD_ID, "misc.press_shift_key"), TooltipBuilder.create(new ResourceLocation(Reference.MOD_ID, "misc.shift")).withStyle(TextFormatting.YELLOW));
}
