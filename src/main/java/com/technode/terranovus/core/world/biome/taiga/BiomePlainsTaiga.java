package com.technode.terranovus.core.world.biome.taiga;

import com.technode.terranovus.core.world.biome.BiomePlainsTN;

public class BiomePlainsTaiga extends BiomePlainsTN {

    public static enum MoistureType {ARID, VERY_DRY, DRY, AVERAGE, DAMP, VERY_DAMP, WET}

    public BiomePlainsTaiga.MoistureType type;

    public BiomePlainsTaiga(BiomePlainsTaiga.MoistureType type)
    {
        //Will have a modifier for flora and fauna density. So lower humidity will affect tree density, crop density and animal spawns. Will also affect what grass block will spawn.
    }

}
