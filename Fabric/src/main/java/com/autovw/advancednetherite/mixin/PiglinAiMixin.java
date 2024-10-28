package com.autovw.advancednetherite.mixin;

import com.autovw.advancednetherite.api.impl.IAdvancedHooks;
import com.autovw.advancednetherite.common.item.AdvancedArmorItem;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.monster.piglin.PiglinAi;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
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
    @Inject(method = "isWearingSafeArmor", at = @At("HEAD"), cancellable = true)
    private static void advancednetherite_isWearingSafeArmor(LivingEntity entity, CallbackInfoReturnable<Boolean> cir)
    {
        for (ItemStack stack : entity.getArmorSlots())
        {
            Item item = stack.getItem();
            if ((item instanceof AdvancedArmorItem && ((AdvancedArmorItem) item).pacifiesPiglins()) || (item instanceof IAdvancedHooks && ((IAdvancedHooks) item).pacifyPiglins(stack)))
            {
                cir.setReturnValue(true);
            }
        }
    }
}
