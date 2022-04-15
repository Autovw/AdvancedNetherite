package com.autovw.advancednetherite;

import com.autovw.advancednetherite.common.loot.OreDropsLootModifier;
import com.autovw.advancednetherite.config.Config;
import com.autovw.advancednetherite.core.ModBlocks;
import com.autovw.advancednetherite.core.ModItems;
import com.autovw.advancednetherite.core.ModToolTiers;
import com.mojang.logging.LogUtils;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.loot.GlobalLootModifierSerializer;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

/**
 * Author: Autovw
 */
@Mod(Reference.MOD_ID)
public class AdvancedNetherite {
    public static final Logger LOGGER = LogUtils.getLogger();

    public AdvancedNetherite() {
        ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, Config.clientConfig);
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Config.commonConfig);

        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        bus.addListener(this::commonSetup);
        bus.addGenericListener(GlobalLootModifierSerializer.class, this::onModifierSerializerRegistryEvent);

        ModBlocks.BLOCKS.register(bus);
        ModItems.ITEMS.register(bus);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        ModToolTiers.onCommonSetup();
    }

    private void onModifierSerializerRegistryEvent(final RegistryEvent.Register<GlobalLootModifierSerializer<?>> event) {
        event.getRegistry().registerAll(
                new OreDropsLootModifier.Serializer().setRegistryName(new ResourceLocation(Reference.MOD_ID, "blocks/diamond_ore_addition")),
                new OreDropsLootModifier.Serializer().setRegistryName(new ResourceLocation(Reference.MOD_ID, "blocks/emerald_ore_addition")),
                new OreDropsLootModifier.Serializer().setRegistryName(new ResourceLocation(Reference.MOD_ID, "blocks/gold_ore_addition")),
                new OreDropsLootModifier.Serializer().setRegistryName(new ResourceLocation(Reference.MOD_ID, "blocks/iron_ore_addition")),
                new OreDropsLootModifier.Serializer().setRegistryName(new ResourceLocation(Reference.MOD_ID, "blocks/deepslate_diamond_ore_addition")),
                new OreDropsLootModifier.Serializer().setRegistryName(new ResourceLocation(Reference.MOD_ID, "blocks/deepslate_emerald_ore_addition")),
                new OreDropsLootModifier.Serializer().setRegistryName(new ResourceLocation(Reference.MOD_ID, "blocks/deepslate_gold_ore_addition")),
                new OreDropsLootModifier.Serializer().setRegistryName(new ResourceLocation(Reference.MOD_ID, "blocks/deepslate_iron_ore_addition")),
                new OreDropsLootModifier.Serializer().setRegistryName(new ResourceLocation(Reference.MOD_ID, "blocks/nether_gold_ore_addition"))
        );
    }
}
