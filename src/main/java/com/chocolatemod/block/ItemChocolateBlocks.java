package com.chocolatemod.block;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemChocolateBlocks extends ItemBlock{
	
    public static final String[] field_94407_b = new String[] {null, "dark", "light", "white", "hard", "dark_hard", "light_hard", "white_hard", "nuts", "dark_nuts", "light_nuts", "white_nuts", "etched", "dark_etched", "light_etched", "white_etched"};


	public ItemChocolateBlocks(Block block) {
		super(block);
		this.setHasSubtypes(true);
		
	}
	
	public String getUnlocalizedName(ItemStack itemstack){
		int i = itemstack.getItemDamage();
		if (i < 0 || i >= field_94407_b.length) {
			i = 0;
		}
		return super.getUnlocalizedName() + "." + field_94407_b[i];
	}
	
	public int getMetadata(int meta){
		return meta;
	}

}
