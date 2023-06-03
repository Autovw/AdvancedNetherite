package com.autovw.advancednetherite.core.util;

import com.autovw.advancednetherite.AdvancedNetherite;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

/**
 * @since 1.9.0
 * @author Autovw
 */
public final class ModTags
{
    // BLOCK TAGS
    public static final TagKey<Block> NETHERITE_BLOCKS = modBlockTag("netherite_blocks");

    // ITEM TAGS
    public static final TagKey<Item> NETHERITE_BLOCKITEMS = modItemTag("netherite_blocks");

    public static final TagKey<Item> NETHERITE_INGOTS = modItemTag("netherite_ingots");
    public static final TagKey<Item> UPGRADE_TO_NETHERITE_DIAMOND = modItemTag("upgrade_to_netherite_diamond");
    public static final TagKey<Item> UPGRADE_TO_NETHERITE_EMERALD = modItemTag("upgrade_to_netherite_emerald");
    public static final TagKey<Item> UPGRADE_TO_NETHERITE_GOLD = modItemTag("upgrade_to_netherite_gold");
    public static final TagKey<Item> UPGRADE_TO_NETHERITE_IRON = modItemTag("upgrade_to_netherite_iron");

    public static final TagKey<Item> AXES_NETHERITE_DIAMOND = modItemTag("axes/netherite_diamond");
    public static final TagKey<Item> AXES_NETHERITE_EMERALD = modItemTag("axes/netherite_emerald");
    public static final TagKey<Item> AXES_NETHERITE_GOLD = modItemTag("axes/netherite_gold");
    public static final TagKey<Item> AXES_NETHERITE_IRON = modItemTag("axes/netherite_iron");
    public static final TagKey<Item> AXES_NETHERITE = modItemTag("axes/netherite");
    public static final TagKey<Item> AXES_UPGRADE_TO_NETHERITE_DIAMOND = modItemTag("axes/upgrade_to_netherite_diamond");
    public static final TagKey<Item> AXES_UPGRADE_TO_NETHERITE_EMERALD = modItemTag("axes/upgrade_to_netherite_emerald");
    public static final TagKey<Item> AXES_UPGRADE_TO_NETHERITE_GOLD = modItemTag("axes/upgrade_to_netherite_gold");
    public static final TagKey<Item> AXES_UPGRADE_TO_NETHERITE_IRON = modItemTag("axes/upgrade_to_netherite_iron");

    public static final TagKey<Item> BOOTS_NETHERITE_DIAMOND = modItemTag("boots/netherite_diamond");
    public static final TagKey<Item> BOOTS_NETHERITE_EMERALD = modItemTag("boots/netherite_emerald");
    public static final TagKey<Item> BOOTS_NETHERITE_GOLD = modItemTag("boots/netherite_gold");
    public static final TagKey<Item> BOOTS_NETHERITE_IRON = modItemTag("boots/netherite_iron");
    public static final TagKey<Item> BOOTS_NETHERITE = modItemTag("boots/netherite");
    public static final TagKey<Item> BOOTS_UPGRADE_TO_NETHERITE_DIAMOND = modItemTag("boots/upgrade_to_netherite_diamond");
    public static final TagKey<Item> BOOTS_UPGRADE_TO_NETHERITE_EMERALD = modItemTag("boots/upgrade_to_netherite_emerald");
    public static final TagKey<Item> BOOTS_UPGRADE_TO_NETHERITE_GOLD = modItemTag("boots/upgrade_to_netherite_gold");
    public static final TagKey<Item> BOOTS_UPGRADE_TO_NETHERITE_IRON = modItemTag("boots/upgrade_to_netherite_iron");

