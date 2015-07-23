package com.chocolatemod.plants;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockLog;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;

public class BlockCocoaLog extends BlockLog{
    public static final String[] field_150168_M = new String[] {"cocoa"};

    public static int func_150165_c(int p_150165_0_)
    {
        return p_150165_0_ & 0;
    }
    
	@SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister p_149651_1_)
    {
        this.field_150167_a = new IIcon[field_150168_M.length];
        this.field_150166_b = new IIcon[field_150168_M.length];

        for (int i = 0; i < this.field_150167_a.length; ++i)
        {
            this.field_150167_a[i] = p_149651_1_.registerIcon(this.getTextureName() + "_" + field_150168_M[i]);
            this.field_150166_b[i] = p_149651_1_.registerIcon(this.getTextureName() + "_" + field_150168_M[i] + "_top");
        }
    }
	@Override
    public boolean canSustainLeaves(IBlockAccess world, int x, int y, int z)
    {
        return true;
    }

    @Override
    public boolean isWood(IBlockAccess world, int x, int y, int z)
    {
        return true;
    }
}
