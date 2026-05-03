package com.autovw.advancednetherite.datagen.providers;

import com.autovw.advancednetherite.core.ModBlocks;
import com.autovw.advancednetherite.core.ModItems;
import com.autovw.advancednetherite.core.util.ModEquipmentAssets;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.ModelTemplate;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.client.data.models.model.TextureMapping;
import net.minecraft.client.data.models.model.TextureSlot;
import net.minecraft.client.renderer.item.ClientItem;
import net.minecraft.client.renderer.item.CuboidItemModelWrapper;
import net.minecraft.client.resources.model.sprite.Material;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.equipment.EquipmentAsset;

import java.util.List;
import java.util.Optional;

/**
 * @author Autovw
 */
public class ModModelProvider extends FabricModelProvider
{
    public ModModelProvider(FabricPackOutput output)
    {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators generator)
    {
        generator.createTrivialCube(ModBlocks.NETHERITE_IRON_BLOCK);
        generator.createTrivialCube(ModBlocks.NETHERITE_GOLD_BLOCK);
        generator.createTrivialCube(ModBlocks.NETHERITE_EMERALD_BLOCK);
        generator.createTrivialCube(ModBlocks.NETHERITE_DIAMOND_BLOCK);

        generator.createFlatItemModel(ModBlocks.NETHERITE_IRON_BLOCK.asItem());
        generator.createFlatItemModel(ModBlocks.NETHERITE_GOLD_BLOCK.asItem());
        generator.createFlatItemModel(ModBlocks.NETHERITE_EMERALD_BLOCK.asItem());
        generator.createFlatItemModel(ModBlocks.NETHERITE_DIAMOND_BLOCK.asItem());
    }

    @Override
    public void generateItemModels(ItemModelGenerators generator)
    {
        itemModel(generator, ModItems.NETHERITE_IRON_INGOT);
        itemModel(generator, ModItems.NETHERITE_GOLD_INGOT);
        itemModel(generator, ModItems.NETHERITE_EMERALD_INGOT);
        itemModel(generator, ModItems.NETHERITE_DIAMOND_INGOT);

        armorModel(generator, ModItems.NETHERITE_IRON_HELMET, ModEquipmentAssets.NETHERITE_IRON);
        armorModel(generator, ModItems.NETHERITE_IRON_CHESTPLATE, ModEquipmentAssets.NETHERITE_IRON);
        armorModel(generator, ModItems.NETHERITE_IRON_LEGGINGS, ModEquipmentAssets.NETHERITE_IRON);
        armorModel(generator, ModItems.NETHERITE_IRON_BOOTS, ModEquipmentAssets.NETHERITE_IRON);

        armorModel(generator, ModItems.NETHERITE_GOLD_HELMET, ModEquipmentAssets.NETHERITE_GOLD);
        armorModel(generator, ModItems.NETHERITE_GOLD_CHESTPLATE, ModEquipmentAssets.NETHERITE_GOLD);
        armorModel(generator, ModItems.NETHERITE_GOLD_LEGGINGS, ModEquipmentAssets.NETHERITE_GOLD);
        armorModel(generator, ModItems.NETHERITE_GOLD_BOOTS, ModEquipmentAssets.NETHERITE_GOLD);

        armorModel(generator, ModItems.NETHERITE_EMERALD_HELMET, ModEquipmentAssets.NETHERITE_EMERALD);
        armorModel(generator, ModItems.NETHERITE_EMERALD_CHESTPLATE, ModEquipmentAssets.NETHERITE_EMERALD);
        armorModel(generator, ModItems.NETHERITE_EMERALD_LEGGINGS, ModEquipmentAssets.NETHERITE_EMERALD);
        armorModel(generator, ModItems.NETHERITE_EMERALD_BOOTS, ModEquipmentAssets.NETHERITE_EMERALD);

        armorModel(generator, ModItems.NETHERITE_DIAMOND_HELMET, ModEquipmentAssets.NETHERITE_DIAMOND);
        armorModel(generator, ModItems.NETHERITE_DIAMOND_CHESTPLATE, ModEquipmentAssets.NETHERITE_DIAMOND);
        armorModel(generator, ModItems.NETHERITE_DIAMOND_LEGGINGS, ModEquipmentAssets.NETHERITE_DIAMOND);
        armorModel(generator, ModItems.NETHERITE_DIAMOND_BOOTS, ModEquipmentAssets.NETHERITE_DIAMOND);

        toolModel(generator, ModItems.NETHERITE_IRON_AXE);
        toolModel(generator, ModItems.NETHERITE_GOLD_AXE);
        toolModel(generator, ModItems.NETHERITE_EMERALD_AXE);
        toolModel(generator, ModItems.NETHERITE_DIAMOND_AXE);

        toolModel(generator, ModItems.NETHERITE_IRON_HOE);
        toolModel(generator, ModItems.NETHERITE_GOLD_HOE);
        toolModel(generator, ModItems.NETHERITE_EMERALD_HOE);
        toolModel(generator, ModItems.NETHERITE_DIAMOND_HOE);

        toolModel(generator, ModItems.NETHERITE_IRON_PICKAXE);
        toolModel(generator, ModItems.NETHERITE_GOLD_PICKAXE);
        toolModel(generator, ModItems.NETHERITE_EMERALD_PICKAXE);
        toolModel(generator, ModItems.NETHERITE_DIAMOND_PICKAXE);

        toolModel(generator, ModItems.NETHERITE_IRON_SHOVEL);
        toolModel(generator, ModItems.NETHERITE_GOLD_SHOVEL);
        toolModel(generator, ModItems.NETHERITE_EMERALD_SHOVEL);
        toolModel(generator, ModItems.NETHERITE_DIAMOND_SHOVEL);

        toolModel(generator, ModItems.NETHERITE_IRON_SWORD);
        toolModel(generator, ModItems.NETHERITE_GOLD_SWORD);
        toolModel(generator, ModItems.NETHERITE_EMERALD_SWORD);
        toolModel(generator, ModItems.NETHERITE_DIAMOND_SWORD);

        spearModel(generator, ModItems.NETHERITE_IRON_SPEAR);
        spearModel(generator, ModItems.NETHERITE_GOLD_SPEAR);
        spearModel(generator, ModItems.NETHERITE_EMERALD_SPEAR);
        spearModel(generator, ModItems.NETHERITE_DIAMOND_SPEAR);
    }

