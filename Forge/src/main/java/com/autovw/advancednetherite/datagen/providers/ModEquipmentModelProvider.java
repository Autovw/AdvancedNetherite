package com.autovw.advancednetherite.datagen.providers;

import com.autovw.advancednetherite.core.util.ModEquipmentModels;
import net.minecraft.data.CachedOutput;
import net.minecraft.data.DataProvider;
import net.minecraft.data.PackOutput;
import net.minecraft.data.models.EquipmentModelProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.equipment.EquipmentModel;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

/**
 * @author Autovw
 */
public class ModEquipmentModelProvider extends EquipmentModelProvider
{
    protected final PackOutput.PathProvider pathProvider;

    public ModEquipmentModelProvider(PackOutput packOutput)
    {
        super(packOutput);
        this.pathProvider = packOutput.createPathProvider(PackOutput.Target.RESOURCE_PACK, "models/equipment");
    }

    @Override
    public CompletableFuture<?> run(CachedOutput output)
    {
        Map<ResourceLocation, EquipmentModel> map = new HashMap<>();
        ModEquipmentModels.bootstrap((id, model) -> {
            if (map.putIfAbsent(id, model) != null)
            {
                throw new IllegalStateException("Duplicate equipment model for id: " + id.toString());
            }
        });
        return DataProvider.saveAll(output, EquipmentModel.CODEC, this.pathProvider, map);
    }
}
