package com.chocolatemod.block;

import com.chocolatemod.main.MainRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;

public class BlockChocoDirt extends Block {
	@SideOnly(Side.CLIENT)
	private IIcon field_150008_b;
	@SideOnly(Side.CLIENT)
	private IIcon field_150010_M;
	private static final String __OBFID = "CL_00000228";

	protected BlockChocoDirt() {
		super(Material.ground);
		this.setCreativeTab(MainRegistry.tabChocolateBlocks);
	}

	/**
	 * Gets the block's texture. Args: side, meta
	 */


	/**
	 * Determines the damage on the item the block drops. Used in cloth and wood.
	 */


	@SideOnly(Side.CLIENT)
	public IIcon getIcon(IBlockAccess p_149673_1_, int p_149673_2_, int p_149673_3_, int p_149673_4_, int p_149673_5_) {
		int i1 = p_149673_1_.getBlockMetadata(p_149673_2_, p_149673_3_, p_149673_4_);

		if (i1 == 2) {
			if (p_149673_5_ == 1) {
				return this.field_150008_b;
			}

			if (p_149673_5_ != 0) {
				Material material = p_149673_1_.getBlock(p_149673_2_, p_149673_3_ + 1, p_149673_4_).getMaterial();

				if (material == Material.snow || material == Material.craftedSnow) {
					return BlockRegistry.chocoGrass.getIcon(p_149673_1_, p_149673_2_, p_149673_3_, p_149673_4_, p_149673_5_);
				}

				Block block = p_149673_1_.getBlock(p_149673_2_, p_149673_3_ + 1, p_149673_4_);

				if (block != BlockRegistry.chocoDirt && block != BlockRegistry.chocoGrass) {
					return this.field_150010_M;
				}
			}
		}

		return this.blockIcon;
	}

	/**
	 * Returns an item stack containing a single instance of the current block type. 'i' is the block's subtype/damage
	 * and is ignored for blocks which do not support subtypes. Blocks which cannot be harvested should return null.
	 */


	/**
	 * returns a list of blocks with the same ID, but different meta (eg: wood returns 4 blocks)
	 */


	/**
	 * Get the block's damage value (for use with pick block).
	 */

}