package com.autovw.advancednetherite.api.impl;

import net.minecraft.world.item.ItemStack;

/**
 * This interface can be used to add Advanced Netherite hooks to other item classes in order to replicate functionality.
 * Implementing this interface would remove the need to extend one of the item classes found under the {@link com.autovw.advancednetherite.common.item} package.
 * However, if possible, try using the item classes provided by Advanced Netherite instead for maximum compatibility.
 * Keep in mind that using this interface means having to create your own custom implementation, and features such as item tooltips are not automatically included.
 * @since 1.12.0
 * @author Autovw
 */
public interface IAdvancedHooks
{
    /**
     * Used to check if endermen should behave passive to a player wearing this item, unless provoked.
     * @param stack the item worn by the player
     * @return If true, endermen will behave passive towards a player wearing this item
     */
    default boolean pacifyEndermen(ItemStack stack)
    {
        return false;
    }

    /**
     * Used to check if phantoms should behave passive towards a player wearing this item, unless provoked.
     * @param stack the item worn by the player
     * @return If true, phantoms will behave passive towards a player wearing this item
     */
    default boolean pacifyPhantoms(ItemStack stack)
    {
        return false;
    }
}
