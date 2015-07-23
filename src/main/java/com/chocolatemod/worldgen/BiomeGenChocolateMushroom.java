package com.chocolatemod.worldgen;

import com.chocolatemod.block.BlockRegistry;
import com.chocolatemod.mobs.EntityAlbinoMooshroom;

import net.minecraft.entity.passive.EntityMooshroom;
import net.minecraft.init.Blocks;
import net.minecraft.world.biome.BiomeDecorator;
import net.minecraft.world.biome.BiomeGenBase;

public class BiomeGenChocolateMushroom extends BiomeGenChocolateBase
{
    private static final String __OBFID = "CL_00000177";
    
	
	

    public BiomeGenChocolateMushroom(int par1)
    {
        super(par1);
       
        this.theBiomeDecorator.treesPerChunk = -100;
        this.theBiomeDecorator.flowersPerChunk = -100;
        this.theBiomeDecorator.grassPerChunk = -100;
        this.theBiomeDecorator.mushroomsPerChunk = 1;
        this.theBiomeDecorator.bigMushroomsPerChunk = 1;
        this.spawnableMonsterList.clear();
        this.spawnableCreatureList.clear();
        this.spawnableWaterCreatureList.clear();
        this.spawnableCreatureList.add(new BiomeGenBase.SpawnListEntry(EntityAlbinoMooshroom.class, 8, 4, 8));
    }
}