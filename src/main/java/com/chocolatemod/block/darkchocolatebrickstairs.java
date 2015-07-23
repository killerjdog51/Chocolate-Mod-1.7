package com.chocolatemod.block;

import com.chocolatemod.main.MainRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;

public class darkchocolatebrickstairs extends BlockStairs {

	protected darkchocolatebrickstairs(Block par2Block, int par3) {
		super(BlockRegistry.chocolatebrick, 1);
		// TODO Auto-generated constructor stub
		this.setCreativeTab(MainRegistry.tabChocolateBlocks);
		this.setLightOpacity(0);
	}

}
