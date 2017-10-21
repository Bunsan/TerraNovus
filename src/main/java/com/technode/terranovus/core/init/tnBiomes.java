package com.technode.terranovus.core.init;

import com.google.common.base.Optional;

import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

import com.technode.terranovus.core.world.WorldTypeTN;
import com.technode.terranovus.core.world.biome.BiomeTN;


public class tnBiomes {
	
	public static WorldTypeTN worldTypeTN;
	

    
    public static void init() {
    	// need to remove all vanilla biomes, and then register just our TNBiomes
    	
    	worldTypeTN = new WorldTypeTN();
    
    
    }
    private static Optional<Biome> registerOverworldBiome(BiomeTN biome) {
        ForgeRegistries.BIOMES.register(biome);
		return null;
    	
    }
}
