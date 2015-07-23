package com.chocolatemod.food;

import com.chocolatemod.main.MainRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemFood;

public class goldchocolatebar extends ItemFood {

	public goldchocolatebar(int par2, float par3, boolean par4) {
		super(par2, par4);
		// TODO Auto-generated constructor stub
		this.setCreativeTab(MainRegistry.tabChocolateFood);
	}


	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister) {
		this.itemIcon = iconRegister.registerIcon("killerjdog51:goldchocolatebar");
	}

}
