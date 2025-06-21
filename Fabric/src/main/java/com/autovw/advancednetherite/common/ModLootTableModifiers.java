package com.autovw.advancednetherite.common;

import com.autovw.advancednetherite.config.ConfigHelper;
import com.autovw.advancednetherite.core.util.ModTags;
import net.fabricmc.fabric.api.loot.v3.LootTableEvents;
import net.minecraft.advancements.critereon.*;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.component.predicates.DataComponentPredicates;
import net.minecraft.core.component.predicates.EnchantmentsPredicate;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.predicates.*;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;

import java.util.List;
import java.util.Optional;

/**
 * @author Autovw
 */
public final class ModLootTableModifiers
{
    private static final ResourceLocation WHEAT = ResourceLocation.withDefaultNamespace("blocks/wheat");
    private static final ResourceLocation CARROTS = ResourceLocation.withDefaultNamespace("blocks/carrots");
    private static final ResourceLocation POTATOES = ResourceLocation.withDefaultNamespace("blocks/potatoes");
    private static final ResourceLocation BEETROOTS = ResourceLocation.withDefaultNamespace("blocks/beetroots");
    private static final ResourceLocation PHANTOM = ResourceLocation.withDefaultNamespace("entities/phantom");
    private static final ResourceLocation ZOMBIFIED_PIGLIN = ResourceLocation.withDefaultNamespace("entities/zombified_piglin");
    private static final ResourceLocation PIGLIN = ResourceLocation.withDefaultNamespace("entities/piglin");
    private static final ResourceLocation ENDERMAN = ResourceLocation.withDefaultNamespace("entities/enderman");
    private static final ResourceLocation IRON_ORE = ResourceLocation.withDefaultNamespace("blocks/iron_ore");
    private static final ResourceLocation DEEPSLATE_IRON_ORE = ResourceLocation.withDefaultNamespace("blocks/deepslate_iron_ore");
    private static final ResourceLocation GOLD_ORE = ResourceLocation.withDefaultNamespace("blocks/gold_ore");
    private static final ResourceLocation DEEPSLATE_GOLD_ORE = ResourceLocation.withDefaultNamespace("blocks/deepslate_gold_ore");
    private static final ResourceLocation EMERALD_ORE = ResourceLocation.withDefaultNamespace("blocks/emerald_ore");
    private static final ResourceLocation DEEPSLATE_EMERALD_ORE = ResourceLocation.withDefaultNamespace("blocks/deepslate_emerald_ore");
    private static final ResourceLocation DIAMOND_ORE = ResourceLocation.withDefaultNamespace("blocks/diamond_ore");
    private static final ResourceLocation DEEPSLATE_DIAMOND_ORE = ResourceLocation.withDefaultNamespace("blocks/deepslate_diamond_ore");
    private static final ResourceLocation NETHER_GOLD_ORE = ResourceLocation.withDefaultNamespace("blocks/netherite_gold_ore");

