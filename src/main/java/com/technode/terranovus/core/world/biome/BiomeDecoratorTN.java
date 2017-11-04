package com.technode.terranovus.core.world.biome;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeDecorator;

import java.util.Random;

public class BiomeDecoratorTN extends BiomeDecorator
{
    public int grassPerChunk;
    public BiomeTN biome;

    public int mushroomsPerChunk;
    public int treesPerChunk;
    public int deadBushPerChunk;
    public int clayPerChunk;
    public int cactiPerChunk;
    public int waterPlantsPerChunk;
    public int reedsPerChunk;
    public int lilyPadPerChunk;

    public BiomeDecoratorTN(BiomeTN par1)
    {
        super();
        this.grassPerChunk = 1;
        this.mushroomsPerChunk = 0;
        treesPerChunk = 30;
        this.cactiPerChunk = 2;
        this.waterPlantsPerChunk = 30;
        this.reedGen = new WorldGenCustomReed();
        this.sandGen = new WorldGenCustomSand();
        biome = par1;
    }

    @Override
    protected void getDecorations(Biome bgb)
    {
        this.generateOres();
        int var2;
        int xCoord;
        int yCoord;
        int zCoord;

        Random rand = new Random(this.currentWorld.getSeed() + ((chunk_X >> 7) - (chunk_Z >> 7)) * (chunk_Z >> 7));
    }
}
