package com.autovw.advancednetherite.datagen.providers;

import com.autovw.advancednetherite.core.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;

import java.util.concurrent.CompletableFuture;

/**
 * @author Autovw
 */
public class ModEnchantmentTagsProvider extends FabricTagsProvider<Enchantment>
{
    public ModEnchantmentTagsProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> completableFuture)
    {
        super(output, Registries.ENCHANTMENT, completableFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider wrapperLookup)
    {
        builder(ModTags.PREVENTS_ADDITIONAL_ORE_DROPS).add(Enchantments.SILK_TOUCH);
    }
}
