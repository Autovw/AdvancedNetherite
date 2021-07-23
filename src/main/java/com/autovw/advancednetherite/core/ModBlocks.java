package com.autovw.advancednetherite.core;

import com.autovw.advancednetherite.Reference;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

/**
 * Author: Autovw
 */
public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Reference.MOD_ID);

    // BLOCKS
    // Netherite Blocks

    // f_76279_ = METAL
    // f_76365_ = BLACK
    // f_56725_ = NETHERITE_BLOCK
    // m_60944_ = of
    // m_60999_ = requiresCorrectToolForDrops
    // m_60913_ = strength
    // m_60918_ = sound
    public static final RegistryObject<Block> NETHERITE_IRON_BLOCK = BLOCKS.register("netherite_iron_block",
            () -> new Block(BlockBehaviour.Properties.m_60944_(Material.f_76279_, MaterialColor.f_76365_).harvestLevel(3)
                    .harvestTool(ToolType.PICKAXE).m_60999_()
                    .m_60913_(50.0F, 1200.0F).m_60918_(SoundType.f_56725_)));
    public static final RegistryObject<Block> NETHERITE_GOLD_BLOCK = BLOCKS.register("netherite_gold_block",
            () -> new Block(BlockBehaviour.Properties.m_60944_(Material.f_76279_, MaterialColor.f_76365_).harvestLevel(3)
                    .harvestTool(ToolType.PICKAXE).m_60999_()
                    .m_60913_(50.0F, 1200.0F).m_60918_(SoundType.f_56725_)));
    public static final RegistryObject<Block> NETHERITE_EMERALD_BLOCK = BLOCKS.register("netherite_emerald_block",
            () -> new Block(BlockBehaviour.Properties.m_60944_(Material.f_76279_, MaterialColor.f_76365_).harvestLevel(3)
                    .harvestTool(ToolType.PICKAXE).m_60999_()
                    .m_60913_(50.0F, 1200.0F).m_60918_(SoundType.f_56725_)));
    public static final RegistryObject<Block> NETHERITE_DIAMOND_BLOCK = BLOCKS.register("netherite_diamond_block",
            () -> new Block(BlockBehaviour.Properties.m_60944_(Material.f_76279_, MaterialColor.f_76365_).harvestLevel(3)
                    .harvestTool(ToolType.PICKAXE).m_60999_()
                    .m_60913_(50.0F, 1200.0F).m_60918_(SoundType.f_56725_)));

    // BLOCK ITEMS
    // Netherite Blocks

    // m_41491_ = tab
    // m_41486_ = fireResistant
    public static final RegistryObject<BlockItem> NETHERITE_IRON_BLOCKITEM = ModItems.ITEMS.register("netherite_iron_block",
            () -> new BlockItem(ModBlocks.NETHERITE_IRON_BLOCK.get(), new Item.Properties().m_41491_(Reference.TAB_ADVANCEDNETHERITE)
                    .m_41486_()));
    public static final RegistryObject<BlockItem> NETHERITE_GOLD_BLOCKITEM = ModItems.ITEMS.register("netherite_gold_block",
            () -> new BlockItem(ModBlocks.NETHERITE_GOLD_BLOCK.get(), new Item.Properties().m_41491_(Reference.TAB_ADVANCEDNETHERITE)
                    .m_41486_()));
    public static final RegistryObject<BlockItem> NETHERITE_EMERALD_BLOCKITEM = ModItems.ITEMS.register("netherite_emerald_block",
            () -> new BlockItem(ModBlocks.NETHERITE_EMERALD_BLOCK.get(), new Item.Properties().m_41491_(Reference.TAB_ADVANCEDNETHERITE)
                    .m_41486_()));
    public static final RegistryObject<BlockItem> NETHERITE_DIAMOND_BLOCKITEM = ModItems.ITEMS.register("netherite_diamond_block",
            () -> new BlockItem(ModBlocks.NETHERITE_DIAMOND_BLOCK.get(), new Item.Properties().m_41491_(Reference.TAB_ADVANCEDNETHERITE)
                    .m_41486_()));
}