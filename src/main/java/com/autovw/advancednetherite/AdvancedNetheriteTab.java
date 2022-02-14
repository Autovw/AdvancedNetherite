package com.autovw.advancednetherite;

import com.autovw.advancednetherite.config.Config;
import com.autovw.advancednetherite.core.ModItems;
import net.minecraft.core.NonNullList;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

/**
 * Author: Autovw
 */
public class AdvancedNetheriteTab extends CreativeModeTab {

    // Creative inventory tab
    public AdvancedNetheriteTab(String name) {
        super(name);
    }

    @Override
    public ItemStack makeIcon() {
        return ModItems.NETHERITE_GOLD_INGOT.get().getDefaultInstance();
    }

    @Override
    public void fillItemList(NonNullList<ItemStack> items) {
        super.fillItemList(items);
    }

    /**
     * Client-side feature which enables a search bar inside the Advanced Netherite creative tab.
     * This is turned off by default.
     */
    @Override
    public boolean hasSearchBar() {
        return Config.Client.enableSearchBarInCreativeTab.get();
    }

    /**
     * Removes the title of the creative tab if the search bar is present
     */
    @Override
    public boolean showTitle() {
        return !hasSearchBar();
    }

    /**
     * Sets the background texture of the creative tab to the vanilla background texture of the search tab to allow for compatibility with resource packs!
     */
    @Override
    public ResourceLocation getBackgroundImage() {
        return hasSearchBar() ? new ResourceLocation("textures/gui/container/creative_inventory/tab_item_search.png") : super.getBackgroundImage();
    }
}
