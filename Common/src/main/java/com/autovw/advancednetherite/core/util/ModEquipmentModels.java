package com.autovw.advancednetherite.core.util;

import com.autovw.advancednetherite.AdvancedNetherite;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.equipment.EquipmentModel;

import java.util.function.BiConsumer;

/**
 * @author Autovw
 */
public final class ModEquipmentModels
{
    public static final EquipmentModel NETHERITE_IRON = humanoidModel(key("netherite_iron"));
    public static final EquipmentModel NETHERITE_GOLD = humanoidModel(key("netherite_gold"));
    public static final EquipmentModel NETHERITE_EMERALD = humanoidModel(key("netherite_emerald"));
    public static final EquipmentModel NETHERITE_DIAMOND = humanoidModel(key("netherite_diamond"));

    /*
    public static void bootstrap(BiConsumer<ResourceLocation, EquipmentModel> consumer)
    {
        consumer.accept(NETHERITE_IRON, humanoidModel(NETHERITE_IRON));
        consumer.accept(NETHERITE_GOLD, humanoidModel(NETHERITE_GOLD));
        consumer.accept(NETHERITE_EMERALD, humanoidModel(NETHERITE_EMERALD));
        consumer.accept(NETHERITE_DIAMOND, humanoidModel(NETHERITE_DIAMOND));
    }
     */

    private static EquipmentModel humanoidModel(ResourceLocation location)
    {
        return EquipmentModel.builder().addHumanoidLayers(location).build();
    }

    private static ResourceLocation key(String id)
    {
        return ResourceLocation.fromNamespaceAndPath(AdvancedNetherite.MOD_ID, id);
    }
}
