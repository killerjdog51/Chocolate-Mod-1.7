package com.chocolatemod.armor;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;


public class ChocolateArmor extends ItemArmor {
	public ChocolateArmor(ArmorMaterial par2EnumArmorMaterial,
						  int par3, int par4) {
		super(par2EnumArmorMaterial, par3, par4);
	}

	public String getArmorTexture(ItemStack stack, Entity entity, int slot,
								  String type) {
		if (
				stack.getItem() == ArmorRegistry.ChocolateHelmet
						|| stack.getItem() == ArmorRegistry.ChocolateChestplate
						|| stack.getItem() == ArmorRegistry.ChocolateBoots) {
			return "killerjdog51:textures/armor/chocolate_layer_1.png";
		}
		if (stack.getItem() == ArmorRegistry.ChocolateLeggings) {
			return "killerjdog51:textures/armor/chocolate_layer_2.png";
		} else {
			return null;
		}

	}
}


