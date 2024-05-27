package com.autovw.advancednetherite.api;

import com.autovw.advancednetherite.AdvancedNetherite;
import com.autovw.advancednetherite.api.annotation.Internal;
import com.mojang.logging.LogUtils;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Logger;

/**
 * A flexible builder for translatable tooltips.
 * Replacement of the Tooltips API, which was removed in MC 1.19, allowing for more control over the created tooltip.
 *
 * @since 1.12.0
 * @author Autovw
 */
public class TooltipBuilder
{
    private static final Logger LOGGER = LogUtils.getLogger();

    private TooltipBuilder()
    {
    }

    /**
     * Used to create a translatable tooltip.
     * Not setting the mod id will result in the tooltip being registered under the default <i>minecraft</i> namespace.
     * If the tooltip name is empty, {@link #build(ResourceLocation, Object...)} will throw a {@link IllegalStateException}.
     *
     * Use {@link #create(ResourceLocation, Object...)} if the tooltip should contain other sub-elements.
     *
     * @param key name of the tooltip
     * @return a MutableComponent
     */
    public static MutableComponent create(ResourceLocation key)
    {
        return build(key, (Object) null);
    }

    /**
     * Used to create a translatable tooltip.
     * Not setting the mod id will result in the tooltip being registered under the default <i>minecraft</i> namespace.
     * If the tooltip name is empty, {@link #build(ResourceLocation, Object...)} will throw a {@link IllegalStateException}.
     *
     * @param key name of the tooltip
     * @param args sub-elements
     * @return a MutableComponent
     */
    public static MutableComponent create(ResourceLocation key, Object... args)
    {
        return build(key, args);
    }

    /**
     * Builder used for internal purposes only.
     */
    @Internal
    private static MutableComponent build(ResourceLocation key, @Nullable Object... args)
    {
        String content = "tooltip." + key.getNamespace() + "." + key.getPath();
        if (!content.endsWith("."))
        {
            if (makeArgs(args))
            {
                return Component.translatable(content, args);
            }
            return Component.translatable(content);
        }
        else
        {
            LOGGER.error("Cannot build tooltip ending with a dot (" + content + ")");
            if (!AdvancedNetherite.getPlatformHelper().isProduction())
            {
                throw new IllegalStateException("Tried to build tooltip with incomplete name!");
            }
            return Component.empty();
        }
    }

    @Internal
    private static boolean makeArgs(Object... args)
    {
        // Varargs always contain at least one entry
        // Therefore, we can't do (args != null) as it will always return true
        // So we attempt to loop through the varargs to check for the actual values
        for (Object arg : args)
        {
            if (arg != null)
            {
                return true;
            }
        }
        return false;
    }
}
