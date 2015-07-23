package com.chocolatemod.tools;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EntityDamageSourceIndirect;
import net.minecraftforge.common.util.EnumHelper;

import com.chocolatemod.block.BlockRegistry;
import com.chocolatemod.brewing.brewing;
import com.chocolatemod.main.MainRegistry;
import com.chocolatemod.plants.PlantRegistry;
import com.google.common.collect.Sets;

import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

public class Tools {
	
	static ToolMaterial EnumToolMaterialDarkChocolate= EnumHelper.addToolMaterial("DarkChocolateTools", 2, 300, 4.0F, 5.0F, 14);
	static ToolMaterial EnumToolMaterialChocolate= EnumHelper.addToolMaterial("ChocolateTools", 2, 275, 5.0F, 3.0F, 14);
	static ToolMaterial EnumToolMaterialLightChocolate= EnumHelper.addToolMaterial("LightChocolateTools", 2, 225, 7.0F, 2.0F, 14);
	static ToolMaterial EnumToolMaterialWhiteChocolate= EnumHelper.addToolMaterial("WhiteChocolateTools", 2, 200, 8.0F, 2.0F, 14);

	public static void mainRegistry(){
		initialiseItem();
		registerItem();
	}
	public static Item DarkChocolateAxe;
	public static Item DarkChocolateShovel;
	public static Item DarkChocolatePickaxe;
	public static Item DarkChocolateHoe;
	public static Item DarkChocolateSword;
	public static Item DarkChocolatePaxel;
	public static Item ChocolateAxe;
	public static Item ChocolateShovel;
	public static Item ChocolatePickaxe;
	public static Item ChocolateHoe;
	public static Item ChocolateSword;
	public static Item ChocolatePaxel;
	public static Item LightChocolateAxe;
	public static Item LightChocolateShovel;
	public static Item LightChocolatePickaxe;
	public static Item LightChocolateHoe;
	public static Item LightChocolateSword;
	public static Item LightChocolatePaxel;
	public static Item WhiteChocolateAxe;
	public static Item WhiteChocolateShovel;
	public static Item WhiteChocolatePickaxe;
	public static Item WhiteChocolateHoe;
	public static Item WhiteChocolateSword;
	public static Item WhiteChocolatePaxel;
	public static Item PortalActivator;
	public static Item ChocolateBow;
	public static Item DarkChocolateBow;
	public static Item LightChocolateBow;
	public static Item WhiteChocolateBow;
	public static Item ChocolateArrow;
	
