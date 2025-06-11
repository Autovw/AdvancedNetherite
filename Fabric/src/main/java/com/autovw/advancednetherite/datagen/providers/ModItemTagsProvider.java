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
        getOrCreateTagBuilder(ModTags.NETHERITE_BLOCKITEMS)
                .add(ModItems.NETHERITE_IRON_BLOCK)
                .add(ModItems.NETHERITE_GOLD_BLOCK)
                .add(ModItems.NETHERITE_EMERALD_BLOCK)
                .add(ModItems.NETHERITE_DIAMOND_BLOCK);
        getOrCreateTagBuilder(ModTags.NETHERITE_INGOTS)
                .add(ModItems.NETHERITE_IRON_INGOT)
                .add(ModItems.NETHERITE_GOLD_INGOT)
                .add(ModItems.NETHERITE_EMERALD_INGOT)
                .add(ModItems.NETHERITE_DIAMOND_INGOT);
        getOrCreateTagBuilder(ModTags.UPGRADE_TO_NETHERITE_IRON).addTag(ModTags.INGOTS_NETHERITES_IRON);
        getOrCreateTagBuilder(ModTags.UPGRADE_TO_NETHERITE_GOLD).addTag(ModTags.INGOTS_NETHERITES_GOLD);
        getOrCreateTagBuilder(ModTags.UPGRADE_TO_NETHERITE_EMERALD).addTag(ModTags.INGOTS_NETHERITES_EMERALD);
        getOrCreateTagBuilder(ModTags.UPGRADE_TO_NETHERITE_DIAMOND).addTag(ModTags.INGOTS_NETHERITES_DIAMOND);

        getOrCreateTagBuilder(ModTags.INGOTS_NETHERITES).add(Items.NETHERITE_INGOT);
        getOrCreateTagBuilder(ModTags.INGOTS_NETHERITES_IRON).add(ModItems.NETHERITE_IRON_INGOT);
        getOrCreateTagBuilder(ModTags.INGOTS_NETHERITES_GOLD).add(ModItems.NETHERITE_GOLD_INGOT);
        getOrCreateTagBuilder(ModTags.INGOTS_NETHERITES_EMERALD).add(ModItems.NETHERITE_EMERALD_INGOT);
        getOrCreateTagBuilder(ModTags.INGOTS_NETHERITES_DIAMOND).add(ModItems.NETHERITE_DIAMOND_INGOT);
        getOrCreateTagBuilder(ModTags.INGOTS_UPGRADE_TO_NETHERITE_IRON).addTag(ModTags.INGOTS_NETHERITES);
        getOrCreateTagBuilder(ModTags.INGOTS_UPGRADE_TO_NETHERITE_GOLD).addTag(ModTags.INGOTS_NETHERITES_IRON);
        getOrCreateTagBuilder(ModTags.INGOTS_UPGRADE_TO_NETHERITE_EMERALD).addTag(ModTags.INGOTS_NETHERITES_GOLD);
        getOrCreateTagBuilder(ModTags.INGOTS_UPGRADE_TO_NETHERITE_DIAMOND).addTag(ModTags.INGOTS_NETHERITES_EMERALD);

        getOrCreateTagBuilder(ModTags.AXE_NETHERITE).add(Items.NETHERITE_AXE);
        getOrCreateTagBuilder(ModTags.AXE_NETHERITE_IRON).add(ModItems.NETHERITE_IRON_AXE);
        getOrCreateTagBuilder(ModTags.AXE_NETHERITE_GOLD).add(ModItems.NETHERITE_GOLD_AXE);
        getOrCreateTagBuilder(ModTags.AXE_NETHERITE_EMERALD).add(ModItems.NETHERITE_EMERALD_AXE);
        getOrCreateTagBuilder(ModTags.AXE_NETHERITE_DIAMOND).add(ModItems.NETHERITE_DIAMOND_AXE);
        getOrCreateTagBuilder(ModTags.AXE_UPGRADE_TO_NETHERITE_IRON).addTag(ModTags.AXE_NETHERITE);
        getOrCreateTagBuilder(ModTags.AXE_UPGRADE_TO_NETHERITE_GOLD).addTag(ModTags.AXE_NETHERITE_IRON);
        getOrCreateTagBuilder(ModTags.AXE_UPGRADE_TO_NETHERITE_EMERALD).addTag(ModTags.AXE_NETHERITE_GOLD);
        getOrCreateTagBuilder(ModTags.AXE_UPGRADE_TO_NETHERITE_DIAMOND).addTag(ModTags.AXE_NETHERITE_EMERALD);

        getOrCreateTagBuilder(ModTags.HOE_NETHERITE).add(Items.NETHERITE_HOE);
        getOrCreateTagBuilder(ModTags.HOE_NETHERITE_IRON).add(ModItems.NETHERITE_IRON_HOE);
        getOrCreateTagBuilder(ModTags.HOE_NETHERITE_GOLD).add(ModItems.NETHERITE_GOLD_HOE);
        getOrCreateTagBuilder(ModTags.HOE_NETHERITE_EMERALD).add(ModItems.NETHERITE_EMERALD_HOE);
        getOrCreateTagBuilder(ModTags.HOE_NETHERITE_DIAMOND).add(ModItems.NETHERITE_DIAMOND_HOE);
        getOrCreateTagBuilder(ModTags.HOE_UPGRADE_TO_NETHERITE_IRON).addTag(ModTags.HOE_NETHERITE);
        getOrCreateTagBuilder(ModTags.HOE_UPGRADE_TO_NETHERITE_GOLD).addTag(ModTags.HOE_NETHERITE_IRON);
        getOrCreateTagBuilder(ModTags.HOE_UPGRADE_TO_NETHERITE_EMERALD).addTag(ModTags.HOE_NETHERITE_GOLD);
        getOrCreateTagBuilder(ModTags.HOE_UPGRADE_TO_NETHERITE_DIAMOND).addTag(ModTags.HOE_NETHERITE_EMERALD);

        getOrCreateTagBuilder(ModTags.PICKAXE_NETHERITE).add(Items.NETHERITE_PICKAXE);
        getOrCreateTagBuilder(ModTags.PICKAXE_NETHERITE_IRON).add(ModItems.NETHERITE_IRON_PICKAXE);
        getOrCreateTagBuilder(ModTags.PICKAXE_NETHERITE_GOLD).add(ModItems.NETHERITE_GOLD_PICKAXE);
        getOrCreateTagBuilder(ModTags.PICKAXE_NETHERITE_EMERALD).add(ModItems.NETHERITE_EMERALD_PICKAXE);
        getOrCreateTagBuilder(ModTags.PICKAXE_NETHERITE_DIAMOND).add(ModItems.NETHERITE_DIAMOND_PICKAXE);
        getOrCreateTagBuilder(ModTags.PICKAXE_UPGRADE_TO_NETHERITE_IRON).addTag(ModTags.PICKAXE_NETHERITE);
        getOrCreateTagBuilder(ModTags.PICKAXE_UPGRADE_TO_NETHERITE_GOLD).addTag(ModTags.PICKAXE_NETHERITE_IRON);
        getOrCreateTagBuilder(ModTags.PICKAXE_UPGRADE_TO_NETHERITE_EMERALD).addTag(ModTags.PICKAXE_NETHERITE_GOLD);
        getOrCreateTagBuilder(ModTags.PICKAXE_UPGRADE_TO_NETHERITE_DIAMOND).addTag(ModTags.PICKAXE_NETHERITE_EMERALD);

        getOrCreateTagBuilder(ModTags.SHOVEL_NETHERITE).add(Items.NETHERITE_SHOVEL);
        getOrCreateTagBuilder(ModTags.SHOVEL_NETHERITE_IRON).add(ModItems.NETHERITE_IRON_SHOVEL);
        getOrCreateTagBuilder(ModTags.SHOVEL_NETHERITE_GOLD).add(ModItems.NETHERITE_GOLD_SHOVEL);
        getOrCreateTagBuilder(ModTags.SHOVEL_NETHERITE_EMERALD).add(ModItems.NETHERITE_EMERALD_SHOVEL);
        getOrCreateTagBuilder(ModTags.SHOVEL_NETHERITE_DIAMOND).add(ModItems.NETHERITE_DIAMOND_SHOVEL);
        getOrCreateTagBuilder(ModTags.SHOVEL_UPGRADE_TO_NETHERITE_IRON).addTag(ModTags.SHOVEL_NETHERITE);
        getOrCreateTagBuilder(ModTags.SHOVEL_UPGRADE_TO_NETHERITE_GOLD).addTag(ModTags.SHOVEL_NETHERITE_IRON);
        getOrCreateTagBuilder(ModTags.SHOVEL_UPGRADE_TO_NETHERITE_EMERALD).addTag(ModTags.SHOVEL_NETHERITE_GOLD);
        getOrCreateTagBuilder(ModTags.SHOVEL_UPGRADE_TO_NETHERITE_DIAMOND).addTag(ModTags.SHOVEL_NETHERITE_EMERALD);

        getOrCreateTagBuilder(ModTags.SWORD_NETHERITE).add(Items.NETHERITE_SWORD);
        getOrCreateTagBuilder(ModTags.SWORD_NETHERITE_IRON).add(ModItems.NETHERITE_IRON_SWORD);
        getOrCreateTagBuilder(ModTags.SWORD_NETHERITE_GOLD).add(ModItems.NETHERITE_GOLD_SWORD);
        getOrCreateTagBuilder(ModTags.SWORD_NETHERITE_EMERALD).add(ModItems.NETHERITE_EMERALD_SWORD);
        getOrCreateTagBuilder(ModTags.SWORD_NETHERITE_DIAMOND).add(ModItems.NETHERITE_DIAMOND_SWORD);
        getOrCreateTagBuilder(ModTags.SWORD_UPGRADE_TO_NETHERITE_IRON).addTag(ModTags.SWORD_NETHERITE);
        getOrCreateTagBuilder(ModTags.SWORD_UPGRADE_TO_NETHERITE_GOLD).addTag(ModTags.SWORD_NETHERITE_IRON);
        getOrCreateTagBuilder(ModTags.SWORD_UPGRADE_TO_NETHERITE_EMERALD).addTag(ModTags.SWORD_NETHERITE_GOLD);
        getOrCreateTagBuilder(ModTags.SWORD_UPGRADE_TO_NETHERITE_DIAMOND).addTag(ModTags.SWORD_NETHERITE_EMERALD);

        getOrCreateTagBuilder(ModTags.HELMET_NETHERITE).add(Items.NETHERITE_HELMET);
        getOrCreateTagBuilder(ModTags.HELMET_NETHERITE_IRON).add(ModItems.NETHERITE_IRON_HELMET);
        getOrCreateTagBuilder(ModTags.HELMET_NETHERITE_GOLD).add(ModItems.NETHERITE_GOLD_HELMET);
        getOrCreateTagBuilder(ModTags.HELMET_NETHERITE_EMERALD).add(ModItems.NETHERITE_EMERALD_HELMET);
        getOrCreateTagBuilder(ModTags.HELMET_NETHERITE_DIAMOND).add(ModItems.NETHERITE_DIAMOND_HELMET);
        getOrCreateTagBuilder(ModTags.HELMET_UPGRADE_TO_NETHERITE_IRON).addTag(ModTags.HELMET_NETHERITE);
        getOrCreateTagBuilder(ModTags.HELMET_UPGRADE_TO_NETHERITE_GOLD).addTag(ModTags.HELMET_NETHERITE_IRON);
        getOrCreateTagBuilder(ModTags.HELMET_UPGRADE_TO_NETHERITE_EMERALD).addTag(ModTags.HELMET_NETHERITE_GOLD);
        getOrCreateTagBuilder(ModTags.HELMET_UPGRADE_TO_NETHERITE_DIAMOND).addTag(ModTags.HELMET_NETHERITE_EMERALD);

        getOrCreateTagBuilder(ModTags.CHESTPLATE_NETHERITE).add(Items.NETHERITE_CHESTPLATE);
        getOrCreateTagBuilder(ModTags.CHESTPLATE_NETHERITE_IRON).add(ModItems.NETHERITE_IRON_CHESTPLATE);
        getOrCreateTagBuilder(ModTags.CHESTPLATE_NETHERITE_GOLD).add(ModItems.NETHERITE_GOLD_CHESTPLATE);
        getOrCreateTagBuilder(ModTags.CHESTPLATE_NETHERITE_EMERALD).add(ModItems.NETHERITE_EMERALD_CHESTPLATE);
        getOrCreateTagBuilder(ModTags.CHESTPLATE_NETHERITE_DIAMOND).add(ModItems.NETHERITE_DIAMOND_CHESTPLATE);
        getOrCreateTagBuilder(ModTags.CHESTPLATE_UPGRADE_TO_NETHERITE_IRON).addTag(ModTags.CHESTPLATE_NETHERITE);
        getOrCreateTagBuilder(ModTags.CHESTPLATE_UPGRADE_TO_NETHERITE_GOLD).addTag(ModTags.CHESTPLATE_NETHERITE_IRON);
        getOrCreateTagBuilder(ModTags.CHESTPLATE_UPGRADE_TO_NETHERITE_EMERALD).addTag(ModTags.CHESTPLATE_NETHERITE_GOLD);
        getOrCreateTagBuilder(ModTags.CHESTPLATE_UPGRADE_TO_NETHERITE_DIAMOND).addTag(ModTags.CHESTPLATE_NETHERITE_EMERALD);

        getOrCreateTagBuilder(ModTags.LEGGINGS_NETHERITE).add(Items.NETHERITE_LEGGINGS);
        getOrCreateTagBuilder(ModTags.LEGGINGS_NETHERITE_IRON).add(ModItems.NETHERITE_IRON_LEGGINGS);
        getOrCreateTagBuilder(ModTags.LEGGINGS_NETHERITE_GOLD).add(ModItems.NETHERITE_GOLD_LEGGINGS);
        getOrCreateTagBuilder(ModTags.LEGGINGS_NETHERITE_EMERALD).add(ModItems.NETHERITE_EMERALD_LEGGINGS);
        getOrCreateTagBuilder(ModTags.LEGGINGS_NETHERITE_DIAMOND).add(ModItems.NETHERITE_DIAMOND_LEGGINGS);
        getOrCreateTagBuilder(ModTags.LEGGINGS_UPGRADE_TO_NETHERITE_IRON).addTag(ModTags.LEGGINGS_NETHERITE);
        getOrCreateTagBuilder(ModTags.LEGGINGS_UPGRADE_TO_NETHERITE_GOLD).addTag(ModTags.LEGGINGS_NETHERITE_IRON);
        getOrCreateTagBuilder(ModTags.LEGGINGS_UPGRADE_TO_NETHERITE_EMERALD).addTag(ModTags.LEGGINGS_NETHERITE_GOLD);
        getOrCreateTagBuilder(ModTags.LEGGINGS_UPGRADE_TO_NETHERITE_DIAMOND).addTag(ModTags.LEGGINGS_NETHERITE_EMERALD);

        getOrCreateTagBuilder(ModTags.BOOTS_NETHERITE).add(Items.NETHERITE_BOOTS);
        getOrCreateTagBuilder(ModTags.BOOTS_NETHERITE_IRON).add(ModItems.NETHERITE_IRON_BOOTS);
        getOrCreateTagBuilder(ModTags.BOOTS_NETHERITE_GOLD).add(ModItems.NETHERITE_GOLD_BOOTS);
        getOrCreateTagBuilder(ModTags.BOOTS_NETHERITE_EMERALD).add(ModItems.NETHERITE_EMERALD_BOOTS);
        getOrCreateTagBuilder(ModTags.BOOTS_NETHERITE_DIAMOND).add(ModItems.NETHERITE_DIAMOND_BOOTS);
        getOrCreateTagBuilder(ModTags.BOOTS_UPGRADE_TO_NETHERITE_IRON).addTag(ModTags.BOOTS_NETHERITE);
        getOrCreateTagBuilder(ModTags.BOOTS_UPGRADE_TO_NETHERITE_GOLD).addTag(ModTags.BOOTS_NETHERITE_IRON);
        getOrCreateTagBuilder(ModTags.BOOTS_UPGRADE_TO_NETHERITE_EMERALD).addTag(ModTags.BOOTS_NETHERITE_GOLD);
        getOrCreateTagBuilder(ModTags.BOOTS_UPGRADE_TO_NETHERITE_DIAMOND).addTag(ModTags.BOOTS_NETHERITE_EMERALD);

        // tiers
        getOrCreateTagBuilder(ModTags.TIER_ARMOR)
                .addTag(ModTags.TIER_ARMOR_NETHERITE_IRON)
                .addTag(ModTags.TIER_ARMOR_NETHERITE_GOLD)
                .addTag(ModTags.TIER_ARMOR_NETHERITE_EMERALD)
                .addTag(ModTags.TIER_ARMOR_NETHERITE_DIAMOND);
        getOrCreateTagBuilder(ModTags.TIER_ARMOR_NETHERITE_IRON)
                .add(ModItems.NETHERITE_IRON_HELMET)
                .add(ModItems.NETHERITE_IRON_CHESTPLATE)
                .add(ModItems.NETHERITE_IRON_LEGGINGS)
                .add(ModItems.NETHERITE_IRON_BOOTS);
        getOrCreateTagBuilder(ModTags.TIER_ARMOR_NETHERITE_GOLD)
                .add(ModItems.NETHERITE_GOLD_HELMET)
                .add(ModItems.NETHERITE_GOLD_CHESTPLATE)
                .add(ModItems.NETHERITE_GOLD_LEGGINGS)
                .add(ModItems.NETHERITE_GOLD_BOOTS);
        getOrCreateTagBuilder(ModTags.TIER_ARMOR_NETHERITE_EMERALD)
                .add(ModItems.NETHERITE_EMERALD_HELMET)
                .add(ModItems.NETHERITE_EMERALD_CHESTPLATE)
                .add(ModItems.NETHERITE_EMERALD_LEGGINGS)
                .add(ModItems.NETHERITE_EMERALD_BOOTS);
        getOrCreateTagBuilder(ModTags.TIER_ARMOR_NETHERITE_DIAMOND)
                .add(ModItems.NETHERITE_DIAMOND_HELMET)
                .add(ModItems.NETHERITE_DIAMOND_CHESTPLATE)
                .add(ModItems.NETHERITE_DIAMOND_LEGGINGS)
                .add(ModItems.NETHERITE_DIAMOND_BOOTS);
        getOrCreateTagBuilder(ModTags.TIER_TOOLS)
                .addTag(ModTags.TIER_TOOL_NETHERITE_IRON)
                .addTag(ModTags.TIER_TOOL_NETHERITE_GOLD)
                .addTag(ModTags.TIER_TOOL_NETHERITE_EMERALD)
                .addTag(ModTags.TIER_TOOL_NETHERITE_DIAMOND);
        getOrCreateTagBuilder(ModTags.TIER_TOOL_NETHERITE_IRON)
                .add(ModItems.NETHERITE_IRON_AXE)
                .add(ModItems.NETHERITE_IRON_HOE)
                .add(ModItems.NETHERITE_IRON_PICKAXE)
                .add(ModItems.NETHERITE_IRON_SHOVEL)
                .add(ModItems.NETHERITE_IRON_SWORD);
        getOrCreateTagBuilder(ModTags.TIER_TOOL_NETHERITE_GOLD)
                .add(ModItems.NETHERITE_GOLD_AXE)
                .add(ModItems.NETHERITE_GOLD_HOE)
                .add(ModItems.NETHERITE_GOLD_PICKAXE)
                .add(ModItems.NETHERITE_GOLD_SHOVEL)
                .add(ModItems.NETHERITE_GOLD_SWORD);
        getOrCreateTagBuilder(ModTags.TIER_TOOL_NETHERITE_EMERALD)
                .add(ModItems.NETHERITE_EMERALD_AXE)
                .add(ModItems.NETHERITE_EMERALD_HOE)
                .add(ModItems.NETHERITE_EMERALD_PICKAXE)
                .add(ModItems.NETHERITE_EMERALD_SHOVEL)
                .add(ModItems.NETHERITE_EMERALD_SWORD);
        getOrCreateTagBuilder(ModTags.TIER_TOOL_NETHERITE_DIAMOND)
                .add(ModItems.NETHERITE_DIAMOND_AXE)
                .add(ModItems.NETHERITE_DIAMOND_HOE)
                .add(ModItems.NETHERITE_DIAMOND_PICKAXE)
                .add(ModItems.NETHERITE_DIAMOND_SHOVEL)
                .add(ModItems.NETHERITE_DIAMOND_SWORD);

        // Repair tags
        getOrCreateTagBuilder(ModTags.REPAIRS_NETHERITE_IRON_ARMOR)
                .add(ModItems.NETHERITE_IRON_INGOT);
        getOrCreateTagBuilder(ModTags.REPAIRS_NETHERITE_GOLD_ARMOR)
                .add(ModItems.NETHERITE_GOLD_INGOT);
        getOrCreateTagBuilder(ModTags.REPAIRS_NETHERITE_EMERALD_ARMOR)
                .add(ModItems.NETHERITE_EMERALD_INGOT);
        getOrCreateTagBuilder(ModTags.REPAIRS_NETHERITE_DIAMOND_ARMOR)
                .add(ModItems.NETHERITE_DIAMOND_INGOT);

        getOrCreateTagBuilder(ModTags.REPAIRS_NETHERITE_IRON_TOOLS)
                .add(ModItems.NETHERITE_IRON_INGOT);
        getOrCreateTagBuilder(ModTags.REPAIRS_NETHERITE_GOLD_TOOLS)
                .add(ModItems.NETHERITE_GOLD_INGOT);
        getOrCreateTagBuilder(ModTags.REPAIRS_NETHERITE_EMERALD_TOOLS)
                .add(ModItems.NETHERITE_EMERALD_INGOT);
        getOrCreateTagBuilder(ModTags.REPAIRS_NETHERITE_DIAMOND_TOOLS)
                .add(ModItems.NETHERITE_DIAMOND_INGOT);

        // Pacify armor tags
        getOrCreateTagBuilder(ModTags.PACIFY_PHANTOMS_ARMOR)
                .addTag(ModTags.TIER_ARMOR_NETHERITE_IRON)
                .addTag(ModTags.TIER_ARMOR_NETHERITE_DIAMOND);
        getOrCreateTagBuilder(ModTags.PACIFY_PIGLINS_ARMOR)
                .addTag(ModTags.TIER_ARMOR_NETHERITE_GOLD)
                .addTag(ModTags.TIER_ARMOR_NETHERITE_DIAMOND);
        getOrCreateTagBuilder(ModTags.PACIFY_ENDERMEN_ARMOR)
                .addTag(ModTags.TIER_ARMOR_NETHERITE_EMERALD)
                .addTag(ModTags.TIER_ARMOR_NETHERITE_DIAMOND);

        // additional drop tags
        getOrCreateTagBuilder(ModTags.DROPS_ADDITIONAL_IRON)
                .add(ModItems.NETHERITE_IRON_PICKAXE);
        getOrCreateTagBuilder(ModTags.DROPS_ADDITIONAL_GOLD)
                .add(ModItems.NETHERITE_GOLD_PICKAXE);
        getOrCreateTagBuilder(ModTags.DROPS_ADDITIONAL_EMERALD)
                .add(ModItems.NETHERITE_EMERALD_PICKAXE);
        getOrCreateTagBuilder(ModTags.DROPS_ADDITIONAL_DIAMOND)
                .add(ModItems.NETHERITE_DIAMOND_PICKAXE);


        // Vanilla item tags
        getOrCreateTagBuilder(ItemTags.BEACON_PAYMENT_ITEMS)
                .addTag(ModTags.NETHERITE_INGOTS);
        getOrCreateTagBuilder(ItemTags.PIGLIN_LOVED)
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
        getOrCreateTagBuilder(ItemTags.PIGLIN_SAFE_ARMOR)
                .addTag(ModTags.PACIFY_PIGLINS_ARMOR);

        getOrCreateTagBuilder(ItemTags.CLUSTER_MAX_HARVESTABLES)
                .add(ModItems.NETHERITE_IRON_PICKAXE)
                .add(ModItems.NETHERITE_GOLD_PICKAXE)
                .add(ModItems.NETHERITE_EMERALD_PICKAXE)
                .add(ModItems.NETHERITE_DIAMOND_PICKAXE);
        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
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

        getOrCreateTagBuilder(ItemTags.HEAD_ARMOR)
                .add(ModItems.NETHERITE_IRON_HELMET)
                .add(ModItems.NETHERITE_GOLD_HELMET)
                .add(ModItems.NETHERITE_EMERALD_HELMET)
                .add(ModItems.NETHERITE_DIAMOND_HELMET);
        getOrCreateTagBuilder(ItemTags.CHEST_ARMOR)
                .add(ModItems.NETHERITE_IRON_CHESTPLATE)
                .add(ModItems.NETHERITE_GOLD_CHESTPLATE)
                .add(ModItems.NETHERITE_EMERALD_CHESTPLATE)
                .add(ModItems.NETHERITE_DIAMOND_CHESTPLATE);
        getOrCreateTagBuilder(ItemTags.LEG_ARMOR)
                .add(ModItems.NETHERITE_IRON_LEGGINGS)
                .add(ModItems.NETHERITE_GOLD_LEGGINGS)
                .add(ModItems.NETHERITE_EMERALD_LEGGINGS)
                .add(ModItems.NETHERITE_DIAMOND_LEGGINGS);
        getOrCreateTagBuilder(ItemTags.FOOT_ARMOR)
                .add(ModItems.NETHERITE_IRON_BOOTS)
                .add(ModItems.NETHERITE_GOLD_BOOTS)
                .add(ModItems.NETHERITE_EMERALD_BOOTS)
                .add(ModItems.NETHERITE_DIAMOND_BOOTS);

        getOrCreateTagBuilder(ItemTags.AXES)
                .add(ModItems.NETHERITE_IRON_AXE)
                .add(ModItems.NETHERITE_GOLD_AXE)
                .add(ModItems.NETHERITE_EMERALD_AXE)
                .add(ModItems.NETHERITE_DIAMOND_AXE);
        getOrCreateTagBuilder(ItemTags.HOES)
                .add(ModItems.NETHERITE_IRON_HOE)
                .add(ModItems.NETHERITE_GOLD_HOE)
                .add(ModItems.NETHERITE_EMERALD_HOE)
                .add(ModItems.NETHERITE_DIAMOND_HOE);
        getOrCreateTagBuilder(ItemTags.PICKAXES)
                .add(ModItems.NETHERITE_IRON_PICKAXE)
                .add(ModItems.NETHERITE_GOLD_PICKAXE)
                .add(ModItems.NETHERITE_EMERALD_PICKAXE)
                .add(ModItems.NETHERITE_DIAMOND_PICKAXE);
        getOrCreateTagBuilder(ItemTags.SHOVELS)
                .add(ModItems.NETHERITE_IRON_SHOVEL)
                .add(ModItems.NETHERITE_GOLD_SHOVEL)
                .add(ModItems.NETHERITE_EMERALD_SHOVEL)
                .add(ModItems.NETHERITE_DIAMOND_SHOVEL);
        getOrCreateTagBuilder(ItemTags.SWORDS)
                .add(ModItems.NETHERITE_IRON_SWORD)
                .add(ModItems.NETHERITE_GOLD_SWORD)
                .add(ModItems.NETHERITE_EMERALD_SWORD)
                .add(ModItems.NETHERITE_DIAMOND_SWORD);


        // Tooltip Rareness item tags
        getOrCreateTagBuilder(FabricModTags.TOOLTIP_RARENESS_EPIC_ITEM)
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
