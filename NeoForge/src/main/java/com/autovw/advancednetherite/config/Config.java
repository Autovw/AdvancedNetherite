package com.autovw.advancednetherite.config;

import com.autovw.advancednetherite.api.annotation.Internal;
import com.autovw.advancednetherite.config.common.IAdditionalDropsConfig;
import com.autovw.advancednetherite.config.common.IArmorConfig;
import com.autovw.advancednetherite.config.server.IAdditionalDropPropertiesConfig;
import com.autovw.advancednetherite.config.server.IToolPropertiesConfig;
import net.neoforged.neoforge.common.ModConfigSpec;

/**
 * @author Autovw
 */
@Internal
public class Config
{
    private static final ModConfigSpec.Builder CLIENT_BUILDER = new ModConfigSpec.Builder();
    public static final Client CLIENT = new Client(CLIENT_BUILDER);
    public static final ModConfigSpec CLIENT_SPEC = CLIENT_BUILDER.build();

    private static final ModConfigSpec.Builder COMMON_BUILDER = new ModConfigSpec.Builder();
    public static final Common COMMON = new Common(COMMON_BUILDER);
    public static final ModConfigSpec COMMON_SPEC = COMMON_BUILDER.build();

    private static final ModConfigSpec.Builder SERVER_BUILDER = new ModConfigSpec.Builder();
    public static final Server SERVER = new Server(SERVER_BUILDER);
    public static final ModConfigSpec SERVER_SPEC = SERVER_BUILDER.build();

    // CLIENT config
    public static class Client implements IClientConfig
    {
        public static ModConfigSpec.BooleanValue showTooltips;
        public static ModConfigSpec.BooleanValue matchingDurabilityBars;
        public static ModConfigSpec.BooleanValue forceDisableDetailArmorBarSupport;

        public Client(ModConfigSpec.Builder builder)
        {
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
        public final ArmorConfig armorConfig;
        public final AdditionalDropsConfig additionalDropsConfig;

        public Common(ModConfigSpec.Builder builder)
        {
            builder.push("common");
            {
                this.armorConfig = new ArmorConfig(builder);
                this.additionalDropsConfig = new AdditionalDropsConfig(builder);
            }
            builder.pop();
        }

        @Override
        public IArmorConfig getArmor()
        {
            return this.armorConfig;
        }

        @Override
        public IAdditionalDropsConfig getAdditionalDrops()
        {
            return this.additionalDropsConfig;
        }
    }

    public static class ArmorConfig implements IArmorConfig
    {
        public static ModConfigSpec.BooleanValue ironPhantomPassiveArmor;
        public static ModConfigSpec.BooleanValue ironPiglinPassiveArmor;
        public static ModConfigSpec.BooleanValue ironEndermanPassiveArmor;

        public static ModConfigSpec.BooleanValue goldPhantomPassiveArmor;
        public static ModConfigSpec.BooleanValue goldPiglinPassiveArmor;
        public static ModConfigSpec.BooleanValue goldEndermanPassiveArmor;

        public static ModConfigSpec.BooleanValue emeraldPhantomPassiveArmor;
        public static ModConfigSpec.BooleanValue emeraldPiglinPassiveArmor;
        public static ModConfigSpec.BooleanValue emeraldEndermanPassiveArmor;

        public static ModConfigSpec.BooleanValue diamondPhantomPassiveArmor;
        public static ModConfigSpec.BooleanValue diamondPiglinPassiveArmor;
        public static ModConfigSpec.BooleanValue diamondEndermanPassiveArmor;

        public ArmorConfig(ModConfigSpec.Builder builder)
        {
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
                    diamondPhantomPassiveArmor = builder.comment("If true, Phantoms behave neutral towards players wearing Netherite-Diamond armor. True by default.").define("diamondPhantomPassiveArmor", true);
                    diamondPiglinPassiveArmor = builder.comment("If true, Piglins behave neutral towards players wearing Netherite-Diamond armor. True by default.").define("diamondPiglinPassiveArmor", true);
                    diamondEndermanPassiveArmor = builder.comment("If true, Endermen behave neutral towards players wearing Netherite-Diamond armor. True by default.").define("diamondEndermanPassiveArmor", true);
                }
                builder.pop();
            }
            builder.pop();
        }

        @Override
        public boolean isIronPhantomPassiveArmor()
        {
            return ArmorConfig.ironPhantomPassiveArmor.get();
        }

