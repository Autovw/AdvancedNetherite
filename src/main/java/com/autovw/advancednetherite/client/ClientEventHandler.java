package com.autovw.advancednetherite.client;

import com.autovw.advancednetherite.Reference;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.sound.PlaySoundEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

/**
 * Author: Autovw
 */
@Mod.EventBusSubscriber(modid = Reference.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE, value = Dist.CLIENT)
public class ClientEventHandler {
    private static boolean cancelStareSoundEvent;

    public static boolean updateSoundEvent(boolean update) {
        if (update) return cancelStareSoundEvent = true;
        return false;
    }

    @SuppressWarnings("unused")
    @SubscribeEvent
    public static void onPlaySoundEvent(final PlaySoundEvent event) {
        // This will cancel the stare sound produced by endermens if their target is null
        if (cancelStareSoundEvent && event.getSound().getLocation().equals(SoundEvents.ENDERMAN_STARE.getLocation())) {
            event.setResultSound(null);
        }
    }
}
