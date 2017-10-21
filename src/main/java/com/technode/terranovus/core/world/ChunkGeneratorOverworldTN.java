package com.technode.terranovus.core.world;

import net.minecraft.world.World;
import net.minecraft.world.gen.ChunkGeneratorSettings;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.ChunkGeneratorOverworld;


public class ChunkGeneratorOverworldTN extends ChunkGeneratorOverworld implements IChunkGenerator {

	private ChunkGeneratorSettings settings;
	
	public ChunkGeneratorOverworldTN(World worldIn, long seed, boolean mapFeaturesEnabledIn, String generatorOptions) {
		super(worldIn, seed, mapFeaturesEnabledIn, generatorOptions);
		// TODO Auto-generated constructor stub
	}

}
