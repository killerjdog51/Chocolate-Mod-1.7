package com.chocolatemod.worldgen;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraftforge.common.DimensionManager;


public class WorldGenRegistry {

	public static int DimID = 3;


	public static void init() {
		DimensionManager.registerProviderType(DimID, WorldProviderChocolateTest.class, false);
		DimensionManager.registerDimension(DimID, DimID);
		GameRegistry.registerWorldGenerator(new WorldGenChocolateOres(), DimID);
	}

	public static void initialise() {

	}
}