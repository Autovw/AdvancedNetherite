package com.autovw.advancednetherite.config.server;

import com.autovw.advancednetherite.api.annotation.Internal;

/**
 * @since 2.0.0
 * @author Autovw
 */
@Internal
public interface IAdditionalDropPropertiesConfig
{
    double getAdditionalWheatDropChance();
    double getAdditionalCarrotsDropChance();
    double getAdditionalPotatoesDropChance();
    double getAdditionalBeetrootsDropChance();

    double getAdditionalPhantomDropChance();
    double getAdditionalZombifiedPiglinDropChance();
    double getAdditionalPiglinDropChance();
    double getAdditionalEndermanDropChance();

    double getAdditionalRawIronDropChance();
    double getAdditionalRawGoldDropChance();
    double getAdditionalEmeraldDropChance();
    double getAdditionalDiamondDropChance();
    double getAdditionalGoldNuggetDropChance();
}
