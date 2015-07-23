package com.chocolatemod.armor;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;


public class WhiteChocolateArmor extends ItemArmor {
	public WhiteChocolateArmor(ArmorMaterial par2EnumArmorMaterial,
							   int par3, int par4) {
		super(par2EnumArmorMaterial, par3, par4);
	}

	public String getArmorTexture(ItemStack stack, Entity entity, int slot,
								  String type) {
		if (
				stack.getItem() == ArmorRegistry.WhiteChocolateHelmet
						|| stack.getItem() == ArmorRegistry.WhiteChocolateChestplate
						|| stack.getItem() == ArmorRegistry.WhiteChocolateBoots) {
			return "killerjdog51:textures/armor/whitechocolate_1.png";
		}
		if (stack.getItem() == ArmorRegistry.WhiteChocolateLeggings) {
			return "killerjdog51:textures/armor/whitechocolate_2.png";
		} else {
			return null;
		}

	}
}


