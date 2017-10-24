package com.technode.terranovus.core.world.biome.taiga;

import com.technode.terranovus.core.world.biome.BiomeHillsTN;

public class BiomeHillsTaiga extends BiomeHillsTN {

    public static enum MoistureType {ARID, VERY_DRY, DRY, AVERAGE, DAMP, VERY_DAMP, WET}

    public BiomeHillsTaiga.MoistureType type;

    public BiomeHillsTaiga(BiomeHillsTaiga.MoistureType type)
    {
        //Will have a modifier for flora and fauna density. So lower humidity will affect tree density, crop density and animal spawns. Will also affect what grass block will spawn.
    }

}
