package com.chocolatemod.worldgen;

import java.util.Random;

import com.chocolatemod.block.BlockRegistry;
import com.chocolatemod.crops.crops;
import com.chocolatemod.mobs.Entitychocolatechicken;
import com.chocolatemod.mobs.Entitycocoacow;
import com.chocolatemod.mobs.Entitydarkcocoacow;
import com.chocolatemod.mobs.Entitylightcocoacow;
import com.chocolatemod.mobs.Entitywhitecocoacow;

import net.minecraft.block.Block;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeDecorator;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenTallGrass;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.common.BiomeDictionary;
import static net.minecraftforge.common.BiomeDictionary.Type;

public class BiomeGenChocolatePlains extends BiomeGenChocolateBase {

	private WorldGenerator theWorldGenerator;
	
	
	
	    protected BiomeGenChocolatePlains(int par1)
	    {
	        super(par1);
	     
	       
	        this.spawnableCreatureList.clear();
	        this.spawnableWaterCreatureList.clear();
	        this.spawnableCreatureList.add(new SpawnListEntry(Entitycocoacow.class, 6, 4, 6));
	        this.spawnableCreatureList.add(new SpawnListEntry(Entitydarkcocoacow.class, 6, 4, 6));
	        this.spawnableCreatureList.add(new SpawnListEntry(Entitylightcocoacow.class, 6, 4, 6));
	        this.spawnableCreatureList.add(new SpawnListEntry(Entitywhitecocoacow.class, 6, 4, 6));
	        this.spawnableCreatureList.add(new SpawnListEntry(Entitychocolatechicken.class, 6, 5, 7));
	        this.theBiomeDecorator.treesPerChunk = -999;
	        this.theBiomeDecorator.grassPerChunk = 10;
	        this.theBiomeDecorator.flowersPerChunk = 1;
	    }
	        
	        public void generate(Random random, int chunkX, int chunkZ, World world,
	        IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
	        {
	            int x = chunkX * 16;
	            int z = chunkZ * 16;
	            
	            BiomeGenBase biome = world.getWorldChunkManager().getBiomeGenAt(x, z);
	            
	            if(BiomeDictionary.isBiomeOfType(biome, Type.PLAINS))
	            {
	                //World generation code
	            }
	        }
	}


