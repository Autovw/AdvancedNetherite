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
    /* Armor related tooltips */
    public static final MutableComponent ENDERMAN_PASSIVE_TOOLTIP = TooltipBuilder.create(ResourceLocation.fromNamespaceAndPath(AdvancedNetherite.MOD_ID, "armor.enderman_passive")).withStyle(ChatFormatting.DARK_GREEN);
    public static final MutableComponent PIGLIN_PASSIVE_TOOLTIP = TooltipBuilder.create(ResourceLocation.fromNamespaceAndPath(AdvancedNetherite.MOD_ID, "armor.piglin_passive")).withStyle(ChatFormatting.GOLD);
    public static final MutableComponent PHANTOM_PASSIVE_TOOLTIP = TooltipBuilder.create(ResourceLocation.fromNamespaceAndPath(AdvancedNetherite.MOD_ID, "armor.phantom_passive")).withStyle(ChatFormatting.GRAY);

    /* Tool related tooltips */
    // Hoes
    public static final MutableComponent ADDITIONAL_CROP_DROPS_TOOLTIP = TooltipBuilder.create(ResourceLocation.fromNamespaceAndPath(AdvancedNetherite.MOD_ID, "hoe.additional_crop_drops"));

    // Pickaxes
    public static final MutableComponent DIAMOND_ORE_DROP_TOOLTIP = TooltipBuilder.create(ResourceLocation.fromNamespaceAndPath(AdvancedNetherite.MOD_ID, "pickaxe.additional_diamond_drop")).withStyle(ChatFormatting.AQUA);
    public static final MutableComponent EMERALD_ORE_DROP_TOOLTIP = TooltipBuilder.create(ResourceLocation.fromNamespaceAndPath(AdvancedNetherite.MOD_ID, "pickaxe.additional_emerald_drop")).withStyle(ChatFormatting.DARK_GREEN);
    public static final MutableComponent GOLD_ORE_DROP_TOOLTIP = TooltipBuilder.create(ResourceLocation.fromNamespaceAndPath(AdvancedNetherite.MOD_ID, "pickaxe.additional_gold_drop")).withStyle(ChatFormatting.GOLD);
    public static final MutableComponent IRON_ORE_DROP_TOOLTIP = TooltipBuilder.create(ResourceLocation.fromNamespaceAndPath(AdvancedNetherite.MOD_ID, "pickaxe.additional_iron_drop")).withStyle(ChatFormatting.GRAY);

    // Swords
    public static final MutableComponent ENDERMAN_MOB_DROP_TOOLTIP = TooltipBuilder.create(ResourceLocation.fromNamespaceAndPath(AdvancedNetherite.MOD_ID, "sword.additional_enderman_mob_drop")).withStyle(ChatFormatting.DARK_GREEN);
    public static final MutableComponent PIGLIN_MOB_DROP_TOOLTIP = TooltipBuilder.create(ResourceLocation.fromNamespaceAndPath(AdvancedNetherite.MOD_ID, "sword.additional_piglin_mob_drop")).withStyle(ChatFormatting.GOLD);
    public static final MutableComponent ZOMBIFIED_PIGLIN_MOB_DROP_TOOLTIP = TooltipBuilder.create(ResourceLocation.fromNamespaceAndPath(AdvancedNetherite.MOD_ID, "sword.additional_zombified_piglin_mob_drop")).withStyle(ChatFormatting.GOLD);
    public static final MutableComponent PHANTOM_MOB_DROP_TOOLTIP = TooltipBuilder.create(ResourceLocation.fromNamespaceAndPath(AdvancedNetherite.MOD_ID, "sword.additional_phantom_mob_drop")).withStyle(ChatFormatting.GRAY);

    /* Misc */
    private static final MutableComponent SHIFT_TOOLTIP = TooltipBuilder.create(ResourceLocation.fromNamespaceAndPath(AdvancedNetherite.MOD_ID, "misc.shift")).withStyle(ChatFormatting.YELLOW);
    public static final MutableComponent SHIFT_KEY_TOOLTIP = TooltipBuilder.create(ResourceLocation.fromNamespaceAndPath(AdvancedNetherite.MOD_ID, "misc.press_shift_key"), SHIFT_TOOLTIP);
}
