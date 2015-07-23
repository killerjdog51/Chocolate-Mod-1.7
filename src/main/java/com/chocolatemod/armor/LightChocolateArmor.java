package com.chocolatemod.armor;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;


public class LightChocolateArmor extends ItemArmor {
	public LightChocolateArmor(ArmorMaterial par2EnumArmorMaterial,
							   int par3, int par4) {
		super(par2EnumArmorMaterial, par3, par4);
	}

	public String getArmorTexture(ItemStack stack, Entity entity, int slot,
								  String type) {
		if (
				stack.getItem() == ArmorRegistry.LightChocolateHelmet
						|| stack.getItem() == ArmorRegistry.LightChocolateChestplate
						|| stack.getItem() == ArmorRegistry.LightChocolateBoots) {
			return "killerjdog51:textures/armor/lightchocolate_1.png";
		}
		if (stack.getItem() == ArmorRegistry.LightChocolateLeggings) {
			return "killerjdog51:textures/armor/lightchocolate_2.png";
		} else {
			return null;
		}

	}
}


