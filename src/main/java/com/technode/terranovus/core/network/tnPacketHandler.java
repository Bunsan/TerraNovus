package com.technode.terranovus.core.network;


import com.technode.terranovus.TerraNovus;

import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;

public class tnPacketHandler {

public static final SimpleNetworkWrapper instance = NetworkRegistry.INSTANCE.newSimpleChannel(TerraNovus.MOD_ID);
    
    public static void init()
    {
        // register messages here
        // instance.registerMessage(messageHandler, requestMessageType, discriminator, side);
    }

}
