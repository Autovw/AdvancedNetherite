package com.autovw.advancednetherite.datagen.providers;

import com.autovw.advancednetherite.AdvancedNetherite;
import com.autovw.advancednetherite.core.ModBlocks;
import com.autovw.advancednetherite.core.ModItems;
import com.autovw.advancednetherite.core.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
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

import java.util.concurrent.CompletableFuture;

/**
 * @author Autovw
 */
public class ModRecipeProvider extends RecipeProvider
{
    protected ModRecipeProvider(HolderLookup.Provider lookupProvider, RecipeOutput recipeOutput)
    {
        super(lookupProvider, recipeOutput);
    }

    @Override
    protected void buildRecipes()
    {
        HolderLookup.RegistryLookup<Item> registryLookup = this.registries.lookupOrThrow(Registries.ITEM);

        /* Blocks */
        baseBlockRecipe(registryLookup, output, ModItems.NETHERITE_IRON_INGOT, ModBlocks.NETHERITE_IRON_BLOCK);
        baseBlockRecipe(registryLookup, output, ModItems.NETHERITE_GOLD_INGOT, ModBlocks.NETHERITE_GOLD_BLOCK);
        baseBlockRecipe(registryLookup, output, ModItems.NETHERITE_EMERALD_INGOT, ModBlocks.NETHERITE_EMERALD_BLOCK);
        baseBlockRecipe(registryLookup, output, ModItems.NETHERITE_DIAMOND_INGOT, ModBlocks.NETHERITE_DIAMOND_BLOCK);

        /* Ingots */
        baseIngotRecipe(registryLookup, output, ModTags.INGOTS_UPGRADE_TO_NETHERITE_IRON, Tags.Items.INGOTS_IRON, ModItems.NETHERITE_IRON_INGOT);
        baseIngotRecipe(registryLookup, output, ModTags.INGOTS_UPGRADE_TO_NETHERITE_GOLD, Tags.Items.INGOTS_GOLD, ModItems.NETHERITE_GOLD_INGOT);
        baseIngotRecipe(registryLookup, output, ModTags.INGOTS_UPGRADE_TO_NETHERITE_EMERALD, Tags.Items.GEMS_EMERALD, ModItems.NETHERITE_EMERALD_INGOT);
        baseIngotRecipe(registryLookup, output, ModTags.INGOTS_UPGRADE_TO_NETHERITE_DIAMOND, Tags.Items.GEMS_DIAMOND, ModItems.NETHERITE_DIAMOND_INGOT);

        /* Axes */
        baseSmithingRecipe(registryLookup, output, ModTags.AXE_UPGRADE_TO_NETHERITE_IRON, ModTags.UPGRADE_TO_NETHERITE_IRON, ModItems.NETHERITE_IRON_AXE);
        baseSmithingRecipe(registryLookup, output, ModTags.AXE_UPGRADE_TO_NETHERITE_GOLD, ModTags.UPGRADE_TO_NETHERITE_GOLD, ModItems.NETHERITE_GOLD_AXE);
        baseSmithingRecipe(registryLookup, output, ModTags.AXE_UPGRADE_TO_NETHERITE_EMERALD, ModTags.UPGRADE_TO_NETHERITE_EMERALD, ModItems.NETHERITE_EMERALD_AXE);
        baseSmithingRecipe(registryLookup, output, ModTags.AXE_UPGRADE_TO_NETHERITE_DIAMOND, ModTags.UPGRADE_TO_NETHERITE_DIAMOND, ModItems.NETHERITE_DIAMOND_AXE);

        /* Boots */
        baseSmithingRecipe(registryLookup, output, ModTags.BOOTS_UPGRADE_TO_NETHERITE_IRON, ModTags.UPGRADE_TO_NETHERITE_IRON, ModItems.NETHERITE_IRON_BOOTS);
        baseSmithingRecipe(registryLookup, output, ModTags.BOOTS_UPGRADE_TO_NETHERITE_GOLD, ModTags.UPGRADE_TO_NETHERITE_GOLD, ModItems.NETHERITE_GOLD_BOOTS);
        baseSmithingRecipe(registryLookup, output, ModTags.BOOTS_UPGRADE_TO_NETHERITE_EMERALD, ModTags.UPGRADE_TO_NETHERITE_EMERALD, ModItems.NETHERITE_EMERALD_BOOTS);
        baseSmithingRecipe(registryLookup, output, ModTags.BOOTS_UPGRADE_TO_NETHERITE_DIAMOND, ModTags.UPGRADE_TO_NETHERITE_DIAMOND, ModItems.NETHERITE_DIAMOND_BOOTS);

        /* Chestplates */
        baseSmithingRecipe(registryLookup, output, ModTags.CHESTPLATE_UPGRADE_TO_NETHERITE_IRON, ModTags.UPGRADE_TO_NETHERITE_IRON, ModItems.NETHERITE_IRON_CHESTPLATE);
        baseSmithingRecipe(registryLookup, output, ModTags.CHESTPLATE_UPGRADE_TO_NETHERITE_GOLD, ModTags.UPGRADE_TO_NETHERITE_GOLD, ModItems.NETHERITE_GOLD_CHESTPLATE);
        baseSmithingRecipe(registryLookup, output, ModTags.CHESTPLATE_UPGRADE_TO_NETHERITE_EMERALD, ModTags.UPGRADE_TO_NETHERITE_EMERALD, ModItems.NETHERITE_EMERALD_CHESTPLATE);
        baseSmithingRecipe(registryLookup, output, ModTags.CHESTPLATE_UPGRADE_TO_NETHERITE_DIAMOND, ModTags.UPGRADE_TO_NETHERITE_DIAMOND, ModItems.NETHERITE_DIAMOND_CHESTPLATE);

        /* Helmets */
        baseSmithingRecipe(registryLookup, output, ModTags.HELMET_UPGRADE_TO_NETHERITE_IRON, ModTags.UPGRADE_TO_NETHERITE_IRON, ModItems.NETHERITE_IRON_HELMET);
        baseSmithingRecipe(registryLookup, output, ModTags.HELMET_UPGRADE_TO_NETHERITE_GOLD, ModTags.UPGRADE_TO_NETHERITE_GOLD, ModItems.NETHERITE_GOLD_HELMET);
        baseSmithingRecipe(registryLookup, output, ModTags.HELMET_UPGRADE_TO_NETHERITE_EMERALD, ModTags.UPGRADE_TO_NETHERITE_EMERALD, ModItems.NETHERITE_EMERALD_HELMET);
        baseSmithingRecipe(registryLookup, output, ModTags.HELMET_UPGRADE_TO_NETHERITE_DIAMOND, ModTags.UPGRADE_TO_NETHERITE_DIAMOND, ModItems.NETHERITE_DIAMOND_HELMET);

        /* Hoes */
        baseSmithingRecipe(registryLookup, output, ModTags.HOE_UPGRADE_TO_NETHERITE_IRON, ModTags.UPGRADE_TO_NETHERITE_IRON, ModItems.NETHERITE_IRON_HOE);
        baseSmithingRecipe(registryLookup, output, ModTags.HOE_UPGRADE_TO_NETHERITE_GOLD, ModTags.UPGRADE_TO_NETHERITE_GOLD, ModItems.NETHERITE_GOLD_HOE);
        baseSmithingRecipe(registryLookup, output, ModTags.HOE_UPGRADE_TO_NETHERITE_EMERALD, ModTags.UPGRADE_TO_NETHERITE_EMERALD, ModItems.NETHERITE_EMERALD_HOE);
        baseSmithingRecipe(registryLookup, output, ModTags.HOE_UPGRADE_TO_NETHERITE_DIAMOND, ModTags.UPGRADE_TO_NETHERITE_DIAMOND, ModItems.NETHERITE_DIAMOND_HOE);

        /* Leggings */
        baseSmithingRecipe(registryLookup, output, ModTags.LEGGINGS_UPGRADE_TO_NETHERITE_IRON, ModTags.UPGRADE_TO_NETHERITE_IRON, ModItems.NETHERITE_IRON_LEGGINGS);
        baseSmithingRecipe(registryLookup, output, ModTags.LEGGINGS_UPGRADE_TO_NETHERITE_GOLD, ModTags.UPGRADE_TO_NETHERITE_GOLD, ModItems.NETHERITE_GOLD_LEGGINGS);
        baseSmithingRecipe(registryLookup, output, ModTags.LEGGINGS_UPGRADE_TO_NETHERITE_EMERALD, ModTags.UPGRADE_TO_NETHERITE_EMERALD, ModItems.NETHERITE_EMERALD_LEGGINGS);
        baseSmithingRecipe(registryLookup, output, ModTags.LEGGINGS_UPGRADE_TO_NETHERITE_DIAMOND, ModTags.UPGRADE_TO_NETHERITE_DIAMOND, ModItems.NETHERITE_DIAMOND_LEGGINGS);

        /* Pickaxes */
        baseSmithingRecipe(registryLookup, output, ModTags.PICKAXE_UPGRADE_TO_NETHERITE_IRON, ModTags.UPGRADE_TO_NETHERITE_IRON, ModItems.NETHERITE_IRON_PICKAXE);
        baseSmithingRecipe(registryLookup, output, ModTags.PICKAXE_UPGRADE_TO_NETHERITE_GOLD, ModTags.UPGRADE_TO_NETHERITE_GOLD, ModItems.NETHERITE_GOLD_PICKAXE);
        baseSmithingRecipe(registryLookup, output, ModTags.PICKAXE_UPGRADE_TO_NETHERITE_EMERALD, ModTags.UPGRADE_TO_NETHERITE_EMERALD, ModItems.NETHERITE_EMERALD_PICKAXE);
        baseSmithingRecipe(registryLookup, output, ModTags.PICKAXE_UPGRADE_TO_NETHERITE_DIAMOND, ModTags.UPGRADE_TO_NETHERITE_DIAMOND, ModItems.NETHERITE_DIAMOND_PICKAXE);

        /* Shovels */
        baseSmithingRecipe(registryLookup, output, ModTags.SHOVEL_UPGRADE_TO_NETHERITE_IRON, ModTags.UPGRADE_TO_NETHERITE_IRON, ModItems.NETHERITE_IRON_SHOVEL);
        baseSmithingRecipe(registryLookup, output, ModTags.SHOVEL_UPGRADE_TO_NETHERITE_GOLD, ModTags.UPGRADE_TO_NETHERITE_GOLD, ModItems.NETHERITE_GOLD_SHOVEL);
        baseSmithingRecipe(registryLookup, output, ModTags.SHOVEL_UPGRADE_TO_NETHERITE_EMERALD, ModTags.UPGRADE_TO_NETHERITE_EMERALD, ModItems.NETHERITE_EMERALD_SHOVEL);
        baseSmithingRecipe(registryLookup, output, ModTags.SHOVEL_UPGRADE_TO_NETHERITE_DIAMOND, ModTags.UPGRADE_TO_NETHERITE_DIAMOND, ModItems.NETHERITE_DIAMOND_SHOVEL);

        /* Swords */
        baseSmithingRecipe(registryLookup, output, ModTags.SWORD_UPGRADE_TO_NETHERITE_IRON, ModTags.UPGRADE_TO_NETHERITE_IRON, ModItems.NETHERITE_IRON_SWORD);
        baseSmithingRecipe(registryLookup, output, ModTags.SWORD_UPGRADE_TO_NETHERITE_GOLD, ModTags.UPGRADE_TO_NETHERITE_GOLD, ModItems.NETHERITE_GOLD_SWORD);
        baseSmithingRecipe(registryLookup, output, ModTags.SWORD_UPGRADE_TO_NETHERITE_EMERALD, ModTags.UPGRADE_TO_NETHERITE_EMERALD, ModItems.NETHERITE_EMERALD_SWORD);
        baseSmithingRecipe(registryLookup, output, ModTags.SWORD_UPGRADE_TO_NETHERITE_DIAMOND, ModTags.UPGRADE_TO_NETHERITE_DIAMOND, ModItems.NETHERITE_DIAMOND_SWORD);

        /* Misc */
        lodestoneRecipe(registryLookup, output);
    }

