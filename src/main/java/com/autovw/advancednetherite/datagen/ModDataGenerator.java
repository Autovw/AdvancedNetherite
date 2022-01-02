package com.autovw.advancednetherite.datagen;

import com.autovw.advancednetherite.Reference;
import com.autovw.advancednetherite.datagen.providers.ModBlockStatesProvider;
import com.autovw.advancednetherite.datagen.providers.ModBlockTagsProvider;
import com.autovw.advancednetherite.datagen.providers.ModItemModelProvider;
import com.autovw.advancednetherite.datagen.providers.ModLootTableProvider;
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

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        ExistingFileHelper helper = event.getExistingFileHelper();

        if (event.includeServer()) {
            generator.addProvider(new ModBlockTagsProvider(generator, helper));
            generator.addProvider(new ModLootTableProvider(generator));
        }

        if (event.includeClient()) {
            generator.addProvider(new ModBlockStatesProvider(generator, helper));
            generator.addProvider(new ModItemModelProvider(generator, helper));
        }
    }
}
