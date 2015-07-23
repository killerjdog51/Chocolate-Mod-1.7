package com.chocolatemod.armor;

import com.chocolatemod.main.MainRegistry;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ArmorRegistry {
	
	public static ArmorMaterial ChocolateArmor = EnumHelper.addArmorMaterial("ChocolateArmor", 15, new int[]{2, 7, 6, 2}, 9);
	public static ArmorMaterial DarkChocolateArmor = EnumHelper.addArmorMaterial("DarkChocolateArmor", 16, new int[]{3, 7, 6, 3}, 9);
	public static ArmorMaterial LightChocolateArmor = EnumHelper.addArmorMaterial("LightChocolateArmor", 17, new int[]{2, 5, 4, 2}, 9);
	public static ArmorMaterial WhiteChocolateArmor = EnumHelper.addArmorMaterial("WhiteChocolateArmor", 18, new int[]{1, 5, 4, 1}, 9);

	public static void mainRegistry(){
		initialiseItem();
		registerItem();
	}
	public static Item ChocolateHelmet;
	public static Item ChocolateChestplate;
	public static Item ChocolateLeggings;
	public static Item ChocolateBoots;
	public static Item DarkChocolateHelmet;
	public static Item DarkChocolateChestplate;
	public static Item DarkChocolateLeggings;
	public static Item DarkChocolateBoots;
	public static Item LightChocolateHelmet;
	public static Item LightChocolateChestplate;
	public static Item LightChocolateLeggings;
	public static Item LightChocolateBoots;
	public static Item WhiteChocolateHelmet;
	public static Item WhiteChocolateChestplate;
	public static Item WhiteChocolateLeggings;
	public static Item WhiteChocolateBoots;
	
	public static void initialiseItem(){
		ChocolateHelmet = new ChocolateArmor(ChocolateArmor, 5, 0).setUnlocalizedName("ChocolateHelmet").setCreativeTab(MainRegistry.tabChocolateCombat).setTextureName("killerjdog51:helmetChocolate");
		ChocolateChestplate = new ChocolateArmor(ChocolateArmor, 5, 1).setUnlocalizedName("ChocolateChestplate").setCreativeTab(MainRegistry.tabChocolateCombat).setTextureName("killerjdog51:chestplateChocolate");
		ChocolateLeggings = new ChocolateArmor( ChocolateArmor, 5, 2).setUnlocalizedName("ChocolateLeggings").setCreativeTab(MainRegistry.tabChocolateCombat).setTextureName("killerjdog51:leggingsChocolate");
		ChocolateBoots = new ChocolateArmor(ChocolateArmor, 5, 3).setUnlocalizedName("ChocolateBoots").setCreativeTab(MainRegistry.tabChocolateCombat).setTextureName("killerjdog51:bootsChocolate");
		DarkChocolateHelmet = new DarkChocolateArmor(DarkChocolateArmor, 5, 0).setUnlocalizedName("DarkChocolateHelmet").setCreativeTab(MainRegistry.tabChocolateCombat).setTextureName("killerjdog51:helmetDarkChocolate");
		DarkChocolateChestplate = new DarkChocolateArmor(DarkChocolateArmor, 5, 1).setUnlocalizedName("DarkChocolateChestplate").setCreativeTab(MainRegistry.tabChocolateCombat).setTextureName("killerjdog51:chestplateDarkChocolate");
		DarkChocolateLeggings = new DarkChocolateArmor(DarkChocolateArmor, 5, 2).setUnlocalizedName("DarkChocolateLeggings").setCreativeTab(MainRegistry.tabChocolateCombat).setTextureName("killerjdog51:leggingsDarkChocolate");
		DarkChocolateBoots = new DarkChocolateArmor(DarkChocolateArmor, 5, 3).setUnlocalizedName("DarkChocolateBoots").setCreativeTab(MainRegistry.tabChocolateCombat).setTextureName("killerjdog51:bootsDarkChocolate");
		LightChocolateHelmet = new LightChocolateArmor(LightChocolateArmor, 5, 0).setUnlocalizedName("LightChocolateHelmet").setCreativeTab(MainRegistry.tabChocolateCombat).setTextureName("killerjdog51:helmetLightChocolate");
		LightChocolateChestplate = new LightChocolateArmor(LightChocolateArmor, 5, 1).setUnlocalizedName("LightChocolateChestplate").setCreativeTab(MainRegistry.tabChocolateCombat).setTextureName("killerjdog51:chestplateLightChocolate");
		LightChocolateLeggings = new LightChocolateArmor(LightChocolateArmor, 5, 2).setUnlocalizedName("LightChocolateLeggings").setCreativeTab(MainRegistry.tabChocolateCombat).setTextureName("killerjdog51:leggingsLightChocolate");
		LightChocolateBoots = new LightChocolateArmor(LightChocolateArmor, 5, 3).setUnlocalizedName("LightChocolateBoots").setCreativeTab(MainRegistry.tabChocolateCombat).setTextureName("killerjdog51:bootsLightChocolate");
		WhiteChocolateHelmet = new WhiteChocolateArmor(WhiteChocolateArmor, 5, 0).setUnlocalizedName("WhiteChocolateHelmet").setCreativeTab(MainRegistry.tabChocolateCombat).setTextureName("killerjdog51:helmetWhiteChocolate");
		WhiteChocolateChestplate = new WhiteChocolateArmor(WhiteChocolateArmor, 5, 1).setUnlocalizedName("WhiteChocolateChestplate").setCreativeTab(MainRegistry.tabChocolateCombat).setTextureName("killerjdog51:chestplateWhiteChocolate");
		WhiteChocolateLeggings = new WhiteChocolateArmor( WhiteChocolateArmor, 5, 2).setUnlocalizedName("WhiteChocolateLeggings").setCreativeTab(MainRegistry.tabChocolateCombat).setTextureName("killerjdog51:leggingsWhiteChocolate");
		WhiteChocolateBoots = new WhiteChocolateArmor(WhiteChocolateArmor, 5, 3).setUnlocalizedName("WhiteChocolateBoots").setCreativeTab(MainRegistry.tabChocolateCombat).setTextureName("killerjdog51:bootsWhiteChocolate");
		
	}

	public static void registerItem(){
		GameRegistry.registerItem(ArmorRegistry.ChocolateHelmet, ChocolateHelmet.getUnlocalizedName());
		GameRegistry.registerItem(ArmorRegistry.ChocolateChestplate, ChocolateChestplate.getUnlocalizedName());
		GameRegistry.registerItem(ArmorRegistry.ChocolateLeggings, ChocolateLeggings.getUnlocalizedName());
		GameRegistry.registerItem(ArmorRegistry.ChocolateBoots, ChocolateBoots.getUnlocalizedName());
		GameRegistry.registerItem(ArmorRegistry.DarkChocolateHelmet, DarkChocolateHelmet.getUnlocalizedName());
		GameRegistry.registerItem(ArmorRegistry.DarkChocolateChestplate, DarkChocolateChestplate.getUnlocalizedName());
		GameRegistry.registerItem(ArmorRegistry.DarkChocolateLeggings, DarkChocolateLeggings.getUnlocalizedName());
		GameRegistry.registerItem(ArmorRegistry.DarkChocolateBoots, DarkChocolateBoots.getUnlocalizedName());
		GameRegistry.registerItem(ArmorRegistry.LightChocolateHelmet, LightChocolateHelmet.getUnlocalizedName());
		GameRegistry.registerItem(ArmorRegistry.LightChocolateChestplate, LightChocolateChestplate.getUnlocalizedName());
		GameRegistry.registerItem(ArmorRegistry.LightChocolateLeggings, LightChocolateLeggings.getUnlocalizedName());
		GameRegistry.registerItem(ArmorRegistry.LightChocolateBoots, LightChocolateBoots.getUnlocalizedName());
		GameRegistry.registerItem(ArmorRegistry.WhiteChocolateHelmet, WhiteChocolateHelmet.getUnlocalizedName());
		GameRegistry.registerItem(ArmorRegistry.WhiteChocolateChestplate, WhiteChocolateChestplate.getUnlocalizedName());
		GameRegistry.registerItem(ArmorRegistry.WhiteChocolateLeggings, WhiteChocolateLeggings.getUnlocalizedName());
		GameRegistry.registerItem(ArmorRegistry.WhiteChocolateBoots, WhiteChocolateBoots.getUnlocalizedName());
	}


}
