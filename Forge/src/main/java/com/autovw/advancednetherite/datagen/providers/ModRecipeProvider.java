package com.autovw.advancednetherite.datagen.providers;

import com.autovw.advancednetherite.AdvancedNetherite;
import com.autovw.advancednetherite.core.ModBlocks;
import com.autovw.advancednetherite.core.ModItems;
import com.autovw.advancednetherite.core.util.ModTags;
import net.minecraft.core.HolderLookup;
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

import java.util.concurrent.CompletableFuture;

/**
 * @author Autovw
 */
public class ModRecipeProvider extends RecipeProvider
{
    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries)
    {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput output)
    {
        /* Blocks */
        baseBlockRecipe(output, ModItems.NETHERITE_IRON_INGOT, ModBlocks.NETHERITE_IRON_BLOCK);
        baseBlockRecipe(output, ModItems.NETHERITE_GOLD_INGOT, ModBlocks.NETHERITE_GOLD_BLOCK);
        baseBlockRecipe(output, ModItems.NETHERITE_EMERALD_INGOT, ModBlocks.NETHERITE_EMERALD_BLOCK);
        baseBlockRecipe(output, ModItems.NETHERITE_DIAMOND_INGOT, ModBlocks.NETHERITE_DIAMOND_BLOCK);

        /* Ingots */
        baseIngotRecipe(output, ModTags.INGOTS_UPGRADE_TO_NETHERITE_IRON, Tags.Items.INGOTS_IRON, ModItems.NETHERITE_IRON_INGOT);
        baseIngotRecipe(output, ModTags.INGOTS_UPGRADE_TO_NETHERITE_GOLD, Tags.Items.INGOTS_GOLD, ModItems.NETHERITE_GOLD_INGOT);
        baseIngotRecipe(output, ModTags.INGOTS_UPGRADE_TO_NETHERITE_EMERALD, Tags.Items.GEMS_EMERALD, ModItems.NETHERITE_EMERALD_INGOT);
        baseIngotRecipe(output, ModTags.INGOTS_UPGRADE_TO_NETHERITE_DIAMOND, Tags.Items.GEMS_DIAMOND, ModItems.NETHERITE_DIAMOND_INGOT);

        /* Axes */
        baseSmithingRecipe(output, ModTags.AXES_UPGRADE_TO_NETHERITE_IRON, ModTags.UPGRADE_TO_NETHERITE_IRON, ModItems.NETHERITE_IRON_AXE);
        baseSmithingRecipe(output, ModTags.AXES_UPGRADE_TO_NETHERITE_GOLD, ModTags.UPGRADE_TO_NETHERITE_GOLD, ModItems.NETHERITE_GOLD_AXE);
        baseSmithingRecipe(output, ModTags.AXES_UPGRADE_TO_NETHERITE_EMERALD, ModTags.UPGRADE_TO_NETHERITE_EMERALD, ModItems.NETHERITE_EMERALD_AXE);
        baseSmithingRecipe(output, ModTags.AXES_UPGRADE_TO_NETHERITE_DIAMOND, ModTags.UPGRADE_TO_NETHERITE_DIAMOND, ModItems.NETHERITE_DIAMOND_AXE);

        /* Boots */
        baseSmithingRecipe(output, ModTags.BOOTS_UPGRADE_TO_NETHERITE_IRON, ModTags.UPGRADE_TO_NETHERITE_IRON, ModItems.NETHERITE_IRON_BOOTS);
        baseSmithingRecipe(output, ModTags.BOOTS_UPGRADE_TO_NETHERITE_GOLD, ModTags.UPGRADE_TO_NETHERITE_GOLD, ModItems.NETHERITE_GOLD_BOOTS);
        baseSmithingRecipe(output, ModTags.BOOTS_UPGRADE_TO_NETHERITE_EMERALD, ModTags.UPGRADE_TO_NETHERITE_EMERALD, ModItems.NETHERITE_EMERALD_BOOTS);
        baseSmithingRecipe(output, ModTags.BOOTS_UPGRADE_TO_NETHERITE_DIAMOND, ModTags.UPGRADE_TO_NETHERITE_DIAMOND, ModItems.NETHERITE_DIAMOND_BOOTS);

        /* Chestplates */
        baseSmithingRecipe(output, ModTags.CHESTPLATES_UPGRADE_TO_NETHERITE_IRON, ModTags.UPGRADE_TO_NETHERITE_IRON, ModItems.NETHERITE_IRON_CHESTPLATE);
        baseSmithingRecipe(output, ModTags.CHESTPLATES_UPGRADE_TO_NETHERITE_GOLD, ModTags.UPGRADE_TO_NETHERITE_GOLD, ModItems.NETHERITE_GOLD_CHESTPLATE);
        baseSmithingRecipe(output, ModTags.CHESTPLATES_UPGRADE_TO_NETHERITE_EMERALD, ModTags.UPGRADE_TO_NETHERITE_EMERALD, ModItems.NETHERITE_EMERALD_CHESTPLATE);
        baseSmithingRecipe(output, ModTags.CHESTPLATES_UPGRADE_TO_NETHERITE_DIAMOND, ModTags.UPGRADE_TO_NETHERITE_DIAMOND, ModItems.NETHERITE_DIAMOND_CHESTPLATE);

        /* Helmets */
        baseSmithingRecipe(output, ModTags.HELMETS_UPGRADE_TO_NETHERITE_IRON, ModTags.UPGRADE_TO_NETHERITE_IRON, ModItems.NETHERITE_IRON_HELMET);
        baseSmithingRecipe(output, ModTags.HELMETS_UPGRADE_TO_NETHERITE_GOLD, ModTags.UPGRADE_TO_NETHERITE_GOLD, ModItems.NETHERITE_GOLD_HELMET);
        baseSmithingRecipe(output, ModTags.HELMETS_UPGRADE_TO_NETHERITE_EMERALD, ModTags.UPGRADE_TO_NETHERITE_EMERALD, ModItems.NETHERITE_EMERALD_HELMET);
        baseSmithingRecipe(output, ModTags.HELMETS_UPGRADE_TO_NETHERITE_DIAMOND, ModTags.UPGRADE_TO_NETHERITE_DIAMOND, ModItems.NETHERITE_DIAMOND_HELMET);

        /* Hoes */
        baseSmithingRecipe(output, ModTags.HOES_UPGRADE_TO_NETHERITE_IRON, ModTags.UPGRADE_TO_NETHERITE_IRON, ModItems.NETHERITE_IRON_HOE);
        baseSmithingRecipe(output, ModTags.HOES_UPGRADE_TO_NETHERITE_GOLD, ModTags.UPGRADE_TO_NETHERITE_GOLD, ModItems.NETHERITE_GOLD_HOE);
        baseSmithingRecipe(output, ModTags.HOES_UPGRADE_TO_NETHERITE_EMERALD, ModTags.UPGRADE_TO_NETHERITE_EMERALD, ModItems.NETHERITE_EMERALD_HOE);
        baseSmithingRecipe(output, ModTags.HOES_UPGRADE_TO_NETHERITE_DIAMOND, ModTags.UPGRADE_TO_NETHERITE_DIAMOND, ModItems.NETHERITE_DIAMOND_HOE);

        /* Leggings */
        baseSmithingRecipe(output, ModTags.LEGGINGS_UPGRADE_TO_NETHERITE_IRON, ModTags.UPGRADE_TO_NETHERITE_IRON, ModItems.NETHERITE_IRON_LEGGINGS);
        baseSmithingRecipe(output, ModTags.LEGGINGS_UPGRADE_TO_NETHERITE_GOLD, ModTags.UPGRADE_TO_NETHERITE_GOLD, ModItems.NETHERITE_GOLD_LEGGINGS);
        baseSmithingRecipe(output, ModTags.LEGGINGS_UPGRADE_TO_NETHERITE_EMERALD, ModTags.UPGRADE_TO_NETHERITE_EMERALD, ModItems.NETHERITE_EMERALD_LEGGINGS);
        baseSmithingRecipe(output, ModTags.LEGGINGS_UPGRADE_TO_NETHERITE_DIAMOND, ModTags.UPGRADE_TO_NETHERITE_DIAMOND, ModItems.NETHERITE_DIAMOND_LEGGINGS);

        /* Pickaxes */
        baseSmithingRecipe(output, ModTags.PICKAXES_UPGRADE_TO_NETHERITE_IRON, ModTags.UPGRADE_TO_NETHERITE_IRON, ModItems.NETHERITE_IRON_PICKAXE);
        baseSmithingRecipe(output, ModTags.PICKAXES_UPGRADE_TO_NETHERITE_GOLD, ModTags.UPGRADE_TO_NETHERITE_GOLD, ModItems.NETHERITE_GOLD_PICKAXE);
        baseSmithingRecipe(output, ModTags.PICKAXES_UPGRADE_TO_NETHERITE_EMERALD, ModTags.UPGRADE_TO_NETHERITE_EMERALD, ModItems.NETHERITE_EMERALD_PICKAXE);
        baseSmithingRecipe(output, ModTags.PICKAXES_UPGRADE_TO_NETHERITE_DIAMOND, ModTags.UPGRADE_TO_NETHERITE_DIAMOND, ModItems.NETHERITE_DIAMOND_PICKAXE);

        /* Shovels */
        baseSmithingRecipe(output, ModTags.SHOVELS_UPGRADE_TO_NETHERITE_IRON, ModTags.UPGRADE_TO_NETHERITE_IRON, ModItems.NETHERITE_IRON_SHOVEL);
        baseSmithingRecipe(output, ModTags.SHOVELS_UPGRADE_TO_NETHERITE_GOLD, ModTags.UPGRADE_TO_NETHERITE_GOLD, ModItems.NETHERITE_GOLD_SHOVEL);
        baseSmithingRecipe(output, ModTags.SHOVELS_UPGRADE_TO_NETHERITE_EMERALD, ModTags.UPGRADE_TO_NETHERITE_EMERALD, ModItems.NETHERITE_EMERALD_SHOVEL);
        baseSmithingRecipe(output, ModTags.SHOVELS_UPGRADE_TO_NETHERITE_DIAMOND, ModTags.UPGRADE_TO_NETHERITE_DIAMOND, ModItems.NETHERITE_DIAMOND_SHOVEL);

        /* Swords */
        baseSmithingRecipe(output, ModTags.SWORDS_UPGRADE_TO_NETHERITE_IRON, ModTags.UPGRADE_TO_NETHERITE_IRON, ModItems.NETHERITE_IRON_SWORD);
        baseSmithingRecipe(output, ModTags.SWORDS_UPGRADE_TO_NETHERITE_GOLD, ModTags.UPGRADE_TO_NETHERITE_GOLD, ModItems.NETHERITE_GOLD_SWORD);
        baseSmithingRecipe(output, ModTags.SWORDS_UPGRADE_TO_NETHERITE_EMERALD, ModTags.UPGRADE_TO_NETHERITE_EMERALD, ModItems.NETHERITE_EMERALD_SWORD);
        baseSmithingRecipe(output, ModTags.SWORDS_UPGRADE_TO_NETHERITE_DIAMOND, ModTags.UPGRADE_TO_NETHERITE_DIAMOND, ModItems.NETHERITE_DIAMOND_SWORD);

        /* Misc */
        lodestoneRecipe(output);
    }

    /**
     * Base recipe for generating advanced netherite related smithing recipes
     *
     * @param output Recipe output
     * @param ingredient Ingredient
     * @param upgradeIngredient Ingot
     * @param result Result item
     */
    public static void baseSmithingRecipe(RecipeOutput output, TagKey<Item> ingredient, TagKey<Item> upgradeIngredient, Item result)
    {
        ResourceLocation resultId = AdvancedNetherite.getRegistryHelper().getItemById(result);

        SmithingTransformRecipeBuilder.smithing(Ingredient.of(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE), Ingredient.of(ingredient), Ingredient.of(upgradeIngredient), RecipeCategory.MISC, result)
                .unlocks("has_ingredients", has(upgradeIngredient))
                .save(output, ResourceLocation.fromNamespaceAndPath(resultId.getNamespace(), resultId.getPath() + "_smithing"));
    }

    /**
     * Base recipe for generating advanced netherite related ingots
     *
     * @param output Recipe output
     * @param ingotIngredient Base ingot
     * @param upgradeIngredient Additional ingredients
     * @param result Upgraded ingot
     */
    public static void baseIngotRecipe(RecipeOutput output, TagKey<Item> ingotIngredient, TagKey<Item> upgradeIngredient, Item result)
    {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, result)
                .requires(ingotIngredient)
                .requires(upgradeIngredient).requires(upgradeIngredient).requires(upgradeIngredient).requires(upgradeIngredient)
                .unlockedBy("has_" + upgradeIngredient.toString(), has(upgradeIngredient))
                .save(output, ResourceLocation.parse(result.toString()));
    }

    /**
     * Base recipe for generating advanced netherite related blocks.
     * Also generates a recipe for converting the block back into ingots
     *
     * @param output Recipe output
     * @param ingredient Ingot
     * @param result Block
     */
    public static void baseBlockRecipe(RecipeOutput output, ItemLike ingredient, Block result)
    {
        // Items to Block
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, result)
                .define('#', ingredient)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .unlockedBy("has_" + ingredient.toString(), has(ingredient))
                .save(output);

        // Block to Items
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ingredient, 9)
                .requires(result)
                .unlockedBy("has_" + result.toString(), has(result))
                .save(output, ResourceLocation.parse(ingredient.toString() + "_from_block"));
    }

    // Other ingots are automatically included if they are added to the NETHERITE_INGOTS tag.
    private static void lodestoneRecipe(RecipeOutput output)
    {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.LODESTONE)
                .define('S', Items.CHISELED_STONE_BRICKS)
                .define('#', ModTags.NETHERITE_INGOTS)
                .pattern("SSS")
                .pattern("S#S")
                .pattern("SSS")
                .unlockedBy("has_chiseled_stone_bricks", has(Items.CHISELED_STONE_BRICKS))
                .unlockedBy("has_netherite_ingots", has(ModTags.NETHERITE_INGOTS))
                .save(output, ResourceLocation.fromNamespaceAndPath(AdvancedNetherite.MOD_ID, AdvancedNetherite.getRegistryHelper().getItemById(Items.LODESTONE).getPath()));
    }
}
