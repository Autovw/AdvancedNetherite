package com.autovw.advancednetherite.core.registry;

import com.autovw.advancednetherite.AdvancedNetherite;
import com.autovw.advancednetherite.api.annotation.Internal;
import com.autovw.advancednetherite.core.ModBlocks;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;

/**
 * @author Autovw
 */
@Internal
public final class ModBlockRegistry
{
    public static void registerBlocks()
    {
        Registry.register(BuiltInRegistries.BLOCK, id("netherite_iron_block"), ModBlocks.NETHERITE_IRON_BLOCK);
        Registry.register(BuiltInRegistries.BLOCK, id("netherite_gold_block"), ModBlocks.NETHERITE_GOLD_BLOCK);
        Registry.register(BuiltInRegistries.BLOCK, id("netherite_emerald_block"), ModBlocks.NETHERITE_EMERALD_BLOCK);
        Registry.register(BuiltInRegistries.BLOCK, id("netherite_diamond_block"), ModBlocks.NETHERITE_DIAMOND_BLOCK);
    }

    private static ResourceLocation id(String name)
    {
        return ResourceLocation.fromNamespaceAndPath(AdvancedNetherite.MOD_ID, name);
    }
}
