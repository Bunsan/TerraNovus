package com.technode.terranovus.core.world.biome;

import net.minecraft.world.biome.Biome;

public class BiomeBeachTN extends BiomeTN {

    public BiomeBeachTN()
    {
        super(new Biome.BiomeProperties("Beach")
                .setBaseHeight(0.0f)
                .setHeightVariation(0.0f)
                .setTemperature(0.25f)
                .setRainfall(0.4f)
        );
    }
}