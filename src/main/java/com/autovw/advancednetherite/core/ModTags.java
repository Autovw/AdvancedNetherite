package com.autovw.advancednetherite.core;

import com.autovw.advancednetherite.Reference;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ITag;
import net.minecraft.tags.ItemTags;

/**
 * Author: Autovw
 * @since 1.9.0
 */
public class ModTags {
    // BLOCK TAGS
    public static final ITag.INamedTag<Block> NETHERITE_BLOCKS = BlockTags.bind(Reference.MOD_ID + ":netherite_blocks");

    // ITEM TAGS
    public static final ITag.INamedTag<Item> NETHERITE_BLOCKITEMS = bindModTag("netherite_blocks");

    public static final ITag.INamedTag<Item> NETHERITE_INGOTS = bindModTag("netherite_ingots");
    public static final ITag.INamedTag<Item> UPGRADE_TO_NETHERITE_DIAMOND = bindModTag("upgrade_to_netherite_diamond");
    public static final ITag.INamedTag<Item> UPGRADE_TO_NETHERITE_EMERALD = bindModTag("upgrade_to_netherite_emerald");
    public static final ITag.INamedTag<Item> UPGRADE_TO_NETHERITE_GOLD = bindModTag("upgrade_to_netherite_gold");
    public static final ITag.INamedTag<Item> UPGRADE_TO_NETHERITE_IRON = bindModTag("upgrade_to_netherite_iron");

    public static final ITag.INamedTag<Item> AXES_NETHERITE_DIAMOND = bindModTag("axes/netherite_diamond");
    public static final ITag.INamedTag<Item> AXES_NETHERITE_EMERALD = bindModTag("axes/netherite_emerald");
    public static final ITag.INamedTag<Item> AXES_NETHERITE_GOLD = bindModTag("axes/netherite_gold");
    public static final ITag.INamedTag<Item> AXES_NETHERITE_IRON = bindModTag("axes/netherite_iron");
    public static final ITag.INamedTag<Item> AXES_NETHERITE = bindModTag("axes/netherite");
    public static final ITag.INamedTag<Item> AXES_UPGRADE_TO_NETHERITE_DIAMOND = bindModTag("axes/upgrade_to_netherite_diamond");
    public static final ITag.INamedTag<Item> AXES_UPGRADE_TO_NETHERITE_EMERALD = bindModTag("axes/upgrade_to_netherite_emerald");
    public static final ITag.INamedTag<Item> AXES_UPGRADE_TO_NETHERITE_GOLD = bindModTag("axes/upgrade_to_netherite_gold");
    public static final ITag.INamedTag<Item> AXES_UPGRADE_TO_NETHERITE_IRON = bindModTag("axes/upgrade_to_netherite_iron");

    public static final ITag.INamedTag<Item> BOOTS_NETHERITE_DIAMOND = bindModTag("boots/netherite_diamond");
    public static final ITag.INamedTag<Item> BOOTS_NETHERITE_EMERALD = bindModTag("boots/netherite_emerald");
    public static final ITag.INamedTag<Item> BOOTS_NETHERITE_GOLD = bindModTag("boots/netherite_gold");
    public static final ITag.INamedTag<Item> BOOTS_NETHERITE_IRON = bindModTag("boots/netherite_iron");
    public static final ITag.INamedTag<Item> BOOTS_NETHERITE = bindModTag("boots/netherite");
    public static final ITag.INamedTag<Item> BOOTS_UPGRADE_TO_NETHERITE_DIAMOND = bindModTag("boots/upgrade_to_netherite_diamond");
    public static final ITag.INamedTag<Item> BOOTS_UPGRADE_TO_NETHERITE_EMERALD = bindModTag("boots/upgrade_to_netherite_emerald");
    public static final ITag.INamedTag<Item> BOOTS_UPGRADE_TO_NETHERITE_GOLD = bindModTag("boots/upgrade_to_netherite_gold");
    public static final ITag.INamedTag<Item> BOOTS_UPGRADE_TO_NETHERITE_IRON = bindModTag("boots/upgrade_to_netherite_iron");

