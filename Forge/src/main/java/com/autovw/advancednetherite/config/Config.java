package com.autovw.advancednetherite.config;

import com.autovw.advancednetherite.api.annotation.Internal;
import com.autovw.advancednetherite.config.common.IAdditionalDropsConfig;
import com.autovw.advancednetherite.config.server.IAdditionalDropPropertiesConfig;
import com.autovw.advancednetherite.config.server.IToolPropertiesConfig;
import net.minecraftforge.common.ForgeConfigSpec;
import org.apache.commons.lang3.tuple.Pair;

/**
 * @author Autovw
 */
@Internal
public class Config
{
    public static final ForgeConfigSpec clientConfig;
    public static final Config.Client CLIENT;

    public static final ForgeConfigSpec commonConfig;
    public static final Config.Common COMMON;

    public static final ForgeConfigSpec serverConfig;
    public static final Config.Server SERVER;

    static
    {
        final Pair<Client, ForgeConfigSpec> clientConfigPair = new ForgeConfigSpec.Builder().configure(Client::new);
        clientConfig = clientConfigPair.getRight();
        CLIENT = clientConfigPair.getLeft();

        final Pair<Common, ForgeConfigSpec> commonConfigPair = new ForgeConfigSpec.Builder().configure(Common::new);
        commonConfig = commonConfigPair.getRight();
        COMMON = commonConfigPair.getLeft();

        final Pair<Server, ForgeConfigSpec> serverConfigPair = new ForgeConfigSpec.Builder().configure(Server::new);
        serverConfig = serverConfigPair.getRight();
        SERVER = serverConfigPair.getLeft();
    }

    // CLIENT config
    public static class Client implements IClientConfig
    {
        public static ForgeConfigSpec.BooleanValue showTooltips;
        public static ForgeConfigSpec.BooleanValue matchingDurabilityBars;
        public static ForgeConfigSpec.BooleanValue forceDisableDetailArmorBarSupport;

        public Client(ForgeConfigSpec.Builder builder)
        {
            builder.translation("config.advancednetherite.client").push("client");
            {
                showTooltips = builder
                        .comment("If true, displays tooltips, added by Advanced Netherite, with perks client-side. True by default.")
                        .translation("config.advancednetherite.client.show_tooltips")
                        .define("showTooltips", true);
                matchingDurabilityBars = builder
                        .comment("If true, displays a (color) matching durability bar underneath the item when damaged. False by default.")
                        .translation("config.advancednetherite.client.matching_durability_bars")
                        .define("matchingDurabilityBars", false);
                forceDisableDetailArmorBarSupport = builder
                        .comment("If true, forcefully disables support for Detail Armor Bar mod. Requires the game to be restarted. False by default.")
                        .translation("config.advancednetherite.client.force_disable_dab_support")
                        .define("forceDisableDetailArmorBarSupport", false);
            }
            builder.pop();
        }

        @Override
        public boolean showTooltips()
        {
            return Client.showTooltips.get();
        }

        @Override
        public boolean matchingDurabilityBars()
        {
            return Client.matchingDurabilityBars.get();
        }

        @Override
        public boolean forceDisableDetailArmorBarSupport()
        {
            return Client.forceDisableDetailArmorBarSupport.get();
        }
    }

    // COMMON config
    public static class Common implements ICommonConfig
    {
        public final AdditionalDropsConfig additionalDropsConfig;

        public Common(ForgeConfigSpec.Builder builder)
        {
            builder.translation("config.advancednetherite.common").push("common");
            {
                this.additionalDropsConfig = new AdditionalDropsConfig(builder);
            }
            builder.pop();
        }

        @Override
        public IAdditionalDropsConfig getAdditionalDrops()
        {
            return this.additionalDropsConfig;
        }
    }

    public static class AdditionalDropsConfig implements IAdditionalDropsConfig
    {
        public static ForgeConfigSpec.BooleanValue enableAdditionalCropDrops;
        public static ForgeConfigSpec.BooleanValue enableAdditionalOreDrops;
        public static ForgeConfigSpec.BooleanValue enableAdditionalMobDrops;

