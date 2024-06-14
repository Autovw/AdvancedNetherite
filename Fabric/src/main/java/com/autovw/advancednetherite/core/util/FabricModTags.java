package com.autovw.advancednetherite.core.util;

import com.autovw.advancednetherite.AdvancedNetherite;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

/**
 * Collection of Fabric only tags
 * @author Autovw
 */
public final class FabricModTags
{
    // "config" tags
    public static final TagKey<Item> CONFIG_PACIFY_PHANTOMS = ModTags.itemTag(ResourceLocation.fromNamespaceAndPath(AdvancedNetherite.MOD_ID, "config/pacify_phantoms"));
    public static final TagKey<Item> CONFIG_PACIFY_PIGLINS = ModTags.itemTag(ResourceLocation.fromNamespaceAndPath(AdvancedNetherite.MOD_ID, "config/pacify_piglins"));
    public static final TagKey<Item> CONFIG_PACIFY_ENDERMEN = ModTags.itemTag(ResourceLocation.fromNamespaceAndPath(AdvancedNetherite.MOD_ID, "config/pacify_endermen"));

    // "c" (common) tags
    public static final TagKey<Item> COMMON_HELMETS = commonItemTag("helmets");
    public static final TagKey<Item> COMMON_CHESTPLATES = commonItemTag("chestplates");
    public static final TagKey<Item> COMMON_LEGGINGS = commonItemTag("leggings");
    public static final TagKey<Item> COMMON_BOOTS = commonItemTag("boots");
    public static final TagKey<Item> COMMON_NETHERITE_INGOTS = commonItemTag("netherite_ingots");
    public static final TagKey<Block> COMMON_NETHERITE_BLOCKS = commonBlockTag("netherite_blocks");

    // "tooltiprareness" tags
    public static final TagKey<Item> TOOLTIP_RARENESS_EPIC_ITEM = ModTags.itemTag(ResourceLocation.fromNamespaceAndPath("tooltiprareness", "epic_item"));
    public static final TagKey<Item> TOOLTIP_RARENESS_LEGENDARY_ITEM = ModTags.itemTag(ResourceLocation.fromNamespaceAndPath("tooltiprareness", "legendary_item"));

    private static TagKey<Item> commonItemTag(String key)
    {
        return ModTags.itemTag(ResourceLocation.fromNamespaceAndPath("c", key));
    }

    private static TagKey<Block> commonBlockTag(String key)
    {
        return ModTags.blockTag(ResourceLocation.fromNamespaceAndPath("c", key));
    }
}
