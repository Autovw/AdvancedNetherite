package com.autovw.advancednetherite;

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

    private AdvancedNetherite()
    {
    }

    public static void init(IPlatformHelper platformHelper)
    {
        LOGGER.info("Hello world!");
        AdvancedNetherite.platformHelper = platformHelper;
    }

    /**
     * @return Instance of platform helper, based on used mod loader
     */
    public static IPlatformHelper getPlatformHelper()
    {
        return AdvancedNetherite.platformHelper;
    }
}
