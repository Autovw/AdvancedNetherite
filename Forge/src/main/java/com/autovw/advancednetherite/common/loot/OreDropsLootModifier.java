package com.autovw.advancednetherite.common.loot;

import com.autovw.advancednetherite.config.ConfigHelper;
import com.autovw.advancednetherite.core.ModItems;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import net.minecraft.util.RandomSource;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.storage.loot.parameters.LootContextParams;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraftforge.common.loot.LootModifier;
import org.jetbrains.annotations.NotNull;

// TODO rework loot modifiers
/**
 * A loot modifier for adding additional drops to blocks.
 * See {@link com.autovw.advancednetherite.datagen.providers.ModLootModifierProvider} for example implementation.
 * @apiNote This loot modifier can be disabled by {@link com.autovw.advancednetherite.config.Config.AdditionalDropsConfig#enableAdditionalOreDrops}
 * @author Autovw
 */
public class OreDropsLootModifier extends LootModifier
{
    public static final MapCodec<OreDropsLootModifier> CODEC = RecordCodecBuilder.mapCodec(instance -> codecStart(instance).apply(instance, OreDropsLootModifier::new));

    /**
     * Constructs a LootModifier.
     *
     * @param conditionsIn the ILootConditions that need to be matched before the loot is modified.
     */
    public OreDropsLootModifier(LootItemCondition[] conditionsIn)
    {
        super(conditionsIn);
    }

    @NotNull
    @Override
    protected ObjectArrayList<ItemStack> doApply(ObjectArrayList<ItemStack> generatedLoot, LootContext context)
    {
        ItemStack tool = context.getParamOrNull(LootContextParams.TOOL);
        BlockState blockState = context.getParamOrNull(LootContextParams.BLOCK_STATE);

        if (tool != null && blockState != null && ConfigHelper.get().getCommon().getAdditionalDrops().enableAdditionalOreDrops())
        {
            Block block = blockState.getBlock();
            Item toolItem = tool.getItem();
            RandomSource random = context.getRandom();

            if (tool.getEnchantmentLevel(Enchantments.SILK_TOUCH) > 0)
            {
                return generatedLoot; // return early if tool is enchanted with silk touch
            }

            if ((block == Blocks.IRON_ORE || block == Blocks.DEEPSLATE_IRON_ORE) && toolItem == ModItems.NETHERITE_IRON_PICKAXE && random.nextFloat() <= ConfigHelper.get().getServer().getAdditionalDropProperties().getAdditionalRawIronDropChance())
            {
                generatedLoot.add(new ItemStack(Items.RAW_IRON, random.nextIntBetweenInclusive(1, 2)));
            }
            if ((block == Blocks.GOLD_ORE || block == Blocks.DEEPSLATE_GOLD_ORE) && toolItem == ModItems.NETHERITE_GOLD_PICKAXE && random.nextFloat() <= ConfigHelper.get().getServer().getAdditionalDropProperties().getAdditionalRawGoldDropChance())
            {
                generatedLoot.add(new ItemStack(Items.RAW_GOLD, random.nextIntBetweenInclusive(1, 1)));
            }
            if ((block == Blocks.EMERALD_ORE || block == Blocks.DEEPSLATE_EMERALD_ORE) && toolItem == ModItems.NETHERITE_EMERALD_PICKAXE && random.nextFloat() <= ConfigHelper.get().getServer().getAdditionalDropProperties().getAdditionalEmeraldDropChance())
            {
                generatedLoot.add(new ItemStack(Items.EMERALD, random.nextIntBetweenInclusive(1, 1)));
            }
            if ((block == Blocks.DIAMOND_ORE || block == Blocks.DEEPSLATE_DIAMOND_ORE) && toolItem == ModItems.NETHERITE_DIAMOND_PICKAXE && random.nextFloat() <= ConfigHelper.get().getServer().getAdditionalDropProperties().getAdditionalDiamondDropChance())
            {
                generatedLoot.add(new ItemStack(Items.DIAMOND, random.nextIntBetweenInclusive(1, 1)));
            }

            if (block == Blocks.NETHER_GOLD_ORE && toolItem == ModItems.NETHERITE_GOLD_PICKAXE && random.nextFloat() <= ConfigHelper.get().getServer().getAdditionalDropProperties().getAdditionalGoldNuggetDropChance())
            {
                generatedLoot.add(new ItemStack(Items.GOLD_NUGGET, random.nextIntBetweenInclusive(1, 3)));
            }
        }
        return generatedLoot;
    }

    @Override
    public MapCodec<OreDropsLootModifier> codec()
    {
        return CODEC;
    }
}
