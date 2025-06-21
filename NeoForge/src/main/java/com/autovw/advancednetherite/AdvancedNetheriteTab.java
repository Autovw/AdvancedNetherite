package com.autovw.advancednetherite;

import com.autovw.advancednetherite.api.annotation.Internal;
import com.autovw.advancednetherite.core.ModItems;
import com.autovw.advancednetherite.core.registry.ModItemRegistry;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

/**
 * @author Autovw
 */
@Internal
@EventBusSubscriber(modid = AdvancedNetherite.MOD_ID)
public final class AdvancedNetheriteTab
{
    private AdvancedNetheriteTab()
    {
    }

    static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, AdvancedNetherite.MOD_ID);
    static final DeferredHolder<CreativeModeTab, CreativeModeTab> TAB = TABS.register("tab", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup." + AdvancedNetherite.MOD_ID + ".tab"))
            .icon(ModItems.NETHERITE_GOLD_HELMET::getDefaultInstance)
            .build());

    @SubscribeEvent
    public static void onRegisterCreativeModeTabEvent(final BuildCreativeModeTabContentsEvent event)
    {
        if (event.getTab() != AdvancedNetheriteTab.TAB.get())
            return;

        ModItemRegistry.ITEMS.getEntries().stream().map(DeferredHolder::get).forEach(event::accept);
    }
}
