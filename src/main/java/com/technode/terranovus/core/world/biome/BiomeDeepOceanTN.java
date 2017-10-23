package com.technode.terranovus.core.world.biome;

import net.minecraft.world.biome.Biome;

public class BiomeDeepOceanTN extends BiomeTN {

    public BiomeDeepOceanTN()
    {
        super(new Biome.BiomeProperties("Deep Ocean")
                .setBaseHeight(0.0f)
                .setHeightVariation(0.0f)
                .setTemperature(0.25f)
                .setRainfall(0.4f)
        );
    }
}