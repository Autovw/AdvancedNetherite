package com.autovw.advancednetherite.common;

import com.autovw.advancednetherite.Reference;
import com.autovw.advancednetherite.api.annotation.Internal;
import com.autovw.advancednetherite.api.impl.IAdvancedHooks;
import com.autovw.advancednetherite.common.item.AdvancedArmorItem;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.monster.EnderMan;
import net.minecraft.world.entity.monster.Phantom;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.entity.living.EnderManAngerEvent;
import net.minecraftforge.event.entity.living.LivingSetAttackTargetEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

/**
 * Author: Autovw
 */
@Internal
@Mod.EventBusSubscriber(modid = Reference.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class EventHandler {

    @SuppressWarnings("unused")
    @SubscribeEvent
    public static void onEnderManAngerEvent(final EnderManAngerEvent event) {
        Player player = event.getPlayer(); // Gets the player (target)
        EnderMan enderMan = event.getEntity(); // Gets the enderman

        for (ItemStack stack : player.getArmorSlots()) {
            Item item = stack.getItem();
            // quick hook for AdvancedArmorItem
            if (item instanceof AdvancedArmorItem && ((AdvancedArmorItem) item).pacifiesEndermen()) {
                event.setCanceled(true); // Cancels the enderman anger if conditions are met
            }
            // hook for IAdvancedItem
            if (item instanceof IAdvancedHooks && ((IAdvancedHooks) item).pacifyEndermen(stack) && !(item instanceof AdvancedArmorItem && ((AdvancedArmorItem) item).pacifiesEndermen())) {
                event.setCanceled(true); // Cancels the enderman anger if conditions are met
            }
        }
    }

    @SuppressWarnings("unused")
    @SubscribeEvent
    public static void onLivingSetAttackTargetEvent(final LivingSetAttackTargetEvent event) {
        LivingEntity target = event.getTarget(); // Gets the target (player)
        Entity attacker = event.getEntity(); // Gets the attacker

        if (attacker instanceof Phantom phantom && target != null) {
            for (ItemStack stack : target.getArmorSlots()) {
                Item item = stack.getItem();
                // quick hook for AdvancedArmorItem
                if (item instanceof AdvancedArmorItem && ((AdvancedArmorItem) item).pacifiesPhantoms()) {
                    phantom.setTarget(null);// Set attacker target to null
                }
                // hook for IAdvancedItem
                if (item instanceof IAdvancedHooks && ((IAdvancedHooks) item).pacifyPhantoms(stack) && !(item instanceof AdvancedArmorItem && ((AdvancedArmorItem) item).pacifiesPhantoms())) {
                    phantom.setTarget(null); // Set attacker target to null
                }
            }
        }
    }
}
