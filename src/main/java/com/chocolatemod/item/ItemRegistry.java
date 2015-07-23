package com.chocolatemod.item;

import com.chocolatemod.main.MainRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class ItemRegistry {

	public static void mainRegistry() {
		initialiseItem();
		registerItem();
	}

	public static Item chocolatemilk;
	public static Item whitechocolatemilk;
	public static Item darkchocolatemilk;
	public static Item lightchocolatemilk;
	public static Item fruitbits;
	public static Item lightchocolatelump;
	public static Item bowlmilk;
	public static Item rawchocolatelump;
	public static Item mint;
	public static Item ChocolatePortalPlacer;
	public static Item bowlchocolatemilk;
	public static Item bowldarkchocolatemilk;
	public static Item bowllightchocolatemilk;
	public static Item bowlwhitechocolatemilk;
	public static Item chocolateIngots;
	public static Item chocolaterod;
	public static Item toffee;
	public static Item rawMintTea;
	public static Item mintSeeds;
	public static Item CocoaDoorItem;
	public static Item ChocolateFeather;
	public static Item WarmChocolateBowl;

	//Cake
	public static Item ChocolateCake1;
	public static Item DarkChocolateCake1;
	public static Item LightChocolateCake1;
	public static Item WhiteChocolateCake1;


	public static void initialiseItem() {

		bowlchocolatemilk = new BowlChocolateMilk(2, 0.4F, false).setUnlocalizedName("bowlchocolatemilk").setTextureName("killerjdog51:chocolatemilkbowl").setCreativeTab(MainRegistry.tabChocolateMisc);
		bowlwhitechocolatemilk = new BowlWhiteChocolateMilk(2, 0.4F, false).setUnlocalizedName("bowlwhitechocolatemilk").setCreativeTab(MainRegistry.tabChocolateMisc);
		bowldarkchocolatemilk = new BowlDarkChocolateMilk(2, 0.4F, false).setUnlocalizedName("bowldarkchocolatemilk").setCreativeTab(MainRegistry.tabChocolateMisc).setTextureName("killerjdog51:darkchocolatemilkbowl");
		bowllightchocolatemilk = new BowlLightChocolateMilk(2, 0.4F, false).setUnlocalizedName("bowllightchocolatemilk").setCreativeTab(MainRegistry.tabChocolateMisc);
		fruitbits = new chocolateItems().setUnlocalizedName("fruitbits");
		lightchocolatelump = new chocolateItems().setUnlocalizedName("lightchocolatelump").setTextureName("killerjdog51:lightchocolatelump").setCreativeTab(MainRegistry.tabChocolateMisc);
		bowlmilk = new bowlMilk(2, 0.4F, false).setUnlocalizedName("bowlmilk").setContainerItem(net.minecraft.init.Items.bowl);
		rawchocolatelump = new chocolateItems().setUnlocalizedName("rawchocolatelump").setTextureName("killerjdog51:chocolatelump").setCreativeTab(MainRegistry.tabChocolateMisc);
		ChocolatePortalPlacer = new ChocolatePortalPlacer().setUnlocalizedName("ChocolatePortal");
		chocolateIngots = new ChocolateIngots().setUnlocalizedName("chocolateIngots").setTextureName("killerjdog51:chocolateingot");
		chocolaterod = new chocolateItems().setUnlocalizedName("chocolaterod").setCreativeTab(MainRegistry.tabChocolateMisc).setTextureName("killerjdog51:chocolaterod");
		mint = new chocolateItems().setUnlocalizedName("mintLeaf").setTextureName("killerjdog51:MintLeaf").setCreativeTab(MainRegistry.tabChocolateMisc);
		CocoaDoorItem = new ItemCocoaDoor(Material.wood).setUnlocalizedName("doorCocoa").setTextureName("killerjdog51:door_Cocoa");
		ChocolateFeather = new chocolateItems().setUnlocalizedName("chocolateFeather").setTextureName("killerjdog51:chocolatefeather").setCreativeTab(MainRegistry.tabChocolateMisc);
		WarmChocolateBowl = new WarmBowlChocolateMilk(3, 0.5F, false).setUnlocalizedName("warmchocolatebowl").setContainerItem(net.minecraft.init.Items.bowl);

	}

	public static void registerItem() {

		GameRegistry.registerItem(ItemRegistry.bowlchocolatemilk, bowlchocolatemilk.getUnlocalizedName());
		GameRegistry.registerItem(ItemRegistry.bowlwhitechocolatemilk, bowlwhitechocolatemilk.getUnlocalizedName());
		GameRegistry.registerItem(ItemRegistry.bowldarkchocolatemilk, bowldarkchocolatemilk.getUnlocalizedName());
		GameRegistry.registerItem(ItemRegistry.bowllightchocolatemilk, bowllightchocolatemilk.getUnlocalizedName());
		GameRegistry.registerItem(ItemRegistry.fruitbits, fruitbits.getUnlocalizedName());
		GameRegistry.registerItem(ItemRegistry.lightchocolatelump, lightchocolatelump.getUnlocalizedName());
		GameRegistry.registerItem(ItemRegistry.bowlmilk, bowlmilk.getUnlocalizedName());
		GameRegistry.registerItem(ItemRegistry.rawchocolatelump, rawchocolatelump.getUnlocalizedName());
		GameRegistry.registerItem(ItemRegistry.ChocolatePortalPlacer, ChocolatePortalPlacer.getUnlocalizedName());
		GameRegistry.registerItem(ItemRegistry.chocolateIngots, chocolateIngots.getUnlocalizedName());
		GameRegistry.registerItem(ItemRegistry.chocolaterod, chocolaterod.getUnlocalizedName());
		GameRegistry.registerItem(ItemRegistry.mint, mint.getUnlocalizedName());
		GameRegistry.registerItem(ItemRegistry.CocoaDoorItem, CocoaDoorItem.getUnlocalizedName());
		GameRegistry.registerItem(ItemRegistry.ChocolateFeather, ChocolateFeather.getUnlocalizedName());
		GameRegistry.registerItem(ItemRegistry.WarmChocolateBowl, WarmChocolateBowl.getUnlocalizedName());

	}

}
