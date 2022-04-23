package com.autovw.advancednetherite.common.loot;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.loot.LootContext;
import net.minecraft.loot.LootParameters;
import net.minecraft.loot.conditions.ILootCondition;
import net.minecraft.util.JSONUtils;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.loot.GlobalLootModifierSerializer;
import net.minecraftforge.common.loot.LootModifier;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Author: Autovw
 * <br/>
 * A loot modifier for adding additional crops to entities.
 * See {@link com.autovw.advancednetherite.datagen.providers.ModLootModifierProvider} for example implementation.
 */
public class MobDropsLootModifier extends LootModifier {
    private final List<Item> weapons;
    private final Item bonusDropItem;
    private final float bonusDropChance;
    private final int minDropAmount, maxDropAmount;

    /**
     * Constructs a LootModifier.
     *
     * @param conditionsIn the ILootConditions that need to be matched before the loot is modified.
     */
    public MobDropsLootModifier(ILootCondition[] conditionsIn, List<Item> weapons, Item bonusDropItem, float bonusDropChance, int minDropAmount, int maxDropAmount) {
        super(conditionsIn);
        this.weapons = weapons;
        this.bonusDropItem = bonusDropItem;
        this.bonusDropChance = bonusDropChance;
        this.minDropAmount = minDropAmount;
        this.maxDropAmount = maxDropAmount;
    }

    @Override
    protected List<ItemStack> doApply(List<ItemStack> generatedLoot, LootContext context) {
        Entity killer = context.getParamOrNull(LootParameters.KILLER_ENTITY);
        if (killer instanceof PlayerEntity) {
            PlayerEntity player = (PlayerEntity) killer;
            ItemStack useItem = player.getMainHandItem(); // used to check if the player uses the correct weapon
            for (Item weapon : weapons) {
                if (useItem.sameItem(weapon.getDefaultInstance()) && bonusDropChance > 0.0 && bonusDropItem != null) {
                    Random random = context.getRandom(); // random generator
                    if (maxDropAmount >= minDropAmount && random.nextFloat() <= bonusDropChance) { // apply chance
                        generatedLoot.add(new ItemStack(bonusDropItem, random.ints(minDropAmount, maxDropAmount + 1).iterator().nextInt()));
                    }
                }
            }
        }
        return generatedLoot;
    }

    public static class Serializer extends GlobalLootModifierSerializer<MobDropsLootModifier> {

        @Override
        public MobDropsLootModifier read(ResourceLocation location, JsonObject object, ILootCondition[] ailootcondition) {
            List<Item> weapons = new ArrayList<>();
            JsonArray weaponArray = JSONUtils.getAsJsonArray(object, "weapons");

            for (JsonElement weapon : weaponArray) {
                weapons.add(ForgeRegistries.ITEMS.getValue(new ResourceLocation(weapon.getAsString())));
            }

            Item bonusDropItem = ForgeRegistries.ITEMS.getValue(new ResourceLocation(JSONUtils.getAsString(object, "bonus_drop_item")));
            float bonusDropChance = JSONUtils.getAsFloat(object, "bonus_drop_chance");
            int minDropAmount = JSONUtils.getAsInt(object, "min_drop_amount");
            int maxDropAmount = JSONUtils.getAsInt(object, "max_drop_amount");

            return new MobDropsLootModifier(ailootcondition, weapons, bonusDropItem, bonusDropChance, minDropAmount, maxDropAmount);
        }

        @Override
        public JsonObject write(MobDropsLootModifier instance) {
            JsonObject object = makeConditions(instance.conditions);
            JsonArray weaponArray = new JsonArray(); // create array for allowed weapons
            for (Item weapon : instance.weapons) {
                weaponArray.add(ForgeRegistries.ITEMS.getKey(weapon).toString());
            }
            object.add("weapons", weaponArray); // add json array containing allowed weapons
            object.addProperty("bonus_drop_item", ForgeRegistries.ITEMS.getKey(instance.bonusDropItem).toString());
            object.addProperty("bonus_drop_chance", instance.bonusDropChance);
            object.addProperty("min_drop_amount", instance.minDropAmount);
            object.addProperty("max_drop_amount", instance.maxDropAmount);
            return object;
        }
    }
}
