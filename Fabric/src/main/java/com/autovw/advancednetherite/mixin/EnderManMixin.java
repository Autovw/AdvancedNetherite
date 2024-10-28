package com.autovw.advancednetherite.mixin;

import com.autovw.advancednetherite.api.impl.IAdvancedHooks;
import com.autovw.advancednetherite.common.item.AdvancedArmorItem;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.NeutralMob;
import net.minecraft.world.entity.monster.EnderMan;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

/**
 * @author Autovw
 */
@Mixin(EnderMan.class)
public abstract class EnderManMixin extends Monster implements NeutralMob
{
    protected EnderManMixin(EntityType<? extends Monster> entityType, Level level)
    {
        super(entityType, level);
    }

    @Inject(method = "isBeingStaredBy", at = @At("RETURN"), cancellable = true)
    private void advancednetherite_isBeingStaredBy(Player player, CallbackInfoReturnable<Boolean> cir)
    {
        if (cir.getReturnValue())
        {
            for (ItemStack stack : player.getArmorSlots())
            {
                Item item = stack.getItem();
                if ((item instanceof AdvancedArmorItem && ((AdvancedArmorItem) item).pacifiesEndermen()) || (item instanceof IAdvancedHooks && ((IAdvancedHooks) item).pacifyEndermen(stack)))
                {
                    cir.setReturnValue(false);
                }
            }
        }
    }
}
