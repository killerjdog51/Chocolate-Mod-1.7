package com.chocolatemod.block;

import com.chocolatemod.main.MainRegistry;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.client.renderer.texture.IIconRegister;

public class darkChocolateStairs extends BlockStairs{

	protected darkChocolateStairs( Block par2Block, int par3) {
		super(BlockRegistry.chocolateblock, 5);
		// TODO Auto-generated constructor stub
		this.setCreativeTab(MainRegistry.tabChocolateBlocks);
		this.setLightOpacity(0);
		
	}

}
