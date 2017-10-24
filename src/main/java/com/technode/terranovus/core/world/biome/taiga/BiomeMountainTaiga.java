package com.technode.terranovus.core.world.biome.taiga;

import com.technode.terranovus.core.world.biome.BiomeMountainTN;

public class BiomeMountainTaiga extends BiomeMountainTN {

    public static enum MoistureType {ARID, VERY_DRY, DRY, AVERAGE, DAMP, VERY_DAMP, WET}

        public BiomeMountainTaiga.MoistureType type;

        public BiomeMountainTaiga(BiomeMountainTaiga.MoistureType type)
        {
            //Will have a modifier for flora and fauna density. So lower humidity will affect tree density, crop density and animal spawns. Will also affect what grass block will spawn.
        }

}
