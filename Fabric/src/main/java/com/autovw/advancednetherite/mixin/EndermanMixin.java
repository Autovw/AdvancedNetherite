package com.autovw.advancednetherite.mixin;

import com.autovw.advancednetherite.common.AdvancedUtil;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.NeutralMob;
import net.minecraft.world.entity.monster.Enderman;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

/**
 * @author Autovw
 */
@Mixin(Enderman.class)
public abstract class EndermanMixin extends Monster implements NeutralMob
{
    protected EndermanMixin(EntityType<? extends Monster> entityType, Level level)
    {
        super(entityType, level);
    }

    @Inject(method = "isBeingStaredBy", at = @At("RETURN"), cancellable = true)
    private void advancednetherite_isBeingStaredBy(Player player, CallbackInfoReturnable<Boolean> cir)
    {
        if (cir.getReturnValue())
        {
            if (AdvancedUtil.isWearingEndermanPassiveArmor(player))
            {
                cir.setReturnValue(false);
            }
        }
    }
}
