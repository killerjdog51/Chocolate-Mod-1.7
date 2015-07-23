package com.chocolatemod.event;

import com.chocolatemod.food.FoodRegistry;
import com.chocolatemod.mobs.*;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingDropsEvent;

public class mobdrops {


	@SubscribeEvent
	public void onEntityDrop(LivingDropsEvent event) {
		if (event.entity instanceof Entitychocolateglob) {
			event.entity.entityDropItem(new ItemStack(FoodRegistry.chocolateball1, 1, 0), 0.0F);
		} else if (event.entity instanceof Entitydarkchocolateglob) {
			event.entity.entityDropItem(new ItemStack(FoodRegistry.chocolateball1, 1, 1), 0.0F);
		} else if (event.entity instanceof Entitylightchocolateglob) {
			event.entity.entityDropItem(new ItemStack(FoodRegistry.chocolateball1, 1, 2), 0.0F);
		} else if (event.entity instanceof Entitywhitechocolateglob) {
			event.entity.entityDropItem(new ItemStack(FoodRegistry.chocolateball1, 1, 3), 0.0F);
		} else if (event.entity instanceof Entitychocolatepig) {
			event.entity.entityDropItem(new ItemStack(FoodRegistry.chocolatebar1, 5, 0), 0.0F);
		} else if (event.entity instanceof Entitydarkchocolatepig) {
			event.entity.entityDropItem(new ItemStack(FoodRegistry.chocolatebar1, 5, 1), 0.0F);
		} else if (event.entity instanceof Entitylightchocolatepig) {
			event.entity.entityDropItem(new ItemStack(FoodRegistry.chocolatebar1, 5, 2), 0.0F);
		} else if (event.entity instanceof Entitywhitechocolatepig) {
			event.entity.entityDropItem(new ItemStack(FoodRegistry.chocolatebar1, 5, 3), 0.0F);
		}
	}
}
