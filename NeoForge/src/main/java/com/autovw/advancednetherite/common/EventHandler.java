package com.autovw.advancednetherite.common;

import com.autovw.advancednetherite.AdvancedNetherite;
import com.autovw.advancednetherite.api.annotation.Internal;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.monster.EnderMan;
import net.minecraft.world.entity.monster.Phantom;
import net.minecraft.world.entity.player.Player;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.living.EnderManAngerEvent;
import net.neoforged.neoforge.event.entity.living.LivingChangeTargetEvent;

/**
 * @author Autovw
 */
@Internal
@EventBusSubscriber(modid = AdvancedNetherite.MOD_ID)
public class EventHandler
{
    @SubscribeEvent
    public static void onEnderManAngerEvent(final EnderManAngerEvent event)
    {
        Player player = event.getPlayer(); // Gets the player (target)
        EnderMan enderMan = event.getEntity(); // Gets the enderman

        // return early if player is in creative mode
        if (player.isCreative())
            return;

        if (AdvancedUtil.isWearingEndermanPassiveArmor(player))
        {
            event.setCanceled(true); // Cancels the enderman anger if conditions are met
        }
    }

    @SubscribeEvent
    public static void onLivingChangeTargetEvent(final LivingChangeTargetEvent event)
    {
        LivingEntity target = event.getOriginalAboutToBeSetTarget(); // Gets the target (player)
        LivingEntity attacker = event.getEntity(); // Gets the attacker

        if (!(target instanceof Player player))
            return;

        // return early if the attacker was angered by the target (player)
        if (attacker.getLastHurtByMob() == target)
            return;

        if (attacker instanceof Phantom phantom)
        {
            if (AdvancedUtil.isWearingPhantomPassiveArmor(player))
            {
                event.setNewAboutToBeSetTarget(null); // Set target to null to allow the attacker to pick a new target
            }
        }
    }
}
