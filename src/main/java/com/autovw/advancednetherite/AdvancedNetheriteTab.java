package com.autovw.advancednetherite;

import com.autovw.advancednetherite.api.annotation.Internal;
import com.autovw.advancednetherite.core.registry.ModBlocks;
import com.autovw.advancednetherite.core.registry.ModItems;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

/**
 * Author: Autovw
 */
@Internal
@Mod.EventBusSubscriber(modid = Reference.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class AdvancedNetheriteTab {
    private AdvancedNetheriteTab() {
    }

    private static final String TAB_KEY = Reference.MOD_ID + ".tab";
    private static final ResourceLocation TAB_ID = new ResourceLocation(TAB_KEY);

    @SubscribeEvent
    public static void onRegisterCreativeModeTabEvent(final CreativeModeTabEvent.Register event) {
        event.registerCreativeModeTab(TAB_ID, builder -> {
            builder.title(Component.translatable("itemGroup." + TAB_KEY))
                    .icon(() -> ModItems.NETHERITE_GOLD_INGOT.get().getDefaultInstance())
                    .displayItems((flagSet, entries, flag) -> {
                        // Ingots
                        entries.accept(ModItems.NETHERITE_IRON_INGOT.get());
                        entries.accept(ModItems.NETHERITE_GOLD_INGOT.get());
                        entries.accept(ModItems.NETHERITE_EMERALD_INGOT.get());
                        entries.accept(ModItems.NETHERITE_DIAMOND_INGOT.get());

                        // Armor sets
                        // Netherite-Iron
                        entries.accept(ModItems.NETHERITE_IRON_HELMET.get());
                        entries.accept(ModItems.NETHERITE_IRON_CHESTPLATE.get());
                        entries.accept(ModItems.NETHERITE_IRON_LEGGINGS.get());
                        entries.accept(ModItems.NETHERITE_IRON_BOOTS.get());
                        // Netherite-Gold
                        entries.accept(ModItems.NETHERITE_GOLD_HELMET.get());
                        entries.accept(ModItems.NETHERITE_GOLD_CHESTPLATE.get());
                        entries.accept(ModItems.NETHERITE_GOLD_LEGGINGS.get());
                        entries.accept(ModItems.NETHERITE_GOLD_BOOTS.get());
                        // Netherite-Emerald
                        entries.accept(ModItems.NETHERITE_EMERALD_HELMET.get());
                        entries.accept(ModItems.NETHERITE_EMERALD_CHESTPLATE.get());
                        entries.accept(ModItems.NETHERITE_EMERALD_LEGGINGS.get());
                        entries.accept(ModItems.NETHERITE_EMERALD_BOOTS.get());
                        // Netherite-Diamond
                        entries.accept(ModItems.NETHERITE_DIAMOND_HELMET.get());
                        entries.accept(ModItems.NETHERITE_DIAMOND_CHESTPLATE.get());
                        entries.accept(ModItems.NETHERITE_DIAMOND_LEGGINGS.get());
                        entries.accept(ModItems.NETHERITE_DIAMOND_BOOTS.get());

                        // Tools
                        // Axes
                        entries.accept(ModItems.NETHERITE_IRON_AXE.get());
                        entries.accept(ModItems.NETHERITE_GOLD_AXE.get());
                        entries.accept(ModItems.NETHERITE_EMERALD_AXE.get());
                        entries.accept(ModItems.NETHERITE_DIAMOND_AXE.get());

                        // Hoes
                        entries.accept(ModItems.NETHERITE_IRON_HOE.get());
                        entries.accept(ModItems.NETHERITE_GOLD_HOE.get());
                        entries.accept(ModItems.NETHERITE_EMERALD_HOE.get());
                        entries.accept(ModItems.NETHERITE_DIAMOND_HOE.get());

                        // Pickaxes
                        entries.accept(ModItems.NETHERITE_IRON_PICKAXE.get());
                        entries.accept(ModItems.NETHERITE_GOLD_PICKAXE.get());
                        entries.accept(ModItems.NETHERITE_EMERALD_PICKAXE.get());
                        entries.accept(ModItems.NETHERITE_DIAMOND_PICKAXE.get());

                        // Shovels
                        entries.accept(ModItems.NETHERITE_IRON_SHOVEL.get());
                        entries.accept(ModItems.NETHERITE_GOLD_SHOVEL.get());
                        entries.accept(ModItems.NETHERITE_EMERALD_SHOVEL.get());
                        entries.accept(ModItems.NETHERITE_DIAMOND_SHOVEL.get());

                        // Swords
                        entries.accept(ModItems.NETHERITE_IRON_SWORD.get());
                        entries.accept(ModItems.NETHERITE_GOLD_SWORD.get());
                        entries.accept(ModItems.NETHERITE_EMERALD_SWORD.get());
                        entries.accept(ModItems.NETHERITE_DIAMOND_SWORD.get());

                        // Blocks
                        entries.accept(ModBlocks.NETHERITE_IRON_BLOCK.get());
                        entries.accept(ModBlocks.NETHERITE_GOLD_BLOCK.get());
                        entries.accept(ModBlocks.NETHERITE_EMERALD_BLOCK.get());
                        entries.accept(ModBlocks.NETHERITE_DIAMOND_BLOCK.get());
                    });
        });
    }

    // TODO re-implement configurable search bar behaviour

    /**
     * Client-side feature which enables a search bar inside the Advanced Netherite creative tab.
     * This is turned off by default.
     * @since 1.10.1
     */
    /*
    @Override
    public boolean hasSearchBar() {
        return Config.Client.enableSearchBarInCreativeTab.get();
    }
     */

    /**
     * Removes the title of the creative tab if the search bar is present
     */
    /*
    @Override
    public boolean showTitle() {
        return !hasSearchBar();
    }
     */

    /**
     * Sets the background texture of the creative tab to the vanilla background texture of the search tab to allow for compatibility with resource packs!
     */
    /*
    @Override
    public ResourceLocation getBackgroundImage() {
        return hasSearchBar() ? new ResourceLocation("textures/gui/container/creative_inventory/tab_item_search.png") : super.getBackgroundImage();
    }
     */
}
