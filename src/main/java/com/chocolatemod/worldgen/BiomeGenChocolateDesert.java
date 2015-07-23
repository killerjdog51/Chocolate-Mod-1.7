package com.chocolatemod.worldgen;

import com.chocolatemod.block.BlockRegistry;
import net.minecraft.world.World;

import java.util.Random;

public class BiomeGenChocolateDesert extends BiomeGenChocolateBase {
	private static final String __OBFID = "CL_00000167";

	public BiomeGenChocolateDesert(int p_i1977_1_) {
		super(p_i1977_1_);
		this.spawnableCreatureList.clear();
		this.topBlock = BlockRegistry.chocoSand;
		this.fillerBlock = BlockRegistry.chocoSand;
		this.theBiomeDecorator.treesPerChunk = -999;
		this.theBiomeDecorator.deadBushPerChunk = 2;
		this.theBiomeDecorator.reedsPerChunk = 50;
		this.theBiomeDecorator.cactiPerChunk = 10;
		this.spawnableCreatureList.clear();
	}

	public void decorate(World p_76728_1_, Random p_76728_2_, int p_76728_3_, int p_76728_4_) {
		super.decorate(p_76728_1_, p_76728_2_, p_76728_3_, p_76728_4_);

		if (p_76728_2_.nextInt(1000) == 0) {
			int k = p_76728_3_ + p_76728_2_.nextInt(16) + 8;
			int l = p_76728_4_ + p_76728_2_.nextInt(16) + 8;
			WorldGenChocolateDesertWell worldgendesertwells = new WorldGenChocolateDesertWell();
			worldgendesertwells.generate(p_76728_1_, p_76728_2_, k, p_76728_1_.getHeightValue(k, l) + 1, l);
		}
	}
}