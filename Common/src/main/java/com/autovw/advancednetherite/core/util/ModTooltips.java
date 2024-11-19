package com.autovw.advancednetherite.core.util;

import com.autovw.advancednetherite.AdvancedNetherite;
import com.autovw.advancednetherite.api.TooltipBuilder;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.resources.ResourceLocation;

/**
 * A class that contains tooltips registered by Advanced Netherite.
 * @author Autovw
 */
public final class ModTooltips
{
    /* Misc */
    private static final MutableComponent PLUS_TOOLTIP = TooltipBuilder.create(id("misc.plus")).withStyle(ChatFormatting.GREEN, ChatFormatting.BOLD);
    private static final MutableComponent SHIFT_TOOLTIP = TooltipBuilder.create(id("misc.shift")).withStyle(ChatFormatting.YELLOW);
    public static final MutableComponent SHIFT_KEY_TOOLTIP = TooltipBuilder.create(id("misc.press_shift_key"), SHIFT_TOOLTIP);

    /* Armor related tooltips */
    public static final MutableComponent ENDERMAN_PASSIVE_TOOLTIP = TooltipBuilder.create(id("armor.enderman_passive"), PLUS_TOOLTIP).withStyle(ChatFormatting.DARK_GREEN);
    public static final MutableComponent PIGLIN_PASSIVE_TOOLTIP = TooltipBuilder.create(id("armor.piglin_passive"), PLUS_TOOLTIP).withStyle(ChatFormatting.GOLD);
    public static final MutableComponent PHANTOM_PASSIVE_TOOLTIP = TooltipBuilder.create(id("armor.phantom_passive"), PLUS_TOOLTIP).withStyle(ChatFormatting.GRAY);

    /* Tool related tooltips */
    // Hoes
    public static final MutableComponent ADDITIONAL_CROP_DROPS_TOOLTIP = TooltipBuilder.create(id("hoe.additional_crop_drops"), PLUS_TOOLTIP);

    // Pickaxes
    public static final MutableComponent DIAMOND_ORE_DROP_TOOLTIP = TooltipBuilder.create(id("pickaxe.additional_diamond_drop"), PLUS_TOOLTIP).withStyle(ChatFormatting.AQUA);
    public static final MutableComponent EMERALD_ORE_DROP_TOOLTIP = TooltipBuilder.create(id("pickaxe.additional_emerald_drop"), PLUS_TOOLTIP).withStyle(ChatFormatting.DARK_GREEN);
    public static final MutableComponent GOLD_ORE_DROP_TOOLTIP = TooltipBuilder.create(id("pickaxe.additional_gold_drop"), PLUS_TOOLTIP).withStyle(ChatFormatting.GOLD);
    public static final MutableComponent IRON_ORE_DROP_TOOLTIP = TooltipBuilder.create(id("pickaxe.additional_iron_drop"), PLUS_TOOLTIP).withStyle(ChatFormatting.GRAY);

    // Swords
    public static final MutableComponent ENDERMAN_MOB_DROP_TOOLTIP = TooltipBuilder.create(id("sword.additional_enderman_mob_drop"), PLUS_TOOLTIP).withStyle(ChatFormatting.DARK_GREEN);
    public static final MutableComponent PIGLIN_MOB_DROP_TOOLTIP = TooltipBuilder.create(id("sword.additional_piglin_mob_drop"), PLUS_TOOLTIP).withStyle(ChatFormatting.GOLD);
    public static final MutableComponent ZOMBIFIED_PIGLIN_MOB_DROP_TOOLTIP = TooltipBuilder.create(id("sword.additional_zombified_piglin_mob_drop"), PLUS_TOOLTIP).withStyle(ChatFormatting.GOLD);
    public static final MutableComponent PHANTOM_MOB_DROP_TOOLTIP = TooltipBuilder.create(id("sword.additional_phantom_mob_drop"), PLUS_TOOLTIP).withStyle(ChatFormatting.GRAY);

    private static ResourceLocation id(String key)
    {
        return ResourceLocation.fromNamespaceAndPath(AdvancedNetherite.MOD_ID, key);
    }
}
