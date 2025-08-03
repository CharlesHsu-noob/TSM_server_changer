package com.example.autoconnect;

//import com.example.autoconnect.AutoCommandOnJoin.MyPayload;
//import com.example.autoconnect.MyPayload;
//import com.example.autoconnect.AutoCommandOnJoin.MyPayload;
import com.example.autoconnect.AutoCommandOnJoin;

import net.fabricmc.api.ClientModInitializer;
//import net.fabricmc.fabric.api.networking.v1.PayloadTypeRegistry;
import net.fabricmc.fabric.api.networking.v1.PayloadTypeRegistry;

public class AutoConnectMod implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
            PayloadTypeRegistry.playC2S().register(MyPayload.ID, MyPayload.CODEC);
            com.example.autoconnect.AutoCommandOnJoin.register();
        }

    }
