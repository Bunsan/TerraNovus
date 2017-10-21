package com.technode.terranovus.core.config;

import java.io.File;


import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import com.technode.terranovus.TerraNovus;
import com.technode.terranovus.utilities.LogHelper;



public class Options {
	
	public static Configuration config;
	public static final String GENERAL_SETTINGS = "General Settings";
	
	// Mod options will be set out here.
	public static boolean enableLayers = true;
	
	public static void init(File configFile)
    {
        if (config == null)
        {
            config = new Configuration(configFile);
            loadConfiguration();
        }
    }

    private static void loadConfiguration()
    {
        try
        {
          enableLayers=config.getBoolean("Layers", GENERAL_SETTINGS, true, "Enable the special layers in worldgen");  
        }
        catch (Exception e)
        {
            LogHelper.error("TerraNovus has encountered a problem loading config", e);
        }
        finally
        {
            if (config.hasChanged()) config.save();
        }
    }
    
    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event)
    {
        if (event.getModID().equalsIgnoreCase(TerraNovus.MOD_ID))
        {
            loadConfiguration();
        }
    }
}
