package com.autovw.advancednetherite.client;

import com.autovw.advancednetherite.AdvancedNetherite;
import com.autovw.advancednetherite.api.annotation.Internal;
import com.autovw.advancednetherite.core.ModItems;
import com.redlimerl.detailab.api.DetailArmorBarAPI;
import com.redlimerl.detailab.api.render.ArmorBarRenderManager;
import com.redlimerl.detailab.api.render.TextureOffset;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ItemStack;

/**
 * Support class for Detail Armor Bar mod
 * @author Autovw
 */
public class DetailArmorBarSupport
{
    public static final ResourceLocation ARMOR_BAR_TEXTURE = ResourceLocation.fromNamespaceAndPath(AdvancedNetherite.MOD_ID, "textures/armor_bar/armor_bar.png");

    @Internal
    public static void register()
    {
        TextureOffset full = new TextureOffset(9, 0);
        TextureOffset half = new TextureOffset(0, 0);

        ArmorItem[] netheriteIronSet = {(ArmorItem) ModItems.NETHERITE_IRON_HELMET, (ArmorItem) ModItems.NETHERITE_IRON_CHESTPLATE, (ArmorItem) ModItems.NETHERITE_IRON_LEGGINGS, (ArmorItem) ModItems.NETHERITE_IRON_BOOTS};
        ArmorItem[] netheriteGoldSet = {(ArmorItem) ModItems.NETHERITE_GOLD_HELMET, (ArmorItem) ModItems.NETHERITE_GOLD_CHESTPLATE, (ArmorItem) ModItems.NETHERITE_GOLD_LEGGINGS, (ArmorItem) ModItems.NETHERITE_GOLD_BOOTS};
        ArmorItem[] netheriteEmeraldSet = {(ArmorItem) ModItems.NETHERITE_EMERALD_HELMET, (ArmorItem) ModItems.NETHERITE_EMERALD_CHESTPLATE, (ArmorItem) ModItems.NETHERITE_EMERALD_LEGGINGS, (ArmorItem) ModItems.NETHERITE_EMERALD_BOOTS};
        ArmorItem[] netheriteDiamondSet = {(ArmorItem) ModItems.NETHERITE_DIAMOND_HELMET, (ArmorItem) ModItems.NETHERITE_DIAMOND_CHESTPLATE, (ArmorItem) ModItems.NETHERITE_DIAMOND_LEGGINGS, (ArmorItem) ModItems.NETHERITE_DIAMOND_BOOTS};

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
