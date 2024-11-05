package com.autovw.advancednetherite.config;

import com.autovw.advancednetherite.config.common.IAdditionalDropsConfig;
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
        private final AdditionalDrops additionalDrops = new AdditionalDrops();

        @Override
        public IAdditionalDropsConfig getAdditionalDrops()
        {
            return this.additionalDrops;
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
        private final AdditionalDropProperties additionalDropProperties = new AdditionalDropProperties();

        @Override
        public IAdditionalDropPropertiesConfig getAdditionalDropProperties()
        {
            return this.additionalDropProperties;
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

        public static class AdditionalDropProperties implements IAdditionalDropPropertiesConfig
        {
            @Override
            public double getAdditionalWheatDropChance()
            {
                return 0.3;
            }

            @Override
            public double getAdditionalCarrotsDropChance()
            {
                return 0.3;
            }

            @Override
            public double getAdditionalPotatoesDropChance()
            {
                return 0.3;
            }

            @Override
            public double getAdditionalBeetrootsDropChance()
            {
                return 0.2;
            }

            @Override
            public double getAdditionalPhantomDropChance()
            {
                return 0.5;
            }

            @Override
            public double getAdditionalZombifiedPiglinDropChance()
            {
                return 0.5;
            }

            @Override
            public double getAdditionalPiglinDropChance()
            {
                return 0.15;
            }

            @Override
            public double getAdditionalEndermanDropChance()
            {
                return 0.3;
            }

            @Override
            public double getAdditionalRawIronDropChance()
            {
                return 0.2;
            }

            @Override
            public double getAdditionalRawGoldDropChance()
            {
                return 0.3;
            }

            @Override
            public double getAdditionalEmeraldDropChance()
            {
                return 0.4;
            }

            @Override
            public double getAdditionalDiamondDropChance()
            {
                return 0.25;
            }

            @Override
            public double getAdditionalGoldNuggetDropChance()
            {
                return 0.6;
            }
        }
    }
}
