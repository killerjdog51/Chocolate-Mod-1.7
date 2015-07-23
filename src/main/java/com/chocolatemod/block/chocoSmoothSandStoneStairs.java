package com.chocolatemod.block;

import com.chocolatemod.main.MainRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;

public class chocoSmoothSandStoneStairs extends BlockStairs {

	protected chocoSmoothSandStoneStairs(Block par2Block, int par3) {
		super(BlockRegistry.chocoSandstone, 15);
		// TODO Auto-generated constructor stub
		this.setCreativeTab(MainRegistry.tabChocolateBlocks);
		this.setLightOpacity(0);
	}

}
