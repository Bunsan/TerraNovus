package com.technode.terranovus.core.world.biome;

import net.minecraft.world.biome.Biome;

public class BiomeHighPlainsTN extends BiomeTN {

    public BiomeHighPlainsTN()
    {
        super(new Biome.BiomeProperties("High Plains")
                .setBaseHeight(0.0f)
                .setHeightVariation(0.0f)
                .setTemperature(0.25f)
                .setRainfall(0.4f)
        );
    }
}