        public AdditionalDropsConfig(ForgeConfigSpec.Builder builder) {
            builder
                    .comment("Configure properties related to additional drop perks here. Drop chances can be modified in the SERVER config.")
                    .translation("config.advancednetherite.common.additional_drops")
                    .push("additional_drops");
            {
                enableAdditionalCropDrops = builder
                        .comment("If true, enables additional crop drops for hoes. True by default.")
                        .translation("config.advancednetherite.common.additional_drops.enable_additional_crop_drops")
                        .define("enableAdditionalCropDrops", true);
                enableAdditionalOreDrops = builder
                        .comment("If true, enables additional ore drops for pickaxes. Pickaxes with Silk Touch remain unaffected. True by default.")
                        .translation("config.advancednetherite.common.additional_drops.enable_additional_ore_drops")
                        .define("enableAdditionalOreDrops", true);
                enableAdditionalMobDrops = builder
                        .comment("If true, enables additional mob drops for swords. True by default.")
                        .translation("config.advancednetherite.common.additional_drops.enable_additional_mob_drops")
                        .define("enableAdditionalMobDrops", true);
            }
            builder.pop();
        }

        @Override
        public boolean enableAdditionalCropDrops()
        {
            return AdditionalDropsConfig.enableAdditionalCropDrops.get();
        }

        @Override
        public boolean enableAdditionalOreDrops()
        {
            return AdditionalDropsConfig.enableAdditionalOreDrops.get();
        }

        @Override
        public boolean enableAdditionalMobDrops()
        {
            return AdditionalDropsConfig.enableAdditionalMobDrops.get();
        }
    }

    // SERVER config
    public static class Server implements IServerConfig
    {
        public final ToolProperties toolProperties;
        public final AdditionalDropProperties additionalDropProperties;

        public Server(ForgeConfigSpec.Builder builder)
        {
            builder.translation("config.advancednetherite.server").push("server");
            {
                this.toolProperties = new ToolProperties(builder);
                this.additionalDropProperties = new AdditionalDropProperties(builder);
            }
            builder.pop();
        }

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
    }

    public static class ToolProperties implements IToolPropertiesConfig
    {
        public static ForgeConfigSpec.IntValue ironBreakingSpeedMultiplier;
        public static ForgeConfigSpec.IntValue goldBreakingSpeedMultiplier;
        public static ForgeConfigSpec.IntValue emeraldBreakingSpeedMultiplier;
        public static ForgeConfigSpec.IntValue diamondBreakingSpeedMultiplier;

        public ToolProperties(ForgeConfigSpec.Builder builder)
        {
            builder
                    .comment("Configure properties related to tools here.")
                    .translation("config.advancednetherite.server.tool_properties")
                    .push("tool_properties");
            {
                builder
                        .comment("Configure tool properties related to block breaking speed here.")
                        .translation("config.advancednetherite.server.tool_properties.breaking_speed_multipliers")
                        .push("breaking_speed_multipliers");
                {
                    ironBreakingSpeedMultiplier = builder
                            .comment("Block breaking speed multiplier for Netherite-Iron tools")
                            .translation("config.advancednetherite.server.tool_properties.breaking_speed_multipliers.netherite_iron")
                            .defineInRange("ironBreakingSpeedMultiplier", 12, 1, 64);
                    goldBreakingSpeedMultiplier = builder
                            .comment("Block breaking speed multiplier for Netherite-Gold tools")
                            .translation("config.advancednetherite.server.tool_properties.breaking_speed_multipliers.netherite_gold")
                            .defineInRange("goldBreakingSpeedMultiplier", 20, 1, 64);
                    emeraldBreakingSpeedMultiplier = builder
                            .comment("Block breaking speed multiplier for Netherite-Emerald tools")
                            .translation("config.advancednetherite.server.tool_properties.breaking_speed_multipliers.netherite_emerald")
                            .defineInRange("emeraldBreakingSpeedMultiplier", 29, 1, 64);
                    diamondBreakingSpeedMultiplier = builder
                            .comment("Block breaking speed multiplier for Netherite-Diamond tools")
                            .translation("config.advancednetherite.server.tool_properties.breaking_speed_multipliers.netherite_diamond")
                            .defineInRange("diamondBreakingSpeedMultiplier", 39, 1, 64);
                }
                builder.pop();
            }
            builder.pop();
        }

        @Override
        public int getIronBreakingSpeedMultiplier()
        {
            return ToolProperties.ironBreakingSpeedMultiplier.get();
        }

        @Override
        public int getGoldBreakingSpeedMultiplier()
        {
            return ToolProperties.goldBreakingSpeedMultiplier.get();
        }

