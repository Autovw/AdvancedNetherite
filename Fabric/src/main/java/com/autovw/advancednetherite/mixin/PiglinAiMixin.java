package com.autovw.advancednetherite.mixin;

import com.autovw.advancednetherite.common.AdvancedUtil;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.monster.piglin.PiglinAi;
import net.minecraft.world.entity.player.Player;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

/**
 * @author Autovw
 */
@Mixin(PiglinAi.class)
public class PiglinAiMixin
{
    @Inject(method = "isWearingGold", at = @At("HEAD"), cancellable = true)
    private static void advancednetherite_isWearingGold(LivingEntity entity, CallbackInfoReturnable<Boolean> cir)
    {
        if (!(entity instanceof Player player))
            return;

        if (AdvancedUtil.isWearingPiglinPassiveArmor(player))
        {
            cir.setReturnValue(true);
        }
    }
}
