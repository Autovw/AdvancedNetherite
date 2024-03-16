package com.autovw.advancednetherite.client;

import com.autovw.advancednetherite.client.screen.ConfigScreen;
import com.autovw.advancednetherite.config.ConfigHelper;
import net.minecraft.network.chat.Component;
import net.neoforged.fml.ModList;
import net.neoforged.fml.ModLoadingContext;
import net.neoforged.neoforge.client.ConfigScreenHandler;

/**
 * Class containing all client code for Advanced Netherite
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
