package com.autovw.advancednetherite.datagen.providers;

import com.autovw.advancednetherite.AdvancedNetherite;
import com.autovw.advancednetherite.core.ModBlocks;
import com.autovw.advancednetherite.core.ModItems;
import com.autovw.advancednetherite.core.util.ModTags;
import net.minecraft.advancements.Advancement;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.MultiRegistryBootstrap;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.recipes.*;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.Tags;
import org.jspecify.annotations.NonNull;

import java.util.Set;

/**
 * @author Autovw
 */
public class ModRecipeProvider extends RecipeProvider
{
    private final HolderGetter<Item> items;

    public ModRecipeProvider(BootstrapContext<Recipe<?>> recipeOutput, BootstrapContext<Advancement> advancementOutput)
    {
        super(recipeOutput, advancementOutput);
        this.items = recipeOutput.lookup(Registries.ITEM);
    }

    @Override
    protected void buildRecipes()
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
        baseSmithingRecipe(output, ModTags.AXE_UPGRADE_TO_NETHERITE_IRON, ModTags.UPGRADE_TO_NETHERITE_IRON, ModItems.NETHERITE_IRON_AXE);
        baseSmithingRecipe(output, ModTags.AXE_UPGRADE_TO_NETHERITE_GOLD, ModTags.UPGRADE_TO_NETHERITE_GOLD, ModItems.NETHERITE_GOLD_AXE);
        baseSmithingRecipe(output, ModTags.AXE_UPGRADE_TO_NETHERITE_EMERALD, ModTags.UPGRADE_TO_NETHERITE_EMERALD, ModItems.NETHERITE_EMERALD_AXE);
        baseSmithingRecipe(output, ModTags.AXE_UPGRADE_TO_NETHERITE_DIAMOND, ModTags.UPGRADE_TO_NETHERITE_DIAMOND, ModItems.NETHERITE_DIAMOND_AXE);

        /* Boots */
        baseSmithingRecipe(output, ModTags.BOOTS_UPGRADE_TO_NETHERITE_IRON, ModTags.UPGRADE_TO_NETHERITE_IRON, ModItems.NETHERITE_IRON_BOOTS);
        baseSmithingRecipe(output, ModTags.BOOTS_UPGRADE_TO_NETHERITE_GOLD, ModTags.UPGRADE_TO_NETHERITE_GOLD, ModItems.NETHERITE_GOLD_BOOTS);
        baseSmithingRecipe(output, ModTags.BOOTS_UPGRADE_TO_NETHERITE_EMERALD, ModTags.UPGRADE_TO_NETHERITE_EMERALD, ModItems.NETHERITE_EMERALD_BOOTS);
        baseSmithingRecipe(output, ModTags.BOOTS_UPGRADE_TO_NETHERITE_DIAMOND, ModTags.UPGRADE_TO_NETHERITE_DIAMOND, ModItems.NETHERITE_DIAMOND_BOOTS);

        /* Chestplates */
        baseSmithingRecipe(output, ModTags.CHESTPLATE_UPGRADE_TO_NETHERITE_IRON, ModTags.UPGRADE_TO_NETHERITE_IRON, ModItems.NETHERITE_IRON_CHESTPLATE);
        baseSmithingRecipe(output, ModTags.CHESTPLATE_UPGRADE_TO_NETHERITE_GOLD, ModTags.UPGRADE_TO_NETHERITE_GOLD, ModItems.NETHERITE_GOLD_CHESTPLATE);
        baseSmithingRecipe(output, ModTags.CHESTPLATE_UPGRADE_TO_NETHERITE_EMERALD, ModTags.UPGRADE_TO_NETHERITE_EMERALD, ModItems.NETHERITE_EMERALD_CHESTPLATE);
        baseSmithingRecipe(output, ModTags.CHESTPLATE_UPGRADE_TO_NETHERITE_DIAMOND, ModTags.UPGRADE_TO_NETHERITE_DIAMOND, ModItems.NETHERITE_DIAMOND_CHESTPLATE);

        /* Helmets */
        baseSmithingRecipe(output, ModTags.HELMET_UPGRADE_TO_NETHERITE_IRON, ModTags.UPGRADE_TO_NETHERITE_IRON, ModItems.NETHERITE_IRON_HELMET);
        baseSmithingRecipe(output, ModTags.HELMET_UPGRADE_TO_NETHERITE_GOLD, ModTags.UPGRADE_TO_NETHERITE_GOLD, ModItems.NETHERITE_GOLD_HELMET);
        baseSmithingRecipe(output, ModTags.HELMET_UPGRADE_TO_NETHERITE_EMERALD, ModTags.UPGRADE_TO_NETHERITE_EMERALD, ModItems.NETHERITE_EMERALD_HELMET);
        baseSmithingRecipe(output, ModTags.HELMET_UPGRADE_TO_NETHERITE_DIAMOND, ModTags.UPGRADE_TO_NETHERITE_DIAMOND, ModItems.NETHERITE_DIAMOND_HELMET);

