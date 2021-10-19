package com.autovw.advancednetherite.api;

import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;

/**
 * Author: Autovw
 * <br>
 * The API is a work in progress, not final!
 */
public class AdvancedNetheriteAPI {

    /**
     * Use this method if you want to create a translatable tooltip, with pre-set color, for your item.
     * Reference the tooltip in your lang file like this 'tooltip.examplemodid.example_name'.
     * <br>
     * Example tooltip: <br>
     * <code>
     *     public static final TranslationTextComponent example = AdvancedNetheriteAPI.tooltip(Reference.MOD_ID, "example_name", TextFormatting.PINK);
     * </code>
     *
     * @param modId Enter your modId here
     * @param tooltipName The name of the tooltip
     * @param tooltipColor The color of the tooltip
     * @return The tooltip
     */
    public static TranslationTextComponent tooltip(String modId, String tooltipName, TextFormatting tooltipColor) {
        return (TranslationTextComponent) new TranslationTextComponent("tooltip." + modId + "." + tooltipName).withStyle(tooltipColor);
    }

    /**
     * Use this method if you want to create a translatable tooltip, with pre-set color and format, for your item.
     * Reference the tooltip in your lang file like this 'tooltip.examplemodid.example_name'.
     * <br>
     * Example tooltip: <br>
     * <code>
     *     public static final TranslationTextComponent example = AdvancedNetheriteAPI.tooltip(Reference.MOD_ID, "example_name", TextFormatting.PINK, TextFormatting.BOLD);
     * </code>
     *
     * @param modId Enter your modId here
     * @param tooltipName The name of the tooltip
     * @param tooltipColor The color of the tooltip
     * @param tooltipFormat The format of the tooltip, e.g. BOLD or STRIKETHROUGH
     * @return The tooltip
     */
    public static TranslationTextComponent tooltip(String modId, String tooltipName, TextFormatting tooltipColor, TextFormatting tooltipFormat) {
        return (TranslationTextComponent) new TranslationTextComponent("tooltip." + modId + "." + tooltipName).withStyle(tooltipColor).withStyle(tooltipFormat);
    }

    /**
     * Use this method if you want to create a basic translatable tooltip, without any pre-set color/format, for your item.
     * Reference the tooltip in your lang file like this 'tooltip.examplemodid.example_name'.
     * <br>
     * Example tooltip: <br>
     * <code>
     *     public static final TranslationTextComponent example = AdvancedNetheriteAPI.basicTooltip(Reference.MOD_ID, "example_name");
     * </code>
     *
     * @param modId Enter your modId here
     * @param tooltipName The name of the tooltip
     * @return The tooltip
     */
    public static TranslationTextComponent basicTooltip(String modId, String tooltipName) {
        return new TranslationTextComponent("tooltip." + modId + "." + tooltipName);
    }

    /**
     * Use this method if you want to create a translatable tooltip, with pre-set color and already existing tooltip appending, for your item.
     * Reference the tooltip in your lang file like this 'tooltip.examplemodid.example_name'.
     * <br>
     * Example tooltip: <br>
     * <code>
     *     public static final TranslationTextComponent example = AdvancedNetheriteAPI.appendingTooltip(Reference.MOD_ID, "example_name", TextFormatting.PINK, otherTooltip);
     * </code>
     *
     * @param modId Enter your modId here
     * @param tooltipName The name of the tooltip
     * @param tooltipColor The color of the tooltip
     * @param appendingTooltip The appending tooltip
     * @return The tooltip
     */
    public static TranslationTextComponent appendingTooltip(String modId, String tooltipName, TextFormatting tooltipColor, ITextComponent appendingTooltip) {
        return (TranslationTextComponent) new TranslationTextComponent("tooltip." + modId + "." + tooltipName).withStyle(tooltipColor).append(" ").append(appendingTooltip);
    }

    /**
     * Use this method if you want to create a translatable tooltip, with pre-set color and format and already existing tooltip appending, for your item.
     * Reference the tooltip in your lang file like this 'tooltip.examplemodid.example_name'.
     * <br>
     * Example tooltip: <br>
     * <code>
     *     public static final TranslationTextComponent example = AdvancedNetheriteAPI.appendingTooltip(Reference.MOD_ID, "example_name", TextFormatting.PINK, TextFormatting.BOLD, otherTooltip);
     * </code>
     *
     * @param modId Enter your modId here
     * @param tooltipName The name of the tooltip
     * @param tooltipColor The color of the tooltip
     * @param tooltipFormat The format of the tooltip, e.g. BOLD or STRIKETHROUGH
     * @param appendingTooltip The appending tooltip
     * @return The tooltip
     */
    public static TranslationTextComponent appendingTooltip(String modId, String tooltipName, TextFormatting tooltipColor, TextFormatting tooltipFormat, ITextComponent appendingTooltip) {
        return (TranslationTextComponent) new TranslationTextComponent("tooltip." + modId + "." + tooltipName).withStyle(tooltipColor).withStyle(tooltipFormat).append(" ").append(appendingTooltip);
    }

    /**
     * Use this method if you want to create a translatable tooltip, without any pre-set color/format, for your item.
     * Reference the tooltip in your lang file like this 'tooltip.examplemodid.example_name'.
     * <br>
     * Example tooltip: <br>
     * <code>
     *     public static final TranslationTextComponent example = AdvancedNetheriteAPI.basicAppendingTooltip(Reference.MOD_ID, "example_name", otherTooltip);
     * </code>
     *
     * @param modId
     * @param tooltipName
     * @param appendingTooltip
     * @return The tooltip
     */
    public static TranslationTextComponent basicAppendingTooltip(String modId, String tooltipName, ITextComponent appendingTooltip) {
        return (TranslationTextComponent) new TranslationTextComponent("tooltip." + modId + "." + tooltipName).append(" ").append(appendingTooltip);
    }
}
