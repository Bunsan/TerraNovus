package com.technode.terranovus.core.world.biome.subtropical;

import com.technode.terranovus.core.world.biome.BiomePlainsTN;

public class BiomePlainsSubtropical extends BiomePlainsTN {

    public static enum MoistureType {ARID, VERY_DRY, DRY, AVERAGE, DAMP, VERY_DAMP, WET}

    public BiomePlainsSubtropical.MoistureType type;

    public BiomePlainsSubtropical(BiomePlainsSubtropical.MoistureType type)
    {
        //Will have a modifier for flora and fauna density. So lower humidity will affect tree density, crop density and animal spawns. Will also affect what grass block will spawn.
    }

}
