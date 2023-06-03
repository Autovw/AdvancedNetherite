package com.autovw.advancednetherite.mixin;

import com.autovw.advancednetherite.common.item.AdvancedArmorItem;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Equipable;
import net.minecraft.world.item.Item;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.EnumMap;
import java.util.UUID;

/**
 * Mixin for adding knockback resistance to armor
 * @author Autovw
 */
@Mixin(ArmorItem.class)
public abstract class ArmorItemMixin implements Equipable
{
    @Shadow
    @Final
    private static EnumMap<ArmorItem.Type, UUID> ARMOR_MODIFIER_UUID_PER_TYPE;

    @Shadow
    @Final
    @Mutable
    private Multimap<Attribute, AttributeModifier> defaultModifiers;

    @Shadow
    @Final
    protected float knockbackResistance;

    @Inject(method = "<init>", at = @At(value = "RETURN"))
    private void advancednetherite_ArmorItem(ArmorMaterial armorMaterial, ArmorItem.Type armorType, Item.Properties properties, CallbackInfo ci)
    {
        UUID uuid = ARMOR_MODIFIER_UUID_PER_TYPE.get(armorType);
        ArmorItem armorItem = (ArmorItem) (Object) this;

        if (armorItem instanceof AdvancedArmorItem && this.knockbackResistance > 0)
        {
            ImmutableMultimap.Builder<Attribute, AttributeModifier> builder = ImmutableMultimap.builder();

            this.defaultModifiers.forEach(builder::put);

            builder.put(Attributes.KNOCKBACK_RESISTANCE, new AttributeModifier(uuid, "Armor knockback resistance", this.knockbackResistance, AttributeModifier.Operation.ADDITION));

            this.defaultModifiers = builder.build();
        }
    }
}
