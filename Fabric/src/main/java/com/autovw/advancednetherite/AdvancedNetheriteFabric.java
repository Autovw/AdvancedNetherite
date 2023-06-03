package com.autovw.advancednetherite;

import com.autovw.advancednetherite.common.ModLootTableModifiers;
import com.autovw.advancednetherite.config.ConfigHelper;
import com.autovw.advancednetherite.config.TempConfig;
import com.autovw.advancednetherite.core.registry.ModBlockRegistry;
import com.autovw.advancednetherite.core.registry.ModItemRegistry;
import com.autovw.advancednetherite.registry.FabricRegistryHelper;
import com.mojang.logging.LogUtils;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;

/**
 * @author Autovw
 */
public class AdvancedNetheriteFabric implements ModInitializer
{
    public static final Logger LOGGER = LogUtils.getLogger();

    @Override
    public void onInitialize()
    {
        AdvancedNetherite.init(FabricPlatformHelper.getInstance());
        AdvancedNetherite.setRegistryHelper(new FabricRegistryHelper());

        ModBlockRegistry.registerBlocks();
        ModItemRegistry.registerItems();

        AdvancedNetheriteTab.registerTab();

        ModLootTableModifiers.modifyTables();

        ConfigHelper.registerClientConfig(() -> TempConfig.CLIENT);
        ConfigHelper.registerCommonConfig(() -> TempConfig.COMMON);
        ConfigHelper.registerServerConfig(() -> TempConfig.SERVER);
    }
}
