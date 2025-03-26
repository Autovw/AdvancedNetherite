package com.autovw.advancednetherite.client.screen;

import net.minecraft.ChatFormatting;
import net.minecraft.client.gui.Font;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.*;
import net.minecraft.util.FormattedCharSequence;

import java.net.URI;
import java.util.List;

/**
 * A config screen class which is displayed when Configured mod is not present
 * @author Autovw
 */
public class ConfigScreen extends Screen
{
    private final Component modTitle;
    private final Screen parent;
    private final MutableComponent configured = Component.literal("Configured").withStyle(ChatFormatting.YELLOW);

    /**
     * @param title Title of the mod adding the screen
     * @param parent Parent screen
     */
    public ConfigScreen(Component title, Screen parent)
    {
        super(Component.translatable("fml.menu.mods.config").append(" / ").append(title));
        this.modTitle = title;
        this.parent = parent;
    }

    @Override
    protected void init()
    {
        // Configured button
        addRenderableWidget(Button.builder(Component.translatable("config.advancednetherite.screen.button.install_configured", this.configured), onPress -> {
            this.handleComponentClicked(Style.EMPTY.withClickEvent(new ClickEvent.OpenUrl(URI.create("https://www.curseforge.com/minecraft/mc-mods/configured"))));
        }).pos(width / 2 - 155, height / 2 + 12).size(150, 20).build());

        // Instructions button
        Button instructionsButton = Button.builder(Component.translatable("config.advancednetherite.screen.button.instructions"), onPress -> {
            if (getInstructionsUrl() != null)
            {
                this.handleComponentClicked(Style.EMPTY.withClickEvent(new ClickEvent.OpenUrl(getInstructionsUrl())));
            }
        }).pos(width / 2 + 5, height / 2 + 12).size(150, 20).build();

        if (getInstructionsUrl() == null)
            instructionsButton.active = false;

        addRenderableWidget(instructionsButton);

        // Back button
        addRenderableWidget(Button.builder(CommonComponents.GUI_BACK, onPress -> {
            this.minecraft.setScreen(this.parent);
        }).pos(width / 2 - 75, height - 29).size(150, 20).build());
    }

    @Override
    public void render(GuiGraphics graphics, int mouseX, int mouseY, float ticks)
    {
        this.renderBackground(graphics, mouseX, mouseY, ticks);
        super.render(graphics, mouseX, mouseY, ticks);
        graphics.drawCenteredString(this.font, this.title, this.width / 2, 7, 0xFFFFFF);
        drawCenteredSplitString(graphics, this.font, this.font.split(getDescriptionTop(), this.width), this.width / 2, 55, 0xFFFFFF);
        drawCenteredSplitString(graphics, this.font, this.font.split(getDescriptionBottom(), this.width), this.width / 2, 90, 0xFFFFFF);
    }

    /**
     * Allows for drawing text using {@link Font#split(FormattedText, int)} as an alternative to <code>drawCenteredString</code> without having to worry about text not appearing on screen.
     * @param graphics Graphics utility
     * @param font Font used
     * @param charSequenceList The list provided by {@link Font#split(FormattedText, int)}
     * @param x X-axis the text will appear on
     * @param y Y-axis the text will appear on
     * @param color Color of the text
     */
    public static void drawCenteredSplitString(GuiGraphics graphics, Font font, List<FormattedCharSequence> charSequenceList, int x, int y, int color)
    {
        for (FormattedCharSequence sequence : charSequenceList)
        {
            graphics.drawCenteredString(font, sequence, x, y, color);
            y += font.lineHeight;
        }
    }

    /**
     * The top description component. {@link Override} to change.
     * @return Top description component
     */
    public Component getDescriptionTop()
    {
        return Component.translatable("config.advancednetherite.screen.description.top", this.configured, this.modTitle);
    }

    /**
     * The bottom description component. {@link Override} to change.
     * @return Bottom description component
     */
    public Component getDescriptionBottom()
    {
        return Component.translatable("config.advancednetherite.screen.description.bottom");
    }

    /**
     * The URL behind the instructions button. Return null to disable this button.
     * @return Instructions url
     */
    public URI getInstructionsUrl()
    {
        return URI.create("https://github.com/Autovw/AdvancedNetherite/wiki/Configuration");
    }
}
