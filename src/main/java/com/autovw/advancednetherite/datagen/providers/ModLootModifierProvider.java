package com.autovw.advancednetherite.datagen.providers;

import com.autovw.advancednetherite.common.loot.CropDropsLootModifier;
import com.autovw.advancednetherite.common.loot.MobDropsLootModifier;
import com.autovw.advancednetherite.common.loot.OreDropsLootModifier;
import com.autovw.advancednetherite.core.registry.ModItems;
import com.autovw.advancednetherite.core.registry.ModLootModifiers;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.DataGenerator;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemKilledByPlayerCondition;
import net.minecraft.world.level.storage.loot.predicates.MatchTool;
import net.minecraftforge.common.data.GlobalLootModifierProvider;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.List;

/**
 * Author: Autovw
 */
public class ModLootModifierProvider extends GlobalLootModifierProvider {
    private final List<Item> HOE_ITEMS = List.of(ModItems.NETHERITE_IRON_HOE.get(), ModItems.NETHERITE_GOLD_HOE.get(), ModItems.NETHERITE_EMERALD_HOE.get(), ModItems.NETHERITE_DIAMOND_HOE.get());

    public ModLootModifierProvider(DataGenerator gen, String modId) {
        super(gen, modId);
    }

    @Override
    protected void start() {
        // stone ores
        addOreDrop(ModLootModifiers.DIAMOND_ORE_ADDITION.get(), Blocks.DIAMOND_ORE, ModItems.NETHERITE_DIAMOND_PICKAXE.get(), Items.DIAMOND, 0.25f, 1, 1);
        addOreDrop(ModLootModifiers.EMERALD_ORE_ADDITION.get(), Blocks.EMERALD_ORE, ModItems.NETHERITE_EMERALD_PICKAXE.get(), Items.EMERALD, 0.4f, 1, 1);
        addOreDrop(ModLootModifiers.GOLD_ORE_ADDITION.get(), Blocks.GOLD_ORE, ModItems.NETHERITE_GOLD_PICKAXE.get(), Items.RAW_GOLD, 0.3f, 1, 1);
        addOreDrop(ModLootModifiers.IRON_ORE_ADDITION.get(), Blocks.IRON_ORE, ModItems.NETHERITE_IRON_PICKAXE.get(), Items.RAW_IRON, 0.2f, 1, 2);

        // deepslate ores
        addOreDrop(ModLootModifiers.DEEPSLATE_DIAMOND_ORE_ADDITION.get(), Blocks.DEEPSLATE_DIAMOND_ORE, ModItems.NETHERITE_DIAMOND_PICKAXE.get(), Items.DIAMOND, 0.25f, 1, 1);
        addOreDrop(ModLootModifiers.DEEPSLATE_EMERALD_ORE_ADDITION.get(), Blocks.DEEPSLATE_EMERALD_ORE, ModItems.NETHERITE_EMERALD_PICKAXE.get(), Items.EMERALD, 0.4f, 1, 1);
        addOreDrop(ModLootModifiers.DEEPSLATE_GOLD_ORE_ADDITION.get(), Blocks.DEEPSLATE_GOLD_ORE, ModItems.NETHERITE_GOLD_PICKAXE.get(), Items.RAW_GOLD, 0.3f, 1, 1);
        addOreDrop(ModLootModifiers.DEEPSLATE_IRON_ORE_ADDITION.get(), Blocks.DEEPSLATE_IRON_ORE, ModItems.NETHERITE_IRON_PICKAXE.get(), Items.RAW_IRON, 0.2f, 1, 2);

        // nether ores
        addOreDrop(ModLootModifiers.NETHER_GOLD_ORE_ADDITION.get(), Blocks.NETHER_GOLD_ORE, ModItems.NETHERITE_GOLD_PICKAXE.get(), Items.GOLD_NUGGET, 0.6f, 1, 3);

        // entities
        addMobDrop(ModLootModifiers.PHANTOM_ADDITION.get(), EntityType.PHANTOM, Items.PHANTOM_MEMBRANE, 0.5f, 0, 2, ModItems.NETHERITE_IRON_SWORD.get());
        addMobDrop(ModLootModifiers.ZOMBIFIED_PIGLIN_ADDITION.get(), EntityType.ZOMBIFIED_PIGLIN, Items.GOLD_NUGGET, 0.5f, 0, 3, ModItems.NETHERITE_GOLD_SWORD.get(), ModItems.NETHERITE_DIAMOND_SWORD.get());
        addMobDrop(ModLootModifiers.PIGLIN_ADDITION.get(), EntityType.PIGLIN, Items.GOLD_INGOT, 0.15f, 1, 1, ModItems.NETHERITE_GOLD_SWORD.get(), ModItems.NETHERITE_DIAMOND_SWORD.get());
        addMobDrop(ModLootModifiers.ENDERMAN_ADDITION.get(), EntityType.ENDERMAN, Items.ENDER_PEARL, 0.3f, 0, 1, ModItems.NETHERITE_EMERALD_SWORD.get(), ModItems.NETHERITE_DIAMOND_SWORD.get());

        // crops
        addCropDrop(ModLootModifiers.WHEAT_ADDITION.get(), Blocks.WHEAT, HOE_ITEMS, Items.WHEAT, 0.4f, 0, 2);
        addCropDrop(ModLootModifiers.CARROTS_ADDITION.get(), Blocks.CARROTS, HOE_ITEMS, Items.CARROT, 0.3f, 0, 2);
        addCropDrop(ModLootModifiers.POTATOES_ADDITION.get(), Blocks.POTATOES, HOE_ITEMS, Items.POTATO, 0.3f, 0, 1);
        addCropDrop(ModLootModifiers.BEETROOTS_ADDITION.get(), Blocks.BEETROOTS, HOE_ITEMS, Items.BEETROOT, 0.2f, 1, 2);
    }

