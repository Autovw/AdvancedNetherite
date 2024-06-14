package com.autovw.advancednetherite.datagen.providers;

import com.autovw.advancednetherite.AdvancedNetherite;
import com.autovw.advancednetherite.api.annotation.Internal;
import com.autovw.advancednetherite.core.registry.ModBlockRegistry;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

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
        ModBlockRegistry.BLOCKS.getEntries().stream().map(RegistryObject::get).forEach(this::netheriteBlock);
    }

    /**
     * Helper method for generating blockstates, block models and item models.
     *
     * @param block The block for which you want to generate blockstates and models
     * @param texture The location of the block texture
     */
    public void netheriteBlock(Block block, ResourceLocation texture)
    {
        getVariantBuilder(block).partialState().setModels(new ConfiguredModel(models().cubeAll(ForgeRegistries.BLOCKS.getKey(block).getPath(), texture)));
        itemModels().withExistingParent(ForgeRegistries.BLOCKS.getKey(block).getPath(), ResourceLocation.fromNamespaceAndPath(ForgeRegistries.BLOCKS.getKey(block).getNamespace(), "block/" + ForgeRegistries.BLOCKS.getKey(block).getPath()));
    }

    @Internal
    private void netheriteBlock(Block block)
    {
        netheriteBlock(block, ResourceLocation.fromNamespaceAndPath(AdvancedNetherite.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(block).getPath()));
    }
}
