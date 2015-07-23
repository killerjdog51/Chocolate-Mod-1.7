package com.chocolatemod.worldgen;

import com.chocolatemod.mobs.Entitycocoacow;
import com.chocolatemod.mobs.Entitydarkcocoacow;
import com.chocolatemod.mobs.Entitylightcocoacow;
import com.chocolatemod.mobs.Entitywhitecocoacow;
import net.minecraft.world.gen.feature.WorldGenerator;

public class BiomeGenChocolateMountian extends BiomeGenChocolateBase {
	private WorldGenerator theWorldGenerator;


	protected BiomeGenChocolateMountian(int par1) {
		super(par1);

		this.spawnableCreatureList.clear();
		this.spawnableWaterCreatureList.clear();
		this.spawnableCreatureList.add(new SpawnListEntry(Entitycocoacow.class, 6, 4, 6));
		this.spawnableCreatureList.add(new SpawnListEntry(Entitydarkcocoacow.class, 6, 4, 6));
		this.spawnableCreatureList.add(new SpawnListEntry(Entitylightcocoacow.class, 6, 4, 6));
		this.spawnableCreatureList.add(new SpawnListEntry(Entitywhitecocoacow.class, 6, 4, 6));

	}

}