    public static final ITag.INamedTag<Item> CHESTPLATES_NETHERITE_DIAMOND = bindModTag("chestplates/netherite_diamond");
    public static final ITag.INamedTag<Item> CHESTPLATES_NETHERITE_EMERALD = bindModTag("chestplates/netherite_emerald");
    public static final ITag.INamedTag<Item> CHESTPLATES_NETHERITE_GOLD = bindModTag("chestplates/netherite_gold");
    public static final ITag.INamedTag<Item> CHESTPLATES_NETHERITE_IRON = bindModTag("chestplates/netherite_iron");
    public static final ITag.INamedTag<Item> CHESTPLATES_NETHERITE = bindModTag("chestplates/netherite");
    public static final ITag.INamedTag<Item> CHESTPLATES_UPGRADE_TO_NETHERITE_DIAMOND = bindModTag("chestplates/upgrade_to_netherite_diamond");
    public static final ITag.INamedTag<Item> CHESTPLATES_UPGRADE_TO_NETHERITE_EMERALD = bindModTag("chestplates/upgrade_to_netherite_emerald");
    public static final ITag.INamedTag<Item> CHESTPLATES_UPGRADE_TO_NETHERITE_GOLD = bindModTag("chestplates/upgrade_to_netherite_gold");
    public static final ITag.INamedTag<Item> CHESTPLATES_UPGRADE_TO_NETHERITE_IRON = bindModTag("chestplates/upgrade_to_netherite_iron");

    public static final ITag.INamedTag<Item> HELMETS_NETHERITE_DIAMOND = bindModTag("helmets/netherite_diamond");
    public static final ITag.INamedTag<Item> HELMETS_NETHERITE_EMERALD = bindModTag("helmets/netherite_emerald");
    public static final ITag.INamedTag<Item> HELMETS_NETHERITE_GOLD = bindModTag("helmets/netherite_gold");
    public static final ITag.INamedTag<Item> HELMETS_NETHERITE_IRON = bindModTag("helmets/netherite_iron");
    public static final ITag.INamedTag<Item> HELMETS_NETHERITE = bindModTag("helmets/netherite");
    public static final ITag.INamedTag<Item> HELMETS_UPGRADE_TO_NETHERITE_DIAMOND = bindModTag("helmets/upgrade_to_netherite_diamond");
    public static final ITag.INamedTag<Item> HELMETS_UPGRADE_TO_NETHERITE_EMERALD = bindModTag("helmets/upgrade_to_netherite_emerald");
    public static final ITag.INamedTag<Item> HELMETS_UPGRADE_TO_NETHERITE_GOLD = bindModTag("helmets/upgrade_to_netherite_gold");
    public static final ITag.INamedTag<Item> HELMETS_UPGRADE_TO_NETHERITE_IRON = bindModTag("helmets/upgrade_to_netherite_iron");

    public static final ITag.INamedTag<Item> HOES_NETHERITE_DIAMOND = bindModTag("hoes/netherite_diamond");
    public static final ITag.INamedTag<Item> HOES_NETHERITE_EMERALD = bindModTag("hoes/netherite_emerald");
    public static final ITag.INamedTag<Item> HOES_NETHERITE_GOLD = bindModTag("hoes/netherite_gold");
    public static final ITag.INamedTag<Item> HOES_NETHERITE_IRON = bindModTag("hoes/netherite_iron");
    public static final ITag.INamedTag<Item> HOES_NETHERITE = bindModTag("hoes/netherite");
    public static final ITag.INamedTag<Item> HOES_UPGRADE_TO_NETHERITE_DIAMOND = bindModTag("hoes/upgrade_to_netherite_diamond");
    public static final ITag.INamedTag<Item> HOES_UPGRADE_TO_NETHERITE_EMERALD = bindModTag("hoes/upgrade_to_netherite_emerald");
    public static final ITag.INamedTag<Item> HOES_UPGRADE_TO_NETHERITE_GOLD = bindModTag("hoes/upgrade_to_netherite_gold");
    public static final ITag.INamedTag<Item> HOES_UPGRADE_TO_NETHERITE_IRON = bindModTag("hoes/upgrade_to_netherite_iron");

