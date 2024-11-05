package com.autovw.advancednetherite.config;

import com.autovw.advancednetherite.api.annotation.Internal;
import com.autovw.advancednetherite.config.common.IAdditionalDropsConfig;

/**
 * @since 2.0.0
 * @author Autovw
 */
@Internal
public interface ICommonConfig
{
    IAdditionalDropsConfig getAdditionalDrops();
}
