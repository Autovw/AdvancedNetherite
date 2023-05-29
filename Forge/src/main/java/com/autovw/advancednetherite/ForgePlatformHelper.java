package com.autovw.advancednetherite;

import com.autovw.advancednetherite.helper.IPlatformHelper;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.loading.FMLLoader;

/**
 * @author Autovw
 */
public final class ForgePlatformHelper implements IPlatformHelper
{
    private static IPlatformHelper instance;

    public static IPlatformHelper getInstance()
    {
        if (instance == null)
        {
            instance = new ForgePlatformHelper();
        }
        return instance;
    }

    private ForgePlatformHelper()
    {
    }

    @Override
    public Platform getPlatform()
    {
        return Platform.FORGE;
    }

    @Override
    public boolean isModLoaded(String modId)
    {
        return ModList.get().isLoaded(modId);
    }

    @Override
    public boolean isProduction()
    {
        return FMLLoader.isProduction();
    }
}
