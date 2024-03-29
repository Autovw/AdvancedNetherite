package com.autovw.advancednetherite.common.item;

import com.autovw.advancednetherite.api.annotation.Internal;
import com.autovw.advancednetherite.config.ConfigHelper;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;

import java.util.List;

/**
 * @author Autovw
 */
public class AdvancedBlockItem extends BlockItem
{
    private final boolean isFireResistant;

    public AdvancedBlockItem(Block block, Properties properties)
    {
        super(block, properties);
        this.isFireResistant = true;
    }

    public AdvancedBlockItem(Block block, Properties properties, boolean isFireResistant)
    {
        super(block, properties);
        this.isFireResistant = isFireResistant;
    }

    /**
     * Netherite items do not burn by default,
     * {@link Override} or use {@link AdvancedBlockItem#AdvancedBlockItem(Block, Properties, boolean)} to disable this feature.
     *
     * @return If true, item does not burn when on fire
     */
    @Override
    public boolean isFireResistant()
    {
        return this.isFireResistant;
    }

    /**
     * {@link Override} this method if you want to add your own custom tooltips.
     *
     * @param stack The item stack
     * @param world The world/level
     * @param tooltip Collection of tooltips
     * @param flag Tooltip flag. Used to determine if a tooltip is only visible when debug mode (F3 + H) is enabled.
     */
    public void addTooltips(ItemStack stack, Level world, List<Component> tooltip, TooltipFlag flag)
    {
    }

    /* ================ INTERNAL, use alternatives linked in javadoc ================ */

    /**
     * Don't override this method, use: {@link AdvancedBlockItem#addTooltips(ItemStack, Level, List, TooltipFlag)} if you want to add your own custom tooltips.
     */
    @Internal
    @Override
    public void appendHoverText(ItemStack stack, Level world, List<Component> tooltip, TooltipFlag flag)
    {
        if (ConfigHelper.get().getClient().showTooltips())
        {
            addTooltips(stack, world, tooltip, flag);
        }
    }
}
