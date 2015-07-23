package com.chocolatemod.liquids;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemBucket;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;

public class BucketMoltenCaramel extends ItemBucket {

	public BucketMoltenCaramel(Block p_i45331_1_) {
		super(LiquidRegistry.chocolateMilkBlock);
		this.setContainerItem(Items.bucket);
		this.maxStackSize = 1;
	}

	public ItemStack onEaten(ItemStack p_77654_1_, World p_77654_2_, EntityPlayer p_77654_3_) {
		if (!p_77654_3_.capabilities.isCreativeMode) {
			--p_77654_1_.stackSize;
		}

		if (!p_77654_2_.isRemote) {
			p_77654_3_.getFoodStats().addStats(6, .8F);
			p_77654_3_.setFire(100);
			p_77654_3_.isBurning();
		}

		return p_77654_1_.stackSize <= 0 ? new ItemStack(Items.bucket) : p_77654_1_;
	}

	public int getMaxItemUseDuration(ItemStack p_77626_1_) {
		return 32;
	}

	public EnumAction getItemUseAction(ItemStack p_77661_1_) {
		return EnumAction.drink;
	}

	public ItemStack onItemRightClick(ItemStack p_77659_1_, World p_77659_2_, EntityPlayer p_77659_3_) {
		p_77659_3_.setItemInUse(p_77659_1_, this.getMaxItemUseDuration(p_77659_1_));
		return p_77659_1_;
	}

	public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par3EntityPlayer, World par2World, int p_77648_4_, int p_77648_5_, int p_77648_6_, int p_77648_7_, float p_77648_8_, float p_77648_9_, float p_77648_10_) {


		int X;
		int Y;
		int Z;
		int x;
		int y;
		int z;
		ForgeDirection direct = ForgeDirection.getOrientation(p_77648_7_);
		x = direct.offsetX;
		y = direct.offsetY;
		z = direct.offsetZ;
		X = p_77648_4_ + x;
		Y = p_77648_5_ + y;
		Z = p_77648_6_ + z;


		//par2World.setBlock(p_77648_4_, p_77648_5_, p_77648_6_, Blocks.torch);
		par2World.setBlock(X, Y, Z, LiquidRegistry.moltenCaramelBlock);

		if (!par3EntityPlayer.capabilities.isCreativeMode) {
			par3EntityPlayer.inventory.consumeInventoryItem(LiquidRegistry.caramelBucket);
			par3EntityPlayer.inventory.addItemStackToInventory(new ItemStack(Items.bucket));
		}


		return true;
	}
}
