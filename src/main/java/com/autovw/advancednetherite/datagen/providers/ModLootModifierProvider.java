package com.autovw.advancednetherite.datagen.providers;

import com.autovw.advancednetherite.Reference;
import com.autovw.advancednetherite.common.loot.MobDropsLootModifier;
import com.autovw.advancednetherite.common.loot.OreDropsLootModifier;
import com.autovw.advancednetherite.core.ModItems;
import net.minecraft.advancements.criterion.ItemPredicate;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.entity.EntityType;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.loot.conditions.BlockStateProperty;
import net.minecraft.loot.conditions.ILootCondition;
import net.minecraft.loot.conditions.KilledByPlayer;
import net.minecraft.loot.conditions.MatchTool;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.data.GlobalLootModifierProvider;

import java.util.*;

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
        addOreDrop(Reference.MOD_ID, Blocks.DIAMOND_ORE, ModItems.NETHERITE_DIAMOND_PICKAXE.get(), Items.DIAMOND, 0.25f);
        addOreDrop(Reference.MOD_ID, Blocks.EMERALD_ORE, ModItems.NETHERITE_EMERALD_PICKAXE.get(), Items.EMERALD, 0.4f);
        addOreDrop(Reference.MOD_ID, Blocks.GOLD_ORE, ModItems.NETHERITE_GOLD_PICKAXE.get(), Items.GOLD_NUGGET, 0.3f);
        addOreDrop(Reference.MOD_ID, Blocks.IRON_ORE, ModItems.NETHERITE_IRON_PICKAXE.get(), Items.IRON_NUGGET, 0.2f);

        // nether ores
        addOreDrop(Reference.MOD_ID, Blocks.NETHER_GOLD_ORE, ModItems.NETHERITE_GOLD_PICKAXE.get(), Items.GOLD_NUGGET, 0.6f);

        // entities
        addMobDrop(Reference.MOD_ID, EntityType.PHANTOM, Items.PHANTOM_MEMBRANE, 0.5f, 0, 2, ModItems.NETHERITE_IRON_SWORD.get());
        addMobDrop(Reference.MOD_ID, EntityType.ZOMBIFIED_PIGLIN, Items.GOLD_NUGGET, 0.5f, 0, 3, ModItems.NETHERITE_GOLD_SWORD.get(), ModItems.NETHERITE_DIAMOND_SWORD.get());
        addMobDrop(Reference.MOD_ID, EntityType.PIGLIN, Items.GOLD_INGOT, 0.15f, 1, 1, ModItems.NETHERITE_GOLD_SWORD.get(), ModItems.NETHERITE_DIAMOND_SWORD.get());
        addMobDrop(Reference.MOD_ID, EntityType.ENDERMAN, Items.ENDER_PEARL, 0.3f, 0, 1, ModItems.NETHERITE_EMERALD_SWORD.get(), ModItems.NETHERITE_DIAMOND_SWORD.get());
    }

    protected void addOreDrop(String modId, Block lootTarget, Item pickaxe, Item bonusAddition, float additionChance) {
        String name = "blocks/" + lootTarget.getRegistryName().getPath() + "_addition";
        add(name, new OreDropsLootModifier.Serializer().setRegistryName(new ResourceLocation(modId, name)), new OreDropsLootModifier(new ILootCondition[] {
                MatchTool.toolMatches(ItemPredicate.Builder.item().of(pickaxe)).build(),
                BlockStateProperty.hasBlockStateProperties(lootTarget).build()
        }, bonusAddition, additionChance));
    }

    protected void addMobDrop(String modId, EntityType<?> lootTarget, Item bonusAddition, float additionChance, int minAddition, int maxAddition, Item... weapons) {
        String name = "entities/" + lootTarget.getRegistryName().getPath() + "_addition";
        add(name, new MobDropsLootModifier.Serializer().setRegistryName(new ResourceLocation(modId, name)), new MobDropsLootModifier(new ILootCondition[] {
                KilledByPlayer.killedByPlayer().build()
        }, Arrays.asList(weapons), bonusAddition, additionChance, minAddition, maxAddition));
    }
}