    public static final TagKey<Item> CHESTPLATES_NETHERITE_DIAMOND = modItemTag("chestplates/netherite_diamond");
    public static final TagKey<Item> CHESTPLATES_NETHERITE_EMERALD = modItemTag("chestplates/netherite_emerald");
    public static final TagKey<Item> CHESTPLATES_NETHERITE_GOLD = modItemTag("chestplates/netherite_gold");
    public static final TagKey<Item> CHESTPLATES_NETHERITE_IRON = modItemTag("chestplates/netherite_iron");
    public static final TagKey<Item> CHESTPLATES_NETHERITE = modItemTag("chestplates/netherite");
    public static final TagKey<Item> CHESTPLATES_UPGRADE_TO_NETHERITE_DIAMOND = modItemTag("chestplates/upgrade_to_netherite_diamond");
    public static final TagKey<Item> CHESTPLATES_UPGRADE_TO_NETHERITE_EMERALD = modItemTag("chestplates/upgrade_to_netherite_emerald");
    public static final TagKey<Item> CHESTPLATES_UPGRADE_TO_NETHERITE_GOLD = modItemTag("chestplates/upgrade_to_netherite_gold");
    public static final TagKey<Item> CHESTPLATES_UPGRADE_TO_NETHERITE_IRON = modItemTag("chestplates/upgrade_to_netherite_iron");

    public static final TagKey<Item> HELMETS_NETHERITE_DIAMOND = modItemTag("helmets/netherite_diamond");
    public static final TagKey<Item> HELMETS_NETHERITE_EMERALD = modItemTag("helmets/netherite_emerald");
    public static final TagKey<Item> HELMETS_NETHERITE_GOLD = modItemTag("helmets/netherite_gold");
    public static final TagKey<Item> HELMETS_NETHERITE_IRON = modItemTag("helmets/netherite_iron");
    public static final TagKey<Item> HELMETS_NETHERITE = modItemTag("helmets/netherite");
    public static final TagKey<Item> HELMETS_UPGRADE_TO_NETHERITE_DIAMOND = modItemTag("helmets/upgrade_to_netherite_diamond");
    public static final TagKey<Item> HELMETS_UPGRADE_TO_NETHERITE_EMERALD = modItemTag("helmets/upgrade_to_netherite_emerald");
    public static final TagKey<Item> HELMETS_UPGRADE_TO_NETHERITE_GOLD = modItemTag("helmets/upgrade_to_netherite_gold");
    public static final TagKey<Item> HELMETS_UPGRADE_TO_NETHERITE_IRON = modItemTag("helmets/upgrade_to_netherite_iron");

    public static final TagKey<Item> HOES_NETHERITE_DIAMOND = modItemTag("hoes/netherite_diamond");
    public static final TagKey<Item> HOES_NETHERITE_EMERALD = modItemTag("hoes/netherite_emerald");
    public static final TagKey<Item> HOES_NETHERITE_GOLD = modItemTag("hoes/netherite_gold");
    public static final TagKey<Item> HOES_NETHERITE_IRON = modItemTag("hoes/netherite_iron");
    public static final TagKey<Item> HOES_NETHERITE = modItemTag("hoes/netherite");
    public static final TagKey<Item> HOES_UPGRADE_TO_NETHERITE_DIAMOND = modItemTag("hoes/upgrade_to_netherite_diamond");
    public static final TagKey<Item> HOES_UPGRADE_TO_NETHERITE_EMERALD = modItemTag("hoes/upgrade_to_netherite_emerald");
    public static final TagKey<Item> HOES_UPGRADE_TO_NETHERITE_GOLD = modItemTag("hoes/upgrade_to_netherite_gold");
    public static final TagKey<Item> HOES_UPGRADE_TO_NETHERITE_IRON = modItemTag("hoes/upgrade_to_netherite_iron");

