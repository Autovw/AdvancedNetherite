package com.autovw.advancednetherite.datagen.providers;

import com.autovw.advancednetherite.AdvancedNetherite;
import com.autovw.advancednetherite.core.registry.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;

/**
 * @author Autovw
 */
public class ModBlockStatesProvider extends BlockStateProvider {
    public ModBlockStatesProvider(PackOutput packOutput, String modId, ExistingFileHelper exFileHelper) {
        super(packOutput, modId, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        netheriteBlock(ModBlocks.NETHERITE_IRON_BLOCK.get());
        netheriteBlock(ModBlocks.NETHERITE_GOLD_BLOCK.get());
        netheriteBlock(ModBlocks.NETHERITE_EMERALD_BLOCK.get());
        netheriteBlock(ModBlocks.NETHERITE_DIAMOND_BLOCK.get());
    }

    /**
     * Helper method for generating blockstates, block models and item models.
     *
     * @param block The block for which you want to generate blockstates and models
     * @param texture The location of the block texture
     */
    public void netheriteBlock(Block block, ResourceLocation texture) {
        getVariantBuilder(block).partialState().setModels(new ConfiguredModel(models().cubeAll(ForgeRegistries.BLOCKS.getKey(block).getPath(), texture)));
        itemModels().withExistingParent(ForgeRegistries.BLOCKS.getKey(block).getPath(), new ResourceLocation(ForgeRegistries.BLOCKS.getKey(block).getNamespace(), "block/" + ForgeRegistries.BLOCKS.getKey(block).getPath()));
    }

    // Internal use only, use above method instead
    private void netheriteBlock(Block block) {
        netheriteBlock(block, new ResourceLocation(AdvancedNetherite.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(block).getPath()));
    }
}
