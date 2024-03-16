package com.autovw.advancednetherite.core.registry;

import com.autovw.advancednetherite.AdvancedNetherite;
import com.autovw.advancednetherite.api.annotation.Internal;
import com.autovw.advancednetherite.core.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

/**
 * @author Autovw
 */
public final class ModItemRegistry
{
    @Internal
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(AdvancedNetherite.MOD_ID);

    // Ingots
    public static final DeferredItem<Item> NETHERITE_IRON_INGOT = ITEMS.register("netherite_iron_ingot", () -> ModItems.NETHERITE_IRON_INGOT);
    public static final DeferredItem<Item> NETHERITE_GOLD_INGOT = ITEMS.register("netherite_gold_ingot", () -> ModItems.NETHERITE_GOLD_INGOT);
    public static final DeferredItem<Item> NETHERITE_EMERALD_INGOT = ITEMS.register("netherite_emerald_ingot", () -> ModItems.NETHERITE_EMERALD_INGOT);
    public static final DeferredItem<Item> NETHERITE_DIAMOND_INGOT = ITEMS.register("netherite_diamond_ingot", () -> ModItems.NETHERITE_DIAMOND_INGOT);

    // ARMOR SETS
    // Netherite-Iron
    public static final DeferredItem<Item> NETHERITE_IRON_HELMET = ITEMS.register("netherite_iron_helmet", () -> ModItems.NETHERITE_IRON_HELMET);
    public static final DeferredItem<Item> NETHERITE_IRON_CHESTPLATE = ITEMS.register("netherite_iron_chestplate", () -> ModItems.NETHERITE_IRON_CHESTPLATE);
    public static final DeferredItem<Item> NETHERITE_IRON_LEGGINGS = ITEMS.register("netherite_iron_leggings", () -> ModItems.NETHERITE_IRON_LEGGINGS);
    public static final DeferredItem<Item> NETHERITE_IRON_BOOTS = ITEMS.register("netherite_iron_boots", () -> ModItems.NETHERITE_IRON_BOOTS);

    // Netherite-Gold
    public static final DeferredItem<Item> NETHERITE_GOLD_HELMET = ITEMS.register("netherite_gold_helmet", () -> ModItems.NETHERITE_GOLD_HELMET);
    public static final DeferredItem<Item> NETHERITE_GOLD_CHESTPLATE = ITEMS.register("netherite_gold_chestplate", () -> ModItems.NETHERITE_GOLD_CHESTPLATE);
    public static final DeferredItem<Item> NETHERITE_GOLD_LEGGINGS = ITEMS.register("netherite_gold_leggings", () -> ModItems.NETHERITE_GOLD_LEGGINGS);
    public static final DeferredItem<Item> NETHERITE_GOLD_BOOTS = ITEMS.register("netherite_gold_boots", () -> ModItems.NETHERITE_GOLD_BOOTS);

    // Netherite-Emerald
    public static final DeferredItem<Item> NETHERITE_EMERALD_HELMET = ITEMS.register("netherite_emerald_helmet", () -> ModItems.NETHERITE_EMERALD_HELMET);
    public static final DeferredItem<Item> NETHERITE_EMERALD_CHESTPLATE = ITEMS.register("netherite_emerald_chestplate", () -> ModItems.NETHERITE_EMERALD_CHESTPLATE);
    public static final DeferredItem<Item> NETHERITE_EMERALD_LEGGINGS = ITEMS.register("netherite_emerald_leggings", () -> ModItems.NETHERITE_EMERALD_LEGGINGS);
    public static final DeferredItem<Item> NETHERITE_EMERALD_BOOTS = ITEMS.register("netherite_emerald_boots", () -> ModItems.NETHERITE_EMERALD_BOOTS);

    // Netherite-Diamond
    public static final DeferredItem<Item> NETHERITE_DIAMOND_HELMET = ITEMS.register("netherite_diamond_helmet", () -> ModItems.NETHERITE_DIAMOND_HELMET);
    public static final DeferredItem<Item> NETHERITE_DIAMOND_CHESTPLATE = ITEMS.register("netherite_diamond_chestplate", () -> ModItems.NETHERITE_DIAMOND_CHESTPLATE);
    public static final DeferredItem<Item> NETHERITE_DIAMOND_LEGGINGS = ITEMS.register("netherite_diamond_leggings", () -> ModItems.NETHERITE_DIAMOND_LEGGINGS);
    public static final DeferredItem<Item> NETHERITE_DIAMOND_BOOTS = ITEMS.register("netherite_diamond_boots", () -> ModItems.NETHERITE_DIAMOND_BOOTS);

