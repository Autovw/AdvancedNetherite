package com.autovw.advancednetherite.datagen.providers;

import com.autovw.advancednetherite.AdvancedNetherite;
import com.autovw.advancednetherite.api.annotation.Internal;
import com.autovw.advancednetherite.core.registry.ModBlockRegistry;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ConfiguredModel;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredHolder;

/**
 * @author Autovw
 */
public class ModBlockStatesProvider extends BlockStateProvider
{
    public ModBlockStatesProvider(PackOutput packOutput, String modId, ExistingFileHelper exFileHelper)
    {
        super(packOutput, modId, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels()
    {
        ModBlockRegistry.BLOCKS.getEntries().stream().map(DeferredHolder::get).forEach(this::netheriteBlock);
    }

    /**
     * Helper method for generating blockstates, block models and item models.
     *
     * @param block The block for which you want to generate blockstates and models
     * @param texture The location of the block texture
     */
    public void netheriteBlock(Block block, ResourceLocation texture)
    {
        getVariantBuilder(block).partialState().setModels(new ConfiguredModel(models().cubeAll(AdvancedNetherite.getRegistryHelper().getBlockById(block).getPath(), texture)));
        itemModels().withExistingParent(AdvancedNetherite.getRegistryHelper().getBlockById(block).getPath(), ResourceLocation.fromNamespaceAndPath(AdvancedNetherite.getRegistryHelper().getBlockById(block).getNamespace(), "block/" + AdvancedNetherite.getRegistryHelper().getBlockById(block).getPath()));
    }

    @Internal
    private void netheriteBlock(Block block)
    {
        netheriteBlock(block, ResourceLocation.fromNamespaceAndPath(AdvancedNetherite.MOD_ID, "block/" + AdvancedNetherite.getRegistryHelper().getBlockById(block).getPath()));
    }
}
