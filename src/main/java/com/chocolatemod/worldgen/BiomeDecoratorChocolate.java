package com.chocolatemod.worldgen;

import com.chocolatemod.block.BlockRegistry;
import com.chocolatemod.plants.PlantRegistry;
import net.minecraft.block.BlockFlower;
import net.minecraft.block.material.Material;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeDecorator;
import net.minecraft.world.gen.feature.WorldGenFlowers;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenTallGrass;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.terraingen.DecorateBiomeEvent;
import net.minecraftforge.event.terraingen.TerrainGen;

import java.util.Random;

import static net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.*;


public class BiomeDecoratorChocolate extends BiomeDecorator {

	protected WorldGenerator plantYellowGen1;
	protected WorldGenerator plantYellowGen2;
	protected WorldGenerator plantYellowGen3;
	protected WorldGenerator plantYellowGen4;

	protected WorldGenerator plantRedGen1;
	protected WorldGenerator plantRedGen2;
	protected WorldGenerator plantRedGen3;
	protected WorldGenerator plantRedGen4;

	protected WorldGenerator chocolateOreGen;
	protected WorldGenerator darkchocolateOreGen;
	protected WorldGenerator lightchocolateOreGen;
	protected WorldGenerator whitechocolateOreGen;

	protected WorldGenerator lightchocosandGen;
	protected WorldGenerator darkchocosandGen;

	protected WorldGenerator strawberryGen;

	protected WorldGenerator mintGen;

	protected WorldGenerator nutGen;

	public int bigMushroomsPerChunk;

	public int mushroomsPerChunk;

	public int flowersPerChunk;

	public int grassPerChunk;

	public int treesPerChunk;

	public int nutsPerChunk;

	public int strawberryPerChunk;

	public int mintPerChunk;

	public BiomeDecoratorChocolate(BiomeGenChocolateBase biomeGenChocolateBase) {


		super();

		this.flowersPerChunk = 2;
		this.grassPerChunk = 1;
		this.plantYellowGen1 = new WorldGenFlowers(PlantRegistry.chocolateflower1);
		this.plantYellowGen2 = new WorldGenTallGrass(PlantRegistry.chocolateflower2, 1);
		this.plantYellowGen3 = new WorldGenTallGrass(PlantRegistry.chocolateflower2, 2);
		this.plantYellowGen4 = new WorldGenTallGrass(PlantRegistry.chocolateflower2, 3);
		this.plantRedGen1 = new WorldGenTallGrass(PlantRegistry.chocolateflower2, 4);
		this.plantRedGen2 = new WorldGenTallGrass(PlantRegistry.chocolateflower2, 5);
		this.plantRedGen3 = new WorldGenTallGrass(PlantRegistry.chocolateflower2, 6);
		this.plantRedGen4 = new WorldGenTallGrass(PlantRegistry.chocolateflower2, 7);
		this.dirtGen = new WorldGenMinable(BlockRegistry.chocoDirt, 32, BlockRegistry.chocoStone);
		this.gravelGen = new WorldGenMinable(BlockRegistry.chocoSand, 3, 32, BlockRegistry.chocoStone);
		this.lightchocosandGen = new WorldGenMinable(BlockRegistry.chocoSand, 1, 32, BlockRegistry.chocoStone);
		this.darkchocosandGen = new WorldGenMinable(BlockRegistry.chocoSand, 2, 32, BlockRegistry.chocoStone);
		this.coalGen = new WorldGenMinable(BlockRegistry.chocoCoal, 16, BlockRegistry.chocoStone);
		this.ironGen = new WorldGenMinable(BlockRegistry.chocoIron, 8, BlockRegistry.chocoStone);
		this.chocolateOreGen = new WorldGenMinable(BlockRegistry.chocolateOres, 0, 8, BlockRegistry.chocoStone);
		this.darkchocolateOreGen = new WorldGenMinable(BlockRegistry.chocolateOres, 1, 8, BlockRegistry.chocoStone);
		this.lightchocolateOreGen = new WorldGenMinable(BlockRegistry.chocolateOres, 2, 8, BlockRegistry.chocoStone);
		this.whitechocolateOreGen = new WorldGenMinable(BlockRegistry.chocolateOres, 3, 8, BlockRegistry.chocoStone);
		this.goldGen = new WorldGenMinable(BlockRegistry.chocoGold, 8, BlockRegistry.chocoStone);
		this.redstoneGen = new WorldGenMinable(BlockRegistry.chocoRedstone, 7, BlockRegistry.chocoStone);
		this.diamondGen = new WorldGenMinable(BlockRegistry.chocoDiamond, 7, BlockRegistry.chocoStone);
		this.lapisGen = new WorldGenMinable(BlockRegistry.chocoLapis, 6, BlockRegistry.chocoStone);
		this.mushroomBrownGen = new WorldGenFlowers(PlantRegistry.chocolatemushroomwhite);
		this.mushroomRedGen = new WorldGenFlowers(PlantRegistry.chocolatemushroombrown);
		this.bigMushroomGen = new WorldGenBigChocolateMushroom();


		System.out.println("Biome Decorator is Called");
	}

