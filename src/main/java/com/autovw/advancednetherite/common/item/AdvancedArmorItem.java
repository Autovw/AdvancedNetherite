package com.autovw.advancednetherite.common.item;

import com.autovw.advancednetherite.config.Config;
import com.autovw.advancednetherite.content.ModTooltips;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.LivingEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Objects;

/**
 * Author: Autovw
 */
public class AdvancedArmorItem extends ArmorItem {
    public AdvancedArmorItem(IArmorMaterial material, EquipmentSlotType equipmentSlot, Properties properties) {
        super(material, equipmentSlot, properties);
    }

    /**
     * {@link Override} this method if you want endermen to behave neutral towards the player when wearing the armor.
     *
     * @return If true, pacifies endermen. Also applies the tooltip.
     */
    public boolean pacifiesEndermen() {
        return false;
    }

    /**
     * {@link Override} this method if you want piglins to behave neutral towards the player when wearing the armor.
     *
     * @return If true, pacifies piglins. Also applies the tooltip.
     */
    public boolean pacifiesPiglins() {
        return false;
    }

    /**
     * Netherite items do not burn by default.
     * {@link Override} if you want to disable this feature.
     *
     * @return If true, item does not burn when on fire
     */
    @Override
    public boolean isFireResistant() {
        return true;
    }

    /**
     * Don't override this method, use: {@link AdvancedArmorItem#pacifiesPiglins()}
     */
    @Override
    public boolean makesPiglinsNeutral(ItemStack stack, LivingEntity wearer) {
        return pacifiesPiglins();
    }

    /**
     * {@link Override} this method if you want to add your own custom tooltips.
     *
     * @param stack The item stack
     * @param tooltip Collection of tooltips
     * @param flag Tooltip flag. Used to determine if a tooltip is only visible when debug mode (F3 + H) is enabled.
     */
    public void addTooltips(ItemStack stack, List<ITextComponent> tooltip, ITooltipFlag flag) {}

    /**
     * Don't override this method, use: {@link AdvancedArmorItem#addTooltips(ItemStack, List, ITooltipFlag)} if you want to add your own custom tooltips.
     */
    @Override
    public void appendHoverText(ItemStack stack, @Nullable World world, List<ITextComponent> tooltip, ITooltipFlag flag) {
        tooltip.add(ModTooltips.endermaskTooltip);
        tooltip.add(ModTooltips.piglinPassiveTooltip);

        if (!Config.Client.showTooltips.get()) {
            tooltip.remove(ModTooltips.endermaskTooltip);
            tooltip.remove(ModTooltips.piglinPassiveTooltip);
        } else {
            if (!pacifiesEndermen()) {
                tooltip.remove(ModTooltips.endermaskTooltip);
            }
            if (!pacifiesPiglins()) {
                tooltip.remove(ModTooltips.piglinPassiveTooltip);
            }
        }

        // Adds all the tooltips from add-ons
        if (Config.Client.showTooltips.get()) {
            addTooltips(stack, tooltip, flag);
        }
    }

    /**
     * {@link Override} this method if you want to give your item a custom durability bar color.
     * Feature is disabled by default, can be enabled in Advanced Netherite's Client config.
     *
     * @param stack The item stack
     * @return The custom durability bar color
     */
    public TextFormatting customDurabilityBarColor(ItemStack stack) {
        return null;
    }

    /**
     * Don't override this method, use {@link AdvancedArmorItem#customDurabilityBarColor(ItemStack)} to change the custom durability bar color.
     */
    @Override
    public int getRGBDurabilityForDisplay(ItemStack stack) {
        return customDurabilityBarColor(stack) != null && Config.Client.matchingDurabilityBars.get() ? Objects.requireNonNull(customDurabilityBarColor(stack).getColor()) : super.getRGBDurabilityForDisplay(stack);
    }
}
