package com.technode.terranovus.core.world.biome.temperate;

import com.technode.terranovus.core.world.biome.BiomeForestTN;

public class BiomeForestTemperate extends BiomeForestTN {

    public static enum MoistureType {ARID, VERY_DRY, DRY, AVERAGE, DAMP, VERY_DAMP, WET}

    public BiomeForestTemperate.MoistureType type;

    public BiomeForestTemperate(BiomeForestTemperate.MoistureType type)
    {
        //Will have a modifier for flora and fauna density. So lower humidity will affect tree density, crop density and animal spawns. Will also affect what grass block will spawn.
    }

}
