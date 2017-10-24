package com.technode.terranovus.core.init;

import com.google.common.base.Optional;
import com.technode.terranovus.TerraNovus;
import com.technode.terranovus.api.world.WorldGenEnums;
import com.technode.terranovus.core.world.WorldTypeTN;
import com.technode.terranovus.core.world.biome.*;
import com.technode.terranovus.core.world.biome.arid.*;
import com.technode.terranovus.core.world.biome.hell.*;
import com.technode.terranovus.core.world.biome.polar.*;
import com.technode.terranovus.core.world.biome.polar.BiomeRiverArid;
import com.technode.terranovus.core.world.biome.subtropical.*;
import com.technode.terranovus.core.world.biome.taiga.*;
import com.technode.terranovus.core.world.biome.temperate.*;
import com.technode.terranovus.core.world.biome.tropical.*;
import com.technode.terranovus.core.world.biome.tundra.*;
import net.minecraft.world.biome.Biome;
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

        // POLAR

        WorldGenEnums.POLAR_OCEAN = register("polar_ocean", new BiomeOceanPolar(), false, Type.OCEAN, Type.WATER, Type.SNOWY, Type.COLD);
        WorldGenEnums.POLAR_DEEP_OCEAN = register("polar_deep_ocean", new BiomeDeepOceanPolar(), false, Type.OCEAN, Type.WATER, Type.SNOWY, Type.COLD);
        WorldGenEnums.POLAR_BEACH = register("polar_beach", new BiomeBeachPolar(), false, Type.BEACH, Type.SNOWY, Type.COLD);
        WorldGenEnums.POLAR_LAKE = register("polar_lake", new BiomeLakePolar(), false, Type.SNOWY, Type.COLD);
        WorldGenEnums.POLAR_RIVER = register("polar_river", new BiomeRiverPolar(), false, Type.RIVER, Type.SNOWY, Type.COLD);

        WorldGenEnums.POLAR_GLACIER = register("polar_glacier", new BiomePlainsPolar(), false, Type.PLAINS, Type.SNOWY, Type.COLD, Type.DRY);
        WorldGenEnums.POLAR_PLAINS = register("polar_plains_glacier", new BiomeRiverPolar(), false, Type.PLAINS, Type.SNOWY, Type.COLD, Type.DRY);
        WorldGenEnums.POLAR_MOUNTAIN = register("polar_mountain", new BiomeMountainPolar(), false, Type.MOUNTAIN, Type.SNOWY, Type.COLD, Type.DRY);

        // TUNDRA

        WorldGenEnums.TUNDRA_OCEAN = register("tundra_ocean", new BiomeOceanTundra(), false, Type.OCEAN, Type.WATER, Type.SNOWY, Type.COLD);
        WorldGenEnums.TUNDRA_DEEP_OCEAN = register("tundra_deep_ocean", new BiomeDeepOceanTundra(), false, Type.OCEAN, Type.WATER);
        WorldGenEnums.TUNDRA_BEACH = register("tundra_beach", new BiomeBeachTundra(), false, Type.BEACH, Type.SNOWY, Type.COLD);
        WorldGenEnums.TUNDRA_LAKE = register("tundra_lake", new BiomeLakeTundra(), false, Type.WATER, Type.SNOWY, Type.COLD);
        WorldGenEnums.TUNDRA_RIVER = register("tundra_river", new BiomeRiverTundra(), false, Type.RIVER, Type.SNOWY, Type.COLD);

        WorldGenEnums.TUNDRA_PLAINS_VERY_DRY = register("tundra_plains_very_dry", new BiomePlainsTundra(BiomePlainsTundra.MoistureType.VERY_DRY), false, Type.PLAINS, Type.SNOWY, Type.COLD, Type.DRY);
        WorldGenEnums.TUNDRA_PLAINS_DRY = register("tundra_plains_dry", new BiomePlainsTundra(BiomePlainsTundra.MoistureType.DRY), false, Type.PLAINS, Type.SNOWY, Type.COLD);
        WorldGenEnums.TUNDRA_PLAINS_AVERAGE = register("tundra_plains_average", new BiomePlainsTundra(BiomePlainsTundra.MoistureType.AVERAGE), false, Type.PLAINS, Type.SNOWY, Type.COLD);
        WorldGenEnums.TUNDRA_PLAINS_DAMP = register("tundra_plains_damp", new BiomePlainsTundra(BiomePlainsTundra.MoistureType.DAMP), false, Type.PLAINS, Type.SNOWY, Type.COLD);

        WorldGenEnums.TUNDRA_HILLS_VERY_DRY = register("tundra_hills_very_dry", new BiomeHillsTundra(BiomeHillsTundra.MoistureType.VERY_DRY), false, Type.HILLS, Type.SNOWY, Type.COLD, Type.DRY);
        WorldGenEnums.TUNDRA_HILLS_DRY = register("tundra_hills_dry", new BiomeHillsTundra(BiomeHillsTundra.MoistureType.DRY), false, Type.HILLS, Type.SNOWY, Type.COLD);
        WorldGenEnums.TUNDRA_HILLS_AVERAGE = register("tundra_hills_average", new BiomeHillsTundra(BiomeHillsTundra.MoistureType.AVERAGE), false, Type.HILLS, Type.SNOWY, Type.COLD);
        WorldGenEnums.TUNDRA_HILLS_DAMP = register("tundra_hills_damp", new BiomeHillsTundra(BiomeHillsTundra.MoistureType.DAMP), false, Type.HILLS, Type.SNOWY, Type.COLD);

        WorldGenEnums.TUNDRA_HILLS_EDGE_VERY_DRY = register("tundra_hills_edge_very_dry", new BiomeHillsEdgeTundra(BiomeHillsEdgeTundra.MoistureType.VERY_DRY), false, Type.HILLS, Type.SNOWY, Type.COLD, Type.DRY);
        WorldGenEnums.TUNDRA_HILLS_EDGE_DRY = register("tundra_hills_edge_dry", new BiomeHillsEdgeTundra(BiomeHillsEdgeTundra.MoistureType.DRY), false, Type.HILLS, Type.SNOWY, Type.COLD);
        WorldGenEnums.TUNDRA_HILLS_EDGE_AVERAGE = register("tundra_hills_edge_average", new BiomeHillsEdgeTundra(BiomeHillsEdgeTundra.MoistureType.AVERAGE), false, Type.HILLS, Type.SNOWY, Type.COLD);
        WorldGenEnums.TUNDRA_HILLS_EDGE_DAMP = register("tundra_hills_edge_damp", new BiomeHillsEdgeTundra(BiomeHillsEdgeTundra.MoistureType.DAMP), false, Type.HILLS, Type.SNOWY, Type.COLD);

        WorldGenEnums.TUNDRA_SWAMP_DRY = register("tundra_plains_dry", new BiomeSwampTundra(BiomeSwampTundra.MoistureType.DRY), false, Type.SWAMP, Type.SNOWY, Type.COLD);
        WorldGenEnums.TUNDRA_SWAMP_AVERAGE = register("tundra_plains_average", new BiomeSwampTundra(BiomeSwampTundra.MoistureType.AVERAGE), false, Type.SWAMP, Type.SNOWY, Type.COLD);
        WorldGenEnums.TUNDRA_SWAMP_DAMP = register("tundra_plains_damp", new BiomeSwampTundra(BiomeSwampTundra.MoistureType.DAMP), false, Type.SWAMP, Type.SNOWY, Type.COLD);

        // TAIGA

        WorldGenEnums.TAIGA_OCEAN = register("taiga_ocean", new BiomeOceanTaiga(), false, Type.OCEAN, Type.WATER, Type.COLD);
        WorldGenEnums.TAIGA_DEEP_OCEAN = register("taiga_deep_ocean", new BiomeDeepOceanTaiga(), false, Type.OCEAN, Type.WATER, Type.COLD);
        WorldGenEnums.TAIGA_BEACH = register("taiga_beach", new BiomeBeachTaiga(), false, Type.BEACH, Type.COLD);
        WorldGenEnums.TAIGA_LAKE = register("taiga_lake", new BiomeLakeTaiga(), false, Type.WATER, Type.COLD);
        WorldGenEnums.TAIGA_RIVER = register("taiga_river", new BiomeRiverTaiga(), false, Type.RIVER, Type.COLD);

        WorldGenEnums.TAIGA_MOUNTAIN_DRY = register("taiga_mountain_dry", new BiomeMountainTaiga(BiomeMountainTaiga.MoistureType.DRY), false, Type.MOUNTAIN, Type.CONIFEROUS, Type.COLD);
        WorldGenEnums.TAIGA_MOUNTAIN_AVERAGE = register("taigaa_mountain_average", new BiomeMountainTaiga(BiomeMountainTaiga.MoistureType.AVERAGE), false, Type.MOUNTAIN, Type.CONIFEROUS, Type.COLD);
        WorldGenEnums.TAIGA_MOUNTAIN_DAMP = register("taiga_mountain_damp", new BiomeMountainTaiga(BiomeMountainTaiga.MoistureType.DAMP), false, Type.MOUNTAIN, Type.CONIFEROUS, Type.COLD);

        WorldGenEnums.TAIGA_MOUNTAIN_EDGE_DRY = register("taigaa_mountain_edge_dry", new BiomeMountainEdgeTaiga(BiomeMountainEdgeTaiga.MoistureType.DRY), false, Type.MOUNTAIN, Type.CONIFEROUS, Type.COLD);
        WorldGenEnums.TAIGA_MOUNTAIN_EDGE_AVERAGE = register("taiga_mountain_edge_average", new BiomeMountainEdgeTaiga(BiomeMountainEdgeTaiga.MoistureType.AVERAGE), false, Type.MOUNTAIN, Type.CONIFEROUS, Type.COLD);
        WorldGenEnums.TAIGA_MOUNTAIN_EDGE_DAMP = register("taiga_mountain_edge_damp", new BiomeMountainEdgeTaiga(BiomeMountainEdgeTaiga.MoistureType.DAMP), false, Type.MOUNTAIN, Type.CONIFEROUS, Type.COLD);

        WorldGenEnums.TAIGA_HIGH_PLAINS_DRY = register("taiga_high_plains_dry", new BiomeHighPlainsTaiga(BiomeHighPlainsTaiga.MoistureType.DRY), false, Type.PLAINS, Type.COLD);
        WorldGenEnums.TAIGA_HIGH_PLAINS_AVERAGE = register("taiga_high_plains_average", new BiomeHighPlainsTaiga(BiomeHighPlainsTaiga.MoistureType.AVERAGE), false, Type.PLAINS, Type.COLD);
        WorldGenEnums.TAIGA_HIGH_PLAINS_DAMP = register("taiga_high_plains_damp", new BiomeHighPlainsTaiga(BiomeHighPlainsTaiga.MoistureType.DAMP), false, Type.PLAINS, Type.COLD);

        WorldGenEnums.TAIGA_PLAINS_DRY = register("taiga_plains_dry", new BiomePlainsTaiga(BiomePlainsTaiga.MoistureType.DRY), false, Type.PLAINS, Type.COLD);
        WorldGenEnums.TAIGA_PLAINS_AVERAGE = register("taiga_plains_average", new BiomePlainsTaiga(BiomePlainsTaiga.MoistureType.AVERAGE), false, Type.PLAINS, Type.COLD);
        WorldGenEnums.TAIGA_PLAINS_DAMP = register("taiga_plains_damp", new BiomePlainsTaiga(BiomePlainsTaiga.MoistureType.DAMP), false, Type.PLAINS, Type.COLD);

        WorldGenEnums.TAIGA_HILLS_DRY = register("taiga_hills_dry", new BiomeHillsTaiga(BiomeHillsTaiga.MoistureType.DRY), false, Type.HILLS, Type.CONIFEROUS, Type.COLD);
        WorldGenEnums.TAIGA_HILLS_AVERAGE = register("tundra_hills_average", new BiomeHillsTaiga(BiomeHillsTaiga.MoistureType.AVERAGE), false, Type.HILLS, Type.CONIFEROUS, Type.COLD);
        WorldGenEnums.TAIGA_HILLS_DAMP = register("taiga_hills_damp", new BiomeHillsTaiga(BiomeHillsTaiga.MoistureType.DAMP), false, Type.HILLS, Type.CONIFEROUS, Type.COLD);

        WorldGenEnums.TAIGA_HILLS_EDGE_DRY = register("taiga_hills_edge_dry", new BiomeHillsEdgeTaiga(BiomeHillsEdgeTaiga.MoistureType.DRY), false, Type.HILLS, Type.CONIFEROUS, Type.COLD);
        WorldGenEnums.TAIGA_HILLS_EDGE_AVERAGE = register("taiga_hills_edge_average", new BiomeHillsEdgeTaiga(BiomeHillsEdgeTaiga.MoistureType.AVERAGE), false, Type.HILLS, Type.CONIFEROUS, Type.COLD);
        WorldGenEnums.TAIGA_HILLS_EDGE_DAMP = register("taiga_hills_edge_damp", new BiomeHillsEdgeTaiga(BiomeHillsEdgeTaiga.MoistureType.DAMP), false, Type.HILLS, Type.CONIFEROUS, Type.COLD);

        WorldGenEnums.TAIGA_FOREST_DRY = register("taiga_forest_dry", new BiomeForestTaiga(BiomeForestTaiga.MoistureType.DRY), false, Type.FOREST, Type.CONIFEROUS, Type.COLD);
        WorldGenEnums.TAIGA_FOREST_AVERAGE = register("taiga_forest_average", new BiomeForestTaiga(BiomeForestTaiga.MoistureType.AVERAGE), false, Type.FOREST, Type.CONIFEROUS, Type.COLD);
        WorldGenEnums.TAIGA_FOREST_DAMP = register("taiga_forest_damp", new BiomeForestTaiga(BiomeForestTaiga.MoistureType.DAMP), false, Type.FOREST, Type.CONIFEROUS, Type.COLD);
        WorldGenEnums.TAIGA_FOREST_VERY_DAMP = register("taiga_forest_damp", new BiomeForestTaiga(BiomeForestTaiga.MoistureType.VERY_DAMP), false, Type.FOREST, Type.CONIFEROUS, Type.COLD, Type.WET);

        WorldGenEnums.TAIGA_SWAMP_DRY = register("taiga_swamp_dry", new BiomeSwampTaiga(BiomeSwampTaiga.MoistureType.DRY), false, Type.SWAMP, Type.COLD);
        WorldGenEnums.TAIGA_SWAMP_AVERAGE = register("taiga_swamp_average", new BiomeSwampTaiga(BiomeSwampTaiga.MoistureType.AVERAGE), false, Type.SWAMP, Type.COLD);
        WorldGenEnums.TAIGA_SWAMP_DAMP = register("taiga_swamp_damp", new BiomeSwampTaiga(BiomeSwampTaiga.MoistureType.DAMP), false, Type.SWAMP, Type.COLD);

        // TEMPERATE

        WorldGenEnums.TEMPERATE_OCEAN = register("temperate_ocean", new BiomeOceanTemperate(), false, Type.OCEAN, Type.WATER);
        WorldGenEnums.TEMPERATE_DEEP_OCEAN = register("temperate_deep_ocean", new BiomeDeepOceanTemperate(), false, Type.OCEAN, Type.WATER);
        WorldGenEnums.TEMPERATE_BEACH = register("temperate_beach", new BiomeBeachTemperate(), false, Type.BEACH);
        WorldGenEnums.TEMPERATE_LAKE = register("temperate_lake", new BiomeLakeTemperate(), false, Type.WATER);
        WorldGenEnums.TEMPERATE_RIVER = register("temperate_river", new BiomeRiverTemperate(), false, Type.RIVER);

        WorldGenEnums.TEMPERATE_MOUNTAIN_DRY = register("temperate_mountain_dry", new BiomeMountainTemperate(BiomeMountainTemperate.MoistureType.DRY), false, Type.MOUNTAIN);
        WorldGenEnums.TEMPERATE_MOUNTAIN_AVERAGE = register("temperate_mountain_average", new BiomeMountainTemperate(BiomeMountainTemperate.MoistureType.AVERAGE), false, Type.MOUNTAIN);
        WorldGenEnums.TEMPERATE_MOUNTAIN_DAMP = register("temperate_mountain_damp", new BiomeMountainTemperate(BiomeMountainTemperate.MoistureType.DAMP), false, Type.MOUNTAIN);

        WorldGenEnums.TEMPERATE_MOUNTAIN_EDGE_DRY = register("temperate_mountain_edge_dry", new BiomeMountainEdgeTemperate(BiomeMountainEdgeTemperate.MoistureType.DRY), false, Type.MOUNTAIN, Type.DRY);
        WorldGenEnums.TEMPERATE_MOUNTAIN_EDGE_AVERAGE = register("temperate_mountain_edge_average", new BiomeMountainEdgeTemperate(BiomeMountainEdgeTemperate.MoistureType.AVERAGE), false, Type.MOUNTAIN);
        WorldGenEnums.TEMPERATE_MOUNTAIN_EDGE_DAMP = register("temperate_mountain_edge_damp", new BiomeMountainEdgeTemperate(BiomeMountainEdgeTemperate.MoistureType.DAMP), false, Type.MOUNTAIN);
        WorldGenEnums.TEMPERATE_MOUNTAIN_EDGE_VERY_DAMP = register("temperate_mountain_edge_very_damp", new BiomeMountainEdgeTemperate(BiomeMountainEdgeTemperate.MoistureType.VERY_DAMP), false, Type.MOUNTAIN, Type.WET);

        WorldGenEnums.TEMPERATE_HIGH_PLAINS_DRY = register("temperate_high_plains_dry", new BiomeHighPlainsTemperate(BiomeHighPlainsTemperate.MoistureType.DRY), false, Type.PLAINS);
        WorldGenEnums.TEMPERATE_HIGH_PLAINS_AVERAGE = register("temperate_high_plains_average", new BiomeHighPlainsTemperate(BiomeHighPlainsTemperate.MoistureType.AVERAGE), false, Type.PLAINS);
        WorldGenEnums.TEMPERATE_HIGH_PLAINS_DAMP = register("temperate_high_plains_damp", new BiomeHighPlainsTemperate(BiomeHighPlainsTemperate.MoistureType.DAMP), false, Type.PLAINS);

        WorldGenEnums.TEMPERATE_PLAINS_DRY = register("temperate_plains_dry", new BiomePlainsTemperate(BiomePlainsTemperate.MoistureType.DRY), false, Type.PLAINS);
        WorldGenEnums.TEMPERATE_PLAINS_AVERAGE = register("temperate_plains_average", new BiomePlainsTemperate(BiomePlainsTemperate.MoistureType.AVERAGE), false, Type.PLAINS);
        WorldGenEnums.TEMPERATE_PLAINS_DAMP = register("temperate_plains_damp", new BiomePlainsTemperate(BiomePlainsTemperate.MoistureType.DAMP), false, Type.PLAINS);
        WorldGenEnums.TEMPERATE_PLAINS_VERY_DAMP = register("temperate_plains_very_damp", new BiomePlainsTemperate(BiomePlainsTemperate.MoistureType.VERY_DAMP), false, Type.PLAINS, Type.WET);

        WorldGenEnums.TEMPERATE_HILLS_DRY = register("temperate_hills_dry", new BiomeHillsTemperate(BiomeHillsTemperate.MoistureType.DRY), false, Type.HILLS);
        WorldGenEnums.TEMPERATE_HILLS_AVERAGE = register("temperate_hills_average", new BiomeHillsTemperate(BiomeHillsTemperate.MoistureType.AVERAGE), false, Type.HILLS);
        WorldGenEnums.TEMPERATE_HILLS_DAMP = register("temperate_hills_damp", new BiomeHillsTemperate(BiomeHillsTemperate.MoistureType.DAMP), false, Type.HILLS);
        WorldGenEnums.TEMPERATE_HILLS_VERY_DAMP = register("temperate_hills_very_damp", new BiomeHillsTemperate(BiomeHillsTemperate.MoistureType.VERY_DAMP), false, Type.HILLS, Type.WET);

        WorldGenEnums.TEMPERATE_HILLS_EDGE_DRY = register("temperate_hills_edge_dry", new BiomeHillsEdgeTemperate(BiomeHillsEdgeTemperate.MoistureType.DRY), false, Type.HILLS);
        WorldGenEnums.TEMPERATE_HILLS_EDGE_AVERAGE = register("temperate_hills_edge_average", new BiomeHillsEdgeTemperate(BiomeHillsEdgeTemperate.MoistureType.AVERAGE), false, Type.HILLS);
        WorldGenEnums.TEMPERATE_HILLS_EDGE_DAMP = register("temperate_hills_edge_damp", new BiomeHillsEdgeTemperate(BiomeHillsEdgeTemperate.MoistureType.DAMP), false, Type.HILLS);
        WorldGenEnums.TEMPERATE_HILLS_EDGE_VERY_DAMP = register("temperate_hills_edge_very_damp", new BiomeHillsEdgeTemperate(BiomeHillsEdgeTemperate.MoistureType.VERY_DAMP), false, Type.FOREST, Type.WET);

        WorldGenEnums.TEMPERATE_FOREST_DRY = register("temperate_forest_dry", new BiomeForestTemperate(BiomeForestTemperate.MoistureType.DRY), false, Type.FOREST);
        WorldGenEnums.TEMPERATE_FOREST_AVERAGE = register("temperate_forest_average", new BiomeForestTemperate(BiomeForestTemperate.MoistureType.AVERAGE), false, Type.FOREST);
        WorldGenEnums.TEMPERATE_FOREST_DAMP = register("temperate_forest_damp", new BiomeForestTemperate(BiomeForestTemperate.MoistureType.DAMP), false, Type.FOREST);
        WorldGenEnums.TEMPERATE_FOREST_VERY_DAMP = register("temperate_forest_damp", new BiomeForestTemperate(BiomeForestTemperate.MoistureType.VERY_DAMP), false, Type.FOREST, Type.WET);

        WorldGenEnums.TEMPERATE_SWAMP_DRY = register("temperate_swamp_dry", new BiomeSwampTemperate(BiomeSwampTemperate.MoistureType.DRY), false, Type.SWAMP);
        WorldGenEnums.TEMPERATE_SWAMP_AVERAGE = register("temperate_swamp_average", new BiomeSwampTemperate(BiomeSwampTemperate.MoistureType.AVERAGE), false, Type.SWAMP);
        WorldGenEnums.TEMPERATE_SWAMP_DAMP = register("temperate_swamp_damp", new BiomeSwampTemperate(BiomeSwampTemperate.MoistureType.DAMP), false, Type.SWAMP);


        // SUBTROPICAL

        WorldGenEnums.SUBTROPICAL_OCEAN = register("subtropical_ocean", new BiomeOceanSubtropical(), false, Type.OCEAN, Type.WATER);
        WorldGenEnums.SUBTROPICAL_DEEP_OCEAN = register("subtropical_deep_ocean", new BiomeDeepOceanSubtropical(), false, Type.OCEAN, Type.WATER);
        WorldGenEnums.SUBTROPICAL_BEACH = register("subtropical_beach", new BiomeBeachSubtropical(), false, Type.BEACH);
        WorldGenEnums.SUBTROPICAL_LAKE = register("subtropical_lake", new BiomeLakeSubtropical(), false, Type.WATER);
        WorldGenEnums.SUBTROPICAL_RIVER = register("subtropical_river", new BiomeRiverSubtropical(), false, Type.RIVER);

        WorldGenEnums.SUBTROPICAL_MOUNTAIN_DRY = register("subtropical_mountain_dry", new BiomeMountainSubtropical(BiomeMountainSubtropical.MoistureType.DRY), false, Type.MOUNTAIN);
        WorldGenEnums.SUBTROPICAL_MOUNTAIN_AVERAGE = register("subtropical_mountain_average", new BiomeMountainSubtropical(BiomeMountainSubtropical.MoistureType.AVERAGE), false, Type.MOUNTAIN);
        WorldGenEnums.SUBTROPICAL_MOUNTAIN_DAMP = register("subtropical_mountain_damp", new BiomeMountainSubtropical(BiomeMountainSubtropical.MoistureType.DAMP), false, Type.MOUNTAIN);

        WorldGenEnums.SUBTROPICAL_MOUNTAIN_EDGE_DRY = register("subtropical_mountain_edge_dry", new BiomeMountainEdgeSubtropical(BiomeMountainEdgeSubtropical.MoistureType.DRY), false, Type.MOUNTAIN);
        WorldGenEnums.SUBTROPICAL_MOUNTAIN_EDGE_AVERAGE = register("subtropical_mountain_edge_average", new BiomeMountainEdgeSubtropical(BiomeMountainEdgeSubtropical.MoistureType.AVERAGE), false, Type.MOUNTAIN);
        WorldGenEnums.SUBTROPICAL_MOUNTAIN_EDGE_DAMP = register("subtropical_mountain_edge_damp", new BiomeMountainEdgeSubtropical(BiomeMountainEdgeSubtropical.MoistureType.DAMP), false, Type.MOUNTAIN);
        WorldGenEnums.SUBTROPICAL_MOUNTAIN_EDGE_VERY_DAMP = register("subtropical_mountain_edge_very_damp", new BiomeMountainEdgeSubtropical(BiomeMountainEdgeSubtropical.MoistureType.VERY_DAMP), false, Type.MOUNTAIN, Type.WET);

        WorldGenEnums.SUBTROPICAL_HIGH_PLAINS_DRY = register("subtropical_high_plains_dry", new BiomeHighPlainsSubtropical(BiomeHighPlainsSubtropical.MoistureType.DRY), false, Type.PLAINS);
        WorldGenEnums.SUBTROPICAL_HIGH_PLAINS_AVERAGE = register("subtropical_high_plains_average", new BiomeHighPlainsSubtropical(BiomeHighPlainsSubtropical.MoistureType.AVERAGE), false, Type.PLAINS);
        WorldGenEnums.SUBTROPICAL_HIGH_PLAINS_DAMP = register("subtropical_high_plains_damp", new BiomeHighPlainsSubtropical(BiomeHighPlainsSubtropical.MoistureType.DAMP), false, Type.PLAINS);

        WorldGenEnums.SUBTROPICAL_PLAINS_DRY = register("subtropical_plains_dry", new BiomePlainsSubtropical(BiomePlainsSubtropical.MoistureType.DRY), false, Type.PLAINS);
        WorldGenEnums.SUBTROPICAL_PLAINS_AVERAGE = register("subtropical_plains_average", new BiomePlainsSubtropical(BiomePlainsSubtropical.MoistureType.AVERAGE), false, Type.PLAINS);
        WorldGenEnums.SUBTROPICAL_PLAINS_DAMP = register("subtropical_plains_damp", new BiomePlainsSubtropical(BiomePlainsSubtropical.MoistureType.DAMP), false, Type.PLAINS);
        WorldGenEnums.SUBTROPICAL_PLAINS_VERY_DAMP = register("subtropical_plains_very_damp", new BiomePlainsSubtropical(BiomePlainsSubtropical.MoistureType.VERY_DAMP), false, Type.PLAINS);

        WorldGenEnums.SUBTROPICAL_HILLS_DRY = register("subtropical_hills_dry", new BiomeHillsSubtropical(BiomeHillsSubtropical.MoistureType.DRY), false, Type.HILLS);
        WorldGenEnums.SUBTROPICAL_HILLS_AVERAGE = register("subtropical_hills_average", new BiomeHillsSubtropical(BiomeHillsSubtropical.MoistureType.AVERAGE), false, Type.HILLS);
        WorldGenEnums.SUBTROPICAL_HILLS_DAMP = register("subtropical_hills_damp", new BiomeHillsSubtropical(BiomeHillsSubtropical.MoistureType.DAMP), false, Type.HILLS);
        WorldGenEnums.SUBTROPICAL_HILLS_VERY_DAMP = register("subtropical_hills_very_damp", new BiomeHillsSubtropical(BiomeHillsSubtropical.MoistureType.VERY_DAMP), false, Type.HILLS, Type.WET);

        WorldGenEnums.SUBTROPICAL_HILLS_EDGE_DRY = register("subtropical_hills_edge_dry", new BiomeHillsEdgeSubtropical(BiomeHillsEdgeSubtropical.MoistureType.DRY), false, Type.HILLS);
        WorldGenEnums.SUBTROPICAL_HILLS_EDGE_AVERAGE = register("subtropical_hills_edge_average", new BiomeHillsEdgeSubtropical(BiomeHillsEdgeSubtropical.MoistureType.AVERAGE), false, Type.HILLS);
        WorldGenEnums.SUBTROPICAL_HILLS_EDGE_DAMP = register("subtropical_hills_edge_damp", new BiomeHillsEdgeSubtropical(BiomeHillsEdgeSubtropical.MoistureType.DAMP), false, Type.HILLS);
        WorldGenEnums.SUBTROPICAL_HILLS_EDGE_VERY_DAMP = register("subtropical_hills_edge_very_damp", new BiomeHillsEdgeSubtropical(BiomeHillsEdgeSubtropical.MoistureType.VERY_DAMP), false, Type.HILLS, Type.WET);

        WorldGenEnums.SUBTROPICAL_FOREST_DRY = register("subtropical_forest_dry", new BiomeForestSubtropical(BiomeForestSubtropical.MoistureType.DRY), false, Type.FOREST);
        WorldGenEnums.SUBTROPICAL_FOREST_AVERAGE = register("subtropical_forest_average", new BiomeForestSubtropical(BiomeForestSubtropical.MoistureType.AVERAGE), false, Type.FOREST);
        WorldGenEnums.SUBTROPICAL_FOREST_DAMP = register("subtropical_forest_damp", new BiomeForestSubtropical(BiomeForestSubtropical.MoistureType.DAMP), false, Type.FOREST);
        WorldGenEnums.SUBTROPICAL_FOREST_VERY_DAMP = register("subtropical_forest_damp", new BiomeForestSubtropical(BiomeForestSubtropical.MoistureType.VERY_DAMP), false, Type.FOREST, Type.WET);

        WorldGenEnums.SUBTROPICAL_SWAMP_DRY = register("subtropical_swamp_dry", new BiomeSwampSubtropical(BiomeSwampSubtropical.MoistureType.DRY), false, Type.SWAMP);
        WorldGenEnums.SUBTROPICAL_SWAMP_AVERAGE = register("subtropical_swamp_average", new BiomeSwampSubtropical(BiomeSwampSubtropical.MoistureType.AVERAGE), false, Type.SWAMP);
        WorldGenEnums.SUBTROPICAL_SWAMP_DAMP = register("subtropical_swamp_damp", new BiomeSwampSubtropical(BiomeSwampSubtropical.MoistureType.DAMP), false, Type.SWAMP);


        // TROPICAL

        WorldGenEnums.TROPICAL_OCEAN = register("tropical_ocean", new BiomeOceanTropical(), false, Type.OCEAN, Type.WATER, Type.HOT);
        WorldGenEnums.TROPICAL_DEEP_OCEAN = register("tropical_deep_ocean", new BiomeDeepOceanTropical(), false, Type.OCEAN, Type.WATER, Type.HOT);
        WorldGenEnums.TROPICAL_BEACH = register("tropical_beach", new BiomeBeachTropical(), false, Type.BEACH, Type.HOT);
        WorldGenEnums.TROPICAL_LAKE = register("tropical_lake", new BiomeLakeTropical(), false, Type.WATER, Type.HOT);
        WorldGenEnums.TROPICAL_RIVER = register("tropical_river", new BiomeRiverTropical(), false, Type.RIVER, Type.HOT);

        WorldGenEnums.TROPICAL_MOUNTAIN_DRY = register("tropical_mountain_dry", new BiomeMountainTropical(BiomeMountainTropical.MoistureType.DRY), false, Type.MOUNTAIN, Type.HOT);
        WorldGenEnums.TROPICAL_MOUNTAIN_AVERAGE = register("tropical_mountain_average", new BiomeMountainTropical(BiomeMountainTropical.MoistureType.AVERAGE), false, Type.MOUNTAIN, Type.HOT);
        WorldGenEnums.TROPICAL_MOUNTAIN_DAMP = register("tropical_mountain_damp", new BiomeMountainTropical(BiomeMountainTropical.MoistureType.DAMP), false, Type.MOUNTAIN, Type.HOT);
        WorldGenEnums.TROPICAL_MOUNTAIN_VERY_DAMP = register("tropical_mountain_very_damp", new BiomeMountainTropical(BiomeMountainTropical.MoistureType.VERY_DAMP), false, Type.MOUNTAIN, Type.JUNGLE, Type.HOT, Type.WET);
        WorldGenEnums.TROPICAL_MOUNTAIN_WET = register("tropical_mountain_wet", new BiomeMountainTropical(BiomeMountainTropical.MoistureType.WET), false, Type.MOUNTAIN, Type.JUNGLE, Type.HOT, Type.WET);

        WorldGenEnums.TROPICAL_MOUNTAIN_EDGE_DRY = register("tropical_mountain_edge_dry", new BiomeMountainEdgeTropical(BiomeMountainEdgeTropical.MoistureType.DRY), false, Type.MOUNTAIN, Type.HOT);
        WorldGenEnums.TROPICAL_MOUNTAIN_EDGE_AVERAGE = register("tropical_mountain_edge_average", new BiomeMountainEdgeTropical(BiomeMountainEdgeTropical.MoistureType.AVERAGE), false, Type.MOUNTAIN, Type.HOT);
        WorldGenEnums.TROPICAL_MOUNTAIN_EDGE_DAMP = register("tropical_mountain_edge_damp", new BiomeMountainEdgeTropical(BiomeMountainEdgeTropical.MoistureType.DAMP), false, Type.MOUNTAIN, Type.HOT);
        WorldGenEnums.TROPICAL_MOUNTAIN_EDGE_VERY_DAMP = register("tropical_mountain_edge_very_damp", new BiomeMountainEdgeTropical(BiomeMountainEdgeTropical.MoistureType.VERY_DAMP), false, Type.MOUNTAIN, Type.JUNGLE, Type.HOT, Type.WET);
        WorldGenEnums.TROPICAL_MOUNTAIN_EDGE_WET = register("tropical_mountain_edge_wet", new BiomeMountainEdgeTropical(BiomeMountainEdgeTropical.MoistureType.WET), false, Type.MOUNTAIN, Type.JUNGLE, Type.HOT, Type.WET);

        WorldGenEnums.TROPICAL_HIGH_PLAINS_DRY = register("tropical_high_plains_dry", new BiomeHighPlainsTropical(BiomeHighPlainsTropical.MoistureType.DRY), false, Type.PLAINS, Type.HOT);
        WorldGenEnums.TROPICAL_HIGH_PLAINS_AVERAGE = register("tropical_high_plains_average", new BiomeHighPlainsTropical(BiomeHighPlainsTropical.MoistureType.AVERAGE), false, Type.PLAINS, Type.HOT);
        WorldGenEnums.TROPICAL_HIGH_PLAINS_DAMP = register("tropical_high_plains_damp", new BiomeHighPlainsTropical(BiomeHighPlainsTropical.MoistureType.DAMP), false, Type.PLAINS);
        WorldGenEnums.TROPICAL_HIGH_PLAINS_VERY_DAMP = register("tropical_high_plains_very_damp", new BiomeHighPlainsTropical(BiomeHighPlainsTropical.MoistureType.VERY_DAMP), false, Type.PLAINS, Type.HOT, Type.WET);
        WorldGenEnums.TROPICAL_HIGH_PLAINS_WET = register("tropical_high_plains_wet", new BiomeHighPlainsTropical(BiomeHighPlainsTropical.MoistureType.WET), false, Type.PLAINS, Type.HOT, Type.WET);

        WorldGenEnums.TROPICAL_PLAINS_VERY_DRY = register("tropical_plains_very_dry", new BiomePlainsTropical(BiomePlainsTropical.MoistureType.VERY_DRY), false, Type.PLAINS, Type.SAVANNA, Type.HOT, Type.DRY);
        WorldGenEnums.TROPICAL_PLAINS_DRY = register("tropical_plains_dry", new BiomePlainsTropical(BiomePlainsTropical.MoistureType.DRY), false, Type.PLAINS, Type.SAVANNA, Type.HOT);

        WorldGenEnums.TROPICAL_HILLS_DRY = register("tropical_hills_dry", new BiomeHillsTropical(BiomeHillsTropical.MoistureType.DRY), false, Type.HILLS, Type.HOT);
        WorldGenEnums.TROPICAL_HILLS_AVERAGE = register("tropical_hills_average", new BiomeHillsTropical(BiomeHillsTropical.MoistureType.AVERAGE), false, Type.HILLS, Type.HOT);
        WorldGenEnums.TROPICAL_HILLS_DAMP = register("tropical_hills_damp", new BiomeHillsTropical(BiomeHillsTropical.MoistureType.DAMP), false, Type.HILLS, Type.HOT);
        WorldGenEnums.TROPICAL_HILLS_VERY_DAMP = register("tropical_hills_very_damp", new BiomeHillsTropical(BiomeHillsTropical.MoistureType.VERY_DAMP), false, Type.HILLS, Type.JUNGLE, Type.HOT, Type.WET);
        WorldGenEnums.TROPICAL_HILLS_WET = register("tropical_hills_wet", new BiomeHillsTropical(BiomeHillsTropical.MoistureType.WET), false, Type.HILLS, Type.JUNGLE Type.HOT, Type.WET);

        WorldGenEnums.TROPICAL_HILLS_EDGE_DRY = register("tropical_hills_edge_dry", new BiomeHillsEdgeTropical(BiomeHillsEdgeTropical.MoistureType.DRY), false, Type.HILLS, Type.HOT);
        WorldGenEnums.TROPICAL_HILLS_EDGE_AVERAGE = register("tropical_hills_edge_average", new BiomeHillsEdgeTropical(BiomeHillsEdgeTropical.MoistureType.AVERAGE), false, Type.HILLS, Type.HOT);
        WorldGenEnums.TROPICAL_HILLS_EDGE_DAMP = register("tropical_hills_edge_damp", new BiomeHillsEdgeTropical(BiomeHillsEdgeTropical.MoistureType.DAMP), false, Type.HILLS, Type.HOT);
        WorldGenEnums.TROPICAL_HILLS_EDGE_VERY_DAMP = register("tropical_hills_edge_very_damp", new BiomeHillsEdgeTropical(BiomeHillsEdgeTropical.MoistureType.VERY_DAMP), false, Type.HILLS, Type.JUNGLE, Type.HOT, Type.WET);
        WorldGenEnums.TROPICAL_HILLS_EDGE_WET = register("tropical_hills_edge_wet", new BiomeHillsEdgeTropical(BiomeHillsEdgeTropical.MoistureType.WET), false, Type.HILLS, Type.JUNGLE, Type.HOT, Type.WET);

        WorldGenEnums.TROPICAL_FOREST_DRY = register("tropical_forest_dry", new BiomeForestTropical(BiomeForestTropical.MoistureType.DRY), false, Type.FOREST, Type.HOT);
        WorldGenEnums.TROPICAL_FOREST_AVERAGE = register("tropical_forest_average", new BiomeForestTropical(BiomeForestTropical.MoistureType.AVERAGE), false, Type.FOREST, Type.HOT);
        WorldGenEnums.TROPICAL_FOREST_DAMP = register("tropical_forest_damp", new BiomeForestTropical(BiomeForestTropical.MoistureType.DAMP), false, Type.FOREST, Type.HOT);
        WorldGenEnums.TROPICAL_FOREST_VERY_DAMP = register("tropical_forest_damp", new BiomeForestTropical(BiomeForestTropical.MoistureType.VERY_DAMP), false, Type.FOREST, Type.JUNGLE, Type.HOT, Type.WET);
        WorldGenEnums.TROPICAL_FOREST_WET = register("tropical_forest_wet", new BiomeForestTropical(BiomeForestTropical.MoistureType.WET), false, Type.FOREST, Type.JUNGLE, Type.HOT, Type.WET);

        WorldGenEnums.TROPICAL_SWAMP_DRY = register("tropical_swamp_dry", new BiomeSwampTropical(BiomeSwampTropical.MoistureType.DRY), false, Type.SWAMP, Type.HOT);
        WorldGenEnums.TROPICAL_SWAMP_AVERAGE = register("tropical_swamp_average", new BiomeSwampTropical(BiomeSwampTropical.MoistureType.AVERAGE), false, Type.SWAMP, Type.HOT);
        WorldGenEnums.TROPICAL_SWAMP_DAMP = register("tropical_swamp_damp", new BiomeSwampTropical(BiomeSwampTropical.MoistureType.DAMP), false, Type.SWAMP, Type.HOT);


        // ARID

        WorldGenEnums.ARID_OCEAN = register("arid_ocean", new BiomeOceanArid(), false, Type.OCEAN, Type.WATER, Type.HOT);
        WorldGenEnums.ARID_DEEP_OCEAN = register("arid_deep_ocean", new BiomeDeepOceanArid(), false, Type.OCEAN, Type.WATER, Type.HOT);
        WorldGenEnums.ARID_BEACH = register("arid_beach", new BiomeBeachArid(), false, Type.BEACH, Type.HOT);
        WorldGenEnums.ARID_LAKE = register("arid_lake", new BiomeLakeArid(), false, Type.WATER, Type.HOT, Type.RARE);
        WorldGenEnums.ARID_RIVER = register("arid_river", new BiomeRiverArid(), false, Type.RIVER, Type.HOT);

        WorldGenEnums.ARID_MESA_MOUNTAIN_ARID = register("arid_mesa_mountain_arid", new BiomeMountainArid(), false, Type.MOUNTAIN, Type.MESA, Type.HOT, Type.DRY);
        WorldGenEnums.ARID_MESA_HIGH_PLAINS_ARID = register("arid_mesa_high_plains_arid", new BiomeHighPlainsArid(), false, Type.PLAINS, Type.MESA, Type.HOT, Type.DRY);
        WorldGenEnums.ARID_MESA_PLAINS_ARID = register("arid_mesa_plains_arid", new BiomePlainsArid(), false, Type.PLAINS, Type.MESA, Type.HOT, Type.DRY);
        WorldGenEnums.ARID_MESA_HILLS_ARID = register("arid_mesa_hills_arid", new BiomeHillsArid(), false, Type.HILLS, Type.MESA, Type.HOT, Type.DRY);
        WorldGenEnums.ARID_MESA_HILLS_EDGE_ARID = register("arid_mesa_hills_edge_arid", new BiomeHillsEdgeArid(), false, Type.HILLS, Type.MESA, Type.HOT, Type.DRY);

        WorldGenEnums.ARID_DESERT_PLAINS_ARID = register("arid_desert_plains_arid", new BiomePlainsArid(), false, Type.PLAINS, Type.SANDY, Type.HOT, Type.DRY);
        WorldGenEnums.ARID_DESERT_HILLS_ARID = register("arid_desert_hills_arid", new BiomeHillsArid(), false, Type.HILLS, Type.SANDY, Type.HOT, Type.DRY);
        WorldGenEnums.ARID_DESERT_HILLS_EDGE_ARID = register("arid_desert_hills_edge_arid", new BiomeHillsEdgeArid(), false, Type.HILLS, Type.SANDY, Type.HOT, Type.DRY);

        WorldGenEnums.ARID_SCRUBLAND_PLAINS_DRY = register("arid_scrubland_plains_dry", new BiomePlainsArid(), false, Type.PLAINS, Type.HOT, Type.DRY);
        WorldGenEnums.ARID_SCRUBLAND_HILLS_DRY = register("arid_scrubland_hills_dry", new BiomeHillsArid(), false, Type.HILLS, Type.HOT, Type.DRY);
        WorldGenEnums.ARID_SCRUBLAND_HILLS_EDGE_DRY = register("arid_scrubland_hills_edge_dry", new BiomeHillsEdgeArid(), false, Type.HILLS, Type.HOT, Type.DRY);

        WorldGenEnums.ARID_SALT_PLAINS_DRY = register("arid_salt_plains_dry", new BiomeSaltPlainsArid(), false, Type.PLAINS, Type.HOT, Type.DRY);

        // HELL

        WorldGenEnums.HELL_OCEAN = register("hell_ocean", new BiomeOceanHell(), false, Type.OCEAN, Type.WATER, Type.HOT);
        WorldGenEnums.HELL_DEEP_OCEAN = register("hell_deep_ocean", new BiomeDeepOceanHell(), false, Type.OCEAN, Type.WATER, Type.HOT);
        WorldGenEnums.HELL_BEACH = register("hell_beach", new BiomeBeachHell(), false, Type.BEACH, Type.NETHER, Type.WASTELAND, Type.HOT, Type.DRY);
        WorldGenEnums.HELL_LAKE = register("hell_lake", new BiomeLakeHell(), false, Type.NETHER, Type.WASTELAND, Type.HOT, Type.DRY);
        WorldGenEnums.HELL_RIVER = register("hell_river", new BiomeRiverHell(), false, Type.RIVER, Type.NETHER, Type.WASTELAND, Type.HOT, Type.DRY);
        WorldGenEnums.HELL_MOUNTAIN_ARID = register("hell_mountain_arid", new BiomeMountainHell(), false, Type.MOUNTAIN, Type.NETHER, Type.WASTELAND, Type.HOT, Type.DRY);
        WorldGenEnums.HELL_PLAINS_ARID = register("hell_plains_arid", new BiomeRiverHell(), false, Type.PLAINS, Type.NETHER, Type.WASTELAND, Type.HOT, Type.DRY);
        WorldGenEnums.HELL_RIVER_CANYON_ARID = register("hell_river_canyon_arid", new BiomeRiverCanyonHell(), false, Type.RIVER, Type.NETHER, Type.WASTELAND, Type.HOT, Type.DRY);

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
