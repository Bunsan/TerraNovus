package com.technode.terranovus.core.world.biome;

import net.minecraft.world.biome.Biome;

public class BiomeHillsEdgeTN extends BiomeTN {

    public BiomeHillsEdgeTN()
    {
        super(new Biome.BiomeProperties("Hills Edge")
                .setBaseHeight(0.0f)
                .setHeightVariation(0.0f)
                .setTemperature(0.25f)
                .setRainfall(0.4f)
        );
    }
}