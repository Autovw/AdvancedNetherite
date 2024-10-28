package com.autovw.advancednetherite.api.impl;

import net.minecraft.world.item.equipment.ArmorMaterial;

/**
 * @author Autovw
 */
public interface IArmorMaterial
{
    ArmorMaterial getMaterial();

    default boolean isMaterial(ArmorMaterial material)
    {
        return getMaterial() == material;
    }
}
