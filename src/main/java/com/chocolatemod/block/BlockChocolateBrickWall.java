package com.chocolatemod.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockWall;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

import java.util.List;

public class BlockChocolateBrickWall extends BlockWall {

	public static final String[] field_150142_a = new String[]{"default", "dark", "light", "white"};
	public static final String[] field_150141_b = new String[]{null, "dark", "light", "white"};
	@SideOnly(Side.CLIENT)
	private IIcon[] field_150143_M;

	private Block icon;

	public BlockChocolateBrickWall(Block block) {
		super(block);
		this.setStepSound(block.stepSound);
		this.icon = block;
	}

	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int p_149691_1_, int p_149691_2_) {
		if (p_149691_2_ < 0 || p_149691_2_ >= field_150141_b.length) {
			p_149691_2_ = 0;
		}

		return this.field_150143_M[p_149691_2_];
	}

	/**
	 * Determines the damage on the item the block drops. Used in cloth and wood.
	 */
	public int damageDropped(int p_149692_1_) {
		return p_149692_1_;
	}

	/**
	 * returns a list of blocks with the same ID, but different meta (eg: wood returns 4 blocks)
	 */
	@SideOnly(Side.CLIENT)
	public void getSubBlocks(Item p_149666_1_, CreativeTabs p_149666_2_, List p_149666_3_) {
		for (int i = 0; i < 4; ++i) {
			p_149666_3_.add(new ItemStack(p_149666_1_, 1, i));
		}
	}

	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister p_149651_1_) {
		this.field_150143_M = new IIcon[field_150141_b.length];

		for (int i = 0; i < this.field_150143_M.length; ++i) {
			String s = this.getTextureName();

			if (field_150141_b[i] != null) {
				s = s + "_" + field_150141_b[i];
			}

			this.field_150143_M[i] = p_149651_1_.registerIcon(s);
		}
	}

	@Override
	public boolean canPlaceTorchOnTop(World world, int x, int y, int z) {
		return true;
	}
}