    /**
     * Base recipe for generating advanced netherite related smithing recipes
     *
     * @param output Recipe output
     * @param ingredient Ingredient
     * @param upgradeIngredient Ingot
     * @param result Result item
     */
    public void baseSmithingRecipe(HolderLookup.RegistryLookup<Item> registryLookup, RecipeOutput output, TagKey<Item> ingredient, TagKey<Item> upgradeIngredient, Item result)
    {
        ResourceLocation resultId = AdvancedNetherite.getRegistryHelper().getItemById(result);

        SmithingTransformRecipeBuilder.smithing(Ingredient.of(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE), tag(ingredient), tag(upgradeIngredient), RecipeCategory.MISC, result)
                .unlocks("has_ingredients", has(upgradeIngredient))
                .save(output, ResourceLocation.fromNamespaceAndPath(resultId.getNamespace(), resultId.getPath() + "_smithing").toString());
    }

    /**
     * Base recipe for generating advanced netherite related ingots
     *
     * @param output Recipe output
     * @param ingotIngredient Base ingot
     * @param upgradeIngredient Additional ingredients
     * @param result Upgraded ingot
     */
    public void baseIngotRecipe(HolderLookup.RegistryLookup<Item> registryLookup, RecipeOutput output, TagKey<Item> ingotIngredient, TagKey<Item> upgradeIngredient, Item result)
    {
        ShapelessRecipeBuilder.shapeless(registryLookup, RecipeCategory.MISC, result)
                .requires(ingotIngredient)
                .requires(upgradeIngredient).requires(upgradeIngredient).requires(upgradeIngredient).requires(upgradeIngredient)
                .unlockedBy("has_" + upgradeIngredient.toString(), has(upgradeIngredient))
                .save(output);
    }

