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
import net.neoforged.fml.ModContainer;
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

    public AdvancedNetheriteNeoForge(IEventBus bus, ModContainer container)
    {
        AdvancedNetherite.init(new NeoForgePlatformHelper());
        AdvancedNetherite.setRegistryHelper(new NeoForgeRegistryHelper());

        container.registerConfig(ModConfig.Type.CLIENT, Config.CLIENT_SPEC);
        container.registerConfig(ModConfig.Type.LOCAL, Config.LOCAL_SPEC);
        container.registerConfig(ModConfig.Type.SYNCED, Config.SYNCED_SPEC);

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
        ConfigHelper.registerCommonConfig(() -> Config.LOCAL);
        ConfigHelper.registerServerConfig(() -> Config.SYNCED);
    }

    private void clientSetup(final FMLClientSetupEvent event)
    {
        event.enqueueWork(ClientHandler::onClientSetup);
    }
}
