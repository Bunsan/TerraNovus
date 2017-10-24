package com.technode.terranovus.core.world.biome.tropical;

import com.technode.terranovus.core.world.biome.BiomeHillsTN;

public class BiomeHillsTropical extends BiomeHillsTN {

    public static enum MoistureType {ARID, VERY_DRY, DRY, AVERAGE, DAMP, VERY_DAMP, WET}

    public BiomeHillsTropical.MoistureType type;

    public BiomeHillsTropical(BiomeHillsTropical.MoistureType type)
    {
        //Will have a modifier for flora and fauna density. So lower humidity will affect tree density, crop density and animal spawns. Will also affect what grass block will spawn.
    }

}
