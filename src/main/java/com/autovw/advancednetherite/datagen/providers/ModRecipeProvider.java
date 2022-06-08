package com.autovw.advancednetherite.datagen.providers;

import com.autovw.advancednetherite.Reference;
import com.autovw.advancednetherite.core.registry.ModBlocks;
import com.autovw.advancednetherite.core.registry.ModItems;
import com.autovw.advancednetherite.core.util.ModTags;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.Tags;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Consumer;

/**
 * Author: Autovw
 */
public class ModRecipeProvider extends RecipeProvider {
    public ModRecipeProvider(DataGenerator generator) {
        super(generator);
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer) {
        /* Blocks */
        baseBlockRecipe(consumer, ModItems.NETHERITE_IRON_INGOT.get(), ModBlocks.NETHERITE_IRON_BLOCK.get());
        baseBlockRecipe(consumer, ModItems.NETHERITE_GOLD_INGOT.get(), ModBlocks.NETHERITE_GOLD_BLOCK.get());
        baseBlockRecipe(consumer, ModItems.NETHERITE_EMERALD_INGOT.get(), ModBlocks.NETHERITE_EMERALD_BLOCK.get());
        baseBlockRecipe(consumer, ModItems.NETHERITE_DIAMOND_INGOT.get(), ModBlocks.NETHERITE_DIAMOND_BLOCK.get());

        /* Ingots */
        baseIngotRecipe(consumer, ModTags.INGOTS_UPGRADE_TO_NETHERITE_IRON, Tags.Items.INGOTS_IRON, ModItems.NETHERITE_IRON_INGOT.get());
        baseIngotRecipe(consumer, ModTags.INGOTS_UPGRADE_TO_NETHERITE_GOLD, Tags.Items.INGOTS_GOLD, ModItems.NETHERITE_GOLD_INGOT.get());
        baseIngotRecipe(consumer, ModTags.INGOTS_UPGRADE_TO_NETHERITE_EMERALD, Tags.Items.GEMS_EMERALD, ModItems.NETHERITE_EMERALD_INGOT.get());
        baseIngotRecipe(consumer, ModTags.INGOTS_UPGRADE_TO_NETHERITE_DIAMOND, Tags.Items.GEMS_DIAMOND, ModItems.NETHERITE_DIAMOND_INGOT.get());

        /* Axes */
        baseSmithingRecipe(consumer, ModTags.AXES_UPGRADE_TO_NETHERITE_IRON, ModTags.UPGRADE_TO_NETHERITE_IRON, ModItems.NETHERITE_IRON_AXE.get());
        baseSmithingRecipe(consumer, ModTags.AXES_UPGRADE_TO_NETHERITE_GOLD, ModTags.UPGRADE_TO_NETHERITE_GOLD, ModItems.NETHERITE_GOLD_AXE.get());
        baseSmithingRecipe(consumer, ModTags.AXES_UPGRADE_TO_NETHERITE_EMERALD, ModTags.UPGRADE_TO_NETHERITE_EMERALD, ModItems.NETHERITE_EMERALD_AXE.get());
        baseSmithingRecipe(consumer, ModTags.AXES_UPGRADE_TO_NETHERITE_DIAMOND, ModTags.UPGRADE_TO_NETHERITE_DIAMOND, ModItems.NETHERITE_DIAMOND_AXE.get());

        /* Boots */
        baseSmithingRecipe(consumer, ModTags.BOOTS_UPGRADE_TO_NETHERITE_IRON, ModTags.UPGRADE_TO_NETHERITE_IRON, ModItems.NETHERITE_IRON_BOOTS.get());
        baseSmithingRecipe(consumer, ModTags.BOOTS_UPGRADE_TO_NETHERITE_GOLD, ModTags.UPGRADE_TO_NETHERITE_GOLD, ModItems.NETHERITE_GOLD_BOOTS.get());
        baseSmithingRecipe(consumer, ModTags.BOOTS_UPGRADE_TO_NETHERITE_EMERALD, ModTags.UPGRADE_TO_NETHERITE_EMERALD, ModItems.NETHERITE_EMERALD_BOOTS.get());
        baseSmithingRecipe(consumer, ModTags.BOOTS_UPGRADE_TO_NETHERITE_DIAMOND, ModTags.UPGRADE_TO_NETHERITE_DIAMOND, ModItems.NETHERITE_DIAMOND_BOOTS.get());

        /* Chestplates */
        baseSmithingRecipe(consumer, ModTags.CHESTPLATES_UPGRADE_TO_NETHERITE_IRON, ModTags.UPGRADE_TO_NETHERITE_IRON, ModItems.NETHERITE_IRON_CHESTPLATE.get());
        baseSmithingRecipe(consumer, ModTags.CHESTPLATES_UPGRADE_TO_NETHERITE_GOLD, ModTags.UPGRADE_TO_NETHERITE_GOLD, ModItems.NETHERITE_GOLD_CHESTPLATE.get());
        baseSmithingRecipe(consumer, ModTags.CHESTPLATES_UPGRADE_TO_NETHERITE_EMERALD, ModTags.UPGRADE_TO_NETHERITE_EMERALD, ModItems.NETHERITE_EMERALD_CHESTPLATE.get());
        baseSmithingRecipe(consumer, ModTags.CHESTPLATES_UPGRADE_TO_NETHERITE_DIAMOND, ModTags.UPGRADE_TO_NETHERITE_DIAMOND, ModItems.NETHERITE_DIAMOND_CHESTPLATE.get());

        /* Helmets */
        baseSmithingRecipe(consumer, ModTags.HELMETS_UPGRADE_TO_NETHERITE_IRON, ModTags.UPGRADE_TO_NETHERITE_IRON, ModItems.NETHERITE_IRON_HELMET.get());
        baseSmithingRecipe(consumer, ModTags.HELMETS_UPGRADE_TO_NETHERITE_GOLD, ModTags.UPGRADE_TO_NETHERITE_GOLD, ModItems.NETHERITE_GOLD_HELMET.get());
        baseSmithingRecipe(consumer, ModTags.HELMETS_UPGRADE_TO_NETHERITE_EMERALD, ModTags.UPGRADE_TO_NETHERITE_EMERALD, ModItems.NETHERITE_EMERALD_HELMET.get());
        baseSmithingRecipe(consumer, ModTags.HELMETS_UPGRADE_TO_NETHERITE_DIAMOND, ModTags.UPGRADE_TO_NETHERITE_DIAMOND, ModItems.NETHERITE_DIAMOND_HELMET.get());

        /* Hoes */
        baseSmithingRecipe(consumer, ModTags.HOES_UPGRADE_TO_NETHERITE_IRON, ModTags.UPGRADE_TO_NETHERITE_IRON, ModItems.NETHERITE_IRON_HOE.get());
        baseSmithingRecipe(consumer, ModTags.HOES_UPGRADE_TO_NETHERITE_GOLD, ModTags.UPGRADE_TO_NETHERITE_GOLD, ModItems.NETHERITE_GOLD_HOE.get());
        baseSmithingRecipe(consumer, ModTags.HOES_UPGRADE_TO_NETHERITE_EMERALD, ModTags.UPGRADE_TO_NETHERITE_EMERALD, ModItems.NETHERITE_EMERALD_HOE.get());
        baseSmithingRecipe(consumer, ModTags.HOES_UPGRADE_TO_NETHERITE_DIAMOND, ModTags.UPGRADE_TO_NETHERITE_DIAMOND, ModItems.NETHERITE_DIAMOND_HOE.get());

        /* Leggings */
        baseSmithingRecipe(consumer, ModTags.LEGGINGS_UPGRADE_TO_NETHERITE_IRON, ModTags.UPGRADE_TO_NETHERITE_IRON, ModItems.NETHERITE_IRON_LEGGINGS.get());
        baseSmithingRecipe(consumer, ModTags.LEGGINGS_UPGRADE_TO_NETHERITE_GOLD, ModTags.UPGRADE_TO_NETHERITE_GOLD, ModItems.NETHERITE_GOLD_LEGGINGS.get());
        baseSmithingRecipe(consumer, ModTags.LEGGINGS_UPGRADE_TO_NETHERITE_EMERALD, ModTags.UPGRADE_TO_NETHERITE_EMERALD, ModItems.NETHERITE_EMERALD_LEGGINGS.get());
        baseSmithingRecipe(consumer, ModTags.LEGGINGS_UPGRADE_TO_NETHERITE_DIAMOND, ModTags.UPGRADE_TO_NETHERITE_DIAMOND, ModItems.NETHERITE_DIAMOND_LEGGINGS.get());

        /* Pickaxes */
        baseSmithingRecipe(consumer, ModTags.PICKAXES_UPGRADE_TO_NETHERITE_IRON, ModTags.UPGRADE_TO_NETHERITE_IRON, ModItems.NETHERITE_IRON_PICKAXE.get());
        baseSmithingRecipe(consumer, ModTags.PICKAXES_UPGRADE_TO_NETHERITE_GOLD, ModTags.UPGRADE_TO_NETHERITE_GOLD, ModItems.NETHERITE_GOLD_PICKAXE.get());
        baseSmithingRecipe(consumer, ModTags.PICKAXES_UPGRADE_TO_NETHERITE_EMERALD, ModTags.UPGRADE_TO_NETHERITE_EMERALD, ModItems.NETHERITE_EMERALD_PICKAXE.get());
        baseSmithingRecipe(consumer, ModTags.PICKAXES_UPGRADE_TO_NETHERITE_DIAMOND, ModTags.UPGRADE_TO_NETHERITE_DIAMOND, ModItems.NETHERITE_DIAMOND_PICKAXE.get());

        /* Shovels */
        baseSmithingRecipe(consumer, ModTags.SHOVELS_UPGRADE_TO_NETHERITE_IRON, ModTags.UPGRADE_TO_NETHERITE_IRON, ModItems.NETHERITE_IRON_SHOVEL.get());
        baseSmithingRecipe(consumer, ModTags.SHOVELS_UPGRADE_TO_NETHERITE_GOLD, ModTags.UPGRADE_TO_NETHERITE_GOLD, ModItems.NETHERITE_GOLD_SHOVEL.get());
        baseSmithingRecipe(consumer, ModTags.SHOVELS_UPGRADE_TO_NETHERITE_EMERALD, ModTags.UPGRADE_TO_NETHERITE_EMERALD, ModItems.NETHERITE_EMERALD_SHOVEL.get());
        baseSmithingRecipe(consumer, ModTags.SHOVELS_UPGRADE_TO_NETHERITE_DIAMOND, ModTags.UPGRADE_TO_NETHERITE_DIAMOND, ModItems.NETHERITE_DIAMOND_SHOVEL.get());

        /* Swords */
        baseSmithingRecipe(consumer, ModTags.SWORDS_UPGRADE_TO_NETHERITE_IRON, ModTags.UPGRADE_TO_NETHERITE_IRON, ModItems.NETHERITE_IRON_SWORD.get());
        baseSmithingRecipe(consumer, ModTags.SWORDS_UPGRADE_TO_NETHERITE_GOLD, ModTags.UPGRADE_TO_NETHERITE_GOLD, ModItems.NETHERITE_GOLD_SWORD.get());
        baseSmithingRecipe(consumer, ModTags.SWORDS_UPGRADE_TO_NETHERITE_EMERALD, ModTags.UPGRADE_TO_NETHERITE_EMERALD, ModItems.NETHERITE_EMERALD_SWORD.get());
        baseSmithingRecipe(consumer, ModTags.SWORDS_UPGRADE_TO_NETHERITE_DIAMOND, ModTags.UPGRADE_TO_NETHERITE_DIAMOND, ModItems.NETHERITE_DIAMOND_SWORD.get());

        /* Misc */
        lodestoneRecipe(consumer);
    }

