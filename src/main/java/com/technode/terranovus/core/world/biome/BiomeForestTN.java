package com.technode.terranovus.core.world.biome;

import net.minecraft.world.biome.Biome;

public class BiomeForestTN extends BiomeTN {

    public BiomeForestTN()
    {
        super(new Biome.BiomeProperties("Forest")
                .setBaseHeight(0.0f)
                .setHeightVariation(0.0f)
                .setTemperature(0.25f)
                .setRainfall(0.4f)
        );
    }
}