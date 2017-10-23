package com.technode.terranovus.core.world.biome;

public class BiomeOceanTN extends BiomeTN {

    public BiomeOceanTN()
    {
        super(new BiomeProperties("Ocean")
                .setBaseHeight(0.0f)
                .setHeightVariation(0.0f)
                .setTemperature(0.25f)
                .setRainfall(0.4f)
        );

        this.spawnableCreatureList.clear();
    }
}
