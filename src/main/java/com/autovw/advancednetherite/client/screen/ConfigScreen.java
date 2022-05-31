package com.autovw.advancednetherite.client.screen;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.gui.DialogTexts;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.util.IReorderingProcessor;
import net.minecraft.util.text.*;
import net.minecraft.util.text.event.ClickEvent;

import javax.annotation.Nullable;
import java.util.List;

/**
 * A config screen class which is displayed when Configured mod is not present
 * <br/>
 * Author: Autovw
 */
public class ConfigScreen extends Screen {
    private final ITextComponent modTitle;
    private final Screen parent;
    private final IFormattableTextComponent configured = new StringTextComponent("Configured").withStyle(TextFormatting.YELLOW);

    /**
     * @param title Title of the mod adding the screen
     * @param parent Parent screen
     */
    public ConfigScreen(ITextComponent title, Screen parent) {
        super(new TranslationTextComponent("fml.menu.mods.config").append(" / ").append(title));
        this.modTitle = title;
        this.parent = parent;
    }

    @Override
    protected void init() {
        // Configured button
        addButton(new Button(width / 2 - 155, height / 2 + 12, 150, 20, new TranslationTextComponent("config.advancednetherite.screen.button.install_configured", this.configured), button -> {
            this.handleComponentClicked(Style.EMPTY.withClickEvent(new ClickEvent(ClickEvent.Action.OPEN_URL, "https://www.curseforge.com/minecraft/mc-mods/configured")));
        }));

        // Instructions button
        addButton(new Button(width / 2 + 5, height / 2 + 12, 150, 20, new TranslationTextComponent("config.advancednetherite.screen.button.instructions"), button -> {
            if (getInstructionsUrl() != null) {
                this.handleComponentClicked(Style.EMPTY.withClickEvent(new ClickEvent(ClickEvent.Action.OPEN_URL, getInstructionsUrl())));
            }
        }){
            @Override
            public void renderButton(MatrixStack stack, int mouseX, int mouseY, float ticks) {
                super.renderButton(stack, mouseX, mouseY, ticks);

                if (getInstructionsUrl() == null) {
                    this.active = false;
                }
            }
        });

        // Back button
        addButton(new Button(width / 2 - 75, height - 29, 150, 20, DialogTexts.GUI_BACK, button -> {
            this.minecraft.setScreen(this.parent);
        }));
    }

    @Override
    public void render(MatrixStack stack, int mouseX, int mouseY, float ticks) {
        this.renderBackground(stack);
        drawCenteredString(stack, this.font, this.title, this.width / 2, 7, 0xFFFFFF);
        drawCenteredSplitString(stack, this.font, this.font.split(getDescriptionTop(), this.width), this.width / 2, 55, 0xFFFFFF);
        drawCenteredSplitString(stack, this.font, this.font.split(getDescriptionBottom(), this.width), this.width / 2, 90, 0xFFFFFF);
        super.render(stack, mouseX, mouseY, ticks);
    }

    /**
     * Allows for drawing text using {@link FontRenderer#split(ITextProperties, int)} as an alternative to <code>drawCenteredString</code> without having to worry about text not appearing on screen.
     * @param matrixStack Matrix stack
     * @param font Font used
     * @param reorderingProcessor The list provided by {@link FontRenderer#split(ITextProperties, int)}
     * @param x X-axis the text will appear on
     * @param y Y-axis the text will appear on
     * @param color Color of the text
     */
    public static void drawCenteredSplitString(MatrixStack matrixStack, FontRenderer font, List<IReorderingProcessor> reorderingProcessor, int x, int y, int color) {
        for (IReorderingProcessor sequence : reorderingProcessor) {
            font.drawShadow(matrixStack, sequence, (float) (x - font.width(sequence) / 2), y, color);
            y += font.lineHeight;
        }
    }

    /**
     * The top description component. {@link Override} to change.
     * @return Top description component
     */
    public ITextComponent getDescriptionTop() {
        return new TranslationTextComponent("config.advancednetherite.screen.description.top", this.configured, this.modTitle);
    }

    /**
     * The bottom description component. {@link Override} to change.
     * @return Bottom description component
     */
    public ITextComponent getDescriptionBottom() {
        return new TranslationTextComponent("config.advancednetherite.screen.description.bottom");
    }

    /**
     * The URL behind the instructions button. Return null to disable this button.
     * @return Instructions url
     */
    @Nullable
    public String getInstructionsUrl() {
        return "https://github.com/Autovw/AdvancedNetherite/wiki/Configuration";
    }
}
