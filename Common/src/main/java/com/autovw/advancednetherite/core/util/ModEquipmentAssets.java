package com.autovw.advancednetherite.core.util;

import net.minecraft.client.resources.model.EquipmentClientInfo;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.equipment.EquipmentAsset;

import java.util.function.BiConsumer;

import static com.autovw.advancednetherite.AdvancedNetherite.MOD_ID;

/**
 * @author Autovw
 */
public final class ModEquipmentAssets
{
    private static final ResourceKey<? extends Registry<EquipmentAsset>> ROOT_ID = ResourceKey.createRegistryKey(ResourceLocation.withDefaultNamespace("equipment_asset"));

    public static final ResourceKey<EquipmentAsset> NETHERITE_IRON = id("netherite_iron");
    public static final ResourceKey<EquipmentAsset> NETHERITE_GOLD = id("netherite_gold");
    public static final ResourceKey<EquipmentAsset> NETHERITE_EMERALD = id("netherite_emerald");
    public static final ResourceKey<EquipmentAsset> NETHERITE_DIAMOND = id("netherite_diamond");

    private static ResourceKey<EquipmentAsset> id(String name)
    {
        return ResourceKey.create(ROOT_ID, ResourceLocation.fromNamespaceAndPath(MOD_ID, name));
    }

    public static void bootstrap(BiConsumer<ResourceKey<EquipmentAsset>, EquipmentClientInfo> consumer)
    {
        consumer.accept(ModEquipmentAssets.NETHERITE_IRON, onlyHumanoid("netherite_iron"));
        consumer.accept(ModEquipmentAssets.NETHERITE_GOLD, onlyHumanoid("netherite_gold"));
        consumer.accept(ModEquipmentAssets.NETHERITE_EMERALD, onlyHumanoid("netherite_emerald"));
        consumer.accept(ModEquipmentAssets.NETHERITE_DIAMOND, onlyHumanoid("netherite_diamond"));
    }

    private static EquipmentClientInfo onlyHumanoid(String name)
    {
        return EquipmentClientInfo.builder().addHumanoidLayers(ResourceLocation.fromNamespaceAndPath(MOD_ID, name)).build();
    }
}
