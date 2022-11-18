package com.autovw.advancednetherite.common;

import com.autovw.advancednetherite.Reference;
import com.autovw.advancednetherite.api.annotation.Internal;
import com.autovw.advancednetherite.api.impl.IAdvancedHooks;
import com.autovw.advancednetherite.common.item.AdvancedArmorItem;
import com.autovw.advancednetherite.config.Config;
import com.autovw.advancednetherite.core.ModToolTiers;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.monster.EnderMan;
import net.minecraft.world.entity.monster.Phantom;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.DiggerItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.event.entity.living.EnderManAngerEvent;
import net.minecraftforge.event.entity.living.LivingChangeTargetEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

/**
 * @author Autovw
 */
@Internal
@Mod.EventBusSubscriber(modid = Reference.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class EventHandler {

    @SuppressWarnings("unused")
    @SubscribeEvent
    public static void onEnderManAngerEvent(final EnderManAngerEvent event) {
        Player player = event.getPlayer(); // Gets the player (target)
        EnderMan enderMan = event.getEntity(); // Gets the enderman

        // return early if player is in creative mode
        if (player.isCreative())
            return;

        for (ItemStack stack : player.getArmorSlots()) {
            Item item = stack.getItem();
            if ((item instanceof AdvancedArmorItem && ((AdvancedArmorItem) item).pacifiesEndermen()) || (item instanceof IAdvancedHooks && ((IAdvancedHooks) item).pacifyEndermen(stack))) {
                event.setCanceled(true); // Cancels the enderman anger if conditions are met
            }
        }
    }

    @SuppressWarnings("unused")
    @SubscribeEvent
    public static void onLivingChangeTargetEvent(final LivingChangeTargetEvent event) {
        LivingEntity target = event.getOriginalTarget(); // Gets the target (player)
        LivingEntity attacker = event.getEntityLiving(); // Gets the attacker

        if (target == null)
            return;

        // return early if the attacker was angered by the target (player)
        if (attacker.getLastHurtByMob() == target)
            return;

        if (attacker instanceof Phantom phantom) {
            for (ItemStack stack : target.getArmorSlots()) {
                Item item = stack.getItem();
                if ((item instanceof AdvancedArmorItem && ((AdvancedArmorItem) item).pacifiesPhantoms()) || (item instanceof IAdvancedHooks && ((IAdvancedHooks) item).pacifyPhantoms(stack))) {
                    event.setNewTarget(null); // Set target to null to allow the attacker to pick a new target
                }
            }
        }
    }

    @SuppressWarnings("unused")
    @SubscribeEvent
    public static void onPlayerEventBreakSpeed(final PlayerEvent.BreakSpeed event) {
        BlockState state = event.getState(); // Gets the block state affected
        Player player = event.getPlayer(); // Gets the player
        ItemStack stack = player.getItemInHand(InteractionHand.MAIN_HAND); // The tool being used

        if (!(stack.getItem() instanceof DiggerItem diggerItem))
            return;

        if (state == null)
            return;

        if (diggerItem.isCorrectToolForDrops(stack, state)) {
            Tier tier = diggerItem.getTier();
            float speed = event.getOriginalSpeed();

            if (tier == ModToolTiers.NETHERITE_IRON)
                speed *= Config.ToolProperties.ironBreakingSpeedMultiplier.get();
            if (tier == ModToolTiers.NETHERITE_GOLD)
                speed *= Config.ToolProperties.goldBreakingSpeedMultiplier.get();
            if (tier == ModToolTiers.NETHERITE_EMERALD)
                speed *= Config.ToolProperties.emeraldBreakingSpeedMultiplier.get();
            if (tier == ModToolTiers.NETHERITE_DIAMOND)
                speed *= Config.ToolProperties.diamondBreakingSpeedMultiplier.get();

            event.setNewSpeed(speed); // set the new tool speed
        }
    }
}
