package com.technode.terranovus.core.world.biome;

public class BiomePlainsTN extends BiomeTN {

    public BiomePlainsTN() {
        super(new BiomeProperties("Plains")
                .setBaseHeight(0.0f)
                .setHeightVariation(0.0f)
                .setTemperature(0.25f)
                .setRainfall(0.4f)
        );
    }
}
