package com.autovw.advancednetherite.config;

import net.minecraftforge.common.ForgeConfigSpec;
import org.apache.commons.lang3.tuple.Pair;

/**
 * Author: Autovw
 */
public class Config {
    public static final ForgeConfigSpec commonConfig;
    public static final Config.Common COMMON;

    static {
        final Pair<Common, ForgeConfigSpec> commonConfigPair = new ForgeConfigSpec.Builder().configure(Common::new);
        commonConfig = commonConfigPair.getRight();
        COMMON = commonConfigPair.getLeft();
    }

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
        public static ForgeConfigSpec.BooleanValue diamondUltimatePassiveArmor;

        public ArmorConfig(ForgeConfigSpec.Builder builder) {
            builder.comment("Armor Config").push("armor_config");
            {
                goldPiglinPassiveArmor = builder
                        .comment("If true, Piglins behave neutral towards players wearing Netherite/Gold Armor. True by default.")
                        .define("goldPiglinPassiveArmor", true);
                emeraldEndermanPassiveArmor = builder
                        .comment("If true, Endermans behave neutral towards players wearing Netherite/Emerald Armor. True by default.")
                        .define("emeraldEndermanPassiveArmor", true);
                diamondUltimatePassiveArmor = builder
                        .comment("If true, Endermans and Piglins behave neutral towards players wearing Netherite/Diamond Armor. False by default.")
                        .define("diamondUltimatePassiveArmor", false);
            }
            builder.pop();
        }
    }
}
