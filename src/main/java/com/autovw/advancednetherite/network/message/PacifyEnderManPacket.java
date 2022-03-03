package com.autovw.advancednetherite.network.message;

import com.autovw.advancednetherite.client.ClientEventHandler;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.network.NetworkEvent;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Supplier;

/**
 * Author: Autovw
 */
public class PacifyEnderManPacket {
    public final boolean pacifyEnderMan;

    public PacifyEnderManPacket(boolean pacifyEnderMan) {
        this.pacifyEnderMan = pacifyEnderMan;
    }

    public PacifyEnderManPacket(FriendlyByteBuf buffer) {
        this(buffer.readBoolean());
    }

    public void encode(FriendlyByteBuf buffer) {
        buffer.writeBoolean(this.pacifyEnderMan);
    }

    public boolean handle(Supplier<NetworkEvent.Context> context) {
        var success = new AtomicBoolean(false);
        context.get().enqueueWork(() -> {
            DistExecutor.unsafeRunWhenOn(Dist.CLIENT, () -> () -> success.set(ClientEventHandler.updateSoundEvent(this.pacifyEnderMan)));
        });
        context.get().setPacketHandled(true);
        return success.get();
    }
}
