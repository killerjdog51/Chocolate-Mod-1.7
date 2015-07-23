package com.chocolatemod.block;

import com.chocolatemod.main.MainRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;

public class lightchocoSmoothSandStoneStairs extends BlockStairs {

	protected lightchocoSmoothSandStoneStairs(Block par2Block, int par3) {
		super(BlockRegistry.chocoSandstone, 11);
		// TODO Auto-generated constructor stub
		this.setCreativeTab(MainRegistry.tabChocolateBlocks);
		this.setLightOpacity(0);
	}

}
