package com.technode.terranovus.core.world.biome.tundra;

import com.technode.terranovus.core.world.biome.BiomeSwampTN;

public class BiomeSwampTundra extends BiomeSwampTN {

    public static enum MoistureType {ARID, VERY_DRY, DRY, AVERAGE, DAMP, VERY_DAMP, WET}

    public BiomeSwampTundra.MoistureType type;

    public BiomeSwampTundra(BiomeSwampTundra.MoistureType type)
    {
        //Will have a modifier for flora and fauna density. So lower humidity will affect tree density, crop density and animal spawns. Will also affect what grass block will spawn.
    }

}
