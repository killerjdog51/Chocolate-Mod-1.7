package com.chocolatemod.mobs;

import com.chocolatemod.food.FoodRegistry;
import com.chocolatemod.plants.PlantRegistry;

import net.minecraft.block.Block;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class EntityAlbinoMooshroom extends EntityCow
{
    public EntityAlbinoMooshroom(World par1World)
    {
        super(par1World);
        this.setSize(0.9F, 1.3F);
    }
    
    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(10.0D);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.20000000298023224D);
    }

    /**
     * Called when a player interacts with a mob. e.g. gets milk from a cow, gets into the saddle on a pig.
     */
    public boolean interact(EntityPlayer par1EntityPlayer)
    {
        ItemStack var2 = par1EntityPlayer.inventory.getCurrentItem();

        if (var2 != null && var2.getItem() == Items.bowl && this.getGrowingAge() >= 0)
        {
            if (var2.stackSize == 1)
            {
                par1EntityPlayer.inventory.setInventorySlotContents(par1EntityPlayer.inventory.currentItem, new ItemStack(FoodRegistry.chocolatesoup));
                return true;
            }

            if (par1EntityPlayer.inventory.addItemStackToInventory(new ItemStack(FoodRegistry.chocolatesoup)) && !par1EntityPlayer.capabilities.isCreativeMode)
            {
                par1EntityPlayer.inventory.decrStackSize(par1EntityPlayer.inventory.currentItem, 1);
                return true;
            }
        }

        if (var2 != null && var2.getItem() == Items.shears && this.getGrowingAge() >= 0)
        {
            this.setDead();
            this.worldObj.spawnParticle("largeexplode", this.posX, this.posY + (double)(this.height / 2.0F), this.posZ, 0.0D, 0.0D, 0.0D);

            if (!this.worldObj.isRemote)
            {
                Entitywhitecocoacow var3 = new Entitywhitecocoacow(this.worldObj);
                var3.setLocationAndAngles(this.posX, this.posY, this.posZ, this.rotationYaw, this.rotationPitch);
                var3.setHealth(this.getHealth());
                var3.renderYawOffset = this.renderYawOffset;
                this.worldObj.spawnEntityInWorld(var3);

                for (int var4 = 0; var4 < 5; ++var4)
                {
                    this.worldObj.spawnEntityInWorld(new EntityItem(this.worldObj, this.posX, this.posY + (double)this.height, this.posZ, new ItemStack(PlantRegistry.chocolatemushroomwhite)));
                }
            }

            return true;
        }
        else
        {
            return super.interact(par1EntityPlayer);
        }
    }

    public EntityAlbinoMooshroom func_94900_c(EntityAgeable par1EntityAgeable)
    {
        return new EntityAlbinoMooshroom(this.worldObj);
    }

    /**
     * This function is used when two same-species animals in 'love mode' breed to generate the new baby animal.
     */
    public EntityCow spawnBabyAnimal(EntityAgeable par1EntityAgeable)
    {
        return this.func_94900_c(par1EntityAgeable);
    }

    public EntityCow createChild(EntityAgeable par1EntityAgeable)
    {
        return this.func_94900_c(par1EntityAgeable);
    }
}
