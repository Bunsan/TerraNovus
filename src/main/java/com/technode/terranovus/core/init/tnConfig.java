package com.technode.terranovus.core.init;

import java.io.File;

import com.technode.terranovus.TerraNovus;
import com.technode.terranovus.core.config.ConfigHandler;

import net.minecraftforge.common.MinecraftForge;

public class tnConfig {
	public static void init(File configDirectory)
    {
		ConfigHandler.init(new File(configDirectory, TerraNovus.MOD_ID + ".cfg"));
		MinecraftForge.EVENT_BUS.register(new ConfigHandler());
    }
	
}
