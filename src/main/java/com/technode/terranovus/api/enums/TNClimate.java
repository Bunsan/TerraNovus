package com.technode.terranovus.api.enums;

import net.minecraftforge.common.BiomeManager.BiomeType;

public enum TNClimate {

    POLAR_ARID (BiomeType.ICY),
    POLAR_VERY_DRY (BiomeType.ICY),
    POLAR_DRY (BiomeType.ICY),
    POLAR_AVERAGE (BiomeType.ICY),
    POLAR_DAMP (BiomeType.ICY),
    POLAR_VERY_DAMP (BiomeType.ICY),
    POLAR_WET (BiomeType.ICY),
    TUNDRA_ARID (BiomeType.ICY),
    TUNDRA_VERY_DRY (BiomeType.ICY),
    TUNDRA_DRY (BiomeType.ICY),
    TUNDRA_AVERAGE (BiomeType.ICY),
    TUNDRA_DAMP (BiomeType.ICY),
    TUNDRA_VERY_DAMP (BiomeType.ICY),
    TUNDRA_WET (BiomeType.ICY),
    TAIGA_ARID (BiomeType.COOL),
    TAIGA_VERY_DRY (BiomeType.COOL),
    TAIGA_DRY (BiomeType.COOL),
    TAIGA_AVERAGE (BiomeType.COOL),
    TAIGA_DAMP (BiomeType.COOL),
    TAIGA_VERY_DAMP (BiomeType.COOL),
    TAIGA_WET (BiomeType.COOL),
    TEMPERATE_ARID (BiomeType.COOL),
    TEMPERATE_VERY_DRY (BiomeType.COOL),
    TEMPERATE_DRY (BiomeType.COOL),
    TEMPERATE_AVERAGE (BiomeType.COOL),
    TEMPERATE_DAMP (BiomeType.COOL),
    TEMPERATE_VERY_DAMP (BiomeType.COOL),
    TEMPERATE_WET (BiomeType.COOL),
    SUBTROPICAL_ARID (BiomeType.WARM),
    SUBTROPICAL_VERY_DRY (BiomeType.WARM),
    SUBTROPICAL_DRY (BiomeType.WARM),
    SUBTROPICAL_AVERAGE (BiomeType.WARM),
    SUBTROPICAL_DAMP (BiomeType.WARM),
    SUBTROPICAL_VERY_DAMP (BiomeType.WARM),
    SUBTROPICAL_WET (BiomeType.WARM),
    TROPICAL_ARID (BiomeType.WARM),
    TROPICAL_VERY_DRY (BiomeType.WARM),
    TROPICAL_DRY (BiomeType.WARM),
    TROPICAL_AVERAGE (BiomeType.WARM),
    TROPICAL_DAMP (BiomeType.WARM),
    TROPICAL_VERY_DAMP (BiomeType.WARM),
    TROPICAL_WET (BiomeType.WARM),
    ARID_ARID (BiomeType.DESERT),
    ARID_VERY_DRY (BiomeType.DESERT),
    ARID_DRY (BiomeType.DESERT),
    ARID_AVERAGE (BiomeType.DESERT),
    ARID_DAMP (BiomeType.DESERT),
    ARID_VERY_DAMP (BiomeType.DESERT),
    ARID_WET (BiomeType.DESERT),
    HELL_ARID (BiomeType.DESERT),
    HELL_VERY_DRY (BiomeType.DESERT),
    HELL_DRY (BiomeType.DESERT),
    HELL_AVERAGE (BiomeType.DESERT),
    HELL_DAMP (BiomeType.DESERT),
    HELL_VERY_DAMP (BiomeType.DESERT),
    HELL_WET (BiomeType.DESERT);



    public final BiomeType biomeType;

    TNClimate(BiomeType biomeType)
    {
        this.biomeType = biomeType;
    }

    //public TNClimate addBiome()

    private static TNClimate[] climateMapping = new TNClimate[] {

        //  Arid                Very Dry                Dry                 Average                 Damp                Very Damp                   Wet
            POLAR_ARID,         POLAR_VERY_DRY,         POLAR_DRY,          POLAR_AVERAGE,          POLAR_DAMP,         POLAR_VERY_DAMP,            POLAR_WET,
            TUNDRA_ARID,        TUNDRA_VERY_DRY,        TUNDRA_DRY,         TUNDRA_AVERAGE,         TUNDRA_DAMP,        TUNDRA_VERY_DAMP,           TUNDRA_WET,
            TAIGA_ARID,         TAIGA_VERY_DRY,         TAIGA_DRY,          TAIGA_AVERAGE,          TAIGA_DAMP,         TAIGA_VERY_DAMP,            TAIGA_WET,
            TEMPERATE_ARID,     TEMPERATE_VERY_DRY,     TEMPERATE_DRY,      TEMPERATE_AVERAGE,      TEMPERATE_DAMP,     TEMPERATE_VERY_DAMP,        TEMPERATE_WET,
            SUBTROPICAL_ARID,   SUBTROPICAL_VERY_DRY,   SUBTROPICAL_DRY,    SUBTROPICAL_AVERAGE,    SUBTROPICAL_DAMP,   SUBTROPICAL_VERY_DAMP,      SUBTROPICAL_WET,
            TROPICAL_ARID,      TROPICAL_VERY_DRY,      TROPICAL_DRY,       TROPICAL_AVERAGE,       TROPICAL_DAMP,      TROPICAL_VERY_DAMP,         TROPICAL_WET,
            ARID_ARID,          ARID_VERY_DRY,          ARID_DRY,           ARID_AVERAGE,           ARID_DAMP,          ARID_VERY_DAMP,             ARID_WET,
            HELL_ARID,          HELL_VERY_DRY,          HELL_DRY,           HELL_AVERAGE,           HELL_DAMP,          HELL_VERY_DAMP,             HELL_WET
    };


    public static int[] getClimateMappingInts()
    {
        // 8 temperature zones, 7 moisture values for 56 possibilities
        int[] out = new int[56];
        for (int i = 0; i < 56; i++)
        {
            out[i] = climateMapping[i].ordinal();
        }
        return out;
    }
}
