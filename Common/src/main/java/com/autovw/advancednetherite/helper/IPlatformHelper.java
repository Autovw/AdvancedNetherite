package com.autovw.advancednetherite.helper;

/**
 * @since 2.0.0
 * @author Autovw
 */
public interface IPlatformHelper
{
    /**
     * @return Current platform mod is loaded on
     */
    Platform getPlatform();

    /**
     * Checks if mod is loaded
     * @param modId Mod id to check for
     * @return If mod is loaded or not
     */
    boolean isModLoaded(String modId);

    /**
     * @return If mod is currently in production environment or not
     */
    boolean isProduction();

    enum Platform
    {
        FORGE,
        NEOFORGE,
        FABRIC;
    }
}
