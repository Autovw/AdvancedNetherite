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

        getOrCreateTagBuilder(ModTags.AXES_NETHERITE).add(Items.NETHERITE_AXE);
        getOrCreateTagBuilder(ModTags.AXES_NETHERITE_IRON).add(ModItems.NETHERITE_IRON_AXE);
        getOrCreateTagBuilder(ModTags.AXES_NETHERITE_GOLD).add(ModItems.NETHERITE_GOLD_AXE);
        getOrCreateTagBuilder(ModTags.AXES_NETHERITE_EMERALD).add(ModItems.NETHERITE_EMERALD_AXE);
        getOrCreateTagBuilder(ModTags.AXES_NETHERITE_DIAMOND).add(ModItems.NETHERITE_DIAMOND_AXE);
        getOrCreateTagBuilder(ModTags.AXES_UPGRADE_TO_NETHERITE_IRON).addTag(ModTags.AXES_NETHERITE);
        getOrCreateTagBuilder(ModTags.AXES_UPGRADE_TO_NETHERITE_GOLD).addTag(ModTags.AXES_NETHERITE_IRON);
        getOrCreateTagBuilder(ModTags.AXES_UPGRADE_TO_NETHERITE_EMERALD).addTag(ModTags.AXES_NETHERITE_GOLD);
        getOrCreateTagBuilder(ModTags.AXES_UPGRADE_TO_NETHERITE_DIAMOND).addTag(ModTags.AXES_NETHERITE_EMERALD);

        getOrCreateTagBuilder(ModTags.HOES_NETHERITE).add(Items.NETHERITE_HOE);
        getOrCreateTagBuilder(ModTags.HOES_NETHERITE_IRON).add(ModItems.NETHERITE_IRON_HOE);
        getOrCreateTagBuilder(ModTags.HOES_NETHERITE_GOLD).add(ModItems.NETHERITE_GOLD_HOE);
        getOrCreateTagBuilder(ModTags.HOES_NETHERITE_EMERALD).add(ModItems.NETHERITE_EMERALD_HOE);
        getOrCreateTagBuilder(ModTags.HOES_NETHERITE_DIAMOND).add(ModItems.NETHERITE_DIAMOND_HOE);
        getOrCreateTagBuilder(ModTags.HOES_UPGRADE_TO_NETHERITE_IRON).addTag(ModTags.HOES_NETHERITE);
        getOrCreateTagBuilder(ModTags.HOES_UPGRADE_TO_NETHERITE_GOLD).addTag(ModTags.HOES_NETHERITE_IRON);
        getOrCreateTagBuilder(ModTags.HOES_UPGRADE_TO_NETHERITE_EMERALD).addTag(ModTags.HOES_NETHERITE_GOLD);
        getOrCreateTagBuilder(ModTags.HOES_UPGRADE_TO_NETHERITE_DIAMOND).addTag(ModTags.HOES_NETHERITE_EMERALD);

        getOrCreateTagBuilder(ModTags.PICKAXES_NETHERITE).add(Items.NETHERITE_PICKAXE);
        getOrCreateTagBuilder(ModTags.PICKAXES_NETHERITE_IRON).add(ModItems.NETHERITE_IRON_PICKAXE);
        getOrCreateTagBuilder(ModTags.PICKAXES_NETHERITE_GOLD).add(ModItems.NETHERITE_GOLD_PICKAXE);
        getOrCreateTagBuilder(ModTags.PICKAXES_NETHERITE_EMERALD).add(ModItems.NETHERITE_EMERALD_PICKAXE);
        getOrCreateTagBuilder(ModTags.PICKAXES_NETHERITE_DIAMOND).add(ModItems.NETHERITE_DIAMOND_PICKAXE);
        getOrCreateTagBuilder(ModTags.PICKAXES_UPGRADE_TO_NETHERITE_IRON).addTag(ModTags.PICKAXES_NETHERITE);
        getOrCreateTagBuilder(ModTags.PICKAXES_UPGRADE_TO_NETHERITE_GOLD).addTag(ModTags.PICKAXES_NETHERITE_IRON);
        getOrCreateTagBuilder(ModTags.PICKAXES_UPGRADE_TO_NETHERITE_EMERALD).addTag(ModTags.PICKAXES_NETHERITE_GOLD);
        getOrCreateTagBuilder(ModTags.PICKAXES_UPGRADE_TO_NETHERITE_DIAMOND).addTag(ModTags.PICKAXES_NETHERITE_EMERALD);

        getOrCreateTagBuilder(ModTags.SHOVELS_NETHERITE).add(Items.NETHERITE_SHOVEL);
        getOrCreateTagBuilder(ModTags.SHOVELS_NETHERITE_IRON).add(ModItems.NETHERITE_IRON_SHOVEL);
        getOrCreateTagBuilder(ModTags.SHOVELS_NETHERITE_GOLD).add(ModItems.NETHERITE_GOLD_SHOVEL);
        getOrCreateTagBuilder(ModTags.SHOVELS_NETHERITE_EMERALD).add(ModItems.NETHERITE_EMERALD_SHOVEL);
        getOrCreateTagBuilder(ModTags.SHOVELS_NETHERITE_DIAMOND).add(ModItems.NETHERITE_DIAMOND_SHOVEL);
        getOrCreateTagBuilder(ModTags.SHOVELS_UPGRADE_TO_NETHERITE_IRON).addTag(ModTags.SHOVELS_NETHERITE);
        getOrCreateTagBuilder(ModTags.SHOVELS_UPGRADE_TO_NETHERITE_GOLD).addTag(ModTags.SHOVELS_NETHERITE_IRON);
        getOrCreateTagBuilder(ModTags.SHOVELS_UPGRADE_TO_NETHERITE_EMERALD).addTag(ModTags.SHOVELS_NETHERITE_GOLD);
        getOrCreateTagBuilder(ModTags.SHOVELS_UPGRADE_TO_NETHERITE_DIAMOND).addTag(ModTags.SHOVELS_NETHERITE_EMERALD);

        getOrCreateTagBuilder(ModTags.SWORDS_NETHERITE).add(Items.NETHERITE_SWORD);
        getOrCreateTagBuilder(ModTags.SWORDS_NETHERITE_IRON).add(ModItems.NETHERITE_IRON_SWORD);
        getOrCreateTagBuilder(ModTags.SWORDS_NETHERITE_GOLD).add(ModItems.NETHERITE_GOLD_SWORD);
        getOrCreateTagBuilder(ModTags.SWORDS_NETHERITE_EMERALD).add(ModItems.NETHERITE_EMERALD_SWORD);
        getOrCreateTagBuilder(ModTags.SWORDS_NETHERITE_DIAMOND).add(ModItems.NETHERITE_DIAMOND_SWORD);
        getOrCreateTagBuilder(ModTags.SWORDS_UPGRADE_TO_NETHERITE_IRON).addTag(ModTags.SWORDS_NETHERITE);
        getOrCreateTagBuilder(ModTags.SWORDS_UPGRADE_TO_NETHERITE_GOLD).addTag(ModTags.SWORDS_NETHERITE_IRON);
        getOrCreateTagBuilder(ModTags.SWORDS_UPGRADE_TO_NETHERITE_EMERALD).addTag(ModTags.SWORDS_NETHERITE_GOLD);
        getOrCreateTagBuilder(ModTags.SWORDS_UPGRADE_TO_NETHERITE_DIAMOND).addTag(ModTags.SWORDS_NETHERITE_EMERALD);

        getOrCreateTagBuilder(ModTags.HELMETS_NETHERITE).add(Items.NETHERITE_HELMET);
        getOrCreateTagBuilder(ModTags.HELMETS_NETHERITE_IRON).add(ModItems.NETHERITE_IRON_HELMET);
        getOrCreateTagBuilder(ModTags.HELMETS_NETHERITE_GOLD).add(ModItems.NETHERITE_GOLD_HELMET);
        getOrCreateTagBuilder(ModTags.HELMETS_NETHERITE_EMERALD).add(ModItems.NETHERITE_EMERALD_HELMET);
        getOrCreateTagBuilder(ModTags.HELMETS_NETHERITE_DIAMOND).add(ModItems.NETHERITE_DIAMOND_HELMET);
        getOrCreateTagBuilder(ModTags.HELMETS_UPGRADE_TO_NETHERITE_IRON).addTag(ModTags.HELMETS_NETHERITE);
        getOrCreateTagBuilder(ModTags.HELMETS_UPGRADE_TO_NETHERITE_GOLD).addTag(ModTags.HELMETS_NETHERITE_IRON);
        getOrCreateTagBuilder(ModTags.HELMETS_UPGRADE_TO_NETHERITE_EMERALD).addTag(ModTags.HELMETS_NETHERITE_GOLD);
        getOrCreateTagBuilder(ModTags.HELMETS_UPGRADE_TO_NETHERITE_DIAMOND).addTag(ModTags.HELMETS_NETHERITE_EMERALD);

        getOrCreateTagBuilder(ModTags.CHESTPLATES_NETHERITE).add(Items.NETHERITE_CHESTPLATE);
        getOrCreateTagBuilder(ModTags.CHESTPLATES_NETHERITE_IRON).add(ModItems.NETHERITE_IRON_CHESTPLATE);
        getOrCreateTagBuilder(ModTags.CHESTPLATES_NETHERITE_GOLD).add(ModItems.NETHERITE_GOLD_CHESTPLATE);
        getOrCreateTagBuilder(ModTags.CHESTPLATES_NETHERITE_EMERALD).add(ModItems.NETHERITE_EMERALD_CHESTPLATE);
        getOrCreateTagBuilder(ModTags.CHESTPLATES_NETHERITE_DIAMOND).add(ModItems.NETHERITE_DIAMOND_CHESTPLATE);
        getOrCreateTagBuilder(ModTags.CHESTPLATES_UPGRADE_TO_NETHERITE_IRON).addTag(ModTags.CHESTPLATES_NETHERITE);
        getOrCreateTagBuilder(ModTags.CHESTPLATES_UPGRADE_TO_NETHERITE_GOLD).addTag(ModTags.CHESTPLATES_NETHERITE_IRON);
        getOrCreateTagBuilder(ModTags.CHESTPLATES_UPGRADE_TO_NETHERITE_EMERALD).addTag(ModTags.CHESTPLATES_NETHERITE_GOLD);
        getOrCreateTagBuilder(ModTags.CHESTPLATES_UPGRADE_TO_NETHERITE_DIAMOND).addTag(ModTags.CHESTPLATES_NETHERITE_EMERALD);

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
        getOrCreateTagBuilder(ModTags.TIERS_ARMOR)
                .addTag(ModTags.TIERS_ARMOR_NETHERITE_IRON)
                .addTag(ModTags.TIERS_ARMOR_NETHERITE_GOLD)
                .addTag(ModTags.TIERS_ARMOR_NETHERITE_EMERALD)
                .addTag(ModTags.TIERS_ARMOR_NETHERITE_DIAMOND);
        getOrCreateTagBuilder(ModTags.TIERS_ARMOR_NETHERITE_IRON)
                .add(ModItems.NETHERITE_IRON_HELMET)
                .add(ModItems.NETHERITE_IRON_CHESTPLATE)
                .add(ModItems.NETHERITE_IRON_LEGGINGS)
                .add(ModItems.NETHERITE_IRON_BOOTS);
        getOrCreateTagBuilder(ModTags.TIERS_ARMOR_NETHERITE_GOLD)
                .add(ModItems.NETHERITE_GOLD_HELMET)
                .add(ModItems.NETHERITE_GOLD_CHESTPLATE)
                .add(ModItems.NETHERITE_GOLD_LEGGINGS)
                .add(ModItems.NETHERITE_GOLD_BOOTS);
        getOrCreateTagBuilder(ModTags.TIERS_ARMOR_NETHERITE_EMERALD)
                .add(ModItems.NETHERITE_EMERALD_HELMET)
                .add(ModItems.NETHERITE_EMERALD_CHESTPLATE)
                .add(ModItems.NETHERITE_EMERALD_LEGGINGS)
                .add(ModItems.NETHERITE_EMERALD_BOOTS);
        getOrCreateTagBuilder(ModTags.TIERS_ARMOR_NETHERITE_DIAMOND)
                .add(ModItems.NETHERITE_DIAMOND_HELMET)
                .add(ModItems.NETHERITE_DIAMOND_CHESTPLATE)
                .add(ModItems.NETHERITE_DIAMOND_LEGGINGS)
                .add(ModItems.NETHERITE_DIAMOND_BOOTS);
        getOrCreateTagBuilder(ModTags.TIERS_TOOLS)
                .addTag(ModTags.TIERS_TOOLS_NETHERITE_IRON)
                .addTag(ModTags.TIERS_TOOLS_NETHERITE_GOLD)
                .addTag(ModTags.TIERS_TOOLS_NETHERITE_EMERALD)
                .addTag(ModTags.TIERS_TOOLS_NETHERITE_DIAMOND);
        getOrCreateTagBuilder(ModTags.TIERS_TOOLS_NETHERITE_IRON)
                .add(ModItems.NETHERITE_IRON_AXE)
                .add(ModItems.NETHERITE_IRON_HOE)
                .add(ModItems.NETHERITE_IRON_PICKAXE)
                .add(ModItems.NETHERITE_IRON_SHOVEL)
                .add(ModItems.NETHERITE_IRON_SWORD);
        getOrCreateTagBuilder(ModTags.TIERS_TOOLS_NETHERITE_GOLD)
                .add(ModItems.NETHERITE_GOLD_AXE)
                .add(ModItems.NETHERITE_GOLD_HOE)
                .add(ModItems.NETHERITE_GOLD_PICKAXE)
                .add(ModItems.NETHERITE_GOLD_SHOVEL)
                .add(ModItems.NETHERITE_GOLD_SWORD);
        getOrCreateTagBuilder(ModTags.TIERS_TOOLS_NETHERITE_EMERALD)
                .add(ModItems.NETHERITE_EMERALD_AXE)
                .add(ModItems.NETHERITE_EMERALD_HOE)
                .add(ModItems.NETHERITE_EMERALD_PICKAXE)
                .add(ModItems.NETHERITE_EMERALD_SHOVEL)
                .add(ModItems.NETHERITE_EMERALD_SWORD);
        getOrCreateTagBuilder(ModTags.TIERS_TOOLS_NETHERITE_DIAMOND)
                .add(ModItems.NETHERITE_DIAMOND_AXE)
                .add(ModItems.NETHERITE_DIAMOND_HOE)
                .add(ModItems.NETHERITE_DIAMOND_PICKAXE)
                .add(ModItems.NETHERITE_DIAMOND_SHOVEL)
                .add(ModItems.NETHERITE_DIAMOND_SWORD);

        // config
        getOrCreateTagBuilder(FabricModTags.CONFIG_PACIFY_PHANTOMS)
                .addTag(ModTags.TIERS_ARMOR_NETHERITE_IRON);
        getOrCreateTagBuilder(FabricModTags.CONFIG_PACIFY_PIGLINS)
                .addTag(ModTags.TIERS_ARMOR_NETHERITE_GOLD)
                .addTag(ModTags.TIERS_ARMOR_NETHERITE_DIAMOND);
        getOrCreateTagBuilder(FabricModTags.CONFIG_PACIFY_ENDERMEN)
                .addTag(ModTags.TIERS_ARMOR_NETHERITE_EMERALD)
                .addTag(ModTags.TIERS_ARMOR_NETHERITE_DIAMOND);


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
