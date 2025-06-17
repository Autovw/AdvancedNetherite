package com.autovw.advancednetherite.core.util;

import com.autovw.advancednetherite.AdvancedNetherite;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.level.block.Block;

/**
 * @since 1.9.0
 * @author Autovw
 */
public final class ModTags
{
    // BLOCK TAGS
    public static final TagKey<Block> NETHERITE_BLOCKS = modBlockTag("netherite_blocks");

    public static final TagKey<Block> INCORRECT_FOR_NETHERITE_IRON_TOOL = modBlockTag("incorrect_for_netherite_iron_tool");
    public static final TagKey<Block> INCORRECT_FOR_NETHERITE_GOLD_TOOL = modBlockTag("incorrect_for_netherite_gold_tool");
    public static final TagKey<Block> INCORRECT_FOR_NETHERITE_EMERALD_TOOL = modBlockTag("incorrect_for_netherite_emerald_tool");
    public static final TagKey<Block> INCORRECT_FOR_NETHERITE_DIAMOND_TOOL = modBlockTag("incorrect_for_netherite_diamond_tool");

    // ITEM TAGS
    public static final TagKey<Item> NETHERITE_BLOCKITEMS = modItemTag("netherite_blocks");

    public static final TagKey<Item> NETHERITE_INGOTS = modItemTag("netherite_ingots");
    public static final TagKey<Item> UPGRADE_TO_NETHERITE_DIAMOND = modItemTag("upgrade_to_netherite_diamond");
    public static final TagKey<Item> UPGRADE_TO_NETHERITE_EMERALD = modItemTag("upgrade_to_netherite_emerald");
    public static final TagKey<Item> UPGRADE_TO_NETHERITE_GOLD = modItemTag("upgrade_to_netherite_gold");
    public static final TagKey<Item> UPGRADE_TO_NETHERITE_IRON = modItemTag("upgrade_to_netherite_iron");

    public static final TagKey<Item> AXE_NETHERITE_DIAMOND = modItemTag("axe/netherite_diamond");
    public static final TagKey<Item> AXE_NETHERITE_EMERALD = modItemTag("axe/netherite_emerald");
    public static final TagKey<Item> AXE_NETHERITE_GOLD = modItemTag("axe/netherite_gold");
    public static final TagKey<Item> AXE_NETHERITE_IRON = modItemTag("axe/netherite_iron");
    public static final TagKey<Item> AXE_NETHERITE = modItemTag("axe/netherite");
    public static final TagKey<Item> AXE_UPGRADE_TO_NETHERITE_DIAMOND = modItemTag("axe/upgrade_to_netherite_diamond");
    public static final TagKey<Item> AXE_UPGRADE_TO_NETHERITE_EMERALD = modItemTag("axe/upgrade_to_netherite_emerald");
    public static final TagKey<Item> AXE_UPGRADE_TO_NETHERITE_GOLD = modItemTag("axe/upgrade_to_netherite_gold");
    public static final TagKey<Item> AXE_UPGRADE_TO_NETHERITE_IRON = modItemTag("axe/upgrade_to_netherite_iron");

    public static final TagKey<Item> BOOTS_NETHERITE_DIAMOND = modItemTag("boots/netherite_diamond");
    public static final TagKey<Item> BOOTS_NETHERITE_EMERALD = modItemTag("boots/netherite_emerald");
    public static final TagKey<Item> BOOTS_NETHERITE_GOLD = modItemTag("boots/netherite_gold");
    public static final TagKey<Item> BOOTS_NETHERITE_IRON = modItemTag("boots/netherite_iron");
    public static final TagKey<Item> BOOTS_NETHERITE = modItemTag("boots/netherite");
    public static final TagKey<Item> BOOTS_UPGRADE_TO_NETHERITE_DIAMOND = modItemTag("boots/upgrade_to_netherite_diamond");
    public static final TagKey<Item> BOOTS_UPGRADE_TO_NETHERITE_EMERALD = modItemTag("boots/upgrade_to_netherite_emerald");
    public static final TagKey<Item> BOOTS_UPGRADE_TO_NETHERITE_GOLD = modItemTag("boots/upgrade_to_netherite_gold");
    public static final TagKey<Item> BOOTS_UPGRADE_TO_NETHERITE_IRON = modItemTag("boots/upgrade_to_netherite_iron");

