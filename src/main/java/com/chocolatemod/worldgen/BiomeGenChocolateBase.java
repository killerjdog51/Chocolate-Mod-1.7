package com.chocolatemod.worldgen;

import com.chocolatemod.block.BlockRegistry;
import com.chocolatemod.liquids.LiquidRegistry;
import com.chocolatemod.mobs.*;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.monster.*;
import net.minecraft.entity.passive.EntityBat;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.entity.passive.EntitySquid;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeDecorator;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraft.world.gen.feature.WorldGenTallGrass;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;

import java.util.ArrayList;
import java.util.Random;

public class BiomeGenChocolateBase extends BiomeGenBase {


	public static BiomeGenBase chocolateForest;
	public static BiomeGenBase chocolateMountians;
	public static BiomeGenBase chocolateMushroom;
	public static BiomeGenBase chocolatePlains;
	public static BiomeGenBase chocolateSwamp;
	public static BiomeGenBase chocolateJungle;
	public static BiomeGenBase chocolateRiver;
	public static BiomeGenBase chocolateOcean;
	public static BiomeGenBase chocolateDesert;

	static {
		chocolatePlains = new BiomeGenChocolatePlains(150).setBiomeName("Chocolate Plains").setColor(5470985);
		chocolateForest = new BiomeGenChocolateForest(151, 0).setBiomeName("Chocolate Forest").setColor(5470985);
		chocolateMountians = new BiomeGenChocolateMountian(152).setBiomeName("Chocolate Mountians").setColor(5470985);
		chocolateMushroom = new BiomeGenChocolateMushroom(153).setBiomeName("Chocolate Mushrooms").setColor(5470985);
		chocolateSwamp = new BiomeGenChocolateSwamp(154).setBiomeName("Chocolate Swamp").setColor(5470985);
		chocolateJungle = new BiomeGenChocolateJungle(155).setBiomeName("Chocolate Jungle").setColor(5470985);
		chocolateRiver = new BiomeGenChocolateRiver(156).setBiomeName("Chocolate River").setColor(5470985);
		chocolateOcean = new BiomeGenChocolateOcean(157).setBiomeName("Chocolate Ocean").setColor(5470985);
		chocolateDesert = (new BiomeGenChocolateDesert(158)).setColor(16421912).setBiomeName("Chocolate Desert").setDisableRain().setTemperatureRainfall(2.0F, 0.0F).setHeight(height_LowPlains);

	}

	/**
	 * The tree generator.
	 */
	protected WorldGenCocoaTree worldGeneratorCocoaTrees;
	protected WorldGenChocolateTree worldGeneratorChocolateTrees;
	protected WorldGenDarkChocolateTree worldGeneratorDarkChocolateTrees;
	protected WorldGenLightChocolateTree worldGeneratorLightChocolateTrees;
	protected WorldGenWhiteChocolateTree worldGeneratorWhiteChocolateTrees;
	/**
	 * The big tree generator.
	 */
	protected WorldGenMegaCocoa worldGeneratorBigChocolateTree;
	/**
	 * The swamp tree generator.
	 */
	protected WorldGenChocolateSwamp worldGeneratorChocolateSwamp;