    public void itemModel(ItemModelGenerators itemModels, Item item)
    {
        this.itemModel(itemModels, item, ModelTemplates.FLAT_ITEM);
    }

    public void toolModel(ItemModelGenerators itemModels, Item item)
    {
        this.itemModel(itemModels, item, ModelTemplates.FLAT_HANDHELD_ITEM);
    }

    public void itemModel(ItemModelGenerators itemModels, Item item, ModelTemplate template)
    {
        Identifier itemId = BuiltInRegistries.ITEM.getKey(item);
        Identifier textureLoc = Identifier.fromNamespaceAndPath(itemId.getNamespace(), "item/" + itemId.getPath());
        TextureMapping textureMapping = new TextureMapping().put(TextureSlot.LAYER0, new Material(textureLoc));
        itemModels.itemModelOutput.accept(item, new CuboidItemModelWrapper.Unbaked(template.create(item, textureMapping, itemModels.modelOutput), Optional.empty(), List.of()));
    }

    public void armorModel(ItemModelGenerators itemModels, Item item, ResourceKey<EquipmentAsset> equipmentKey)
    {
        Identifier id = BuiltInRegistries.ITEM.getKey(item);
        Identifier armorType = null;
        if (id.getPath().contains("helmet"))
            armorType = ItemModelGenerators.TRIM_PREFIX_HELMET;
        else if (id.getPath().contains("chestplate"))
            armorType = ItemModelGenerators.TRIM_PREFIX_CHESTPLATE;
        else if (id.getPath().contains("leggings"))
            armorType = ItemModelGenerators.TRIM_PREFIX_LEGGINGS;
        else if (id.getPath().contains("boots"))
            armorType = ItemModelGenerators.TRIM_PREFIX_BOOTS;
        itemModels.generateTrimmableItem(item, equipmentKey, armorType, false);
    }

    public void spearModel(ItemModelGenerators itemModels, Item item)
    {
        Identifier itemId = BuiltInRegistries.ITEM.getKey(item);
        Identifier textureLoc = Identifier.fromNamespaceAndPath(itemId.getNamespace(), "item/" + itemId.getPath());
        TextureMapping textureMapping = new TextureMapping().put(TextureSlot.LAYER0, new Material(textureLoc));
        CuboidItemModelWrapper.Unbaked model = new CuboidItemModelWrapper.Unbaked(ModelTemplates.FLAT_ITEM.create(item, textureMapping, itemModels.modelOutput), Optional.empty(), List.of());

        TextureMapping textureMappingInHand = new TextureMapping().put(TextureSlot.LAYER0, new Material(Identifier.fromNamespaceAndPath(itemId.getNamespace(), "item/" + itemId.getPath() + "_in_hand")));
        CuboidItemModelWrapper.Unbaked modelInHand = new CuboidItemModelWrapper.Unbaked(ModelTemplates.SPEAR_IN_HAND.create(item, textureMappingInHand, itemModels.modelOutput), Optional.empty(), List.of());

        itemModels.itemModelOutput.accept(item, ItemModelGenerators.createFlatModelDispatch(model, modelInHand), new ClientItem.Properties(true, false, 1.95F));
    }
}
