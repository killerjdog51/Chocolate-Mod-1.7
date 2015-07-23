package com.chocolatemod.block;

import com.chocolatemod.main.MainRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;

public class lightChocolateBrickStairs extends BlockStairs {

	protected lightChocolateBrickStairs(Block par2Block, int par3) {
		super(BlockRegistry.chocolatebrick, 2);
		// TODO Auto-generated constructor stub
		this.setCreativeTab(MainRegistry.tabChocolateBlocks);
		this.setLightOpacity(0);
	}

}
