package com.autovw.advancednetherite;

import com.autovw.advancednetherite.helper.IPlatformHelper;
import net.fabricmc.loader.api.FabricLoader;

/**
 * @author Autovw
 */
public final class FabricPlatformHelper implements IPlatformHelper
{
    private static IPlatformHelper instance;

    public static IPlatformHelper getInstance()
    {
        if (instance == null)
        {
            instance = new FabricPlatformHelper();
        }
        return instance;
    }

    private FabricPlatformHelper()
    {
    }

    @Override
    public Platform getPlatform()
    {
        return Platform.FABRIC;
    }

    @Override
    public boolean isModLoaded(String modId)
    {
        return FabricLoader.getInstance().isModLoaded(modId);
    }

    @Override
    public boolean isProduction()
    {
        return !FabricLoader.getInstance().isDevelopmentEnvironment();
    }
}