    public static final ITag.INamedTag<Item> INGOTS_NETHERITES_DIAMOND = bindModTag("ingots/netherite_diamond");
    public static final ITag.INamedTag<Item> INGOTS_NETHERITES_EMERALD = bindModTag("ingots/netherite_emerald");
    public static final ITag.INamedTag<Item> INGOTS_NETHERITES_GOLD = bindModTag("ingots/netherite_gold");
    public static final ITag.INamedTag<Item> INGOTS_NETHERITES_IRON = bindModTag("ingots/netherite_iron");
    public static final ITag.INamedTag<Item> INGOTS_NETHERITES = bindModTag("ingots/netherite");
    public static final ITag.INamedTag<Item> INGOTS_UPGRADE_TO_NETHERITE_DIAMOND = bindModTag("ingots/upgrade_to_netherite_diamond");
    public static final ITag.INamedTag<Item> INGOTS_UPGRADE_TO_NETHERITE_EMERALD = bindModTag("ingots/upgrade_to_netherite_emerald");
    public static final ITag.INamedTag<Item> INGOTS_UPGRADE_TO_NETHERITE_GOLD = bindModTag("ingots/upgrade_to_netherite_gold");
    public static final ITag.INamedTag<Item> INGOTS_UPGRADE_TO_NETHERITE_IRON = bindModTag("ingots/upgrade_to_netherite_iron");

    public static final ITag.INamedTag<Item> LEGGINGS_NETHERITE_DIAMOND = bindModTag("leggings/netherite_diamond");
    public static final ITag.INamedTag<Item> LEGGINGS_NETHERITE_EMERALD = bindModTag("leggings/netherite_emerald");
    public static final ITag.INamedTag<Item> LEGGINGS_NETHERITE_GOLD = bindModTag("leggings/netherite_gold");
    public static final ITag.INamedTag<Item> LEGGINGS_NETHERITE_IRON = bindModTag("leggings/netherite_iron");
    public static final ITag.INamedTag<Item> LEGGINGS_NETHERITE = bindModTag("leggings/netherite");
    public static final ITag.INamedTag<Item> LEGGINGS_UPGRADE_TO_NETHERITE_DIAMOND = bindModTag("leggings/upgrade_to_netherite_diamond");
    public static final ITag.INamedTag<Item> LEGGINGS_UPGRADE_TO_NETHERITE_EMERALD = bindModTag("leggings/upgrade_to_netherite_emerald");
    public static final ITag.INamedTag<Item> LEGGINGS_UPGRADE_TO_NETHERITE_GOLD = bindModTag("leggings/upgrade_to_netherite_gold");
    public static final ITag.INamedTag<Item> LEGGINGS_UPGRADE_TO_NETHERITE_IRON = bindModTag("leggings/upgrade_to_netherite_iron");

    public static final ITag.INamedTag<Item> PICKAXES_NETHERITE_DIAMOND = bindModTag("pickaxes/netherite_diamond");
    public static final ITag.INamedTag<Item> PICKAXES_NETHERITE_EMERALD = bindModTag("pickaxes/netherite_emerald");
    public static final ITag.INamedTag<Item> PICKAXES_NETHERITE_GOLD = bindModTag("pickaxes/netherite_gold");
    public static final ITag.INamedTag<Item> PICKAXES_NETHERITE_IRON = bindModTag("pickaxes/netherite_iron");
    public static final ITag.INamedTag<Item> PICKAXES_NETHERITE = bindModTag("pickaxes/netherite");
    public static final ITag.INamedTag<Item> PICKAXES_UPGRADE_TO_NETHERITE_DIAMOND = bindModTag("pickaxes/upgrade_to_netherite_diamond");
    public static final ITag.INamedTag<Item> PICKAXES_UPGRADE_TO_NETHERITE_EMERALD = bindModTag("pickaxes/upgrade_to_netherite_emerald");
    public static final ITag.INamedTag<Item> PICKAXES_UPGRADE_TO_NETHERITE_GOLD = bindModTag("pickaxes/upgrade_to_netherite_gold");
    public static final ITag.INamedTag<Item> PICKAXES_UPGRADE_TO_NETHERITE_IRON = bindModTag("pickaxes/upgrade_to_netherite_iron");