    public static final TagKey<Item> CHESTPLATE_NETHERITE_DIAMOND = modItemTag("chestplate/netherite_diamond");
    public static final TagKey<Item> CHESTPLATE_NETHERITE_EMERALD = modItemTag("chestplate/netherite_emerald");
    public static final TagKey<Item> CHESTPLATE_NETHERITE_GOLD = modItemTag("chestplate/netherite_gold");
    public static final TagKey<Item> CHESTPLATE_NETHERITE_IRON = modItemTag("chestplate/netherite_iron");
    public static final TagKey<Item> CHESTPLATE_NETHERITE = modItemTag("chestplate/netherite");
    public static final TagKey<Item> CHESTPLATE_UPGRADE_TO_NETHERITE_DIAMOND = modItemTag("chestplate/upgrade_to_netherite_diamond");
    public static final TagKey<Item> CHESTPLATE_UPGRADE_TO_NETHERITE_EMERALD = modItemTag("chestplate/upgrade_to_netherite_emerald");
    public static final TagKey<Item> CHESTPLATE_UPGRADE_TO_NETHERITE_GOLD = modItemTag("chestplate/upgrade_to_netherite_gold");
    public static final TagKey<Item> CHESTPLATE_UPGRADE_TO_NETHERITE_IRON = modItemTag("chestplate/upgrade_to_netherite_iron");

    public static final TagKey<Item> HELMET_NETHERITE_DIAMOND = modItemTag("helmet/netherite_diamond");
    public static final TagKey<Item> HELMET_NETHERITE_EMERALD = modItemTag("helmet/netherite_emerald");
    public static final TagKey<Item> HELMET_NETHERITE_GOLD = modItemTag("helmet/netherite_gold");
    public static final TagKey<Item> HELMET_NETHERITE_IRON = modItemTag("helmet/netherite_iron");
    public static final TagKey<Item> HELMET_NETHERITE = modItemTag("helmet/netherite");
    public static final TagKey<Item> HELMET_UPGRADE_TO_NETHERITE_DIAMOND = modItemTag("helmet/upgrade_to_netherite_diamond");
    public static final TagKey<Item> HELMET_UPGRADE_TO_NETHERITE_EMERALD = modItemTag("helmet/upgrade_to_netherite_emerald");
    public static final TagKey<Item> HELMET_UPGRADE_TO_NETHERITE_GOLD = modItemTag("helmet/upgrade_to_netherite_gold");
    public static final TagKey<Item> HELMET_UPGRADE_TO_NETHERITE_IRON = modItemTag("helmet/upgrade_to_netherite_iron");

    public static final TagKey<Item> HOE_NETHERITE_DIAMOND = modItemTag("hoe/netherite_diamond");
    public static final TagKey<Item> HOE_NETHERITE_EMERALD = modItemTag("hoe/netherite_emerald");
    public static final TagKey<Item> HOE_NETHERITE_GOLD = modItemTag("hoe/netherite_gold");
    public static final TagKey<Item> HOE_NETHERITE_IRON = modItemTag("hoe/netherite_iron");
    public static final TagKey<Item> HOE_NETHERITE = modItemTag("hoe/netherite");
    public static final TagKey<Item> HOE_UPGRADE_TO_NETHERITE_DIAMOND = modItemTag("hoe/upgrade_to_netherite_diamond");
    public static final TagKey<Item> HOE_UPGRADE_TO_NETHERITE_EMERALD = modItemTag("hoe/upgrade_to_netherite_emerald");
    public static final TagKey<Item> HOE_UPGRADE_TO_NETHERITE_GOLD = modItemTag("hoe/upgrade_to_netherite_gold");
    public static final TagKey<Item> HOE_UPGRADE_TO_NETHERITE_IRON = modItemTag("hoe/upgrade_to_netherite_iron");

