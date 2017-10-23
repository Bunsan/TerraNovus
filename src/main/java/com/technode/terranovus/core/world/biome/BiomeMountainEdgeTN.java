package com.technode.terranovus.core.world.biome;

import net.minecraft.world.biome.Biome;

public class BiomeMountainEdgeTN extends BiomeTN {

    public BiomeMountainEdgeTN()
    {
        super(new Biome.BiomeProperties("Mountain Edge")
                .setBaseHeight(0.0f)
                .setHeightVariation(0.0f)
                .setTemperature(0.25f)
                .setRainfall(0.4f)
        );
    }
}