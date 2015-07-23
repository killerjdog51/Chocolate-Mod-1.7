package com.chocolatemod.armor;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;


public class DarkChocolateArmor extends ItemArmor {
	public DarkChocolateArmor(ArmorMaterial par2EnumArmorMaterial,
							  int par3, int par4) {
		super(par2EnumArmorMaterial, par3, par4);
	}

	public String getArmorTexture(ItemStack stack, Entity entity, int slot,
								  String type) {
		if (
				stack.getItem() == ArmorRegistry.DarkChocolateHelmet
						|| stack.getItem() == ArmorRegistry.DarkChocolateChestplate
						|| stack.getItem() == ArmorRegistry.DarkChocolateBoots) {
			return "killerjdog51:textures/armor/darkchocolate_1.png";
		}
		if (stack.getItem() == ArmorRegistry.DarkChocolateLeggings) {
			return "killerjdog51:textures/armor/darkchocolate_2.png";
		} else {
			return null;
		}

	}
}


