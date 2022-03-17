package com.autovw.advancednetherite.datagen.providers;

import com.autovw.advancednetherite.Reference;
import com.autovw.advancednetherite.core.ModItems;
import net.minecraft.advancements.Advancement;
import net.minecraft.advancements.AdvancementRewards;
import net.minecraft.advancements.FrameType;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.advancements.AdvancementProvider;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.data.ExistingFileHelper;

import java.util.function.Consumer;

/**
 * Author: Autovw
 */
public class ModAdvancementProvider extends AdvancementProvider {
    public ModAdvancementProvider(DataGenerator generatorIn, ExistingFileHelper fileHelperIn) {
        super(generatorIn, fileHelperIn);
    }

    @Override
    protected void registerAdvancements(Consumer<Advancement> consumer, ExistingFileHelper fileHelper) {
        Advancement.Builder.advancement()
                .parent(new ResourceLocation("minecraft", "husbandry/obtain_netherite_hoe"))
                .display(ModItems.NETHERITE_DIAMOND_HOE.get(), new TranslatableComponent("advancements.advancednetherite.husbandry.netherite_diamond_hoe.title"), new TranslatableComponent("advancements.advancednetherite.husbandry.netherite_diamond_hoe.description"), null, FrameType.CHALLENGE, true, true, false)
                .rewards(AdvancementRewards.Builder.experience(200))
                .addCriterion("netherite_diamond_hoe", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.NETHERITE_DIAMOND_HOE.get()))
                .save(consumer, new ResourceLocation(Reference.MOD_ID, "husbandry/obtain_netherite_diamond_hoe"), fileHelper);

        Advancement netheriteGoldArmor = Advancement.Builder.advancement()
                .parent(new ResourceLocation("minecraft", "nether/netherite_armor"))
                .display(ModItems.NETHERITE_GOLD_CHESTPLATE.get(), new TranslatableComponent("advancements.advancednetherite.nether.netherite_gold_armor.title"), new TranslatableComponent("advancements.advancednetherite.nether.netherite_gold_armor.description"), null, FrameType.CHALLENGE, true, true, false)
                .rewards(AdvancementRewards.Builder.experience(100))
                .addCriterion("netherite_gold_armor", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.NETHERITE_GOLD_HELMET.get(), ModItems.NETHERITE_GOLD_CHESTPLATE.get(), ModItems.NETHERITE_GOLD_LEGGINGS.get(), ModItems.NETHERITE_GOLD_BOOTS.get()))
                .save(consumer, new ResourceLocation(Reference.MOD_ID, "nether/netherite_gold_armor"), fileHelper);

        Advancement netheriteEmeraldArmor = Advancement.Builder.advancement()
                .parent(netheriteGoldArmor)
                .display(ModItems.NETHERITE_EMERALD_CHESTPLATE.get(), new TranslatableComponent("advancements.advancednetherite.nether.netherite_emerald_armor.title"), new TranslatableComponent("advancements.advancednetherite.nether.netherite_emerald_armor.description"), null, FrameType.CHALLENGE, true, true, false)
                .rewards(AdvancementRewards.Builder.experience(100))
                .addCriterion("netherite_emerald_armor", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.NETHERITE_EMERALD_HELMET.get(), ModItems.NETHERITE_EMERALD_CHESTPLATE.get(), ModItems.NETHERITE_EMERALD_LEGGINGS.get(), ModItems.NETHERITE_EMERALD_BOOTS.get()))
                .save(consumer, new ResourceLocation(Reference.MOD_ID, "nether/netherite_emerald_armor"), fileHelper);

        Advancement.Builder.advancement()
                .parent(netheriteEmeraldArmor)
                .display(ModItems.NETHERITE_DIAMOND_CHESTPLATE.get(), new TranslatableComponent("advancements.advancednetherite.nether.netherite_diamond_armor.title"), new TranslatableComponent("advancements.advancednetherite.nether.netherite_diamond_armor.description"), null, FrameType.CHALLENGE, true, true, false)
                .rewards(AdvancementRewards.Builder.experience(200))
                .addCriterion("netherite_diamond_armor", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.NETHERITE_DIAMOND_HELMET.get(), ModItems.NETHERITE_DIAMOND_CHESTPLATE.get(), ModItems.NETHERITE_DIAMOND_LEGGINGS.get(), ModItems.NETHERITE_DIAMOND_BOOTS.get()))
                .save(consumer, new ResourceLocation(Reference.MOD_ID, "nether/netherite_diamond_armor"), fileHelper);
    }
}
