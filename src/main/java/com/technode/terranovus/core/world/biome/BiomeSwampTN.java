package com.technode.terranovus.core.world.biome;

import net.minecraft.world.biome.Biome;

public class BiomeSwampTN extends BiomeTN {

    public BiomeSwampTN()
    {
        super(new Biome.BiomeProperties("Swamp")
                .setBaseHeight(0.0f)
                .setHeightVariation(0.0f)
                .setTemperature(0.25f)
                .setRainfall(0.4f)
        );
    }
}