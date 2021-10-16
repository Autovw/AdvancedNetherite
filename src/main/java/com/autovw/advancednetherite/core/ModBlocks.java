package com.autovw.advancednetherite.core;

import com.autovw.advancednetherite.Reference;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
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

    public static final RegistryObject<Block> NETHERITE_IRON_BLOCK = register("netherite_iron_block", new Item.Properties().tab(Reference.TAB_ADVANCEDNETHERITE).fireResistant());
    public static final RegistryObject<Block> NETHERITE_GOLD_BLOCK = register("netherite_gold_block", new Item.Properties().tab(Reference.TAB_ADVANCEDNETHERITE).fireResistant());
    public static final RegistryObject<Block> NETHERITE_EMERALD_BLOCK = register("netherite_emerald_block", new Item.Properties().tab(Reference.TAB_ADVANCEDNETHERITE).fireResistant());
    public static final RegistryObject<Block> NETHERITE_DIAMOND_BLOCK = register("netherite_diamond_block", new Item.Properties().tab(Reference.TAB_ADVANCEDNETHERITE).fireResistant());

    /**
     * This method is used to automatically register blocks and blockitems.
     * The block properties are directly copied from the vanilla netherite block.
     *
     * @param name Name of the block
     * @param properties The properties of the blockitem
     * @return The block + properties
     */
    public static RegistryObject<Block> register(String name, Item.Properties properties) {
        // Warning! harvestLevel and harvestTool were removed in 1.17, use JSON tags instead
        RegistryObject<Block> block = BLOCKS.register(name, () -> new Block(AbstractBlock.Properties.copy(Blocks.NETHERITE_BLOCK).harvestLevel(3).harvestTool(ToolType.PICKAXE)));
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), properties));
        return block;
    }
}