    public static final TagKey<Item> INGOTS_NETHERITES_DIAMOND = modItemTag("ingots/netherites_diamond");
    public static final TagKey<Item> INGOTS_NETHERITES_EMERALD = modItemTag("ingots/netherites_emerald");
    public static final TagKey<Item> INGOTS_NETHERITES_GOLD = modItemTag("ingots/netherites_gold");
    public static final TagKey<Item> INGOTS_NETHERITES_IRON = modItemTag("ingots/netherites_iron");
    public static final TagKey<Item> INGOTS_NETHERITES = modItemTag("ingots/netherites");
    public static final TagKey<Item> INGOTS_UPGRADE_TO_NETHERITE_DIAMOND = modItemTag("ingots/upgrade_to_netherite_diamond");
    public static final TagKey<Item> INGOTS_UPGRADE_TO_NETHERITE_EMERALD = modItemTag("ingots/upgrade_to_netherite_emerald");
    public static final TagKey<Item> INGOTS_UPGRADE_TO_NETHERITE_GOLD = modItemTag("ingots/upgrade_to_netherite_gold");
    public static final TagKey<Item> INGOTS_UPGRADE_TO_NETHERITE_IRON = modItemTag("ingots/upgrade_to_netherite_iron");

    public static final TagKey<Item> LEGGINGS_NETHERITE_DIAMOND = modItemTag("leggings/netherite_diamond");
    public static final TagKey<Item> LEGGINGS_NETHERITE_EMERALD = modItemTag("leggings/netherite_emerald");
    public static final TagKey<Item> LEGGINGS_NETHERITE_GOLD = modItemTag("leggings/netherite_gold");
    public static final TagKey<Item> LEGGINGS_NETHERITE_IRON = modItemTag("leggings/netherite_iron");
    public static final TagKey<Item> LEGGINGS_NETHERITE = modItemTag("leggings/netherite");
    public static final TagKey<Item> LEGGINGS_UPGRADE_TO_NETHERITE_DIAMOND = modItemTag("leggings/upgrade_to_netherite_diamond");
    public static final TagKey<Item> LEGGINGS_UPGRADE_TO_NETHERITE_EMERALD = modItemTag("leggings/upgrade_to_netherite_emerald");
    public static final TagKey<Item> LEGGINGS_UPGRADE_TO_NETHERITE_GOLD = modItemTag("leggings/upgrade_to_netherite_gold");
    public static final TagKey<Item> LEGGINGS_UPGRADE_TO_NETHERITE_IRON = modItemTag("leggings/upgrade_to_netherite_iron");

    public static final TagKey<Item> PICKAXES_NETHERITE_DIAMOND = modItemTag("pickaxes/netherite_diamond");
    public static final TagKey<Item> PICKAXES_NETHERITE_EMERALD = modItemTag("pickaxes/netherite_emerald");
    public static final TagKey<Item> PICKAXES_NETHERITE_GOLD = modItemTag("pickaxes/netherite_gold");
    public static final TagKey<Item> PICKAXES_NETHERITE_IRON = modItemTag("pickaxes/netherite_iron");
    public static final TagKey<Item> PICKAXES_NETHERITE = modItemTag("pickaxes/netherite");
    public static final TagKey<Item> PICKAXES_UPGRADE_TO_NETHERITE_DIAMOND = modItemTag("pickaxes/upgrade_to_netherite_diamond");
    public static final TagKey<Item> PICKAXES_UPGRADE_TO_NETHERITE_EMERALD = modItemTag("pickaxes/upgrade_to_netherite_emerald");
    public static final TagKey<Item> PICKAXES_UPGRADE_TO_NETHERITE_GOLD = modItemTag("pickaxes/upgrade_to_netherite_gold");
    public static final TagKey<Item> PICKAXES_UPGRADE_TO_NETHERITE_IRON = modItemTag("pickaxes/upgrade_to_netherite_iron");

    public static final TagKey<Item> SHOVELS_NETHERITE_DIAMOND = modItemTag("shovels/netherite_diamond");
    public static final TagKey<Item> SHOVELS_NETHERITE_EMERALD = modItemTag("shovels/netherite_emerald");
    public static final TagKey<Item> SHOVELS_NETHERITE_GOLD = modItemTag("shovels/netherite_gold");
    public static final TagKey<Item> SHOVELS_NETHERITE_IRON = modItemTag("shovels/netherite_iron");
    public static final TagKey<Item> SHOVELS_NETHERITE = modItemTag("shovels/netherite");
    public static final TagKey<Item> SHOVELS_UPGRADE_TO_NETHERITE_DIAMOND = modItemTag("shovels/upgrade_to_netherite_diamond");
    public static final TagKey<Item> SHOVELS_UPGRADE_TO_NETHERITE_EMERALD = modItemTag("shovels/upgrade_to_netherite_emerald");
    public static final TagKey<Item> SHOVELS_UPGRADE_TO_NETHERITE_GOLD = modItemTag("shovels/upgrade_to_netherite_gold");
    public static final TagKey<Item> SHOVELS_UPGRADE_TO_NETHERITE_IRON = modItemTag("shovels/upgrade_to_netherite_iron");

