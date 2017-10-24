package com.technode.terranovus.core.world.biome.temperate;

import com.technode.terranovus.core.world.biome.BiomeHighPlainsTN;

public class BiomeHighPlainsTemperate extends BiomeHighPlainsTN {

    public static enum MoistureType {ARID, VERY_DRY, DRY, AVERAGE, DAMP, VERY_DAMP, WET}

    public BiomeHighPlainsTemperate.MoistureType type;

    public BiomeHighPlainsTemperate(BiomeHighPlainsTemperate.MoistureType type)
    {
        //Will have a modifier for flora and fauna density. So lower humidity will affect tree density, crop density and animal spawns. Will also affect what grass block will spawn.
    }

}
