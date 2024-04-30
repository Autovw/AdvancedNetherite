package com.autovw.advancednetherite.client;

import com.autovw.advancednetherite.client.screen.ConfigScreen;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
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
            // For whatever reason "parent" does not exist. Wtf.
            //ModLoadingContext.get().registerExtensionPoint(IConfigScreenFactory.class, (minecraft, parent) -> new ConfigScreen(Component.translatable("Advanced Netherite"), parent));
        }
    }
}
