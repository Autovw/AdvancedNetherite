package com.autovw.advancednetherite.common.item;

import com.autovw.advancednetherite.api.annotation.Internal;
import com.autovw.advancednetherite.common.AdvancedUtil;
import com.autovw.advancednetherite.config.ConfigHelper;
import com.autovw.advancednetherite.core.util.ModArmorMaterials;
import com.autovw.advancednetherite.core.util.ModTags;
import com.autovw.advancednetherite.core.util.ModTooltips;
import net.minecraft.ChatFormatting;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.core.Holder;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;

import java.util.List;
import java.util.Objects;

/**
 * @author Autovw
 */
public class AdvancedArmorItem extends ArmorItem
{
    private final Holder<ArmorMaterial> material;

    public AdvancedArmorItem(Holder<ArmorMaterial> material, ArmorItem.Type armorType, Properties properties)
    {
        super(material, armorType, properties);
        this.material = material;
    }

    @Internal
    public AdvancedArmorItem(Holder<ArmorMaterial> material, ArmorItem.Type armorType)
    {
        this(material, armorType, new Properties().durability(armorType.getDurability(AdvancedUtil.getArmorDurabilityMultiplier(material))).fireResistant());
    }

    /**
     * Use {@link #pacifiesEndermen(ItemStack)}
     */
    @Deprecated(forRemoval = true, since = "2.2.0")
    public boolean pacifiesEndermen()
    {
        return false;
    }

    public boolean pacifiesEndermen(ItemStack stack)
    {
        return stack.is(ModTags.PACIFY_ENDERMEN_ARMOR);
    }

    /**
     * Use {@link #pacifiesPiglins(ItemStack)}
     */
    @Deprecated(forRemoval = true, since = "2.2.0")
    public boolean pacifiesPiglins()
    {
        return false;
    }

    public boolean pacifiesPiglins(ItemStack stack)
    {
        return stack.is(ModTags.PACIFY_PIGLINS_ARMOR);
    }

    /**
     * Use {@link #pacifiesPhantoms(ItemStack)}
     */
    @Deprecated(forRemoval = true, since = "2.2.0")
    public boolean pacifiesPhantoms()
    {
        return false;
    }

    public boolean pacifiesPhantoms(ItemStack stack)
    {
        return stack.is(ModTags.PACIFY_PHANTOMS_ARMOR);
    }

    /**
     * {@link Override} this method if you want to add your own custom tooltips.
     *
     * @param stack     The item stack
     * @param context   The tooltip context
     * @param tooltips  List of tooltips
     * @param flag      Used to determine if a tooltip is only visible when debug mode (F3 + H) is enabled
     */
    public void addTooltips(ItemStack stack, TooltipContext context, List<Component> tooltips, TooltipFlag flag)
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
     * Don't override this method, use: {@link AdvancedArmorItem#addTooltips(ItemStack, TooltipContext, List, TooltipFlag)} if you want to add your own custom tooltips.
     */
    @Internal
    @Override
    public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltip, TooltipFlag flag)
    {
        if (ConfigHelper.get().getClient().showTooltips())
        {
            if (Screen.hasShiftDown())
            {
                if (pacifiesEndermen(stack))
                    tooltip.add(ModTooltips.ENDERMAN_PASSIVE_TOOLTIP);
                if (pacifiesPiglins(stack))
                    tooltip.add(ModTooltips.PIGLIN_PASSIVE_TOOLTIP);
                if (pacifiesPhantoms(stack))
                    tooltip.add(ModTooltips.PHANTOM_PASSIVE_TOOLTIP);
            }
            else
            {
                if (pacifiesEndermen(stack) || pacifiesPiglins(stack) || pacifiesPhantoms(stack))
                    tooltip.add(ModTooltips.SHIFT_KEY_TOOLTIP);
            }

            // Adds all the tooltips from add-ons
            addTooltips(stack, context, tooltip, flag); // Add tooltips from add-ons
        }
    }

    /**
     * Don't override this method, use {@link AdvancedArmorItem#customDurabilityBarColor(ItemStack)} to change the custom durability bar color.
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
}