    public static final ITag.INamedTag<Item> SHOVELS_NETHERITE_DIAMOND = bindModTag("shovels/netherite_diamond");
    public static final ITag.INamedTag<Item> SHOVELS_NETHERITE_EMERALD = bindModTag("shovels/netherite_emerald");
    public static final ITag.INamedTag<Item> SHOVELS_NETHERITE_GOLD = bindModTag("shovels/netherite_gold");
    public static final ITag.INamedTag<Item> SHOVELS_NETHERITE_IRON = bindModTag("shovels/netherite_iron");
    public static final ITag.INamedTag<Item> SHOVELS_NETHERITE = bindModTag("shovels/netherite");
    public static final ITag.INamedTag<Item> SHOVELS_UPGRADE_TO_NETHERITE_DIAMOND = bindModTag("shovels/upgrade_to_netherite_diamond");
    public static final ITag.INamedTag<Item> SHOVELS_UPGRADE_TO_NETHERITE_EMERALD = bindModTag("shovels/upgrade_to_netherite_emerald");
    public static final ITag.INamedTag<Item> SHOVELS_UPGRADE_TO_NETHERITE_GOLD = bindModTag("shovels/upgrade_to_netherite_gold");
    public static final ITag.INamedTag<Item> SHOVELS_UPGRADE_TO_NETHERITE_IRON = bindModTag("shovels/upgrade_to_netherite_iron");

    public static final ITag.INamedTag<Item> SWORDS_NETHERITE_DIAMOND = bindModTag("swords/netherite_diamond");
    public static final ITag.INamedTag<Item> SWORDS_NETHERITE_EMERALD = bindModTag("swords/netherite_emerald");
    public static final ITag.INamedTag<Item> SWORDS_NETHERITE_GOLD = bindModTag("swords/netherite_gold");
    public static final ITag.INamedTag<Item> SWORDS_NETHERITE_IRON = bindModTag("swords/netherite_iron");
    public static final ITag.INamedTag<Item> SWORDS_NETHERITE = bindModTag("swords/netherite");
    public static final ITag.INamedTag<Item> SWORDS_UPGRADE_TO_NETHERITE_DIAMOND = bindModTag("swords/upgrade_to_netherite_diamond");
    public static final ITag.INamedTag<Item> SWORDS_UPGRADE_TO_NETHERITE_EMERALD = bindModTag("swords/upgrade_to_netherite_emerald");
    public static final ITag.INamedTag<Item> SWORDS_UPGRADE_TO_NETHERITE_GOLD = bindModTag("swords/upgrade_to_netherite_gold");
    public static final ITag.INamedTag<Item> SWORDS_UPGRADE_TO_NETHERITE_IRON = bindModTag("swords/upgrade_to_netherite_iron");

    // "tiers" tags
    public static final ITag.INamedTag<Item> TIERS_ARMOR = bindModTag("tiers/armor");
    public static final ITag.INamedTag<Item> TIERS_TOOLS = bindModTag("tiers/tools");

    public static final ITag.INamedTag<Item> TIERS_ARMOR_NETHERITE_DIAMOND = bindModTag("tiers/armor/netherite_diamond");
    public static final ITag.INamedTag<Item> TIERS_ARMOR_NETHERITE_EMERALD = bindModTag("tiers/armor/netherite_emerald");
    public static final ITag.INamedTag<Item> TIERS_ARMOR_NETHERITE_GOLD = bindModTag("tiers/armor/netherite_gold");
    public static final ITag.INamedTag<Item> TIERS_ARMOR_NETHERITE_IRON = bindModTag("tiers/armor/netherite_iron");

    public static final ITag.INamedTag<Item> TIERS_TOOLS_NETHERITE_DIAMOND = bindModTag("tiers/tools/netherite_diamond");
    public static final ITag.INamedTag<Item> TIERS_TOOLS_NETHERITE_EMERALD = bindModTag("tiers/tools/netherite_emerald");
    public static final ITag.INamedTag<Item> TIERS_TOOLS_NETHERITE_GOLD = bindModTag("tiers/tools/netherite_gold");
    public static final ITag.INamedTag<Item> TIERS_TOOLS_NETHERITE_IRON = bindModTag("tiers/tools/netherite_iron");

    // Helper method to register item tags from Advanced Netherite
    private static ITag.INamedTag<Item> bindModTag(String location) {
        return ItemTags.bind(Reference.MOD_ID + ":" + location);
    }
}