	public static void initialiseItem(){
		ChocolateAxe = new ChocolateAxe(EnumToolMaterialChocolate).setUnlocalizedName("ChocolateAxe").setCreativeTab(MainRegistry.tabChocolateTools).setTextureName("killerjdog51:hatchetChocolate");
		ChocolateShovel = new ChocolateShovel( EnumToolMaterialChocolate).setUnlocalizedName("ChocolateShovel").setCreativeTab(MainRegistry.tabChocolateTools).setTextureName("killerjdog51:shovelChocolate");
		ChocolatePickaxe = new ChocolatePickaxe(EnumToolMaterialChocolate).setUnlocalizedName("ChocolatePickaxe").setCreativeTab(MainRegistry.tabChocolateTools).setTextureName("killerjdog51:pickaxeChocolate");
		ChocolateHoe = new ChocolateHoe(EnumToolMaterialChocolate).setUnlocalizedName("ChocolateHoe").setCreativeTab(MainRegistry.tabChocolateTools).setTextureName("killerjdog51:hoeChocolate");
		ChocolateSword = new ChocolateSword(EnumToolMaterialChocolate).setUnlocalizedName("ChocolateSword").setCreativeTab(MainRegistry.tabChocolateCombat).setTextureName("killerjdog51:swordChocolate");
		DarkChocolateAxe = new ChocolateAxe( EnumToolMaterialDarkChocolate).setUnlocalizedName("DarkChocolateAxe").setCreativeTab(MainRegistry.tabChocolateTools).setTextureName("killerjdog51:hatchetDarkChocolate");
		DarkChocolateShovel = new ChocolateShovel( EnumToolMaterialDarkChocolate).setUnlocalizedName("DarkChocolateShovel").setCreativeTab(MainRegistry.tabChocolateTools).setTextureName("killerjdog51:shovelDarkChocolate");
		DarkChocolatePickaxe = new ChocolatePickaxe( EnumToolMaterialDarkChocolate).setUnlocalizedName("DarkChocolatePickaxe").setCreativeTab(MainRegistry.tabChocolateTools).setTextureName("killerjdog51:pickaxeDarkChocolate");
		DarkChocolateHoe = new ChocolateHoe( EnumToolMaterialDarkChocolate).setUnlocalizedName("DarkChocolateHoe").setCreativeTab(MainRegistry.tabChocolateTools).setTextureName("killerjdog51:hoeDarkChocolate");
		DarkChocolateSword = new ChocolateSword( EnumToolMaterialDarkChocolate).setUnlocalizedName("DarkChocolateSword").setCreativeTab(MainRegistry.tabChocolateCombat).setTextureName("killerjdog51:swordDarkChocolate");
		LightChocolateAxe = new ChocolateAxe( EnumToolMaterialLightChocolate).setUnlocalizedName("LightChocolateAxe").setCreativeTab(MainRegistry.tabChocolateTools).setTextureName("killerjdog51:hatchetLightChocolate");
		LightChocolateShovel = new ChocolateShovel( EnumToolMaterialLightChocolate).setUnlocalizedName("LightChocolateShovel").setCreativeTab(MainRegistry.tabChocolateTools).setTextureName("killerjdog51:shovelLightChocolate");
		LightChocolatePickaxe = new ChocolatePickaxe( EnumToolMaterialLightChocolate).setUnlocalizedName("LightChocolatePickaxe").setCreativeTab(MainRegistry.tabChocolateTools).setTextureName("killerjdog51:pickaxeLightChocolate");
		LightChocolateHoe = new ChocolateHoe(EnumToolMaterialLightChocolate).setUnlocalizedName("LightChocolateHoe").setCreativeTab(MainRegistry.tabChocolateTools).setTextureName("killerjdog51:hoeLightChocolate");
		LightChocolateSword = new ChocolateSword( EnumToolMaterialLightChocolate).setUnlocalizedName("LightChocolateSword").setCreativeTab(MainRegistry.tabChocolateCombat).setTextureName("killerjdog51:swordLightChocolate");
		WhiteChocolateAxe = new ChocolateAxe( EnumToolMaterialWhiteChocolate).setUnlocalizedName("WhiteChocolateAxe").setCreativeTab(MainRegistry.tabChocolateTools).setTextureName("killerjdog51:hatchetWhiteChocolate");
		WhiteChocolateShovel = new ChocolateShovel( EnumToolMaterialWhiteChocolate).setUnlocalizedName("WhiteChocolateShovel").setCreativeTab(MainRegistry.tabChocolateTools).setTextureName("killerjdog51:shovelWhiteChocolate");
		WhiteChocolatePickaxe = new ChocolatePickaxe( EnumToolMaterialWhiteChocolate).setUnlocalizedName("WhiteChocolatePickaxe").setCreativeTab(MainRegistry.tabChocolateTools).setTextureName("killerjdog51:pickaxeWhiteChocolate");
		WhiteChocolateHoe = new ChocolateHoe( EnumToolMaterialWhiteChocolate).setUnlocalizedName("WhiteChocolateHoe").setCreativeTab(MainRegistry.tabChocolateTools).setTextureName("killerjdog51:hoeWhiteChocolate");
		WhiteChocolateSword = new ChocolateSword( EnumToolMaterialWhiteChocolate).setUnlocalizedName("WhiteChocolateSword").setCreativeTab(MainRegistry.tabChocolateCombat).setTextureName("killerjdog51:swordWhiteChocolate");
		
		ChocolatePaxel = new ChocolatePaxel(EnumToolMaterialChocolate, Sets.newHashSet(new Block[] {Blocks.planks, Blocks.bookshelf, Blocks.log, Blocks.log2, Blocks.chest, Blocks.pumpkin, Blocks.lit_pumpkin, Blocks.cobblestone, Blocks.double_stone_slab, Blocks.stone_slab, Blocks.stone, Blocks.sandstone, Blocks.mossy_cobblestone, Blocks.iron_ore, Blocks.iron_block, Blocks.coal_ore, Blocks.gold_block, Blocks.gold_ore, Blocks.diamond_ore, Blocks.diamond_block, Blocks.ice, Blocks.netherrack, Blocks.lapis_ore, Blocks.lapis_block, Blocks.redstone_ore, Blocks.lit_redstone_ore, Blocks.rail, Blocks.detector_rail, Blocks.golden_rail, Blocks.activator_rail, Blocks.grass, Blocks.dirt, Blocks.sand, Blocks.gravel, Blocks.snow_layer, Blocks.snow, Blocks.clay, Blocks.farmland, Blocks.soul_sand, Blocks.mycelium, BlockRegistry.chocoCoal, BlockRegistry.chocoCobbleStone, BlockRegistry.chocoCobbleStoneSlabdouble, BlockRegistry.chocoCobbleStoneSlabsingle, BlockRegistry.chocoCobbleStoneStairs, BlockRegistry.chocoDiamond, BlockRegistry.chocoGold, BlockRegistry.chocoGrass, BlockRegistry.chocoIron, BlockRegistry.chocoLapis, BlockRegistry.ChocolateBallMould, BlockRegistry.chocolateblock, BlockRegistry.chocolatebrick, BlockRegistry.chocolatebrickdouble, BlockRegistry.chocolatebrickfence, BlockRegistry.chocolatebricksingle, BlockRegistry.chocolatebrickstairs, BlockRegistry.chocolatechiseled, BlockRegistry.chocolatedouble, BlockRegistry.chocolatefence, BlockRegistry.ChocolateMould, BlockRegistry.chocolateOres, BlockRegistry.chocolatepane, BlockRegistry.chocolatepiller, BlockRegistry.chocolatesingle, BlockRegistry.chocolatestairs, BlockRegistry.chocoRedstone, BlockRegistry.chocoStone, BlockRegistry.cocoaDoor, BlockRegistry.CocoaPlanks, BlockRegistry.CocoaSlabdouble, BlockRegistry.CocoaSlabsingle, BlockRegistry.CocoaStairs, BlockRegistry.cookiesandcreamblock, BlockRegistry.darkchocolatebrickdouble, BlockRegistry.darkchocolatebrickfence, BlockRegistry.darkchocolatebricksingle, BlockRegistry.darkchocolatebrickstairs, BlockRegistry.darkchocolatedouble, BlockRegistry.darkchocolatefence, BlockRegistry.darkchocolatepane, BlockRegistry.darkchocolatesingle, BlockRegistry.darkchocolatestairs, BlockRegistry.fruitychocolateblock, BlockRegistry.goldchocolateblock, BlockRegistry.lightchocolatebrickdouble, BlockRegistry.lightchocolatebrickfence, BlockRegistry.lightchocolatebricksingle, BlockRegistry.lightchocolatebrickstairs, BlockRegistry.lightchocolatedouble, BlockRegistry.lightchocolatefence, BlockRegistry.lightchocolatepane, BlockRegistry.lightchocolatesingle, BlockRegistry.lightchocolatestairs,BlockRegistry.litChocoRedstone, BlockRegistry.mintychocolateblock, BlockRegistry.smallchocolatebrickdouble, BlockRegistry.smallchocolatebricksingle, BlockRegistry.smallchocolatebrickstairs, BlockRegistry.smalldarkchocolatebrickdouble, BlockRegistry.smalldarkchocolatebricksingle, BlockRegistry.smalldarkchocolatebrickstairs, BlockRegistry.smalllightchocolatebrickdouble, BlockRegistry.smalllightchocolatebricksingle, BlockRegistry.smalllightchocolatebrickstairs, BlockRegistry.smallwhitechocolatebrickdouble, BlockRegistry.smallwhitechocolatebricksingle, BlockRegistry.smallwhitechocolatebrickstairs, BlockRegistry.whitechocolatebrickdouble, BlockRegistry.whitechocolatebrickfence, BlockRegistry.whitechocolatebricksingle, BlockRegistry.whitechocolatebrickstairs, BlockRegistry.whitechocolatedouble, BlockRegistry.whitechocolatefence, BlockRegistry.whitechocolatepane, BlockRegistry.whitechocolatesingle, BlockRegistry.whitechocolatestairs, PlantRegistry.chocolatemushroomcapbrown, PlantRegistry.chocolatemushroomcapwhite, PlantRegistry.CocoaLog, brewing.BlockChocolateMilk, brewing.BlockMilkCauldron, brewing.LightBlockChocolateMilk})).setUnlocalizedName("ChocolatePaxel").setCreativeTab(MainRegistry.tabChocolateTools).setTextureName("killerjdog51:paxelChocolate");
		DarkChocolatePaxel = new ChocolatePaxel(EnumToolMaterialDarkChocolate, Sets.newHashSet(new Block[] {Blocks.planks, Blocks.bookshelf, Blocks.log, Blocks.log2, Blocks.chest, Blocks.pumpkin, Blocks.lit_pumpkin, Blocks.cobblestone, Blocks.double_stone_slab, Blocks.stone_slab, Blocks.stone, Blocks.sandstone, Blocks.mossy_cobblestone, Blocks.iron_ore, Blocks.iron_block, Blocks.coal_ore, Blocks.gold_block, Blocks.gold_ore, Blocks.diamond_ore, Blocks.diamond_block, Blocks.ice, Blocks.netherrack, Blocks.lapis_ore, Blocks.lapis_block, Blocks.redstone_ore, Blocks.lit_redstone_ore, Blocks.rail, Blocks.detector_rail, Blocks.golden_rail, Blocks.activator_rail, Blocks.grass, Blocks.dirt, Blocks.sand, Blocks.gravel, Blocks.snow_layer, Blocks.snow, Blocks.clay, Blocks.farmland, Blocks.soul_sand, Blocks.mycelium, BlockRegistry.chocoCoal, BlockRegistry.chocoCobbleStone, BlockRegistry.chocoCobbleStoneSlabdouble, BlockRegistry.chocoCobbleStoneSlabsingle, BlockRegistry.chocoCobbleStoneStairs, BlockRegistry.chocoDiamond, BlockRegistry.chocoGold, BlockRegistry.chocoGrass, BlockRegistry.chocoIron, BlockRegistry.chocoLapis, BlockRegistry.ChocolateBallMould, BlockRegistry.chocolateblock, BlockRegistry.chocolatebrick, BlockRegistry.chocolatebrickdouble, BlockRegistry.chocolatebrickfence, BlockRegistry.chocolatebricksingle, BlockRegistry.chocolatebrickstairs, BlockRegistry.chocolatechiseled, BlockRegistry.chocolatedouble, BlockRegistry.chocolatefence, BlockRegistry.ChocolateMould, BlockRegistry.chocolateOres, BlockRegistry.chocolatepane, BlockRegistry.chocolatepiller, BlockRegistry.chocolatesingle, BlockRegistry.chocolatestairs, BlockRegistry.chocoRedstone, BlockRegistry.chocoStone, BlockRegistry.cocoaDoor, BlockRegistry.CocoaPlanks, BlockRegistry.CocoaSlabdouble, BlockRegistry.CocoaSlabsingle, BlockRegistry.CocoaStairs, BlockRegistry.cookiesandcreamblock, BlockRegistry.darkchocolatebrickdouble, BlockRegistry.darkchocolatebrickfence, BlockRegistry.darkchocolatebricksingle, BlockRegistry.darkchocolatebrickstairs, BlockRegistry.darkchocolatedouble, BlockRegistry.darkchocolatefence, BlockRegistry.darkchocolatepane, BlockRegistry.darkchocolatesingle, BlockRegistry.darkchocolatestairs, BlockRegistry.fruitychocolateblock, BlockRegistry.goldchocolateblock, BlockRegistry.lightchocolatebrickdouble, BlockRegistry.lightchocolatebrickfence, BlockRegistry.lightchocolatebricksingle, BlockRegistry.lightchocolatebrickstairs, BlockRegistry.lightchocolatedouble, BlockRegistry.lightchocolatefence, BlockRegistry.lightchocolatepane, BlockRegistry.lightchocolatesingle, BlockRegistry.lightchocolatestairs,BlockRegistry.litChocoRedstone, BlockRegistry.mintychocolateblock, BlockRegistry.smallchocolatebrickdouble, BlockRegistry.smallchocolatebricksingle, BlockRegistry.smallchocolatebrickstairs, BlockRegistry.smalldarkchocolatebrickdouble, BlockRegistry.smalldarkchocolatebricksingle, BlockRegistry.smalldarkchocolatebrickstairs, BlockRegistry.smalllightchocolatebrickdouble, BlockRegistry.smalllightchocolatebricksingle, BlockRegistry.smalllightchocolatebrickstairs, BlockRegistry.smallwhitechocolatebrickdouble, BlockRegistry.smallwhitechocolatebricksingle, BlockRegistry.smallwhitechocolatebrickstairs, BlockRegistry.whitechocolatebrickdouble, BlockRegistry.whitechocolatebrickfence, BlockRegistry.whitechocolatebricksingle, BlockRegistry.whitechocolatebrickstairs, BlockRegistry.whitechocolatedouble, BlockRegistry.whitechocolatefence, BlockRegistry.whitechocolatepane, BlockRegistry.whitechocolatesingle, BlockRegistry.whitechocolatestairs, PlantRegistry.chocolatemushroomcapbrown, PlantRegistry.chocolatemushroomcapwhite, PlantRegistry.CocoaLog, brewing.BlockChocolateMilk, brewing.BlockMilkCauldron, brewing.LightBlockChocolateMilk})).setUnlocalizedName("DarkChocolatePaxel").setCreativeTab(MainRegistry.tabChocolateTools).setTextureName("killerjdog51:paxelDarkChocolate");
		LightChocolatePaxel = new ChocolatePaxel(EnumToolMaterialLightChocolate, Sets.newHashSet(new Block[] {Blocks.planks, Blocks.bookshelf, Blocks.log, Blocks.log2, Blocks.chest, Blocks.pumpkin, Blocks.lit_pumpkin, Blocks.cobblestone, Blocks.double_stone_slab, Blocks.stone_slab, Blocks.stone, Blocks.sandstone, Blocks.mossy_cobblestone, Blocks.iron_ore, Blocks.iron_block, Blocks.coal_ore, Blocks.gold_block, Blocks.gold_ore, Blocks.diamond_ore, Blocks.diamond_block, Blocks.ice, Blocks.netherrack, Blocks.lapis_ore, Blocks.lapis_block, Blocks.redstone_ore, Blocks.lit_redstone_ore, Blocks.rail, Blocks.detector_rail, Blocks.golden_rail, Blocks.activator_rail, Blocks.grass, Blocks.dirt, Blocks.sand, Blocks.gravel, Blocks.snow_layer, Blocks.snow, Blocks.clay, Blocks.farmland, Blocks.soul_sand, Blocks.mycelium, BlockRegistry.chocoCoal, BlockRegistry.chocoCobbleStone, BlockRegistry.chocoCobbleStoneSlabdouble, BlockRegistry.chocoCobbleStoneSlabsingle, BlockRegistry.chocoCobbleStoneStairs, BlockRegistry.chocoDiamond, BlockRegistry.chocoGold, BlockRegistry.chocoGrass, BlockRegistry.chocoIron, BlockRegistry.chocoLapis, BlockRegistry.ChocolateBallMould, BlockRegistry.chocolateblock, BlockRegistry.chocolatebrick, BlockRegistry.chocolatebrickdouble, BlockRegistry.chocolatebrickfence, BlockRegistry.chocolatebricksingle, BlockRegistry.chocolatebrickstairs, BlockRegistry.chocolatechiseled, BlockRegistry.chocolatedouble, BlockRegistry.chocolatefence, BlockRegistry.ChocolateMould, BlockRegistry.chocolateOres, BlockRegistry.chocolatepane, BlockRegistry.chocolatepiller, BlockRegistry.chocolatesingle, BlockRegistry.chocolatestairs, BlockRegistry.chocoRedstone, BlockRegistry.chocoStone, BlockRegistry.cocoaDoor, BlockRegistry.CocoaPlanks, BlockRegistry.CocoaSlabdouble, BlockRegistry.CocoaSlabsingle, BlockRegistry.CocoaStairs, BlockRegistry.cookiesandcreamblock, BlockRegistry.darkchocolatebrickdouble, BlockRegistry.darkchocolatebrickfence, BlockRegistry.darkchocolatebricksingle, BlockRegistry.darkchocolatebrickstairs, BlockRegistry.darkchocolatedouble, BlockRegistry.darkchocolatefence, BlockRegistry.darkchocolatepane, BlockRegistry.darkchocolatesingle, BlockRegistry.darkchocolatestairs, BlockRegistry.fruitychocolateblock, BlockRegistry.goldchocolateblock, BlockRegistry.lightchocolatebrickdouble, BlockRegistry.lightchocolatebrickfence, BlockRegistry.lightchocolatebricksingle, BlockRegistry.lightchocolatebrickstairs, BlockRegistry.lightchocolatedouble, BlockRegistry.lightchocolatefence, BlockRegistry.lightchocolatepane, BlockRegistry.lightchocolatesingle, BlockRegistry.lightchocolatestairs,BlockRegistry.litChocoRedstone, BlockRegistry.mintychocolateblock, BlockRegistry.smallchocolatebrickdouble, BlockRegistry.smallchocolatebricksingle, BlockRegistry.smallchocolatebrickstairs, BlockRegistry.smalldarkchocolatebrickdouble, BlockRegistry.smalldarkchocolatebricksingle, BlockRegistry.smalldarkchocolatebrickstairs, BlockRegistry.smalllightchocolatebrickdouble, BlockRegistry.smalllightchocolatebricksingle, BlockRegistry.smalllightchocolatebrickstairs, BlockRegistry.smallwhitechocolatebrickdouble, BlockRegistry.smallwhitechocolatebricksingle, BlockRegistry.smallwhitechocolatebrickstairs, BlockRegistry.whitechocolatebrickdouble, BlockRegistry.whitechocolatebrickfence, BlockRegistry.whitechocolatebricksingle, BlockRegistry.whitechocolatebrickstairs, BlockRegistry.whitechocolatedouble, BlockRegistry.whitechocolatefence, BlockRegistry.whitechocolatepane, BlockRegistry.whitechocolatesingle, BlockRegistry.whitechocolatestairs, PlantRegistry.chocolatemushroomcapbrown, PlantRegistry.chocolatemushroomcapwhite, PlantRegistry.CocoaLog, brewing.BlockChocolateMilk, brewing.BlockMilkCauldron, brewing.LightBlockChocolateMilk})).setUnlocalizedName("LightChocolatePaxel").setCreativeTab(MainRegistry.tabChocolateTools).setTextureName("killerjdog51:paxelLightChocolate");
		WhiteChocolatePaxel = new ChocolatePaxel(EnumToolMaterialWhiteChocolate, Sets.newHashSet(new Block[] {Blocks.planks, Blocks.bookshelf, Blocks.log, Blocks.log2, Blocks.chest, Blocks.pumpkin, Blocks.lit_pumpkin, Blocks.cobblestone, Blocks.double_stone_slab, Blocks.stone_slab, Blocks.stone, Blocks.sandstone, Blocks.mossy_cobblestone, Blocks.iron_ore, Blocks.iron_block, Blocks.coal_ore, Blocks.gold_block, Blocks.gold_ore, Blocks.diamond_ore, Blocks.diamond_block, Blocks.ice, Blocks.netherrack, Blocks.lapis_ore, Blocks.lapis_block, Blocks.redstone_ore, Blocks.lit_redstone_ore, Blocks.rail, Blocks.detector_rail, Blocks.golden_rail, Blocks.activator_rail, Blocks.grass, Blocks.dirt, Blocks.sand, Blocks.gravel, Blocks.snow_layer, Blocks.snow, Blocks.clay, Blocks.farmland, Blocks.soul_sand, Blocks.mycelium, BlockRegistry.chocoCoal, BlockRegistry.chocoCobbleStone, BlockRegistry.chocoCobbleStoneSlabdouble, BlockRegistry.chocoCobbleStoneSlabsingle, BlockRegistry.chocoCobbleStoneStairs, BlockRegistry.chocoDiamond, BlockRegistry.chocoGold, BlockRegistry.chocoGrass, BlockRegistry.chocoIron, BlockRegistry.chocoLapis, BlockRegistry.ChocolateBallMould, BlockRegistry.chocolateblock, BlockRegistry.chocolatebrick, BlockRegistry.chocolatebrickdouble, BlockRegistry.chocolatebrickfence, BlockRegistry.chocolatebricksingle, BlockRegistry.chocolatebrickstairs, BlockRegistry.chocolatechiseled, BlockRegistry.chocolatedouble, BlockRegistry.chocolatefence, BlockRegistry.ChocolateMould, BlockRegistry.chocolateOres, BlockRegistry.chocolatepane, BlockRegistry.chocolatepiller, BlockRegistry.chocolatesingle, BlockRegistry.chocolatestairs, BlockRegistry.chocoRedstone, BlockRegistry.chocoStone, BlockRegistry.cocoaDoor, BlockRegistry.CocoaPlanks, BlockRegistry.CocoaSlabdouble, BlockRegistry.CocoaSlabsingle, BlockRegistry.CocoaStairs, BlockRegistry.cookiesandcreamblock, BlockRegistry.darkchocolatebrickdouble, BlockRegistry.darkchocolatebrickfence, BlockRegistry.darkchocolatebricksingle, BlockRegistry.darkchocolatebrickstairs, BlockRegistry.darkchocolatedouble, BlockRegistry.darkchocolatefence, BlockRegistry.darkchocolatepane, BlockRegistry.darkchocolatesingle, BlockRegistry.darkchocolatestairs, BlockRegistry.fruitychocolateblock, BlockRegistry.goldchocolateblock, BlockRegistry.lightchocolatebrickdouble, BlockRegistry.lightchocolatebrickfence, BlockRegistry.lightchocolatebricksingle, BlockRegistry.lightchocolatebrickstairs, BlockRegistry.lightchocolatedouble, BlockRegistry.lightchocolatefence, BlockRegistry.lightchocolatepane, BlockRegistry.lightchocolatesingle, BlockRegistry.lightchocolatestairs,BlockRegistry.litChocoRedstone, BlockRegistry.mintychocolateblock, BlockRegistry.smallchocolatebrickdouble, BlockRegistry.smallchocolatebricksingle, BlockRegistry.smallchocolatebrickstairs, BlockRegistry.smalldarkchocolatebrickdouble, BlockRegistry.smalldarkchocolatebricksingle, BlockRegistry.smalldarkchocolatebrickstairs, BlockRegistry.smalllightchocolatebrickdouble, BlockRegistry.smalllightchocolatebricksingle, BlockRegistry.smalllightchocolatebrickstairs, BlockRegistry.smallwhitechocolatebrickdouble, BlockRegistry.smallwhitechocolatebricksingle, BlockRegistry.smallwhitechocolatebrickstairs, BlockRegistry.whitechocolatebrickdouble, BlockRegistry.whitechocolatebrickfence, BlockRegistry.whitechocolatebricksingle, BlockRegistry.whitechocolatebrickstairs, BlockRegistry.whitechocolatedouble, BlockRegistry.whitechocolatefence, BlockRegistry.whitechocolatepane, BlockRegistry.whitechocolatesingle, BlockRegistry.whitechocolatestairs, PlantRegistry.chocolatemushroomcapbrown, PlantRegistry.chocolatemushroomcapwhite, PlantRegistry.CocoaLog, brewing.BlockChocolateMilk, brewing.BlockMilkCauldron, brewing.LightBlockChocolateMilk})).setUnlocalizedName("WhiteChocolatePaxel").setCreativeTab(MainRegistry.tabChocolateTools).setTextureName("killerjdog51:paxelWhiteChocolate");

		ChocolateBow = (new ChocolateBow()).setUnlocalizedName("killerjdog51:chocolatebow").setTextureName("killerjdog51:chocolatebow");
		DarkChocolateBow = (new DarkChocolateBow()).setUnlocalizedName("killerjdog51:darkchocolatebow").setTextureName("killerjdog51:darkchocolatebow");
		LightChocolateBow = (new LightChocolateBow()).setUnlocalizedName("killerjdog51:lightchocolatebow").setTextureName("killerjdog51:lightchocolatebow");
		WhiteChocolateBow = (new WhiteChocolateBow()).setUnlocalizedName("killerjdog51:whitechocolatebow").setTextureName("killerjdog51:whitechocolatebow");
		
		ChocolateArrow = (new ChocolateArrow()).setUnlocalizedName("chocolateArrow").setCreativeTab(MainRegistry.tabChocolateCombat).setTextureName("killerjdog51:chocolatearrow");
	    
	}
	public static DamageSource causeChocolateArrowDamage(entitychocolatearrow p_76353_0_, Entity p_76353_1_)
    {
        return (new EntityDamageSourceIndirect("chocolateArrow", p_76353_0_, p_76353_1_)).setProjectile();
    }
	

