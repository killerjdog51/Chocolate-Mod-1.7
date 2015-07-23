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

public class BlockChocolateSandStone extends Block {
	public static final String[] field_150157_a = new String[]{"white.default", "white.carved", "white.chiseled", "white.smooth", "dark.default", "dark.carved", "dark.chiseled", "dark.smooth", "light.default", "light.carved", "light.chiseled", "light.smooth", "default", "carved", "chiseled", "smooth"};
	private static final String[] field_150156_b = new String[]{"normal", "carved", "chiseled", "smooth", "normal", "carved", "chiseled", "smooth", "normal", "carved", "chiseled", "smooth", "normal", "carved", "chiseled", "smooth"};
	private static final String[] field_150156_c = new String[]{"white", "white", "white", "white", "dark", "dark", "dark", "dark", "light", "light", "light", "light", "default", "default", "default", "default"};
	private static final String[] field_150156_d = new String[]{"white", "dark", "light", "default"};
	@SideOnly(Side.CLIENT)
	private IIcon[] field_150158_M;
	@SideOnly(Side.CLIENT)
	private IIcon field_150159_N;
	@SideOnly(Side.CLIENT)
	private IIcon field_150160_O;
	//dark top/bottom
	@SideOnly(Side.CLIENT)
	private IIcon field_150159_P;
	@SideOnly(Side.CLIENT)
	private IIcon field_150160_Q;
	//light top/bottom
	@SideOnly(Side.CLIENT)
	private IIcon field_150159_F;
	@SideOnly(Side.CLIENT)
	private IIcon field_150160_G;
	//white top/bottom
	@SideOnly(Side.CLIENT)
	private IIcon field_150159_R;
	@SideOnly(Side.CLIENT)
	private IIcon field_150160_C;
	private static final String __OBFID = "CL_00000304";

	public BlockChocolateSandStone() {
		super(Material.rock);
		this.setCreativeTab(MainRegistry.tabChocolateBlocks);
	}

	/**
	 * Gets the block's texture. Args: side, meta
	 */
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int p_149691_1_, int p_149691_2_) {
		if (p_149691_1_ != 1 && (p_149691_1_ != 0 || p_149691_2_ != 1 && p_149691_2_ != 2)) {
			if (p_149691_1_ == 0) {
				return p_149691_2_ < 4 && (p_149691_1_ == 1 || p_149691_1_ == 0) ? this.field_150160_C : p_149691_2_ < 8 && (p_149691_1_ == 1 || p_149691_1_ == 0) ? this.field_150160_Q : p_149691_2_ < 12 && (p_149691_1_ == 1 || p_149691_1_ == 0) ? this.field_150160_G : this.field_150160_O;
			} else {
				if (p_149691_2_ < 0 || p_149691_2_ >= this.field_150158_M.length) {
					p_149691_2_ = 0;
				}

				return this.field_150158_M[p_149691_2_];
			}
		} else {
			return p_149691_2_ < 4 && (p_149691_1_ == 1 || p_149691_1_ == 0) ? this.field_150159_R : p_149691_2_ < 8 && (p_149691_1_ == 1 || p_149691_1_ == 0) ? this.field_150159_P : p_149691_2_ < 12 && (p_149691_1_ == 1 || p_149691_1_ == 0) ? this.field_150159_F : this.field_150159_N;
		}
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
		p_149666_3_.add(new ItemStack(p_149666_1_, 1, 0));
		p_149666_3_.add(new ItemStack(p_149666_1_, 1, 1));
		p_149666_3_.add(new ItemStack(p_149666_1_, 1, 2));
		p_149666_3_.add(new ItemStack(p_149666_1_, 1, 3));
		p_149666_3_.add(new ItemStack(p_149666_1_, 1, 4));
		p_149666_3_.add(new ItemStack(p_149666_1_, 1, 5));
		p_149666_3_.add(new ItemStack(p_149666_1_, 1, 6));
		p_149666_3_.add(new ItemStack(p_149666_1_, 1, 7));
		p_149666_3_.add(new ItemStack(p_149666_1_, 1, 8));
		p_149666_3_.add(new ItemStack(p_149666_1_, 1, 9));
		p_149666_3_.add(new ItemStack(p_149666_1_, 1, 10));
		p_149666_3_.add(new ItemStack(p_149666_1_, 1, 11));
		p_149666_3_.add(new ItemStack(p_149666_1_, 1, 12));
		p_149666_3_.add(new ItemStack(p_149666_1_, 1, 13));
		p_149666_3_.add(new ItemStack(p_149666_1_, 1, 14));
		p_149666_3_.add(new ItemStack(p_149666_1_, 1, 15));

	}

	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister p_149651_1_) {
		this.field_150158_M = new IIcon[field_150156_b.length];

		for (int i = 0; i < this.field_150158_M.length; ++i) {
			this.field_150158_M[i] = p_149651_1_.registerIcon(this.getTextureName() + "_" + field_150156_c[i] + "_" + field_150156_b[i]);
		}

		this.field_150159_N = p_149651_1_.registerIcon(this.getTextureName() + "_default_top");
		this.field_150160_O = p_149651_1_.registerIcon(this.getTextureName() + "_default_bottom");

		this.field_150159_P = p_149651_1_.registerIcon(this.getTextureName() + "_dark_top");
		this.field_150160_Q = p_149651_1_.registerIcon(this.getTextureName() + "_dark_bottom");

		this.field_150159_F = p_149651_1_.registerIcon(this.getTextureName() + "_light_top");
		this.field_150160_G = p_149651_1_.registerIcon(this.getTextureName() + "_light_bottom");

		this.field_150159_R = p_149651_1_.registerIcon(this.getTextureName() + "_white_top");
		this.field_150160_C = p_149651_1_.registerIcon(this.getTextureName() + "_white_bottom");


	}
}