    /**
     * Base recipe for generating advanced netherite related blocks.
     * Also generates a recipe for converting the block back into ingots
     *
     * @param output Recipe output
     * @param ingredient Ingot
     * @param result Block
     */
    public void baseBlockRecipe(HolderLookup.RegistryLookup<Item> registryLookup, RecipeOutput output, ItemLike ingredient, Block result)
    {
        // Items to Block
        ShapedRecipeBuilder.shaped(registryLookup, RecipeCategory.BUILDING_BLOCKS, result)
                .define('#', ingredient)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .unlockedBy("has_" + ingredient.toString(), has(ingredient))
                .save(output);

        // Block to Items
        ShapelessRecipeBuilder.shapeless(registryLookup, RecipeCategory.MISC, ingredient, 9)
                .requires(result)
                .unlockedBy("has_" + result.toString(), has(result))
                .save(output, ResourceLocation.parse(ingredient.toString() + "_from_block").toString());
    }

    // Other ingots are automatically included if they are added to the NETHERITE_INGOTS tag.
    private void lodestoneRecipe(HolderLookup.RegistryLookup<Item> registryLookup, RecipeOutput output)
    {
        ShapedRecipeBuilder.shaped(registryLookup, RecipeCategory.MISC, Items.LODESTONE)
                .define('S', Items.CHISELED_STONE_BRICKS)
                .define('#', ModTags.NETHERITE_INGOTS)
                .pattern("SSS")
                .pattern("S#S")
                .pattern("SSS")
                .unlockedBy("has_chiseled_stone_bricks", has(Items.CHISELED_STONE_BRICKS))
                .unlockedBy("has_netherite_ingots", has(ModTags.NETHERITE_INGOTS))
                .save(output, ResourceLocation.fromNamespaceAndPath(AdvancedNetherite.MOD_ID, AdvancedNetherite.getRegistryHelper().getItemById(Items.LODESTONE).getPath()).toString());
    }

    public static class Runner extends RecipeProvider.Runner
    {
        public Runner(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> provider)
        {
            super(packOutput, provider);
        }

        @Override
        protected RecipeProvider createRecipeProvider(HolderLookup.Provider provider, RecipeOutput recipeOutput)
        {
            return new ModRecipeProvider(provider, recipeOutput);
        }

        @Override
        public String getName()
        {
            return "Advanced Netherite recipes";
        }
    }
}
