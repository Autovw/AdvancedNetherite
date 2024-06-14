package com.autovw.advancednetherite.datagen;

import com.autovw.advancednetherite.datagen.providers.*;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

/**
 * @author Autovw
 */
public class ModDataGenerator implements DataGeneratorEntrypoint
{
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator generator)
    {
        FabricDataGenerator.Pack pack = generator.createPack();

        pack.addProvider(ModBlockStatesProvider::new);
        pack.addProvider(ModBlockLootTablesProvider::new);
        pack.addProvider(ModRecipeProvider::new);

        pack.addProvider(ModBlockTagsProvider::new);
        pack.addProvider(ModItemTagsProvider::new);
        pack.addProvider(ModEnchantmentTagsProvider::new);
    }
}
