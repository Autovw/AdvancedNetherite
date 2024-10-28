package com.autovw.advancednetherite.api.impl;

import net.minecraft.world.item.ToolMaterial;

/**
 * @author Autovw
 */
public interface IToolMaterial
{
    ToolMaterial getMaterial();

    default boolean isMaterial(ToolMaterial material)
    {
        return getMaterial() == material;
    }
}
