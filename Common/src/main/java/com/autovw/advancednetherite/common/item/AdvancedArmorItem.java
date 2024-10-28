package com.autovw.advancednetherite.common.item;

import com.autovw.advancednetherite.api.annotation.Internal;
import com.autovw.advancednetherite.api.impl.IArmorMaterial;
import com.autovw.advancednetherite.common.AdvancedUtil;
import com.autovw.advancednetherite.config.ConfigHelper;
import com.autovw.advancednetherite.core.util.ModArmorMaterials;
import com.autovw.advancednetherite.core.util.ModTooltips;
import net.minecraft.ChatFormatting;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorType;

import java.util.List;
import java.util.Objects;

/**
 * @author Autovw
 */
public class AdvancedArmorItem extends ArmorItem implements IArmorMaterial
{
    private final ArmorMaterial material;

    public AdvancedArmorItem(ArmorMaterial material, ArmorType armorType, Properties properties)
    {
        super(material, armorType, properties.durability(armorType.getDurability(AdvancedUtil.getArmorDurabilityMultiplier(material))).fireResistant());
        this.material = material;
    }

    /**
     * {@link Override} this method if you want endermen to behave neutral towards the player when wearing the armor.
     *
     * @return If true, pacifies endermen. Also applies the tooltip.
     */
    public boolean pacifiesEndermen()
    {
        if (this.isMaterial(ModArmorMaterials.NETHERITE_IRON))
            return ConfigHelper.get().getCommon().getArmor().isIronEndermanPassiveArmor();
        if (this.isMaterial(ModArmorMaterials.NETHERITE_GOLD))
            return ConfigHelper.get().getCommon().getArmor().isGoldEndermanPassiveArmor();
        if (this.isMaterial(ModArmorMaterials.NETHERITE_EMERALD))
            return ConfigHelper.get().getCommon().getArmor().isEmeraldEndermanPassiveArmor();
        if (this.isMaterial(ModArmorMaterials.NETHERITE_DIAMOND))
            return ConfigHelper.get().getCommon().getArmor().isDiamondEndermanPassiveArmor();

        return false;
    }

    /**
     * {@link Override} this method if you want piglins to behave neutral towards the player when wearing the armor.
     *
     * @return If true, pacifies piglins. Also applies the tooltip.
     */
    public boolean pacifiesPiglins()
    {
        if (this.isMaterial(ModArmorMaterials.NETHERITE_IRON))
            return ConfigHelper.get().getCommon().getArmor().isIronPiglinPassiveArmor();
        if (this.isMaterial(ModArmorMaterials.NETHERITE_GOLD))
            return ConfigHelper.get().getCommon().getArmor().isGoldPiglinPassiveArmor();
        if (this.isMaterial(ModArmorMaterials.NETHERITE_EMERALD))
            return ConfigHelper.get().getCommon().getArmor().isEmeraldPiglinPassiveArmor();
        if (this.isMaterial(ModArmorMaterials.NETHERITE_DIAMOND))
            return ConfigHelper.get().getCommon().getArmor().isDiamondPiglinPassiveArmor();

        return false;
    }

    /**
     * {@link Override} this method if you want phantoms to behave neutral towards te player when the armor.
     *
     * @return If true, pacifies phantoms. Alo applies the tooltip.
     */
    public boolean pacifiesPhantoms()
    {
        if (this.isMaterial(ModArmorMaterials.NETHERITE_IRON))
            return ConfigHelper.get().getCommon().getArmor().isIronPhantomPassiveArmor();
        if (this.isMaterial(ModArmorMaterials.NETHERITE_GOLD))
            return ConfigHelper.get().getCommon().getArmor().isGoldPhantomPassiveArmor();
        if (this.isMaterial(ModArmorMaterials.NETHERITE_EMERALD))
            return ConfigHelper.get().getCommon().getArmor().isEmeraldPhantomPassiveArmor();
        if (this.isMaterial(ModArmorMaterials.NETHERITE_DIAMOND))
            return ConfigHelper.get().getCommon().getArmor().isDiamondPhantomPassiveArmor();

        return false;
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
                if (pacifiesEndermen())
                    tooltip.add(ModTooltips.ENDERMAN_PASSIVE_TOOLTIP);
                if (pacifiesPiglins())
                    tooltip.add(ModTooltips.PIGLIN_PASSIVE_TOOLTIP);
                if (pacifiesPhantoms())
                    tooltip.add(ModTooltips.PHANTOM_PASSIVE_TOOLTIP);
            }
            else
            {
                if (pacifiesEndermen() || pacifiesPiglins() || pacifiesPhantoms())
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

    @Override
    public ArmorMaterial getMaterial()
    {
        return this.material;
    }
}