    public static final TagKey<Item> INGOTS_NETHERITES_DIAMOND = modItemTag("ingot/netherites_diamond");
    public static final TagKey<Item> INGOTS_NETHERITES_EMERALD = modItemTag("ingot/netherites_emerald");
    public static final TagKey<Item> INGOTS_NETHERITES_GOLD = modItemTag("ingot/netherites_gold");
    public static final TagKey<Item> INGOTS_NETHERITES_IRON = modItemTag("ingot/netherites_iron");
    public static final TagKey<Item> INGOTS_NETHERITES = modItemTag("ingot/netherites");
    public static final TagKey<Item> INGOTS_UPGRADE_TO_NETHERITE_DIAMOND = modItemTag("ingot/upgrade_to_netherite_diamond");
    public static final TagKey<Item> INGOTS_UPGRADE_TO_NETHERITE_EMERALD = modItemTag("ingot/upgrade_to_netherite_emerald");
    public static final TagKey<Item> INGOTS_UPGRADE_TO_NETHERITE_GOLD = modItemTag("ingot/upgrade_to_netherite_gold");
    public static final TagKey<Item> INGOTS_UPGRADE_TO_NETHERITE_IRON = modItemTag("ingot/upgrade_to_netherite_iron");

    public static final TagKey<Item> LEGGINGS_NETHERITE_DIAMOND = modItemTag("leggings/netherite_diamond");
    public static final TagKey<Item> LEGGINGS_NETHERITE_EMERALD = modItemTag("leggings/netherite_emerald");
    public static final TagKey<Item> LEGGINGS_NETHERITE_GOLD = modItemTag("leggings/netherite_gold");
    public static final TagKey<Item> LEGGINGS_NETHERITE_IRON = modItemTag("leggings/netherite_iron");
    public static final TagKey<Item> LEGGINGS_NETHERITE = modItemTag("leggings/netherite");
    public static final TagKey<Item> LEGGINGS_UPGRADE_TO_NETHERITE_DIAMOND = modItemTag("leggings/upgrade_to_netherite_diamond");
    public static final TagKey<Item> LEGGINGS_UPGRADE_TO_NETHERITE_EMERALD = modItemTag("leggings/upgrade_to_netherite_emerald");
    public static final TagKey<Item> LEGGINGS_UPGRADE_TO_NETHERITE_GOLD = modItemTag("leggings/upgrade_to_netherite_gold");
    public static final TagKey<Item> LEGGINGS_UPGRADE_TO_NETHERITE_IRON = modItemTag("leggings/upgrade_to_netherite_iron");

    public static final TagKey<Item> PICKAXE_NETHERITE_DIAMOND = modItemTag("pickaxe/netherite_diamond");
    public static final TagKey<Item> PICKAXE_NETHERITE_EMERALD = modItemTag("pickaxe/netherite_emerald");
    public static final TagKey<Item> PICKAXE_NETHERITE_GOLD = modItemTag("pickaxe/netherite_gold");
    public static final TagKey<Item> PICKAXE_NETHERITE_IRON = modItemTag("pickaxe/netherite_iron");
    public static final TagKey<Item> PICKAXE_NETHERITE = modItemTag("pickaxe/netherite");
    public static final TagKey<Item> PICKAXE_UPGRADE_TO_NETHERITE_DIAMOND = modItemTag("pickaxe/upgrade_to_netherite_diamond");
    public static final TagKey<Item> PICKAXE_UPGRADE_TO_NETHERITE_EMERALD = modItemTag("pickaxe/upgrade_to_netherite_emerald");
    public static final TagKey<Item> PICKAXE_UPGRADE_TO_NETHERITE_GOLD = modItemTag("pickaxe/upgrade_to_netherite_gold");
    public static final TagKey<Item> PICKAXE_UPGRADE_TO_NETHERITE_IRON = modItemTag("pickaxe/upgrade_to_netherite_iron");

