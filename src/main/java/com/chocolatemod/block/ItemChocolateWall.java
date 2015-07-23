package com.chocolatemod.block;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemChocolateWall extends ItemBlock {

	public static final String[] field_94407_b = new String[]{"default", "dark", "light", "white", "cobble", "dark.cobble", "light.cobble", "white.cobble", "minty", "dark.minty", "light.minty", "white.minty", "caramel", "dark.caramel", "light.caramel", "white.caramel"};


	public ItemChocolateWall(Block block) {
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
