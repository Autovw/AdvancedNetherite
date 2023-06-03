package com.autovw.advancednetherite.core.registry;

import com.autovw.advancednetherite.AdvancedNetherite;
import com.autovw.advancednetherite.api.annotation.Internal;
import com.autovw.advancednetherite.core.ModBlocks;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

/**
 * @author Autovw
 */
public final class ModBlockRegistry
{
    @Internal
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, AdvancedNetherite.MOD_ID);

    // Blocks
    public static final RegistryObject<Block> NETHERITE_IRON_BLOCK = BLOCKS.register("netherite_iron_block", () -> ModBlocks.NETHERITE_IRON_BLOCK);
    public static final RegistryObject<Block> NETHERITE_GOLD_BLOCK = BLOCKS.register("netherite_gold_block", () -> ModBlocks.NETHERITE_GOLD_BLOCK);
    public static final RegistryObject<Block> NETHERITE_EMERALD_BLOCK = BLOCKS.register("netherite_emerald_block", () -> ModBlocks.NETHERITE_EMERALD_BLOCK);
    public static final RegistryObject<Block> NETHERITE_DIAMOND_BLOCK = BLOCKS.register("netherite_diamond_block", () -> ModBlocks.NETHERITE_DIAMOND_BLOCK);
}