    protected void addOreDrop(OreDropsLootModifier.Serializer serializer, Block lootTarget, Item pickaxe, Item bonusAddition, float additionChance, int minAddition, int maxAddition) {
        String name = "blocks/" + ForgeRegistries.BLOCKS.getKey(lootTarget).getPath() + "_addition";
        add(name, serializer, new OreDropsLootModifier(new LootItemCondition[] {
                MatchTool.toolMatches(ItemPredicate.Builder.item().of(pickaxe)).build(),
                LootItemBlockStatePropertyCondition.hasBlockStateProperties(lootTarget).build()
        }, bonusAddition, additionChance, minAddition, maxAddition));
    }

    protected void addMobDrop(MobDropsLootModifier.Serializer serializer, EntityType<?> lootTarget, Item bonusAddition, float additionChance, int minAddition, int maxAddition, Item... weapons) {
        String name = "entities/" + ForgeRegistries.ENTITIES.getKey(lootTarget).getPath() + "_addition";
        add(name, serializer, new MobDropsLootModifier(new LootItemCondition[] {
                LootItemKilledByPlayerCondition.killedByPlayer().build()
        }, lootTarget, List.of(weapons), bonusAddition, additionChance, minAddition, maxAddition));
    }

    protected void addCropDrop(CropDropsLootModifier.Serializer serializer, Block lootTarget, List<Item> tools, Item bonusAddition, float additionChance, int minAddition, int maxAddition) {
        String name = "blocks/" + ForgeRegistries.BLOCKS.getKey(lootTarget).getPath() + "_addition";
        add(name, serializer, new CropDropsLootModifier(new LootItemCondition[] {
                MatchTool.toolMatches(ItemPredicate.Builder.item().of(tools.toArray(Item[]::new))).build(),
                LootItemBlockStatePropertyCondition.hasBlockStateProperties(lootTarget).build()
        }, bonusAddition, additionChance, minAddition, maxAddition));
    }
}
