package com.autovw.advancednetherite.datagen;

import com.autovw.advancednetherite.AdvancedNetherite;
import com.autovw.advancednetherite.api.annotation.Internal;
import com.autovw.advancednetherite.datagen.providers.*;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.concurrent.CompletableFuture;

/**
 * @author Autovw
 */
@Internal
@Mod.EventBusSubscriber(modid = AdvancedNetherite.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModDataGenerator
{
    private ModDataGenerator()
    {
    }

    /**
     * A data generator which will generate json files such as item models, blockstates, recipes etc.
     *
     * @param event Event fired by Forge, which will start the data generator
     */
    @SuppressWarnings("unused")
    @SubscribeEvent
    public static void onGatherData(final GatherDataEvent event)
    {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();
        ExistingFileHelper helper = event.getExistingFileHelper();
        ModBlockTagsProvider blockTagsProvider = new ModBlockTagsProvider(packOutput, lookupProvider, AdvancedNetherite.MOD_ID, helper);

        // server
        generator.addProvider(event.includeServer(), blockTagsProvider);
        generator.addProvider(event.includeServer(), new ModItemTagsProvider(packOutput, lookupProvider, blockTagsProvider.contentsGetter(), AdvancedNetherite.MOD_ID, helper));
        generator.addProvider(event.includeServer(), new ModEnchantmentTagsProvider(packOutput, lookupProvider));
        generator.addProvider(event.includeServer(), new ModRecipeProvider.Runner(packOutput, lookupProvider));
        generator.addProvider(event.includeServer(), new ModLootTableProvider(packOutput, lookupProvider));
        generator.addProvider(event.includeServer(), new ModAdvancementProvider(packOutput, lookupProvider, helper));
        generator.addProvider(event.includeServer(), new ModLootModifierProvider(packOutput, AdvancedNetherite.MOD_ID, lookupProvider));

        // client
        generator.addProvider(event.includeClient(), new ModEquipmentAssetProvider(packOutput));
        generator.addProvider(event.includeClient(), new ModModelProvider(packOutput, AdvancedNetherite.MOD_ID));
    }
}
