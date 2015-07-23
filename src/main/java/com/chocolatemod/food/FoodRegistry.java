package com.chocolatemod.food;

import com.chocolatemod.block.BlockRegistry;
import com.chocolatemod.item.chocolateItems;
import com.chocolatemod.main.MainRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionHelper;

public class FoodRegistry {

	public static void mainRegistry() {
		initialiseItem();
		registerItem();
	}

	public static Item chocolatebar1;
	public static Item chocolatebar2;
	public static Item chocolatebar3;
	public static Item chocolatebar4;
	public static Item chocolateapple;
	public static Item cookiesandcreambar;
	public static Item chocolateball1;
	public static Item chocolateball2;
	public static Item chocolateball3;
	public static Item chocolateball4;
	public static Item chocolateegg;
	public static Item chocolatesoup;
	public static Item darkchocolatenutbar;
	public static Item lightchocolatenutbar;
	public static Item whitechocolatenutbar;
	public static Item strawberry;
	public static Item chocolateStrawberry;
	public static Item goldchocolatebar1;
	public static Item goldchocolatebar2;
	public static Item ToffeeApple;
	public static Item mintTea;
	public static Item toffee;
	public static Item rawMintTea;

	//Cake
	public static Item ChocolateCake1;
	public static Item DarkChocolateCake1;
	public static Item LightChocolateCake1;
	public static Item WhiteChocolateCake1;


	public static void initialiseItem() {
		chocolatebar1 = new chocolatebar(4, 0.2F, false).setUnlocalizedName("killerjdog51:chocolatebar").setTextureName("killerjdog51:chocolatebar");
		chocolatebar2 = new chocolatebar2(6, 0.3F, false).setUnlocalizedName("killerjdog51:fruitychocolatebar").setTextureName("killerjdog51:chocolatebar");
		chocolatebar3 = new chocolatebar3(8, 0.4F, false).setUnlocalizedName("killerjdog51:mintychocolatebar").setTextureName("killerjdog51:chocolatebar");
		chocolatebar4 = new chocolatebar4(10, 0.5F, false).setUnlocalizedName("killerjdog51:chocolatenutbar").setTextureName("killerjdog51:chocolatebar");
		chocolateapple = new chocolateapple(6, 0.2F, false).setUnlocalizedName("killerjdog51:chocolateApple").setTextureName("killerjdog51:chocolateApple");
		cookiesandcreambar = new chocolateFood(6, 0.3F, false).setUnlocalizedName("killerjdog51:cookiesandcreambar").setTextureName("killerjdog51:cookiesandcreambar");
		chocolateegg = new chocolateFood(4, 0.2F, false).setUnlocalizedName("killerjdog51:chocolateegg").setTextureName("killerjdog51:chocolateegg");
		chocolatesoup = new chocolatesoup(6, 0.5F, false).setUnlocalizedName("killerjdog51:chocolatesoup");
		chocolateStrawberry = new chocolatestrawberry(4, 0.4F, false).setUnlocalizedName("killerjdog51:chocolateStrawberry").setTextureName("killerjdog51:chocolateStrawberry");
		chocolateball1 = new chocolateball(6, 0.3F, false).setUnlocalizedName("killerjdog51:chocolateball").setTextureName("killerjdog51:chocolateball");
		chocolateball2 = new chocolateball2(8, 0.4F, false).setUnlocalizedName("killerjdog51:fruitychocolateball").setTextureName("killerjdog51:chocolateball");
		chocolateball3 = new chocolateball3(10, 0.5F, false).setUnlocalizedName("killerjdog51:mintychocolateball").setTextureName("killerjdog51:chocolateball");
		chocolateball4 = new chocolateball4(12, 0.6F, false).setUnlocalizedName("killerjdog51:chocolatenutball").setTextureName("killerjdog51:chocolateball");
		goldchocolatebar1 = (new goldchocolatebar(8, 1.5F, false)).setUnlocalizedName("killerjdog51:goldchocolatebar").setPotionEffect(PotionHelper.goldenCarrotEffect);
		goldchocolatebar2 = (new ItemChocolateBarGold(8, 1.5F, false)).setAlwaysEdible().setPotionEffect(Potion.regeneration.id, 5, 1, 1.0F).setUnlocalizedName("goldchocolatebar").setTextureName("killerjdog51:goldchocolatebar");

		//Cake
		ChocolateCake1 = (new chocolatecake(BlockRegistry.ChocolateCake)).setMaxStackSize(1).setUnlocalizedName("killerjdog51:chocolatecake").setCreativeTab(MainRegistry.tabChocolateFood);
		DarkChocolateCake1 = (new darkchocolatecake(BlockRegistry.DarkChocolateCake)).setMaxStackSize(1).setUnlocalizedName("killerjdog51:darkchocolatecake").setCreativeTab(MainRegistry.tabChocolateFood);
		LightChocolateCake1 = (new lightchocolatecake(BlockRegistry.LightChocolateCake)).setMaxStackSize(1).setUnlocalizedName("killerjdog51:lightchocolatecake").setCreativeTab(MainRegistry.tabChocolateFood);
		WhiteChocolateCake1 = (new whitechocolatecake(BlockRegistry.WhiteChocolateCake)).setMaxStackSize(1).setUnlocalizedName("killerjdog51:whitechocolatecake").setCreativeTab(MainRegistry.tabChocolateFood);

		//NonChocolate Food
		toffee = new chocolateItems().setUnlocalizedName("toffee").setCreativeTab(MainRegistry.tabChocolateMisc).setTextureName("killerjdog51:toffee");
		ToffeeApple = new chocolateFood(6, 0.2F, false).setUnlocalizedName("ToffeeApple").setCreativeTab(MainRegistry.tabChocolateFood).setTextureName("killerjdog51:toffeeApple");
		rawMintTea = new chocolateItems().setUnlocalizedName("rawMintTea").setCreativeTab(MainRegistry.tabChocolateMisc).setTextureName("killerjdog51:rawMintTea");
		mintTea = new mintTea(3, false).setUnlocalizedName("mintTea").setCreativeTab(MainRegistry.tabChocolateFood).setTextureName("killerjdog51:mintTea");


	}