        @Override
        public boolean isIronPiglinPassiveArmor()
        {
            return ArmorConfig.ironPiglinPassiveArmor.get();
        }

        @Override
        public boolean isIronEndermanPassiveArmor()
        {
            return ArmorConfig.ironEndermanPassiveArmor.get();
        }

        @Override
        public boolean isGoldPhantomPassiveArmor()
        {
            return ArmorConfig.goldPhantomPassiveArmor.get();
        }

        @Override
        public boolean isGoldPiglinPassiveArmor()
        {
            return ArmorConfig.goldPiglinPassiveArmor.get();
        }

        @Override
        public boolean isGoldEndermanPassiveArmor()
        {
            return ArmorConfig.goldEndermanPassiveArmor.get();
        }

        @Override
        public boolean isEmeraldPhantomPassiveArmor()
        {
            return ArmorConfig.emeraldPhantomPassiveArmor.get();
        }

        @Override
        public boolean isEmeraldPiglinPassiveArmor()
        {
            return ArmorConfig.emeraldPiglinPassiveArmor.get();
        }

        @Override
        public boolean isEmeraldEndermanPassiveArmor()
        {
            return ArmorConfig.emeraldEndermanPassiveArmor.get();
        }

        @Override
        public boolean isDiamondPhantomPassiveArmor()
        {
            return ArmorConfig.diamondPhantomPassiveArmor.get();
        }

        @Override
        public boolean isDiamondPiglinPassiveArmor()
        {
            return ArmorConfig.diamondPiglinPassiveArmor.get();
        }

        @Override
        public boolean isDiamondEndermanPassiveArmor()
        {
            return ArmorConfig.diamondEndermanPassiveArmor.get();
        }
    }

    public static class AdditionalDropsConfig implements IAdditionalDropsConfig
    {
        public static ModConfigSpec.BooleanValue enableAdditionalCropDrops;
        public static ModConfigSpec.BooleanValue enableAdditionalOreDrops;
        public static ModConfigSpec.BooleanValue enableAdditionalMobDrops;

        public AdditionalDropsConfig(ModConfigSpec.Builder builder) {
            builder.comment("Configure properties related to additional drop perks here. Drop chances can be modified in the SERVER config.").push("additional_drops");
            {
                enableAdditionalCropDrops = builder.comment("If true, enables additional crop drops for hoes. True by default.").define("enableAdditionalCropDrops", true);
                enableAdditionalOreDrops = builder.comment("If true, enables additional ore drops for pickaxes. Pickaxes with Silk Touch remain unaffected. True by default.").define("enableAdditionalOreDrops", true);
                enableAdditionalMobDrops = builder.comment("If true, enables additional mob drops for swords. True by default.").define("enableAdditionalMobDrops", true);
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

        public Server(ModConfigSpec.Builder builder)
        {
            builder.push("server");
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
        public static ModConfigSpec.IntValue ironBreakingSpeedMultiplier;
        public static ModConfigSpec.IntValue goldBreakingSpeedMultiplier;
        public static ModConfigSpec.IntValue emeraldBreakingSpeedMultiplier;
        public static ModConfigSpec.IntValue diamondBreakingSpeedMultiplier;

        public ToolProperties(ModConfigSpec.Builder builder)
        {
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
        public static ModConfigSpec.DoubleValue additionalWheatDropChance;
        public static ModConfigSpec.DoubleValue additionalCarrotsDropChance;
        public static ModConfigSpec.DoubleValue additionalPotatoesDropChance;
        public static ModConfigSpec.DoubleValue additionalBeetrootsDropChance;

        public static ModConfigSpec.DoubleValue additionalPhantomDropChance;
        public static ModConfigSpec.DoubleValue additionalZombifiedPiglinDropChance;
        public static ModConfigSpec.DoubleValue additionalPiglinDropChance;
        public static ModConfigSpec.DoubleValue additionalEndermanDropChance;

        public static ModConfigSpec.DoubleValue additionalRawIronDropChance;
        public static ModConfigSpec.DoubleValue additionalRawGoldDropChance;
        public static ModConfigSpec.DoubleValue additionalEmeraldDropChance;
        public static ModConfigSpec.DoubleValue additionalDiamondDropChance;
        public static ModConfigSpec.DoubleValue additionalGoldNuggetDropChance;

        public AdditionalDropProperties(ModConfigSpec.Builder builder)
        {
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
