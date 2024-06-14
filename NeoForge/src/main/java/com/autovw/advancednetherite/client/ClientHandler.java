package com.autovw.advancednetherite.client;

import com.autovw.advancednetherite.client.screen.ConfigScreen;
import net.minecraft.network.chat.Component;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.ModList;
import net.neoforged.fml.ModLoadingContext;
import net.neoforged.neoforge.client.gui.IConfigScreenFactory;

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
            ModContainer container = ModLoadingContext.get().getActiveContainer();
            container.registerExtensionPoint(IConfigScreenFactory.class, (minecraft, parent) -> new ConfigScreen(Component.translatable("Advanced Netherite"), parent));
        }
    }
}
