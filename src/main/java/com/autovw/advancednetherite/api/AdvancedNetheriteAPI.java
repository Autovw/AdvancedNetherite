package com.autovw.advancednetherite.api;

import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;

/**
 * Author: Autovw
 * <br>
 * The API is a work in progress, not final!
 */
public class AdvancedNetheriteAPI {

    /**
     * Use this method if you want to create a basic translatable tooltip, without any pre-set color/format, for your item.
     * Reference the tooltip in your lang file like this 'tooltip.examplemodid.example_name'.
     * <br>
     * Example tooltip: <br>
     * <code>
     *     public static final TranslationTextComponent example = AdvancedNetheriteAPI.tooltip(Reference.MOD_ID, "example_name");
     * </code>
     *
     * @param modId Enter your modId here
     * @param tooltipName The name of the tooltip
     * @return The tooltip
     */
    public static TranslationTextComponent tooltip(String modId, String tooltipName) {
        return new TranslationTextComponent("tooltip." + modId + "." + tooltipName);
    }

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
}