    /**
     * Base recipe for generating advanced netherite related smithing recipes
     *
     * @param consumer Recipe consumer
     * @param ingredient Ingredient
     * @param upgradeIngredient Ingot
     * @param result Result item
     */
    public static void baseSmithingRecipe(Consumer<FinishedRecipe> consumer, TagKey<Item> ingredient, TagKey<Item> upgradeIngredient, Item result) {
        UpgradeRecipeBuilder.smithing(Ingredient.of(ingredient), Ingredient.of(upgradeIngredient), result)
                .unlocks("has_" + upgradeIngredient.toString(), has(upgradeIngredient))
                .save(consumer, new ResourceLocation(ForgeRegistries.ITEMS.getKey(result).getNamespace(), result.toString() + "_smithing"));
    }

    /**
     * Base recipe for generating advanced netherite related ingots
     *
     * @param consumer Recipe consumer
     * @param ingotIngredient Base ingot
     * @param upgradeIngredient Additional ingredients
     * @param result Upgraded ingot
     */
    public static void baseIngotRecipe(Consumer<FinishedRecipe> consumer, TagKey<Item> ingotIngredient, TagKey<Item> upgradeIngredient, Item result) {
        ShapelessRecipeBuilder.shapeless(result)
                .requires(ingotIngredient)
                .requires(upgradeIngredient).requires(upgradeIngredient).requires(upgradeIngredient).requires(upgradeIngredient)
                .unlockedBy("has_" + upgradeIngredient.toString(), has(upgradeIngredient))
                .save(consumer, new ResourceLocation(ForgeRegistries.ITEMS.getKey(result).getNamespace(), result.toString()));
    }