    public static final TagKey<Item> SHOVEL_NETHERITE_DIAMOND = modItemTag("shovel/netherite_diamond");
    public static final TagKey<Item> SHOVEL_NETHERITE_EMERALD = modItemTag("shovel/netherite_emerald");
    public static final TagKey<Item> SHOVEL_NETHERITE_GOLD = modItemTag("shovel/netherite_gold");
    public static final TagKey<Item> SHOVEL_NETHERITE_IRON = modItemTag("shovel/netherite_iron");
    public static final TagKey<Item> SHOVEL_NETHERITE = modItemTag("shovel/netherite");
    public static final TagKey<Item> SHOVEL_UPGRADE_TO_NETHERITE_DIAMOND = modItemTag("shovel/upgrade_to_netherite_diamond");
    public static final TagKey<Item> SHOVEL_UPGRADE_TO_NETHERITE_EMERALD = modItemTag("shovel/upgrade_to_netherite_emerald");
    public static final TagKey<Item> SHOVEL_UPGRADE_TO_NETHERITE_GOLD = modItemTag("shovel/upgrade_to_netherite_gold");
    public static final TagKey<Item> SHOVEL_UPGRADE_TO_NETHERITE_IRON = modItemTag("shovel/upgrade_to_netherite_iron");

    public static final TagKey<Item> SWORD_NETHERITE_DIAMOND = modItemTag("sword/netherite_diamond");
    public static final TagKey<Item> SWORD_NETHERITE_EMERALD = modItemTag("sword/netherite_emerald");
    public static final TagKey<Item> SWORD_NETHERITE_GOLD = modItemTag("sword/netherite_gold");
    public static final TagKey<Item> SWORD_NETHERITE_IRON = modItemTag("sword/netherite_iron");
    public static final TagKey<Item> SWORD_NETHERITE = modItemTag("sword/netherite");
    public static final TagKey<Item> SWORD_UPGRADE_TO_NETHERITE_DIAMOND = modItemTag("sword/upgrade_to_netherite_diamond");
    public static final TagKey<Item> SWORD_UPGRADE_TO_NETHERITE_EMERALD = modItemTag("sword/upgrade_to_netherite_emerald");
    public static final TagKey<Item> SWORD_UPGRADE_TO_NETHERITE_GOLD = modItemTag("sword/upgrade_to_netherite_gold");
    public static final TagKey<Item> SWORD_UPGRADE_TO_NETHERITE_IRON = modItemTag("sword/upgrade_to_netherite_iron");

    // "tiers" tags
    public static final TagKey<Item> TIER_ARMOR = modItemTag("tier/armor");
    public static final TagKey<Item> TIER_TOOLS = modItemTag("tier/tools");

    public static final TagKey<Item> TIER_ARMOR_NETHERITE_DIAMOND = modItemTag("tier/armor/netherite_diamond");
    public static final TagKey<Item> TIER_ARMOR_NETHERITE_EMERALD = modItemTag("tier/armor/netherite_emerald");
    public static final TagKey<Item> TIER_ARMOR_NETHERITE_GOLD = modItemTag("tier/armor/netherite_gold");
    public static final TagKey<Item> TIER_ARMOR_NETHERITE_IRON = modItemTag("tier/armor/netherite_iron");

    public static final TagKey<Item> TIER_TOOL_NETHERITE_DIAMOND = modItemTag("tier/tool/netherite_diamond");
    public static final TagKey<Item> TIER_TOOL_NETHERITE_EMERALD = modItemTag("tier/tool/netherite_emerald");
    public static final TagKey<Item> TIER_TOOL_NETHERITE_GOLD = modItemTag("tier/tool/netherite_gold");
    public static final TagKey<Item> TIER_TOOL_NETHERITE_IRON = modItemTag("tier/tool/netherite_iron");

