package com.autovw.advancednetherite;

import com.autovw.advancednetherite.api.annotation.Internal;
import com.autovw.advancednetherite.core.ModItems;
import com.autovw.advancednetherite.core.registry.ModItemRegistry;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.RegistryObject;

/**
 * @author Autovw
 */
@Internal
@Mod.EventBusSubscriber(modid = AdvancedNetherite.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public final class AdvancedNetheriteTab
{
    private AdvancedNetheriteTab()
    {
    }

    private static final String TAB_KEY = AdvancedNetherite.MOD_ID + ".tab";
    private static final ResourceLocation TAB_ID = new ResourceLocation(TAB_KEY);

    @SubscribeEvent
    public static void onRegisterCreativeModeTabEvent(final CreativeModeTabEvent.Register event)
    {
        event.registerCreativeModeTab(TAB_ID, (builder) ->
        {
            builder.title(Component.translatable("itemGroup." + TAB_KEY))
                    .icon(ModItems.NETHERITE_GOLD_INGOT::getDefaultInstance)
                    .displayItems((displayParameters, entries) ->
                    {
                        ModItemRegistry.ITEMS.getEntries().stream().map(RegistryObject::get).forEach(entries::accept);
                    });
        });
    }
}
