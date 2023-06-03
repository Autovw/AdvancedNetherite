package com.autovw.advancednetherite.core.util;

import com.autovw.advancednetherite.AdvancedNetherite;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

/**
 * Collection of Fabric only tags
 * @author Autovw
 */
public final class FabricModTags
{
    // "config" tags
    public static final TagKey<Item> CONFIG_PACIFY_PHANTOMS = ModTags.itemTag(new ResourceLocation(AdvancedNetherite.MOD_ID, "config/pacify_phantoms"));
    public static final TagKey<Item> CONFIG_PACIFY_PIGLINS = ModTags.itemTag(new ResourceLocation(AdvancedNetherite.MOD_ID, "config/pacify_piglins"));
    public static final TagKey<Item> CONFIG_PACIFY_ENDERMEN = ModTags.itemTag(new ResourceLocation(AdvancedNetherite.MOD_ID, "config/pacify_endermen"));

    // "tooltiprareness" tags
    public static final TagKey<Item> TOOLTIP_RARENESS_EPIC_ITEM = ModTags.itemTag(new ResourceLocation("tooltiprareness", "epic_item"));
    public static final TagKey<Item> TOOLTIP_RARENESS_LEGENDARY_ITEM = ModTags.itemTag(new ResourceLocation("tooltiprareness", "legendary_item"));
}
