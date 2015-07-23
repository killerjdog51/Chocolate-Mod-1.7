package com.chocolatemod.block;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemMintyChocolateBlocks extends ItemBlock{
	
    public static final String[] field_94407_b = new String[] {null, "dark", "light", "white", "fruit", "dark_fruit", "light_fruit", "white_fruit", "nuts", "dark_nuts", "light_nuts", "white_nuts", "fruit_nuts", "dark_fruit_nuts", "light_fruit_nuts", "white_fruit_nuts"};


	public ItemMintyChocolateBlocks(Block block) {
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