        @Override
        public int getEmeraldBreakingSpeedMultiplier()
        {
            return ToolProperties.emeraldBreakingSpeedMultiplier.get();
        }

        @Override
        public int getDiamondBreakingSpeedMultiplier()
        {
            return ToolProperties.diamondBreakingSpeedMultiplier.get();
        }
    }

    public static class AdditionalDropProperties implements IAdditionalDropPropertiesConfig
    {
        public static ForgeConfigSpec.DoubleValue additionalWheatDropChance;
        public static ForgeConfigSpec.DoubleValue additionalCarrotsDropChance;
        public static ForgeConfigSpec.DoubleValue additionalPotatoesDropChance;
        public static ForgeConfigSpec.DoubleValue additionalBeetrootsDropChance;

        public static ForgeConfigSpec.DoubleValue additionalPhantomDropChance;
        public static ForgeConfigSpec.DoubleValue additionalZombifiedPiglinDropChance;
        public static ForgeConfigSpec.DoubleValue additionalPiglinDropChance;
        public static ForgeConfigSpec.DoubleValue additionalEndermanDropChance;

        public static ForgeConfigSpec.DoubleValue additionalRawIronDropChance;
        public static ForgeConfigSpec.DoubleValue additionalRawGoldDropChance;
        public static ForgeConfigSpec.DoubleValue additionalEmeraldDropChance;
        public static ForgeConfigSpec.DoubleValue additionalDiamondDropChance;
        public static ForgeConfigSpec.DoubleValue additionalGoldNuggetDropChance;

        public AdditionalDropProperties(ForgeConfigSpec.Builder builder)
        {
            builder
                    .comment("Configure properties related to additional drops here.")
                    .translation("config.advancednetherite.server.additional_drops")
                    .push("additional_drop_properties");
            {
                builder
                        .comment("Configure properties related to crop drop chances here.")
                        .translation("config.advancednetherite.server.additional_drops.crops")
                        .push("crop_drop_chances");
                {
                    additionalWheatDropChance = builder
                            .comment("Chance of dropping additional wheat. 0.0 = 0% chance, 1.0 = 100% chance.")
                            .translation("config.advancednetherite.server.additional_drops.crops.wheat_drop_chance")
                            .defineInRange("additionalWheatDropChance", 0.3, 0, 1);
                    additionalCarrotsDropChance = builder
                            .comment("Chance of dropping additional carrots. 0.0 = 0% chance, 1.0 = 100% chance.")
                            .translation("config.advancednetherite.server.additional_drops.crops.carrots_drop_chance")
                            .defineInRange("additionalCarrotsDropChance", 0.3, 0, 1);
                    additionalPotatoesDropChance = builder
                            .comment("Chance of dropping additional potatoes. 0.0 = 0% chance, 1.0 = 100% chance.")
                            .translation("config.advancednetherite.server.additional_drops.crops.potatoes_drop_chance")
                            .defineInRange("additionalPotatoesDropChance", 0.3, 0, 1);
                    additionalBeetrootsDropChance = builder
                            .comment("Chance of dropping additional beetroots. 0.0 = 0% chance, 1.0 = 100% chance.")
                            .translation("config.advancednetherite.server.additional_drops.crops.beetroots_drop_chance")
                            .defineInRange("additionalBeetrootsDropChance", 0.2, 0, 1);
                }
                builder.pop();

                builder
                        .comment("Configure properties related to mob drop chances here.")
                        .translation("config.advancednetherite.server.additional_drops.mobs")
                        .push("mob_drop_chances");
                {
                    additionalPhantomDropChance = builder
                            .comment("Chance of dropping additional phantom membrane. 0.0 = 0% chance, 1.0 = 100% chance.")
                            .translation("config.advancednetherite.server.additional_drops.mobs.phantom_drop_chance")
                            .defineInRange("additionalPhantomDropChance", 0.5, 0, 1);
                    additionalZombifiedPiglinDropChance = builder
                            .comment("Chance of dropping additional golden nuggets. 0.0 = 0% chance, 1.0 = 100% chance.")
                            .translation("config.advancednetherite.server.additional_drops.mobs.zombified_piglin_drop_chance")
                            .defineInRange("additionalZombifiedPiglinDropChance", 0.5, 0, 1);
                    additionalPiglinDropChance = builder
                            .comment("Chance of dropping additional golden ingots. 0.0 = 0% chance, 1.0 = 100% chance.")
                            .translation("config.advancednetherite.server.additional_drops.mobs.piglin_drop_chance")
                            .defineInRange("additionalPiglinDropChance", 0.15, 0, 1);
                    additionalEndermanDropChance = builder
                            .comment("Chance of dropping additional ender pearls. 0.0 = 0% chance, 1.0 = 100% chance.")
                            .translation("config.advancednetherite.server.additional_drops.mobs.enderman_drop_chance")
                            .defineInRange("additionalEndermanDropChance", 0.3, 0, 1);
                }
                builder.pop();

                builder
                        .comment("Configure properties related to ore drop chances here.")
                        .translation("config.advancednetherite.server.additional_drops.ores")
                        .push("ore_drop_chances");
                {
                    additionalRawIronDropChance = builder
                            .comment("Chance of dropping additional raw iron. 0.0 = 0% chance, 1.0 = 100% chance.")
                            .translation("config.advancednetherite.server.additional_drops.ores.raw_iron_drop_chance")
                            .defineInRange("additionalRawIronDropChance", 0.2, 0, 1);
                    additionalRawGoldDropChance = builder
                            .comment("Chance of dropping additional raw gold. 0.0 = 0% chance, 1.0 = 100% chance.")
                            .translation("config.advancednetherite.server.additional_drops.ores.raw_gold_drop_chance")
                            .defineInRange("additionalRawGoldChance", 0.3, 0, 1);
                    additionalEmeraldDropChance = builder
                            .comment("Chance of dropping additional emerald. 0.0 = 0% chance, 1.0 = 100% chance.")
                            .translation("config.advancednetherite.server.additional_drops.ores.emerald_drop_chance")
                            .defineInRange("additionalEmeraldDropChance", 0.4, 0, 1);
                    additionalDiamondDropChance = builder
                            .comment("Chance of dropping additional diamond. 0.0 = 0% chance, 1.0 = 100% chance.")
                            .translation("config.advancednetherite.server.additional_drops.ores.diamond_drop_chance")
                            .defineInRange("additionalDiamondDropChance", 0.25, 0, 1);
                    additionalGoldNuggetDropChance = builder
                            .comment("Chance of dropping additional golden nugget. 0.0 = 0% chance, 1.0 = 100% chance.")
                            .translation("config.advancednetherite.server.additional_drops.ores.gold_nugget_drop_chance")
                            .defineInRange("additionalGoldNuggetDropChance", 0.6, 0, 1);
                }
                builder.pop();
            }
            builder.pop();
        }

