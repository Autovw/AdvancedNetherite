package com.autovw.advancednetherite.datagen.providers;

import com.autovw.advancednetherite.Reference;
import com.autovw.advancednetherite.common.loot.MobDropsLootModifier;
import com.autovw.advancednetherite.common.loot.OreDropsLootModifier;
import com.autovw.advancednetherite.core.ModItems;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.monster.Phantom;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemKilledByPlayerCondition;
import net.minecraft.world.level.storage.loot.predicates.MatchTool;
import net.minecraftforge.common.data.GlobalLootModifierProvider;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Autovw
 */
public class ModLootModifierProvider extends GlobalLootModifierProvider {
    public ModLootModifierProvider(DataGenerator gen, String modId) {
        super(gen, modId);
    }

    @Override
    protected void start() {
        // stone ores
        addOreDrop(Reference.MOD_ID, Blocks.DIAMOND_ORE, ModItems.NETHERITE_DIAMOND_PICKAXE.get(), Items.DIAMOND, 0.25f, 1, 1);
        addOreDrop(Reference.MOD_ID, Blocks.EMERALD_ORE, ModItems.NETHERITE_EMERALD_PICKAXE.get(), Items.EMERALD, 0.4f, 1, 1);
        addOreDrop(Reference.MOD_ID, Blocks.GOLD_ORE, ModItems.NETHERITE_GOLD_PICKAXE.get(), Items.RAW_GOLD, 0.3f, 1, 1);
        addOreDrop(Reference.MOD_ID, Blocks.IRON_ORE, ModItems.NETHERITE_IRON_PICKAXE.get(), Items.RAW_IRON, 0.2f, 1, 1);

        // deepslate ores
        addOreDrop(Reference.MOD_ID, Blocks.DEEPSLATE_DIAMOND_ORE, ModItems.NETHERITE_DIAMOND_PICKAXE.get(), Items.DIAMOND, 0.25f, 1, 1);
        addOreDrop(Reference.MOD_ID, Blocks.DEEPSLATE_EMERALD_ORE, ModItems.NETHERITE_EMERALD_PICKAXE.get(), Items.EMERALD, 0.4f, 1, 1);
        addOreDrop(Reference.MOD_ID, Blocks.DEEPSLATE_GOLD_ORE, ModItems.NETHERITE_GOLD_PICKAXE.get(), Items.RAW_GOLD, 0.3f, 1, 1);
        addOreDrop(Reference.MOD_ID, Blocks.DEEPSLATE_IRON_ORE, ModItems.NETHERITE_IRON_PICKAXE.get(), Items.RAW_IRON, 0.2f, 1, 1);

        // nether ores
        addOreDrop(Reference.MOD_ID, Blocks.NETHER_GOLD_ORE, ModItems.NETHERITE_GOLD_PICKAXE.get(), Items.GOLD_NUGGET, 0.6f, 1, 3);

        // entities
        addMobDrop(Reference.MOD_ID, EntityType.PHANTOM, Items.PHANTOM_MEMBRANE, 0.5f, 0, 2, ModItems.NETHERITE_IRON_SWORD.get());
        addMobDrop(Reference.MOD_ID, EntityType.ZOMBIFIED_PIGLIN, Items.GOLD_NUGGET, 0.5f, 0, 3, ModItems.NETHERITE_GOLD_SWORD.get(), ModItems.NETHERITE_DIAMOND_SWORD.get());
        addMobDrop(Reference.MOD_ID, EntityType.PIGLIN, Items.GOLD_INGOT, 0.15f, 1, 1, ModItems.NETHERITE_GOLD_SWORD.get(), ModItems.NETHERITE_DIAMOND_SWORD.get());
        addMobDrop(Reference.MOD_ID, EntityType.ENDERMAN, Items.ENDER_PEARL, 0.3f, 0, 1, ModItems.NETHERITE_EMERALD_SWORD.get(), ModItems.NETHERITE_DIAMOND_SWORD.get());
    }

    protected void addOreDrop(String modId, Block lootTarget, Item pickaxe, Item bonusAddition, float additionChance, int minAddition, int maxAddition) {
        String name = "blocks/" + lootTarget.getRegistryName().getPath() + "_addition";
        add(name, new OreDropsLootModifier.Serializer().setRegistryName(new ResourceLocation(modId, name)), new OreDropsLootModifier(new LootItemCondition[] {
                MatchTool.toolMatches(ItemPredicate.Builder.item().of(pickaxe)).build(),
                LootItemBlockStatePropertyCondition.hasBlockStateProperties(lootTarget).build()
        }, bonusAddition, additionChance, minAddition, maxAddition));
    }

    protected void addMobDrop(String modId, EntityType<?> lootTarget, Item bonusAddition, float additionChance, int minAddition, int maxAddition, Item... weapons) {
        String name = "entities/" + lootTarget.getRegistryName().getPath() + "_addition";
        add(name, new MobDropsLootModifier.Serializer().setRegistryName(new ResourceLocation(modId, name)), new MobDropsLootModifier(new LootItemCondition[] {
                LootItemKilledByPlayerCondition.killedByPlayer().build()
        }, List.of(weapons), bonusAddition, additionChance, minAddition, maxAddition));
    }
}