    // REPAIR TAGS
    public static final TagKey<Item> REPAIRS_NETHERITE_IRON_ARMOR = modItemTag("repairs_netherite_iron_armor");
    public static final TagKey<Item> REPAIRS_NETHERITE_GOLD_ARMOR = modItemTag("repairs_netherite_gold_armor");
    public static final TagKey<Item> REPAIRS_NETHERITE_EMERALD_ARMOR = modItemTag("repairs_netherite_emerald_armor");
    public static final TagKey<Item> REPAIRS_NETHERITE_DIAMOND_ARMOR = modItemTag("repairs_netherite_diamond_armor");

    public static final TagKey<Item> REPAIRS_NETHERITE_IRON_TOOLS = modItemTag("repairs_netherite_iron_tools");
    public static final TagKey<Item> REPAIRS_NETHERITE_GOLD_TOOLS = modItemTag("repairs_netherite_gold_tools");
    public static final TagKey<Item> REPAIRS_NETHERITE_EMERALD_TOOLS = modItemTag("repairs_netherite_emerald_tools");
    public static final TagKey<Item> REPAIRS_NETHERITE_DIAMOND_TOOLS = modItemTag("repairs_netherite_diamond_tools");

    // "pacify armor" tags
    public static final TagKey<Item> PACIFY_PHANTOMS_ARMOR = modItemTag("pacify_phantoms_armor");
    public static final TagKey<Item> PACIFY_PIGLINS_ARMOR = modItemTag("pacify_piglins_armor");
    public static final TagKey<Item> PACIFY_ENDERMEN_ARMOR = modItemTag("pacify_endermen_armor");

    // additional drop tags
    public static final TagKey<Item> DROPS_ADDITIONAL_CROPS = modItemTag("drops_additional_crops");

    public static final TagKey<Item> DROPS_ADDITIONAL_IRON = modItemTag("drops_additional_iron");
    public static final TagKey<Item> DROPS_ADDITIONAL_GOLD = modItemTag("drops_additional_gold");
    public static final TagKey<Item> DROPS_ADDITIONAL_EMERALD = modItemTag("drops_additional_emerald");
    public static final TagKey<Item> DROPS_ADDITIONAL_DIAMOND = modItemTag("drops_additional_diamond");

    public static final TagKey<Item> DROPS_ADDITIONAL_PHANTOM_LOOT = modItemTag("drops_additional_phantom_loot");
    public static final TagKey<Item> DROPS_ADDITIONAL_ZOMBIFIED_PIGLIN_LOOT = modItemTag("drops_additional_zombified_piglin_loot");
    public static final TagKey<Item> DROPS_ADDITIONAL_PIGLIN_LOOT = modItemTag("drops_additional_piglin_loot");
    public static final TagKey<Item> DROPS_ADDITIONAL_ENDERMAN_LOOT = modItemTag("drops_additional_enderman_loot");

    // ENCHANTMENT TAGS
    public static final TagKey<Enchantment> PREVENTS_ADDITIONAL_ORE_DROPS = modEnchantmentTag("prevents_additional_ore_drops");

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

    /**
     * @param tagLoc Resource location of the tag
     * @return Enchantment tag
     */
    public static TagKey<Enchantment> enchantmentTag(ResourceLocation tagLoc)
    {
        return TagKey.create(Registries.ENCHANTMENT, tagLoc);
    }

    private static TagKey<Block> modBlockTag(String tagName)
    {
        return ModTags.blockTag(ResourceLocation.fromNamespaceAndPath(AdvancedNetherite.MOD_ID, tagName));
    }

    private static TagKey<Item> modItemTag(String tagName)
    {
        return ModTags.itemTag(ResourceLocation.fromNamespaceAndPath(AdvancedNetherite.MOD_ID, tagName));
    }

    private static TagKey<Enchantment> modEnchantmentTag(String tagName)
    {
        return ModTags.enchantmentTag(ResourceLocation.fromNamespaceAndPath(AdvancedNetherite.MOD_ID, tagName));
    }
}
