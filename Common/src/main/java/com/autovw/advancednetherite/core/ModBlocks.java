package com.autovw.advancednetherite.core;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

/**
 * @author Autovw
 */
public final class ModBlocks
{
    public static final Block NETHERITE_IRON_BLOCK = new Block(BlockBehaviour.Properties.copy(Blocks.NETHERITE_BLOCK));
    public static final Block NETHERITE_GOLD_BLOCK = new Block(BlockBehaviour.Properties.copy(Blocks.NETHERITE_BLOCK));
    public static final Block NETHERITE_EMERALD_BLOCK = new Block(BlockBehaviour.Properties.copy(Blocks.NETHERITE_BLOCK));
    public static final Block NETHERITE_DIAMOND_BLOCK = new Block(BlockBehaviour.Properties.copy(Blocks.NETHERITE_BLOCK));
}
