package com.technode.terranovus.core.init;

import com.google.common.base.Optional;
import com.technode.terranovus.TerraNovus;
import com.technode.terranovus.api.world.WorldGenEnums;
import com.technode.terranovus.core.world.WorldTypeTN;
import com.technode.terranovus.core.world.biome.*;
import com.technode.terranovus.core.world.biome.arid.BiomeBeachArid;
import com.technode.terranovus.core.world.biome.arid.BiomeDeepOceanArid;
import com.technode.terranovus.core.world.biome.arid.BiomeLakeArid;
import com.technode.terranovus.core.world.biome.arid.BiomeOceanArid;
import com.technode.terranovus.core.world.biome.hell.*;
import com.technode.terranovus.core.world.biome.polar.*;
import com.technode.terranovus.core.world.biome.polar.BiomeRiverArid;
import com.technode.terranovus.core.world.biome.subtropical.*;
import com.technode.terranovus.core.world.biome.taiga.*;
import com.technode.terranovus.core.world.biome.temperate.*;
import com.technode.terranovus.core.world.biome.tropical.*;
import com.technode.terranovus.core.world.biome.tundra.*;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeOcean;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.GameRegistry;


public class tnBiomes {
	
	public static WorldTypeTN worldTypeTN;
	

    
    public static void init() {
    	// need to remove all vanilla biomes, and then register just our TNBiomes
    	
    	worldTypeTN = new WorldTypeTN();

    	WorldGenEnums.POLAR_OCEAN = register("polar_ocean", new BiomeOceanPolar(), false, Type.OCEAN);
        WorldGenEnums.TUNDRA_OCEAN = register("tundra_ocean", new BiomeOceanTundra(), false, Type.OCEAN);
        WorldGenEnums.TAIGA_OCEAN = register("taiga_ocean", new BiomeOceanTaiga(), false, Type.OCEAN);
        WorldGenEnums.TEMPERATE_OCEAN = register("temperate_ocean", new BiomeOceanTemperate(), false, Type.OCEAN);
        WorldGenEnums.SUBTROPICAL_OCEAN = register("subtropical_ocean", new BiomeOceanSubtropical(), false, Type.OCEAN);
        WorldGenEnums.TROPICAL_OCEAN = register("tropical_ocean", new BiomeOceanTropical(), false, Type.OCEAN);
        WorldGenEnums.ARID_OCEAN = register("arid_ocean", new BiomeOceanArid(), false, Type.OCEAN);
        WorldGenEnums.HELL_OCEAN = register("hell_ocean", new BiomeOceanHell(), false, Type.OCEAN);

        WorldGenEnums.POLAR_DEEP_OCEAN = register("polar_deep_ocean", new BiomeDeepOceanPolar(), false, Type.OCEAN);
        WorldGenEnums.TUNDRA_DEEP_OCEAN = register("tundra_deep_ocean", new BiomeDeepOceanTundra(), false, Type.OCEAN);
        WorldGenEnums.TAIGA_DEEP_OCEAN = register("taiga_deep_ocean", new BiomeDeepOceanTaiga(), false, Type.OCEAN);
        WorldGenEnums.TEMPERATE_DEEP_OCEAN = register("temperate_deep_ocean", new BiomeDeepOceanTemperate(), false, Type.OCEAN);
        WorldGenEnums.SUBTROPICAL_DEEP_OCEAN = register("subtropical_deep_ocean", new BiomeDeepOceanSubtropical(), false, Type.OCEAN);
        WorldGenEnums.TROPICAL_DEEP_OCEAN = register("tropical_deep_ocean", new BiomeDeepOceanTropical(), false, Type.OCEAN);
        WorldGenEnums.ARID_DEEP_OCEAN = register("arid_deep_ocean", new BiomeDeepOceanArid(), false, Type.OCEAN);
        WorldGenEnums.HELL_DEEP_OCEAN = register("hell_deep_ocean", new BiomeDeepOceanHell(), false, Type.OCEAN);

        WorldGenEnums.POLAR_BEACH = register("polar_beach", new BiomeBeachPolar(), false, Type.WATER);
        WorldGenEnums.TUNDRA_BEACH = register("tundra_beach", new BiomeBeachTundra(), false, Type.WATER);
        WorldGenEnums.TAIGA_BEACH = register("taiga_beach", new BiomeBeachTaiga(), false, Type.WATER);
        WorldGenEnums.TEMPERATE_BEACH = register("temperate_beach", new BiomeBeachTemperate(), false, Type.WATER);
        WorldGenEnums.SUBTROPICAL_BEACH = register("subtropical_beach", new BiomeBeachSubtropical(), false, Type.WATER);
        WorldGenEnums.TROPICAL_BEACH = register("tropical_beach", new BiomeBeachTropical(), false, Type.WATER);
        WorldGenEnums.ARID_BEACH = register("arid_beach", new BiomeBeachArid(), false, Type.WATER);
        WorldGenEnums.HELL_BEACH = register("hell_beach", new BiomeBeachHell(), false, Type.WATER);

        WorldGenEnums.POLAR_LAKE = register("polar_lake", new BiomeLakePolar(), false, Type.WATER);
        WorldGenEnums.TUNDRA_LAKE = register("tundra_lake", new BiomeLakeTundra(), false, Type.WATER);
        WorldGenEnums.TAIGA_LAKE = register("taiga_lake", new BiomeLakeTaiga(), false, Type.WATER);
        WorldGenEnums.TEMPERATE_LAKE = register("temperate_lake", new BiomeLakeTemperate(), false, Type.WATER);
        WorldGenEnums.SUBTROPICAL_LAKE = register("subtropical_lake", new BiomeLakeSubtropical(), false, Type.WATER);
        WorldGenEnums.TROPICAL_LAKE = register("tropical_lake", new BiomeLakeTropical(), false, Type.WATER);
        WorldGenEnums.ARID_LAKE = register("arid_lake", new BiomeLakeArid(), false, Type.WATER);
        WorldGenEnums.HELL_LAKE = register("hell_lake", new BiomeLakeHell(), false, Type.WATER);

        WorldGenEnums.POLAR_RIVER = register("polar_river", new BiomeRiverPolar(), false, Type.WATER);
        WorldGenEnums.TUNDRA_RIVER = register("tundra_river", new BiomeRiverTundra(), false, Type.WATER);
        WorldGenEnums.TAIGA_RIVER = register("taiga_river", new BiomeRiverTaiga(), false, Type.WATER);
        WorldGenEnums.TEMPERATE_RIVER = register("temperate_river", new BiomeRiverTemperate(), false, Type.WATER);
        WorldGenEnums.SUBTROPICAL_RIVER = register("subtropical_river", new BiomeRiverSubtropical(), false, Type.WATER);
        WorldGenEnums.TROPICAL_RIVER = register("tropical_river", new BiomeRiverTropical(), false, Type.WATER);
        WorldGenEnums.ARID_RIVER = register("arid_river", new BiomeRiverArid(), false, Type.WATER);
        WorldGenEnums.HELL_RIVER = register("hell_river", new BiomeRiverHell(), false, Type.WATER);

        WorldGenEnums.POLAR_PLAINS = register("polar_river", new BiomeRiverPolar(), false, Type.WATER);
        WorldGenEnums.TUNDRA_PLAINS_VERY_DRY = register("tundra_plains_very_dry", new BiomePlainsTundra(BiomePlainsTundra.PlainsType.VERY_DRY), false, Type.WATER);
        WorldGenEnums.TUNDRA_PLAINS_DRY = register("tundra_plains_dry", new BiomePlainsTundra(BiomePlainsTundra.PlainsType.DRY), false, Type.WATER);
        WorldGenEnums.TUNDRA_PLAINS_AVERAGE = register("tundra_plains_average", new BiomePlainsTundra(BiomePlainsTundra.PlainsType.AVERAGE), false, Type.WATER);
        WorldGenEnums.TUNDRA_PLAINS_DAMP = register("tundra_plains_damp", new BiomePlainsTundra(BiomePlainsTundra.PlainsType.DAMP), false, Type.WATER);

    }

    public static Biome register(String name, Biome biome, boolean villages, BiomeDictionary.Type... dictionaryType)
    {
     biome.setRegistryName(TerraNovus.MOD_ID, name);
        GameRegistry.register(biome);

        if (villages) {
            BiomeManager.addVillageBiome(biome, true);
        }

        if (dictionaryType.length > 0) {
            BiomeDictionary.addTypes(biome, dictionaryType);
        }

        return biome;
    }

    private static Optional<Biome> registerOverworldBiome(BiomeTN biome) {
        ForgeRegistries.BIOMES.register(biome);
		return null;
    	
    }

    private static void registerBiomeDictionaryTags() {
    }
}
