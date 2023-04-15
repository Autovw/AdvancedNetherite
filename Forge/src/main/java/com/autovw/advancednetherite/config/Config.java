package com.autovw.advancednetherite.config;

import net.minecraftforge.common.ForgeConfigSpec;
import org.apache.commons.lang3.tuple.Pair;

/**
 * @author Autovw
 */
public class Config {
    public static final ForgeConfigSpec clientConfig;
    public static final Config.Client CLIENT;

    public static final ForgeConfigSpec commonConfig;
    public static final Config.Common COMMON;

    public static final ForgeConfigSpec serverConfig;
    public static final Config.Server SERVER;

    static {
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
    public static class Client {
        public static ForgeConfigSpec.BooleanValue showTooltips;
        public static ForgeConfigSpec.BooleanValue matchingDurabilityBars;
        public static ForgeConfigSpec.BooleanValue forceDisableDetailArmorBarSupport;

        public Client(ForgeConfigSpec.Builder builder) {
            builder.push("client");
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
    }

    // COMMON config
    public static class Common {
        public final ArmorConfig armorConfig;
        public final AdditionalDropsConfig additionalDropsConfig;

        public Common(ForgeConfigSpec.Builder builder) {
            builder.push("common");
            {
                this.armorConfig = new ArmorConfig(builder);
                this.additionalDropsConfig = new AdditionalDropsConfig(builder);
            }
            builder.pop();
        }
    }

    public static class ArmorConfig {
        public static ForgeConfigSpec.BooleanValue ironPhantomPassiveArmor;
        public static ForgeConfigSpec.BooleanValue ironPiglinPassiveArmor;
        public static ForgeConfigSpec.BooleanValue ironEndermanPassiveArmor;

        public static ForgeConfigSpec.BooleanValue goldPhantomPassiveArmor;
        public static ForgeConfigSpec.BooleanValue goldPiglinPassiveArmor;
        public static ForgeConfigSpec.BooleanValue goldEndermanPassiveArmor;

        public static ForgeConfigSpec.BooleanValue emeraldPhantomPassiveArmor;
        public static ForgeConfigSpec.BooleanValue emeraldPiglinPassiveArmor;
        public static ForgeConfigSpec.BooleanValue emeraldEndermanPassiveArmor;

        public static ForgeConfigSpec.BooleanValue diamondPhantomPassiveArmor;
        public static ForgeConfigSpec.BooleanValue diamondPiglinPassiveArmor;
        public static ForgeConfigSpec.BooleanValue diamondEndermanPassiveArmor;

        public ArmorConfig(ForgeConfigSpec.Builder builder) {
            builder.comment("Configure properties related to armor perks here").push("armor_perks");
            {
                // Netherite-Iron Armor
                builder.comment("Configure properties related to Netherite-Iron armor here").push("netherite_iron_armor");
                {
                    ironPhantomPassiveArmor = builder.comment("If true, Phantoms behave neutral towards players wearing Netherite-Iron armor. True by default.").define("ironPhantomPassiveArmor", true);
                    ironPiglinPassiveArmor = builder.comment("If true, Piglins behave neutral towards players wearing Netherite-Iron armor. False by default.").define("ironPiglinPassiveArmor", false);
                    ironEndermanPassiveArmor = builder.comment("If true, Endermen behave neutral towards players wearing Netherite-Iron armor. False by default.").define("ironEndermanPassiveArmor", false);
                }
                builder.pop();

                // Netherite-Gold Armor
                builder.comment("Configure properties related to Netherite-Gold armor here").push("netherite_gold_armor");
                {
                    goldPhantomPassiveArmor = builder.comment("If true, Phantoms behave neutral towards players wearing Netherite-Gold armor. False by default.").define("goldPhantomPassiveArmor", false);
                    goldPiglinPassiveArmor = builder.comment("If true, Piglins behave neutral towards players wearing Netherite-Gold armor. True by default.").define("goldPiglinPassiveArmor", true);
                    goldEndermanPassiveArmor = builder.comment("If true, Endermen behave neutral towards players wearing Netherite-Gold armor. False by default.").define("goldEndermanPassiveArmor", false);
                }
                builder.pop();

                // Netherite-Emerald Armor
                builder.comment("Configure properties related to Netherite-Emerald armor here").push("netherite_emerald_armor");
                {
                    emeraldPhantomPassiveArmor = builder.comment("If true, Phantoms behave neutral towards players wearing Netherite-Emerald armor. False by default.").define("emeraldPhantomPassiveArmor", false);
                    emeraldPiglinPassiveArmor = builder.comment("If true, Piglins behave neutral towards players wearing Netherite-Emerald armor. False by default.").define("emeraldPiglinPassiveArmor", false);
                    emeraldEndermanPassiveArmor = builder.comment("If true, Endermen behave neutral towards players wearing Netherite-Emerald armor. True by default.").define("emeraldEndermanPassiveArmor", true);
                }
                builder.pop();

                // Netherite-Diamond Armor
                builder.comment("Configure properties related to Netherite-Diamond armor here").push("netherite_diamond_armor");
                {
                    diamondPhantomPassiveArmor = builder.comment("If true, Phantoms behave neutral towards players wearing Netherite-Diamond armor. False by default.").define("diamondPhantomPassiveArmor", false);
                    diamondPiglinPassiveArmor = builder.comment("If true, Piglins behave neutral towards players wearing Netherite-Diamond armor. True by default.").define("diamondPiglinPassiveArmor", true);
                    diamondEndermanPassiveArmor = builder.comment("If true, Endermen behave neutral towards players wearing Netherite-Diamond armor. True by default.").define("diamondEndermanPassiveArmor", true);
                }
                builder.pop();
            }
            builder.pop();
        }
    }

    public static class AdditionalDropsConfig {
        public static ForgeConfigSpec.BooleanValue enableAdditionalCropDrops;
        public static ForgeConfigSpec.BooleanValue enableAdditionalOreDrops;
        public static ForgeConfigSpec.BooleanValue enableAdditionalMobDrops;

        public AdditionalDropsConfig(ForgeConfigSpec.Builder builder) {
            builder.comment("Configure properties related to additional drop perks here. Drop chances can be modified in the SERVER config.").push("additional_drops");
            {
                enableAdditionalCropDrops = builder.comment("If true, enables additional crop drops for hoes. True by default.").define("enableAdditionalCropDrops", true);
                enableAdditionalOreDrops = builder.comment("If true, enables additional ore drops for pickaxes. Pickaxes with Silk Touch remain unaffected. True by default.").define("enableAdditionalOreDrops", true);
                enableAdditionalMobDrops = builder.comment("If true, enables additional ore drops for swords. True by default.").define("enableAdditionalMobDrops", true);
            }
            builder.pop();
        }
    }

    // SERVER config
    public static class Server {
        public final ToolProperties toolProperties;
        public final AdditionalDropProperties additionalDropProperties;

        public Server(ForgeConfigSpec.Builder builder) {
            builder.push("server");
            {
                this.toolProperties = new ToolProperties(builder);
                this.additionalDropProperties = new AdditionalDropProperties(builder);
            }
            builder.pop();
        }
    }

    public static class ToolProperties {
        public static ForgeConfigSpec.IntValue ironBreakingSpeedMultiplier;
        public static ForgeConfigSpec.IntValue goldBreakingSpeedMultiplier;
        public static ForgeConfigSpec.IntValue emeraldBreakingSpeedMultiplier;
        public static ForgeConfigSpec.IntValue diamondBreakingSpeedMultiplier;

        public ToolProperties(ForgeConfigSpec.Builder builder) {
            builder.comment("Configure properties related to tools here.").push("tool_properties");
            {
                builder.comment("Configure tool properties related to block breaking speed here.").push("breaking_speed_multipliers");
                {
                    ironBreakingSpeedMultiplier = builder.comment("Block breaking speed multiplier for Netherite-Iron tools").defineInRange("ironBreakingSpeedMultiplier", 12, 1, 64);
                    goldBreakingSpeedMultiplier = builder.comment("Block breaking speed multiplier for Netherite-Gold tools").defineInRange("goldBreakingSpeedMultiplier", 20, 1, 64);
                    emeraldBreakingSpeedMultiplier = builder.comment("Block breaking speed multiplier for Netherite-Emerald tools").defineInRange("emeraldBreakingSpeedMultiplier", 29, 1, 64);
                    diamondBreakingSpeedMultiplier = builder.comment("Block breaking speed multiplier for Netherite-Diamond tools").defineInRange("diamondBreakingSpeedMultiplier", 39, 1, 64);
                }
                builder.pop();
            }
            builder.pop();
        }
    }

    public static class AdditionalDropProperties {
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

        public AdditionalDropProperties(ForgeConfigSpec.Builder builder) {
            builder.comment("Configure properties related to additional drops here.").push("additional_drop_properties");
            {
                builder.comment("Configure properties related to crop drop chances here.").push("crop_drop_chances");
                {
                    additionalWheatDropChance = builder.comment("Chance of dropping additional wheat. 0.0 = 0% chance, 1.0 = 100% chance.").defineInRange("additionalWheatDropChance", 0.3, 0, 1);
                    additionalCarrotsDropChance = builder.comment("Chance of dropping additional carrots. 0.0 = 0% chance, 1.0 = 100% chance.").defineInRange("additionalCarrotsDropChance", 0.3, 0, 1);
                    additionalPotatoesDropChance = builder.comment("Chance of dropping additional potatoes. 0.0 = 0% chance, 1.0 = 100% chance.").defineInRange("additionalPotatoesDropChance", 0.3, 0, 1);
                    additionalBeetrootsDropChance = builder.comment("Chance of dropping additional beetroots. 0.0 = 0% chance, 1.0 = 100% chance.").defineInRange("additionalBeetrootsDropChance", 0.2, 0, 1);
                }
                builder.pop();

                builder.comment("Configure properties related to mob drop chances here.").push("mob_drop_chances");
                {
                    additionalPhantomDropChance = builder.comment("Chance of dropping additional phantom membrane. 0.0 = 0% chance, 1.0 = 100% chance.").defineInRange("additionalPhantomDropChance", 0.5, 0, 1);
                    additionalZombifiedPiglinDropChance = builder.comment("Chance of dropping additional golden nuggets. 0.0 = 0% chance, 1.0 = 100% chance.").defineInRange("additionalZombifiedPiglinDropChance", 0.5, 0, 1);
                    additionalPiglinDropChance = builder.comment("Chance of dropping additional golden ingots. 0.0 = 0% chance, 1.0 = 100% chance.").defineInRange("additionalPiglinDropChance", 0.15, 0, 1);
                    additionalEndermanDropChance = builder.comment("Chance of dropping additional ender pearls. 0.0 = 0% chance, 1.0 = 100% chance.").defineInRange("additionalEndermanDropChance", 0.3, 0, 1);
                }
                builder.pop();

                builder.comment("Configure properties related to ore drop chances here.").push("ore_drop_chances");
                {
                    additionalRawIronDropChance = builder.comment("Chance of dropping additional raw iron. 0.0 = 0% chance, 1.0 = 100% chance.").defineInRange("additionalRawIronDropChance", 0.2, 0, 1);
                    additionalRawGoldDropChance = builder.comment("Chance of dropping additional raw gold. 0.0 = 0% chance, 1.0 = 100% chance.").defineInRange("additionalRawGoldChance", 0.3, 0, 1);
                    additionalEmeraldDropChance = builder.comment("Chance of dropping additional emerald. 0.0 = 0% chance, 1.0 = 100% chance.").defineInRange("additionalEmeraldDropChance", 0.4, 0, 1);
                    additionalDiamondDropChance = builder.comment("Chance of dropping additional diamond. 0.0 = 0% chance, 1.0 = 100% chance.").defineInRange("additionalDiamondDropChance", 0.25, 0, 1);
                    additionalGoldNuggetDropChance = builder.comment("Chance of dropping additional golden nugget. 0.0 = 0% chance, 1.0 = 100% chance.").defineInRange("additionalGoldNuggetDropChance", 0.6, 0, 1);
                }
                builder.pop();
            }
            builder.pop();
        }
    }
}
