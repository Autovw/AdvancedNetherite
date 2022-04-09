package com.autovw.advancednetherite.config;

import net.minecraftforge.common.ForgeConfigSpec;
import org.apache.commons.lang3.tuple.Pair;

/**
 * Author: Autovw
 */
public class Config {
    // Code needed to register the client and common configs
    public static final ForgeConfigSpec clientSpec;
    public static final Config.Client CLIENT;

    public static final ForgeConfigSpec commonConfig;
    public static final Config.Common COMMON;

    static {
        final Pair<Client, ForgeConfigSpec> clientConfigPair = new ForgeConfigSpec.Builder().configure(Client::new);
        clientSpec = clientConfigPair.getRight();
        CLIENT = clientConfigPair.getLeft();

        final Pair<Common, ForgeConfigSpec> commonConfigPair = new ForgeConfigSpec.Builder().configure(Common::new);
        commonConfig = commonConfigPair.getRight();
        COMMON = commonConfigPair.getLeft();
    }

    public static void saveClientConfig() {
        clientSpec.save();
    }

    // CLIENT config
    public static class Client {
        public static ForgeConfigSpec.BooleanValue showTooltips;
        public static ForgeConfigSpec.BooleanValue matchingDurabilityBars;
        public static ForgeConfigSpec.BooleanValue enableSearchBarInCreativeTab;

        public Client(ForgeConfigSpec.Builder builder) {
            builder.push("client");
            {
                showTooltips = builder.comment("If true, displays tooltips, added by Advanced Netherite, with perks client-side. True by default.").define("showTooltips", true);
                matchingDurabilityBars = builder.comment("If true, displays a (color) matching durability bar underneath the item when damaged. False by default.").define("matchingDurabilityBars", false);
                enableSearchBarInCreativeTab = builder.comment("If true, enables a search bar in the Advanced Netherite creative tab. False by default.").define("enableSearchBarInCreativeTab", false);
            }
            builder.pop();
        }
    }

    // COMMON config
    public static class Common {
        public final ArmorConfig armorConfig;

        public Common(ForgeConfigSpec.Builder builder) {
            builder.push("common");
            {
                this.armorConfig = new ArmorConfig(builder);
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
            // Netherite-Iron Armor
            builder.comment("Configure properties related to Netherite-Iron armor here").push("netherite_iron_armor_perks");
            {
                ironPhantomPassiveArmor = builder.comment("If true, Phantoms behave neutral towards players wearing Netherite-Iron armor. True by default.").define("ironPhantomPassiveArmor", true);
                ironPiglinPassiveArmor = builder.comment("If true, Piglins behave neutral towards players wearing Netherite-Iron armor. False by default.").define("ironPiglinPassiveArmor", false);
                ironEndermanPassiveArmor = builder.comment("If true, Endermen behave neutral towards players wearing Netherite-Iron armor. False by default.").define("ironEndermanPassiveArmor", false);
            }
            builder.pop();

            // Netherite-Gold Armor
            builder.comment("Configure properties related to Netherite-Gold armor here").push("netherite_gold_armor_perks");
            {
                goldPhantomPassiveArmor = builder.comment("If true, Phantoms behave neutral towards players wearing Netherite-Gold armor. False by default.").define("goldPhantomPassiveArmor", false);
                goldPiglinPassiveArmor = builder.comment("If true, Piglins behave neutral towards players wearing Netherite-Gold armor. True by default.").define("goldPiglinPassiveArmor", true);
                goldEndermanPassiveArmor = builder.comment("If true, Endermen behave neutral towards players wearing Netherite-Gold armor. False by default.").define("goldEndermanPassiveArmor", false);
            }
            builder.pop();

            // Netherite-Emerald Armor
            builder.comment("Configure properties related to Netherite-Emerald armor here").push("netherite_emerald_armor_perks");
            {
                emeraldPhantomPassiveArmor = builder.comment("If true, Phantoms behave neutral towards players wearing Netherite-Emerald armor. False by default.").define("emeraldPhantomPassiveArmor", false);
                emeraldPiglinPassiveArmor = builder.comment("If true, Piglins behave neutral towards players wearing Netherite-Emerald armor. False by default.").define("emeraldPiglinPassiveArmor", false);
                emeraldEndermanPassiveArmor = builder.comment("If true, Endermen behave neutral towards players wearing Netherite-Emerald armor. True by default.").define("emeraldEndermanPassiveArmor", true);
            }
            builder.pop();

            // Netherite-Diamond Armor
            builder.comment("Configure properties related to Netherite-Diamond armor here").push("netherite_diamond_armor_perks");
            {
                diamondPhantomPassiveArmor = builder.comment("If true, Phantoms behave neutral towards players wearing Netherite-Diamond armor. False by default.").define("diamondPhantomPassiveArmor", false);
                diamondPiglinPassiveArmor = builder.comment("If true, Piglins behave neutral towards players wearing Netherite-Diamond armor. True by default.").define("diamondPiglinPassiveArmor", true);
                diamondEndermanPassiveArmor = builder.comment("If true, Endermen behave neutral towards players wearing Netherite-Diamond armor. True by default.").define("diamondEndermanPassiveArmor", true);
            }
            builder.pop();
        }
    }
}
