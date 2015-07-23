package com.chocolatemod.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLiving;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import java.util.List;
import java.util.Random;

public class BlockwhitechocoCobbleStoneSlab extends BlockSlab {
	public static final String[] woodType = {"whitechocoCobbleStone"};

	public BlockwhitechocoCobbleStoneSlab(boolean par2) {
		super(par2, Material.wood);
		this.useNeighborBrightness = true;
	}

	public void registerIcons(IIconRegister reg) {
		this.blockIcon = reg.registerIcon("killerjdog51:chocostone_white_cobble");
	}

	public Block idDropped(int par1, Random par2Random, int par3) {
		return BlockRegistry.whitechocoCobbleStoneSlabsingle;
	}

	public void onBlockPlacedBy(World par1World, int par2, int par3, int par4, EntityLiving par5EntityLiving) {
		if (par1World.getBlock(par2, par3 - 1, par4) == BlockRegistry.whitechocoCobbleStoneSlabsingle) {
			par1World.setBlock(par2, par3, par4, null, 0, par4);
			par1World.setBlock(par2, par3 - 1, par4, BlockRegistry.whitechocoCobbleStoneSlabdouble);
		}
		if (par1World.getBlock(par2, par3 + 1, par4) == BlockRegistry.whitechocoCobbleStoneSlabsingle) {
			par1World.setBlock(par2, par3, par4, null, 0, par4);
			par1World.setBlock(par2, par3 + 1, par4, BlockRegistry.whitechocoCobbleStoneSlabdouble);
		}
	}

	protected ItemStack createStackedBlock(int par1) {
		return new ItemStack(BlockRegistry.whitechocoCobbleStoneSlabsingle, 2, par1 & 7);
	}

	public String getFullSlabName(int par1) {
		if ((par1 < 0) || (par1 >= woodType.length)) {
			par1 = 0;
		}

		return super.getUnlocalizedName() + "." + woodType[par1];
	}

	public void getSubBlocks(Block par1, CreativeTabs par2CreativeTabs, List par3List) {
		if (par1 != BlockRegistry.whitechocoCobbleStoneSlabdouble) {
			par3List.add(new ItemStack(par1, 1, 0));
		}
	}

	@Override
	public String func_150002_b(int var1) {
		// TODO Auto-generated method stub
		return null;
	}

}