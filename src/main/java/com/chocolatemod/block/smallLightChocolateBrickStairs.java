package com.chocolatemod.block;

import com.chocolatemod.main.MainRegistry;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.material.Material;

public class smallLightChocolateBrickStairs extends BlockStairs{

	protected smallLightChocolateBrickStairs(Block par2Block, int par3) {
		super(BlockRegistry.chocolatebrick, 10);
		// TODO Auto-generated constructor stub
		this.setCreativeTab(MainRegistry.tabChocolateBlocks);
		this.setLightOpacity(0);
	}

}