    public static final TagKey<Item> SWORDS_NETHERITE_DIAMOND = modItemTag("swords/netherite_diamond");
    public static final TagKey<Item> SWORDS_NETHERITE_EMERALD = modItemTag("swords/netherite_emerald");
    public static final TagKey<Item> SWORDS_NETHERITE_GOLD = modItemTag("swords/netherite_gold");
    public static final TagKey<Item> SWORDS_NETHERITE_IRON = modItemTag("swords/netherite_iron");
    public static final TagKey<Item> SWORDS_NETHERITE = modItemTag("swords/netherite");
    public static final TagKey<Item> SWORDS_UPGRADE_TO_NETHERITE_DIAMOND = modItemTag("swords/upgrade_to_netherite_diamond");
    public static final TagKey<Item> SWORDS_UPGRADE_TO_NETHERITE_EMERALD = modItemTag("swords/upgrade_to_netherite_emerald");
    public static final TagKey<Item> SWORDS_UPGRADE_TO_NETHERITE_GOLD = modItemTag("swords/upgrade_to_netherite_gold");
    public static final TagKey<Item> SWORDS_UPGRADE_TO_NETHERITE_IRON = modItemTag("swords/upgrade_to_netherite_iron");

    // "tiers" tags
    public static final TagKey<Item> TIERS_ARMOR = modItemTag("tiers/armor");
    public static final TagKey<Item> TIERS_TOOLS = modItemTag("tiers/tools");

    public static final TagKey<Item> TIERS_ARMOR_NETHERITE_DIAMOND = modItemTag("tiers/armor/netherite_diamond");
    public static final TagKey<Item> TIERS_ARMOR_NETHERITE_EMERALD = modItemTag("tiers/armor/netherite_emerald");
    public static final TagKey<Item> TIERS_ARMOR_NETHERITE_GOLD = modItemTag("tiers/armor/netherite_gold");
    public static final TagKey<Item> TIERS_ARMOR_NETHERITE_IRON = modItemTag("tiers/armor/netherite_iron");

    public static final TagKey<Item> TIERS_TOOLS_NETHERITE_DIAMOND = modItemTag("tiers/tools/netherite_diamond");
    public static final TagKey<Item> TIERS_TOOLS_NETHERITE_EMERALD = modItemTag("tiers/tools/netherite_emerald");
    public static final TagKey<Item> TIERS_TOOLS_NETHERITE_GOLD = modItemTag("tiers/tools/netherite_gold");
    public static final TagKey<Item> TIERS_TOOLS_NETHERITE_IRON = modItemTag("tiers/tools/netherite_iron");

    /**
     * @param tagLoc Resource location of the tag
     * @return Block tag
     */
    public static TagKey<Block> blockTag(ResourceLocation tagLoc)
    {
        return TagKey.create(Registries.BLOCK, tagLoc);
    }

    /**
     * @param tagLoc Resource location of the tag
     * @return Item tag
     */
    public static TagKey<Item> itemTag(ResourceLocation tagLoc)
    {
        return TagKey.create(Registries.ITEM, tagLoc);
    }

    private static TagKey<Block> modBlockTag(String tagName)
    {
        return ModTags.blockTag(new ResourceLocation(AdvancedNetherite.MOD_ID, tagName));
    }

    private static TagKey<Item> modItemTag(String tagName)
    {
        return ModTags.itemTag(new ResourceLocation(AdvancedNetherite.MOD_ID, tagName));
    }
}
