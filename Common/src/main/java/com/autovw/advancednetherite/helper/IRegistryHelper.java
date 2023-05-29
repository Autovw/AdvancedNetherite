package com.autovw.advancednetherite.helper;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

/**
 * @author Autovw
 */
public interface IRegistryHelper
{
    /**
     * @param block Block to get id from
     * @return Id of the provided block
     * @since 2.0.0
     */
    ResourceLocation getBlockById(Block block);

    /**
     * @param item item to get id from
     * @return Id of the provided item
     * @since 2.0.0
     */
    ResourceLocation getItemById(Item item);

    /**
     * @param mobEffect Mob effect to get id from
     * @return Id of the provided mob effect
     * @since 2.0.0
     */
    ResourceLocation getMobEffectById(MobEffect mobEffect);

    /**
     * @param soundEvent Sound event to get id from
     * @return Id of the provided sound event
     * @since 2.0.0
     */
    ResourceLocation getSoundEventById(SoundEvent soundEvent);

    /**
     * @param entityType Entity type to get id from
     * @return Id of the provided entity type
     * @since 2.0.0
     */
    ResourceLocation getEntityTypeById(EntityType<?> entityType);
}
