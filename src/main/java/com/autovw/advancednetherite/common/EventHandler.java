package com.autovw.advancednetherite.common;

import com.autovw.advancednetherite.Reference;
import com.autovw.advancednetherite.common.item.AdvancedArmorItem;
import com.autovw.advancednetherite.network.PacketHandler;
import com.autovw.advancednetherite.network.message.PacifyEnderManPacket;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.monster.EnderMan;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingSetAttackTargetEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fmllegacy.network.PacketDistributor;

import java.util.Objects;

/**
 * Author: Autovw
 */
@Mod.EventBusSubscriber(modid = Reference.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class EventHandler {
    private static boolean cancelStareSoundEvent;

    @SuppressWarnings("unused")
    @SubscribeEvent
    public static void onLivingSetAttackTargetEvent(final LivingSetAttackTargetEvent event) {
        // Gets the attacker
        Entity attacker = event.getEntity();
        // Gets the target (a player)
        LivingEntity target = event.getTarget();

        // Checks if the attacker is an EnderMan and if the target/player is not null
        if (attacker instanceof EnderMan enderMan && target != null) {
            for (ItemStack stack : target.getArmorSlots()) {
                Item item = stack.getItem();
                if (item instanceof AdvancedArmorItem && ((AdvancedArmorItem) item).pacifiesEndermen()) {
                    // Sets the attacker target to null
                    enderMan.setTarget(null);
                    // The stare sound will be muted by another event
                    cancelStareSoundEvent = true;
                    // Sends packet to the client in order to mute the enderman stare
                    PacketHandler.INSTANCE.send(PacketDistributor.PLAYER.with(() ->
                                    Objects.requireNonNull(target.getServer()).getPlayerList().getPlayer(target.getUUID())),
                            new PacifyEnderManPacket(cancelStareSoundEvent));
                } else {
                    cancelStareSoundEvent = false;
                }
            }
        }
    }
}
