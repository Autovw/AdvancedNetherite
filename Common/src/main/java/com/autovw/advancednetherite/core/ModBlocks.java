package com.autovw.advancednetherite.core;

import com.autovw.advancednetherite.AdvancedNetherite;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

/**
 * @author Autovw
 */
public final class ModBlocks
{
    public static final Block NETHERITE_IRON_BLOCK = new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.NETHERITE_BLOCK).setId(key("netherite_iron_block")));
    public static final Block NETHERITE_GOLD_BLOCK = new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.NETHERITE_BLOCK).setId(key("netherite_gold_block")));
    public static final Block NETHERITE_EMERALD_BLOCK = new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.NETHERITE_BLOCK).setId(key("netherite_emerald_block")));
    public static final Block NETHERITE_DIAMOND_BLOCK = new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.NETHERITE_BLOCK).setId(key("netherite_diamond_block")));

    private static ResourceKey<Block> key(String name)
    {
        return ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(AdvancedNetherite.MOD_ID, name));
    }
}
