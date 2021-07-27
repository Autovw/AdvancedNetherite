package com.autovw.advancednetherite;

import com.autovw.advancednetherite.core.ModItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

/**
 * Author: Autovw
 */
public class AdvancedNetheriteGroup extends CreativeModeTab {

    // Creative inventory tab
    public AdvancedNetheriteGroup(String name) {
        super(name);
    }

    @Override
    public ItemStack makeIcon() {
        return ModItems.NETHERITE_GOLD_INGOT.get().getDefaultInstance();
    }
}