	public static void registerItem() {

		GameRegistry.registerItem(FoodRegistry.chocolatebar1, chocolatebar1.getUnlocalizedName());
		GameRegistry.registerItem(FoodRegistry.chocolatebar2, chocolatebar2.getUnlocalizedName());
		GameRegistry.registerItem(FoodRegistry.chocolatebar3, chocolatebar3.getUnlocalizedName());
		GameRegistry.registerItem(FoodRegistry.chocolatebar4, chocolatebar4.getUnlocalizedName());
		GameRegistry.registerItem(FoodRegistry.chocolateapple, chocolateapple.getUnlocalizedName());
		GameRegistry.registerItem(FoodRegistry.cookiesandcreambar, cookiesandcreambar.getUnlocalizedName());
		GameRegistry.registerItem(FoodRegistry.chocolateegg, chocolateegg.getUnlocalizedName());
		GameRegistry.registerItem(FoodRegistry.chocolatesoup, chocolatesoup.getUnlocalizedName());
		GameRegistry.registerItem(FoodRegistry.chocolateStrawberry, chocolateStrawberry.getUnlocalizedName());
		GameRegistry.registerItem(FoodRegistry.chocolateball1, chocolateball1.getUnlocalizedName());
		GameRegistry.registerItem(FoodRegistry.chocolateball2, chocolateball2.getUnlocalizedName());
		GameRegistry.registerItem(FoodRegistry.chocolateball3, chocolateball3.getUnlocalizedName());
		GameRegistry.registerItem(FoodRegistry.chocolateball4, chocolateball4.getUnlocalizedName());
		GameRegistry.registerItem(FoodRegistry.goldchocolatebar1, goldchocolatebar1.getUnlocalizedName());
		GameRegistry.registerItem(FoodRegistry.goldchocolatebar2, goldchocolatebar2.getUnlocalizedName());
		GameRegistry.registerItem(FoodRegistry.ChocolateCake1, ChocolateCake1.getUnlocalizedName());
		GameRegistry.registerItem(FoodRegistry.DarkChocolateCake1, DarkChocolateCake1.getUnlocalizedName());
		GameRegistry.registerItem(FoodRegistry.LightChocolateCake1, LightChocolateCake1.getUnlocalizedName());
		GameRegistry.registerItem(FoodRegistry.WhiteChocolateCake1, WhiteChocolateCake1.getUnlocalizedName());

		GameRegistry.registerItem(FoodRegistry.toffee, toffee.getUnlocalizedName());
		GameRegistry.registerItem(FoodRegistry.ToffeeApple, ToffeeApple.getUnlocalizedName());
		GameRegistry.registerItem(FoodRegistry.rawMintTea, rawMintTea.getUnlocalizedName());
		GameRegistry.registerItem(FoodRegistry.mintTea, mintTea.getUnlocalizedName());


	}

}
