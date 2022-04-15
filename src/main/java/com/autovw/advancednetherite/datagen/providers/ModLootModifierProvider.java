package com.autovw.advancednetherite.datagen.providers;

import com.autovw.advancednetherite.Reference;
import com.autovw.advancednetherite.common.loot.OreDropsLootModifier;
import com.autovw.advancednetherite.core.ModItems;
import net.minecraft.advancements.criterion.ItemPredicate;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.loot.conditions.BlockStateProperty;
import net.minecraft.loot.conditions.ILootCondition;
import net.minecraft.loot.conditions.MatchTool;
import net.minecraft.util.ResourceLocation;
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
        addOreDrop(Reference.MOD_ID, Blocks.GOLD_ORE, ModItems.NETHERITE_GOLD_PICKAXE.get(), Items.GOLD_NUGGET, 0.3f);
        addOreDrop(Reference.MOD_ID, Blocks.IRON_ORE, ModItems.NETHERITE_IRON_PICKAXE.get(), Items.IRON_NUGGET, 0.2f);

        // nether ores
        addOreDrop(Reference.MOD_ID, Blocks.NETHER_GOLD_ORE, ModItems.NETHERITE_GOLD_PICKAXE.get(), Items.GOLD_NUGGET, 0.6f);
    }

    protected void addOreDrop(String modId, Block lootTarget, Item pickaxe, Item bonusAddition, float additionChance) {
        String name = "blocks/" + lootTarget.getRegistryName().getPath() + "_addition";
        add(name, new OreDropsLootModifier.Serializer().setRegistryName(new ResourceLocation(modId, name)), new OreDropsLootModifier(new ILootCondition[] {
                MatchTool.toolMatches(ItemPredicate.Builder.item().of(pickaxe)).build(),
                BlockStateProperty.hasBlockStateProperties(lootTarget).build()
        }, bonusAddition, additionChance));
    }
}
