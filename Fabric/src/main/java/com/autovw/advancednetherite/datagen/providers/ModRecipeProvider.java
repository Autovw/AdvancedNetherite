package com.autovw.advancednetherite.datagen.providers;

import com.autovw.advancednetherite.AdvancedNetherite;
import com.autovw.advancednetherite.core.ModBlocks;
import com.autovw.advancednetherite.core.ModItems;
import com.autovw.advancednetherite.core.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;

import java.util.function.Consumer;

/**
 * @author Autovw
 */
public class ModRecipeProvider extends FabricRecipeProvider
{
    public ModRecipeProvider(FabricDataOutput output)
    {
        super(output);
    }

    @Override
    public void buildRecipes(Consumer<FinishedRecipe> consumer)
    {
        /* Blocks */
        baseBlockRecipe(consumer, ModItems.NETHERITE_IRON_INGOT, ModBlocks.NETHERITE_IRON_BLOCK);
        baseBlockRecipe(consumer, ModItems.NETHERITE_GOLD_INGOT, ModBlocks.NETHERITE_GOLD_BLOCK);
        baseBlockRecipe(consumer, ModItems.NETHERITE_EMERALD_INGOT, ModBlocks.NETHERITE_EMERALD_BLOCK);
        baseBlockRecipe(consumer, ModItems.NETHERITE_DIAMOND_INGOT, ModBlocks.NETHERITE_DIAMOND_BLOCK);

        /* Ingots */
        baseIngotRecipe(consumer, ModTags.INGOTS_UPGRADE_TO_NETHERITE_IRON, Items.IRON_INGOT, ModItems.NETHERITE_IRON_INGOT);
        baseIngotRecipe(consumer, ModTags.INGOTS_UPGRADE_TO_NETHERITE_GOLD, Items.GOLD_INGOT, ModItems.NETHERITE_GOLD_INGOT);
        baseIngotRecipe(consumer, ModTags.INGOTS_UPGRADE_TO_NETHERITE_EMERALD, Items.EMERALD, ModItems.NETHERITE_EMERALD_INGOT);
        baseIngotRecipe(consumer, ModTags.INGOTS_UPGRADE_TO_NETHERITE_DIAMOND, Items.DIAMOND, ModItems.NETHERITE_DIAMOND_INGOT);

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

    public void baseSmithingRecipe(Consumer<FinishedRecipe> consumer, TagKey<Item> ingredient, TagKey<Item> upgradeIngredient, Item result)
    {
        LegacyUpgradeRecipeBuilder.smithing(Ingredient.of(ingredient), Ingredient.of(upgradeIngredient), RecipeCategory.MISC, result)
                .unlocks("has_ingredients", has(upgradeIngredient))
                .save(consumer, new ResourceLocation(AdvancedNetherite.getRegistryHelper().getItemById(result).getNamespace(), result.toString() + "_smithing"));
    }

    public void baseIngotRecipe(Consumer<FinishedRecipe> consumer, TagKey<Item> ingotIngredient, Item upgradeIngredient, Item result)
    {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, result)
                .requires(ingotIngredient)
                .requires(upgradeIngredient).requires(upgradeIngredient).requires(upgradeIngredient).requires(upgradeIngredient)
                .unlockedBy("has_" + upgradeIngredient.toString(), has(upgradeIngredient))
                .save(consumer, new ResourceLocation(AdvancedNetherite.getRegistryHelper().getItemById(result).getNamespace(), result.toString()));
    }

    public void baseBlockRecipe(Consumer<FinishedRecipe> consumer, ItemLike ingredient, Block result)
    {
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
                .save(consumer, new ResourceLocation(AdvancedNetherite.getRegistryHelper().getBlockById(result).getNamespace(), ingredient.toString() + "_from_block"));
    }

    private void lodestoneRecipe(Consumer<FinishedRecipe> consumer)
    {
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
