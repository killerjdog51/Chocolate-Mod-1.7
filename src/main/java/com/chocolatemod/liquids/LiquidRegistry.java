package com.chocolatemod.liquids;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidContainerRegistry;
import net.minecraftforge.fluids.FluidRegistry;

public class LiquidRegistry {

	public static void MainRegistry() {
		initializeLiquid();
	}

	public static Fluid chocolateMilkFluid = new Fluid("chocolateMilkFluid");
	public static Block chocolateMilkBlock;
	public static Item chocolateMilkBucket = new BucketChocolateMilk(chocolateMilkBlock);

	public static Fluid darkChocolateMilkFluid = new Fluid("darkChocolateMilkFluid");
	public static Block darkChocolateMilkBlock;
	public static Item darkChocolateMilkBucket = new BucketDarkChocolateMilk(darkChocolateMilkBlock);

	public static Fluid lightChocolateMilkFluid = new Fluid("lightChocolateMilkFluid");
	public static Block lightChocolateMilkBlock;
	public static Item lightChocolateMilkBucket = new BucketLightChocolateMilk(lightChocolateMilkBlock);

	public static Fluid whiteChocolateMilkFluid = new Fluid("whiteChocolateMilkFluid");
	public static Block whiteChocolateMilkBlock;
	public static Item whiteChocolateMilkBucket = new BucketWhiteChocolateMilk(whiteChocolateMilkBlock);

	public static Fluid caramelFluid = new Fluid("caramelFluid");
	public static Block moltenCaramelBlock;
	public static Item caramelBucket = new BucketMoltenCaramel(moltenCaramelBlock);

