package com.technode.terranovus.core.world;

import com.technode.terranovus.TerraNovus;
import com.technode.terranovus.core.world.biome.BiomeProviderTN;


import net.minecraft.world.World;
import net.minecraft.world.WorldType;
import net.minecraft.world.biome.BiomeProvider;
import net.minecraft.world.gen.IChunkGenerator;

public class WorldTypeTN extends WorldType {
    

	public WorldTypeTN() {
		super(TerraNovus.MOD_ID);

		// TODO Auto-generated constructor stub
	}
   
	@Override
    public BiomeProvider getBiomeProvider(World world)
    {
        return new BiomeProviderTN(world);
    }
    
    @Override
    public IChunkGenerator getChunkGenerator(World world, String generatorOptions)
    {
        return new ChunkGeneratorOverworldTN(world, world.getSeed(), world.getWorldInfo().isMapFeaturesEnabled(), generatorOptions);
    }
	@Override
    public boolean isCustomizable()
    {
        return false;
    }

}
