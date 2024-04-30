package com.autovw.advancednetherite;

import com.autovw.advancednetherite.client.ClientHandler;
import com.autovw.advancednetherite.config.Config;
import com.autovw.advancednetherite.config.ConfigHelper;
import com.autovw.advancednetherite.core.registry.ModBlockRegistry;
import com.autovw.advancednetherite.core.registry.ModItemRegistry;
import com.autovw.advancednetherite.core.registry.ModLootModifiers;
import com.autovw.advancednetherite.registry.NeoForgeRegistryHelper;
import com.mojang.logging.LogUtils;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModLoadingContext;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import org.slf4j.Logger;

/**
 * @author Autovw
 */
@Mod(AdvancedNetherite.MOD_ID)
public class AdvancedNetheriteNeoForge
{
    public static final Logger LOGGER = LogUtils.getLogger();

    public AdvancedNetheriteNeoForge(IEventBus bus)
    {
        AdvancedNetherite.init(new NeoForgePlatformHelper());
        AdvancedNetherite.setRegistryHelper(new NeoForgeRegistryHelper());

        ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, Config.CLIENT_SPEC);
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Config.COMMON_SPEC);
        ModLoadingContext.get().registerConfig(ModConfig.Type.SERVER, Config.SERVER_SPEC);

        bus.addListener(this::commonSetup);
        bus.addListener(this::clientSetup);
        //bus.addListener(AdvancedNetheriteTab::onRegisterCreativeModeTabEvent);

        ModBlockRegistry.BLOCKS.register(bus);
        ModItemRegistry.ITEMS.register(bus);
        ModLootModifiers.LOOT_MODIFIERS.register(bus);
        AdvancedNetheriteTab.TABS.register(bus);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {
        ConfigHelper.registerClientConfig(() -> Config.CLIENT);
        ConfigHelper.registerCommonConfig(() -> Config.COMMON);
        ConfigHelper.registerServerConfig(() -> Config.SERVER);
    }

    private void clientSetup(final FMLClientSetupEvent event)
    {
        event.enqueueWork(ClientHandler::onClientSetup);
    }
}
