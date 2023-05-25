package com.autovw.advancednetherite.config;

import com.autovw.advancednetherite.api.annotation.Internal;
import com.autovw.advancednetherite.config.server.IAdditionalDropPropertiesConfig;
import com.autovw.advancednetherite.config.server.IToolPropertiesConfig;

/**
 * @since 2.0.0
 * @author Autovw
 */
@Internal
public interface IServerConfig
{
    IAdditionalDropPropertiesConfig getAdditionalDropProperties();

    IToolPropertiesConfig getToolProperties();
}
