package com.chocolatemod.block;

import com.chocolatemod.main.MainRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;

public class whiteChocolateStairs extends BlockStairs {

	protected whiteChocolateStairs(Block par2Block, int par3) {
		super(BlockRegistry.chocolateblock, 7);
		// TODO Auto-generated constructor stub
		this.setCreativeTab(MainRegistry.tabChocolateBlocks);
		this.setLightOpacity(0);
	}

}