    public static void modifyTables()
    {
        LootTableEvents.MODIFY.register(((key, tableBuilder, source, provider) ->
        {
            ResourceLocation id = key.location();
            HolderLookup.RegistryLookup<Item> registryLookup = provider.lookupOrThrow(Registries.ITEM);
            // ADDITIONAL CROP DROPS START //
            if (source.isBuiltin() && id.equals(WHEAT))
            {
                LootPool.Builder pool = cropDropPool(registryLookup, Blocks.WHEAT, BlockStateProperties.AGE_7, (float) ConfigHelper.get().getServer().getAdditionalDropProperties().getAdditionalWheatDropChance(), Items.WHEAT, 0, 2);
                tableBuilder.withPool(pool);
            }

            if (source.isBuiltin() && id.equals(CARROTS))
            {
                LootPool.Builder pool = cropDropPool(registryLookup, Blocks.CARROTS, BlockStateProperties.AGE_7, (float) ConfigHelper.get().getServer().getAdditionalDropProperties().getAdditionalCarrotsDropChance(), Items.CARROT, 0, 2);
                tableBuilder.withPool(pool);
            }

            if (source.isBuiltin() && id.equals(POTATOES))
            {
                LootPool.Builder pool = cropDropPool(registryLookup, Blocks.POTATOES, BlockStateProperties.AGE_7, (float) ConfigHelper.get().getServer().getAdditionalDropProperties().getAdditionalPotatoesDropChance(), Items.POTATO, 0, 1);
                tableBuilder.withPool(pool);
            }

            if (source.isBuiltin() && id.equals(BEETROOTS))
            {
                LootPool.Builder pool = cropDropPool(registryLookup, Blocks.BEETROOTS, BlockStateProperties.AGE_3, (float) ConfigHelper.get().getServer().getAdditionalDropProperties().getAdditionalBeetrootsDropChance(), Items.BEETROOT, 1, 2);
                tableBuilder.withPool(pool);
            }
            // ADDITIONAL CROP DROPS END //

            // ADDITIONAL MOB DROPS START //
            if (source.isBuiltin() && id.equals(PHANTOM))
            {
                LootPool.Builder pool = mobDropPool(registryLookup, (float) ConfigHelper.get().getServer().getAdditionalDropProperties().getAdditionalPhantomDropChance(), Items.PHANTOM_MEMBRANE, 0, 2, ModTags.DROPS_ADDITIONAL_PHANTOM_LOOT);
                tableBuilder.withPool(pool);
            }

            if (source.isBuiltin() && id.equals(ZOMBIFIED_PIGLIN))
            {
                LootPool.Builder pool = mobDropPool(registryLookup, (float) ConfigHelper.get().getServer().getAdditionalDropProperties().getAdditionalZombifiedPiglinDropChance(), Items.GOLD_NUGGET, 0, 3, ModTags.DROPS_ADDITIONAL_ZOMBIFIED_PIGLIN_LOOT);
                tableBuilder.withPool(pool);
            }

            if (source.isBuiltin() && id.equals(PIGLIN))
            {
                LootPool.Builder pool = mobDropPool(registryLookup, (float) ConfigHelper.get().getServer().getAdditionalDropProperties().getAdditionalPiglinDropChance(), Items.GOLD_INGOT, 1, 1, ModTags.DROPS_ADDITIONAL_PIGLIN_LOOT);
                tableBuilder.withPool(pool);
            }

            if (source.isBuiltin() && id.equals(ENDERMAN))
            {
                LootPool.Builder pool = mobDropPool(registryLookup, (float) ConfigHelper.get().getServer().getAdditionalDropProperties().getAdditionalEndermanDropChance(), Items.ENDER_PEARL, 0, 1, ModTags.DROPS_ADDITIONAL_ENDERMAN_LOOT);
                tableBuilder.withPool(pool);
            }
            // ADDITIONAL MOB DROPS END //

            // ADDITIONAL ORE DROPS START //
            if (source.isBuiltin() && (id.equals(IRON_ORE) || id.equals(DEEPSLATE_IRON_ORE)))
            {
                LootPool.Builder pool = oreDropPool(provider, (float) ConfigHelper.get().getServer().getAdditionalDropProperties().getAdditionalRawIronDropChance(), Items.RAW_IRON, 1, 2, ModTags.DROPS_ADDITIONAL_IRON);
                tableBuilder.withPool(pool);
            }

            if (source.isBuiltin() && (id.equals(GOLD_ORE) || id.equals(DEEPSLATE_GOLD_ORE)))
            {
                LootPool.Builder pool = oreDropPool(provider, (float) ConfigHelper.get().getServer().getAdditionalDropProperties().getAdditionalRawGoldDropChance(), Items.RAW_GOLD, 1, 1, ModTags.DROPS_ADDITIONAL_GOLD);
                tableBuilder.withPool(pool);
            }

            if (source.isBuiltin() && (id.equals(EMERALD_ORE) || id.equals(DEEPSLATE_EMERALD_ORE)))
            {
                LootPool.Builder pool = oreDropPool(provider, (float) ConfigHelper.get().getServer().getAdditionalDropProperties().getAdditionalEmeraldDropChance(), Items.EMERALD, 1, 1, ModTags.DROPS_ADDITIONAL_EMERALD);
                tableBuilder.withPool(pool);
            }

            if (source.isBuiltin() && (id.equals(DIAMOND_ORE) || id.equals(DEEPSLATE_DIAMOND_ORE)))
            {
                LootPool.Builder pool = oreDropPool(provider, (float) ConfigHelper.get().getServer().getAdditionalDropProperties().getAdditionalDiamondDropChance(), Items.DIAMOND, 1, 1, ModTags.DROPS_ADDITIONAL_DIAMOND);
                tableBuilder.withPool(pool);
            }

            if (source.isBuiltin() && id.equals(NETHER_GOLD_ORE))
            {
                LootPool.Builder pool = oreDropPool(provider, (float) ConfigHelper.get().getServer().getAdditionalDropProperties().getAdditionalGoldNuggetDropChance(), Items.GOLD_NUGGET, 1, 3, ModTags.DROPS_ADDITIONAL_GOLD);
                tableBuilder.withPool(pool);
            }
            // ADDITIONAL ORE DROPS END //
        }));
    }

