package com.autovw.advancednetherite.common.loot;

import com.autovw.advancednetherite.config.Config;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.GsonHelper;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.storage.loot.parameters.LootContextParams;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraftforge.common.loot.GlobalLootModifierSerializer;
import net.minecraftforge.common.loot.LootModifier;
import net.minecraftforge.registries.ForgeRegistries;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Autovw
 * <br/>
 * A loot modifier for adding additional crops to entities.
 * See {@link com.autovw.advancednetherite.datagen.providers.ModLootModifierProvider} for example implementation.
 * @apiNote This loot modifier can be disabled by {@link com.autovw.advancednetherite.config.Config.AdditionalDropsConfig#enableAdditionalMobDrops}
 */
public class MobDropsLootModifier extends LootModifier {
    private final EntityType<?> entity;
    private final List<Item> weapons;
    private final Item bonusDropItem;
    private final float bonusDropChance;
    private final int minDropAmount, maxDropAmount;

    /**
     * Constructs a LootModifier.
     *
     * @param conditionsIn the ILootConditions that need to be matched before the loot is modified.
     * @param entity the entity killed
     * @param weapons the weapons this modifier works for
     * @param bonusDropItem the bonus item which should be dropped
     * @param bonusDropChance the chance of the bonus item dropping
     * @param minDropAmount the minimum amount of items to be dropped
     * @param maxDropAmount the maximum amount of items to be dropped
     */
    public MobDropsLootModifier(LootItemCondition[] conditionsIn, EntityType<?> entity, List<Item> weapons, Item bonusDropItem, float bonusDropChance, int minDropAmount, int maxDropAmount) {
        super(conditionsIn);
        this.entity = entity;
        this.weapons = weapons;
        this.bonusDropItem = bonusDropItem;
        this.bonusDropChance = bonusDropChance;
        this.minDropAmount = minDropAmount;
        this.maxDropAmount = maxDropAmount;
    }

    @NotNull
    @Override
    protected ObjectArrayList<ItemStack> doApply(ObjectArrayList<ItemStack> generatedLoot, LootContext context) {
        Entity killer = context.getParamOrNull(LootContextParams.KILLER_ENTITY); // the entity killer
        Entity victim = context.getParamOrNull(LootContextParams.THIS_ENTITY); // killed entity
        if (killer instanceof Player player && entity != null && Config.AdditionalDropsConfig.enableAdditionalMobDrops.get()) {
            if (victim != null && entity.equals(victim.getType())) { // check if the killed entity is in fact the entity specified in the loot modifier
                ItemStack useItem = player.getMainHandItem(); // used to check if the player uses the correct weapon
                for (Item weapon : weapons) {
                    if (useItem.is(weapon) && bonusDropChance > 0.0 && bonusDropItem != null) {
                        RandomSource random = context.getRandom(); // random generator
                        if (maxDropAmount >= minDropAmount && random.nextFloat() <= bonusDropChance) { // apply chance
                            generatedLoot.add(new ItemStack(bonusDropItem, random.nextIntBetweenInclusive(minDropAmount, maxDropAmount + 1)));
                        }
                    }
                }
            }
        }
        return generatedLoot;
    }

    public static class Serializer extends GlobalLootModifierSerializer<MobDropsLootModifier> {

        @Override
        public MobDropsLootModifier read(ResourceLocation location, JsonObject object, LootItemCondition[] ailootcondition) {
            EntityType<?> entity = ForgeRegistries.ENTITIES.getValue(new ResourceLocation(GsonHelper.getAsString(object, "entity")));

            List<Item> weapons = new ArrayList<>();
            JsonObject bonusDropObject = GsonHelper.getAsJsonObject(object, "bonus_drop");
            JsonArray weaponArray = GsonHelper.getAsJsonArray(bonusDropObject, "weapons");

            for (JsonElement weapon : weaponArray) {
                weapons.add(ForgeRegistries.ITEMS.getValue(new ResourceLocation(weapon.getAsString())));
            }

            Item bonusDropItem = ForgeRegistries.ITEMS.getValue(new ResourceLocation(GsonHelper.getAsString(bonusDropObject, "item")));
            float bonusDropChance = GsonHelper.getAsFloat(bonusDropObject, "chance");
            int minDropAmount = GsonHelper.getAsInt(bonusDropObject, "min");
            int maxDropAmount = GsonHelper.getAsInt(bonusDropObject, "max");

            return new MobDropsLootModifier(ailootcondition, entity, weapons, bonusDropItem, bonusDropChance, minDropAmount, maxDropAmount);
        }

        @Override
        public JsonObject write(MobDropsLootModifier instance) {
            JsonObject object = makeConditions(instance.conditions);
            JsonObject bonusDropObject = new JsonObject();

            object.addProperty("entity", ForgeRegistries.ENTITIES.getKey(instance.entity).toString());

            JsonArray weaponArray = new JsonArray(); // create array for allowed weapons
            for (Item weapon : instance.weapons) {
                weaponArray.add(ForgeRegistries.ITEMS.getKey(weapon).toString());
            }

            object.add("bonus_drop", bonusDropObject);

            bonusDropObject.add("weapons", weaponArray); // add json array containing allowed weapons
            bonusDropObject.addProperty("item", ForgeRegistries.ITEMS.getKey(instance.bonusDropItem).toString());
            bonusDropObject.addProperty("chance", instance.bonusDropChance);
            bonusDropObject.addProperty("min", instance.minDropAmount);
            bonusDropObject.addProperty("max", instance.maxDropAmount);
            return object;
        }
    }
}