	public static void registerItem(){
		GameRegistry.registerItem(Tools.ChocolateAxe, ChocolateAxe.getUnlocalizedName());
		GameRegistry.registerItem(Tools.ChocolateShovel, ChocolateShovel.getUnlocalizedName());
		GameRegistry.registerItem(Tools.ChocolatePickaxe, ChocolatePickaxe.getUnlocalizedName());
		GameRegistry.registerItem(Tools.ChocolateHoe, ChocolateHoe.getUnlocalizedName());
		GameRegistry.registerItem(Tools.ChocolateSword, ChocolateSword.getUnlocalizedName());
		GameRegistry.registerItem(Tools.DarkChocolateAxe, DarkChocolateAxe.getUnlocalizedName());
		GameRegistry.registerItem(Tools.DarkChocolateShovel, DarkChocolateShovel.getUnlocalizedName());
		GameRegistry.registerItem(Tools.DarkChocolatePickaxe, DarkChocolatePickaxe.getUnlocalizedName());
		GameRegistry.registerItem(Tools.DarkChocolateHoe, DarkChocolateHoe.getUnlocalizedName());
		GameRegistry.registerItem(Tools.DarkChocolateSword, DarkChocolateSword.getUnlocalizedName());
		GameRegistry.registerItem(Tools.LightChocolateAxe, LightChocolateAxe.getUnlocalizedName());
		GameRegistry.registerItem(Tools.LightChocolateShovel, LightChocolateShovel.getUnlocalizedName());
		GameRegistry.registerItem(Tools.LightChocolatePickaxe, LightChocolatePickaxe.getUnlocalizedName());
		GameRegistry.registerItem(Tools.LightChocolateHoe, LightChocolateHoe.getUnlocalizedName());
		GameRegistry.registerItem(Tools.LightChocolateSword, LightChocolateSword.getUnlocalizedName());
		GameRegistry.registerItem(Tools.WhiteChocolateAxe, WhiteChocolateAxe.getUnlocalizedName());
		GameRegistry.registerItem(Tools.WhiteChocolateShovel, WhiteChocolateShovel.getUnlocalizedName());
		GameRegistry.registerItem(Tools.WhiteChocolatePickaxe, WhiteChocolatePickaxe.getUnlocalizedName());
		GameRegistry.registerItem(Tools.WhiteChocolateHoe, WhiteChocolateHoe.getUnlocalizedName());
		GameRegistry.registerItem(Tools.WhiteChocolateSword, WhiteChocolateSword.getUnlocalizedName());
		GameRegistry.registerItem(Tools.ChocolatePaxel, ChocolatePaxel.getUnlocalizedName());
		GameRegistry.registerItem(Tools.DarkChocolatePaxel, DarkChocolatePaxel.getUnlocalizedName());
		GameRegistry.registerItem(Tools.LightChocolatePaxel, LightChocolatePaxel.getUnlocalizedName());
		GameRegistry.registerItem(Tools.WhiteChocolatePaxel, WhiteChocolatePaxel.getUnlocalizedName());
		GameRegistry.registerItem(Tools.ChocolateBow, ChocolateBow.getUnlocalizedName());
		GameRegistry.registerItem(Tools.DarkChocolateBow, DarkChocolateBow.getUnlocalizedName());
		GameRegistry.registerItem(Tools.LightChocolateBow, LightChocolateBow.getUnlocalizedName());
		GameRegistry.registerItem(Tools.WhiteChocolateBow, WhiteChocolateBow.getUnlocalizedName());
		GameRegistry.registerItem(Tools.ChocolateArrow, ChocolateArrow.getUnlocalizedName());
	}

}
