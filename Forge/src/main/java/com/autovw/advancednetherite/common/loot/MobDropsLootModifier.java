package com.autovw.advancednetherite.common.loot;

import com.autovw.advancednetherite.config.ConfigHelper;
import com.autovw.advancednetherite.core.ModItems;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.storage.loot.parameters.LootContextParams;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraftforge.common.loot.IGlobalLootModifier;
import net.minecraftforge.common.loot.LootModifier;
import org.jetbrains.annotations.NotNull;

// TODO rework loot modifiers
/**
 * A loot modifier for adding additional crops to entities.
 * See {@link com.autovw.advancednetherite.datagen.providers.ModLootModifierProvider} for example implementation.
 * @apiNote This loot modifier can be disabled by {@link com.autovw.advancednetherite.config.Config.AdditionalDropsConfig#enableAdditionalMobDrops}
 * @author Autovw
 */
public class MobDropsLootModifier extends LootModifier
{
    public static final Codec<MobDropsLootModifier> CODEC = RecordCodecBuilder.create(instance -> codecStart(instance).apply(instance, MobDropsLootModifier::new));

    /**
     * Constructs a LootModifier.
     *
     * @param conditionsIn the ILootConditions that need to be matched before the loot is modified.
     */
    public MobDropsLootModifier(LootItemCondition[] conditionsIn)
    {
        super(conditionsIn);
    }

    @NotNull
    @Override
    protected ObjectArrayList<ItemStack> doApply(ObjectArrayList<ItemStack> generatedLoot, LootContext context)
    {
        Entity killer = context.getParamOrNull(LootContextParams.KILLER_ENTITY); // the entity killer
        Entity victim = context.getParamOrNull(LootContextParams.THIS_ENTITY); // killed entity

        if (killer instanceof Player player && victim != null && ConfigHelper.get().getCommon().getAdditionalDrops().enableAdditionalMobDrops())
        {
            ItemStack useItem = player.getMainHandItem(); // used to check if the player uses the correct weapon
            RandomSource random = context.getRandom(); // random generator

            if (useItem.is(ModItems.NETHERITE_IRON_SWORD) && victim.getType() == EntityType.PHANTOM && random.nextFloat() <= ConfigHelper.get().getServer().getAdditionalDropProperties().getAdditionalPhantomDropChance())
            {
                generatedLoot.add(new ItemStack(Items.PHANTOM_MEMBRANE, random.nextIntBetweenInclusive(0, 2)));
            }
            if ((useItem.is(ModItems.NETHERITE_GOLD_SWORD) || useItem.is(ModItems.NETHERITE_DIAMOND_SWORD)) && victim.getType() == EntityType.ZOMBIFIED_PIGLIN && random.nextFloat() <= ConfigHelper.get().getServer().getAdditionalDropProperties().getAdditionalZombifiedPiglinDropChance())
            {
                generatedLoot.add(new ItemStack(Items.GOLD_NUGGET, random.nextIntBetweenInclusive(0, 3)));
            }
            if ((useItem.is(ModItems.NETHERITE_GOLD_SWORD) || useItem.is(ModItems.NETHERITE_DIAMOND_SWORD)) && victim.getType() == EntityType.PIGLIN && random.nextFloat() <= ConfigHelper.get().getServer().getAdditionalDropProperties().getAdditionalPiglinDropChance())
            {
                generatedLoot.add(new ItemStack(Items.GOLD_INGOT, random.nextIntBetweenInclusive(1, 1)));
            }
            if ((useItem.is(ModItems.NETHERITE_EMERALD_SWORD) || useItem.is(ModItems.NETHERITE_DIAMOND_SWORD)) && victim.getType() == EntityType.ENDERMAN && random.nextFloat() <= ConfigHelper.get().getServer().getAdditionalDropProperties().getAdditionalEndermanDropChance())
            {
                generatedLoot.add(new ItemStack(Items.ENDER_PEARL, random.nextIntBetweenInclusive(0, 1)));
            }
        }
        return generatedLoot;
    }

    @Override
    public Codec<? extends IGlobalLootModifier> codec()
    {
        return CODEC;
    }
}