    private static LootPool.Builder cropDropPool(HolderLookup.RegistryLookup<Item> registryLookup, Block cropBlock, Property<?> ageProperty, float dropChance, ItemLike dropItem, int minDrop, int maxDrop)
    {
        String maxAge = String.valueOf(((CropBlock) cropBlock).getMaxAge());
        return LootPool.lootPool()
            .when(LootItemBlockStatePropertyCondition.hasBlockStateProperties(cropBlock).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(ageProperty, maxAge)))
            .when(MatchTool.toolMatches(ItemPredicate.Builder.item().of(registryLookup, ModTags.DROPS_ADDITIONAL_CROPS)))
            .when(LootItemRandomChanceCondition.randomChance(dropChance))
            .add(LootItem.lootTableItem(dropItem))
            .apply(SetItemCountFunction.setCount(UniformGenerator.between(minDrop, maxDrop)).build());
    }

    private static LootPool.Builder mobDropPool(HolderLookup.RegistryLookup<Item> registryLookup, float dropChance, Item dropItem, int minDrop, int maxDrop, TagKey<Item> toolTag)
    {
        ItemPredicate mainHandItemPredicate = ItemPredicate.Builder.item().of(registryLookup, toolTag).build();
        EntityEquipmentPredicate equipmentPredicate = new EntityEquipmentPredicate(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.of(mainHandItemPredicate), Optional.empty());
        return LootPool.lootPool()
                .when(LootItemEntityPropertyCondition.hasProperties(LootContext.EntityTarget.ATTACKER, EntityPredicate.Builder.entity().equipment(equipmentPredicate)))
                .when(LootItemRandomChanceCondition.randomChance(dropChance))
                .add(LootItem.lootTableItem(dropItem))
                .apply(SetItemCountFunction.setCount(UniformGenerator.between(minDrop, maxDrop)).build());
    }

    private static LootPool.Builder oreDropPool(HolderLookup.Provider registryProvider, float dropChance, Item dropItem, int minDrop, int maxDrop, TagKey<Item> toolTag)
    {
        HolderLookup.RegistryLookup<Item> registryLookup = registryProvider.lookupOrThrow(Registries.ITEM);
        HolderLookup.RegistryLookup<Enchantment> enchantmentLookup = registryProvider.lookupOrThrow(Registries.ENCHANTMENT);
        return LootPool.lootPool()
                .when(MatchTool.toolMatches(ItemPredicate.Builder.item().of(registryLookup, toolTag)))
                .when(InvertedLootItemCondition.invert(
                        MatchTool.toolMatches(
                                ItemPredicate.Builder.item()
                                        .withComponents(DataComponentMatchers.Builder.components()
                                                .partial(DataComponentPredicates.ENCHANTMENTS, EnchantmentsPredicate.enchantments(
                                                        List.of(new EnchantmentPredicate(enchantmentLookup.getOrThrow(Enchantments.SILK_TOUCH), MinMaxBounds.Ints.atLeast(1)))
                                                )).build())
                )))
                .when(LootItemRandomChanceCondition.randomChance(dropChance))
                .add(LootItem.lootTableItem(dropItem))
                .apply(SetItemCountFunction.setCount(UniformGenerator.between(minDrop, maxDrop)).build());
    }
}
