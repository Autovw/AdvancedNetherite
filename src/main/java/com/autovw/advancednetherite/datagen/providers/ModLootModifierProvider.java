package com.autovw.advancednetherite.datagen.providers;

import com.autovw.advancednetherite.Reference;
import com.autovw.advancednetherite.common.loot.OreDropsLootModifier;
import com.autovw.advancednetherite.core.ModItems;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.MatchTool;
import net.minecraftforge.common.data.GlobalLootModifierProvider;

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
        addOreDrop(Reference.MOD_ID, Blocks.GOLD_ORE, ModItems.NETHERITE_GOLD_PICKAXE.get(), Items.RAW_GOLD, 0.3f);
        addOreDrop(Reference.MOD_ID, Blocks.IRON_ORE, ModItems.NETHERITE_IRON_PICKAXE.get(), Items.RAW_IRON, 0.2f);

        // deepslate ores
        addOreDrop(Reference.MOD_ID, Blocks.DEEPSLATE_DIAMOND_ORE, ModItems.NETHERITE_DIAMOND_PICKAXE.get(), Items.DIAMOND, 0.25f);
        addOreDrop(Reference.MOD_ID, Blocks.DEEPSLATE_EMERALD_ORE, ModItems.NETHERITE_EMERALD_PICKAXE.get(), Items.EMERALD, 0.4f);
        addOreDrop(Reference.MOD_ID, Blocks.DEEPSLATE_GOLD_ORE, ModItems.NETHERITE_GOLD_PICKAXE.get(), Items.RAW_GOLD, 0.3f);
        addOreDrop(Reference.MOD_ID, Blocks.DEEPSLATE_IRON_ORE, ModItems.NETHERITE_IRON_PICKAXE.get(), Items.RAW_IRON, 0.2f);

        // nether ores
        addOreDrop(Reference.MOD_ID, Blocks.NETHER_GOLD_ORE, ModItems.NETHERITE_GOLD_PICKAXE.get(), Items.GOLD_NUGGET, 0.6f);
    }

    protected void addOreDrop(String modId, Block lootTarget, Item pickaxe, Item bonusAddition, float additionChance) {
        String name = "blocks/" + lootTarget.getRegistryName().getPath() + "_addition";
        add(name, new OreDropsLootModifier.Serializer().setRegistryName(new ResourceLocation(modId, name)), new OreDropsLootModifier(new LootItemCondition[] {
                MatchTool.toolMatches(ItemPredicate.Builder.item().of(pickaxe)).build(),
                LootItemBlockStatePropertyCondition.hasBlockStateProperties(lootTarget).build()
        }, bonusAddition, additionChance));
    }
}
