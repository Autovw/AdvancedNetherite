package com.autovw.advancednetherite.common.item;

import com.autovw.advancednetherite.api.annotation.Internal;
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
     * @param stack     The item stack
     * @param world     The world/level
     * @param tooltips  List of tooltips
     * @param flag      Used to determine if a tooltip is only visible when debug mode (F3 + H) is enabled
     */
    public void addTooltips(ItemStack stack, World world, List<ITextComponent> tooltips, ITooltipFlag flag) {
    }

    /**
     * Use {@link AdvancedArmorItem#addTooltips(ItemStack, World, List, ITooltipFlag)} instead
     */
    @Deprecated
    public void addTooltips(ItemStack stack, List<ITextComponent> tooltip, ITooltipFlag flag) {
    }

    /**
     * {@link Override} this method if you want to give your item a custom durability bar color.
     * Feature is disabled by default, can be enabled in Advanced Netherite's Client config.
     *
     * @param stack The item stack
     * @return The custom durability bar color
     */
    @Nullable
    public TextFormatting customDurabilityBarColor(ItemStack stack) {
        return null;
    }

    /* ================ INTERNAL, use alternatives linked in javadoc ================ */

    /**
     * Don't override this method, use: {@link AdvancedArmorItem#pacifiesPiglins()}
     */
    @Internal
    @Override
    public boolean makesPiglinsNeutral(ItemStack stack, LivingEntity wearer) {
        return pacifiesPiglins();
    }

    /**
     * Don't override this method, use: {@link AdvancedArmorItem#addTooltips(ItemStack, List, ITooltipFlag)} if you want to add your own custom tooltips.
     */
    @Internal
    @Override
    public void appendHoverText(ItemStack stack, @Nullable World world, List<ITextComponent> tooltip, ITooltipFlag flag) {
        if (Config.Client.showTooltips.get()) {
            if (pacifiesEndermen()) tooltip.add(ModTooltips.ENDERMAN_PASSIVE_TOOLTIP);
            if (pacifiesPiglins()) tooltip.add(ModTooltips.PIGLIN_PASSIVE_TOOLTIP);
            if (pacifiesPhantoms()) tooltip.add(ModTooltips.PHANTOM_PASSIVE_TOOLTIP);

            // Adds all the tooltips from add-ons
            addTooltips(stack, world, tooltip, flag); // Add tooltips from add-ons
            addTooltips(stack, tooltip, flag);
        }
    }

    /**
     * Don't override this method, use {@link AdvancedArmorItem#customDurabilityBarColor(ItemStack)} to change the custom durability bar color.
     */
    @Internal
    @Override
    public int getRGBDurabilityForDisplay(ItemStack stack) {
        return customDurabilityBarColor(stack) != null && Config.Client.matchingDurabilityBars.get() ? Objects.requireNonNull(customDurabilityBarColor(stack).getColor()) : super.getRGBDurabilityForDisplay(stack);
    }
}
