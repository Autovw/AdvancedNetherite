package com.autovw.advancednetherite;

import com.autovw.advancednetherite.core.ModItems;
import net.minecraft.core.NonNullList;
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
}