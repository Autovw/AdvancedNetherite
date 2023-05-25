package com.autovw.advancednetherite.config.common;

import com.autovw.advancednetherite.api.annotation.Internal;

/**
 * @since 2.0.0
 * @author Autovw
 */
@Internal
public interface IArmorConfig
{
    boolean isIronPhantomPassiveArmor();
    boolean isIronPiglinPassiveArmor();
    boolean isIronEndermanPassiveArmor();

    boolean isGoldPhantomPassiveArmor();
    boolean isGoldPiglinPassiveArmor();
    boolean isGoldEndermanPassiveArmor();

    boolean isEmeraldPhantomPassiveArmor();
    boolean isEmeraldPiglinPassiveArmor();
    boolean isEmeraldEndermanPassiveArmor();

    boolean isDiamondPhantomPassiveArmor();
    boolean isDiamondPiglinPassiveArmor();
    boolean isDiamondEndermanPassiveArmor();
}