    /**
     * Base recipe for generating advanced netherite related blocks.
     * Also generates a recipe for converting the block back into ingots
     *
     * @param consumer Recipe consumer
     * @param ingredient Ingot
     * @param result Block
     */
    public static void baseBlockRecipe(Consumer<FinishedRecipe> consumer, ItemLike ingredient, Block result) {
        // Items to Block
        ShapedRecipeBuilder.shaped(result)
                .define('#', ingredient)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .unlockedBy("has_" + ingredient.toString(), has(ingredient))
                .save(consumer);

        // Block to Items
        ShapelessRecipeBuilder.shapeless(ingredient, 9)
                .requires(result)
                .unlockedBy("has_" + result.toString(), has(result))
                .save(consumer, new ResourceLocation(ForgeRegistries.BLOCKS.getKey(result).getNamespace(), ingredient.toString() + "_from_block"));
    }

    // Other ingots are automatically included if they are added to the NETHERITE_INGOTS tag.
    private static void lodestoneRecipe(Consumer<FinishedRecipe> consumer) {
        ShapedRecipeBuilder.shaped(Items.LODESTONE)
                .define('S', Items.CHISELED_STONE_BRICKS)
                .define('#', ModTags.NETHERITE_INGOTS)
                .pattern("SSS")
                .pattern("S#S")
                .pattern("SSS")
                .unlockedBy("has_chiseled_stone_bricks", has(Items.CHISELED_STONE_BRICKS))
                .unlockedBy("has_netherite_ingots", has(ModTags.NETHERITE_INGOTS))
                .save(consumer, new ResourceLocation(Reference.MOD_ID, Items.LODESTONE.toString()));
    }
}
