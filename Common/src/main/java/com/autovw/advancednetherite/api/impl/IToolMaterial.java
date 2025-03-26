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

    /**
     * @return The type of tool {@link IToolMaterial.Type}
     * @since MC 1.21.5
     */
    Type getToolType();

    /**
     * @return If the tool is digger item. Replacement of <code>instanceof DiggerItem</code> check.
     * @since MC 1.21.5
     */
    default boolean isDiggerItem()
    {
        return getToolType() == Type.AXE || getToolType() == Type.SHOVEL || getToolType() == Type.PICKAXE;
    }

    /**
     * @since MC 1.21.5
     */
    enum Type
    {
        AXE,
        HOE,
        PICKAXE,
        SHOVEL,
        SWORD;
    }
}
