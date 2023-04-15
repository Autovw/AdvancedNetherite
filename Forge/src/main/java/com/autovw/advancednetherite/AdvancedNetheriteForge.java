package com.autovw.advancednetherite;

import com.autovw.advancednetherite.client.ClientHandler;
import com.autovw.advancednetherite.config.Config;
import com.autovw.advancednetherite.core.registry.ModBlocks;
import com.autovw.advancednetherite.core.registry.ModItems;
import com.autovw.advancednetherite.core.registry.ModLootModifiers;
import com.autovw.advancednetherite.core.util.ModToolTiers;
import com.mojang.logging.LogUtils;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

/**
 * @author Autovw
 */
@Mod(AdvancedNetherite.MOD_ID)
public class AdvancedNetheriteForge
{
    public static final Logger LOGGER = LogUtils.getLogger();

    public AdvancedNetheriteForge()
    {
        AdvancedNetherite.init();

        ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, Config.clientConfig);
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Config.commonConfig);
        ModLoadingContext.get().registerConfig(ModConfig.Type.SERVER, Config.serverConfig);

        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        bus.addListener(this::commonSetup);
        bus.addListener(this::clientSetup);

        ModBlocks.BLOCKS.register(bus);
        ModItems.ITEMS.register(bus);
        ModLootModifiers.LOOT_MODIFIERS.register(bus);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {
        event.enqueueWork(ModToolTiers::onCommonSetup);
    }

    private void clientSetup(final FMLClientSetupEvent event)
    {
        event.enqueueWork(ClientHandler::onClientSetup);
    }
}
