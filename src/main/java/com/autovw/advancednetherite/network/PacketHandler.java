package com.autovw.advancednetherite.network;

import com.autovw.advancednetherite.Reference;
import com.autovw.advancednetherite.network.message.PacifyEnderManPacket;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.network.NetworkDirection;
import net.minecraftforge.fml.network.NetworkRegistry;
import net.minecraftforge.fml.network.simple.SimpleChannel;

/**
 * Author: Autovw
 */
public class PacketHandler {
    private PacketHandler() {
    }

    private static final String PROTOCOL_VERSION = "1";

    public static final SimpleChannel INSTANCE = NetworkRegistry.newSimpleChannel(new ResourceLocation(Reference.MOD_ID, "main"), () -> PROTOCOL_VERSION, PROTOCOL_VERSION::equals, PROTOCOL_VERSION::equals);

    public static void init() {
        int index = 0;
        INSTANCE.messageBuilder(PacifyEnderManPacket.class, index++, NetworkDirection.PLAY_TO_CLIENT)
                .encoder(PacifyEnderManPacket::encode).decoder(PacifyEnderManPacket::new).consumer(PacifyEnderManPacket::handle).add();
    }
}
