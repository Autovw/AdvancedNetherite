package com.autovw.advancednetherite.core.registry;

import com.autovw.advancednetherite.AdvancedNetherite;
import com.autovw.advancednetherite.api.annotation.Internal;
import com.autovw.advancednetherite.common.loot.CropDropsLootModifier;
import com.autovw.advancednetherite.common.loot.MobDropsLootModifier;
import com.autovw.advancednetherite.common.loot.OreDropsLootModifier;
import com.mojang.serialization.MapCodec;
import net.minecraftforge.common.loot.IGlobalLootModifier;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

// TODO rework loot modifiers
/**
 * @author Autovw
 */
public final class ModLootModifiers {
    @Internal
    public static final DeferredRegister<MapCodec<? extends IGlobalLootModifier>> LOOT_MODIFIERS = DeferredRegister.create(ForgeRegistries.Keys.GLOBAL_LOOT_MODIFIER_SERIALIZERS, AdvancedNetherite.MOD_ID);

    public static final RegistryObject<MapCodec<OreDropsLootModifier>> ORE_DROPS_LOOT_MODIFIER = LOOT_MODIFIERS.register("ore_drops_loot_modifier", () -> OreDropsLootModifier.CODEC);

    public static final RegistryObject<MapCodec<MobDropsLootModifier>> MOB_DROPS_LOOT_MODIFIER = LOOT_MODIFIERS.register("mob_drops_loot_modifier", () -> MobDropsLootModifier.CODEC);

    public static final RegistryObject<MapCodec<CropDropsLootModifier>> CROP_DROPS_LOOT_MODIFIER = LOOT_MODIFIERS.register("crop_drops_loot_modifier", () -> CropDropsLootModifier.CODEC);
}
