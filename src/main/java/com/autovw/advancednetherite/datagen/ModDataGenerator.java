package com.autovw.advancednetherite.datagen;

import com.autovw.advancednetherite.Reference;
import com.autovw.advancednetherite.datagen.providers.*;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

/**
 * Author: Autovw
 */
@Mod.EventBusSubscriber(modid = Reference.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModDataGenerator {
    private ModDataGenerator() { }

    /**
     * A data generator which will generate json files such as item models, blockstates, recipes etc.
     *
     * @param event Event fired by Forge, which will start the data generator
     */
    @SuppressWarnings("unused")
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        ExistingFileHelper helper = event.getExistingFileHelper();
        ModBlockTagsProvider blockTagsProvider = new ModBlockTagsProvider(generator, Reference.MOD_ID, helper);

        if (event.includeServer()) {
            generator.addProvider(blockTagsProvider);
            generator.addProvider(new ModItemTagsProvider(generator, blockTagsProvider, Reference.MOD_ID, helper));
            generator.addProvider(new ModRecipeProvider(generator));
            generator.addProvider(new ModLootTableProvider(generator));
            generator.addProvider(new ModAdvancementProvider(generator, helper));
        }

        if (event.includeClient()) {
            generator.addProvider(new ModBlockStatesProvider(generator, Reference.MOD_ID, helper));
            generator.addProvider(new ModItemModelProvider(generator, Reference.MOD_ID, helper));
        }
    }
}
