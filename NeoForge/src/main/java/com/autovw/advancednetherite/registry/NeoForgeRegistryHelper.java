package com.autovw.advancednetherite.registry;

import com.autovw.advancednetherite.api.annotation.Internal;
import com.autovw.advancednetherite.helper.IRegistryHelper;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

/**
 * @author Autovw
 */
@Internal
public class NeoForgeRegistryHelper implements IRegistryHelper
{
    @Override
    public ResourceLocation getBlockById(Block block)
    {
        return BuiltInRegistries.BLOCK.getKey(block);
    }

    @Override
    public ResourceLocation getItemById(Item item)
    {
        return BuiltInRegistries.ITEM.getKey(item);
    }

    @Override
    public ResourceLocation getMobEffectById(MobEffect mobEffect)
    {
        return BuiltInRegistries.MOB_EFFECT.getKey(mobEffect);
    }

    @Override
    public ResourceLocation getSoundEventById(SoundEvent soundEvent)
    {
        return BuiltInRegistries.SOUND_EVENT.getKey(soundEvent);
    }

    @Override
    public ResourceLocation getEntityTypeById(EntityType<?> entityType)
    {
        return BuiltInRegistries.ENTITY_TYPE.getKey(entityType);
    }
}
