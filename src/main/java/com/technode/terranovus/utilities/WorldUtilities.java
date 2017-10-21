package com.technode.terranovus.utilities;

import java.util.List;

import com.google.common.collect.Lists;

import net.minecraft.world.biome.Biome;

public class WorldUtilities {
	
    public static List<Biome> getRegisteredBiomes()
    {
        return Lists.newArrayList(Biome.REGISTRY.iterator());
    }

}
