package com.chocolatemod.block;

import com.chocolatemod.main.MainRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFence;
import net.minecraft.block.BlockRedstoneOre;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockRegistry {

	public static void mainRegistry() {
		initialiseBlock();
		registerBlock();
	}

	//Blocks
	public static Block chocolateblock;
	public static Block fruitychocolateblock;
	public static Block mintychocolateblock;
	public static Block cookiesandcreamblock;
	public static Block ChocolateMould;
	public static Block ChocolateBallMould;
	public static Block chocolatebrick;
	public static Block chocolatepiller;
	public static Block chocolatechiseled;
	public static Block chocolatebrickstairs;
	public static Block darkchocolatebrickstairs;
	public static Block lightchocolatebrickstairs;
	public static Block whitechocolatebrickstairs;
	public static Block chocolatefence;
	public static Block darkchocolatefence;
	public static Block lightchocolatefence;
	public static Block whitechocolatefence;
	public static Block chocolatebrickfence;
	public static Block darkchocolatebrickfence;
	public static Block lightchocolatebrickfence;
	public static Block whitechocolatebrickfence;
	public static Block chocolatestairs;
	public static Block darkchocolatestairs;
	public static Block lightchocolatestairs;
	public static Block whitechocolatestairs;
	public static Block BlockChocolatePortal;
	public static Block smallchocolatebrickstairs;
	public static Block smalldarkchocolatebrickstairs;
	public static Block smalllightchocolatebrickstairs;
	public static Block smallwhitechocolatebrickstairs;
	public static Block chocolatepane;
	public static Block darkchocolatepane;
	public static Block lightchocolatepane;
	public static Block whitechocolatepane;
	public static Block chocolateOres;
	public static Block goldchocolateblock;
	public static Block CocoaPlanks;
	public static Block CocoaStairs;
	public static Block chocoGrass;
	public static Block chocoStone;
	public static Block chocoCobbleStone;
	public static Block chocoDiamond;
	public static Block chocoGold;
	public static Block chocoIron;
	public static Block chocoCoal;
	public static Block chocoRedstone;
	public static Block litChocoRedstone;
	public static Block chocoLapis;
	public static Block chocoCobbleStoneStairs;
	public static Block darkchocoCobbleStoneStairs;
	public static Block lightchocoCobbleStoneStairs;
	public static Block whitechocoCobbleStoneStairs;
	public static Block cocoaDoor;
	public static Block chocoDirt;
	public static Block chocoSand;
	public static Block chocoCobbleStoneWall;
	public static Block chocolateBrickWall;
	public static Block chocolateSmallBrickWall;
	public static Block chocoGlass;
	public static Block chocoGlassPane;
	public static Block darkChocoGlassPane;
	public static Block lightChocoGlassPane;
	public static Block whiteChocoGlassPane;
	public static Block chocoSandstone;
	public static Block whiteChocoSandstonestairs;
	public static Block whiteChocoSmoothSandstoneStairs;
	public static Block ChocoSandstonestairs;
	public static Block ChocoSmoothSandstoneStairs;
	public static Block darkChocoSandstonestairs;
	public static Block darkChocoSmoothSandstoneStairs;
	public static Block lightChocoSandstonestairs;
	public static Block lightChocoSmoothSandstoneStairs;
	public static Block caramelBlock;

	//Slabs
	public static BlockSlab chocolatebricksingle;
	public static BlockSlab chocolatebrickdouble;

	public static BlockSlab darkchocolatebricksingle;
	public static BlockSlab darkchocolatebrickdouble;

	public static BlockSlab lightchocolatebricksingle;
	public static BlockSlab lightchocolatebrickdouble;

	public static BlockSlab whitechocolatebricksingle;
	public static BlockSlab whitechocolatebrickdouble;

	public static BlockSlab smallchocolatebricksingle;
	public static BlockSlab smallchocolatebrickdouble;

	public static BlockSlab smalldarkchocolatebricksingle;
	public static BlockSlab smalldarkchocolatebrickdouble;

	public static BlockSlab smalllightchocolatebricksingle;
	public static BlockSlab smalllightchocolatebrickdouble;

	public static BlockSlab smallwhitechocolatebricksingle;
	public static BlockSlab smallwhitechocolatebrickdouble;

	public static BlockSlab chocolatesingle;
	public static BlockSlab chocolatedouble;

	public static BlockSlab darkchocolatesingle;
	public static BlockSlab darkchocolatedouble;

	public static BlockSlab lightchocolatesingle;
	public static BlockSlab lightchocolatedouble;

	public static BlockSlab whitechocolatesingle;
	public static BlockSlab whitechocolatedouble;

	public static BlockSlab CocoaSlabsingle;
	public static BlockSlab CocoaSlabdouble;

	public static BlockSlab chocoCobbleStoneSlabsingle;
	public static BlockSlab chocoCobbleStoneSlabdouble;

	public static BlockSlab darkchocoCobbleStoneSlabsingle;
	public static BlockSlab darkchocoCobbleStoneSlabdouble;

	public static BlockSlab lightchocoCobbleStoneSlabsingle;
	public static BlockSlab lightchocoCobbleStoneSlabdouble;

	public static BlockSlab whitechocoCobbleStoneSlabsingle;
	public static BlockSlab whitechocoCobbleStoneSlabdouble;

	public static BlockSlab whitechocoSandStoneSlabsingle;
	public static BlockSlab whitechocoSandStoneSlabdouble;

	public static BlockSlab whitechocoSmoothSandStoneSlabsingle;
	public static BlockSlab whitechocoSmoothSandStoneSlabdouble;

	public static BlockSlab chocoSandStoneSlabsingle;
	public static BlockSlab chocoSandStoneSlabdouble;

	public static BlockSlab chocoSmoothSandStoneSlabsingle;
	public static BlockSlab chocoSmoothSandStoneSlabdouble;

	public static BlockSlab darkchocoSandStoneSlabsingle;
	public static BlockSlab darkchocoSandStoneSlabdouble;

	public static BlockSlab darkchocoSmoothSandStoneSlabsingle;
	public static BlockSlab darkchocoSmoothSandStoneSlabdouble;

	public static BlockSlab lightchocoSandStoneSlabsingle;
	public static BlockSlab lightchocoSandStoneSlabdouble;

	public static BlockSlab lightchocoSmoothSandStoneSlabsingle;
	public static BlockSlab lightchocoSmoothSandStoneSlabdouble;
	//Cake
	public static Block ChocolateCake;
	public static Block DarkChocolateCake;
	public static Block LightChocolateCake;
	public static Block WhiteChocolateCake;


	public static void initialiseBlock() {


		//Cake
		ChocolateCake = (new BlockChocolateCake()).setBlockName("chocolatecake").setStepSound(Block.soundTypeCloth);
		DarkChocolateCake = (new BlockDarkChocolateCake()).setBlockName("darkchocolatecake").setStepSound(Block.soundTypeCloth);
		LightChocolateCake = (new BlockLightChocolateCake()).setBlockName("lightchocolatecake").setStepSound(Block.soundTypeCloth);
		WhiteChocolateCake = (new BlockWhiteChocolateCake()).setBlockName("whitechocolatecake").setStepSound(Block.soundTypeCloth);

		//Blocks

		chocolateblock = new BlockChocolateBlock().setBlockName("chocolateblock").setHardness(3).setResistance(10).setBlockTextureName("killerjdog51:chocolateblock").setCreativeTab(MainRegistry.tabChocolateBlocks);

		fruitychocolateblock = new BlockFruityChocolateBlock().setBlockName("fruitychocolateblock").setHardness(3).setResistance(10).setBlockTextureName("killerjdog51:fruitychocolateblock").setCreativeTab(MainRegistry.tabChocolateBlocks);

		mintychocolateblock = new BlockMintyChocolateBlock().setBlockName("mintychocolateblock").setHardness(3).setResistance(10).setBlockTextureName("killerjdog51:mintychocolateblock").setCreativeTab(MainRegistry.tabChocolateBlocks);

		cookiesandcreamblock = new chocolateBlocks().setHardness(3).setResistance(10).setBlockName("cookiesandcreamblock").setBlockTextureName("killerjdog51:cookiesandcreamblock");

		goldchocolateblock = new chocolateBlocks().setHardness(3).setResistance(10).setBlockName("goldchocolateblock").setBlockTextureName("killerjdog51:goldchocolateblock");

		ChocolateMould = (new BlockBarMould()).setHardness(2.0F).setBlockName("barmould").setCreativeTab(CreativeTabs.tabBlock);

		ChocolateBallMould = (new BlockBallMould()).setHardness(2.0F).setBlockName("ballmould").setCreativeTab(CreativeTabs.tabBlock);

		chocolatebrick = (new BlockChocolateBrick()).setHardness(1.5F).setResistance(10.0F).setStepSound(Block.soundTypeStone).setBlockName("ChocolateBrick").setBlockTextureName("killerjdog51:chocolatebrick").setCreativeTab(MainRegistry.tabChocolateBlocks);

		chocolatepiller = new BlockChocolatePiller().setHardness(2.0F).setStepSound(Block.soundTypeStone).setBlockName("chocolatepillerblock").setBlockTextureName("killerjdog51:chocolateblock").setCreativeTab(MainRegistry.tabChocolateBlocks);

		chocolatechiseled = new BlockChocolateChiseled().setHardness(2.0F).setStepSound(Block.soundTypeStone).setBlockName("chocolatechiseledblock").setBlockTextureName("killerjdog51:chocolateblock").setCreativeTab(MainRegistry.tabChocolateBlocks);

		chocolatebrickstairs = new chocolatebrickstairs(chocolatebrickstairs, 0).setHardness(2.0F).setStepSound(Block.soundTypeStone).setBlockName("chocolatebrickstairs").setBlockTextureName("killerjdog51:chocolateblock");

		darkchocolatebrickstairs = new darkchocolatebrickstairs(darkchocolatebrickstairs, 1).setHardness(2.0F).setStepSound(Block.soundTypeStone).setBlockName("darkchocolatebrickstairs");

		lightchocolatebrickstairs = new lightChocolateBrickStairs(lightchocolatebrickstairs, 2).setHardness(2.0F).setStepSound(Block.soundTypeStone).setBlockName("lightchocolatebrickstairs");

		whitechocolatebrickstairs = new whiteChocolateBrickStairs(whitechocolatebrickstairs, 3).setHardness(2.0F).setStepSound(Block.soundTypeStone).setBlockName("whitechocolatebrickstairs");

		smallchocolatebrickstairs = new smallChocolateBrickStairs(smallchocolatebrickstairs, 0).setHardness(2.0F).setStepSound(Block.soundTypeStone).setBlockName("smallchocolatebrickstairs").setBlockTextureName("killerjdog51:chocolateblock");

		smalldarkchocolatebrickstairs = new smallDarkChocolateBrickStairs(smalldarkchocolatebrickstairs, 1).setHardness(2.0F).setStepSound(Block.soundTypeStone).setBlockName("smalldarkchocolatebrickstairs");

		smalllightchocolatebrickstairs = new smallLightChocolateBrickStairs(smalllightchocolatebrickstairs, 2).setHardness(2.0F).setStepSound(Block.soundTypeStone).setBlockName("smalllightchocolatebrickstairs");

		smallwhitechocolatebrickstairs = new smallWhiteChocolateBrickStairs(smallwhitechocolatebrickstairs, 3).setHardness(2.0F).setStepSound(Block.soundTypeStone).setBlockName("smallwhitechocolatebrickstairs");

		chocolatestairs = new chocolatestairs(chocolatestairs, 4).setHardness(2.0F).setStepSound(Block.soundTypeStone).setBlockName("Chocolate Stairs");

		darkchocolatestairs = new darkChocolateStairs(darkchocolatestairs, 5).setHardness(2.0F).setStepSound(Block.soundTypeStone).setBlockName("Dark Chocolate Stairs");

		lightchocolatestairs = new lightChocolateStairs(lightchocolatestairs, 6).setHardness(2.0F).setStepSound(Block.soundTypeStone).setBlockName("Light Chocolate Stairs");

		whitechocolatestairs = new whiteChocolateStairs(whitechocolatestairs, 7).setHardness(2.0F).setStepSound(Block.soundTypeStone).setBlockName("White Chocolate Stairs");

		chocolatebrickfence = new BlockFence("killerjdog51:chocolatebrick", Material.rock).setStepSound(Block.soundTypeStone).setBlockName("chocolatebrickfence").setCreativeTab(MainRegistry.tabChocolateBlocks);

		darkchocolatebrickfence = new BlockFence("killerjdog51:chocolatebrick_dark", Material.rock).setStepSound(Block.soundTypeStone).setBlockName("darkchocolatebrickfence").setCreativeTab(MainRegistry.tabChocolateBlocks);

		lightchocolatebrickfence = new BlockFence("killerjdog51:chocolatebrick_light", Material.rock).setStepSound(Block.soundTypeStone).setBlockName("lightchocolatebrickfence").setCreativeTab(MainRegistry.tabChocolateBlocks);

		whitechocolatebrickfence = new BlockFence("killerjdog51:chocolatebrick_white", Material.rock).setStepSound(Block.soundTypeStone).setBlockName("whitechocolatebrickfence").setCreativeTab(MainRegistry.tabChocolateBlocks);

		chocolatefence = new BlockFence("killerjdog51:chocolateblock_hard", Material.rock).setStepSound(Block.soundTypeStone).setBlockName("hardchocolateblockfence").setCreativeTab(MainRegistry.tabChocolateBlocks);

		darkchocolatefence = new BlockFence("killerjdog51:chocolateblock_dark_hard", Material.rock).setStepSound(Block.soundTypeStone).setBlockName("harddarkblockofchocolatefence").setCreativeTab(MainRegistry.tabChocolateBlocks);

		lightchocolatefence = new BlockFence("killerjdog51:chocolateblock_light_hard", Material.rock).setStepSound(Block.soundTypeStone).setBlockName("hardlightblockofchocolatefence").setCreativeTab(MainRegistry.tabChocolateBlocks);

		whitechocolatefence = new BlockFence("killerjdog51:chocolateblock_white_hard", Material.rock).setStepSound(Block.soundTypeStone).setBlockName("hardwhiteblockofchocolatefence").setCreativeTab(MainRegistry.tabChocolateBlocks);

		CocoaPlanks = new BlockCocoaPlanks(Material.wood).setBlockName("Cocoa_Planks").setBlockTextureName("killerjdog51:planks_cocoa").setStepSound(Block.soundTypeWood).setCreativeTab(MainRegistry.tabChocolateBlocks);

		CocoaStairs = new CocoaStairs(CocoaPlanks, 0).setHardness(2.0F).setStepSound(Block.soundTypeWood).setBlockName("Cocoa_Stairs").setBlockTextureName("killerjdog51:planks_cocoa").setCreativeTab(MainRegistry.tabChocolateBlocks);

		cocoaDoor = new BlockCocoaDoor(Material.wood).setHardness(3.0F).setStepSound(Block.soundTypeWood).setBlockName("doorWood").setBlockTextureName("killerjdog51:door_cocoa");

		BlockChocolatePortal = (BlockChocolatePortal) new BlockChocolatePortal().setLightLevel(0.75F).setBlockName("killerjdog51:ChocolatePortal").setBlockTextureName("killerjdog51:ChocolatePortal");

		chocolatepane = (new BlockChocolatePane("killerjdog51:chocolateblock", "killerjdog51:chocolateblock_top", Material.rock, false)).setHardness(0.3F).setStepSound(Block.soundTypeStone).setBlockName("chocolatepanes").setBlockTextureName("killerjdog51:chocolateblock");

		darkchocolatepane = (new BlockDarkChocolatePane("killerjdog51:chocolateblock_dark", "killerjdog51:chocolateblock_dark_top", Material.rock, false)).setHardness(0.3F).setStepSound(Block.soundTypeStone).setBlockName("darkchocolatepanes").setBlockTextureName("killerjdog51:chocolateblock_dark");

		lightchocolatepane = (new BlockLightChocolatePane("killerjdog51:chocolateblock_light", "killerjdog51:chocolateblock_light_top", Material.rock, false)).setHardness(0.3F).setStepSound(Block.soundTypeStone).setBlockName("lightchocolatepanes").setBlockTextureName("killerjdog51:chocolateblock_light");

		whitechocolatepane = (new BlockWhiteChocolatePane("killerjdog51:chocolateblock_white", "killerjdog51:chocolateblock_white_top", Material.rock, false)).setHardness(0.3F).setStepSound(Block.soundTypeStone).setBlockName("whitechocolatepanes").setBlockTextureName("killerjdog51:chocolateblock_white");

		chocoGlassPane = (new BlockChocolateGlassPane("killerjdog51:chocolateglass", "killerjdog51:chocolateglass_top", Material.glass, false)).setHardness(0.3F).setStepSound(Block.soundTypeGlass).setBlockName("chocolateglasspanes").setBlockTextureName("killerjdog51:chocolateglass");

		darkChocoGlassPane = (new BlockDarkChocolateGlassPane("killerjdog51:chocolateglass_dark", "killerjdog51:chocolateglass_dark_top", Material.glass, false)).setHardness(0.3F).setStepSound(Block.soundTypeGlass).setBlockName("darkchocolateglasspanes").setBlockTextureName("killerjdog51:chocolateglass_dark");

		lightChocoGlassPane = (new BlockLightChocolateGlassPane("killerjdog51:chocolateglass_light", "killerjdog51:chocolateglass_light_top", Material.glass, false)).setHardness(0.3F).setStepSound(Block.soundTypeGlass).setBlockName("lightchocolateglasspanes").setBlockTextureName("killerjdog51:chocolateglass_light");

		whiteChocoGlassPane = (new BlockWhiteChocolateGlassPane("killerjdog51:chocolateglass_white", "killerjdog51:chocolateglass_white_top", Material.glass, false)).setHardness(0.3F).setStepSound(Block.soundTypeGlass).setBlockName("whitechocolateglasspanes").setBlockTextureName("killerjdog51:chocolateglass_white");

		chocolateOres = new BlockChocolateOres().setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundTypeStone).setBlockName("oreChocolate").setBlockTextureName("killerjdog51:chocolateOre");

		chocoGrass = new BlockChocoGrass().setHardness(0.6F).setStepSound(Block.soundTypeGrass).setBlockName("chocograss").setBlockTextureName("killerjdog51:chocograss");
		chocoDirt = new BlockChocoDirt().setHardness(0.5F).setStepSound(Block.soundTypeGravel).setBlockName("chocodirt").setBlockTextureName("killerjdog51:chocolatedirt");
		chocoSand = new BlockChocoSand().setHardness(0.5F).setStepSound(Block.soundTypeSand).setBlockName("chocosand").setCreativeTab(MainRegistry.tabChocolateBlocks).setBlockTextureName("killerjdog51:chocolatesand");

		chocoStone = new BlockChocoStone().setCreativeTab(MainRegistry.tabChocolateBlocks).setHardness(1.5F).setResistance(10.0F).setStepSound(Block.soundTypePiston).setBlockName("chocostone").setBlockTextureName("killerjdog51:chocostone");
		darkchocoCobbleStoneStairs = new darkchocoCobbleStoneStairs(darkchocoCobbleStoneStairs, 0).setHardness(2.0F).setStepSound(Block.soundTypeStone).setBlockName("Dark Chocolate Cobblestone Stairs");
		chocoCobbleStoneStairs = new chocoCobbleStoneStairs(chocoCobbleStoneStairs, 1).setHardness(2.0F).setStepSound(Block.soundTypeStone).setBlockName("Chocolate Cobblestone Stairs");
		lightchocoCobbleStoneStairs = new lightchocoCobbleStoneStairs(lightchocoCobbleStoneStairs, 2).setHardness(2.0F).setStepSound(Block.soundTypeStone).setBlockName("Light Chocolate Cobblestone Stairs");
		whitechocoCobbleStoneStairs = new whitechocoCobbleStoneStairs(whitechocoCobbleStoneStairs, 3).setHardness(2.0F).setStepSound(Block.soundTypeStone).setBlockName("White Chocolate Cobblestone Stairs");

		chocoDiamond = new BlockChocoOre().setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundTypePiston).setBlockName("oreChocoDiamond").setBlockTextureName("killerjdog51:chocodiamond").setCreativeTab(MainRegistry.tabChocolateBlocks);
		chocoGold = new BlockChocoOre().setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundTypePiston).setBlockName("oreChocoGold").setBlockTextureName("killerjdog51:chocogold").setCreativeTab(MainRegistry.tabChocolateBlocks);
		chocoIron = new BlockChocoOre().setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundTypePiston).setBlockName("oreChocoIron").setBlockTextureName("killerjdog51:chocoiron").setCreativeTab(MainRegistry.tabChocolateBlocks);
		chocoLapis = new BlockChocoOre().setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundTypePiston).setBlockName("oreChocoLapis").setBlockTextureName("killerjdog51:chocolapis").setCreativeTab(MainRegistry.tabChocolateBlocks);
		chocoCoal = new BlockChocoOre().setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundTypePiston).setBlockName("oreChocoCoal").setBlockTextureName("killerjdog51:chococoal").setCreativeTab(MainRegistry.tabChocolateBlocks);
		chocoRedstone = new BlockRedstoneOre(false).setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundTypePiston).setBlockName("oreChocoRedstone").setCreativeTab(MainRegistry.tabChocolateBlocks).setBlockTextureName("killerjdog51:chocoredstone");
		litChocoRedstone = new BlockRedstoneOre(true).setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundTypePiston).setBlockName("oreLitChocoRedstone").setBlockTextureName("killerjdog51:chocoredstone");

		chocoCobbleStoneWall = new BlockChocolateWall(chocoStone).setBlockName("chocoCobbleWall").setCreativeTab(MainRegistry.tabChocolateBlocks).setBlockTextureName("killerjdog51:chocostone");
		chocolateBrickWall = new BlockChocolateBrickWall(chocolatebrick).setBlockName("chocolateBrickWall").setCreativeTab(MainRegistry.tabChocolateBlocks).setBlockTextureName("killerjdog51:chocolatebrick");
		chocolateSmallBrickWall = new BlockSmallChocolateBrickWall(chocolatebrick).setBlockName("chocolateSmallBrickWall").setCreativeTab(MainRegistry.tabChocolateBlocks).setBlockTextureName("killerjdog51:chocolatebrick");


		chocoGlass = new BlockChocolateGlass().setStepSound(Block.soundTypeGlass).setBlockName("chocolateglass").setHardness(3).setResistance(10).setBlockTextureName("killerjdog51:chocolateglass").setCreativeTab(MainRegistry.tabChocolateBlocks);

		chocoSandstone = new BlockChocolateSandStone().setStepSound(Block.soundTypePiston).setHardness(0.8F).setBlockName("chocolatesandStone").setBlockTextureName("killerjdog51:chocolatesandstone");
		whiteChocoSandstonestairs = new whitechocoSandStoneStairs(whiteChocoSandstonestairs, 3).setHardness(2.0F).setStepSound(Block.soundTypeStone).setBlockName("White Chocolate Sandstone Stairs");
		whiteChocoSmoothSandstoneStairs = new whitechocoSmoothSandStoneStairs(whiteChocoSmoothSandstoneStairs, 3).setHardness(2.0F).setStepSound(Block.soundTypeStone).setBlockName("White Chocolate Smooth Sandstone Stairs");
		ChocoSandstonestairs = new chocoSandStoneStairs(ChocoSandstonestairs, 0).setHardness(2.0F).setStepSound(Block.soundTypeStone).setBlockName("Chocolate Sandstone Stairs");
		ChocoSmoothSandstoneStairs = new chocoSmoothSandStoneStairs(ChocoSmoothSandstoneStairs, 0).setHardness(2.0F).setStepSound(Block.soundTypeStone).setBlockName("Chocolate Smooth Sandstone Stairs");
		darkChocoSandstonestairs = new darkchocoSandStoneStairs(darkChocoSandstonestairs, 1).setHardness(2.0F).setStepSound(Block.soundTypeStone).setBlockName("Dark Chocolate Sandstone Stairs");
		darkChocoSmoothSandstoneStairs = new darkchocoSmoothSandStoneStairs(darkChocoSmoothSandstoneStairs, 1).setHardness(2.0F).setStepSound(Block.soundTypeStone).setBlockName("Dark Chocolate Smooth Sandstone Stairs");
		lightChocoSandstonestairs = new lightchocoSandStoneStairs(lightChocoSandstonestairs, 2).setHardness(2.0F).setStepSound(Block.soundTypeStone).setBlockName("Light Chocolate Sandstone Stairs");
		lightChocoSmoothSandstoneStairs = new lightchocoSmoothSandStoneStairs(lightChocoSmoothSandstoneStairs, 2).setHardness(2.0F).setStepSound(Block.soundTypeStone).setBlockName("Light Chocolate Smooth Sandstone Stairs");


		caramelBlock = new BlockCaramel().setBlockName("caramelblock").setHardness(3).setResistance(10).setBlockTextureName("killerjdog51:caramelblock").setCreativeTab(MainRegistry.tabChocolateBlocks);

		//Slabs
		chocolatebrickdouble = (BlockSlab) (new BlockChocolateBrickSlab(true)).setHardness(1.6F).setResistance(7.5F).setStepSound(Block.soundTypeStone).setBlockName("chocolatebrickSlabDouble").setBlockTextureName("killerjdog51:chocolatebrick");
		chocolatebricksingle = (BlockSlab) (new BlockChocolateBrickSlab(false)).setHardness(1.6F).setResistance(7.5F).setStepSound(Block.soundTypeStone).setBlockName("chocolatebrickSlab").setBlockTextureName("killerjdog51:chocolatebrick").setCreativeTab(MainRegistry.tabChocolateBlocks);

		darkchocolatebrickdouble = (BlockSlab) (new BlockDarkChocolateBrickSlab(true)).setHardness(1.6F).setResistance(7.5F).setStepSound(Block.soundTypeStone).setBlockName("darkchocolatebrickSlabDouble").setBlockTextureName("killerjdog51:chocolatebrick_dark");
		darkchocolatebricksingle = (BlockSlab) (new BlockDarkChocolateBrickSlab(false)).setHardness(1.6F).setResistance(7.5F).setStepSound(Block.soundTypeStone).setBlockName("darkchocolatebrickSlab").setBlockTextureName("killerjdog51:chocolatebrick_dark").setCreativeTab(MainRegistry.tabChocolateBlocks);

		lightchocolatebrickdouble = (BlockSlab) (new BlockLightChocolateBrickSlab(true)).setHardness(1.6F).setResistance(7.5F).setStepSound(Block.soundTypeStone).setBlockName("lightchocolatebrickSlabDouble").setBlockTextureName("killerjdog51:chocolatebrick_light");
		lightchocolatebricksingle = (BlockSlab) (new BlockLightChocolateBrickSlab(false)).setHardness(1.6F).setResistance(7.5F).setStepSound(Block.soundTypeStone).setBlockName("lightchocolatebrickSlab").setBlockTextureName("killerjdog51:chocolatebrick_light").setCreativeTab(MainRegistry.tabChocolateBlocks);

		whitechocolatebrickdouble = (BlockSlab) (new BlockWhiteChocolateBrickSlab(true)).setHardness(1.6F).setResistance(7.5F).setStepSound(Block.soundTypeStone).setBlockName("whitechocolatebrickSlabDouble").setBlockTextureName("killerjdog51:chocolatebrick_white");
		whitechocolatebricksingle = (BlockSlab) (new BlockWhiteChocolateBrickSlab(false)).setHardness(1.6F).setResistance(7.5F).setStepSound(Block.soundTypeStone).setBlockName("whitechocolatebrickSlab").setBlockTextureName("killerjdog51:chocolatebrick_white").setCreativeTab(MainRegistry.tabChocolateBlocks);

		chocolatedouble = (BlockSlab) (new BlockChocolateSlab(true)).setHardness(1.6F).setResistance(7.5F).setStepSound(Block.soundTypeStone).setBlockName("Chocolate:chocolateslab_side");
		chocolatesingle = (BlockSlab) (new BlockChocolateSlab(false)).setHardness(1.6F).setResistance(7.5F).setStepSound(Block.soundTypeStone).setBlockName("Chocolate:chocolateslab_top").setCreativeTab(MainRegistry.tabChocolateBlocks);

		darkchocolatedouble = (BlockSlab) (new BlockDarkChocolateSlab(true)).setHardness(1.6F).setResistance(7.5F).setStepSound(Block.soundTypeStone).setBlockName("Chocolate:darkchocolateslab_side");
		darkchocolatesingle = (BlockSlab) (new BlockDarkChocolateSlab(false)).setHardness(1.6F).setResistance(7.5F).setStepSound(Block.soundTypeStone).setBlockName("Chocolate:darkchocolateslab_top").setCreativeTab(MainRegistry.tabChocolateBlocks);

		lightchocolatedouble = (BlockSlab) (new BlockLightChocolateSlab(true)).setHardness(1.6F).setResistance(7.5F).setStepSound(Block.soundTypeStone).setBlockName("Chocolate:lightchocolateslab_side");
		lightchocolatesingle = (BlockSlab) (new BlockLightChocolateSlab(false)).setHardness(1.6F).setResistance(7.5F).setStepSound(Block.soundTypeStone).setBlockName("Chocolate:lightchocolateslab_top").setCreativeTab(MainRegistry.tabChocolateBlocks);

		whitechocolatedouble = (BlockSlab) (new BlockWhiteChocolateSlab(true)).setHardness(1.6F).setResistance(7.5F).setStepSound(Block.soundTypeStone).setBlockName("Chocolate:whitechocolateslab_side");
		whitechocolatesingle = (BlockSlab) (new BlockWhiteChocolateSlab(false)).setHardness(1.6F).setResistance(7.5F).setStepSound(Block.soundTypeStone).setBlockName("Chocolate:whitechocolateslab_top").setCreativeTab(MainRegistry.tabChocolateBlocks);

		smallchocolatebrickdouble = (BlockSlab) (new BlockChocolateSmallBrickSlab(true)).setHardness(1.6F).setResistance(7.5F).setStepSound(Block.soundTypeStone).setBlockName("smallchocolatebrickSlabDouble").setBlockTextureName("killerjdog51:chocolatebrick_small");
		smallchocolatebricksingle = (BlockSlab) (new BlockChocolateSmallBrickSlab(false)).setHardness(1.6F).setResistance(7.5F).setStepSound(Block.soundTypeStone).setBlockName("smallchocolatebrickSlab").setBlockTextureName("killerjdog51:chocolatebrick_small").setCreativeTab(MainRegistry.tabChocolateBlocks);

		smalldarkchocolatebrickdouble = (BlockSlab) (new BlockDarkChocolateSmallBrickSlab(true)).setHardness(1.6F).setResistance(7.5F).setStepSound(Block.soundTypeStone).setBlockName("Chocolate:smalldarkchocolatebrickSlabDouble").setBlockTextureName("killerjdog51:chocolatebrick_dark_small");
		smalldarkchocolatebricksingle = (BlockSlab) (new BlockDarkChocolateSmallBrickSlab(false)).setHardness(1.6F).setResistance(7.5F).setStepSound(Block.soundTypeStone).setBlockName("Chocolate:smalldarkchocolatebrickSlab").setBlockTextureName("killerjdog51:chocolatebrick_dark_small").setCreativeTab(MainRegistry.tabChocolateBlocks);

		smalllightchocolatebrickdouble = (BlockSlab) (new BlockLightChocolateSmallBrickSlab(true)).setHardness(1.6F).setResistance(7.5F).setStepSound(Block.soundTypeStone).setBlockName("Chocolate:smalllightchocolatebrickSlabDouble").setBlockTextureName("killerjdog51:chocolatebrick_light_small");
		smalllightchocolatebricksingle = (BlockSlab) (new BlockLightChocolateSmallBrickSlab(false)).setHardness(1.6F).setResistance(7.5F).setStepSound(Block.soundTypeStone).setBlockName("Chocolate:smalllightchocolatebrickSlab").setBlockTextureName("killerjdog51:chocolatebrick_light_small").setCreativeTab(MainRegistry.tabChocolateBlocks);

		smallwhitechocolatebrickdouble = (BlockSlab) (new BlockWhiteChocolateSmallBrickSlab(true)).setHardness(1.6F).setResistance(7.5F).setStepSound(Block.soundTypeStone).setBlockName("Chocolate:smallwhitechocolatebrickSlabDouble").setBlockTextureName("killerjdog51:chocolatebrick_white_small");
		smallwhitechocolatebricksingle = (BlockSlab) (new BlockWhiteChocolateSmallBrickSlab(false)).setHardness(1.6F).setResistance(7.5F).setStepSound(Block.soundTypeStone).setBlockName("Chocolate:smallwhitechocolatebrickSlab").setBlockTextureName("killerjdog51:chocolatebrick_white_small").setCreativeTab(MainRegistry.tabChocolateBlocks);

		CocoaSlabdouble = (BlockSlab) (new BlockCocoaSlab(true)).setHardness(1.6F).setResistance(7.5F).setStepSound(Block.soundTypeWood).setBlockName("CocoaSlabdouble").setBlockTextureName("killerjdog51:planks_cocoa");
		CocoaSlabsingle = (BlockSlab) (new BlockCocoaSlab(false)).setHardness(1.6F).setResistance(7.5F).setStepSound(Block.soundTypeWood).setBlockName("CocoaSlabsingle").setBlockTextureName("killerjdog51:planks_cocoa").setCreativeTab(MainRegistry.tabChocolateBlocks);

		darkchocoCobbleStoneSlabdouble = (BlockSlab) (new BlockdarkchocoCobbleStoneSlab(true)).setHardness(1.6F).setResistance(7.5F).setStepSound(Block.soundTypeStone).setBlockName("darkchocoCobbleStoneSlabdouble").setBlockTextureName("killerjdog51:chocostone_dark_cobble");
		darkchocoCobbleStoneSlabsingle = (BlockSlab) (new BlockdarkchocoCobbleStoneSlab(false)).setHardness(1.6F).setResistance(7.5F).setStepSound(Block.soundTypeStone).setBlockName("darkchocoCobbleStoneSlabsingle").setBlockTextureName("killerjdog51:chocostone_dark_cobble").setCreativeTab(MainRegistry.tabChocolateBlocks);

		chocoCobbleStoneSlabdouble = (BlockSlab) (new BlockchocoCobbleStoneSlab(true)).setHardness(1.6F).setResistance(7.5F).setStepSound(Block.soundTypeStone).setBlockName("chocoCobbleStoneSlabdouble").setBlockTextureName("killerjdog51:chocostone_cobble");
		chocoCobbleStoneSlabsingle = (BlockSlab) (new BlockchocoCobbleStoneSlab(false)).setHardness(1.6F).setResistance(7.5F).setStepSound(Block.soundTypeStone).setBlockName("chocoCobbleStoneSlabsingle").setBlockTextureName("killerjdog51:chocostone_cobble").setCreativeTab(MainRegistry.tabChocolateBlocks);

		lightchocoCobbleStoneSlabdouble = (BlockSlab) (new BlocklightchocoCobbleStoneSlab(true)).setHardness(1.6F).setResistance(7.5F).setStepSound(Block.soundTypeStone).setBlockName("lightchocoCobbleStoneSlabdouble").setBlockTextureName("killerjdog51:chocostone_light_cobble");
		lightchocoCobbleStoneSlabsingle = (BlockSlab) (new BlocklightchocoCobbleStoneSlab(false)).setHardness(1.6F).setResistance(7.5F).setStepSound(Block.soundTypeStone).setBlockName("lightchocoCobbleStoneSlabsingle").setBlockTextureName("killerjdog51:chocostone_light_cobble").setCreativeTab(MainRegistry.tabChocolateBlocks);

		whitechocoCobbleStoneSlabdouble = (BlockSlab) (new BlockwhitechocoCobbleStoneSlab(true)).setHardness(1.6F).setResistance(7.5F).setStepSound(Block.soundTypeStone).setBlockName("whitechocoCobbleStoneSlabdouble").setBlockTextureName("killerjdog51:chocostone_white_cobble");
		whitechocoCobbleStoneSlabsingle = (BlockSlab) (new BlockwhitechocoCobbleStoneSlab(false)).setHardness(1.6F).setResistance(7.5F).setStepSound(Block.soundTypeStone).setBlockName("whitechocoCobbleStoneSlabsingle").setBlockTextureName("killerjdog51:chocostone_white_cobble").setCreativeTab(MainRegistry.tabChocolateBlocks);

		whitechocoSandStoneSlabdouble = (BlockSlab) (new BlockwhitechocoSandStoneSlab(true)).setHardness(1.6F).setResistance(7.5F).setStepSound(Block.soundTypeStone).setBlockName("whitechocoSandStoneSlabdouble").setBlockTextureName("killerjdog51:chocolatesandstone_white_normal");
		whitechocoSandStoneSlabsingle = (BlockSlab) (new BlockwhitechocoSandStoneSlab(false)).setHardness(1.6F).setResistance(7.5F).setStepSound(Block.soundTypeStone).setBlockName("whitechocoSandStoneSlabsingle").setBlockTextureName("killerjdog51:chocolatesandstone_white_normal").setCreativeTab(MainRegistry.tabChocolateBlocks);

		whitechocoSmoothSandStoneSlabdouble = (BlockSlab) (new BlockwhitechocoSmoothSandStoneSlab(true)).setHardness(1.6F).setResistance(7.5F).setStepSound(Block.soundTypeStone).setBlockName("whitechocoSmoothSandStoneSlabdouble").setBlockTextureName("killerjdog51:chocolatesandstone_white_smooth");
		whitechocoSmoothSandStoneSlabsingle = (BlockSlab) (new BlockwhitechocoSmoothSandStoneSlab(false)).setHardness(1.6F).setResistance(7.5F).setStepSound(Block.soundTypeStone).setBlockName("whitechocoSmoothSandStoneSlabsingle").setBlockTextureName("killerjdog51:chocolatesandstone_white_smooth").setCreativeTab(MainRegistry.tabChocolateBlocks);

		chocoSandStoneSlabdouble = (BlockSlab) (new BlockchocoSandStoneSlab(true)).setHardness(1.6F).setResistance(7.5F).setStepSound(Block.soundTypeStone).setBlockName("chocoSandStoneSlabdouble").setBlockTextureName("killerjdog51:chocolatesandstone_default_normal");
		chocoSandStoneSlabsingle = (BlockSlab) (new BlockchocoSandStoneSlab(false)).setHardness(1.6F).setResistance(7.5F).setStepSound(Block.soundTypeStone).setBlockName("chocoSandStoneSlabsingle").setBlockTextureName("killerjdog51:chocolatesandstone_default_normal").setCreativeTab(MainRegistry.tabChocolateBlocks);

		chocoSmoothSandStoneSlabdouble = (BlockSlab) (new BlockchocoSmoothSandStoneSlab(true)).setHardness(1.6F).setResistance(7.5F).setStepSound(Block.soundTypeStone).setBlockName("chocoSmoothSandStoneSlabdouble").setBlockTextureName("killerjdog51:chocolatesandstone_default_smooth");
		chocoSmoothSandStoneSlabsingle = (BlockSlab) (new BlockchocoSmoothSandStoneSlab(false)).setHardness(1.6F).setResistance(7.5F).setStepSound(Block.soundTypeStone).setBlockName("chocoSmoothSandStoneSlabsingle").setBlockTextureName("killerjdog51:chocolatesandstone_default_smooth").setCreativeTab(MainRegistry.tabChocolateBlocks);

		darkchocoSandStoneSlabdouble = (BlockSlab) (new BlockdarkchocoSandStoneSlab(true)).setHardness(1.6F).setResistance(7.5F).setStepSound(Block.soundTypeStone).setBlockName("darkchocoSandStoneSlabdouble").setBlockTextureName("killerjdog51:chocolatesandstone_dark_normal");
		darkchocoSandStoneSlabsingle = (BlockSlab) (new BlockdarkchocoSandStoneSlab(false)).setHardness(1.6F).setResistance(7.5F).setStepSound(Block.soundTypeStone).setBlockName("darkchocoSandStoneSlabsingle").setBlockTextureName("killerjdog51:chocolatesandstone_dark_normal").setCreativeTab(MainRegistry.tabChocolateBlocks);

		darkchocoSmoothSandStoneSlabdouble = (BlockSlab) (new BlockdarkchocoSmoothSandStoneSlab(true)).setHardness(1.6F).setResistance(7.5F).setStepSound(Block.soundTypeStone).setBlockName("darkchocoSmoothSandStoneSlabdouble").setBlockTextureName("killerjdog51:chocolatesandstone_dark_smooth");
		darkchocoSmoothSandStoneSlabsingle = (BlockSlab) (new BlockdarkchocoSmoothSandStoneSlab(false)).setHardness(1.6F).setResistance(7.5F).setStepSound(Block.soundTypeStone).setBlockName("darkchocoSmoothSandStoneSlabsingle").setBlockTextureName("killerjdog51:chocolatesandstone_dark_smooth").setCreativeTab(MainRegistry.tabChocolateBlocks);

		lightchocoSandStoneSlabdouble = (BlockSlab) (new BlocklightchocoSandStoneSlab(true)).setHardness(1.6F).setResistance(7.5F).setStepSound(Block.soundTypeStone).setBlockName("lightchocoSandStoneSlabdouble").setBlockTextureName("killerjdog51:chocolatesandstone_light_normal");
		lightchocoSandStoneSlabsingle = (BlockSlab) (new BlocklightchocoSandStoneSlab(false)).setHardness(1.6F).setResistance(7.5F).setStepSound(Block.soundTypeStone).setBlockName("lightchocoSandStoneSlabsingle").setBlockTextureName("killerjdog51:chocolatesandstone_light_normal").setCreativeTab(MainRegistry.tabChocolateBlocks);

		lightchocoSmoothSandStoneSlabdouble = (BlockSlab) (new BlocklightchocoSmoothSandStoneSlab(true)).setHardness(1.6F).setResistance(7.5F).setStepSound(Block.soundTypeStone).setBlockName("lightchocoSmoothSandStoneSlabdouble").setBlockTextureName("killerjdog51:chocolatesandstone_light_smooth");
		lightchocoSmoothSandStoneSlabsingle = (BlockSlab) (new BlocklightchocoSmoothSandStoneSlab(false)).setHardness(1.6F).setResistance(7.5F).setStepSound(Block.soundTypeStone).setBlockName("lightchocoSmoothSandStoneSlabsingle").setBlockTextureName("killerjdog51:chocolatesandstone_light_smooth").setCreativeTab(MainRegistry.tabChocolateBlocks);

	}

	public static void registerBlock() {
		GameRegistry.registerBlock(chocolateblock, ItemChocolateBlocks.class, chocolateblock.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(fruitychocolateblock, ItemFruityChocolateBlocks.class, fruitychocolateblock.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(mintychocolateblock, ItemMintyChocolateBlocks.class, mintychocolateblock.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(cookiesandcreamblock, cookiesandcreamblock.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(goldchocolateblock, goldchocolateblock.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(ChocolateMould, ChocolateMould.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(ChocolateBallMould, ChocolateBallMould.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(chocolatebrick, ItemBrickBlocks.class, chocolatebrick.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(chocolatepiller, ItemPillerBlocks.class, chocolatepiller.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(chocolatechiseled, ItemChiseledBlocks.class, chocolatechiseled.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(chocolatebrickstairs, chocolatebrickstairs.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(darkchocolatebrickstairs, darkchocolatebrickstairs.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(lightchocolatebrickstairs, lightchocolatebrickstairs.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(whitechocolatebrickstairs, whitechocolatebrickstairs.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(smallchocolatebrickstairs, smallchocolatebrickstairs.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(smalldarkchocolatebrickstairs, smalldarkchocolatebrickstairs.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(smalllightchocolatebrickstairs, smalllightchocolatebrickstairs.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(smallwhitechocolatebrickstairs, smallwhitechocolatebrickstairs.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(chocolatestairs, chocolatestairs.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(darkchocolatestairs, darkchocolatestairs.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(lightchocolatestairs, lightchocolatestairs.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(chocolatebrickfence, chocolatebrickfence.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(whitechocolatestairs, whitechocolatestairs.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(darkchocolatebrickfence, darkchocolatebrickfence.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(lightchocolatebrickfence, lightchocolatebrickfence.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(whitechocolatebrickfence, whitechocolatebrickfence.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(chocolatefence, chocolatefence.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(darkchocolatefence, darkchocolatefence.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(lightchocolatefence, lightchocolatefence.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(whitechocolatefence, whitechocolatefence.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(CocoaPlanks, CocoaPlanks.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(CocoaStairs, CocoaStairs.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(BlockChocolatePortal, BlockChocolatePortal.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(chocolatepane, chocolatepane.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(darkchocolatepane, darkchocolatepane.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(lightchocolatepane, lightchocolatepane.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(whitechocolatepane, whitechocolatepane.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(chocolateOres, ItemChocolateOres.class, chocolateOres.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(chocolatebrickdouble, ItemChocolateBrickSlabs.class, chocolatebrickdouble.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(chocolatebricksingle, ItemChocolateBrickSlabs.class, chocolatebricksingle.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(darkchocolatebrickdouble, ItemDarkChocolateBrickSlabs.class, darkchocolatebrickdouble.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(darkchocolatebricksingle, ItemDarkChocolateBrickSlabs.class, darkchocolatebricksingle.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(lightchocolatebrickdouble, ItemLightChocolateBrickSlabs.class, lightchocolatebrickdouble.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(lightchocolatebricksingle, ItemLightChocolateBrickSlabs.class, lightchocolatebricksingle.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(whitechocolatebrickdouble, ItemWhiteChocolateBrickSlabs.class, whitechocolatebrickdouble.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(whitechocolatebricksingle, ItemWhiteChocolateBrickSlabs.class, whitechocolatebricksingle.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(chocolatedouble, ItemChocolateSlabs.class, chocolatedouble.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(chocolatesingle, ItemChocolateSlabs.class, chocolatesingle.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(darkchocolatedouble, ItemDarkChocolateSlabs.class, darkchocolatedouble.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(darkchocolatesingle, ItemDarkChocolateSlabs.class, darkchocolatesingle.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(lightchocolatedouble, ItemLightChocolateSlabs.class, lightchocolatedouble.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(lightchocolatesingle, ItemLightChocolateSlabs.class, lightchocolatesingle.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(whitechocolatedouble, ItemWhiteChocolateSlabs.class, whitechocolatedouble.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(whitechocolatesingle, ItemWhiteChocolateSlabs.class, whitechocolatesingle.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(smallchocolatebrickdouble, ItemSmallChocolateBrickSlabs.class, smallchocolatebrickdouble.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(smallchocolatebricksingle, ItemSmallChocolateBrickSlabs.class, smallchocolatebricksingle.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(smalldarkchocolatebrickdouble, ItemSmallDarkChocolateBrickSlabs.class, smalldarkchocolatebrickdouble.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(smalldarkchocolatebricksingle, ItemSmallDarkChocolateBrickSlabs.class, smalldarkchocolatebricksingle.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(smalllightchocolatebrickdouble, ItemSmallLightChocolateBrickSlabs.class, smalllightchocolatebrickdouble.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(smalllightchocolatebricksingle, ItemSmallLightChocolateBrickSlabs.class, smalllightchocolatebricksingle.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(smallwhitechocolatebrickdouble, ItemSmallWhiteChocolateBrickSlabs.class, smallwhitechocolatebrickdouble.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(smallwhitechocolatebricksingle, ItemSmallWhiteChocolateBrickSlabs.class, smallwhitechocolatebricksingle.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(ChocolateCake, ChocolateCake.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(DarkChocolateCake, DarkChocolateCake.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(LightChocolateCake, LightChocolateCake.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(WhiteChocolateCake, WhiteChocolateCake.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(CocoaSlabdouble, ItemCocoaSlabs.class, CocoaSlabdouble.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(CocoaSlabsingle, ItemCocoaSlabs.class, CocoaSlabsingle.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(chocoGrass, chocoGrass.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(chocoStone, ItemChocoStone.class, chocoStone.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(chocoDiamond, chocoDiamond.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(chocoGold, chocoGold.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(chocoIron, chocoIron.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(chocoLapis, chocoLapis.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(chocoCoal, chocoCoal.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(chocoRedstone, chocoRedstone.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(litChocoRedstone, litChocoRedstone.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(darkchocoCobbleStoneStairs, darkchocoCobbleStoneStairs.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(chocoCobbleStoneStairs, chocoCobbleStoneStairs.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(lightchocoCobbleStoneStairs, lightchocoCobbleStoneStairs.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(whitechocoCobbleStoneStairs, whitechocoCobbleStoneStairs.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(darkchocoCobbleStoneSlabdouble, ItemdarkchocoCobbleStoneSlabs.class, darkchocoCobbleStoneSlabdouble.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(darkchocoCobbleStoneSlabsingle, ItemdarkchocoCobbleStoneSlabs.class, darkchocoCobbleStoneSlabsingle.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(chocoCobbleStoneSlabdouble, ItemchocoCobbleStoneSlabs.class, chocoCobbleStoneSlabdouble.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(chocoCobbleStoneSlabsingle, ItemchocoCobbleStoneSlabs.class, chocoCobbleStoneSlabsingle.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(lightchocoCobbleStoneSlabdouble, ItemlightchocoCobbleStoneSlabs.class, lightchocoCobbleStoneSlabdouble.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(lightchocoCobbleStoneSlabsingle, ItemlightchocoCobbleStoneSlabs.class, lightchocoCobbleStoneSlabsingle.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(whitechocoCobbleStoneSlabdouble, ItemwhitechocoCobbleStoneSlabs.class, whitechocoCobbleStoneSlabdouble.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(whitechocoCobbleStoneSlabsingle, ItemwhitechocoCobbleStoneSlabs.class, whitechocoCobbleStoneSlabsingle.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(cocoaDoor, cocoaDoor.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(chocoDirt, chocoDirt.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(chocoSand, ItemChocolateGlass.class, chocoSand.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(chocoCobbleStoneWall, ItemChocolateWall.class, chocoCobbleStoneWall.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(chocolateBrickWall, ItemBrickWall.class, chocolateBrickWall.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(chocolateSmallBrickWall, ItemBrickWall.class, chocolateSmallBrickWall.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(chocoGlass, ItemChocolateGlass.class, chocoGlass.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(chocoGlassPane, chocoGlassPane.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(darkChocoGlassPane, darkChocoGlassPane.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(lightChocoGlassPane, lightChocoGlassPane.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(whiteChocoGlassPane, whiteChocoGlassPane.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(chocoSandstone, ItemChocoSandstone.class, chocoSandstone.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(whiteChocoSandstonestairs, whiteChocoSandstonestairs.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(whiteChocoSmoothSandstoneStairs, whiteChocoSmoothSandstoneStairs.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(whitechocoSandStoneSlabdouble, ItemwhitechocoSandStoneSlabs.class, whitechocoSandStoneSlabdouble.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(whitechocoSandStoneSlabsingle, ItemwhitechocoSandStoneSlabs.class, whitechocoSandStoneSlabsingle.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(whitechocoSmoothSandStoneSlabdouble, ItemwhitechocoSmoothSandStoneSlabs.class, whitechocoSmoothSandStoneSlabdouble.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(whitechocoSmoothSandStoneSlabsingle, ItemwhitechocoSmoothSandStoneSlabs.class, whitechocoSmoothSandStoneSlabsingle.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(ChocoSandstonestairs, ChocoSandstonestairs.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(ChocoSmoothSandstoneStairs, ChocoSmoothSandstoneStairs.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(chocoSandStoneSlabdouble, ItemchocoSandStoneSlabs.class, chocoSandStoneSlabdouble.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(chocoSandStoneSlabsingle, ItemchocoSandStoneSlabs.class, chocoSandStoneSlabsingle.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(chocoSmoothSandStoneSlabdouble, ItemchocoSmoothSandStoneSlabs.class, chocoSmoothSandStoneSlabdouble.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(chocoSmoothSandStoneSlabsingle, ItemchocoSmoothSandStoneSlabs.class, chocoSmoothSandStoneSlabsingle.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(darkChocoSandstonestairs, darkChocoSandstonestairs.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(darkChocoSmoothSandstoneStairs, darkChocoSmoothSandstoneStairs.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(darkchocoSandStoneSlabdouble, ItemdarkchocoSandStoneSlabs.class, darkchocoSandStoneSlabdouble.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(darkchocoSandStoneSlabsingle, ItemdarkchocoSandStoneSlabs.class, darkchocoSandStoneSlabsingle.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(darkchocoSmoothSandStoneSlabdouble, ItemdarkchocoSmoothSandStoneSlabs.class, darkchocoSmoothSandStoneSlabdouble.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(darkchocoSmoothSandStoneSlabsingle, ItemdarkchocoSmoothSandStoneSlabs.class, darkchocoSmoothSandStoneSlabsingle.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(lightChocoSandstonestairs, lightChocoSandstonestairs.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(lightChocoSmoothSandstoneStairs, lightChocoSmoothSandstoneStairs.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(lightchocoSandStoneSlabdouble, ItemlightchocoSandStoneSlabs.class, lightchocoSandStoneSlabdouble.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(lightchocoSandStoneSlabsingle, ItemlightchocoSandStoneSlabs.class, lightchocoSandStoneSlabsingle.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(lightchocoSmoothSandStoneSlabdouble, ItemlightchocoSmoothSandStoneSlabs.class, lightchocoSmoothSandStoneSlabdouble.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(lightchocoSmoothSandStoneSlabsingle, ItemlightchocoSmoothSandStoneSlabs.class, lightchocoSmoothSandStoneSlabsingle.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(caramelBlock, ItemCaramelBlocks.class, caramelBlock.getUnlocalizedName().substring(5));

	}

}
