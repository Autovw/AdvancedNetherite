package com.autovw.advancednetherite;

import com.autovw.advancednetherite.helper.IPlatformHelper;
import net.neoforged.fml.ModList;
import net.neoforged.fml.loading.FMLLoader;

/**
 * @author Autovw
 */
public final class NeoForgePlatformHelper implements IPlatformHelper
{
    @Override
    public Platform getPlatform()
    {
        return Platform.NEOFORGE;
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
