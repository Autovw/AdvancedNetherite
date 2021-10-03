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
        final Pair<Client, ForgeConfigSpec> clientConfigPair = new ForgeConfigSpec.Builder().configure(Config.Client::new);
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

        public Client(ForgeConfigSpec.Builder builder) {
            builder.push("client");
            {
                showTooltips = builder.comment("If true, displays mod tooltips with perks. True by default.").define("showTooltips", true);
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
        public static ForgeConfigSpec.BooleanValue goldPiglinPassiveArmor;
        public static ForgeConfigSpec.BooleanValue emeraldEndermanPassiveArmor;
        public static ForgeConfigSpec.BooleanValue diamondPiglinPassiveArmor;
        public static ForgeConfigSpec.BooleanValue diamondEndermanPassiveArmor;

        public ArmorConfig(ForgeConfigSpec.Builder builder) {
            builder.comment("Armor Config").push("armor_config");
            {
                goldPiglinPassiveArmor = builder.comment("If true, Piglins behave neutral towards players wearing Netherite-Gold Armor. True by default.").define("goldPiglinPassiveArmor", true);
                emeraldEndermanPassiveArmor = builder.comment("If true, Endermen behave neutral towards players wearing Netherite-Emerald Armor. True by default.").define("emeraldEndermanPassiveArmor", true);
                diamondPiglinPassiveArmor = builder.comment("If true, Piglins behave neutral towards players wearing Netherite-Diamond Armor. True by default.").define("diamondPiglinPassiveArmor", true);
                diamondEndermanPassiveArmor = builder.comment("If true, Endermen behave neutral towards players wearing Netherite-Diamond Armor. True by default.").define("diamondEndermanPassiveArmor", true);
            }
            builder.pop();
        }
    }
}
