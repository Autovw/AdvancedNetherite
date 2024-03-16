package com.autovw.advancednetherite.core.registry;

import com.autovw.advancednetherite.AdvancedNetherite;
import com.autovw.advancednetherite.api.annotation.Internal;
import com.autovw.advancednetherite.core.ModBlocks;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

/**
 * @author Autovw
 */
public final class ModBlockRegistry
{
    @Internal
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(AdvancedNetherite.MOD_ID);

    // Blocks
    public static final DeferredBlock<Block> NETHERITE_IRON_BLOCK = BLOCKS.register("netherite_iron_block", () -> ModBlocks.NETHERITE_IRON_BLOCK);
    public static final DeferredBlock<Block> NETHERITE_GOLD_BLOCK = BLOCKS.register("netherite_gold_block", () -> ModBlocks.NETHERITE_GOLD_BLOCK);
    public static final DeferredBlock<Block> NETHERITE_EMERALD_BLOCK = BLOCKS.register("netherite_emerald_block", () -> ModBlocks.NETHERITE_EMERALD_BLOCK);
    public static final DeferredBlock<Block> NETHERITE_DIAMOND_BLOCK = BLOCKS.register("netherite_diamond_block", () -> ModBlocks.NETHERITE_DIAMOND_BLOCK);
}
