package com.autovw.advancednetherite;

import com.autovw.advancednetherite.config.Config;
import com.autovw.advancednetherite.core.registry.ModItems;
import net.minecraft.core.NonNullList;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Objects;

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

    /**
     * The creative tab is sorted to display items from Advanced Netherite first.
     * Items from other mods will be added AFTER the items from Advanced Netherite.
     * @since 1.10.1
     *
     * @param items List of items that are added to the creative tab
     */
    @Override
    public void fillItemList(NonNullList<ItemStack> items) {
        super.fillItemList(items);
        items.sort((s1, s2) -> {
            String item1 = Objects.requireNonNull(ForgeRegistries.ITEMS.getKey(s1.getItem())).getNamespace();
            String item2 = Objects.requireNonNull(ForgeRegistries.ITEMS.getKey(s2.getItem())).getNamespace();

            if (item1.equals(Reference.MOD_ID) == item2.equals(Reference.MOD_ID)) {
                return 0;
            }

            return item1.equals(Reference.MOD_ID) ? -1 : 1;
        });
    }

    /**
     * Client-side feature which enables a search bar inside the Advanced Netherite creative tab.
     * This is turned off by default.
     * @since 1.10.1
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
