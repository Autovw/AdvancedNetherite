package com.autovw.advancednetherite.helper;

import net.minecraft.resources.Identifier;
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
    Identifier getBlockById(Block block);

    /**
     * @param item item to get id from
     * @return Id of the provided item
     * @since 2.0.0
     */
    Identifier getItemById(Item item);

    /**
     * @param mobEffect Mob effect to get id from
     * @return Id of the provided mob effect
     * @since 2.0.0
     */
    Identifier getMobEffectById(MobEffect mobEffect);

    /**
     * @param soundEvent Sound event to get id from
     * @return Id of the provided sound event
     * @since 2.0.0
     */
    Identifier getSoundEventById(SoundEvent soundEvent);

    /**
     * @param entityType Entity type to get id from
     * @return Id of the provided entity type
     * @since 2.0.0
     */
    Identifier getEntityTypeById(EntityType<?> entityType);
}
