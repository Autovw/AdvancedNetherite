package com.autovw.advancednetherite.common.item;

import com.autovw.advancednetherite.config.Config;
import com.autovw.advancednetherite.content.ModTooltips;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Objects;

/**
 * Author: Autovw
 */
public class AdvancedArmorItem extends ArmorItem {
    public AdvancedArmorItem(ArmorMaterial material, EquipmentSlot equipmentSlot, Properties properties) {
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
     * {@link Override} this method if you want phantoms to behave neutral towards te player when the armor.
     *
     * @return If true, pacifies phantoms. Alo applies the tooltip.
     */
    public boolean pacifiesPhantoms() {
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
     * {@link Override} this method if you want to add your own custom tooltips.
     *
     * @param stack The item stack
     * @param tooltip Collection of tooltips
     * @param flag Tooltip flag. Used to determine if a tooltip is only visible when debug mode (F3 + H) is enabled.
     */
    public void addTooltips(ItemStack stack, List<Component> tooltip, TooltipFlag flag) {
    }

    /**
     * {@link Override} this method if you want to give your item a custom durability bar color.
     * Feature is disabled by default, can be enabled in Advanced Netherite's Client config.
     *
     * @param stack The item stack
     * @return The custom durability bar color
     */
    @Nullable
    public ChatFormatting customDurabilityBarColor(ItemStack stack) {
        return null;
    }

    /* ================ INTERNAL, use alternatives linked in javadoc ================ */

    /**
     * Don't override this method, use: {@link AdvancedArmorItem#pacifiesPiglins()}
     */
    @Override
    public boolean makesPiglinsNeutral(ItemStack stack, LivingEntity wearer) {
        return pacifiesPiglins();
    }

    /**
     * Don't override this method, use: {@link AdvancedArmorItem#addTooltips(ItemStack, List, TooltipFlag)} if you want to add your own custom tooltips.
     */
    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level world, List<Component> tooltip, TooltipFlag flag) {
        tooltip.add(ModTooltips.endermaskTooltip);
        tooltip.add(ModTooltips.piglinPassiveTooltip);
        tooltip.add(ModTooltips.phantomPassiveTooltip);

        if (!Config.Client.showTooltips.get()) {
            tooltip.remove(ModTooltips.endermaskTooltip);
            tooltip.remove(ModTooltips.piglinPassiveTooltip);
            tooltip.remove(ModTooltips.phantomPassiveTooltip);
        } else {
            if (!pacifiesEndermen()) {
                tooltip.remove(ModTooltips.endermaskTooltip);
            }
            if (!pacifiesPiglins()) {
                tooltip.remove(ModTooltips.piglinPassiveTooltip);
            }
            if (!pacifiesPhantoms()) {
                tooltip.remove(ModTooltips.phantomPassiveTooltip);
            }
        }

        // Adds all the tooltips from add-ons
        if (Config.Client.showTooltips.get()) {
            addTooltips(stack, tooltip, flag);
        }
    }

    /**
     * Don't override this method, use {@link AdvancedArmorItem#customDurabilityBarColor(ItemStack)} to change the custom durability bar color.
     */
    @Override
    public int getBarColor(ItemStack stack) {
        return customDurabilityBarColor(stack) != null && Config.Client.matchingDurabilityBars.get() ? Objects.requireNonNull(customDurabilityBarColor(stack).getColor()) : super.getBarColor(stack);
    }
}