    // TOOLS
    // Axes
    public static final DeferredItem<Item> NETHERITE_IRON_AXE = ITEMS.register("netherite_iron_axe", () -> ModItems.NETHERITE_IRON_AXE);
    public static final DeferredItem<Item> NETHERITE_GOLD_AXE = ITEMS.register("netherite_gold_axe", () -> ModItems.NETHERITE_GOLD_AXE);
    public static final DeferredItem<Item> NETHERITE_EMERALD_AXE = ITEMS.register("netherite_emerald_axe", () -> ModItems.NETHERITE_EMERALD_AXE);
    public static final DeferredItem<Item> NETHERITE_DIAMOND_AXE = ITEMS.register("netherite_diamond_axe", () -> ModItems.NETHERITE_DIAMOND_AXE);

    // Hoes
    public static final DeferredItem<Item> NETHERITE_IRON_HOE = ITEMS.register("netherite_iron_hoe", () -> ModItems.NETHERITE_IRON_HOE);
    public static final DeferredItem<Item> NETHERITE_GOLD_HOE = ITEMS.register("netherite_gold_hoe", () -> ModItems.NETHERITE_GOLD_HOE);
    public static final DeferredItem<Item> NETHERITE_EMERALD_HOE = ITEMS.register("netherite_emerald_hoe", () -> ModItems.NETHERITE_EMERALD_HOE);
    public static final DeferredItem<Item> NETHERITE_DIAMOND_HOE = ITEMS.register("netherite_diamond_hoe", () -> ModItems.NETHERITE_DIAMOND_HOE);

    // Pickaxes
    public static final DeferredItem<Item> NETHERITE_IRON_PICKAXE = ITEMS.register("netherite_iron_pickaxe", () -> ModItems.NETHERITE_IRON_PICKAXE);
    public static final DeferredItem<Item> NETHERITE_GOLD_PICKAXE = ITEMS.register("netherite_gold_pickaxe", () -> ModItems.NETHERITE_GOLD_PICKAXE);
    public static final DeferredItem<Item> NETHERITE_EMERALD_PICKAXE = ITEMS.register("netherite_emerald_pickaxe", () -> ModItems.NETHERITE_EMERALD_PICKAXE);
    public static final DeferredItem<Item> NETHERITE_DIAMOND_PICKAXE = ITEMS.register("netherite_diamond_pickaxe", () -> ModItems.NETHERITE_DIAMOND_PICKAXE);

    // Shovels
    public static final DeferredItem<Item> NETHERITE_IRON_SHOVEL = ITEMS.register("netherite_iron_shovel", () -> ModItems.NETHERITE_IRON_SHOVEL);
    public static final DeferredItem<Item> NETHERITE_GOLD_SHOVEL = ITEMS.register("netherite_gold_shovel", () -> ModItems.NETHERITE_GOLD_SHOVEL);
    public static final DeferredItem<Item> NETHERITE_EMERALD_SHOVEL = ITEMS.register("netherite_emerald_shovel", () -> ModItems.NETHERITE_EMERALD_SHOVEL);
    public static final DeferredItem<Item> NETHERITE_DIAMOND_SHOVEL = ITEMS.register("netherite_diamond_shovel", () -> ModItems.NETHERITE_DIAMOND_SHOVEL);

    // Swords
    public static final DeferredItem<Item> NETHERITE_IRON_SWORD = ITEMS.register("netherite_iron_sword", () -> ModItems.NETHERITE_IRON_SWORD);
    public static final DeferredItem<Item> NETHERITE_GOLD_SWORD = ITEMS.register("netherite_gold_sword", () -> ModItems.NETHERITE_GOLD_SWORD);
    public static final DeferredItem<Item> NETHERITE_EMERALD_SWORD = ITEMS.register("netherite_emerald_sword", () -> ModItems.NETHERITE_EMERALD_SWORD);
    public static final DeferredItem<Item> NETHERITE_DIAMOND_SWORD = ITEMS.register("netherite_diamond_sword", () -> ModItems.NETHERITE_DIAMOND_SWORD);

    // Blocks
    public static final DeferredItem<BlockItem> NETHERITE_IRON_BLOCK = ITEMS.register("netherite_iron_block", () -> ModItems.NETHERITE_IRON_BLOCK);
    public static final DeferredItem<BlockItem> NETHERITE_GOLD_BLOCK = ITEMS.register("netherite_gold_block", () -> ModItems.NETHERITE_GOLD_BLOCK);
    public static final DeferredItem<BlockItem> NETHERITE_EMERALD_BLOCK = ITEMS.register("netherite_emerald_block", () -> ModItems.NETHERITE_EMERALD_BLOCK);
    public static final DeferredItem<BlockItem> NETHERITE_DIAMOND_BLOCK = ITEMS.register("netherite_diamond_block", () -> ModItems.NETHERITE_DIAMOND_BLOCK);
}
