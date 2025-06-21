package com.autovw.advancednetherite.datagen.providers;

import com.autovw.advancednetherite.core.ModItems;
import com.autovw.advancednetherite.core.util.FabricModTags;
import com.autovw.advancednetherite.core.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;

import java.util.concurrent.CompletableFuture;

/**
 * @author Autovw
 */
public class ModItemTagsProvider extends FabricTagProvider.ItemTagProvider
{
    public ModItemTagsProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> completableFuture)
    {
        super(output, completableFuture, null);
    }

    @Override
    protected void addTags(HolderLookup.Provider arg)
    {
        // Mod item tags
        valueLookupBuilder(ModTags.NETHERITE_BLOCKITEMS)
                .add(ModItems.NETHERITE_IRON_BLOCK)
                .add(ModItems.NETHERITE_GOLD_BLOCK)
                .add(ModItems.NETHERITE_EMERALD_BLOCK)
                .add(ModItems.NETHERITE_DIAMOND_BLOCK);
        valueLookupBuilder(ModTags.NETHERITE_INGOTS)
                .add(ModItems.NETHERITE_IRON_INGOT)
                .add(ModItems.NETHERITE_GOLD_INGOT)
                .add(ModItems.NETHERITE_EMERALD_INGOT)
                .add(ModItems.NETHERITE_DIAMOND_INGOT);
        valueLookupBuilder(ModTags.UPGRADE_TO_NETHERITE_IRON).addTag(ModTags.INGOTS_NETHERITES_IRON);
        valueLookupBuilder(ModTags.UPGRADE_TO_NETHERITE_GOLD).addTag(ModTags.INGOTS_NETHERITES_GOLD);
        valueLookupBuilder(ModTags.UPGRADE_TO_NETHERITE_EMERALD).addTag(ModTags.INGOTS_NETHERITES_EMERALD);
        valueLookupBuilder(ModTags.UPGRADE_TO_NETHERITE_DIAMOND).addTag(ModTags.INGOTS_NETHERITES_DIAMOND);

        valueLookupBuilder(ModTags.INGOTS_NETHERITES).add(Items.NETHERITE_INGOT);
        valueLookupBuilder(ModTags.INGOTS_NETHERITES_IRON).add(ModItems.NETHERITE_IRON_INGOT);
        valueLookupBuilder(ModTags.INGOTS_NETHERITES_GOLD).add(ModItems.NETHERITE_GOLD_INGOT);
        valueLookupBuilder(ModTags.INGOTS_NETHERITES_EMERALD).add(ModItems.NETHERITE_EMERALD_INGOT);
        valueLookupBuilder(ModTags.INGOTS_NETHERITES_DIAMOND).add(ModItems.NETHERITE_DIAMOND_INGOT);
        valueLookupBuilder(ModTags.INGOTS_UPGRADE_TO_NETHERITE_IRON).addTag(ModTags.INGOTS_NETHERITES);
        valueLookupBuilder(ModTags.INGOTS_UPGRADE_TO_NETHERITE_GOLD).addTag(ModTags.INGOTS_NETHERITES_IRON);
        valueLookupBuilder(ModTags.INGOTS_UPGRADE_TO_NETHERITE_EMERALD).addTag(ModTags.INGOTS_NETHERITES_GOLD);
        valueLookupBuilder(ModTags.INGOTS_UPGRADE_TO_NETHERITE_DIAMOND).addTag(ModTags.INGOTS_NETHERITES_EMERALD);

        valueLookupBuilder(ModTags.AXE_NETHERITE).add(Items.NETHERITE_AXE);
        valueLookupBuilder(ModTags.AXE_NETHERITE_IRON).add(ModItems.NETHERITE_IRON_AXE);
        valueLookupBuilder(ModTags.AXE_NETHERITE_GOLD).add(ModItems.NETHERITE_GOLD_AXE);
        valueLookupBuilder(ModTags.AXE_NETHERITE_EMERALD).add(ModItems.NETHERITE_EMERALD_AXE);
        valueLookupBuilder(ModTags.AXE_NETHERITE_DIAMOND).add(ModItems.NETHERITE_DIAMOND_AXE);
        valueLookupBuilder(ModTags.AXE_UPGRADE_TO_NETHERITE_IRON).addTag(ModTags.AXE_NETHERITE);
        valueLookupBuilder(ModTags.AXE_UPGRADE_TO_NETHERITE_GOLD).addTag(ModTags.AXE_NETHERITE_IRON);
        valueLookupBuilder(ModTags.AXE_UPGRADE_TO_NETHERITE_EMERALD).addTag(ModTags.AXE_NETHERITE_GOLD);
        valueLookupBuilder(ModTags.AXE_UPGRADE_TO_NETHERITE_DIAMOND).addTag(ModTags.AXE_NETHERITE_EMERALD);

        valueLookupBuilder(ModTags.HOE_NETHERITE).add(Items.NETHERITE_HOE);
        valueLookupBuilder(ModTags.HOE_NETHERITE_IRON).add(ModItems.NETHERITE_IRON_HOE);
        valueLookupBuilder(ModTags.HOE_NETHERITE_GOLD).add(ModItems.NETHERITE_GOLD_HOE);
        valueLookupBuilder(ModTags.HOE_NETHERITE_EMERALD).add(ModItems.NETHERITE_EMERALD_HOE);
        valueLookupBuilder(ModTags.HOE_NETHERITE_DIAMOND).add(ModItems.NETHERITE_DIAMOND_HOE);
        valueLookupBuilder(ModTags.HOE_UPGRADE_TO_NETHERITE_IRON).addTag(ModTags.HOE_NETHERITE);
        valueLookupBuilder(ModTags.HOE_UPGRADE_TO_NETHERITE_GOLD).addTag(ModTags.HOE_NETHERITE_IRON);
        valueLookupBuilder(ModTags.HOE_UPGRADE_TO_NETHERITE_EMERALD).addTag(ModTags.HOE_NETHERITE_GOLD);
        valueLookupBuilder(ModTags.HOE_UPGRADE_TO_NETHERITE_DIAMOND).addTag(ModTags.HOE_NETHERITE_EMERALD);

        valueLookupBuilder(ModTags.PICKAXE_NETHERITE).add(Items.NETHERITE_PICKAXE);
        valueLookupBuilder(ModTags.PICKAXE_NETHERITE_IRON).add(ModItems.NETHERITE_IRON_PICKAXE);
        valueLookupBuilder(ModTags.PICKAXE_NETHERITE_GOLD).add(ModItems.NETHERITE_GOLD_PICKAXE);
        valueLookupBuilder(ModTags.PICKAXE_NETHERITE_EMERALD).add(ModItems.NETHERITE_EMERALD_PICKAXE);
        valueLookupBuilder(ModTags.PICKAXE_NETHERITE_DIAMOND).add(ModItems.NETHERITE_DIAMOND_PICKAXE);
        valueLookupBuilder(ModTags.PICKAXE_UPGRADE_TO_NETHERITE_IRON).addTag(ModTags.PICKAXE_NETHERITE);
        valueLookupBuilder(ModTags.PICKAXE_UPGRADE_TO_NETHERITE_GOLD).addTag(ModTags.PICKAXE_NETHERITE_IRON);
        valueLookupBuilder(ModTags.PICKAXE_UPGRADE_TO_NETHERITE_EMERALD).addTag(ModTags.PICKAXE_NETHERITE_GOLD);
        valueLookupBuilder(ModTags.PICKAXE_UPGRADE_TO_NETHERITE_DIAMOND).addTag(ModTags.PICKAXE_NETHERITE_EMERALD);

        valueLookupBuilder(ModTags.SHOVEL_NETHERITE).add(Items.NETHERITE_SHOVEL);
        valueLookupBuilder(ModTags.SHOVEL_NETHERITE_IRON).add(ModItems.NETHERITE_IRON_SHOVEL);
        valueLookupBuilder(ModTags.SHOVEL_NETHERITE_GOLD).add(ModItems.NETHERITE_GOLD_SHOVEL);
        valueLookupBuilder(ModTags.SHOVEL_NETHERITE_EMERALD).add(ModItems.NETHERITE_EMERALD_SHOVEL);
        valueLookupBuilder(ModTags.SHOVEL_NETHERITE_DIAMOND).add(ModItems.NETHERITE_DIAMOND_SHOVEL);
        valueLookupBuilder(ModTags.SHOVEL_UPGRADE_TO_NETHERITE_IRON).addTag(ModTags.SHOVEL_NETHERITE);
        valueLookupBuilder(ModTags.SHOVEL_UPGRADE_TO_NETHERITE_GOLD).addTag(ModTags.SHOVEL_NETHERITE_IRON);
        valueLookupBuilder(ModTags.SHOVEL_UPGRADE_TO_NETHERITE_EMERALD).addTag(ModTags.SHOVEL_NETHERITE_GOLD);
        valueLookupBuilder(ModTags.SHOVEL_UPGRADE_TO_NETHERITE_DIAMOND).addTag(ModTags.SHOVEL_NETHERITE_EMERALD);

        valueLookupBuilder(ModTags.SWORD_NETHERITE).add(Items.NETHERITE_SWORD);
        valueLookupBuilder(ModTags.SWORD_NETHERITE_IRON).add(ModItems.NETHERITE_IRON_SWORD);
        valueLookupBuilder(ModTags.SWORD_NETHERITE_GOLD).add(ModItems.NETHERITE_GOLD_SWORD);
        valueLookupBuilder(ModTags.SWORD_NETHERITE_EMERALD).add(ModItems.NETHERITE_EMERALD_SWORD);
        valueLookupBuilder(ModTags.SWORD_NETHERITE_DIAMOND).add(ModItems.NETHERITE_DIAMOND_SWORD);
        valueLookupBuilder(ModTags.SWORD_UPGRADE_TO_NETHERITE_IRON).addTag(ModTags.SWORD_NETHERITE);
        valueLookupBuilder(ModTags.SWORD_UPGRADE_TO_NETHERITE_GOLD).addTag(ModTags.SWORD_NETHERITE_IRON);
        valueLookupBuilder(ModTags.SWORD_UPGRADE_TO_NETHERITE_EMERALD).addTag(ModTags.SWORD_NETHERITE_GOLD);
        valueLookupBuilder(ModTags.SWORD_UPGRADE_TO_NETHERITE_DIAMOND).addTag(ModTags.SWORD_NETHERITE_EMERALD);

        valueLookupBuilder(ModTags.HELMET_NETHERITE).add(Items.NETHERITE_HELMET);
        valueLookupBuilder(ModTags.HELMET_NETHERITE_IRON).add(ModItems.NETHERITE_IRON_HELMET);
        valueLookupBuilder(ModTags.HELMET_NETHERITE_GOLD).add(ModItems.NETHERITE_GOLD_HELMET);
        valueLookupBuilder(ModTags.HELMET_NETHERITE_EMERALD).add(ModItems.NETHERITE_EMERALD_HELMET);
        valueLookupBuilder(ModTags.HELMET_NETHERITE_DIAMOND).add(ModItems.NETHERITE_DIAMOND_HELMET);
        valueLookupBuilder(ModTags.HELMET_UPGRADE_TO_NETHERITE_IRON).addTag(ModTags.HELMET_NETHERITE);
        valueLookupBuilder(ModTags.HELMET_UPGRADE_TO_NETHERITE_GOLD).addTag(ModTags.HELMET_NETHERITE_IRON);
        valueLookupBuilder(ModTags.HELMET_UPGRADE_TO_NETHERITE_EMERALD).addTag(ModTags.HELMET_NETHERITE_GOLD);
        valueLookupBuilder(ModTags.HELMET_UPGRADE_TO_NETHERITE_DIAMOND).addTag(ModTags.HELMET_NETHERITE_EMERALD);

        valueLookupBuilder(ModTags.CHESTPLATE_NETHERITE).add(Items.NETHERITE_CHESTPLATE);
        valueLookupBuilder(ModTags.CHESTPLATE_NETHERITE_IRON).add(ModItems.NETHERITE_IRON_CHESTPLATE);
        valueLookupBuilder(ModTags.CHESTPLATE_NETHERITE_GOLD).add(ModItems.NETHERITE_GOLD_CHESTPLATE);
        valueLookupBuilder(ModTags.CHESTPLATE_NETHERITE_EMERALD).add(ModItems.NETHERITE_EMERALD_CHESTPLATE);
        valueLookupBuilder(ModTags.CHESTPLATE_NETHERITE_DIAMOND).add(ModItems.NETHERITE_DIAMOND_CHESTPLATE);
        valueLookupBuilder(ModTags.CHESTPLATE_UPGRADE_TO_NETHERITE_IRON).addTag(ModTags.CHESTPLATE_NETHERITE);
        valueLookupBuilder(ModTags.CHESTPLATE_UPGRADE_TO_NETHERITE_GOLD).addTag(ModTags.CHESTPLATE_NETHERITE_IRON);
        valueLookupBuilder(ModTags.CHESTPLATE_UPGRADE_TO_NETHERITE_EMERALD).addTag(ModTags.CHESTPLATE_NETHERITE_GOLD);
        valueLookupBuilder(ModTags.CHESTPLATE_UPGRADE_TO_NETHERITE_DIAMOND).addTag(ModTags.CHESTPLATE_NETHERITE_EMERALD);

        valueLookupBuilder(ModTags.LEGGINGS_NETHERITE).add(Items.NETHERITE_LEGGINGS);
        valueLookupBuilder(ModTags.LEGGINGS_NETHERITE_IRON).add(ModItems.NETHERITE_IRON_LEGGINGS);
        valueLookupBuilder(ModTags.LEGGINGS_NETHERITE_GOLD).add(ModItems.NETHERITE_GOLD_LEGGINGS);
        valueLookupBuilder(ModTags.LEGGINGS_NETHERITE_EMERALD).add(ModItems.NETHERITE_EMERALD_LEGGINGS);
        valueLookupBuilder(ModTags.LEGGINGS_NETHERITE_DIAMOND).add(ModItems.NETHERITE_DIAMOND_LEGGINGS);
        valueLookupBuilder(ModTags.LEGGINGS_UPGRADE_TO_NETHERITE_IRON).addTag(ModTags.LEGGINGS_NETHERITE);
        valueLookupBuilder(ModTags.LEGGINGS_UPGRADE_TO_NETHERITE_GOLD).addTag(ModTags.LEGGINGS_NETHERITE_IRON);
        valueLookupBuilder(ModTags.LEGGINGS_UPGRADE_TO_NETHERITE_EMERALD).addTag(ModTags.LEGGINGS_NETHERITE_GOLD);
        valueLookupBuilder(ModTags.LEGGINGS_UPGRADE_TO_NETHERITE_DIAMOND).addTag(ModTags.LEGGINGS_NETHERITE_EMERALD);

        valueLookupBuilder(ModTags.BOOTS_NETHERITE).add(Items.NETHERITE_BOOTS);
        valueLookupBuilder(ModTags.BOOTS_NETHERITE_IRON).add(ModItems.NETHERITE_IRON_BOOTS);
        valueLookupBuilder(ModTags.BOOTS_NETHERITE_GOLD).add(ModItems.NETHERITE_GOLD_BOOTS);
        valueLookupBuilder(ModTags.BOOTS_NETHERITE_EMERALD).add(ModItems.NETHERITE_EMERALD_BOOTS);
        valueLookupBuilder(ModTags.BOOTS_NETHERITE_DIAMOND).add(ModItems.NETHERITE_DIAMOND_BOOTS);
        valueLookupBuilder(ModTags.BOOTS_UPGRADE_TO_NETHERITE_IRON).addTag(ModTags.BOOTS_NETHERITE);
        valueLookupBuilder(ModTags.BOOTS_UPGRADE_TO_NETHERITE_GOLD).addTag(ModTags.BOOTS_NETHERITE_IRON);
        valueLookupBuilder(ModTags.BOOTS_UPGRADE_TO_NETHERITE_EMERALD).addTag(ModTags.BOOTS_NETHERITE_GOLD);
        valueLookupBuilder(ModTags.BOOTS_UPGRADE_TO_NETHERITE_DIAMOND).addTag(ModTags.BOOTS_NETHERITE_EMERALD);

        // tiers
        valueLookupBuilder(ModTags.TIER_ARMOR)
                .addTag(ModTags.TIER_ARMOR_NETHERITE_IRON)
                .addTag(ModTags.TIER_ARMOR_NETHERITE_GOLD)
                .addTag(ModTags.TIER_ARMOR_NETHERITE_EMERALD)
                .addTag(ModTags.TIER_ARMOR_NETHERITE_DIAMOND);
        valueLookupBuilder(ModTags.TIER_ARMOR_NETHERITE_IRON)
                .add(ModItems.NETHERITE_IRON_HELMET)
                .add(ModItems.NETHERITE_IRON_CHESTPLATE)
                .add(ModItems.NETHERITE_IRON_LEGGINGS)
                .add(ModItems.NETHERITE_IRON_BOOTS);
        valueLookupBuilder(ModTags.TIER_ARMOR_NETHERITE_GOLD)
                .add(ModItems.NETHERITE_GOLD_HELMET)
                .add(ModItems.NETHERITE_GOLD_CHESTPLATE)
                .add(ModItems.NETHERITE_GOLD_LEGGINGS)
                .add(ModItems.NETHERITE_GOLD_BOOTS);
        valueLookupBuilder(ModTags.TIER_ARMOR_NETHERITE_EMERALD)
                .add(ModItems.NETHERITE_EMERALD_HELMET)
                .add(ModItems.NETHERITE_EMERALD_CHESTPLATE)
                .add(ModItems.NETHERITE_EMERALD_LEGGINGS)
                .add(ModItems.NETHERITE_EMERALD_BOOTS);
        valueLookupBuilder(ModTags.TIER_ARMOR_NETHERITE_DIAMOND)
                .add(ModItems.NETHERITE_DIAMOND_HELMET)
                .add(ModItems.NETHERITE_DIAMOND_CHESTPLATE)
                .add(ModItems.NETHERITE_DIAMOND_LEGGINGS)
                .add(ModItems.NETHERITE_DIAMOND_BOOTS);
        valueLookupBuilder(ModTags.TIER_TOOLS)
                .addTag(ModTags.TIER_TOOL_NETHERITE_IRON)
                .addTag(ModTags.TIER_TOOL_NETHERITE_GOLD)
                .addTag(ModTags.TIER_TOOL_NETHERITE_EMERALD)
                .addTag(ModTags.TIER_TOOL_NETHERITE_DIAMOND);
        valueLookupBuilder(ModTags.TIER_TOOL_NETHERITE_IRON)
                .add(ModItems.NETHERITE_IRON_AXE)
                .add(ModItems.NETHERITE_IRON_HOE)
                .add(ModItems.NETHERITE_IRON_PICKAXE)
                .add(ModItems.NETHERITE_IRON_SHOVEL)
                .add(ModItems.NETHERITE_IRON_SWORD);
        valueLookupBuilder(ModTags.TIER_TOOL_NETHERITE_GOLD)
                .add(ModItems.NETHERITE_GOLD_AXE)
                .add(ModItems.NETHERITE_GOLD_HOE)
                .add(ModItems.NETHERITE_GOLD_PICKAXE)
                .add(ModItems.NETHERITE_GOLD_SHOVEL)
                .add(ModItems.NETHERITE_GOLD_SWORD);
        valueLookupBuilder(ModTags.TIER_TOOL_NETHERITE_EMERALD)
                .add(ModItems.NETHERITE_EMERALD_AXE)
                .add(ModItems.NETHERITE_EMERALD_HOE)
                .add(ModItems.NETHERITE_EMERALD_PICKAXE)
                .add(ModItems.NETHERITE_EMERALD_SHOVEL)
                .add(ModItems.NETHERITE_EMERALD_SWORD);
        valueLookupBuilder(ModTags.TIER_TOOL_NETHERITE_DIAMOND)
                .add(ModItems.NETHERITE_DIAMOND_AXE)
                .add(ModItems.NETHERITE_DIAMOND_HOE)
                .add(ModItems.NETHERITE_DIAMOND_PICKAXE)
                .add(ModItems.NETHERITE_DIAMOND_SHOVEL)
                .add(ModItems.NETHERITE_DIAMOND_SWORD);

        // Repair tags
        valueLookupBuilder(ModTags.REPAIRS_NETHERITE_IRON_ARMOR)
                .add(ModItems.NETHERITE_IRON_INGOT);
        valueLookupBuilder(ModTags.REPAIRS_NETHERITE_GOLD_ARMOR)
                .add(ModItems.NETHERITE_GOLD_INGOT);
        valueLookupBuilder(ModTags.REPAIRS_NETHERITE_EMERALD_ARMOR)
                .add(ModItems.NETHERITE_EMERALD_INGOT);
        valueLookupBuilder(ModTags.REPAIRS_NETHERITE_DIAMOND_ARMOR)
                .add(ModItems.NETHERITE_DIAMOND_INGOT);

        valueLookupBuilder(ModTags.REPAIRS_NETHERITE_IRON_TOOLS)
                .add(ModItems.NETHERITE_IRON_INGOT);
        valueLookupBuilder(ModTags.REPAIRS_NETHERITE_GOLD_TOOLS)
                .add(ModItems.NETHERITE_GOLD_INGOT);
        valueLookupBuilder(ModTags.REPAIRS_NETHERITE_EMERALD_TOOLS)
                .add(ModItems.NETHERITE_EMERALD_INGOT);
        valueLookupBuilder(ModTags.REPAIRS_NETHERITE_DIAMOND_TOOLS)
                .add(ModItems.NETHERITE_DIAMOND_INGOT);

        // Pacify armor tags
        valueLookupBuilder(ModTags.PACIFY_PHANTOMS_ARMOR)
                .addTag(ModTags.TIER_ARMOR_NETHERITE_IRON)
                .addTag(ModTags.TIER_ARMOR_NETHERITE_DIAMOND);
        valueLookupBuilder(ModTags.PACIFY_PIGLINS_ARMOR)
                .addTag(ModTags.TIER_ARMOR_NETHERITE_GOLD)
                .addTag(ModTags.TIER_ARMOR_NETHERITE_DIAMOND);
        valueLookupBuilder(ModTags.PACIFY_ENDERMEN_ARMOR)
                .addTag(ModTags.TIER_ARMOR_NETHERITE_EMERALD)
                .addTag(ModTags.TIER_ARMOR_NETHERITE_DIAMOND);

        // additional drop tags
        valueLookupBuilder(ModTags.DROPS_ADDITIONAL_CROPS)
                .add(ModItems.NETHERITE_IRON_HOE)
                .add(ModItems.NETHERITE_GOLD_HOE)
                .add(ModItems.NETHERITE_EMERALD_HOE)
                .add(ModItems.NETHERITE_DIAMOND_HOE);

        valueLookupBuilder(ModTags.DROPS_ADDITIONAL_IRON)
                .add(ModItems.NETHERITE_IRON_PICKAXE);
        valueLookupBuilder(ModTags.DROPS_ADDITIONAL_GOLD)
                .add(ModItems.NETHERITE_GOLD_PICKAXE);
        valueLookupBuilder(ModTags.DROPS_ADDITIONAL_EMERALD)
                .add(ModItems.NETHERITE_EMERALD_PICKAXE);
        valueLookupBuilder(ModTags.DROPS_ADDITIONAL_DIAMOND)
                .add(ModItems.NETHERITE_DIAMOND_PICKAXE);

        valueLookupBuilder(ModTags.DROPS_ADDITIONAL_PHANTOM_LOOT)
                .add(ModItems.NETHERITE_IRON_SWORD)
                .add(ModItems.NETHERITE_DIAMOND_SWORD);
        valueLookupBuilder(ModTags.DROPS_ADDITIONAL_ZOMBIFIED_PIGLIN_LOOT)
                .add(ModItems.NETHERITE_GOLD_SWORD)
                .add(ModItems.NETHERITE_DIAMOND_SWORD);
        valueLookupBuilder(ModTags.DROPS_ADDITIONAL_PIGLIN_LOOT)
                .add(ModItems.NETHERITE_GOLD_SWORD)
                .add(ModItems.NETHERITE_DIAMOND_SWORD);
        valueLookupBuilder(ModTags.DROPS_ADDITIONAL_ENDERMAN_LOOT)
                .add(ModItems.NETHERITE_EMERALD_SWORD)
                .add(ModItems.NETHERITE_DIAMOND_SWORD);


        // Vanilla item tags
        valueLookupBuilder(ItemTags.BEACON_PAYMENT_ITEMS)
                .addTag(ModTags.NETHERITE_INGOTS);
        valueLookupBuilder(ItemTags.PIGLIN_LOVED)
                .add(ModItems.NETHERITE_GOLD_BLOCK)
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
        valueLookupBuilder(ItemTags.PIGLIN_SAFE_ARMOR)
                .addTag(ModTags.PACIFY_PIGLINS_ARMOR);

        valueLookupBuilder(ItemTags.CLUSTER_MAX_HARVESTABLES)
                .add(ModItems.NETHERITE_IRON_PICKAXE)
                .add(ModItems.NETHERITE_GOLD_PICKAXE)
                .add(ModItems.NETHERITE_EMERALD_PICKAXE)
                .add(ModItems.NETHERITE_DIAMOND_PICKAXE);
        valueLookupBuilder(ItemTags.TRIMMABLE_ARMOR)
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

        valueLookupBuilder(ItemTags.HEAD_ARMOR)
                .add(ModItems.NETHERITE_IRON_HELMET)
                .add(ModItems.NETHERITE_GOLD_HELMET)
                .add(ModItems.NETHERITE_EMERALD_HELMET)
                .add(ModItems.NETHERITE_DIAMOND_HELMET);
        valueLookupBuilder(ItemTags.CHEST_ARMOR)
                .add(ModItems.NETHERITE_IRON_CHESTPLATE)
                .add(ModItems.NETHERITE_GOLD_CHESTPLATE)
                .add(ModItems.NETHERITE_EMERALD_CHESTPLATE)
                .add(ModItems.NETHERITE_DIAMOND_CHESTPLATE);
        valueLookupBuilder(ItemTags.LEG_ARMOR)
                .add(ModItems.NETHERITE_IRON_LEGGINGS)
                .add(ModItems.NETHERITE_GOLD_LEGGINGS)
                .add(ModItems.NETHERITE_EMERALD_LEGGINGS)
                .add(ModItems.NETHERITE_DIAMOND_LEGGINGS);
        valueLookupBuilder(ItemTags.FOOT_ARMOR)
                .add(ModItems.NETHERITE_IRON_BOOTS)
                .add(ModItems.NETHERITE_GOLD_BOOTS)
                .add(ModItems.NETHERITE_EMERALD_BOOTS)
                .add(ModItems.NETHERITE_DIAMOND_BOOTS);

        valueLookupBuilder(ItemTags.AXES)
                .add(ModItems.NETHERITE_IRON_AXE)
                .add(ModItems.NETHERITE_GOLD_AXE)
                .add(ModItems.NETHERITE_EMERALD_AXE)
                .add(ModItems.NETHERITE_DIAMOND_AXE);
        valueLookupBuilder(ItemTags.HOES)
                .add(ModItems.NETHERITE_IRON_HOE)
                .add(ModItems.NETHERITE_GOLD_HOE)
                .add(ModItems.NETHERITE_EMERALD_HOE)
                .add(ModItems.NETHERITE_DIAMOND_HOE);
        valueLookupBuilder(ItemTags.PICKAXES)
                .add(ModItems.NETHERITE_IRON_PICKAXE)
                .add(ModItems.NETHERITE_GOLD_PICKAXE)
                .add(ModItems.NETHERITE_EMERALD_PICKAXE)
                .add(ModItems.NETHERITE_DIAMOND_PICKAXE);
        valueLookupBuilder(ItemTags.SHOVELS)
                .add(ModItems.NETHERITE_IRON_SHOVEL)
                .add(ModItems.NETHERITE_GOLD_SHOVEL)
                .add(ModItems.NETHERITE_EMERALD_SHOVEL)
                .add(ModItems.NETHERITE_DIAMOND_SHOVEL);
        valueLookupBuilder(ItemTags.SWORDS)
                .add(ModItems.NETHERITE_IRON_SWORD)
                .add(ModItems.NETHERITE_GOLD_SWORD)
                .add(ModItems.NETHERITE_EMERALD_SWORD)
                .add(ModItems.NETHERITE_DIAMOND_SWORD);


        // Tooltip Rareness item tags
        valueLookupBuilder(FabricModTags.TOOLTIP_RARENESS_EPIC_ITEM)
                .addTag(ModTags.NETHERITE_BLOCKITEMS)
                .addTag(ModTags.NETHERITE_INGOTS)
                .add(ModItems.NETHERITE_IRON_AXE)
                .add(ModItems.NETHERITE_GOLD_AXE)
                .add(ModItems.NETHERITE_EMERALD_AXE)
                .add(ModItems.NETHERITE_DIAMOND_AXE)
                .add(ModItems.NETHERITE_IRON_HOE)
                .add(ModItems.NETHERITE_GOLD_HOE)
                .add(ModItems.NETHERITE_EMERALD_HOE)
                .add(ModItems.NETHERITE_DIAMOND_HOE)
                .add(ModItems.NETHERITE_IRON_PICKAXE)
                .add(ModItems.NETHERITE_GOLD_PICKAXE)
                .add(ModItems.NETHERITE_EMERALD_PICKAXE)
                .add(ModItems.NETHERITE_DIAMOND_PICKAXE)
                .add(ModItems.NETHERITE_IRON_SHOVEL)
                .add(ModItems.NETHERITE_GOLD_SHOVEL)
                .add(ModItems.NETHERITE_EMERALD_SHOVEL)
                .add(ModItems.NETHERITE_DIAMOND_SHOVEL)
                .add(ModItems.NETHERITE_IRON_SWORD)
                .add(ModItems.NETHERITE_GOLD_SWORD)
                .add(ModItems.NETHERITE_EMERALD_SWORD)
                .add(ModItems.NETHERITE_DIAMOND_SWORD)
                .add(ModItems.NETHERITE_IRON_HELMET)
                .add(ModItems.NETHERITE_GOLD_HELMET)
                .add(ModItems.NETHERITE_EMERALD_HELMET)
                .add(ModItems.NETHERITE_DIAMOND_HELMET)
                .add(ModItems.NETHERITE_IRON_CHESTPLATE)
                .add(ModItems.NETHERITE_GOLD_CHESTPLATE)
                .add(ModItems.NETHERITE_EMERALD_CHESTPLATE)
                .add(ModItems.NETHERITE_DIAMOND_CHESTPLATE)
                .add(ModItems.NETHERITE_IRON_LEGGINGS)
                .add(ModItems.NETHERITE_GOLD_LEGGINGS)
                .add(ModItems.NETHERITE_EMERALD_LEGGINGS)
                .add(ModItems.NETHERITE_DIAMOND_LEGGINGS)
                .add(ModItems.NETHERITE_IRON_BOOTS)
                .add(ModItems.NETHERITE_GOLD_BOOTS)
                .add(ModItems.NETHERITE_EMERALD_BOOTS)
                .add(ModItems.NETHERITE_DIAMOND_BOOTS);
    }
}