	public BiomeGenChocolateBase(int biomeID) {
		super(biomeID);

		this.worldGeneratorCocoaTrees = new WorldGenCocoaTree(false);
		this.worldGeneratorChocolateTrees = new WorldGenChocolateTree(false, false);
		this.worldGeneratorDarkChocolateTrees = new WorldGenDarkChocolateTree(false);
		this.worldGeneratorLightChocolateTrees = new WorldGenLightChocolateTree(false, false);
		this.worldGeneratorWhiteChocolateTrees = new WorldGenWhiteChocolateTree(false);
		this.worldGeneratorBigChocolateTree = new WorldGenMegaCocoa(false, 10, 20, 0, 0);
		this.worldGeneratorChocolateSwamp = new WorldGenChocolateSwamp();
		this.theBiomeDecorator = new BiomeDecoratorChocolate(this);
		this.topBlock = BlockRegistry.chocoGrass;
		this.fillerBlock = BlockRegistry.chocoDirt;
		this.field_76754_C = 5169201;
		this.rootHeight = height_Default.rootHeight;
		this.heightVariation = height_Default.variation;
		this.spawnableCreatureList.clear();
		this.spawnableMonsterList = new ArrayList();
		this.spawnableCreatureList = new ArrayList();
		this.spawnableWaterCreatureList = new ArrayList();
		this.spawnableCaveCreatureList = new ArrayList();
		this.spawnableCreatureList.add(new BiomeGenBase.SpawnListEntry(EntitySheep.class, 12, 4, 4));
		this.spawnableCreatureList.add(new BiomeGenBase.SpawnListEntry(Entitychocolatepig.class, 10, 4, 4));
		this.spawnableCreatureList.add(new BiomeGenBase.SpawnListEntry(Entitydarkchocolatepig.class, 10, 4, 4));
		this.spawnableCreatureList.add(new BiomeGenBase.SpawnListEntry(Entitylightchocolatepig.class, 10, 4, 4));
		this.spawnableCreatureList.add(new BiomeGenBase.SpawnListEntry(Entitywhitechocolatepig.class, 10, 4, 4));
		this.spawnableCreatureList.add(new BiomeGenBase.SpawnListEntry(Entitychocolatechicken.class, 10, 4, 4));
		this.spawnableCreatureList.add(new BiomeGenBase.SpawnListEntry(Entitycocoacow.class, 8, 4, 4));
		this.spawnableCreatureList.add(new BiomeGenBase.SpawnListEntry(Entitydarkcocoacow.class, 8, 4, 4));
		this.spawnableCreatureList.add(new BiomeGenBase.SpawnListEntry(Entitylightcocoacow.class, 8, 4, 4));
		this.spawnableCreatureList.add(new BiomeGenBase.SpawnListEntry(Entitywhitecocoacow.class, 8, 4, 4));
		this.spawnableMonsterList.add(new BiomeGenBase.SpawnListEntry(EntitySpider.class, 100, 4, 4));
		this.spawnableMonsterList.add(new BiomeGenBase.SpawnListEntry(EntityZombie.class, 100, 4, 4));
		this.spawnableMonsterList.add(new BiomeGenBase.SpawnListEntry(EntitySkeleton.class, 100, 4, 4));
		this.spawnableMonsterList.add(new BiomeGenBase.SpawnListEntry(EntityCreeper.class, 100, 4, 4));
		this.spawnableMonsterList.add(new BiomeGenBase.SpawnListEntry(Entitychocolateglob.class, 100, 4, 4));
		this.spawnableMonsterList.add(new BiomeGenBase.SpawnListEntry(Entitydarkchocolateglob.class, 100, 4, 4));
		this.spawnableMonsterList.add(new BiomeGenBase.SpawnListEntry(Entitylightchocolateglob.class, 100, 4, 4));
		this.spawnableMonsterList.add(new BiomeGenBase.SpawnListEntry(Entitywhitechocolateglob.class, 100, 4, 4));
		this.spawnableMonsterList.add(new BiomeGenBase.SpawnListEntry(EntityEnderman.class, 10, 1, 4));
		this.spawnableMonsterList.add(new BiomeGenBase.SpawnListEntry(EntityWitch.class, 5, 1, 1));
		this.spawnableWaterCreatureList.add(new BiomeGenBase.SpawnListEntry(EntitySquid.class, 10, 4, 4));
		this.spawnableCaveCreatureList.add(new BiomeGenBase.SpawnListEntry(EntityBat.class, 10, 8, 8));
		this.addDefaultFlowers();
	}

	@Override
	public BiomeDecorator createBiomeDecorator() {
		return new BiomeDecoratorChocolate(this);
	}

