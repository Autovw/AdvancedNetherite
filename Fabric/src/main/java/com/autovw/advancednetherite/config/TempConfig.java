package com.autovw.advancednetherite.config;

import com.autovw.advancednetherite.config.common.IAdditionalDropsConfig;
import com.autovw.advancednetherite.config.common.IArmorConfig;
import com.autovw.advancednetherite.config.server.IAdditionalDropPropertiesConfig;
import com.autovw.advancednetherite.config.server.IToolPropertiesConfig;

/**
 * Temporary config used until a proper config system has been implemented
 * @author Autovw
 */
@Deprecated
public class TempConfig
{
    public static final Client CLIENT;
    public static final Common COMMON;
    public static final Server SERVER;

    static
    {
        CLIENT = new Client();
        COMMON = new Common();
        SERVER = new Server();
    }

    public static class Client implements IClientConfig
    {
        @Override
        public boolean showTooltips()
        {
            return true;
        }

        @Override
        public boolean matchingDurabilityBars()
        {
            return false;
        }

        @Override
        public boolean forceDisableDetailArmorBarSupport()
        {
            return false;
        }
    }

    public static class Common implements ICommonConfig
    {
        private final Armor armor = new Armor();
        private final AdditionalDrops additionalDrops = new AdditionalDrops();

        @Override
        public IArmorConfig getArmor()
        {
            return this.armor;
        }

        @Override
        public IAdditionalDropsConfig getAdditionalDrops()
        {
            return this.additionalDrops;
        }

        public static class Armor implements IArmorConfig
        {
            @Override
            public boolean isIronPhantomPassiveArmor()
            {
                return true;
            }

            @Override
            public boolean isIronPiglinPassiveArmor()
            {
                return false;
            }

            @Override
            public boolean isIronEndermanPassiveArmor()
            {
                return false;
            }

            @Override
            public boolean isGoldPhantomPassiveArmor()
            {
                return false;
            }

            @Override
            public boolean isGoldPiglinPassiveArmor()
            {
                return true;
            }

            @Override
            public boolean isGoldEndermanPassiveArmor()
            {
                return false;
            }

            @Override
            public boolean isEmeraldPhantomPassiveArmor()
            {
                return false;
            }

            @Override
            public boolean isEmeraldPiglinPassiveArmor()
            {
                return false;
            }

            @Override
            public boolean isEmeraldEndermanPassiveArmor()
            {
                return true;
            }

            @Override
            public boolean isDiamondPhantomPassiveArmor()
            {
                return false;
            }

            @Override
            public boolean isDiamondPiglinPassiveArmor()
            {
                return true;
            }

            @Override
            public boolean isDiamondEndermanPassiveArmor()
            {
                return true;
            }
        }

        public static class AdditionalDrops implements IAdditionalDropsConfig
        {
            @Override
            public boolean enableAdditionalCropDrops()
            {
                return true;
            }

            @Override
            public boolean enableAdditionalOreDrops()
            {
                return true;
            }

            @Override
            public boolean enableAdditionalMobDrops()
            {
                return true;
            }
        }
    }

    public static class Server implements IServerConfig
    {
        private final ToolProperties toolProperties = new ToolProperties();

        @Override
        public IAdditionalDropPropertiesConfig getAdditionalDropProperties()
        {
            return null;
        }

        @Override
        public IToolPropertiesConfig getToolProperties()
        {
            return this.toolProperties;
        }

        public static class ToolProperties implements IToolPropertiesConfig
        {
            @Override
            public int getIronBreakingSpeedMultiplier()
            {
                return 12;
            }

            @Override
            public int getGoldBreakingSpeedMultiplier()
            {
                return 20;
            }

            @Override
            public int getEmeraldBreakingSpeedMultiplier()
            {
                return 29;
            }

            @Override
            public int getDiamondBreakingSpeedMultiplier()
            {
                return 39;
            }
        }
    }
}
