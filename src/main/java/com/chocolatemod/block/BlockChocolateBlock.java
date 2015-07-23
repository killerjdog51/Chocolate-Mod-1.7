package com.chocolatemod.block;

import com.chocolatemod.main.MainRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

import java.util.List;

public class BlockChocolateBlock extends Block {
	public static final String[] field_150142_a = new String[]{"default", "dark", "light", "white", "default.hard", "dark.hard", "light.hard", "white.hard", "default.nuts", "dark.nuts", "light.nuts", "white.nuts", "etched", "dark.etched", "light.etched", "white.etched"};
	public static final String[] field_150141_b = new String[]{null, "dark", "light", "white", "hard", "dark_hard", "light_hard", "white_hard", "nuts", "dark_nuts", "light_nuts", "white_nuts", "etched", "dark_etched", "light_etched", "white_etched"};
	@SideOnly(Side.CLIENT)
	private IIcon[] field_150143_M;
	private static final String __OBFID = "CL_00000318";

	public BlockChocolateBlock() {
		super(Material.rock);
		this.setCreativeTab(MainRegistry.tabChocolateBlocks);
	}

	/**
	 * Gets the block's texture. Args: side, meta
	 */
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
		for (int i = 0; i < 16; ++i) {
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
}