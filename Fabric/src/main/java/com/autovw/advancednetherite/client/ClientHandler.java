package com.autovw.advancednetherite.client;

import com.autovw.advancednetherite.AdvancedNetherite;
import com.autovw.advancednetherite.config.ConfigHelper;
import net.fabricmc.api.ClientModInitializer;

/**
 * @author Autovw
 */
public class ClientHandler implements ClientModInitializer
{
    @Override
    public void onInitializeClient()
    {
        if (AdvancedNetherite.getPlatformHelper().isModLoaded("detailab") && !ConfigHelper.get().getClient().forceDisableDetailArmorBarSupport())
        {
            DetailArmorBarSupport.register();
        }
    }
}