	@Override
	public WorldGenAbstractTree func_150567_a(Random p_150567_1_) {
		return (WorldGenAbstractTree) (p_150567_1_.nextInt(10) == 0 ? this.worldGeneratorCocoaTrees : this.worldGeneratorChocolateTrees);
	}

	public WorldGenerator getRandomWorldGenForGrass(Random random) {
		if (random.nextInt(4) == 0)
			return new WorldGenTallGrass(Blocks.tallgrass, 2);
		else
			return new WorldGenTallGrass(Blocks.tallgrass, 1);
	}

	public static void registerWithBiomeDictionary() {
		BiomeDictionary.registerBiomeType(chocolateForest, Type.FOREST);
		BiomeDictionary.registerBiomeType(chocolateMountians, Type.MOUNTAIN);
		BiomeDictionary.registerBiomeType(chocolateMushroom, Type.MUSHROOM);
		BiomeDictionary.registerBiomeType(chocolatePlains, Type.PLAINS);
		BiomeDictionary.registerBiomeType(chocolateSwamp, Type.SWAMP);
		BiomeDictionary.registerBiomeType(chocolateJungle, Type.JUNGLE);
		BiomeDictionary.registerBiomeType(chocolateRiver, Type.WATER);
		BiomeDictionary.registerBiomeType(chocolateOcean, Type.WATER);
		BiomeDictionary.registerAllBiomes();
	}

	/**
	 * Replaces custom Stone to allow top/filler blocks to work in dimension.
	 *
	 * @param world
	 * @param random
	 * @param replacableBlock
	 * @param aByte
	 * @param par5
	 * @param par6
	 * @param par7
	 */
	@Override
	public void genTerrainBlocks(World world, Random random, Block[] replacableBlock, byte[] aByte, int par5, int par6, double par7) {
		Block block = this.topBlock;
		byte b0 = (byte) (this.field_150604_aj & 255);
		Block block1 = this.fillerBlock;
		int k = -1;
		int l = (int) (par7 / 3.0D + 3.0D + random.nextDouble() * 0.25D);
		int i1 = par5 & 15;
		int j1 = par6 & 15;
		int k1 = replacableBlock.length / 256;

		for (int l1 = 255; l1 >= 0; --l1) {
			int i2 = (j1 * 16 + i1) * k1 + l1;

			if (l1 <= 0 + random.nextInt(5)) {
				replacableBlock[i2] = Blocks.bedrock;
			} else {
				Block block2 = replacableBlock[i2];

				if (block2 != null && block2.getMaterial() != Material.air) {
					if (block2 == BlockRegistry.chocoStone) {
						if (k == -1) {
							if (l <= 0) {
								block = null;
								b0 = 0;
								block1 = BlockRegistry.chocoStone;
							} else if (l1 >= 59 && l1 <= 64) {
								block = this.topBlock;
								b0 = (byte) (this.field_150604_aj & 255);
								block1 = this.fillerBlock;
							}

							if (l1 < 63 && (block == null || block.getMaterial() == Material.air)) {
								if (this.getFloatTemperature(par5, l1, par6) < 0.15F) {
									block = Blocks.ice;
									b0 = 0;
								} else {
									block = LiquidRegistry.chocolateMilkBlock;
									b0 = 0;
								}
							}

							k = l;

							if (l1 >= 62) {
								replacableBlock[i2] = block;
								aByte[i2] = b0;
							} else if (l1 < 56 - l) {
								block = null;
								block1 = BlockRegistry.chocoStone;
								replacableBlock[i2] = Blocks.gravel;
							} else {
								replacableBlock[i2] = block1;
							}
						} else if (k > 0) {
							--k;
							replacableBlock[i2] = block1;

							if (k == 0 && block1 == BlockRegistry.chocoSand) {
								k = random.nextInt(4) + Math.max(0, l1 - 63);
								block1 = BlockRegistry.chocoSandstone;
							}
						}
					}
				} else {
					k = -1;
				}
			}
		}
	}
}

