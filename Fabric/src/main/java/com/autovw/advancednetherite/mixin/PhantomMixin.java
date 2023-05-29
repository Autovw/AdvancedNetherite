package com.autovw.advancednetherite.mixin;

import com.autovw.advancednetherite.api.impl.IAdvancedHooks;
import com.autovw.advancednetherite.common.item.AdvancedArmorItem;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.FlyingMob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.monster.Enemy;
import net.minecraft.world.entity.monster.Phantom;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

/**
 * @author Autovw
 */
@Mixin(Phantom.class)
public abstract class PhantomMixin extends FlyingMob implements Enemy
{
    protected PhantomMixin(EntityType<? extends FlyingMob> entityType, Level level)
    {
        super(entityType, level);
    }

    @Inject(method = "tick", at = @At("HEAD"), cancellable = true)
    private void advancednetherite_Phantom_tick(CallbackInfo ci)
    {
        Phantom phantom = (Phantom) (Object) this; // phantom (attacker)
        LivingEntity target = phantom.getTarget(); // phantom target (player)

        if (target == null)
            return;

        if (target instanceof Player)
        {
            // return early if the attacker was angered by the target (player)
            if (phantom.getLastHurtByMob() == target)
                return;

            for (ItemStack stack : target.getArmorSlots())
            {
                Item item = stack.getItem();
                if ((item instanceof AdvancedArmorItem && ((AdvancedArmorItem) item).pacifiesPhantoms()) || (item instanceof IAdvancedHooks && ((IAdvancedHooks) item).pacifyPhantoms(stack)))
                {
                    phantom.setTarget(null);
                }
            }
        }
    }
}
