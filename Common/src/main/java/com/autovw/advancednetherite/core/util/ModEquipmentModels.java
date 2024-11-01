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
    public static final ResourceLocation ID_NETHERITE_IRON = key("netherite_iron");
    public static final ResourceLocation ID_NETHERITE_GOLD = key("netherite_gold");
    public static final ResourceLocation ID_NETHERITE_EMERALD = key("netherite_emerald");
    public static final ResourceLocation ID_NETHERITE_DIAMOND = key("netherite_diamond");

    public static final EquipmentModel NETHERITE_IRON = humanoidModel(ID_NETHERITE_IRON);
    public static final EquipmentModel NETHERITE_GOLD = humanoidModel(ID_NETHERITE_GOLD);
    public static final EquipmentModel NETHERITE_EMERALD = humanoidModel(ID_NETHERITE_EMERALD);
    public static final EquipmentModel NETHERITE_DIAMOND = humanoidModel(ID_NETHERITE_DIAMOND);

    public static void bootstrap(BiConsumer<ResourceLocation, EquipmentModel> consumer)
    {
        consumer.accept(ID_NETHERITE_IRON, NETHERITE_IRON);
        consumer.accept(ID_NETHERITE_GOLD, NETHERITE_GOLD);
        consumer.accept(ID_NETHERITE_EMERALD, NETHERITE_EMERALD);
        consumer.accept(ID_NETHERITE_DIAMOND, NETHERITE_DIAMOND);
    }

    private static EquipmentModel humanoidModel(ResourceLocation location)
    {
        return EquipmentModel.builder().addHumanoidLayers(location).build();
    }

    private static ResourceLocation key(String id)
    {
        return ResourceLocation.fromNamespaceAndPath(AdvancedNetherite.MOD_ID, id);
    }
}
