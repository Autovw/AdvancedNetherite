package com.autovw.advancednetherite.datagen.providers;

import com.autovw.advancednetherite.core.ModBlocks;
import com.autovw.advancednetherite.core.ModItems;
import com.autovw.advancednetherite.core.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.IntrinsicHolderTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;

import java.util.concurrent.CompletableFuture;

/**
 * @author Autovw
 */
public class ModItemTagsProvider extends IntrinsicHolderTagsProvider<Item>
{
    public ModItemTagsProvider(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> lookupProvider, String modId)
    {
        super(packOutput, Registries.ITEM, lookupProvider, item -> item.builtInRegistryHolder().key(), modId);
    }

    @Override
    protected void addTags(HolderLookup.Provider lookupProvider)
    {
        /* Mod Tags */
        tag(ModTags.NETHERITE_BLOCKITEMS)
                .add(ModBlocks.NETHERITE_IRON_BLOCK.asItem())
                .add(ModBlocks.NETHERITE_GOLD_BLOCK.asItem())
                .add(ModBlocks.NETHERITE_EMERALD_BLOCK.asItem())
                .add(ModBlocks.NETHERITE_DIAMOND_BLOCK.asItem());

        tag(ModTags.NETHERITE_INGOTS)
                .add(ModItems.NETHERITE_IRON_INGOT)
                .add(ModItems.NETHERITE_GOLD_INGOT)
                .add(ModItems.NETHERITE_EMERALD_INGOT)
                .add(ModItems.NETHERITE_DIAMOND_INGOT);

        tag(ModTags.UPGRADE_TO_NETHERITE_DIAMOND).addTag(ModTags.INGOTS_NETHERITES_DIAMOND);
        tag(ModTags.UPGRADE_TO_NETHERITE_EMERALD).addTag(ModTags.INGOTS_NETHERITES_EMERALD);
        tag(ModTags.UPGRADE_TO_NETHERITE_GOLD).addTag(ModTags.INGOTS_NETHERITES_GOLD);
        tag(ModTags.UPGRADE_TO_NETHERITE_IRON).addTag(ModTags.INGOTS_NETHERITES_IRON);

        // Axes
        tag(ModTags.AXE_NETHERITE_DIAMOND).add(ModItems.NETHERITE_DIAMOND_AXE);
        tag(ModTags.AXE_NETHERITE_EMERALD).add(ModItems.NETHERITE_EMERALD_AXE);
        tag(ModTags.AXE_NETHERITE_GOLD).add(ModItems.NETHERITE_GOLD_AXE);
        tag(ModTags.AXE_NETHERITE_IRON).add(ModItems.NETHERITE_IRON_AXE);
        tag(ModTags.AXE_NETHERITE).add(Items.NETHERITE_AXE);

        tag(ModTags.AXE_UPGRADE_TO_NETHERITE_DIAMOND).addTag(ModTags.AXE_NETHERITE_EMERALD);
        tag(ModTags.AXE_UPGRADE_TO_NETHERITE_EMERALD).addTag(ModTags.AXE_NETHERITE_GOLD);
        tag(ModTags.AXE_UPGRADE_TO_NETHERITE_GOLD).addTag(ModTags.AXE_NETHERITE_IRON);
        tag(ModTags.AXE_UPGRADE_TO_NETHERITE_IRON).addTag(ModTags.AXE_NETHERITE);

        // Boots
        tag(ModTags.BOOTS_NETHERITE_DIAMOND).add(ModItems.NETHERITE_DIAMOND_BOOTS);
        tag(ModTags.BOOTS_NETHERITE_EMERALD).add(ModItems.NETHERITE_EMERALD_BOOTS);
        tag(ModTags.BOOTS_NETHERITE_GOLD).add(ModItems.NETHERITE_GOLD_BOOTS);
        tag(ModTags.BOOTS_NETHERITE_IRON).add(ModItems.NETHERITE_IRON_BOOTS);
        tag(ModTags.BOOTS_NETHERITE).add(Items.NETHERITE_BOOTS);

        tag(ModTags.BOOTS_UPGRADE_TO_NETHERITE_DIAMOND).addTag(ModTags.BOOTS_NETHERITE_EMERALD);
        tag(ModTags.BOOTS_UPGRADE_TO_NETHERITE_EMERALD).addTag(ModTags.BOOTS_NETHERITE_GOLD);
        tag(ModTags.BOOTS_UPGRADE_TO_NETHERITE_GOLD).addTag(ModTags.BOOTS_NETHERITE_IRON);
        tag(ModTags.BOOTS_UPGRADE_TO_NETHERITE_IRON).addTag(ModTags.BOOTS_NETHERITE);

        // Chestplates
        tag(ModTags.CHESTPLATE_NETHERITE_DIAMOND).add(ModItems.NETHERITE_DIAMOND_CHESTPLATE);
        tag(ModTags.CHESTPLATE_NETHERITE_EMERALD).add(ModItems.NETHERITE_EMERALD_CHESTPLATE);
        tag(ModTags.CHESTPLATE_NETHERITE_GOLD).add(ModItems.NETHERITE_GOLD_CHESTPLATE);
        tag(ModTags.CHESTPLATE_NETHERITE_IRON).add(ModItems.NETHERITE_IRON_CHESTPLATE);
        tag(ModTags.CHESTPLATE_NETHERITE).add(Items.NETHERITE_CHESTPLATE);

        tag(ModTags.CHESTPLATE_UPGRADE_TO_NETHERITE_DIAMOND).addTag(ModTags.CHESTPLATE_NETHERITE_EMERALD);
        tag(ModTags.CHESTPLATE_UPGRADE_TO_NETHERITE_EMERALD).addTag(ModTags.CHESTPLATE_NETHERITE_GOLD);
        tag(ModTags.CHESTPLATE_UPGRADE_TO_NETHERITE_GOLD).addTag(ModTags.CHESTPLATE_NETHERITE_IRON);
        tag(ModTags.CHESTPLATE_UPGRADE_TO_NETHERITE_IRON).addTag(ModTags.CHESTPLATE_NETHERITE);

        // Helmets
        tag(ModTags.HELMET_NETHERITE_DIAMOND).add(ModItems.NETHERITE_DIAMOND_HELMET);
        tag(ModTags.HELMET_NETHERITE_EMERALD).add(ModItems.NETHERITE_EMERALD_HELMET);
        tag(ModTags.HELMET_NETHERITE_GOLD).add(ModItems.NETHERITE_GOLD_HELMET);
        tag(ModTags.HELMET_NETHERITE_IRON).add(ModItems.NETHERITE_IRON_HELMET);
        tag(ModTags.HELMET_NETHERITE).add(Items.NETHERITE_HELMET);

        tag(ModTags.HELMET_UPGRADE_TO_NETHERITE_DIAMOND).addTag(ModTags.HELMET_NETHERITE_EMERALD);
        tag(ModTags.HELMET_UPGRADE_TO_NETHERITE_EMERALD).addTag(ModTags.HELMET_NETHERITE_GOLD);
        tag(ModTags.HELMET_UPGRADE_TO_NETHERITE_GOLD).addTag(ModTags.HELMET_NETHERITE_IRON);
        tag(ModTags.HELMET_UPGRADE_TO_NETHERITE_IRON).addTag(ModTags.HELMET_NETHERITE);

        // Hoes
        tag(ModTags.HOE_NETHERITE_DIAMOND).add(ModItems.NETHERITE_DIAMOND_HOE);
        tag(ModTags.HOE_NETHERITE_EMERALD).add(ModItems.NETHERITE_EMERALD_HOE);
        tag(ModTags.HOE_NETHERITE_GOLD).add(ModItems.NETHERITE_GOLD_HOE);
        tag(ModTags.HOE_NETHERITE_IRON).add(ModItems.NETHERITE_IRON_HOE);
        tag(ModTags.HOE_NETHERITE).add(Items.NETHERITE_HOE);

        tag(ModTags.HOE_UPGRADE_TO_NETHERITE_DIAMOND).addTag(ModTags.HOE_NETHERITE_EMERALD);
        tag(ModTags.HOE_UPGRADE_TO_NETHERITE_EMERALD).addTag(ModTags.HOE_NETHERITE_GOLD);
        tag(ModTags.HOE_UPGRADE_TO_NETHERITE_GOLD).addTag(ModTags.HOE_NETHERITE_IRON);
        tag(ModTags.HOE_UPGRADE_TO_NETHERITE_IRON).addTag(ModTags.HOE_NETHERITE);

        // Ingots
        tag(ModTags.INGOTS_NETHERITES_DIAMOND).add(ModItems.NETHERITE_DIAMOND_INGOT);
        tag(ModTags.INGOTS_NETHERITES_EMERALD).add(ModItems.NETHERITE_EMERALD_INGOT);
        tag(ModTags.INGOTS_NETHERITES_GOLD).add(ModItems.NETHERITE_GOLD_INGOT);
        tag(ModTags.INGOTS_NETHERITES_IRON).add(ModItems.NETHERITE_IRON_INGOT);
        tag(ModTags.INGOTS_NETHERITES).add(Items.NETHERITE_INGOT);

        tag(ModTags.INGOTS_UPGRADE_TO_NETHERITE_DIAMOND).addTag(ModTags.INGOTS_NETHERITES_EMERALD);
        tag(ModTags.INGOTS_UPGRADE_TO_NETHERITE_EMERALD).addTag(ModTags.INGOTS_NETHERITES_GOLD);
        tag(ModTags.INGOTS_UPGRADE_TO_NETHERITE_GOLD).addTag(ModTags.INGOTS_NETHERITES_IRON);
        tag(ModTags.INGOTS_UPGRADE_TO_NETHERITE_IRON).addTag(ModTags.INGOTS_NETHERITES);

        // Leggings
        tag(ModTags.LEGGINGS_NETHERITE_DIAMOND).add(ModItems.NETHERITE_DIAMOND_LEGGINGS);
        tag(ModTags.LEGGINGS_NETHERITE_EMERALD).add(ModItems.NETHERITE_EMERALD_LEGGINGS);
        tag(ModTags.LEGGINGS_NETHERITE_GOLD).add(ModItems.NETHERITE_GOLD_LEGGINGS);
        tag(ModTags.LEGGINGS_NETHERITE_IRON).add(ModItems.NETHERITE_IRON_LEGGINGS);
        tag(ModTags.LEGGINGS_NETHERITE).add(Items.NETHERITE_LEGGINGS);

        tag(ModTags.LEGGINGS_UPGRADE_TO_NETHERITE_DIAMOND).addTag(ModTags.LEGGINGS_NETHERITE_EMERALD);
        tag(ModTags.LEGGINGS_UPGRADE_TO_NETHERITE_EMERALD).addTag(ModTags.LEGGINGS_NETHERITE_GOLD);
        tag(ModTags.LEGGINGS_UPGRADE_TO_NETHERITE_GOLD).addTag(ModTags.LEGGINGS_NETHERITE_IRON);
        tag(ModTags.LEGGINGS_UPGRADE_TO_NETHERITE_IRON).addTag(ModTags.LEGGINGS_NETHERITE);

        // Pickaxes
        tag(ModTags.PICKAXE_NETHERITE_DIAMOND).add(ModItems.NETHERITE_DIAMOND_PICKAXE);
        tag(ModTags.PICKAXE_NETHERITE_EMERALD).add(ModItems.NETHERITE_EMERALD_PICKAXE);
        tag(ModTags.PICKAXE_NETHERITE_GOLD).add(ModItems.NETHERITE_GOLD_PICKAXE);
        tag(ModTags.PICKAXE_NETHERITE_IRON).add(ModItems.NETHERITE_IRON_PICKAXE);
        tag(ModTags.PICKAXE_NETHERITE).add(Items.NETHERITE_PICKAXE);

        tag(ModTags.PICKAXE_UPGRADE_TO_NETHERITE_DIAMOND).addTag(ModTags.PICKAXE_NETHERITE_EMERALD);
        tag(ModTags.PICKAXE_UPGRADE_TO_NETHERITE_EMERALD).addTag(ModTags.PICKAXE_NETHERITE_GOLD);
        tag(ModTags.PICKAXE_UPGRADE_TO_NETHERITE_GOLD).addTag(ModTags.PICKAXE_NETHERITE_IRON);
        tag(ModTags.PICKAXE_UPGRADE_TO_NETHERITE_IRON).addTag(ModTags.PICKAXE_NETHERITE);

        // Shovels
        tag(ModTags.SHOVEL_NETHERITE_DIAMOND).add(ModItems.NETHERITE_DIAMOND_SHOVEL);
        tag(ModTags.SHOVEL_NETHERITE_EMERALD).add(ModItems.NETHERITE_EMERALD_SHOVEL);
        tag(ModTags.SHOVEL_NETHERITE_GOLD).add(ModItems.NETHERITE_GOLD_SHOVEL);
        tag(ModTags.SHOVEL_NETHERITE_IRON).add(ModItems.NETHERITE_IRON_SHOVEL);
        tag(ModTags.SHOVEL_NETHERITE).add(Items.NETHERITE_SHOVEL);

        tag(ModTags.SHOVEL_UPGRADE_TO_NETHERITE_DIAMOND).addTag(ModTags.SHOVEL_NETHERITE_EMERALD);
        tag(ModTags.SHOVEL_UPGRADE_TO_NETHERITE_EMERALD).addTag(ModTags.SHOVEL_NETHERITE_GOLD);
        tag(ModTags.SHOVEL_UPGRADE_TO_NETHERITE_GOLD).addTag(ModTags.SHOVEL_NETHERITE_IRON);
        tag(ModTags.SHOVEL_UPGRADE_TO_NETHERITE_IRON).addTag(ModTags.SHOVEL_NETHERITE);

        // Swords
        tag(ModTags.SWORD_NETHERITE_DIAMOND).add(ModItems.NETHERITE_DIAMOND_SWORD);
        tag(ModTags.SWORD_NETHERITE_EMERALD).add(ModItems.NETHERITE_EMERALD_SWORD);
        tag(ModTags.SWORD_NETHERITE_GOLD).add(ModItems.NETHERITE_GOLD_SWORD);
        tag(ModTags.SWORD_NETHERITE_IRON).add(ModItems.NETHERITE_IRON_SWORD);
        tag(ModTags.SWORD_NETHERITE).add(Items.NETHERITE_SWORD);

        tag(ModTags.SWORD_UPGRADE_TO_NETHERITE_DIAMOND).addTag(ModTags.SWORD_NETHERITE_EMERALD);
        tag(ModTags.SWORD_UPGRADE_TO_NETHERITE_EMERALD).addTag(ModTags.SWORD_NETHERITE_GOLD);
        tag(ModTags.SWORD_UPGRADE_TO_NETHERITE_GOLD).addTag(ModTags.SWORD_NETHERITE_IRON);
        tag(ModTags.SWORD_UPGRADE_TO_NETHERITE_IRON).addTag(ModTags.SWORD_NETHERITE);

        // Tiers
        tag(ModTags.TIER_ARMOR)
                .addTag(ModTags.TIER_ARMOR_NETHERITE_DIAMOND)
                .addTag(ModTags.TIER_ARMOR_NETHERITE_EMERALD)
                .addTag(ModTags.TIER_ARMOR_NETHERITE_GOLD)
                .addTag(ModTags.TIER_ARMOR_NETHERITE_IRON);
        tag(ModTags.TIER_TOOLS)
                .addTag(ModTags.TIER_TOOL_NETHERITE_DIAMOND)
                .addTag(ModTags.TIER_TOOL_NETHERITE_EMERALD)
                .addTag(ModTags.TIER_TOOL_NETHERITE_GOLD)
                .addTag(ModTags.TIER_TOOL_NETHERITE_IRON);

        tag(ModTags.TIER_ARMOR_NETHERITE_DIAMOND)
                .add(ModItems.NETHERITE_DIAMOND_HELMET)
                .add(ModItems.NETHERITE_DIAMOND_CHESTPLATE)
                .add(ModItems.NETHERITE_DIAMOND_LEGGINGS)
                .add(ModItems.NETHERITE_DIAMOND_BOOTS);
        tag(ModTags.TIER_ARMOR_NETHERITE_EMERALD)
                .add(ModItems.NETHERITE_EMERALD_HELMET)
                .add(ModItems.NETHERITE_EMERALD_CHESTPLATE)
                .add(ModItems.NETHERITE_EMERALD_LEGGINGS)
                .add(ModItems.NETHERITE_EMERALD_BOOTS);
        tag(ModTags.TIER_ARMOR_NETHERITE_GOLD)
                .add(ModItems.NETHERITE_GOLD_HELMET)
                .add(ModItems.NETHERITE_GOLD_CHESTPLATE)
                .add(ModItems.NETHERITE_GOLD_LEGGINGS)
                .add(ModItems.NETHERITE_GOLD_BOOTS);
        tag(ModTags.TIER_ARMOR_NETHERITE_IRON)
                .add(ModItems.NETHERITE_IRON_HELMET)
                .add(ModItems.NETHERITE_IRON_CHESTPLATE)
                .add(ModItems.NETHERITE_IRON_LEGGINGS)
                .add(ModItems.NETHERITE_IRON_BOOTS);

        tag(ModTags.TIER_TOOL_NETHERITE_DIAMOND)
                .add(ModItems.NETHERITE_DIAMOND_AXE)
                .add(ModItems.NETHERITE_DIAMOND_HOE)
                .add(ModItems.NETHERITE_DIAMOND_PICKAXE)
                .add(ModItems.NETHERITE_DIAMOND_SHOVEL)
                .add(ModItems.NETHERITE_DIAMOND_SWORD);
        tag(ModTags.TIER_TOOL_NETHERITE_EMERALD)
                .add(ModItems.NETHERITE_EMERALD_AXE)
                .add(ModItems.NETHERITE_EMERALD_HOE)
                .add(ModItems.NETHERITE_EMERALD_PICKAXE)
                .add(ModItems.NETHERITE_EMERALD_SHOVEL)
                .add(ModItems.NETHERITE_EMERALD_SWORD);
        tag(ModTags.TIER_TOOL_NETHERITE_GOLD)
                .add(ModItems.NETHERITE_GOLD_AXE)
                .add(ModItems.NETHERITE_GOLD_HOE)
                .add(ModItems.NETHERITE_GOLD_PICKAXE)
                .add(ModItems.NETHERITE_GOLD_SHOVEL)
                .add(ModItems.NETHERITE_GOLD_SWORD);
        tag(ModTags.TIER_TOOL_NETHERITE_IRON)
                .add(ModItems.NETHERITE_IRON_AXE)
                .add(ModItems.NETHERITE_IRON_HOE)
                .add(ModItems.NETHERITE_IRON_PICKAXE)
                .add(ModItems.NETHERITE_IRON_SHOVEL)
                .add(ModItems.NETHERITE_IRON_SWORD);

        // Repair tags
        tag(ModTags.REPAIRS_NETHERITE_IRON_ARMOR)
                .add(ModItems.NETHERITE_IRON_INGOT);
        tag(ModTags.REPAIRS_NETHERITE_GOLD_ARMOR)
                .add(ModItems.NETHERITE_GOLD_INGOT);
        tag(ModTags.REPAIRS_NETHERITE_EMERALD_ARMOR)
                .add(ModItems.NETHERITE_EMERALD_INGOT);
        tag(ModTags.REPAIRS_NETHERITE_DIAMOND_ARMOR)
                .add(ModItems.NETHERITE_DIAMOND_INGOT);

        tag(ModTags.REPAIRS_NETHERITE_IRON_TOOLS)
                .add(ModItems.NETHERITE_IRON_INGOT);
        tag(ModTags.REPAIRS_NETHERITE_GOLD_TOOLS)
                .add(ModItems.NETHERITE_GOLD_INGOT);
        tag(ModTags.REPAIRS_NETHERITE_EMERALD_TOOLS)
                .add(ModItems.NETHERITE_EMERALD_INGOT);
        tag(ModTags.REPAIRS_NETHERITE_DIAMOND_TOOLS)
                .add(ModItems.NETHERITE_DIAMOND_INGOT);

        // Pacify armor tags
        tag(ModTags.PACIFY_PHANTOMS_ARMOR)
                .addTag(ModTags.TIER_ARMOR_NETHERITE_IRON)
                .addTag(ModTags.TIER_ARMOR_NETHERITE_DIAMOND);
        tag(ModTags.PACIFY_PIGLINS_ARMOR)
                .addTag(ModTags.TIER_ARMOR_NETHERITE_GOLD)
                .addTag(ModTags.TIER_ARMOR_NETHERITE_DIAMOND);
        tag(ModTags.PACIFY_ENDERMEN_ARMOR)
                .addTag(ModTags.TIER_ARMOR_NETHERITE_EMERALD)
                .addTag(ModTags.TIER_ARMOR_NETHERITE_DIAMOND);

        // additional drop tags
        tag(ModTags.DROPS_ADDITIONAL_CROPS)
                .add(ModItems.NETHERITE_IRON_HOE)
                .add(ModItems.NETHERITE_GOLD_HOE)
                .add(ModItems.NETHERITE_EMERALD_HOE)
                .add(ModItems.NETHERITE_DIAMOND_HOE);

        tag(ModTags.DROPS_ADDITIONAL_IRON)
                .add(ModItems.NETHERITE_IRON_PICKAXE);
        tag(ModTags.DROPS_ADDITIONAL_GOLD)
                .add(ModItems.NETHERITE_GOLD_PICKAXE);
        tag(ModTags.DROPS_ADDITIONAL_EMERALD)
                .add(ModItems.NETHERITE_EMERALD_PICKAXE);
        tag(ModTags.DROPS_ADDITIONAL_DIAMOND)
                .add(ModItems.NETHERITE_DIAMOND_PICKAXE);

        tag(ModTags.DROPS_ADDITIONAL_PHANTOM_LOOT)
                .add(ModItems.NETHERITE_IRON_SWORD)
                .add(ModItems.NETHERITE_DIAMOND_SWORD);
        tag(ModTags.DROPS_ADDITIONAL_ZOMBIFIED_PIGLIN_LOOT)
                .add(ModItems.NETHERITE_GOLD_SWORD)
                .add(ModItems.NETHERITE_DIAMOND_SWORD);
        tag(ModTags.DROPS_ADDITIONAL_PIGLIN_LOOT)
                .add(ModItems.NETHERITE_GOLD_SWORD)
                .add(ModItems.NETHERITE_DIAMOND_SWORD);
        tag(ModTags.DROPS_ADDITIONAL_ENDERMAN_LOOT)
                .add(ModItems.NETHERITE_EMERALD_SWORD)
                .add(ModItems.NETHERITE_DIAMOND_SWORD);

        /* Vanilla tags */
        tag(ItemTags.BEACON_PAYMENT_ITEMS).addTag(ModTags.NETHERITE_INGOTS);

        tag(ItemTags.PIGLIN_LOVED)
                .add(ModBlocks.NETHERITE_GOLD_BLOCK.asItem())
                .add(ModItems.NETHERITE_GOLD_INGOT)
                .add(ModItems.NETHERITE_GOLD_HELMET)
                .add(ModItems.NETHERITE_GOLD_CHESTPLATE)
                .add(ModItems.NETHERITE_GOLD_LEGGINGS)
                .add(ModItems.NETHERITE_GOLD_BOOTS)
                .add(ModItems.NETHERITE_GOLD_AXE)
                .add(ModItems.NETHERITE_GOLD_HOE)
                .add(ModItems.NETHERITE_GOLD_PICKAXE)
                .add(ModItems.NETHERITE_GOLD_SHOVEL)
                .add(ModItems.NETHERITE_GOLD_SWORD);

        tag(ItemTags.PIGLIN_SAFE_ARMOR)
                .addTag(ModTags.PACIFY_PIGLINS_ARMOR);

        tag(ItemTags.CLUSTER_MAX_HARVESTABLES)
                .add(ModItems.NETHERITE_IRON_PICKAXE)
                .add(ModItems.NETHERITE_GOLD_PICKAXE)
                .add(ModItems.NETHERITE_EMERALD_PICKAXE)
                .add(ModItems.NETHERITE_DIAMOND_PICKAXE);

        tag(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.NETHERITE_DIAMOND_HELMET)
                .add(ModItems.NETHERITE_DIAMOND_CHESTPLATE)
                .add(ModItems.NETHERITE_DIAMOND_LEGGINGS)
                .add(ModItems.NETHERITE_DIAMOND_BOOTS)
                .add(ModItems.NETHERITE_EMERALD_HELMET)
                .add(ModItems.NETHERITE_EMERALD_CHESTPLATE)
                .add(ModItems.NETHERITE_EMERALD_LEGGINGS)
                .add(ModItems.NETHERITE_EMERALD_BOOTS)
                .add(ModItems.NETHERITE_GOLD_HELMET)
                .add(ModItems.NETHERITE_GOLD_CHESTPLATE)
                .add(ModItems.NETHERITE_GOLD_LEGGINGS)
                .add(ModItems.NETHERITE_GOLD_BOOTS)
                .add(ModItems.NETHERITE_IRON_HELMET)
                .add(ModItems.NETHERITE_IRON_CHESTPLATE)
                .add(ModItems.NETHERITE_IRON_LEGGINGS)
                .add(ModItems.NETHERITE_IRON_BOOTS);

        tag(ItemTags.HEAD_ARMOR)
                .add(ModItems.NETHERITE_DIAMOND_HELMET)
                .add(ModItems.NETHERITE_EMERALD_HELMET)
                .add(ModItems.NETHERITE_GOLD_HELMET)
                .add(ModItems.NETHERITE_IRON_HELMET);
        tag(ItemTags.CHEST_ARMOR)
                .add(ModItems.NETHERITE_DIAMOND_CHESTPLATE)
                .add(ModItems.NETHERITE_EMERALD_CHESTPLATE)
                .add(ModItems.NETHERITE_GOLD_CHESTPLATE)
                .add(ModItems.NETHERITE_IRON_CHESTPLATE);
        tag(ItemTags.LEG_ARMOR)
                .add(ModItems.NETHERITE_DIAMOND_LEGGINGS)
                .add(ModItems.NETHERITE_EMERALD_LEGGINGS)
                .add(ModItems.NETHERITE_GOLD_LEGGINGS)
                .add(ModItems.NETHERITE_IRON_LEGGINGS);
        tag(ItemTags.FOOT_ARMOR)
                .add(ModItems.NETHERITE_DIAMOND_BOOTS)
                .add(ModItems.NETHERITE_EMERALD_BOOTS)
                .add(ModItems.NETHERITE_GOLD_BOOTS)
                .add(ModItems.NETHERITE_IRON_BOOTS);

        tag(ItemTags.AXES)
                .add(ModItems.NETHERITE_DIAMOND_AXE)
                .add(ModItems.NETHERITE_EMERALD_AXE)
                .add(ModItems.NETHERITE_GOLD_AXE)
                .add(ModItems.NETHERITE_IRON_AXE);
        tag(ItemTags.HOES)
                .add(ModItems.NETHERITE_DIAMOND_HOE)
                .add(ModItems.NETHERITE_EMERALD_HOE)
                .add(ModItems.NETHERITE_GOLD_HOE)
                .add(ModItems.NETHERITE_IRON_HOE);
        tag(ItemTags.PICKAXES)
                .add(ModItems.NETHERITE_DIAMOND_PICKAXE)
                .add(ModItems.NETHERITE_EMERALD_PICKAXE)
                .add(ModItems.NETHERITE_GOLD_PICKAXE)
                .add(ModItems.NETHERITE_IRON_PICKAXE);
        tag(ItemTags.SHOVELS)
                .add(ModItems.NETHERITE_DIAMOND_SHOVEL)
                .add(ModItems.NETHERITE_EMERALD_SHOVEL)
                .add(ModItems.NETHERITE_GOLD_SHOVEL)
                .add(ModItems.NETHERITE_IRON_SHOVEL);
        tag(ItemTags.SWORDS)
                .add(ModItems.NETHERITE_DIAMOND_SWORD)
                .add(ModItems.NETHERITE_EMERALD_SWORD)
                .add(ModItems.NETHERITE_GOLD_SWORD)
                .add(ModItems.NETHERITE_IRON_SWORD);
    }
}
