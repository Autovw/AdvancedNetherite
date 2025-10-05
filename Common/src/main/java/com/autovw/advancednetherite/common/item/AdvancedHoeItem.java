package com.autovw.advancednetherite.common.item;

import com.autovw.advancednetherite.api.annotation.Internal;
import com.autovw.advancednetherite.api.impl.IToolMaterial;
import com.autovw.advancednetherite.common.AdvancedUtil;
import com.autovw.advancednetherite.config.ConfigHelper;
import com.autovw.advancednetherite.core.util.ModTags;
import com.autovw.advancednetherite.core.util.ModTooltips;
import net.minecraft.ChatFormatting;
import net.minecraft.client.Minecraft;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.component.TooltipDisplay;
import net.minecraft.world.level.block.state.BlockState;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * @author Autovw
 */
public class AdvancedHoeItem extends HoeItem implements IToolMaterial
{
    private final ToolMaterial material;

    public AdvancedHoeItem(ToolMaterial material, float attackDamage, float attackSpeed, Properties properties)
    {
        super(material, attackDamage, attackSpeed, properties.fireResistant());
        this.material = material;
    }

    /**
     * {@link Override} this method if you want to add your own custom tooltips.
     *
     * @param stack     The item stack
     * @param context     The tooltip context
     * @param tooltips  List of tooltips
     * @param flag      Used to determine if a tooltip is only visible when debug mode (F3 + H) is enabled
     */
    public void addTooltips(ItemStack stack, TooltipContext context, TooltipDisplay display, Consumer<Component> tooltips, TooltipFlag flag)
    {
    }

    /**
     * {@link Override} this method if you want to give your item a custom durability bar color.
     * Feature is disabled by default, can be enabled in Advanced Netherite's Client config.
     *
     * @param stack The item stack
     * @return The custom durability bar color
     */
    public ChatFormatting customDurabilityBarColor(ItemStack stack)
    {
        return null;
    }

    /* ================ INTERNAL, use alternatives linked in javadoc ================ */

    /**
     * Don't override this method, use {@link AdvancedHoeItem#addTooltips(ItemStack, TooltipContext, TooltipDisplay, Consumer, TooltipFlag)} if you want to add your own custom tooltips.
     */
    @Internal
    @Override
    public void appendHoverText(ItemStack stack, TooltipContext context, TooltipDisplay display, Consumer<Component> tooltip, TooltipFlag flag)
    {
        if (ConfigHelper.get().getClient().showTooltips())
        {
            if (stack.is(ModTags.DROPS_ADDITIONAL_CROPS) && ConfigHelper.get().getCommon().getAdditionalDrops().enableAdditionalCropDrops())
            {
                if (Minecraft.getInstance().hasShiftDown())
                {
                    tooltip.accept(ModTooltips.ADDITIONAL_CROP_DROPS_TOOLTIP);
                }
                else
                {
                    tooltip.accept(ModTooltips.SHIFT_KEY_TOOLTIP);
                }
            }

            addTooltips(stack, context, display, tooltip, flag); // Add tooltips from add-ons
        }
    }

    /**
     * Don't override this method, use {@link AdvancedHoeItem#customDurabilityBarColor(ItemStack)} to change the custom durability bar color.
     */
    @Internal
    @Override
    public int getBarColor(ItemStack stack)
    {
        int originalColor = super.getBarColor(stack);

        if (customDurabilityBarColor(stack) != null && ConfigHelper.get().getClient().matchingDurabilityBars())
        {
            return Objects.requireNonNull(customDurabilityBarColor(stack).getColor());
        }

        return AdvancedUtil.getDurabilityBarColor(originalColor, stack);
    }

    @Override
    public float getDestroySpeed(ItemStack stack, BlockState state)
    {
        float originalSpeed = super.getDestroySpeed(stack, state);
        return AdvancedUtil.getDestroySpeed(originalSpeed, stack, state);
    }

    @Override
    public ToolMaterial getMaterial()
    {
        return this.material;
    }

    @Override
    public Type getToolType()
    {
        return Type.HOE;
    }
}