        @Override
        public double getAdditionalWheatDropChance()
        {
            return AdditionalDropProperties.additionalWheatDropChance.get();
        }

        @Override
        public double getAdditionalCarrotsDropChance()
        {
            return AdditionalDropProperties.additionalCarrotsDropChance.get();
        }

        @Override
        public double getAdditionalPotatoesDropChance()
        {
            return AdditionalDropProperties.additionalPotatoesDropChance.get();
        }

        @Override
        public double getAdditionalBeetrootsDropChance()
        {
            return AdditionalDropProperties.additionalBeetrootsDropChance.get();
        }

        @Override
        public double getAdditionalPhantomDropChance()
        {
            return AdditionalDropProperties.additionalPhantomDropChance.get();
        }

        @Override
        public double getAdditionalZombifiedPiglinDropChance()
        {
            return AdditionalDropProperties.additionalZombifiedPiglinDropChance.get();
        }

        @Override
        public double getAdditionalPiglinDropChance()
        {
            return AdditionalDropProperties.additionalPiglinDropChance.get();
        }

        @Override
        public double getAdditionalEndermanDropChance()
        {
            return AdditionalDropProperties.additionalEndermanDropChance.get();
        }

        @Override
        public double getAdditionalRawIronDropChance()
        {
            return AdditionalDropProperties.additionalRawIronDropChance.get();
        }

        @Override
        public double getAdditionalRawGoldDropChance()
        {
            return AdditionalDropProperties.additionalRawGoldDropChance.get();
        }

        @Override
        public double getAdditionalEmeraldDropChance()
        {
            return AdditionalDropProperties.additionalEmeraldDropChance.get();
        }

        @Override
        public double getAdditionalDiamondDropChance()
        {
            return AdditionalDropProperties.additionalDiamondDropChance.get();
        }

        @Override
        public double getAdditionalGoldNuggetDropChance()
        {
            return AdditionalDropProperties.additionalGoldNuggetDropChance.get();
        }
    }
}
