package com.chocolatemod.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLiving;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

import java.util.List;
import java.util.Random;

public class BlockWhiteChocolateSlab extends BlockSlab {
	public static final String[] woodType = {"killerjdog51:whitechocolateslab_side"};

	@SideOnly(Side.CLIENT)
	private IIcon field_150007_M;

	public BlockWhiteChocolateSlab(boolean par2) {
		super(par2, Material.rock);
		this.useNeighborBrightness = true;

	}

	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister p_149651_1_) {
		this.blockIcon = p_149651_1_.registerIcon("killerjdog51:whitechocolateslab_side");
		this.field_150007_M = p_149651_1_.registerIcon("killerjdog51:whitechocolateslab_top");
	}

	public IIcon getIcon(int par1, int par2) {
		int k = par2 & 7;

		if (this.field_150004_a && (par2 & 2) != 0) {
			par1 = 1;
		}

		return par1 == 1 ? this.field_150007_M : (par1 == 0 ? this.field_150007_M : this.blockIcon);
	}

	public Block idDropped(int par1, Random par2Random, int par3) {
		return BlockRegistry.whitechocolatesingle;
	}

	public void onBlockPlacedBy(World par1World, int par2, int par3, int par4, EntityLiving par5EntityLiving) {
		if (par1World.getBlock(par2, par3 - 1, par4) == BlockRegistry.whitechocolatesingle) {
			par1World.setBlock(par2, par3, par4, null, 0, par4);
			par1World.setBlock(par2, par3 - 1, par4, BlockRegistry.whitechocolatedouble);
		}
		if (par1World.getBlock(par2, par3 + 1, par4) == BlockRegistry.whitechocolatesingle) {
			par1World.setBlock(par2, par3, par4, null, 0, par4);
			par1World.setBlock(par2, par3 + 1, par4, BlockRegistry.whitechocolatedouble);
		}
	}

	protected ItemStack createStackedBlock(int par1) {
		return new ItemStack(BlockRegistry.whitechocolatesingle, 2, par1 & 7);
	}

	public String getFullSlabName(int par1) {
		if ((par1 < 0) || (par1 >= woodType.length)) {
			par1 = 0;
		}

		return super.getUnlocalizedName() + "." + woodType[par1];
	}

	public void getSubBlocks(Block par1, CreativeTabs par2CreativeTabs, List par3List) {
		if (par1 != BlockRegistry.whitechocolatedouble) {
			par3List.add(new ItemStack(par1, 1, 0));
		}
	}

	@Override
	public String func_150002_b(int var1) {
		// TODO Auto-generated method stub
		return null;
	}

}