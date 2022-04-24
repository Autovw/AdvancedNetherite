package com.autovw.advancednetherite.client;

import com.autovw.advancednetherite.AdvancedNetherite;
import com.autovw.advancednetherite.Reference;
import com.autovw.advancednetherite.api.annotation.Internal;
import com.autovw.advancednetherite.core.ModItems;
import com.redlimerl.detailab.api.DetailArmorBarAPI;
import com.redlimerl.detailab.api.render.ArmorBarRenderManager;
import com.redlimerl.detailab.api.render.TextureOffset;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ItemStack;

/**
 * Author: Autovw
 * <br/>
 * Support class for Detail Armor Bar mod
 */
@Internal
public class DetailArmorBarSupport {
    protected static final ResourceLocation ARMOR_BAR_TEXTURE = new ResourceLocation(Reference.MOD_ID, "textures/armor_bar/armor_bar.png");

    public static void register() {
        AdvancedNetherite.LOGGER.debug("Support for 'Detail Armor Bar' will be registered");

        TextureOffset full = new TextureOffset(9, 0);
        TextureOffset half = new TextureOffset(0, 0);

        ArmorItem[] netheriteIronSet = {(ArmorItem) ModItems.NETHERITE_IRON_HELMET.get(), (ArmorItem) ModItems.NETHERITE_IRON_CHESTPLATE.get(), (ArmorItem) ModItems.NETHERITE_IRON_LEGGINGS.get(), (ArmorItem) ModItems.NETHERITE_IRON_BOOTS.get()};
        ArmorItem[] netheriteGoldSet = {(ArmorItem) ModItems.NETHERITE_GOLD_HELMET.get(), (ArmorItem) ModItems.NETHERITE_GOLD_CHESTPLATE.get(), (ArmorItem) ModItems.NETHERITE_GOLD_LEGGINGS.get(), (ArmorItem) ModItems.NETHERITE_GOLD_BOOTS.get()};
        ArmorItem[] netheriteEmeraldSet = {(ArmorItem) ModItems.NETHERITE_EMERALD_HELMET.get(), (ArmorItem) ModItems.NETHERITE_EMERALD_CHESTPLATE.get(), (ArmorItem) ModItems.NETHERITE_EMERALD_LEGGINGS.get(), (ArmorItem) ModItems.NETHERITE_EMERALD_BOOTS.get()};
        ArmorItem[] netheriteDiamondSet = {(ArmorItem) ModItems.NETHERITE_DIAMOND_HELMET.get(), (ArmorItem) ModItems.NETHERITE_DIAMOND_CHESTPLATE.get(), (ArmorItem) ModItems.NETHERITE_DIAMOND_LEGGINGS.get(), (ArmorItem) ModItems.NETHERITE_DIAMOND_BOOTS.get()};

        DetailArmorBarAPI.customArmorBarBuilder().armor(netheriteIronSet)
                .render((ItemStack stack) -> new ArmorBarRenderManager(ARMOR_BAR_TEXTURE, 72, 9, new TextureOffset(9, 9), new TextureOffset(0, 9), full, half))
                .register();

        DetailArmorBarAPI.customArmorBarBuilder().armor(netheriteGoldSet)
                .render((ItemStack stack) -> new ArmorBarRenderManager(ARMOR_BAR_TEXTURE, 72, 9, new TextureOffset(27, 9), new TextureOffset(18, 9), full, half))
                .register();

        DetailArmorBarAPI.customArmorBarBuilder().armor(netheriteEmeraldSet)
                .render((ItemStack stack) -> new ArmorBarRenderManager(ARMOR_BAR_TEXTURE, 72, 9, new TextureOffset(45, 9), new TextureOffset(36, 9), full, half))
                .register();

        DetailArmorBarAPI.customArmorBarBuilder().armor(netheriteDiamondSet)
                .render((ItemStack stack) -> new ArmorBarRenderManager(ARMOR_BAR_TEXTURE, 72, 9, new TextureOffset(63, 9), new TextureOffset(54, 9), full, half))
                .register();
    }
}
