package com.autovw.advancednetherite.datagen;

import com.autovw.advancednetherite.AdvancedNetherite;
import com.autovw.advancednetherite.api.annotation.Internal;
import com.autovw.advancednetherite.datagen.providers.*;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.data.event.GatherDataEvent;

import java.util.concurrent.CompletableFuture;

/**
 * @author Autovw
 */
@Internal
@EventBusSubscriber(modid = AdvancedNetherite.MOD_ID, value = Dist.CLIENT)
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
    public static void onGatherData(final GatherDataEvent.Client event)
    {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        // server
        event.addProvider(new ModBlockTagsProvider(packOutput, lookupProvider, AdvancedNetherite.MOD_ID));
        event.addProvider(new ModItemTagsProvider(packOutput, lookupProvider, AdvancedNetherite.MOD_ID));
        event.addProvider(new ModEnchantmentTagsProvider(packOutput, lookupProvider, AdvancedNetherite.MOD_ID));
        event.addProvider(new ModRecipeProvider.Runner(packOutput, lookupProvider));
        event.addProvider(new ModLootTableProvider(packOutput, lookupProvider));
        event.addProvider(new ModAdvancementProvider(packOutput, lookupProvider));
        event.addProvider(new ModLootModifierProvider(packOutput, lookupProvider, AdvancedNetherite.MOD_ID));

        // client
        event.addProvider(new ModEquipmentAssetProvider(packOutput));
        event.addProvider(new ModModelProvider(packOutput, AdvancedNetherite.MOD_ID));
    }
}
