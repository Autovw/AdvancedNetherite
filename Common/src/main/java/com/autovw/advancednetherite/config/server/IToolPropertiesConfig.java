package com.autovw.advancednetherite.config.server;

import com.autovw.advancednetherite.api.annotation.Internal;

/**
 * @since 2.0.0
 * @author Autovw
 */
@Internal
public interface IToolPropertiesConfig
{
    int getIronBreakingSpeedMultiplier();

    int getGoldBreakingSpeedMultiplier();

    int getEmeraldBreakingSpeedMultiplier();

    int getDiamondBreakingSpeedMultiplier();
}
