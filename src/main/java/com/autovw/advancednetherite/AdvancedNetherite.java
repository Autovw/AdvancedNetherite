package com.autovw.advancednetherite;

import com.autovw.advancednetherite.config.Config;
import com.autovw.advancednetherite.core.ModBlocks;
import com.autovw.advancednetherite.core.ModItems;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLPaths;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Author: Autovw
 */
@Mod(Reference.MOD_ID)
public class AdvancedNetherite {
    public static final Logger LOGGER = LogManager.getLogger();

    public AdvancedNetherite() {
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Config.commonConfig);

        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        bus.addListener(this::setup);

        ModBlocks.BLOCKS.register(bus);
        ModItems.ITEMS.register(bus);

        //Config.loadConfig(Config.config, FMLPaths.CONFIGDIR.get().resolve("advancednetherite-config.toml").toString());

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) { }
}