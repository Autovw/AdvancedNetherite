package com.autovw.advancednetherite.config;

import com.autovw.advancednetherite.api.annotation.Internal;
import com.autovw.advancednetherite.config.common.IAdditionalDropsConfig;
import com.autovw.advancednetherite.config.common.IArmorConfig;

/**
 * @since 2.0.0
 * @author Autovw
 */
@Internal
public interface ICommonConfig
{
    IArmorConfig getArmor();

    IAdditionalDropsConfig getAdditionalDrops();
}
