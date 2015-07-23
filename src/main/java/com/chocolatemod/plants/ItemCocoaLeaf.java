package com.chocolatemod.plants;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemBlockWithMetadata;
import net.minecraft.item.ItemStack;

public class ItemCocoaLeaf extends ItemBlock{
	
    public static final String[] field_94407_b = new String[] {"chocolate", "dark", "light", "white"};


	public ItemCocoaLeaf(Block block) {
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
