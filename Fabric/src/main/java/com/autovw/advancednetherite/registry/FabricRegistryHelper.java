package com.autovw.advancednetherite.registry;

import com.autovw.advancednetherite.helper.IRegistryHelper;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

/**
 * @author Autovw
 */
public final class FabricRegistryHelper implements IRegistryHelper
{
    @Override
    public Identifier getBlockById(Block block)
    {
        return BuiltInRegistries.BLOCK.getKey(block);
    }

    @Override
    public Identifier getItemById(Item item)
    {
        return BuiltInRegistries.ITEM.getKey(item);
    }

    @Override
    public Identifier getMobEffectById(MobEffect mobEffect)
    {
        return BuiltInRegistries.MOB_EFFECT.getKey(mobEffect);
    }

    @Override
    public Identifier getSoundEventById(SoundEvent soundEvent)
    {
        return BuiltInRegistries.SOUND_EVENT.getKey(soundEvent);
    }

    @Override
    public Identifier getEntityTypeById(EntityType<?> entityType)
    {
        return BuiltInRegistries.ENTITY_TYPE.getKey(entityType);
    }
}
