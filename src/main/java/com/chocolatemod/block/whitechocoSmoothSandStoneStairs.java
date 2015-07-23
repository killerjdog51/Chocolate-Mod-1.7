package com.chocolatemod.block;

import com.chocolatemod.main.MainRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;

public class whitechocoSmoothSandStoneStairs extends BlockStairs {

	protected whitechocoSmoothSandStoneStairs(Block par2Block, int par3) {
		super(BlockRegistry.chocoSandstone, 3);
		// TODO Auto-generated constructor stub
		this.setCreativeTab(MainRegistry.tabChocolateBlocks);
		this.setLightOpacity(0);
	}

}
