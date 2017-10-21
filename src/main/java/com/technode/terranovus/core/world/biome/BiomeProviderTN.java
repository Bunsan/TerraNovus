package com.technode.terranovus.core.world.biome;

import com.technode.terranovus.core.world.WorldTypeTN;
import com.technode.terranovus.utilities.LogHelper;

import net.minecraft.world.World;
import net.minecraft.world.WorldType;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeProvider;
import net.minecraft.world.gen.layer.GenLayer;

public class BiomeProviderTN extends BiomeProvider {

	
	public BiomeProviderTN(long seed, WorldType worldType, String chunkProviderSettings)
    {
        super();
        if (!(worldType instanceof WorldTypeTN))
        {
            throw new RuntimeException("WorldChunkManagerTN requires a world of type WorldTypeTN");
        }        
        

        LogHelper.info("settings for world: "+chunkProviderSettings);
                

    }
    
	public BiomeProviderTN(World world)
    {
        this(world.getSeed(), world.getWorldInfo().getTerrainType(), world.getWorldInfo().getGeneratorOptions());
    }

}
