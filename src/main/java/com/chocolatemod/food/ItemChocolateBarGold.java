package com.chocolatemod.food;

import com.chocolatemod.main.MainRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

import java.util.List;

public class ItemChocolateBarGold extends ItemFood {
	public ItemChocolateBarGold(int par2, float par3, boolean par4) {
		super(par2, par4);
		this.setHasSubtypes(true);
		this.setCreativeTab(MainRegistry.tabChocolateFood);
	}

	public boolean hasEffect(ItemStack par1ItemStack) {
		return par1ItemStack.getItemDamage() > 0;
	}

	/**
	 * Return an item rarity from EnumRarity
	 */
	public EnumRarity getRarity(ItemStack par1ItemStack) {
		return par1ItemStack.getItemDamage() == 0 ? EnumRarity.rare : EnumRarity.epic;
	}

	protected void onFoodEaten(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer) {
		if (!par2World.isRemote) {
			par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.field_76444_x.id, 2400, 0));
		}

		if (par1ItemStack.getItemDamage() > 0) {
			if (!par2World.isRemote) {
				par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.regeneration.id, 600, 4));
				par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.resistance.id, 6000, 0));
				par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 6000, 0));
				par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 6000, 0));
			}
		} else {
			super.onFoodEaten(par1ItemStack, par2World, par3EntityPlayer);
		}
	}

	/**
	 * returns a list of items with the same ID, but different meta (eg: dye returns 16 items)
	 */
	public void getSubItems(Item par1, CreativeTabs par2CreativeTabs, List par3List) {
		par3List.add(new ItemStack(par1, 1, 0));
		par3List.add(new ItemStack(par1, 1, 1));
	}
}
