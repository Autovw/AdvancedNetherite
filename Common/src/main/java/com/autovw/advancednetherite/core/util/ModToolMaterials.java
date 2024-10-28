package com.autovw.advancednetherite.core.util;

import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.level.block.Block;

/**
 * @author Autovw
 */
public final class ModToolMaterials
{
    public static final ToolMaterial NETHERITE_IRON = material(ModTags.INCORRECT_FOR_NETHERITE_IRON_TOOL, 2281, 4.0F, 15, ModTags.REPAIRS_NETHERITE_IRON_TOOLS);
    public static final ToolMaterial NETHERITE_GOLD = material(ModTags.INCORRECT_FOR_NETHERITE_GOLD_TOOL, 2313, 4.0F, 25, ModTags.REPAIRS_NETHERITE_GOLD_TOOLS);
    public static final ToolMaterial NETHERITE_EMERALD = material(ModTags.INCORRECT_FOR_NETHERITE_EMERALD_TOOL, 2651, 5.0F, 20, ModTags.REPAIRS_NETHERITE_EMERALD_TOOLS);
    public static final ToolMaterial NETHERITE_DIAMOND = material(ModTags.INCORRECT_FOR_NETHERITE_DIAMOND_TOOL, 3092, 5.0F, 15, ModTags.REPAIRS_NETHERITE_DIAMOND_TOOLS);

    private static ToolMaterial material(TagKey<Block> incorrectBlocksForDrops, int durability, float attackDamageBonus, int enchantability, TagKey<Item> repairItems)
    {
        return new ToolMaterial(incorrectBlocksForDrops, durability, 1.0F, attackDamageBonus, enchantability, repairItems);
    }
}
