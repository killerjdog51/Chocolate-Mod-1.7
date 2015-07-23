package com.chocolatemod.main;

import com.chocolatemod.armor.ArmorRegistry;
import com.chocolatemod.block.BlockRegistry;
import com.chocolatemod.brewing.brewing;
import com.chocolatemod.crops.crops;
import com.chocolatemod.event.mobdrops;
import com.chocolatemod.food.FoodRegistry;
import com.chocolatemod.item.ItemRegistry;
import com.chocolatemod.lib.Strings;
import com.chocolatemod.liquids.LiquidRegistry;
import com.chocolatemod.mobs.MobRegistry;
import com.chocolatemod.plants.PlantRegistry;
import com.chocolatemod.tools.Tools;
import com.chocolatemod.worldgen.WorldGenRegistry;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;


@Mod(modid = Strings.MODID, name = Strings.name, version = Strings.VERSION)

public class MainRegistry {

	@SidedProxy(clientSide = "com.chocolatemod.main.ClientProxy", serverSide = "com.chocolatemod.main.CommonProxy")
	public static CommonProxy proxy;

	@Instance(Strings.MODID)
	public static MainRegistry modInstance;

	//CreativeTab

	public static CreativeTabs tabChocolateFood = new CreativeTabs("tabChocolateFood") {
		public ItemStack getIconItemStack() {
			return new ItemStack(FoodRegistry.chocolatebar1, 1, 0);
		}

		@Override
		public Item getTabIconItem() {
			// TODO Auto-generated method stub
			return null;
		}
	};


	public static CreativeTabs tabChocolateBlocks = new CreativeTabs("tabChocolateBlocks") {
		public ItemStack getIconItemStack() {
			return new ItemStack(BlockRegistry.chocolateblock, 1, 0);
		}

		@Override
		public Item getTabIconItem() {
			// TODO Auto-generated method stub
			return null;
		}
	};

	public static CreativeTabs tabChocolateTools = new CreativeTabs("tabChocolateTools") {
		public ItemStack getIconItemStack() {
			return new ItemStack(Tools.ChocolatePickaxe, 1, 0);
		}

		@Override
		public Item getTabIconItem() {
			// TODO Auto-generated method stub
			return null;
		}
	};

	public static CreativeTabs tabChocolateCombat = new CreativeTabs("tabChocolateCombat") {
		public ItemStack getIconItemStack() {
			return new ItemStack(Tools.ChocolateSword, 1, 0);
		}

		@Override
		public Item getTabIconItem() {
			// TODO Auto-generated method stub
			return null;
		}
	};

	public static CreativeTabs tabChocolateMisc = new CreativeTabs("tabChocolateMisc") {
		public ItemStack getIconItemStack() {
			return new ItemStack(LiquidRegistry.chocolateMilkBucket, 1, 0);
		}

		@Override
		public Item getTabIconItem() {
			// TODO Auto-generated method stub
			return null;
		}
	};

	@EventHandler
	public static void PreLoad(FMLPreInitializationEvent PreEvent) {
		WorldGenRegistry.init();
		ItemRegistry.mainRegistry();
		BlockRegistry.mainRegistry();
		WorldGenRegistry.initialise();
		FoodRegistry.mainRegistry();
		Tools.mainRegistry();
		brewing.mainRegistry();
		crops.mainRegistry();
		PlantRegistry.mainRegistry();
		MobRegistry.mainRegistry();
		ArmorRegistry.mainRegistry();
		LiquidRegistry.MainRegistry();
		proxy.registerRenderers();

		MinecraftForge.EVENT_BUS.register(new mobdrops());


	}


	@EventHandler
	public static void load(FMLInitializationEvent event) {

	}

	@EventHandler
	public static void PostLoad(FMLPostInitializationEvent PostEvent) {

	}

}
