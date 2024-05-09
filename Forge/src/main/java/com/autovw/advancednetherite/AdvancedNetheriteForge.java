package com.autovw.advancednetherite;

import com.autovw.advancednetherite.client.ClientHandler;
import com.autovw.advancednetherite.config.Config;
import com.autovw.advancednetherite.config.ConfigHelper;
import com.autovw.advancednetherite.core.registry.ModBlockRegistry;
import com.autovw.advancednetherite.core.registry.ModItemRegistry;
import com.autovw.advancednetherite.core.registry.ModLootModifiers;
import com.autovw.advancednetherite.registry.ForgeRegistryHelper;
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
        AdvancedNetherite.init(ForgePlatformHelper.getInstance());
        AdvancedNetherite.setRegistryHelper(new ForgeRegistryHelper());

        ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, Config.clientConfig);
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Config.commonConfig);
        ModLoadingContext.get().registerConfig(ModConfig.Type.SERVER, Config.serverConfig);

        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        bus.addListener(this::commonSetup);
        bus.addListener(this::clientSetup);

        ModBlockRegistry.BLOCKS.register(bus);
        ModItemRegistry.ITEMS.register(bus);
        ModLootModifiers.LOOT_MODIFIERS.register(bus);
        AdvancedNetheriteTab.TABS.register(bus);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
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
