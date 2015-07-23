package com.chocolatemod.worldgen;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import java.util.Random;

import com.chocolatemod.mobs.Entitychocolatechicken;
import com.chocolatemod.mobs.Entitycocoacow;
import com.chocolatemod.mobs.Entitydarkcocoacow;
import com.chocolatemod.mobs.Entitylightcocoacow;
import com.chocolatemod.mobs.Entitywhitecocoacow;
import com.chocolatemod.plants.BlockChocolateFlower;
import com.chocolatemod.plants.PlantRegistry;
import com.chocolatemod.block.BlockRegistry;

import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.init.Blocks;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeDecorator;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraft.world.gen.feature.WorldGenBigMushroom;
import net.minecraft.world.gen.feature.WorldGenCanopyTree;
import net.minecraft.world.gen.feature.WorldGenForest;
import net.minecraft.world.gen.feature.WorldGenerator;

public class BiomeGenChocolateForest extends BiomeGenChocolateBase
{
    private int field_150632_aF;
   
    private static final String __OBFID = "CL_00000170";
    
	private WorldGenerator WorldGenChocolateTree;
	private WorldGenerator WorldGenLightChocolateTree;
	private WorldGenerator WorldGenDarkChocolateTree;
	private WorldGenerator WorldGenWhiteChocolateTree;

    public BiomeGenChocolateForest(int p_i45377_1_, int p_i45377_2_)
    {
        super(p_i45377_1_);
      
        
        this.field_150632_aF = p_i45377_2_;
        this.theBiomeDecorator.treesPerChunk = 10;
        this.theBiomeDecorator.grassPerChunk = 2;
        this.topBlock = BlockRegistry.chocoGrass;
        this.fillerBlock = BlockRegistry.chocoDirt;
        this.WorldGenChocolateTree = new WorldGenChocolateTree(true, false);
        this.WorldGenLightChocolateTree = new WorldGenLightChocolateTree(true, false);
        this.WorldGenDarkChocolateTree = new WorldGenDarkChocolateTree(true);
        this.WorldGenWhiteChocolateTree = new WorldGenWhiteChocolateTree(true);
        this.spawnableCreatureList.clear();
        this.spawnableCreatureList.add(new BiomeGenBase.SpawnListEntry(Entitychocolatechicken.class, 6, 5, 7));
    }
    
    /**
     * Gets a WorldGen appropriate for this biome.
     */
    @Override
    public WorldGenAbstractTree func_150567_a(Random par1Random)
    {
    return (WorldGenAbstractTree)(par1Random.nextInt(5) == 0 ? this.WorldGenWhiteChocolateTree : par1Random.nextInt(5) == 0 ? this.WorldGenLightChocolateTree : (par1Random.nextInt(10) == 0 ? this.WorldGenDarkChocolateTree : this.WorldGenChocolateTree ));
    }
    

}
            
                
        
    
