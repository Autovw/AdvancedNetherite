package com.autovw.advancednetherite.api;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.TranslatableComponent;

/**
 * Author: Autovw
 * <br>
 * The API is a work in progress, not final!
 */
public class Tooltips {

    /**
     * Use this method if you want to create a basic translatable tooltip, without any pre-set color/format, for your item.
     * Reference the tooltip in your lang file like this 'tooltip.examplemodid.example_name'.
     * <br>
     * Example tooltip: <br>
     * <code>
     *     public static final TranslatableComponent example = Tooltips.tooltip(Reference.MOD_ID, "example_name");
     * </code>
     *
     * @param modId Enter your modId here
     * @param tooltipName The name of the tooltip
     * @return The tooltip
     */
    public static TranslatableComponent tooltip(String modId, String tooltipName) {
        return new TranslatableComponent("tooltip." + modId + "." + tooltipName);
    }

    /**
     * Use this method if you want to create a translatable tooltip, with pre-set color, for your item.
     * Reference the tooltip in your lang file like this 'tooltip.examplemodid.example_name'.
     * <br>
     * Example tooltip: <br>
     * <code>
     *     public static final TranslatableComponent example = Tooltips.tooltip(Reference.MOD_ID, "example_name", ChatFormatting.PINK);
     * </code>
     *
     * @param modId Enter your modId here
     * @param tooltipName The name of the tooltip
     * @param tooltipColor The color of the tooltip
     * @return The tooltip
     */
    public static TranslatableComponent tooltip(String modId, String tooltipName, ChatFormatting tooltipColor) {
        return (TranslatableComponent) new TranslatableComponent("tooltip." + modId + "." + tooltipName).withStyle(tooltipColor);
    }

    /**
     * Use this method if you want to create a translatable tooltip, with pre-set color and format, for your item.
     * Reference the tooltip in your lang file like this 'tooltip.examplemodid.example_name'.
     * <br>
     * Example tooltip: <br>
     * <code>
     *     public static final TranslatableComponent example = Tooltips.tooltip(Reference.MOD_ID, "example_name", ChatFormatting.PINK, ChatFormatting.BOLD);
     * </code>
     *
     * @param modId Enter your modId here
     * @param tooltipName The name of the tooltip
     * @param tooltipColor The color of the tooltip
     * @param tooltipFormat The format of the tooltip, e.g. BOLD or STRIKETHROUGH
     * @return The tooltip
     */
    public static TranslatableComponent tooltip(String modId, String tooltipName, ChatFormatting tooltipColor, ChatFormatting tooltipFormat) {
        return (TranslatableComponent) new TranslatableComponent("tooltip." + modId + "." + tooltipName).withStyle(tooltipColor).withStyle(tooltipFormat);
    }
}
