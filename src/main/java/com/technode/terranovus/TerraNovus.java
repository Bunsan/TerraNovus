package com.technode.terranovus;


import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import java.io.File;

import com.technode.terranovus.core.init.tnConfig;
import com.technode.terranovus.utilities.LogHelper;



@Mod(modid = TerraNovus.MOD_ID, acceptedMinecraftVersions = "[1.12.2]", name = TerraNovus.MOD_NAME, version = TerraNovus.VERSION)
public class TerraNovus
{
	
    public static final String MOD_ID = "terranovus";
    public static final String MOD_NAME = "Terra Novus";

    public static final int VERSION_MAJOR = 0;
    public static final int VERSION_MINOR = 1;
    public static final int VERSION_REVISION = 0;

    public static final String VERSION = VERSION_MAJOR + "." + VERSION_MINOR + "." + VERSION_REVISION;

    public static final String RESOURCE_MOD_ID = MOD_ID.toLowerCase();
    public static final String MOD_PREFIX = RESOURCE_MOD_ID + ":";


    public static final String SERVER_PROXY = "com.technode.terranovus.ServerProxy";
    public static final String CLIENT_PROXY = "com.technode.terranovus.ClientProxy";

    public static final String DESC = "desc." + MOD_ID + ".";
    public static final String DESC_INFO = DESC+"info.";
    public static final String DESC_FLAVOUR = DESC+"flavour.";

    public static final String GUI = "gui." + MOD_ID + ".";
    public static final String GUI_CONFIG = "gui." + MOD_ID + ".config.";
    public static final String AssetPath = "/assets/" + MOD_ID + "/";
    public static final String AssetPathGui = "textures/gui/";

    
	@Mod.Instance(MOD_ID)
    public static TerraNovus instance;
    


    @SidedProxy(clientSide = CLIENT_PROXY, serverSide = SERVER_PROXY)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    	LogHelper.setLogger(event.getModLog());
    	LogHelper.info("Starting TerraNovus");
    	tnConfig.init(event.getModConfigurationDirectory());
        proxy.preInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init(event);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
    }


   /* @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init(event);
    }
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        proxy.postInit(event);
    }

    public static <T extends IForgeRegistryEntry<?>> T register(T object, String name)
    {
        return registerByFullName(object, MOD_ID+":"+name);
    }
    public static <T extends IForgeRegistryEntry<?>> T registerByFullName(T object, String name)
    {
        object.setRegistryName(new ResourceLocation(name));
        return GameRegistry.register(object);
    }
    public static Block registerBlockByFullName(Block block, ItemBlock itemBlock, String name)
    {
        block = registerByFullName(block, name);
        registerByFullName(itemBlock, name);
        return block;
    }
    public static Block registerBlockByFullName(Block block, Class<? extends ItemBlock> itemBlock, String name)
    {
        try{
            return registerBlockByFullName(block, itemBlock.getConstructor(Block.class).newInstance(block), name);
        }catch(Exception e){e.printStackTrace();}
        return null;
    }
    public static Block registerBlock(Block block, Class<? extends ItemBlock> itemBlock, String name)
    {
        try{
            return registerBlockByFullName(block, itemBlock.getConstructor(Block.class).newInstance(block), MOD_ID+":"+name);
        }catch(Exception e){e.printStackTrace();}
        return null;
    } */
}