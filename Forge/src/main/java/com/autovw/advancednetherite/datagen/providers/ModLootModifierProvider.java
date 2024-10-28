package com.autovw.advancednetherite.datagen.providers;

import com.autovw.advancednetherite.common.loot.CropDropsLootModifier;
import com.autovw.advancednetherite.common.loot.MobDropsLootModifier;
import com.autovw.advancednetherite.common.loot.OreDropsLootModifier;
import com.autovw.advancednetherite.core.ModItems;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemKilledByPlayerCondition;
import net.minecraft.world.level.storage.loot.predicates.MatchTool;
import net.minecraftforge.common.data.GlobalLootModifierProvider;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

// TODO rework loot modifiers
/**
 * @author Autovw
 */
public class ModLootModifierProvider extends GlobalLootModifierProvider
{
    private final List<Item> HOE_ITEMS = List.of(ModItems.NETHERITE_IRON_HOE, ModItems.NETHERITE_GOLD_HOE, ModItems.NETHERITE_EMERALD_HOE, ModItems.NETHERITE_DIAMOND_HOE);
    private final CompletableFuture<HolderLookup.Provider> registries;

    public ModLootModifierProvider(PackOutput output, String modId, CompletableFuture<HolderLookup.Provider> registries)
    {
        super(output, modId, registries);
        this.registries = registries;
    }

    @Override
    protected void start(HolderLookup.Provider provider)
    {
        HolderLookup.RegistryLookup<Item> registryLookup = null;
        try {
            registryLookup = registries.get().lookupOrThrow(Registries.ITEM);
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }

        // ores
        add("ore_drops_loot_modifier", new OreDropsLootModifier(new LootItemCondition[] {}));

        // entities
        add("mob_drops_loot_modifier", new MobDropsLootModifier(new LootItemCondition[] {
                LootItemKilledByPlayerCondition.killedByPlayer().build()
        }));

        // crops
        add("crop_drops_loot_modifier", new CropDropsLootModifier(new LootItemCondition[] {
                MatchTool.toolMatches(ItemPredicate.Builder.item().of(registryLookup, HOE_ITEMS.toArray(Item[]::new))).build()
        }));
    }
}
