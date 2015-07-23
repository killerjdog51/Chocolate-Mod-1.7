package com.chocolatemod.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import java.util.Random;

public class BlockBarMould extends Block {
	@SideOnly(Side.CLIENT)
	private IIcon cakeTopIcon;
	@SideOnly(Side.CLIENT)
	private IIcon cakeBottomIcon;
	@SideOnly(Side.CLIENT)
	private IIcon field_94382_c;

	protected BlockBarMould() {
		super(Material.rock);
		this.setTickRandomly(true);
	}

	/**
	 * Updates the blocks bounds based on its current state. Args: world, x, y, z
	 */
	public void setBlockBoundsBasedOnState(IBlockAccess par1IBlockAccess, int par2, int par3, int par4) {
		int l = par1IBlockAccess.getBlockMetadata(par2, par3, par4);
		float f = 0.0625F;
		float f1 = (float) (1 + l * 2) / 16.0F;
		float f2 = 0.5F;
		this.setBlockBounds(f1, 0.0F, f, 1.0F - f, f2, 1.0F - f);
	}

	/**
	 * Sets the block's bounds for rendering it as an item
	 */
	public void setBlockBoundsForItemRender() {
		float f = 0.0625F;
		float f1 = 0.5F;
		this.setBlockBounds(f, 0.0F, f, 1.0F - f, f1, 1.0F - f);
	}

	/**
	 * Returns a bounding box from the pool of bounding boxes (this means this box can change after the pool has been
	 * cleared to be reused)
	 */
	public AxisAlignedBB getCollisionBoundingBoxFromPool(World par1World, int par2, int par3, int par4) {
		int l = par1World.getBlockMetadata(par2, par3, par4);
		float f = 0.0625F;
		float f1 = (float) (1 + l * 2) / 16.0F;
		float f2 = 0.5F;
		return AxisAlignedBB.getBoundingBox((double) ((float) par2 + f1), (double) par3, (double) ((float) par4 + f), (double) ((float) (par2 + 1) - f), (double) ((float) par3 + f2 - f), (double) ((float) (par4 + 1) - f));
	}

	/**
	 * If this block doesn't render as an ordinary block it will return False (examples: signs, buttons, stairs, etc)
	 */
	public boolean renderAsNormalBlock() {
		return false;
	}

	@SideOnly(Side.CLIENT)

	/**
	 * Returns the bounding box of the wired rectangular prism to render.
	 */
	public AxisAlignedBB getSelectedBoundingBoxFromPool(World par1World, int par2, int par3, int par4) {
		int l = par1World.getBlockMetadata(par2, par3, par4);
		float f = 0.0625F;
		float f1 = (float) (1 + l * 2) / 16.0F;
		float f2 = 0.5F;
		return AxisAlignedBB.getBoundingBox((double) ((float) par2 + f1), (double) par3, (double) ((float) par4 + f), (double) ((float) (par2 + 1) - f), (double) ((float) par3 + f2), (double) ((float) (par4 + 1) - f));
	}

	@SideOnly(Side.CLIENT)

	/**
	 * From the specified side and block metadata retrieves the blocks texture. Args: side, metadata
	 */
	public IIcon getIcon(int par1, int par2) {
		return par1 == 1 ? this.cakeTopIcon : (par1 == 0 ? this.cakeBottomIcon : (par2 > 0 && par1 == 4 ? this.field_94382_c : this.blockIcon));
	}

	@SideOnly(Side.CLIENT)

	/**
	 * When this method is called, your block should register all the icons it needs with the given IconRegister. This
	 * is the only chance you get to register icons.
	 */
	public void registerBlockIcons(IIconRegister par1IconRegister) {
		this.blockIcon = par1IconRegister.registerIcon("minecraft:furnace_side");
		this.cakeTopIcon = par1IconRegister.registerIcon("killerjdog51:ChocolateBarMould_top");
		this.cakeBottomIcon = par1IconRegister.registerIcon("minecraft:furnace_top");
	}

	/**
	 * Is this block (a) opaque and (b) a full 1m cube?  This determines whether or not to render the shared face of two
	 * adjacent blocks and also whether the player can attach torches, redstone wire, etc to this block.
	 */
	public boolean isOpaqueCube() {
		return false;
	}

	/**
	 * Called upon block activation (right click on the block.)
	 */


	/**
	 * Called when the block is clicked by a player. Args: x, y, z, entityPlayer
	 */


	/**
	 * Heals the player and removes a slice from the cake.
	 */


	/**
	 * Checks to see if its valid to put this block at the specified coordinates. Args: world, x, y, z
	 */
	public boolean canPlaceBlockAt(World par1World, int par2, int par3, int par4) {
		return !super.canPlaceBlockAt(par1World, par2, par3, par4) ? false : this.canBlockStay(par1World, par2, par3, par4);
	}

	/**
	 * Lets the block know when one of its neighbor changes. Doesn't know which neighbor changed (coordinates passed are
	 * their own) Args: x, y, z, neighbor blockID
	 */
	public void onNeighborBlockChange(World par1World, int par2, int par3, int par4, int par5) {
		if (!this.canBlockStay(par1World, par2, par3, par4)) {
			par1World.setBlockToAir(par2, par3, par4);
		}
	}

	/**
	 * Can this block stay at this position.  Similar to canPlaceBlockAt except gets checked often with plants.
	 */

	/**
	 * Returns the quantity of items to drop on block destruction.
	 */
	public int quantityDropped(Random par1Random) {
		return 1;
	}

	/**
	 * Returns the ID of the items to drop on destruction.
	 */
	public Block idDropped(int par1, Random par2Random, int par3) {
		return this;
	}


	/**
	 * only called by clickMiddleMouseButton , and passed to inventory.setCurrentItem (along with isCreative)
	 */

}
