package com.autovw.advancednetherite.core;

import com.autovw.advancednetherite.Reference;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

/**
 * Author: Autovw
 */
public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Reference.MOD_ID);

    public static final RegistryObject<Block> NETHERITE_IRON_BLOCK = register("netherite_iron_block", Reference.TAB_ADVANCEDNETHERITE);
    public static final RegistryObject<Block> NETHERITE_GOLD_BLOCK = register("netherite_gold_block", Reference.TAB_ADVANCEDNETHERITE);
    public static final RegistryObject<Block> NETHERITE_EMERALD_BLOCK = register("netherite_emerald_block", Reference.TAB_ADVANCEDNETHERITE);
    public static final RegistryObject<Block> NETHERITE_DIAMOND_BLOCK = register("netherite_diamond_block", Reference.TAB_ADVANCEDNETHERITE);

    /**
     * This method is used to automatically register blocks and blockitems.
     * The block properties are directly copied from the vanilla netherite block.
     *
     * @param name Name of the block
     * @param creativeTab The creative tab for the blockitem
     * @return The block + properties
     */
    public static RegistryObject<Block> register(String name, CreativeModeTab creativeTab) {
        RegistryObject<Block> block = BLOCKS.register(name, () -> new Block(BlockBehaviour.Properties.copy(Blocks.NETHERITE_BLOCK)));
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(creativeTab).fireResistant()));
        return block;
    }
}