	public static void initializeLiquid() {

		//Chocolate Milk
		FluidRegistry.registerFluid(chocolateMilkFluid);
		chocolateMilkBlock = new BlockChocolateMilk(chocolateMilkFluid, Material.water).setBlockName("chocolateMilkBlock");
		GameRegistry.registerBlock(chocolateMilkBlock, chocolateMilkBlock.getUnlocalizedName().substring(5));
		chocolateMilkFluid.setUnlocalizedName(chocolateMilkBlock.getUnlocalizedName());

		chocolateMilkBucket.setUnlocalizedName("chocolateMilkBucket").setContainerItem(Items.bucket).setTextureName("killerjdog51:chocolatemilk").setCreativeTab(com.chocolatemod.main.MainRegistry.tabChocolateMisc);
		GameRegistry.registerItem(chocolateMilkBucket, "chocolateMilkBucket");
		FluidContainerRegistry.registerFluidContainer(chocolateMilkFluid, new ItemStack(chocolateMilkBucket), new ItemStack(Items.bucket));

		BucketHandler.INSTANCE.buckets.put(chocolateMilkBlock, chocolateMilkBucket);
		MinecraftForge.EVENT_BUS.register(BucketHandler.INSTANCE);

		//Dark Chocolate Milk
		FluidRegistry.registerFluid(darkChocolateMilkFluid);
		darkChocolateMilkBlock = new BlockDarkChocolateMilk(darkChocolateMilkFluid, Material.water).setBlockName("darkChocolateMilkBlock");
		GameRegistry.registerBlock(darkChocolateMilkBlock, darkChocolateMilkBlock.getUnlocalizedName().substring(5));
		darkChocolateMilkFluid.setUnlocalizedName(darkChocolateMilkBlock.getUnlocalizedName());

		darkChocolateMilkBucket.setUnlocalizedName("darkChocolateMilkBucket").setContainerItem(Items.bucket).setTextureName("killerjdog51:darkchocolatemilk").setCreativeTab(com.chocolatemod.main.MainRegistry.tabChocolateMisc);
		GameRegistry.registerItem(darkChocolateMilkBucket, "darkChocolateMilkBucket");
		FluidContainerRegistry.registerFluidContainer(darkChocolateMilkFluid, new ItemStack(darkChocolateMilkBucket), new ItemStack(Items.bucket));

		BucketHandler.INSTANCE.buckets.put(darkChocolateMilkBlock, darkChocolateMilkBucket);
		MinecraftForge.EVENT_BUS.register(BucketHandler.INSTANCE);

		//Light Chocolate Milk
		FluidRegistry.registerFluid(lightChocolateMilkFluid);
		lightChocolateMilkBlock = new BlockLightChocolateMilk(lightChocolateMilkFluid, Material.water).setBlockName("lightChocolateMilkBlock");
		GameRegistry.registerBlock(lightChocolateMilkBlock, lightChocolateMilkBlock.getUnlocalizedName().substring(5));
		lightChocolateMilkFluid.setUnlocalizedName(lightChocolateMilkBlock.getUnlocalizedName());

		lightChocolateMilkBucket.setUnlocalizedName("lightChocolateMilkBucket").setContainerItem(Items.bucket).setTextureName("killerjdog51:lightchocolatemilk").setCreativeTab(com.chocolatemod.main.MainRegistry.tabChocolateMisc);
		GameRegistry.registerItem(lightChocolateMilkBucket, "lightChocolateMilkBucket");
		FluidContainerRegistry.registerFluidContainer(lightChocolateMilkFluid, new ItemStack(lightChocolateMilkBucket), new ItemStack(Items.bucket));

		BucketHandler.INSTANCE.buckets.put(lightChocolateMilkBlock, lightChocolateMilkBucket);
		MinecraftForge.EVENT_BUS.register(BucketHandler.INSTANCE);

		//White Chocolate Milk
		FluidRegistry.registerFluid(whiteChocolateMilkFluid);
		whiteChocolateMilkBlock = new BlockWhiteChocolateMilk(whiteChocolateMilkFluid, Material.water).setBlockName("whiteChocolateMilkBlock");
		GameRegistry.registerBlock(whiteChocolateMilkBlock, whiteChocolateMilkBlock.getUnlocalizedName().substring(5));
		whiteChocolateMilkFluid.setUnlocalizedName(whiteChocolateMilkBlock.getUnlocalizedName());

		whiteChocolateMilkBucket.setUnlocalizedName("whiteChocolateMilkBucket").setContainerItem(Items.bucket).setTextureName("killerjdog51:whitechocolatemilk").setCreativeTab(com.chocolatemod.main.MainRegistry.tabChocolateMisc);
		GameRegistry.registerItem(whiteChocolateMilkBucket, "whiteChocolateMilkBucket");
		FluidContainerRegistry.registerFluidContainer(whiteChocolateMilkFluid, new ItemStack(whiteChocolateMilkBucket), new ItemStack(Items.bucket));

		BucketHandler.INSTANCE.buckets.put(whiteChocolateMilkBlock, whiteChocolateMilkBucket);
		MinecraftForge.EVENT_BUS.register(BucketHandler.INSTANCE);

		//Caramel

		FluidRegistry.registerFluid(caramelFluid);
		moltenCaramelBlock = new BlockMoltenCaramel(caramelFluid, Material.lava).setBlockName("caramelBlock");
		GameRegistry.registerBlock(moltenCaramelBlock, moltenCaramelBlock.getUnlocalizedName().substring(5));
		caramelFluid.setUnlocalizedName(moltenCaramelBlock.getUnlocalizedName());

		caramelBucket.setUnlocalizedName("caramelBucket").setContainerItem(Items.bucket).setTextureName("killerjdog51:bucket_caramel").setCreativeTab(com.chocolatemod.main.MainRegistry.tabChocolateMisc);
		GameRegistry.registerItem(caramelBucket, "caramelBucket");
		FluidContainerRegistry.registerFluidContainer(caramelFluid, new ItemStack(caramelBucket), new ItemStack(Items.bucket));

		BucketHandler.INSTANCE.buckets.put(moltenCaramelBlock, caramelBucket);
		MinecraftForge.EVENT_BUS.register(BucketHandler.INSTANCE);
	}
}
