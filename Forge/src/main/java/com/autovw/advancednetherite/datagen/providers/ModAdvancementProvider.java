package com.autovw.advancednetherite.datagen.providers;

import com.autovw.advancednetherite.AdvancedNetherite;
import com.autovw.advancednetherite.core.registry.ModItems;
import net.minecraft.advancements.Advancement;
import net.minecraft.advancements.AdvancementRewards;
import net.minecraft.advancements.FrameType;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.common.data.ForgeAdvancementProvider;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

/**
 * @author Autovw
 */
public class ModAdvancementProvider extends ForgeAdvancementProvider {
    public ModAdvancementProvider(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> registries, ExistingFileHelper existingFileHelper) {
        super(packOutput, registries, existingFileHelper, List.of(new ModNetherAdvancements()));
    }

    public static class ModNetherAdvancements implements AdvancementGenerator {

        @Override
        public void generate(HolderLookup.Provider registries, Consumer<Advancement> consumer, ExistingFileHelper fileHelper) {
            Advancement.Builder.advancement()
                    .parent(new ResourceLocation("minecraft", "husbandry/obtain_netherite_hoe"))
                    .display(ModItems.NETHERITE_DIAMOND_HOE.get(), Component.translatable("advancements.advancednetherite.husbandry.netherite_diamond_hoe.title"), Component.translatable("advancements.advancednetherite.husbandry.netherite_diamond_hoe.description"), null, FrameType.CHALLENGE, true, true, false)
                    .rewards(AdvancementRewards.Builder.experience(200))
                    .addCriterion("netherite_diamond_hoe", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.NETHERITE_DIAMOND_HOE.get()))
                    .save(consumer, new ResourceLocation(AdvancedNetherite.MOD_ID, "husbandry/obtain_netherite_diamond_hoe"), fileHelper);

            Advancement netheriteIronArmor = Advancement.Builder.advancement()
                    .parent(new ResourceLocation("minecraft", "nether/netherite_armor"))
                    .display(ModItems.NETHERITE_IRON_CHESTPLATE.get(), Component.translatable("advancements.advancednetherite.nether.netherite_iron_armor.title"), Component.translatable("advancements.advancednetherite.nether.netherite_iron_armor.description"), null, FrameType.CHALLENGE, true, true, false)
                    .rewards(AdvancementRewards.Builder.experience(100))
                    .addCriterion("netherite_iron_armor", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.NETHERITE_IRON_HELMET.get(), ModItems.NETHERITE_IRON_CHESTPLATE.get(), ModItems.NETHERITE_IRON_LEGGINGS.get(), ModItems.NETHERITE_IRON_BOOTS.get()))
                    .save(consumer, new ResourceLocation(AdvancedNetherite.MOD_ID, "nether/netherite_iron_armor"), fileHelper);

            Advancement netheriteGoldArmor = Advancement.Builder.advancement()
                    .parent(netheriteIronArmor)
                    .display(ModItems.NETHERITE_GOLD_CHESTPLATE.get(), Component.translatable("advancements.advancednetherite.nether.netherite_gold_armor.title"), Component.translatable("advancements.advancednetherite.nether.netherite_gold_armor.description"), null, FrameType.CHALLENGE, true, true, false)
                    .rewards(AdvancementRewards.Builder.experience(100))
                    .addCriterion("netherite_gold_armor", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.NETHERITE_GOLD_HELMET.get(), ModItems.NETHERITE_GOLD_CHESTPLATE.get(), ModItems.NETHERITE_GOLD_LEGGINGS.get(), ModItems.NETHERITE_GOLD_BOOTS.get()))
                    .save(consumer, new ResourceLocation(AdvancedNetherite.MOD_ID, "nether/netherite_gold_armor"), fileHelper);

            Advancement netheriteEmeraldArmor = Advancement.Builder.advancement()
                    .parent(netheriteGoldArmor)
                    .display(ModItems.NETHERITE_EMERALD_CHESTPLATE.get(), Component.translatable("advancements.advancednetherite.nether.netherite_emerald_armor.title"), Component.translatable("advancements.advancednetherite.nether.netherite_emerald_armor.description"), null, FrameType.CHALLENGE, true, true, false)
                    .rewards(AdvancementRewards.Builder.experience(100))
                    .addCriterion("netherite_emerald_armor", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.NETHERITE_EMERALD_HELMET.get(), ModItems.NETHERITE_EMERALD_CHESTPLATE.get(), ModItems.NETHERITE_EMERALD_LEGGINGS.get(), ModItems.NETHERITE_EMERALD_BOOTS.get()))
                    .save(consumer, new ResourceLocation(AdvancedNetherite.MOD_ID, "nether/netherite_emerald_armor"), fileHelper);

            Advancement.Builder.advancement()
                    .parent(netheriteEmeraldArmor)
                    .display(ModItems.NETHERITE_DIAMOND_CHESTPLATE.get(), Component.translatable("advancements.advancednetherite.nether.netherite_diamond_armor.title"), Component.translatable("advancements.advancednetherite.nether.netherite_diamond_armor.description"), null, FrameType.CHALLENGE, true, true, false)
                    .rewards(AdvancementRewards.Builder.experience(200))
                    .addCriterion("netherite_diamond_armor", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.NETHERITE_DIAMOND_HELMET.get(), ModItems.NETHERITE_DIAMOND_CHESTPLATE.get(), ModItems.NETHERITE_DIAMOND_LEGGINGS.get(), ModItems.NETHERITE_DIAMOND_BOOTS.get()))
                    .save(consumer, new ResourceLocation(AdvancedNetherite.MOD_ID, "nether/netherite_diamond_armor"), fileHelper);

            Advancement.Builder.advancement()
                    .parent(new ResourceLocation("nether/obtain_ancient_debris"))
                    .display(ModItems.NETHERITE_IRON_INGOT.get(), Component.translatable("advancements.advancednetherite.nether.obtain_netherite_iron_ingot.title"), Component.translatable("advancements.advancednetherite.nether.obtain_netherite_iron_ingot.description"), null, FrameType.TASK, true, true, false)
                    .rewards(AdvancementRewards.Builder.experience(20))
                    .addCriterion("netherite_iron_ingot", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.NETHERITE_IRON_INGOT.get()))
                    .save(consumer, new ResourceLocation(AdvancedNetherite.MOD_ID, "nether/obtain_netherite_iron_ingot"), fileHelper);
        }
    }
}
