package com.chocolatemod.worldgen;

import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.DimensionManager;
import cpw.mods.fml.common.registry.GameRegistry;



	public class WorldGenRegistry {

		public static int DimID = 3;
	

		public static void init(){
		DimensionManager.registerProviderType(DimID, WorldProviderChocolateTest.class, false);
		DimensionManager.registerDimension(DimID, DimID);
		GameRegistry.registerWorldGenerator(new WorldGenChocolateOres(), DimID);
		}

		public static void initialise(){
		
		}
		}