package com.autovw.advancednetherite.core.registry;

import com.autovw.advancednetherite.Reference;
import com.autovw.advancednetherite.common.loot.CropDropsLootModifier;
import com.autovw.advancednetherite.common.loot.MobDropsLootModifier;
import com.autovw.advancednetherite.common.loot.OreDropsLootModifier;
import net.minecraftforge.common.loot.GlobalLootModifierSerializer;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

/**
 * Author: Autovw
 */
public class ModLootModifiers {
    public static final DeferredRegister<GlobalLootModifierSerializer<?>> LOOT_MODIFIERS = DeferredRegister.create(ForgeRegistries.Keys.LOOT_MODIFIER_SERIALIZERS, Reference.MOD_ID);

    public static final RegistryObject<OreDropsLootModifier.Serializer> DIAMOND_ORE_ADDITION = LOOT_MODIFIERS.register("blocks/diamond_ore_addition", OreDropsLootModifier.Serializer::new);
    public static final RegistryObject<OreDropsLootModifier.Serializer> EMERALD_ORE_ADDITION = LOOT_MODIFIERS.register("blocks/emerald_ore_addition", OreDropsLootModifier.Serializer::new);
    public static final RegistryObject<OreDropsLootModifier.Serializer> GOLD_ORE_ADDITION = LOOT_MODIFIERS.register("blocks/gold_ore_addition", OreDropsLootModifier.Serializer::new);
    public static final RegistryObject<OreDropsLootModifier.Serializer> IRON_ORE_ADDITION = LOOT_MODIFIERS.register("blocks/iron_ore_addition", OreDropsLootModifier.Serializer::new);
    public static final RegistryObject<OreDropsLootModifier.Serializer> DEEPSLATE_DIAMOND_ORE_ADDITION = LOOT_MODIFIERS.register("blocks/deepslate_diamond_ore_addition", OreDropsLootModifier.Serializer::new);
    public static final RegistryObject<OreDropsLootModifier.Serializer> DEEPSLATE_EMERALD_ORE_ADDITION = LOOT_MODIFIERS.register("blocks/deepslate_emerald_ore_addition", OreDropsLootModifier.Serializer::new);
    public static final RegistryObject<OreDropsLootModifier.Serializer> DEEPSLATE_GOLD_ORE_ADDITION = LOOT_MODIFIERS.register("blocks/deepslate_gold_ore_addition", OreDropsLootModifier.Serializer::new);
    public static final RegistryObject<OreDropsLootModifier.Serializer> DEEPSLATE_IRON_ORE_ADDITION = LOOT_MODIFIERS.register("blocks/deepslate_iron_ore_addition", OreDropsLootModifier.Serializer::new);
    public static final RegistryObject<OreDropsLootModifier.Serializer> NETHER_GOLD_ORE_ADDITION = LOOT_MODIFIERS.register("blocks/nether_gold_ore_addition", OreDropsLootModifier.Serializer::new);

    public static final RegistryObject<MobDropsLootModifier.Serializer> PHANTOM_ADDITION = LOOT_MODIFIERS.register("entities/phantom_addition", MobDropsLootModifier.Serializer::new);
    public static final RegistryObject<MobDropsLootModifier.Serializer> PIGLIN_ADDITION = LOOT_MODIFIERS.register("entities/piglin_addition", MobDropsLootModifier.Serializer::new);
    public static final RegistryObject<MobDropsLootModifier.Serializer> ZOMBIFIED_PIGLIN_ADDITION = LOOT_MODIFIERS.register("entities/zombified_piglin_addition", MobDropsLootModifier.Serializer::new);
    public static final RegistryObject<MobDropsLootModifier.Serializer> ENDERMAN_ADDITION = LOOT_MODIFIERS.register("entities/enderman_addition", MobDropsLootModifier.Serializer::new);

    public static final RegistryObject<CropDropsLootModifier.Serializer> WHEAT_ADDITION = LOOT_MODIFIERS.register("blocks/wheat_addition", CropDropsLootModifier.Serializer::new);
    public static final RegistryObject<CropDropsLootModifier.Serializer> CARROTS_ADDITION = LOOT_MODIFIERS.register("blocks/carrots_addition", CropDropsLootModifier.Serializer::new);
    public static final RegistryObject<CropDropsLootModifier.Serializer> POTATOES_ADDITION = LOOT_MODIFIERS.register("blocks/potatoes_addition", CropDropsLootModifier.Serializer::new);
    public static final RegistryObject<CropDropsLootModifier.Serializer> BEETROOTS_ADDITION = LOOT_MODIFIERS.register("blocks/beetroots_addition", CropDropsLootModifier.Serializer::new);
}
