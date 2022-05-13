package com.autovw.advancednetherite.content;

import com.autovw.advancednetherite.Reference;
import com.autovw.advancednetherite.api.TooltipBuilder;
import com.autovw.advancednetherite.api.Tooltips;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.resources.ResourceLocation;

/**
 * Author: Autovw
 * <br>
 * A class that contains tooltips registered by Advanced Netherite.
 */
public class ModTooltips {
    // TODO remove deprecated methods in MC 1.19

    /* Armor related tooltips */
    /**
     * @deprecated use {@link #ENDERMAN_PASSIVE_TOOLTIP} instead
     */
    @Deprecated
    public static final TranslatableComponent endermaskTooltip = Tooltips.tooltip(Reference.MOD_ID, "armor.enderman_passive", ChatFormatting.DARK_GREEN);
    public static final MutableComponent ENDERMAN_PASSIVE_TOOLTIP = TooltipBuilder.create(new ResourceLocation(Reference.MOD_ID, "armor.enderman_passive")).withStyle(ChatFormatting.DARK_GREEN);

    /**
     * @deprecated use {@link #PIGLIN_PASSIVE_TOOLTIP} instead
     */
    @Deprecated
    public static final TranslatableComponent piglinPassiveTooltip = Tooltips.tooltip(Reference.MOD_ID, "armor.piglin_passive", ChatFormatting.GOLD);
    public static final MutableComponent PIGLIN_PASSIVE_TOOLTIP = TooltipBuilder.create(new ResourceLocation(Reference.MOD_ID, "armor.piglin_passive")).withStyle(ChatFormatting.GOLD);

    /**
     * @deprecated use {@link #PHANTOM_PASSIVE_TOOLTIP} instead
     */
    @Deprecated
    public static final TranslatableComponent phantomPassiveTooltip = Tooltips.tooltip(Reference.MOD_ID, "armor.phantom_passive", ChatFormatting.GRAY);
    public static final MutableComponent PHANTOM_PASSIVE_TOOLTIP = TooltipBuilder.create(new ResourceLocation(Reference.MOD_ID, "armor.phantom_passive")).withStyle(ChatFormatting.GRAY);

    /* Tool related tooltips */
    // Pickaxes
    public static final TranslatableComponent diamondDropTooltip = Tooltips.tooltip(Reference.MOD_ID, "pickaxe.additional_diamond_drop", ChatFormatting.AQUA);
    public static final TranslatableComponent emeraldDropTooltip = Tooltips.tooltip(Reference.MOD_ID, "pickaxe.additional_emerald_drop", ChatFormatting.DARK_GREEN);
    public static final TranslatableComponent goldDropTooltip = Tooltips.tooltip(Reference.MOD_ID, "pickaxe.additional_gold_drop", ChatFormatting.GOLD);
    public static final TranslatableComponent ironDropTooltip = Tooltips.tooltip(Reference.MOD_ID, "pickaxe.additional_iron_drop", ChatFormatting.GRAY);

    // Swords
    public static final TranslatableComponent endermanMobDropTooltip = Tooltips.tooltip(Reference.MOD_ID, "sword.additional_enderman_mob_drop", ChatFormatting.DARK_GREEN);
    public static final TranslatableComponent piglinMobDropTooltip = Tooltips.tooltip(Reference.MOD_ID, "sword.additional_piglin_mob_drop", ChatFormatting.GOLD);
    public static final TranslatableComponent zombifiedPiglinMobDropTooltip = Tooltips.tooltip(Reference.MOD_ID, "sword.additional_zombified_piglin_mob_drop", ChatFormatting.GOLD);
    public static final TranslatableComponent phantomMobDropTooltip = Tooltips.tooltip(Reference.MOD_ID, "sword.additional_phantom_mob_drop", ChatFormatting.GRAY);

    /* Misc */
    /**
     * @deprecated use {@link #SHIFT_KEY_TOOLTIP} instead
     */
    @Deprecated
    public static final TranslatableComponent shiftKeyTooltip = new TranslatableComponent("tooltip." + Reference.MOD_ID + ".misc.press_shift_key", new TranslatableComponent("tooltip." + Reference.MOD_ID + ".misc.shift").withStyle(ChatFormatting.YELLOW));
    public static final MutableComponent SHIFT_KEY_TOOLTIP = TooltipBuilder.create(new ResourceLocation(Reference.MOD_ID, "misc.press_shift_key"), TooltipBuilder.create(new ResourceLocation(Reference.MOD_ID, "misc.shift")).withStyle(ChatFormatting.YELLOW));
}
