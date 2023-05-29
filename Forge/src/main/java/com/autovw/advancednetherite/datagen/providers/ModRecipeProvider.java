package com.autovw.advancednetherite.datagen.providers;

import com.autovw.advancednetherite.AdvancedNetherite;
import com.autovw.advancednetherite.core.ModBlocks;
import com.autovw.advancednetherite.core.ModItems;
import com.autovw.advancednetherite.core.util.ModTags;
import net.minecraft.data.PackOutput;
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
 * @author Autovw
 */
public class ModRecipeProvider extends RecipeProvider
{
    public ModRecipeProvider(PackOutput packOutput)
    {
        super(packOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> consumer)
    {
        /* Blocks */
        baseBlockRecipe(consumer, ModItems.NETHERITE_IRON_INGOT, ModBlocks.NETHERITE_IRON_BLOCK);
        baseBlockRecipe(consumer, ModItems.NETHERITE_GOLD_INGOT, ModBlocks.NETHERITE_GOLD_BLOCK);
        baseBlockRecipe(consumer, ModItems.NETHERITE_EMERALD_INGOT, ModBlocks.NETHERITE_EMERALD_BLOCK);
        baseBlockRecipe(consumer, ModItems.NETHERITE_DIAMOND_INGOT, ModBlocks.NETHERITE_DIAMOND_BLOCK);

        /* Ingots */
        baseIngotRecipe(consumer, ModTags.INGOTS_UPGRADE_TO_NETHERITE_IRON, Tags.Items.INGOTS_IRON, ModItems.NETHERITE_IRON_INGOT);
        baseIngotRecipe(consumer, ModTags.INGOTS_UPGRADE_TO_NETHERITE_GOLD, Tags.Items.INGOTS_GOLD, ModItems.NETHERITE_GOLD_INGOT);
        baseIngotRecipe(consumer, ModTags.INGOTS_UPGRADE_TO_NETHERITE_EMERALD, Tags.Items.GEMS_EMERALD, ModItems.NETHERITE_EMERALD_INGOT);
        baseIngotRecipe(consumer, ModTags.INGOTS_UPGRADE_TO_NETHERITE_DIAMOND, Tags.Items.GEMS_DIAMOND, ModItems.NETHERITE_DIAMOND_INGOT);

        /* Axes */
        baseSmithingRecipe(consumer, ModTags.AXES_UPGRADE_TO_NETHERITE_IRON, ModTags.UPGRADE_TO_NETHERITE_IRON, ModItems.NETHERITE_IRON_AXE);
        baseSmithingRecipe(consumer, ModTags.AXES_UPGRADE_TO_NETHERITE_GOLD, ModTags.UPGRADE_TO_NETHERITE_GOLD, ModItems.NETHERITE_GOLD_AXE);
        baseSmithingRecipe(consumer, ModTags.AXES_UPGRADE_TO_NETHERITE_EMERALD, ModTags.UPGRADE_TO_NETHERITE_EMERALD, ModItems.NETHERITE_EMERALD_AXE);
        baseSmithingRecipe(consumer, ModTags.AXES_UPGRADE_TO_NETHERITE_DIAMOND, ModTags.UPGRADE_TO_NETHERITE_DIAMOND, ModItems.NETHERITE_DIAMOND_AXE);

        /* Boots */
        baseSmithingRecipe(consumer, ModTags.BOOTS_UPGRADE_TO_NETHERITE_IRON, ModTags.UPGRADE_TO_NETHERITE_IRON, ModItems.NETHERITE_IRON_BOOTS);
        baseSmithingRecipe(consumer, ModTags.BOOTS_UPGRADE_TO_NETHERITE_GOLD, ModTags.UPGRADE_TO_NETHERITE_GOLD, ModItems.NETHERITE_GOLD_BOOTS);
        baseSmithingRecipe(consumer, ModTags.BOOTS_UPGRADE_TO_NETHERITE_EMERALD, ModTags.UPGRADE_TO_NETHERITE_EMERALD, ModItems.NETHERITE_EMERALD_BOOTS);
        baseSmithingRecipe(consumer, ModTags.BOOTS_UPGRADE_TO_NETHERITE_DIAMOND, ModTags.UPGRADE_TO_NETHERITE_DIAMOND, ModItems.NETHERITE_DIAMOND_BOOTS);

        /* Chestplates */
        baseSmithingRecipe(consumer, ModTags.CHESTPLATES_UPGRADE_TO_NETHERITE_IRON, ModTags.UPGRADE_TO_NETHERITE_IRON, ModItems.NETHERITE_IRON_CHESTPLATE);
        baseSmithingRecipe(consumer, ModTags.CHESTPLATES_UPGRADE_TO_NETHERITE_GOLD, ModTags.UPGRADE_TO_NETHERITE_GOLD, ModItems.NETHERITE_GOLD_CHESTPLATE);
        baseSmithingRecipe(consumer, ModTags.CHESTPLATES_UPGRADE_TO_NETHERITE_EMERALD, ModTags.UPGRADE_TO_NETHERITE_EMERALD, ModItems.NETHERITE_EMERALD_CHESTPLATE);
        baseSmithingRecipe(consumer, ModTags.CHESTPLATES_UPGRADE_TO_NETHERITE_DIAMOND, ModTags.UPGRADE_TO_NETHERITE_DIAMOND, ModItems.NETHERITE_DIAMOND_CHESTPLATE);

        /* Helmets */
        baseSmithingRecipe(consumer, ModTags.HELMETS_UPGRADE_TO_NETHERITE_IRON, ModTags.UPGRADE_TO_NETHERITE_IRON, ModItems.NETHERITE_IRON_HELMET);
        baseSmithingRecipe(consumer, ModTags.HELMETS_UPGRADE_TO_NETHERITE_GOLD, ModTags.UPGRADE_TO_NETHERITE_GOLD, ModItems.NETHERITE_GOLD_HELMET);
        baseSmithingRecipe(consumer, ModTags.HELMETS_UPGRADE_TO_NETHERITE_EMERALD, ModTags.UPGRADE_TO_NETHERITE_EMERALD, ModItems.NETHERITE_EMERALD_HELMET);
        baseSmithingRecipe(consumer, ModTags.HELMETS_UPGRADE_TO_NETHERITE_DIAMOND, ModTags.UPGRADE_TO_NETHERITE_DIAMOND, ModItems.NETHERITE_DIAMOND_HELMET);

        /* Hoes */
        baseSmithingRecipe(consumer, ModTags.HOES_UPGRADE_TO_NETHERITE_IRON, ModTags.UPGRADE_TO_NETHERITE_IRON, ModItems.NETHERITE_IRON_HOE);
        baseSmithingRecipe(consumer, ModTags.HOES_UPGRADE_TO_NETHERITE_GOLD, ModTags.UPGRADE_TO_NETHERITE_GOLD, ModItems.NETHERITE_GOLD_HOE);
        baseSmithingRecipe(consumer, ModTags.HOES_UPGRADE_TO_NETHERITE_EMERALD, ModTags.UPGRADE_TO_NETHERITE_EMERALD, ModItems.NETHERITE_EMERALD_HOE);
        baseSmithingRecipe(consumer, ModTags.HOES_UPGRADE_TO_NETHERITE_DIAMOND, ModTags.UPGRADE_TO_NETHERITE_DIAMOND, ModItems.NETHERITE_DIAMOND_HOE);

        /* Leggings */
        baseSmithingRecipe(consumer, ModTags.LEGGINGS_UPGRADE_TO_NETHERITE_IRON, ModTags.UPGRADE_TO_NETHERITE_IRON, ModItems.NETHERITE_IRON_LEGGINGS);
        baseSmithingRecipe(consumer, ModTags.LEGGINGS_UPGRADE_TO_NETHERITE_GOLD, ModTags.UPGRADE_TO_NETHERITE_GOLD, ModItems.NETHERITE_GOLD_LEGGINGS);
        baseSmithingRecipe(consumer, ModTags.LEGGINGS_UPGRADE_TO_NETHERITE_EMERALD, ModTags.UPGRADE_TO_NETHERITE_EMERALD, ModItems.NETHERITE_EMERALD_LEGGINGS);
        baseSmithingRecipe(consumer, ModTags.LEGGINGS_UPGRADE_TO_NETHERITE_DIAMOND, ModTags.UPGRADE_TO_NETHERITE_DIAMOND, ModItems.NETHERITE_DIAMOND_LEGGINGS);

        /* Pickaxes */
        baseSmithingRecipe(consumer, ModTags.PICKAXES_UPGRADE_TO_NETHERITE_IRON, ModTags.UPGRADE_TO_NETHERITE_IRON, ModItems.NETHERITE_IRON_PICKAXE);
        baseSmithingRecipe(consumer, ModTags.PICKAXES_UPGRADE_TO_NETHERITE_GOLD, ModTags.UPGRADE_TO_NETHERITE_GOLD, ModItems.NETHERITE_GOLD_PICKAXE);
        baseSmithingRecipe(consumer, ModTags.PICKAXES_UPGRADE_TO_NETHERITE_EMERALD, ModTags.UPGRADE_TO_NETHERITE_EMERALD, ModItems.NETHERITE_EMERALD_PICKAXE);
        baseSmithingRecipe(consumer, ModTags.PICKAXES_UPGRADE_TO_NETHERITE_DIAMOND, ModTags.UPGRADE_TO_NETHERITE_DIAMOND, ModItems.NETHERITE_DIAMOND_PICKAXE);

        /* Shovels */
        baseSmithingRecipe(consumer, ModTags.SHOVELS_UPGRADE_TO_NETHERITE_IRON, ModTags.UPGRADE_TO_NETHERITE_IRON, ModItems.NETHERITE_IRON_SHOVEL);
        baseSmithingRecipe(consumer, ModTags.SHOVELS_UPGRADE_TO_NETHERITE_GOLD, ModTags.UPGRADE_TO_NETHERITE_GOLD, ModItems.NETHERITE_GOLD_SHOVEL);
        baseSmithingRecipe(consumer, ModTags.SHOVELS_UPGRADE_TO_NETHERITE_EMERALD, ModTags.UPGRADE_TO_NETHERITE_EMERALD, ModItems.NETHERITE_EMERALD_SHOVEL);
        baseSmithingRecipe(consumer, ModTags.SHOVELS_UPGRADE_TO_NETHERITE_DIAMOND, ModTags.UPGRADE_TO_NETHERITE_DIAMOND, ModItems.NETHERITE_DIAMOND_SHOVEL);

        /* Swords */
        baseSmithingRecipe(consumer, ModTags.SWORDS_UPGRADE_TO_NETHERITE_IRON, ModTags.UPGRADE_TO_NETHERITE_IRON, ModItems.NETHERITE_IRON_SWORD);
        baseSmithingRecipe(consumer, ModTags.SWORDS_UPGRADE_TO_NETHERITE_GOLD, ModTags.UPGRADE_TO_NETHERITE_GOLD, ModItems.NETHERITE_GOLD_SWORD);
        baseSmithingRecipe(consumer, ModTags.SWORDS_UPGRADE_TO_NETHERITE_EMERALD, ModTags.UPGRADE_TO_NETHERITE_EMERALD, ModItems.NETHERITE_EMERALD_SWORD);
        baseSmithingRecipe(consumer, ModTags.SWORDS_UPGRADE_TO_NETHERITE_DIAMOND, ModTags.UPGRADE_TO_NETHERITE_DIAMOND, ModItems.NETHERITE_DIAMOND_SWORD);

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
        // TODO update to new system from 1.19.4, added for 1.20
        LegacyUpgradeRecipeBuilder.smithing(Ingredient.of(ingredient), Ingredient.of(upgradeIngredient), RecipeCategory.MISC, result)
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
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, result)
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
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, result)
                .define('#', ingredient)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .unlockedBy("has_" + ingredient.toString(), has(ingredient))
                .save(consumer);

        // Block to Items
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ingredient, 9)
                .requires(result)
                .unlockedBy("has_" + result.toString(), has(result))
                .save(consumer, new ResourceLocation(ForgeRegistries.BLOCKS.getKey(result).getNamespace(), ingredient.toString() + "_from_block"));
    }

    // Other ingots are automatically included if they are added to the NETHERITE_INGOTS tag.
    private static void lodestoneRecipe(Consumer<FinishedRecipe> consumer) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.LODESTONE)
                .define('S', Items.CHISELED_STONE_BRICKS)
                .define('#', ModTags.NETHERITE_INGOTS)
                .pattern("SSS")
                .pattern("S#S")
                .pattern("SSS")
                .unlockedBy("has_chiseled_stone_bricks", has(Items.CHISELED_STONE_BRICKS))
                .unlockedBy("has_netherite_ingots", has(ModTags.NETHERITE_INGOTS))
                .save(consumer, new ResourceLocation(AdvancedNetherite.MOD_ID, Items.LODESTONE.toString()));
    }
}
