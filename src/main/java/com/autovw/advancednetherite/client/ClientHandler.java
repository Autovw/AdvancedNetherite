package com.autovw.advancednetherite.client;

import com.autovw.advancednetherite.client.screen.ConfigScreen;
import com.autovw.advancednetherite.config.Config;
import net.minecraft.util.text.StringTextComponent;
import net.minecraftforge.fml.ExtensionPoint;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

/**
 * Author: Autovw
 * <br/>
 * Class containing all client code for Advanced Netherite.
 * Called in {@link com.autovw.advancednetherite.AdvancedNetherite#clientSetup(FMLClientSetupEvent)}
 */
public class ClientHandler {
    public static void onClientSetup() {
        // Only registers the config screen if configured is not present
        if (!ModList.get().isLoaded("configured")) {
            ModLoadingContext.get().registerExtensionPoint(ExtensionPoint.CONFIGGUIFACTORY, () -> (minecraft, parent) -> new ConfigScreen(new StringTextComponent("Advanced Netherite"), parent));
        }

        // register optional support for Detail Armor Bar if the mod is present
        if (ModList.get().isLoaded("detailab") && !Config.Client.forceDisableDetailArmorBarSupport.get()) {
            DetailArmorBarSupport.register();
        }
    }
}
