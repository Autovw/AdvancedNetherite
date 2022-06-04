package com.autovw.advancednetherite;

import com.autovw.advancednetherite.client.DetailArmorBarSupport;
import com.autovw.advancednetherite.client.screen.ConfigScreen;
import com.autovw.advancednetherite.common.loot.CropDropsLootModifier;
import com.autovw.advancednetherite.common.loot.MobDropsLootModifier;
import com.autovw.advancednetherite.common.loot.OreDropsLootModifier;
import com.autovw.advancednetherite.config.Config;
import com.autovw.advancednetherite.core.ModBlocks;
import com.autovw.advancednetherite.core.ModItems;
import com.autovw.advancednetherite.network.PacketHandler;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.StringTextComponent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.loot.GlobalLootModifierSerializer;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ExtensionPoint;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Author: Autovw
 */
@Mod(Reference.MOD_ID)
public class AdvancedNetherite {
    public static final Logger LOGGER = LogManager.getLogger();

    public AdvancedNetherite() {
        ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, Config.clientSpec);
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Config.commonConfig);

        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        bus.addListener(this::commonSetup);
        bus.addListener(this::clientSetup);
        bus.addGenericListener(GlobalLootModifierSerializer.class, this::onModifierSerializerRegistryEvent);

        ModBlocks.BLOCKS.register(bus);
        ModItems.ITEMS.register(bus);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        PacketHandler.init();
    }

    private void clientSetup(final FMLClientSetupEvent event) {
        // Only registers the config screen if configured is not present
        if (!ModList.get().isLoaded("configured")) {
            ModLoadingContext.get().registerExtensionPoint(ExtensionPoint.CONFIGGUIFACTORY, () -> (minecraft, parent) -> new ConfigScreen(new StringTextComponent("Advanced Netherite"), parent));
        }

        // register optional support for Detail Armor Bar if the mod is present
        if (ModList.get().isLoaded("detailab") && !Config.Client.forceDisableDetailArmorBarSupport.get()) {
            DetailArmorBarSupport.register();
        }
    }

    private void onModifierSerializerRegistryEvent(final RegistryEvent.Register<GlobalLootModifierSerializer<?>> event) {
        event.getRegistry().registerAll(
                new OreDropsLootModifier.Serializer().setRegistryName(new ResourceLocation(Reference.MOD_ID, "blocks/diamond_ore_addition")),
                new OreDropsLootModifier.Serializer().setRegistryName(new ResourceLocation(Reference.MOD_ID, "blocks/emerald_ore_addition")),
                new OreDropsLootModifier.Serializer().setRegistryName(new ResourceLocation(Reference.MOD_ID, "blocks/gold_ore_addition")),
                new OreDropsLootModifier.Serializer().setRegistryName(new ResourceLocation(Reference.MOD_ID, "blocks/iron_ore_addition")),
                new OreDropsLootModifier.Serializer().setRegistryName(new ResourceLocation(Reference.MOD_ID, "blocks/nether_gold_ore_addition")),

                new MobDropsLootModifier.Serializer().setRegistryName(new ResourceLocation(Reference.MOD_ID, "entities/phantom_addition")),
                new MobDropsLootModifier.Serializer().setRegistryName(new ResourceLocation(Reference.MOD_ID, "entities/piglin_addition")),
                new MobDropsLootModifier.Serializer().setRegistryName(new ResourceLocation(Reference.MOD_ID, "entities/zombified_piglin_addition")),
                new MobDropsLootModifier.Serializer().setRegistryName(new ResourceLocation(Reference.MOD_ID, "entities/enderman_addition")),

                new CropDropsLootModifier.Serializer().setRegistryName(new ResourceLocation(Reference.MOD_ID, "blocks/wheat_addition")),
                new CropDropsLootModifier.Serializer().setRegistryName(new ResourceLocation(Reference.MOD_ID, "blocks/carrots_addition")),
                new CropDropsLootModifier.Serializer().setRegistryName(new ResourceLocation(Reference.MOD_ID, "blocks/potatoes_addition")),
                new CropDropsLootModifier.Serializer().setRegistryName(new ResourceLocation(Reference.MOD_ID, "blocks/beetroots_addition"))
        );
    }
}
