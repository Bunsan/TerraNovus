package com.technode.terranovus.core.world.biome;

import net.minecraft.world.biome.Biome;

public class BiomeTN extends Biome {

	public static float riverDepthMin = -0.5F;
	public static float riverDepthMax = -0.3F;

	public BiomeDecoratorTN tnBiomeDecorator;

	public BiomeTN(BiomeProperties properties) {
		super(properties);



		// TODO Auto-generated constructor stub
	}
	public enum MoistureType {ARID, VERY_DRY, DRY, AVERAGE, DAMP, VERY_DAMP, WET}

	public BiomeTN.MoistureType type;

	public BiomeTN(BiomeTN.MoistureType type) {
		super(type.name().toLowerCase(), new);
		//Will have a modifier for flora and fauna density. So lower humidity will affect tree density, crop density and animal spawns. Will also affect what grass block will spawn.

		switch (type) {
			case ARID:
				//Set rainfall value. Set enableRain and enableSnow to false. Flora and Fauna modifiers. Maybe set top block to sand
				break;
			case VERY_DRY:
				break;
			case DRY:
				break;
			case AVERAGE:
				this.decorator.treesPerChunk = 8;
				break;
			case DAMP:
				break;
			case VERY_DAMP:
				break;
			case WET:
				break;
		}
	}

	public enum TemperatureZone {HELL, HOT, TROPICAL, SUBTROPICAL, TEMPERATE, TAIGA, TUNDRA, POLAR}

	public BiomeTN.TemperatureZone temp;

	public BiomeTN(BiomeTN.TemperatureZone temp) {
		super(temp.name().toLowerCase(), new);
		//Will have a modifier for setTemperature biome value
		switch (temp) {
			case HELL:
				break;
			case HOT:
				break;
			case TROPICAL:
				break;
			case SUBTROPICAL:
				break;
			case TEMPERATE:
				break;
			case TAIGA:
				break;
			case TUNDRA:
				break;
			case POLAR:
				break;
		}
	}

	public static class tnBiomeProperties extends BiomeProperties {

		public tnBiomeProperties(String nameIn) {
			super(nameIn);
			// TODO Auto-generated constructor stub
		}

	}

}

