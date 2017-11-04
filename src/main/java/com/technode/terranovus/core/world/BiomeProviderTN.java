package com.technode.terranovus.core.world;

import com.technode.terranovus.api.world.WorldGenEnums;
import net.minecraft.world.WorldType;
import net.minecraft.world.biome.BiomeProvider;

public class BiomeProviderTN extends BiomeProvider {

    public BiomeProviderTN(long seed, WorldType worldType, String chunkProviderSettings) {

        super();
        getBiomesToSpawnIn().clear();
        getBiomesToSpawnIn().add(WorldGenEnums.TEMPERATE_BEACH, WorldGenEnums.TEMPERATE_FOREST_DAMP, WorldGenEnums.TEMPERATE_FOREST_AVERAGE, WorldGenEnums.TEMPERATE_FOREST_DRY, WorldGenEnums.TEMPERATE_PLAINS_DAMP
    }
}
