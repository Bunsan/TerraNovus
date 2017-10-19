package com.technode.terranovus;

import com.technode.terranovus.core.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import static com.technode.terranovus.core.ModDetails.*;

@Mod(modid = MOD_ID, name = MOD_NAME, version = VERSION, useMetadata = false)
public class TerraNovus
{
    @Mod.Instance(MOD_ID)
    public static TerraNovus instance;

    @SidedProxy(clientSide = CLIENT_PROXY, serverSide = SERVER_PROXY)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
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