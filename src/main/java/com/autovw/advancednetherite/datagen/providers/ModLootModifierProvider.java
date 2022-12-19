package com.autovw.advancednetherite.datagen.providers;

import com.autovw.advancednetherite.common.loot.CropDropsLootModifier;
import com.autovw.advancednetherite.common.loot.MobDropsLootModifier;
import com.autovw.advancednetherite.common.loot.OreDropsLootModifier;
import com.autovw.advancednetherite.core.registry.ModItems;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemKilledByPlayerCondition;
import net.minecraft.world.level.storage.loot.predicates.MatchTool;
import net.minecraftforge.common.data.GlobalLootModifierProvider;

import java.util.List;

// TODO rework loot modifiers
/**
 * @author Autovw
 */
public class ModLootModifierProvider extends GlobalLootModifierProvider {
    private final List<Item> HOE_ITEMS = List.of(ModItems.NETHERITE_IRON_HOE.get(), ModItems.NETHERITE_GOLD_HOE.get(), ModItems.NETHERITE_EMERALD_HOE.get(), ModItems.NETHERITE_DIAMOND_HOE.get());

    public ModLootModifierProvider(PackOutput packOutput, String modId) {
        super(packOutput, modId);
    }

    @Override
    protected void start() {
        // ores
        add("ore_drops_loot_modifier", new OreDropsLootModifier(new LootItemCondition[] {}));

        // entities
        add("mob_drops_loot_modifier", new MobDropsLootModifier(new LootItemCondition[] {
                LootItemKilledByPlayerCondition.killedByPlayer().build()
        }));

        // crops
        add("crop_drops_loot_modifier", new CropDropsLootModifier(new LootItemCondition[] {
                MatchTool.toolMatches(ItemPredicate.Builder.item().of(HOE_ITEMS.toArray(Item[]::new))).build()
        }));
    }
}
