package com.chocolatemod.plants;

import com.chocolatemod.item.ItemRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import java.util.Random;

public class BlockCocoaPod extends Block {

	protected BlockCocoaPod() {
		super(Material.gourd);
		this.setCreativeTab(CreativeTabs.tabDecorations);
		// TODO Auto-generated constructor stub
	}

	public void setBlockBoundsBasedOnState(IBlockAccess par1IBlockAccess, int x, int y, int z) {
		int l = par1IBlockAccess.getBlockMetadata(x, y, z);

		this.setBlockBounds(0.25F, 0.2F, 0.25F, 0.75F, 1.0F, 0.75F);
	}

	public void setBlockBoundsForItemRender() {
		this.setBlockBounds(0.25F, 0.2F, 0.25F, 0.75F, 1.0F, 0.75F);
	}

	public AxisAlignedBB getCollisionBoundingBoxFromPool(World par1World, int par2, int par3, int par4) {
		int l = par1World.getBlockMetadata(par2, par3, par4);
		return AxisAlignedBB.getBoundingBox((double) (0.25F), (double) 0.2F, (double) 0.25F, (double) 0.75F, (double) 1.0F, (double) 0.75F);
	}

	public boolean renderAsNormalBlock() {
		return false;
	}

	@SideOnly(Side.CLIENT)

	/**
	 * Returns the bounding box of the wired rectangular prism to render.
	 */
	public AxisAlignedBB getSelectedBoundingBoxFromPool(World par1World, int par2, int par3, int par4) {
		int l = par1World.getBlockMetadata(par2, par3, par4);
		return AxisAlignedBB.getBoundingBox((double) (0.25F), (double) 0.2F, (double) 0.25F, (double) 0.75F, (double) 1.0F, (double) 0.75F);
	}

	public boolean isOpaqueCube() {
		return false;
	}

	public boolean canPlaceBlockAt(World par1World, int par2, int par3, int par4) {
		return !super.canPlaceBlockAt(par1World, par2, par3, par4) ? false : this.canBlockStay(par1World, par2, par3, par4);
	}

	public void onNeighborBlockChange(World par1World, int par2, int par3, int par4, int par5) {
		if (!this.canBlockStay(par1World, par2, par3, par4)) {
			par1World.setBlockToAir(par2, par3, par4);
		}
	}

	public int quantityDroppedWithBonus(int p_149679_1_, Random p_149679_2_) {
		return MathHelper.clamp_int(this.quantityDropped(p_149679_2_) + p_149679_2_.nextInt(p_149679_1_ + 1), 1, 4);
	}

	public int quantityDropped(Random p_149745_1_) {
		return 3 + p_149745_1_.nextInt(3);
	}

	public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_) {
		return ItemRegistry.rawchocolatelump;
	}

	protected boolean canSilkHarvest() {
		return true;
	}

}
