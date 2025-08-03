package com.example.autoconnect;

import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.codec.PacketCodec;
import net.minecraft.network.packet.CustomPayload;
import net.minecraft.network.RegistryByteBuf;
import net.minecraft.util.Identifier;

public record MyPayload(String message) implements CustomPayload {
    public static final CustomPayload.Id<MyPayload> ID =
            new CustomPayload.Id<MyPayload>(Identifier.of("autoconnect:my_packet"));

    public static final PacketCodec<RegistryByteBuf, MyPayload> CODEC =
            PacketCodec.of(MyPayload::write, MyPayload::read);

    @Override
    public CustomPayload.Id<MyPayload> getId() {
        return ID;
    }

    public static MyPayload read(PacketByteBuf buf) {
        return new MyPayload(buf.readString());
    }

    public void write(PacketByteBuf buf) {
        buf.writeString(message);
    }
}
