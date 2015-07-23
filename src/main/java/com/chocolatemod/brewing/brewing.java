package com.chocolatemod.brewing;

import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

public class brewing {

	public static void mainRegistry() {
		initialiseBlock();
		registerBlock();
	}

	//Brewing
	public static Block BlockMilkCauldron;
	public static int milkCauldronRenderID;
	public static Block BlockWhiteChocolateMilk;
	public static int whiteChocolatemilkCauldronRenderID;
	public static Block LightBlockChocolateMilk;
	public static int LightChocolatemilkCauldronRenderID;
	public static Block BlockChocolateMilk;
	public static int ChocolatemilkCauldronRenderID;
	public static Block BlockDarkChocolateMilk;
	public static int BlockDarkChocolateMilkRenderID;

	//Moulding
	public static Block BlockChocolateBarMould;
	public static int chocolateBarMouldRenderID;


	public static void initialiseBlock() {


		//Brewing
		BlockMilkCauldron = (new BlockMilkCauldron()).setHardness(2.0F).setBlockName("milkcauldron");
		BlockWhiteChocolateMilk = (new BlockWhiteChocolateMilkCauldron()).setHardness(2.0F).setBlockName("Whitechocolatemilkcauldron");
		LightBlockChocolateMilk = (new BlockLightChocolateMilkCauldron()).setHardness(2.0F).setBlockName("Lightchocolatemilkcauldron");
		BlockChocolateMilk = (new BlockChocolateMilkCauldron()).setHardness(2.0F).setBlockName("chocolatemilkcauldron");
		BlockDarkChocolateMilk = (new BlockDarkChocolateMilkCauldron()).setHardness(2.0F).setBlockName("darkchocolatemilkcauldron");

		milkCauldronRenderID = RenderingRegistry.getNextAvailableRenderId();
		whiteChocolatemilkCauldronRenderID = RenderingRegistry.getNextAvailableRenderId();
		LightChocolatemilkCauldronRenderID = RenderingRegistry.getNextAvailableRenderId();
		ChocolatemilkCauldronRenderID = RenderingRegistry.getNextAvailableRenderId();
		BlockDarkChocolateMilkRenderID = RenderingRegistry.getNextAvailableRenderId();

		RenderingRegistry.registerBlockHandler(new RenderMilkCauldron());
		RenderingRegistry.registerBlockHandler(new RenderWhiteChocolateMilkCauldron());
		RenderingRegistry.registerBlockHandler(new RenderLightChocolateMilkCauldron());
		RenderingRegistry.registerBlockHandler(new RenderChocolateMilkCauldron());
		RenderingRegistry.registerBlockHandler(new RenderDarkChocolateMilkCauldron());

		//Moulding
		BlockChocolateBarMould = (new BlockChocolateBarMould()).setHardness(2.0F).setBlockName("chocolatebarmould");

		chocolateBarMouldRenderID = RenderingRegistry.getNextAvailableRenderId();

		RenderingRegistry.registerBlockHandler(new RenderChocolatebarMould());

	}


	public static void registerBlock() {
		GameRegistry.registerBlock(BlockMilkCauldron, BlockMilkCauldron.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(BlockWhiteChocolateMilk, BlockWhiteChocolateMilk.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(LightBlockChocolateMilk, LightBlockChocolateMilk.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(BlockChocolateMilk, BlockChocolateMilk.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(BlockDarkChocolateMilk, BlockDarkChocolateMilk.getUnlocalizedName());
		GameRegistry.registerBlock(BlockChocolateBarMould, BlockChocolateBarMould.getUnlocalizedName());
	}

}