        /* Hoes */
        baseSmithingRecipe(output, ModTags.HOE_UPGRADE_TO_NETHERITE_IRON, ModTags.UPGRADE_TO_NETHERITE_IRON, ModItems.NETHERITE_IRON_HOE);
        baseSmithingRecipe(output, ModTags.HOE_UPGRADE_TO_NETHERITE_GOLD, ModTags.UPGRADE_TO_NETHERITE_GOLD, ModItems.NETHERITE_GOLD_HOE);
        baseSmithingRecipe(output, ModTags.HOE_UPGRADE_TO_NETHERITE_EMERALD, ModTags.UPGRADE_TO_NETHERITE_EMERALD, ModItems.NETHERITE_EMERALD_HOE);
        baseSmithingRecipe(output, ModTags.HOE_UPGRADE_TO_NETHERITE_DIAMOND, ModTags.UPGRADE_TO_NETHERITE_DIAMOND, ModItems.NETHERITE_DIAMOND_HOE);

        /* Leggings */
        baseSmithingRecipe(output, ModTags.LEGGINGS_UPGRADE_TO_NETHERITE_IRON, ModTags.UPGRADE_TO_NETHERITE_IRON, ModItems.NETHERITE_IRON_LEGGINGS);
        baseSmithingRecipe(output, ModTags.LEGGINGS_UPGRADE_TO_NETHERITE_GOLD, ModTags.UPGRADE_TO_NETHERITE_GOLD, ModItems.NETHERITE_GOLD_LEGGINGS);
        baseSmithingRecipe(output, ModTags.LEGGINGS_UPGRADE_TO_NETHERITE_EMERALD, ModTags.UPGRADE_TO_NETHERITE_EMERALD, ModItems.NETHERITE_EMERALD_LEGGINGS);
        baseSmithingRecipe(output, ModTags.LEGGINGS_UPGRADE_TO_NETHERITE_DIAMOND, ModTags.UPGRADE_TO_NETHERITE_DIAMOND, ModItems.NETHERITE_DIAMOND_LEGGINGS);

        /* Pickaxes */
        baseSmithingRecipe(output, ModTags.PICKAXE_UPGRADE_TO_NETHERITE_IRON, ModTags.UPGRADE_TO_NETHERITE_IRON, ModItems.NETHERITE_IRON_PICKAXE);
        baseSmithingRecipe(output, ModTags.PICKAXE_UPGRADE_TO_NETHERITE_GOLD, ModTags.UPGRADE_TO_NETHERITE_GOLD, ModItems.NETHERITE_GOLD_PICKAXE);
        baseSmithingRecipe(output, ModTags.PICKAXE_UPGRADE_TO_NETHERITE_EMERALD, ModTags.UPGRADE_TO_NETHERITE_EMERALD, ModItems.NETHERITE_EMERALD_PICKAXE);
        baseSmithingRecipe(output, ModTags.PICKAXE_UPGRADE_TO_NETHERITE_DIAMOND, ModTags.UPGRADE_TO_NETHERITE_DIAMOND, ModItems.NETHERITE_DIAMOND_PICKAXE);

        /* Shovels */
        baseSmithingRecipe(output, ModTags.SHOVEL_UPGRADE_TO_NETHERITE_IRON, ModTags.UPGRADE_TO_NETHERITE_IRON, ModItems.NETHERITE_IRON_SHOVEL);
        baseSmithingRecipe(output, ModTags.SHOVEL_UPGRADE_TO_NETHERITE_GOLD, ModTags.UPGRADE_TO_NETHERITE_GOLD, ModItems.NETHERITE_GOLD_SHOVEL);
        baseSmithingRecipe(output, ModTags.SHOVEL_UPGRADE_TO_NETHERITE_EMERALD, ModTags.UPGRADE_TO_NETHERITE_EMERALD, ModItems.NETHERITE_EMERALD_SHOVEL);
        baseSmithingRecipe(output, ModTags.SHOVEL_UPGRADE_TO_NETHERITE_DIAMOND, ModTags.UPGRADE_TO_NETHERITE_DIAMOND, ModItems.NETHERITE_DIAMOND_SHOVEL);

        /* Swords */
        baseSmithingRecipe(output, ModTags.SWORD_UPGRADE_TO_NETHERITE_IRON, ModTags.UPGRADE_TO_NETHERITE_IRON, ModItems.NETHERITE_IRON_SWORD);
        baseSmithingRecipe(output, ModTags.SWORD_UPGRADE_TO_NETHERITE_GOLD, ModTags.UPGRADE_TO_NETHERITE_GOLD, ModItems.NETHERITE_GOLD_SWORD);
        baseSmithingRecipe(output, ModTags.SWORD_UPGRADE_TO_NETHERITE_EMERALD, ModTags.UPGRADE_TO_NETHERITE_EMERALD, ModItems.NETHERITE_EMERALD_SWORD);
        baseSmithingRecipe(output, ModTags.SWORD_UPGRADE_TO_NETHERITE_DIAMOND, ModTags.UPGRADE_TO_NETHERITE_DIAMOND, ModItems.NETHERITE_DIAMOND_SWORD);

