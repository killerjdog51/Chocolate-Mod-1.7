package com.chocolatemod.block;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemChocoStone extends ItemBlock {

	public static final String[] field_94407_b = new String[]{"dark", "default", "light", "white", "dark.cobble", "cobble", "light.cobble", "white.cobble", "dark.minty", "minty", "light.minty", "white.minty", "dark.caramel", "caramel", "light.caramel", "white.caramel"};


	public ItemChocoStone(Block block) {
		super(block);
		this.setHasSubtypes(true);

	}

	public String getUnlocalizedName(ItemStack itemstack) {
		int i = itemstack.getItemDamage();
		if (i < 0 || i >= field_94407_b.length) {
			i = 0;
		}
		return super.getUnlocalizedName() + "." + field_94407_b[i];
	}

	public int getMetadata(int meta) {
		return meta;
	}

}