	public void decorateChunk(World p_150512_1_, Random p_150512_2_, BiomeGenChocolateBase p_150512_3_, int p_150512_4_, int p_150512_5_) {
		if (this.currentWorld != null) {
			throw new RuntimeException("Already decorating Chocolate Dimension!!");
		} else {
			this.currentWorld = p_150512_1_;
			this.randomGenerator = p_150512_2_;
			this.chunk_X = p_150512_4_;
			this.chunk_Z = p_150512_5_;
			this.genDecorations(p_150512_3_);
			this.currentWorld = null;
			this.randomGenerator = null;
		}
	}

	protected void genDecorations(BiomeGenChocolateBase p_150512_3_) {

		MinecraftForge.EVENT_BUS.post(new DecorateBiomeEvent.Pre(currentWorld, randomGenerator, chunk_X, chunk_Z));

		this.generateOres();
		int i;
		int j;
		int k;

		boolean doGen = TerrainGen.decorate(currentWorld, randomGenerator, chunk_X, chunk_Z, SAND);
		for (i = 0; doGen && i < this.sandPerChunk2; ++i) {
			j = this.chunk_X + this.randomGenerator.nextInt(16) + 8;
			k = this.chunk_Z + this.randomGenerator.nextInt(16) + 8;
			this.sandGen.generate(this.currentWorld, this.randomGenerator, j, this.currentWorld.getTopSolidOrLiquidBlock(j, k), k);
		}

		doGen = TerrainGen.decorate(currentWorld, randomGenerator, chunk_X, chunk_Z, CLAY);
		for (i = 0; doGen && i < this.clayPerChunk; ++i) {
			j = this.chunk_X + this.randomGenerator.nextInt(16) + 8;
			k = this.chunk_Z + this.randomGenerator.nextInt(16) + 8;
			this.clayGen.generate(this.currentWorld, this.randomGenerator, j, this.currentWorld.getTopSolidOrLiquidBlock(j, k), k);
		}

		doGen = TerrainGen.decorate(currentWorld, randomGenerator, chunk_X, chunk_Z, SAND_PASS2);
		for (i = 0; doGen && i < this.sandPerChunk; ++i) {
			j = this.chunk_X + this.randomGenerator.nextInt(16) + 8;
			k = this.chunk_Z + this.randomGenerator.nextInt(16) + 8;
			this.sandGen.generate(this.currentWorld, this.randomGenerator, j, this.currentWorld.getTopSolidOrLiquidBlock(j, k), k);
		}

		i = this.treesPerChunk;

		if (this.randomGenerator.nextInt(10) == 0) {
			++i;
		}

		int l;

		doGen = TerrainGen.decorate(currentWorld, randomGenerator, chunk_X, chunk_Z, TREE);
		for (j = 0; doGen && j < i; ++j) {
			k = this.chunk_X + this.randomGenerator.nextInt(16) + 8;
			l = this.chunk_Z + this.randomGenerator.nextInt(16) + 8;
			WorldGenerator worldgenerator = p_150512_3_.func_150567_a(this.randomGenerator);
			worldgenerator.setScale(1.0D, 1.0D, 1.0D);
			worldgenerator.generate(this.currentWorld, this.randomGenerator, k, this.currentWorld.getHeightValue(k, l), l);
		}

		doGen = TerrainGen.decorate(currentWorld, randomGenerator, chunk_X, chunk_Z, BIG_SHROOM);
		for (j = 0; doGen && j < this.bigMushroomsPerChunk; ++j) {
			k = this.chunk_X + this.randomGenerator.nextInt(16) + 8;
			l = this.chunk_Z + this.randomGenerator.nextInt(16) + 8;
			this.bigMushroomGen.generate(this.currentWorld, this.randomGenerator, k, this.currentWorld.getHeightValue(k, l), l);
		}

		int i1;

		doGen = TerrainGen.decorate(currentWorld, randomGenerator, chunk_X, chunk_Z, FLOWERS);
		for (j = 0; doGen && j < this.flowersPerChunk; ++j) {
			k = this.chunk_X + this.randomGenerator.nextInt(16) + 8;
			l = this.chunk_Z + this.randomGenerator.nextInt(16) + 8;
			i1 = nextInt(this.currentWorld.getHeightValue(k, l) + 32);
			String s = p_150512_3_.func_150572_a(this.randomGenerator, k, i1, l);
			BlockFlower blockflower = BlockFlower.func_149857_e(s);

			if (blockflower.getMaterial() != Material.air) {
				this.yellowFlowerGen.func_150550_a(blockflower, BlockFlower.func_149856_f(s));
				this.yellowFlowerGen.generate(this.currentWorld, this.randomGenerator, k, i1, l);
			}
		}


		doGen = TerrainGen.decorate(currentWorld, randomGenerator, chunk_X, chunk_Z, GRASS);
		for (j = 0; doGen && j < this.grassPerChunk; ++j) {
			k = this.chunk_X + this.randomGenerator.nextInt(16) + 8;
			l = this.randomGenerator.nextInt(128);
			i1 = this.chunk_Z + this.randomGenerator.nextInt(16) + 8;
			WorldGenerator worldgenerator = p_150512_3_.getRandomWorldGenForGrass(this.randomGenerator);
			worldgenerator.generate(this.currentWorld, this.randomGenerator, k, l, i1);
		}
	}

	protected void generateOres() {
		this.genStandardOre1(20, this.dirtGen, 0, 128);
		this.genStandardOre1(10, this.gravelGen, 0, 128);
		this.genStandardOre1(10, this.lightchocosandGen, 0, 128);
		this.genStandardOre1(10, this.darkchocosandGen, 0, 128);
		this.genStandardOre1(20, this.coalGen, 0, 128);
		this.genStandardOre1(20, this.ironGen, 0, 64);
		this.genStandardOre1(2, this.goldGen, 0, 32);
		this.genStandardOre1(8, this.redstoneGen, 0, 16);
		this.genStandardOre1(1, this.diamondGen, 0, 16);
		this.genStandardOre2(1, this.lapisGen, 16, 16);
		this.genStandardOre1(20, this.chocolateOreGen, 0, 64);
		this.genStandardOre1(20, this.darkchocolateOreGen, 0, 64);
		this.genStandardOre1(20, this.lightchocolateOreGen, 0, 64);
		this.genStandardOre1(20, this.whitechocolateOreGen, 0, 64);

	}

	private int nextInt(int i) {
		if (i <= 1)
			return 0;
		return this.randomGenerator.nextInt(i);
	}
}
