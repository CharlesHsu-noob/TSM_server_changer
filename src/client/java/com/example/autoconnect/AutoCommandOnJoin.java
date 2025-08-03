package com.example.autoconnect;

import net.fabricmc.fabric.api.client.networking.v1.ClientPlayConnectionEvents;
//import net.minecraft.client.MinecraftClient;

public class AutoCommandOnJoin {
    public static void register() {
        ClientPlayConnectionEvents.JOIN.register((handler, sender, client) -> {
            client.execute(() -> {
                try {
                    Thread.sleep(3000); // 稍微等待玩家載入完成（可調整）
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                if (client.getCurrentServerEntry() != null &&
                    client.getCurrentServerEntry().address.contains("mc.stud3nt.xyz")) {

                    client.player.networkHandler.sendChatCommand("server server02");
                    System.out.println("✅ 已發送 /server server02 指令！");
                } else {
                    System.out.println("⚠️ 目前伺服器不是 mc.stud3nt.xyz，未送出指令");
                }
            });
        });
    }
}