        /* Spears */
        baseSmithingRecipe(output, ModTags.SPEAR_UPGRADE_TO_NETHERITE_IRON, ModTags.UPGRADE_TO_NETHERITE_IRON, ModItems.NETHERITE_IRON_SPEAR);
        baseSmithingRecipe(output, ModTags.SPEAR_UPGRADE_TO_NETHERITE_GOLD, ModTags.UPGRADE_TO_NETHERITE_GOLD, ModItems.NETHERITE_GOLD_SPEAR);
        baseSmithingRecipe(output, ModTags.SPEAR_UPGRADE_TO_NETHERITE_EMERALD, ModTags.UPGRADE_TO_NETHERITE_EMERALD, ModItems.NETHERITE_EMERALD_SPEAR);
        baseSmithingRecipe(output, ModTags.SPEAR_UPGRADE_TO_NETHERITE_DIAMOND, ModTags.UPGRADE_TO_NETHERITE_DIAMOND, ModItems.NETHERITE_DIAMOND_SPEAR);

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
    public void baseSmithingRecipe(RecipeOutput output, TagKey<Item> ingredient, TagKey<Item> upgradeIngredient, Item result)
    {
        Identifier resultId = AdvancedNetherite.getRegistryHelper().getItemById(result);
        SmithingTransformRecipeBuilder.smithing(Ingredient.of(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE), tag(ingredient), tag(upgradeIngredient), RecipeCategory.MISC, result)
                .unlocks("has_ingredients", has(upgradeIngredient))
                .save(output, Identifier.fromNamespaceAndPath(resultId.getNamespace(), resultId.getPath() + "_smithing").toString());
    }

    /**
     * Base recipe for generating advanced netherite related ingots
     *
     * @param output Recipe output
     * @param ingotIngredient Base ingot
     * @param upgradeIngredient Additional ingredients
     * @param result Upgraded ingot
     */
    public void baseIngotRecipe(RecipeOutput output, TagKey<Item> ingotIngredient, TagKey<Item> upgradeIngredient, Item result)
    {
        ShapelessRecipeBuilder.shapeless(this.items, RecipeCategory.MISC, result)
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
    public void baseBlockRecipe(RecipeOutput output, ItemLike ingredient, Block result)
    {
        // Items to Block
        ShapedRecipeBuilder.shaped(this.items, RecipeCategory.BUILDING_BLOCKS, result)
                .define('#', ingredient)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .unlockedBy("has_" + ingredient.toString(), has(ingredient))
                .save(output);

        // Block to Items
        ShapelessRecipeBuilder.shapeless(this.items, RecipeCategory.MISC, ingredient, 9)
                .requires(result)
                .unlockedBy("has_" + result.toString(), has(result))
                .save(output, Identifier.parse(ingredient.toString() + "_from_block").toString());
    }

    // Other ingots are automatically included if they are added to the NETHERITE_INGOTS tag.
    private void lodestoneRecipe(RecipeOutput output)
    {
        Identifier lodestoneId = AdvancedNetherite.getRegistryHelper().getItemById(Items.LODESTONE);
        ShapedRecipeBuilder.shaped(this.items, RecipeCategory.MISC, Items.LODESTONE)
                .define('S', Items.CHISELED_STONE_BRICKS)
                .define('#', ModTags.NETHERITE_INGOTS)
                .pattern("SSS")
                .pattern("S#S")
                .pattern("SSS")
                .unlockedBy("has_chiseled_stone_bricks", has(Items.CHISELED_STONE_BRICKS))
                .unlockedBy("has_netherite_ingots", has(ModTags.NETHERITE_INGOTS))
                .save(output, Identifier.fromNamespaceAndPath(AdvancedNetherite.MOD_ID, lodestoneId.getPath()).toString());
    }

    public static MultiRegistryBootstrap create()
    {
        return new MultiRegistryBootstrap()
        {
            @Override
            public @NonNull Set<ResourceKey<? extends Registry<?>>> requestedRegistries()
            {
                return Set.of(Registries.RECIPE, Registries.ADVANCEMENT);
            }

            @Override
            public void run(MultiRegistryBootstrap.BootstrapGetter bootstrap)
            {
                new ModRecipeProvider(bootstrap.get(Registries.RECIPE), bootstrap.get(Registries.ADVANCEMENT)).buildRecipes();
            }
        };
    }
}
