package com.autovw.advancednetherite.common;

import com.autovw.advancednetherite.AdvancedNetherite;
import com.autovw.advancednetherite.api.annotation.Internal;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.monster.EnderMan;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.monster.Phantom;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.event.entity.living.LivingChangeTargetEvent;
import net.minecraftforge.event.entity.living.MonsterDisguiseEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

/**
 * @author Autovw
 */
@Internal
@Mod.EventBusSubscriber(modid = AdvancedNetherite.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class EventHandler
{
    @SubscribeEvent
    public static void onMonsterDisguiseEvent(final MonsterDisguiseEvent event)
    {
        Player player = event.getPlayer(); // Gets the player (target)
        Monster monster = event.getEntity(); // Gets the enderman

        if (!(monster instanceof EnderMan enderMan))
            return;

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
        LivingEntity target = event.getOriginalTarget(); // Gets the target (player)
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
                event.setNewTarget(null); // Set target to null to allow the attacker to pick a new target
            }
        }
    }
}
