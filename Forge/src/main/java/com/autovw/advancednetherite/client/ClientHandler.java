package com.autovw.advancednetherite.client;

import com.autovw.advancednetherite.client.screen.ConfigScreen;
import net.minecraft.network.chat.Component;
import net.minecraftforge.client.ConfigScreenHandler;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

/**
 * Class containing all client code for Advanced Netherite.
 * Called in {@link com.autovw.advancednetherite.AdvancedNetherite#clientSetup(FMLClientSetupEvent)}
 * @author Autovw
 */
public class ClientHandler
{
    public static void onClientSetup()
    {
        // Only registers the config screen if configured is not present
        if (!ModList.get().isLoaded("configured"))
        {
            ModLoadingContext.get().registerExtensionPoint(ConfigScreenHandler.ConfigScreenFactory.class, () -> new ConfigScreenHandler.ConfigScreenFactory(((minecraft, parent) -> new ConfigScreen(Component.translatable("Advanced Netherite"), parent))));
        }
    }
}
