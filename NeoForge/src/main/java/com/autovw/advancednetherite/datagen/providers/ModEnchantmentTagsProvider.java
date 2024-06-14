package com.autovw.advancednetherite.datagen.providers;

import com.autovw.advancednetherite.core.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.EnchantmentTagsProvider;
import net.minecraft.world.item.enchantment.Enchantments;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

/**
 * @author Autovw
 */
public class ModEnchantmentTagsProvider extends EnchantmentTagsProvider
{
    public ModEnchantmentTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries, String modId, @Nullable ExistingFileHelper existingFileHelper)
    {
        super(output, registries, modId, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider)
    {
        tag(ModTags.PREVENTS_ADDITIONAL_ORE_DROPS).add(Enchantments.SILK_TOUCH);
    }
}
