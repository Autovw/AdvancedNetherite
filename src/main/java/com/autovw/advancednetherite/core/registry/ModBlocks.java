package com.autovw.advancednetherite.core.registry;

import com.autovw.advancednetherite.Reference;
import com.autovw.advancednetherite.common.item.AdvancedBlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

/**
 * Author: Autovw
 */
public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Reference.MOD_ID);

    public static final RegistryObject<Block> NETHERITE_IRON_BLOCK = register("netherite_iron_block", new Item.Properties());
    public static final RegistryObject<Block> NETHERITE_GOLD_BLOCK = register("netherite_gold_block", new Item.Properties());
    public static final RegistryObject<Block> NETHERITE_EMERALD_BLOCK = register("netherite_emerald_block", new Item.Properties());
    public static final RegistryObject<Block> NETHERITE_DIAMOND_BLOCK = register("netherite_diamond_block", new Item.Properties());

    /**
     * This method is used to automatically register blocks and blockitems.
     * The block properties are directly copied from the vanilla netherite block.
     *
     * @param name Name of the block
     * @param properties The properties of the blockitem
     * @return The block + properties
     */
    private static RegistryObject<Block> register(String name, Item.Properties properties) {
        RegistryObject<Block> block = BLOCKS.register(name, () -> new Block(BlockBehaviour.Properties.copy(Blocks.NETHERITE_BLOCK)));
        ModItems.ITEMS.register(name, () -> new AdvancedBlockItem(block.get(), properties));
        return block;
    }
}
