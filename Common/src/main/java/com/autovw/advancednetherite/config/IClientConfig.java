package com.autovw.advancednetherite.config;

import com.autovw.advancednetherite.api.annotation.Internal;

/**
 * @since 2.0.0
 * @author Autovw
 */
@Internal
public interface IClientConfig
{
    boolean showTooltips();

    boolean matchingDurabilityBars();

    boolean forceDisableDetailArmorBarSupport();
}
