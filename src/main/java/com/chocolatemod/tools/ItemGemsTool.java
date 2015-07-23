package com.chocolatemod.tools;

import java.util.List;





import java.util.Set;

import com.chocolatemod.main.MainRegistry;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraft.item.Item.ToolMaterial;

public class ItemGemsTool extends ItemTool
{
    public ItemGemsTool(Float damageVsEntity, ToolMaterial enumtoolmaterial, Set field_150914_c)
    {
        super(damageVsEntity, enumtoolmaterial, field_150914_c);
        setCreativeTab(MainRegistry.tabChocolateTools);
    }
}
