package com.autovw.advancednetherite.config.common;

import com.autovw.advancednetherite.api.annotation.Internal;

/**
 * @since 2.0.0
 * @author Autovw
 */
@Internal
public interface IAdditionalDropsConfig
{
    boolean enableAdditionalCropDrops();

    boolean enableAdditionalOreDrops();

    boolean enableAdditionalMobDrops();
}
