package com.autovw.advancednetherite.common;

import com.autovw.advancednetherite.config.ConfigHelper;
import com.autovw.advancednetherite.core.ModItems;
import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.advancements.critereon.StatePropertiesPredicate;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.minecraft.world.level.storage.loot.predicates.MatchTool;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;

/**
 * @author Autovw
 */
public final class ModLootTableModifiers
{
    private static final Item[] HOE_ITEMS = { ModItems.NETHERITE_IRON_HOE, ModItems.NETHERITE_GOLD_HOE, ModItems.NETHERITE_EMERALD_HOE, ModItems.NETHERITE_DIAMOND_HOE };
    private static final ResourceLocation WHEAT = new ResourceLocation("blocks/wheat");
    private static final ResourceLocation CARROTS = new ResourceLocation("blocks/carrots");
    private static final ResourceLocation POTATOES = new ResourceLocation("blocks/potatoes");
    private static final ResourceLocation BEETROOTS = new ResourceLocation("blocks/beetroots");
    private static final ResourceLocation PHANTOM = new ResourceLocation("entities/phantom");
    private static final ResourceLocation ZOMBIFIED_PIGLIN = new ResourceLocation("entities/zombified_piglin");
    private static final ResourceLocation PIGLIN = new ResourceLocation("entities/piglin");
    private static final ResourceLocation ENDERMAN = new ResourceLocation("entities/enderman");
    private static final ResourceLocation IRON_ORE = new ResourceLocation("blocks/iron_ore");
    private static final ResourceLocation DEEPSLATE_IRON_ORE = new ResourceLocation("blocks/deepslate_iron_ore");
    private static final ResourceLocation GOLD_ORE = new ResourceLocation("blocks/gold_ore");
    private static final ResourceLocation DEEPSLATE_GOLD_ORE = new ResourceLocation("blocks/deepslate_gold_ore");
    private static final ResourceLocation EMERALD_ORE = new ResourceLocation("blocks/emerald_ore");
    private static final ResourceLocation DEEPSLATE_EMERALD_ORE = new ResourceLocation("blocks/deepslate_emerald_ore");
    private static final ResourceLocation DIAMOND_ORE = new ResourceLocation("blocks/diamond_ore");
    private static final ResourceLocation DEEPSLATE_DIAMOND_ORE = new ResourceLocation("blocks/deepslate_diamond_ore");
    private static final ResourceLocation NETHER_GOLD_ORE = new ResourceLocation("blocks/netherite_gold_ore");

