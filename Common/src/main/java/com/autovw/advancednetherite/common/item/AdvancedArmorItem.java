package com.autovw.advancednetherite.common.item;

import com.autovw.advancednetherite.api.annotation.Internal;
import com.autovw.advancednetherite.api.impl.IArmorMaterial;
import com.autovw.advancednetherite.common.AdvancedUtil;
import com.autovw.advancednetherite.config.ConfigHelper;
import com.autovw.advancednetherite.core.util.ModTags;
import com.autovw.advancednetherite.core.util.ModTooltips;
import net.minecraft.ChatFormatting;
import net.minecraft.client.Minecraft;
import net.minecraft.core.component.DataComponents;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.component.TooltipDisplay;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorType;
import net.minecraft.world.item.equipment.Equippable;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * @author Autovw
 */
public class AdvancedArmorItem extends Item implements IArmorMaterial
{
    private static Item.Properties armorProperties(ArmorMaterial material, ArmorType armorType, Properties properties)
    {
        return properties.durability(armorType.getDurability(AdvancedUtil.getArmorDurabilityMultiplier(material)))
                .attributes(material.createAttributes(armorType))
                .enchantable(material.enchantmentValue())
                .component(DataComponents.EQUIPPABLE, Equippable.builder(armorType.getSlot()).setEquipSound(material.equipSound()).setAsset(material.assetId()).build())
                .repairable(material.repairIngredient());
    }

    private final ArmorMaterial material;

    public AdvancedArmorItem(ArmorMaterial material, ArmorType armorType, Properties properties)
    {
        super(armorProperties(material, armorType, properties).fireResistant());
        this.material = material;
    }

    public boolean pacifiesEndermen(ItemStack stack)
    {
        return stack.is(ModTags.PACIFY_ENDERMEN_ARMOR);
    }

    public boolean pacifiesPiglins(ItemStack stack)
    {
        return stack.is(ModTags.PACIFY_PIGLINS_ARMOR);
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
     * Don't override this method, use: {@link AdvancedArmorItem#addTooltips(ItemStack, TooltipContext, TooltipDisplay, Consumer, TooltipFlag)} if you want to add your own custom tooltips.
     */
    @Internal
    @Override
    public void appendHoverText(ItemStack stack, TooltipContext context, TooltipDisplay display, Consumer<Component> tooltip, TooltipFlag flag)
    {
        if (ConfigHelper.get().getClient().showTooltips())
        {
            if (Minecraft.getInstance().hasShiftDown())
            {
                if (pacifiesEndermen(stack))
                    tooltip.accept(ModTooltips.ENDERMAN_PASSIVE_TOOLTIP);
                if (pacifiesPiglins(stack))
                    tooltip.accept(ModTooltips.PIGLIN_PASSIVE_TOOLTIP);
                if (pacifiesPhantoms(stack))
                    tooltip.accept(ModTooltips.PHANTOM_PASSIVE_TOOLTIP);
            }
            else
            {
                if (pacifiesEndermen(stack) || pacifiesPiglins(stack) || pacifiesPhantoms(stack))
                    tooltip.accept(ModTooltips.SHIFT_KEY_TOOLTIP);
            }

            // Adds all the tooltips from add-ons
            addTooltips(stack, context, display, tooltip, flag); // Add tooltips from add-ons
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

    @Override
    public ArmorMaterial getMaterial()
    {
        return this.material;
    }
}
