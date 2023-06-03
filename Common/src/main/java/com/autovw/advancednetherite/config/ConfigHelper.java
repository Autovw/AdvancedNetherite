package com.autovw.advancednetherite.config;

import com.autovw.advancednetherite.api.annotation.Internal;

import java.util.function.Supplier;

/**
 * Helper class for accessing config values everywhere
 * @since 2.0.0
 * @author Autovw
 */
public final class ConfigHelper
{
    private static Supplier<IClientConfig> clientConfig;
    private static Supplier<ICommonConfig> commonConfig;
    private static Supplier<IServerConfig> serverConfig;
    private static ConfigHelper helper;

    public static ConfigHelper get()
    {
        if (ConfigHelper.helper == null)
        {
            ConfigHelper.helper = new ConfigHelper();
        }
        return ConfigHelper.helper;
    }

    @Internal
    public static void registerClientConfig(Supplier<IClientConfig> clientConfig)
    {
        if (ConfigHelper.clientConfig == null)
        {
            ConfigHelper.clientConfig = clientConfig;
        }
    }

    @Internal
    public static void registerCommonConfig(Supplier<ICommonConfig> commonConfig)
    {
        if (ConfigHelper.commonConfig == null)
        {
            ConfigHelper.commonConfig = commonConfig;
        }
    }

    @Internal
    public static void registerServerConfig(Supplier<IServerConfig> serverConfig)
    {
        if (ConfigHelper.serverConfig == null)
        {
            ConfigHelper.serverConfig = serverConfig;
        }
    }

    private ConfigHelper()
    {
    }

    public IClientConfig getClient()
    {
        return ConfigHelper.clientConfig.get();
    }

    public ICommonConfig getCommon()
    {
        return ConfigHelper.commonConfig.get();
    }

    public IServerConfig getServer()
    {
        return ConfigHelper.serverConfig.get();
    }
}
