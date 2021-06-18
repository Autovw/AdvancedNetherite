package com.autovw.advancednetherite.core;

import com.autovw.advancednetherite.Reference;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

/**
 * Author: Autovw
 */
public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Reference.MOD_ID);

    // BLOCKS
    // Netherite Blocks
    public static final RegistryObject<Block> NETHERITE_IRON_BLOCK = BLOCKS.register("netherite_iron_block",
            () -> new Block(AbstractBlock.Properties.of(Material.METAL, MaterialColor.COLOR_BLACK).harvestLevel(3)
                    .harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops()
                    .strength(50.0F, 1200.0F).sound(SoundType.NETHERITE_BLOCK)));
    public static final RegistryObject<Block> NETHERITE_GOLD_BLOCK = BLOCKS.register("netherite_gold_block",
            () -> new Block(AbstractBlock.Properties.of(Material.METAL, MaterialColor.COLOR_BLACK).harvestLevel(3)
                    .harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops()
                    .strength(50.0F, 1200.0F).sound(SoundType.NETHERITE_BLOCK)));
    public static final RegistryObject<Block> NETHERITE_EMERALD_BLOCK = BLOCKS.register("netherite_emerald_block",
            () -> new Block(AbstractBlock.Properties.of(Material.METAL, MaterialColor.COLOR_BLACK).harvestLevel(3)
                    .harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops()
                    .strength(50.0F, 1200.0F).sound(SoundType.NETHERITE_BLOCK)));
    public static final RegistryObject<Block> NETHERITE_DIAMOND_BLOCK = BLOCKS.register("netherite_diamond_block",
            () -> new Block(AbstractBlock.Properties.of(Material.METAL, MaterialColor.COLOR_BLACK).harvestLevel(3)
                    .harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops()
                    .strength(50.0F, 1200.0F).sound(SoundType.NETHERITE_BLOCK)));

    // BLOCK ITEMS
    // Netherite Blocks
    public static final RegistryObject<BlockItem> NETHERITE_IRON_BLOCKITEM = ModItems.ITEMS.register("netherite_iron_block",
            () -> new BlockItem(ModBlocks.NETHERITE_IRON_BLOCK.get(), new Item.Properties().tab(Reference.TAB_ADVANCEDNETHERITE)
                    .fireResistant()));
    public static final RegistryObject<BlockItem> NETHERITE_GOLD_BLOCKITEM = ModItems.ITEMS.register("netherite_gold_block",
            () -> new BlockItem(ModBlocks.NETHERITE_GOLD_BLOCK.get(), new Item.Properties().tab(Reference.TAB_ADVANCEDNETHERITE)
                    .fireResistant()));
    public static final RegistryObject<BlockItem> NETHERITE_EMERALD_BLOCKITEM = ModItems.ITEMS.register("netherite_emerald_block",
            () -> new BlockItem(ModBlocks.NETHERITE_EMERALD_BLOCK.get(), new Item.Properties().tab(Reference.TAB_ADVANCEDNETHERITE)
                    .fireResistant()));
    public static final RegistryObject<BlockItem> NETHERITE_DIAMOND_BLOCKITEM = ModItems.ITEMS.register("netherite_diamond_block",
            () -> new BlockItem(ModBlocks.NETHERITE_DIAMOND_BLOCK.get(), new Item.Properties().tab(Reference.TAB_ADVANCEDNETHERITE)
                    .fireResistant()));
}