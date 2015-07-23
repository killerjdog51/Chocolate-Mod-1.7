package com.chocolatemod.worldgen;

import com.chocolatemod.mobs.Entitychocolatechicken;
import net.minecraft.entity.passive.EntityOcelot;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraft.world.gen.feature.WorldGenTallGrass;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;

public class BiomeGenChocolateJungle extends BiomeGenChocolateBase {
	public BiomeGenChocolateJungle(int par1) {
		super(par1);

		this.theBiomeDecorator.treesPerChunk = 50;
		this.theBiomeDecorator.grassPerChunk = 25;
		this.theBiomeDecorator.flowersPerChunk = 4;
		this.spawnableMonsterList.add(new SpawnListEntry(EntityOcelot.class, 2, 1, 1));
		this.spawnableCreatureList.add(new SpawnListEntry(Entitychocolatechicken.class, 10, 4, 4));
	}

	/**
	 * Gets a WorldGen appropriate for this biome.
	 */
	@Override
	public WorldGenAbstractTree func_150567_a(Random par1Random) {
		return (WorldGenAbstractTree) (par1Random.nextInt(10) == 0 ? this.worldGeneratorBigChocolateTree : (par1Random.nextInt(2) == 0 ? new WorldGenChocolateShrub(3, 0) : (par1Random.nextInt(3) == 0 ? new WorldGenMegaCocoa(false, 10 + par1Random.nextInt(20), 0, 0, 0) : new WorldGenCocoaTree(false, 4 + par1Random.nextInt(7), 0, 0, true))));
	}

	/**
	 * Gets a WorldGen appropriate for this biome.
	 */
	public WorldGenerator getRandomWorldGenForGrass(Random par1Random) {
		return par1Random.nextInt(4) == 0 ? new WorldGenTallGrass(Blocks.tallgrass, 2) : new WorldGenTallGrass(Blocks.tallgrass, 1);
	}

	public void decorate(World par1World, Random par2Random, int par3, int par4) {
		super.decorate(par1World, par2Random, par3, par4);
		WorldGenStringyCaramel worldgenvines = new WorldGenStringyCaramel();

		for (int k = 0; k < 50; ++k) {
			int l = par3 + par2Random.nextInt(16) + 8;
			byte b0 = 64;
			int i1 = par4 + par2Random.nextInt(16) + 8;
			worldgenvines.generate(par1World, par2Random, l, b0, i1);
		}
	}
}
