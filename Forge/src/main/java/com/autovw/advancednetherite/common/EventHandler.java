package com.autovw.advancednetherite.common;

import com.autovw.advancednetherite.AdvancedNetherite;
import com.autovw.advancednetherite.api.annotation.Internal;
import com.autovw.advancednetherite.api.impl.IAdvancedHooks;
import com.autovw.advancednetherite.common.item.AdvancedArmorItem;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.monster.EnderMan;
import net.minecraft.world.entity.monster.Phantom;
import net.minecraft.world.entity.monster.piglin.Piglin;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.entity.living.EnderManAngerEvent;
import net.minecraftforge.event.entity.living.LivingChangeTargetEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

/**
 * @author Autovw
 */
@Internal
@Mod.EventBusSubscriber(modid = AdvancedNetherite.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class EventHandler
{
    @SuppressWarnings("unused")
    @SubscribeEvent
    public static void onEnderManAngerEvent(final EnderManAngerEvent event)
    {
        Player player = event.getPlayer(); // Gets the player (target)
        EnderMan enderMan = event.getEntity(); // Gets the enderman

        // return early if player is in creative mode
        if (player.isCreative())
            return;

        for (ItemStack stack : player.getArmorSlots())
        {
            Item item = stack.getItem();
            if ((item instanceof AdvancedArmorItem && ((AdvancedArmorItem) item).pacifiesEndermen()) || (item instanceof IAdvancedHooks && ((IAdvancedHooks) item).pacifyEndermen(stack)))
            {
                event.setCanceled(true); // Cancels the enderman anger if conditions are met
            }
        }
    }

    @SuppressWarnings("unused")
    @SubscribeEvent
    public static void onLivingChangeTargetEvent(final LivingChangeTargetEvent event)
    {
        LivingEntity target = event.getOriginalTarget(); // Gets the target (player)
        LivingEntity attacker = event.getEntity(); // Gets the attacker

        if (target == null)
            return;

        // return early if the attacker was angered by the target (player)
        if (attacker.getLastHurtByMob() == target)
            return;

        if (attacker instanceof Phantom phantom)
        {
            for (ItemStack stack : target.getArmorSlots())
            {
                Item item = stack.getItem();
                if ((item instanceof AdvancedArmorItem && ((AdvancedArmorItem) item).pacifiesPhantoms()) || (item instanceof IAdvancedHooks && ((IAdvancedHooks) item).pacifyPhantoms(stack)))
                {
                    event.setNewTarget(null); // Set target to null to allow the attacker to pick a new target
                }
            }
        }

        if (attacker instanceof Piglin piglin)
        {
            for (ItemStack stack : target.getArmorSlots())
            {
                Item item = stack.getItem();
                if ((item instanceof AdvancedArmorItem && ((AdvancedArmorItem) item).pacifiesPiglins()) || (item instanceof IAdvancedHooks && ((IAdvancedHooks) item).pacifyPiglins(stack)))
                {
                    event.setCanceled(true); // TODO figure out how to reliably use event
                }
            }
        }
    }
}
