package com.technode.terranovus.core.world.biome;

import net.minecraft.world.biome.Biome;

public class BiomeMountainTN extends BiomeTN {

    public BiomeMountainTN()
    {
        super(new Biome.BiomeProperties("Mountain")
                .setBaseHeight(0.0f)
                .setHeightVariation(0.0f)
                .setTemperature(0.25f)
                .setRainfall(0.4f)
        );
    }
}