    public static void modifyTables()
    {
        LootTableEvents.MODIFY.register(((resourceManager, lootManager, id, tableBuilder, source) ->
        {
            // ADDITIONAL CROP DROPS START //
            if (source.isBuiltin() && id.equals(WHEAT))
            {
                LootPool.Builder pool = cropDropPool(Blocks.WHEAT, BlockStateProperties.AGE_7, (float) ConfigHelper.get().getServer().getAdditionalDropProperties().getAdditionalWheatDropChance(), Items.WHEAT, 0, 2);
                tableBuilder.withPool(pool);
            }

            if (source.isBuiltin() && id.equals(CARROTS))
            {
                LootPool.Builder pool = cropDropPool(Blocks.CARROTS, BlockStateProperties.AGE_7, (float) ConfigHelper.get().getServer().getAdditionalDropProperties().getAdditionalCarrotsDropChance(), Items.CARROT, 0, 2);
                tableBuilder.withPool(pool);
            }

            if (source.isBuiltin() && id.equals(POTATOES))
            {
                LootPool.Builder pool = cropDropPool(Blocks.POTATOES, BlockStateProperties.AGE_7, (float) ConfigHelper.get().getServer().getAdditionalDropProperties().getAdditionalPotatoesDropChance(), Items.POTATO, 0, 1);
                tableBuilder.withPool(pool);
            }

            if (source.isBuiltin() && id.equals(BEETROOTS))
            {
                LootPool.Builder pool = cropDropPool(Blocks.BEETROOTS, BlockStateProperties.AGE_3, (float) ConfigHelper.get().getServer().getAdditionalDropProperties().getAdditionalBeetrootsDropChance(), Items.BEETROOT, 1, 2);
                tableBuilder.withPool(pool);
            }
            // ADDITIONAL CROP DROPS END //

            // ADDITIONAL MOB DROPS START //
            if (source.isBuiltin() && id.equals(PHANTOM))
            {
                LootPool.Builder pool = mobDropPool((float) ConfigHelper.get().getServer().getAdditionalDropProperties().getAdditionalPhantomDropChance(), Items.PHANTOM_MEMBRANE, 0, 2, ModItems.NETHERITE_IRON_SWORD);
                tableBuilder.withPool(pool);
            }

            if (source.isBuiltin() && id.equals(ZOMBIFIED_PIGLIN))
            {
                LootPool.Builder pool = mobDropPool((float) ConfigHelper.get().getServer().getAdditionalDropProperties().getAdditionalZombifiedPiglinDropChance(), Items.GOLD_NUGGET, 0, 3, ModItems.NETHERITE_GOLD_SWORD, ModItems.NETHERITE_DIAMOND_SWORD);
                tableBuilder.withPool(pool);
            }

            if (source.isBuiltin() && id.equals(PIGLIN))
            {
                LootPool.Builder pool = mobDropPool((float) ConfigHelper.get().getServer().getAdditionalDropProperties().getAdditionalPiglinDropChance(), Items.GOLD_INGOT, 1, 1, ModItems.NETHERITE_GOLD_SWORD, ModItems.NETHERITE_DIAMOND_SWORD);
                tableBuilder.withPool(pool);
            }

            if (source.isBuiltin() && id.equals(ENDERMAN))
            {
                LootPool.Builder pool = mobDropPool((float) ConfigHelper.get().getServer().getAdditionalDropProperties().getAdditionalEndermanDropChance(), Items.ENDER_PEARL, 0, 1, ModItems.NETHERITE_EMERALD_SWORD, ModItems.NETHERITE_DIAMOND_SWORD);
                tableBuilder.withPool(pool);
            }
            // ADDITIONAL MOB DROPS END //

            // ADDITIONAL ORE DROPS START //
            if (source.isBuiltin() && (id.equals(IRON_ORE) || id.equals(DEEPSLATE_IRON_ORE)))
            {
                LootPool.Builder pool = oreDropPool((float) ConfigHelper.get().getServer().getAdditionalDropProperties().getAdditionalRawIronDropChance(), Items.RAW_IRON, 1, 2, ModItems.NETHERITE_IRON_PICKAXE);
                tableBuilder.withPool(pool);
            }

            if (source.isBuiltin() && (id.equals(GOLD_ORE) || id.equals(DEEPSLATE_GOLD_ORE)))
            {
                LootPool.Builder pool = oreDropPool((float) ConfigHelper.get().getServer().getAdditionalDropProperties().getAdditionalRawGoldDropChance(), Items.RAW_GOLD, 1, 1, ModItems.NETHERITE_GOLD_PICKAXE);
                tableBuilder.withPool(pool);
            }

            if (source.isBuiltin() && (id.equals(EMERALD_ORE) || id.equals(DEEPSLATE_EMERALD_ORE)))
            {
                LootPool.Builder pool = oreDropPool((float) ConfigHelper.get().getServer().getAdditionalDropProperties().getAdditionalEmeraldDropChance(), Items.EMERALD, 1, 1, ModItems.NETHERITE_EMERALD_PICKAXE);
                tableBuilder.withPool(pool);
            }

            if (source.isBuiltin() && (id.equals(DIAMOND_ORE) || id.equals(DEEPSLATE_DIAMOND_ORE)))
            {
                LootPool.Builder pool = oreDropPool((float) ConfigHelper.get().getServer().getAdditionalDropProperties().getAdditionalDiamondDropChance(), Items.DIAMOND, 1, 1, ModItems.NETHERITE_DIAMOND_PICKAXE);
                tableBuilder.withPool(pool);
            }

            if (source.isBuiltin() && id.equals(NETHER_GOLD_ORE))
            {
                LootPool.Builder pool = oreDropPool((float) ConfigHelper.get().getServer().getAdditionalDropProperties().getAdditionalGoldNuggetDropChance(), Items.GOLD_NUGGET, 1, 3, ModItems.NETHERITE_GOLD_PICKAXE);
                tableBuilder.withPool(pool);
            }
            // ADDITIONAL ORE DROPS END //
        }));
    }

    private static LootPool.Builder cropDropPool(Block cropBlock, Property<?> ageProperty, float dropChance, ItemLike dropItem, int minDrop, int maxDrop)
    {
        String maxAge = String.valueOf(((CropBlock) cropBlock).getMaxAge());
        return LootPool.lootPool()
            .when(LootItemBlockStatePropertyCondition.hasBlockStateProperties(cropBlock).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(ageProperty, maxAge)))
            .when(MatchTool.toolMatches(ItemPredicate.Builder.item().of(HOE_ITEMS)))
            .when(LootItemRandomChanceCondition.randomChance(dropChance))
            .add(LootItem.lootTableItem(dropItem))
            .apply(SetItemCountFunction.setCount(UniformGenerator.between(minDrop, maxDrop)).build());
    }

    private static LootPool.Builder mobDropPool(float dropChance, Item dropItem, int minDrop, int maxDrop, ItemLike... tools)
    {
        return LootPool.lootPool()
                .when(MatchTool.toolMatches(ItemPredicate.Builder.item().of(tools)))
                .when(LootItemRandomChanceCondition.randomChance(dropChance))
                .add(LootItem.lootTableItem(dropItem))
                .apply(SetItemCountFunction.setCount(UniformGenerator.between(minDrop, maxDrop)).build());
    }

    private static LootPool.Builder oreDropPool(float dropChance, Item dropItem, int minDrop, int maxDrop, ItemLike... tools)
    {
        return LootPool.lootPool()
                .when(MatchTool.toolMatches(ItemPredicate.Builder.item().of(tools)))
                .when(LootItemRandomChanceCondition.randomChance(dropChance))
                .add(LootItem.lootTableItem(dropItem))
                .apply(SetItemCountFunction.setCount(UniformGenerator.between(minDrop, maxDrop)).build());
    }
}
