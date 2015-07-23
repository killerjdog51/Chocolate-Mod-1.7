package com.chocolatemod.worldgen;

import cpw.mods.fml.common.eventhandler.Event;
import net.minecraft.block.Block;
import net.minecraft.world.biome.BiomeDecorator;

public class BiomeEventChocolate extends Event {
	public final BiomeGenChocolateBase biome;

	public BiomeEventChocolate(BiomeGenChocolateBase biome) {
		this.biome = biome;
	}

	public static class CreateDecorator extends BiomeEventChocolate {
		public final BiomeDecorator originalBiomeDecorator;
		public BiomeDecorator newBiomeDecorator;

		public CreateDecorator(BiomeGenChocolateBase biome, BiomeDecorator original) {
			super(biome);
			originalBiomeDecorator = original;
			newBiomeDecorator = original;
		}
	}

	public static class BiomeColor extends BiomeEventChocolate {
		public final int originalColor;
		public int newColor;

		public BiomeColor(BiomeGenChocolateBase biome, int original) {
			super(biome);
			originalColor = original;
			newColor = original;
		}
	}

	/**
	 * This event is fired when the village generator attempts to choose a block ID
	 * based on the village's biome.
	 * <p/>
	 * You can cancel the event to override default values
	 */
	@HasResult
	public static class GetVillageBlockID extends BiomeEventChocolate {
		public final Block original;
		public final int type;
		public Block replacement;

		public GetVillageBlockID(BiomeGenChocolateBase biome, Block original, int type) {
			super(biome);
			this.original = original;
			this.type = type;
		}
	}

	/**
	 * This event is fired when the village generator attempts to choose a block
	 * metadata based on the village's biome.
	 * <p/>
	 * You can set the result to DENY to prevent the default block metadata selection.
	 */
	@HasResult
	public static class GetVillageBlockMeta extends BiomeEventChocolate {
		public final Block original;
		public final int type;
		public int replacement;

		public GetVillageBlockMeta(BiomeGenChocolateBase biome, Block original, int type) {
			super(biome);
			this.original = original;
			this.type = type;
		}
	}

	/**
	 * This event is fired when a biome is queried for its grass color.
	 */
	public static class GetGrassColor extends BiomeColor {
		public GetGrassColor(BiomeGenChocolateBase biome, int original) {
			super(biome, original);
		}
	}

	/**
	 * This event is fired when a biome is queried for its grass color.
	 */
	public static class GetFoliageColor extends BiomeColor {
		public GetFoliageColor(BiomeGenChocolateBase biome, int original) {
			super(biome, original);
		}
	}

	/**
	 * This event is fired when a biome is queried for its water color.
	 */
	public static class GetWaterColor extends BiomeColor {
		public GetWaterColor(BiomeGenChocolateBase biome, int original) {
			super(biome, original);
		}
	}
}