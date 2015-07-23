package com.chocolatemod.tools;

import com.chocolatemod.main.MainRegistry;
import net.minecraft.item.ItemTool;

import java.util.Set;

public class ItemGemsTool extends ItemTool {
	public ItemGemsTool(Float damageVsEntity, ToolMaterial enumtoolmaterial, Set field_150914_c) {
		super(damageVsEntity, enumtoolmaterial, field_150914_c);
		setCreativeTab(MainRegistry.tabChocolateTools);
	}
}
