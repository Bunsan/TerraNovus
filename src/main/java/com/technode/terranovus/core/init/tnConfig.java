package com.technode.terranovus.core.init;

import java.io.File;

import com.technode.terranovus.TerraNovus;
import com.technode.terranovus.core.config.Options;

import net.minecraftforge.common.MinecraftForge;

public class tnConfig {
	public static void init(File configDirectory)
    {
		Options.init(new File(configDirectory, TerraNovus.MOD_ID + ".cfg"));
		MinecraftForge.EVENT_BUS.register(new Options());
    }
	
}
