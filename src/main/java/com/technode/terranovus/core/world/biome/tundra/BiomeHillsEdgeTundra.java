package com.technode.terranovus.core.world.biome.tundra;

import com.technode.terranovus.core.world.biome.BiomeHillsEdgeTN;

public class BiomeHillsEdgeTundra extends BiomeHillsEdgeTN {

    public static enum MoistureType {ARID, VERY_DRY, DRY, AVERAGE, DAMP, VERY_DAMP, WET}

    public BiomeHillsEdgeTundra.MoistureType type;

    public BiomeHillsEdgeTundra(BiomeHillsEdgeTundra.MoistureType type)
    {
    }

}
