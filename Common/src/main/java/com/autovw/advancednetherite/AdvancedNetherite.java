package com.autovw.advancednetherite;

import com.autovw.advancednetherite.api.annotation.Internal;
import com.autovw.advancednetherite.helper.IPlatformHelper;
import com.autovw.advancednetherite.helper.IRegistryHelper;
import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

/**
 * @author Autovw
 */
public class AdvancedNetherite
{
    public static final String MOD_ID = "advancednetherite";
    private static final Logger LOGGER = LogUtils.getLogger();
    private static IPlatformHelper platformHelper;
    private static IRegistryHelper registryHelper;

    private AdvancedNetherite()
    {
    }

    @Internal
    public static void init(IPlatformHelper platformHelper)
    {
        LOGGER.info("Initializing platform helper for Advanced Netherite!");
        AdvancedNetherite.platformHelper = platformHelper;
    }

    @Internal
    public static void setRegistryHelper(IRegistryHelper registryHelper)
    {
        if (AdvancedNetherite.registryHelper == null)
        {
            AdvancedNetherite.registryHelper = registryHelper;
        }
    }

    /**
     * @return Instance of platform helper, based on used mod loader
     */
    public static IPlatformHelper getPlatformHelper()
    {
        return AdvancedNetherite.platformHelper;
    }

    /**
     * @return Instance of the mod loader independent registry helper
     */
    public static IRegistryHelper getRegistryHelper()
    {
        return AdvancedNetherite.registryHelper;
    }
}
