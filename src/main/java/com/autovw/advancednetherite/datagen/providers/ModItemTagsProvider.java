package com.autovw.advancednetherite.datagen.providers;

import com.autovw.advancednetherite.Reference;
import com.autovw.advancednetherite.core.ModBlocks;
import com.autovw.advancednetherite.core.ModItems;
import com.autovw.advancednetherite.core.ModTags;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.data.ExistingFileHelper;

/**
 * Author: Autovw
 */
public class ModItemTagsProvider extends ItemTagsProvider {
    public ModItemTagsProvider(DataGenerator generator, BlockTagsProvider blockTagsProvider, String modId, ExistingFileHelper existingFileHelper) {
        super(generator, blockTagsProvider, modId, existingFileHelper);
    }

    @Override
    protected void addTags() {
        /* Mod Tags */
        tag(ModTags.NETHERITE_INGOTS)
                .add(ModItems.NETHERITE_IRON_INGOT.get())
                .add(ModItems.NETHERITE_GOLD_INGOT.get())
                .add(ModItems.NETHERITE_EMERALD_INGOT.get())
                .add(ModItems.NETHERITE_DIAMOND_INGOT.get());

        tag(ModTags.UPGRADE_TO_NETHERITE_DIAMOND).addTag(ModTags.INGOTS_NETHERITES_DIAMOND);
        tag(ModTags.UPGRADE_TO_NETHERITE_EMERALD).addTag(ModTags.INGOTS_NETHERITES_EMERALD);
        tag(ModTags.UPGRADE_TO_NETHERITE_GOLD).addTag(ModTags.INGOTS_NETHERITES_GOLD);
        tag(ModTags.UPGRADE_TO_NETHERITE_IRON).addTag(ModTags.INGOTS_NETHERITES_IRON);

        // Axes
        tag(ModTags.AXES_NETHERITE_DIAMOND).add(ModItems.NETHERITE_DIAMOND_AXE.get());
        tag(ModTags.AXES_NETHERITE_EMERALD).add(ModItems.NETHERITE_EMERALD_AXE.get());
        tag(ModTags.AXES_NETHERITE_GOLD).add(ModItems.NETHERITE_GOLD_AXE.get());
        tag(ModTags.AXES_NETHERITE_IRON).add(ModItems.NETHERITE_IRON_AXE.get());
        tag(ModTags.AXES_NETHERITE).add(Items.NETHERITE_AXE);

        tag(ModTags.AXES_UPGRADE_TO_NETHERITE_DIAMOND).addTag(ModTags.AXES_NETHERITE_EMERALD);
        tag(ModTags.AXES_UPGRADE_TO_NETHERITE_EMERALD).addTag(ModTags.AXES_NETHERITE_GOLD);
        tag(ModTags.AXES_UPGRADE_TO_NETHERITE_GOLD).addTag(ModTags.AXES_NETHERITE_IRON);
        tag(ModTags.AXES_UPGRADE_TO_NETHERITE_IRON).addTag(ModTags.AXES_NETHERITE);

        // Boots
        tag(ModTags.BOOTS_NETHERITE_DIAMOND).add(ModItems.NETHERITE_DIAMOND_BOOTS.get());
        tag(ModTags.BOOTS_NETHERITE_EMERALD).add(ModItems.NETHERITE_EMERALD_BOOTS.get());
        tag(ModTags.BOOTS_NETHERITE_GOLD).add(ModItems.NETHERITE_GOLD_BOOTS.get());
        tag(ModTags.BOOTS_NETHERITE_IRON).add(ModItems.NETHERITE_IRON_BOOTS.get());
        tag(ModTags.BOOTS_NETHERITE).add(Items.NETHERITE_BOOTS);

        tag(ModTags.BOOTS_UPGRADE_TO_NETHERITE_DIAMOND).addTag(ModTags.BOOTS_NETHERITE_EMERALD);
        tag(ModTags.BOOTS_UPGRADE_TO_NETHERITE_EMERALD).addTag(ModTags.BOOTS_NETHERITE_GOLD);
        tag(ModTags.BOOTS_UPGRADE_TO_NETHERITE_GOLD).addTag(ModTags.BOOTS_NETHERITE_IRON);
        tag(ModTags.BOOTS_UPGRADE_TO_NETHERITE_IRON).addTag(ModTags.BOOTS_NETHERITE);

        // Chestplates
        tag(ModTags.CHESTPLATES_NETHERITE_DIAMOND).add(ModItems.NETHERITE_DIAMOND_CHESTPLATE.get());
        tag(ModTags.CHESTPLATES_NETHERITE_EMERALD).add(ModItems.NETHERITE_EMERALD_CHESTPLATE.get());
        tag(ModTags.CHESTPLATES_NETHERITE_GOLD).add(ModItems.NETHERITE_GOLD_CHESTPLATE.get());
        tag(ModTags.CHESTPLATES_NETHERITE_IRON).add(ModItems.NETHERITE_IRON_CHESTPLATE.get());
        tag(ModTags.CHESTPLATES_NETHERITE).add(Items.NETHERITE_CHESTPLATE);

        tag(ModTags.CHESTPLATES_UPGRADE_TO_NETHERITE_DIAMOND).addTag(ModTags.CHESTPLATES_NETHERITE_EMERALD);
        tag(ModTags.CHESTPLATES_UPGRADE_TO_NETHERITE_EMERALD).addTag(ModTags.CHESTPLATES_NETHERITE_GOLD);
        tag(ModTags.CHESTPLATES_UPGRADE_TO_NETHERITE_GOLD).addTag(ModTags.CHESTPLATES_NETHERITE_IRON);
        tag(ModTags.CHESTPLATES_UPGRADE_TO_NETHERITE_IRON).addTag(ModTags.CHESTPLATES_NETHERITE);

        // Helmets
        tag(ModTags.HELMETS_NETHERITE_DIAMOND).add(ModItems.NETHERITE_DIAMOND_HELMET.get());
        tag(ModTags.HELMETS_NETHERITE_EMERALD).add(ModItems.NETHERITE_EMERALD_HELMET.get());
        tag(ModTags.HELMETS_NETHERITE_GOLD).add(ModItems.NETHERITE_GOLD_HELMET.get());
        tag(ModTags.HELMETS_NETHERITE_IRON).add(ModItems.NETHERITE_IRON_HELMET.get());
        tag(ModTags.HELMETS_NETHERITE).add(Items.NETHERITE_HELMET);

        tag(ModTags.HELMETS_UPGRADE_TO_NETHERITE_DIAMOND).addTag(ModTags.HELMETS_NETHERITE_EMERALD);
        tag(ModTags.HELMETS_UPGRADE_TO_NETHERITE_EMERALD).addTag(ModTags.HELMETS_NETHERITE_GOLD);
        tag(ModTags.HELMETS_UPGRADE_TO_NETHERITE_GOLD).addTag(ModTags.HELMETS_NETHERITE_IRON);
        tag(ModTags.HELMETS_UPGRADE_TO_NETHERITE_IRON).addTag(ModTags.HELMETS_NETHERITE);

        // Hoes
        tag(ModTags.HOES_NETHERITE_DIAMOND).add(ModItems.NETHERITE_DIAMOND_HOE.get());
        tag(ModTags.HOES_NETHERITE_EMERALD).add(ModItems.NETHERITE_EMERALD_HOE.get());
        tag(ModTags.HOES_NETHERITE_GOLD).add(ModItems.NETHERITE_GOLD_HOE.get());
        tag(ModTags.HOES_NETHERITE_IRON).add(ModItems.NETHERITE_IRON_HOE.get());
        tag(ModTags.HOES_NETHERITE).add(Items.NETHERITE_HOE);

        tag(ModTags.HOES_UPGRADE_TO_NETHERITE_DIAMOND).addTag(ModTags.HOES_NETHERITE_EMERALD);
        tag(ModTags.HOES_UPGRADE_TO_NETHERITE_EMERALD).addTag(ModTags.HOES_NETHERITE_GOLD);
        tag(ModTags.HOES_UPGRADE_TO_NETHERITE_GOLD).addTag(ModTags.HOES_NETHERITE_IRON);
        tag(ModTags.HOES_UPGRADE_TO_NETHERITE_IRON).addTag(ModTags.HOES_NETHERITE);

        // Ingots
        tag(ModTags.INGOTS_NETHERITES_DIAMOND).add(ModItems.NETHERITE_DIAMOND_INGOT.get());
        tag(ModTags.INGOTS_NETHERITES_EMERALD).add(ModItems.NETHERITE_EMERALD_INGOT.get());
        tag(ModTags.INGOTS_NETHERITES_GOLD).add(ModItems.NETHERITE_GOLD_INGOT.get());
        tag(ModTags.INGOTS_NETHERITES_IRON).add(ModItems.NETHERITE_IRON_INGOT.get());
        tag(ModTags.INGOTS_NETHERITES).add(Items.NETHERITE_INGOT);

        tag(ModTags.INGOTS_UPGRADE_TO_NETHERITE_DIAMOND).addTag(ModTags.INGOTS_NETHERITES_EMERALD);
        tag(ModTags.INGOTS_UPGRADE_TO_NETHERITE_EMERALD).addTag(ModTags.INGOTS_NETHERITES_GOLD);
        tag(ModTags.INGOTS_UPGRADE_TO_NETHERITE_GOLD).addTag(ModTags.INGOTS_NETHERITES_IRON);
        tag(ModTags.INGOTS_UPGRADE_TO_NETHERITE_IRON).addTag(ModTags.INGOTS_NETHERITES);

        // Leggings
        tag(ModTags.LEGGINGS_NETHERITE_DIAMOND).add(ModItems.NETHERITE_DIAMOND_LEGGINGS.get());
        tag(ModTags.LEGGINGS_NETHERITE_EMERALD).add(ModItems.NETHERITE_EMERALD_LEGGINGS.get());
        tag(ModTags.LEGGINGS_NETHERITE_GOLD).add(ModItems.NETHERITE_GOLD_LEGGINGS.get());
        tag(ModTags.LEGGINGS_NETHERITE_IRON).add(ModItems.NETHERITE_IRON_LEGGINGS.get());
        tag(ModTags.LEGGINGS_NETHERITE).add(Items.NETHERITE_LEGGINGS);

        tag(ModTags.LEGGINGS_UPGRADE_TO_NETHERITE_DIAMOND).addTag(ModTags.LEGGINGS_NETHERITE_EMERALD);
        tag(ModTags.LEGGINGS_UPGRADE_TO_NETHERITE_EMERALD).addTag(ModTags.LEGGINGS_NETHERITE_GOLD);
        tag(ModTags.LEGGINGS_UPGRADE_TO_NETHERITE_GOLD).addTag(ModTags.LEGGINGS_NETHERITE_IRON);
        tag(ModTags.LEGGINGS_UPGRADE_TO_NETHERITE_IRON).addTag(ModTags.LEGGINGS_NETHERITE);

        // Pickaxes
        tag(ModTags.PICKAXES_NETHERITE_DIAMOND).add(ModItems.NETHERITE_DIAMOND_PICKAXE.get());
        tag(ModTags.PICKAXES_NETHERITE_EMERALD).add(ModItems.NETHERITE_EMERALD_PICKAXE.get());
        tag(ModTags.PICKAXES_NETHERITE_GOLD).add(ModItems.NETHERITE_GOLD_PICKAXE.get());
        tag(ModTags.PICKAXES_NETHERITE_IRON).add(ModItems.NETHERITE_IRON_PICKAXE.get());
        tag(ModTags.PICKAXES_NETHERITE).add(Items.NETHERITE_PICKAXE);

        tag(ModTags.PICKAXES_UPGRADE_TO_NETHERITE_DIAMOND).addTag(ModTags.PICKAXES_NETHERITE_EMERALD);
        tag(ModTags.PICKAXES_UPGRADE_TO_NETHERITE_EMERALD).addTag(ModTags.PICKAXES_NETHERITE_GOLD);
        tag(ModTags.PICKAXES_UPGRADE_TO_NETHERITE_GOLD).addTag(ModTags.PICKAXES_NETHERITE_IRON);
        tag(ModTags.PICKAXES_UPGRADE_TO_NETHERITE_IRON).addTag(ModTags.PICKAXES_NETHERITE);

        // Shovels
        tag(ModTags.SHOVELS_NETHERITE_DIAMOND).add(ModItems.NETHERITE_DIAMOND_SHOVEL.get());
        tag(ModTags.SHOVELS_NETHERITE_EMERALD).add(ModItems.NETHERITE_EMERALD_SHOVEL.get());
        tag(ModTags.SHOVELS_NETHERITE_GOLD).add(ModItems.NETHERITE_GOLD_SHOVEL.get());
        tag(ModTags.SHOVELS_NETHERITE_IRON).add(ModItems.NETHERITE_IRON_SHOVEL.get());
        tag(ModTags.SHOVELS_NETHERITE).add(Items.NETHERITE_SHOVEL);

        tag(ModTags.SHOVELS_UPGRADE_TO_NETHERITE_DIAMOND).addTag(ModTags.SHOVELS_NETHERITE_EMERALD);
        tag(ModTags.SHOVELS_UPGRADE_TO_NETHERITE_EMERALD).addTag(ModTags.SHOVELS_NETHERITE_GOLD);
        tag(ModTags.SHOVELS_UPGRADE_TO_NETHERITE_GOLD).addTag(ModTags.SHOVELS_NETHERITE_IRON);
        tag(ModTags.SHOVELS_UPGRADE_TO_NETHERITE_IRON).addTag(ModTags.SHOVELS_NETHERITE);

        // Swords
        tag(ModTags.SWORDS_NETHERITE_DIAMOND).add(ModItems.NETHERITE_DIAMOND_SWORD.get());
        tag(ModTags.SWORDS_NETHERITE_EMERALD).add(ModItems.NETHERITE_EMERALD_SWORD.get());
        tag(ModTags.SWORDS_NETHERITE_GOLD).add(ModItems.NETHERITE_GOLD_SWORD.get());
        tag(ModTags.SWORDS_NETHERITE_IRON).add(ModItems.NETHERITE_IRON_SWORD.get());
        tag(ModTags.SWORDS_NETHERITE).add(Items.NETHERITE_SWORD);

        tag(ModTags.SWORDS_UPGRADE_TO_NETHERITE_DIAMOND).addTag(ModTags.SWORDS_NETHERITE_EMERALD);
        tag(ModTags.SWORDS_UPGRADE_TO_NETHERITE_EMERALD).addTag(ModTags.SWORDS_NETHERITE_GOLD);
        tag(ModTags.SWORDS_UPGRADE_TO_NETHERITE_GOLD).addTag(ModTags.SWORDS_NETHERITE_IRON);
        tag(ModTags.SWORDS_UPGRADE_TO_NETHERITE_IRON).addTag(ModTags.SWORDS_NETHERITE);

        /* Vanilla tags */
        tag(ItemTags.BEACON_PAYMENT_ITEMS).addTag(ModTags.NETHERITE_INGOTS);

        tag(ItemTags.PIGLIN_LOVED)
                .add(ModBlocks.NETHERITE_GOLD_BLOCK.get().asItem())
                .add(ModItems.NETHERITE_GOLD_INGOT.get())
                .add(ModItems.NETHERITE_GOLD_HELMET.get())
                .add(ModItems.NETHERITE_GOLD_CHESTPLATE.get())
                .add(ModItems.NETHERITE_GOLD_LEGGINGS.get())
                .add(ModItems.NETHERITE_GOLD_BOOTS.get())
                .add(ModItems.NETHERITE_GOLD_AXE.get())
                .add(ModItems.NETHERITE_GOLD_HOE.get())
                .add(ModItems.NETHERITE_GOLD_PICKAXE.get())
                .add(ModItems.NETHERITE_GOLD_SHOVEL.get())
                .add(ModItems.NETHERITE_GOLD_SWORD.get());
    }
}
