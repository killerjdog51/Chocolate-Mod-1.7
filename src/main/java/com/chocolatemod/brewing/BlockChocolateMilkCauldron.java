package com.chocolatemod.brewing;


import java.util.List;
import java.util.Random;
 




import com.chocolatemod.item.ItemRegistry;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
 
public class BlockChocolateMilkCauldron extends Block
{
        public static IIcon[] ChocolateCauldronTex;
        public static IIcon[] ChocolateLiquidTex;
 
        public BlockChocolateMilkCauldron()
        {
                super(Material.iron);
                this.setCreativeTab(null);
                this.setHardness(2.0F);
                this.setTickRandomly(true);
        }
 
        /**
         * When this method is called, your block should register all the icons it needs with the given IconRegister. This
         * is the only chance you get to register icons.
         */
        @SideOnly(Side.CLIENT)
        public void registerBlockIcons(IIconRegister reg)
        {
        	ChocolateCauldronTex = new IIcon[4];
        	ChocolateLiquidTex = new IIcon[4];
 
        	 ChocolateCauldronTex[0] = reg.registerIcon("cauldron_inner");
        	 ChocolateCauldronTex[1] = reg.registerIcon("cauldron_top");
        	 ChocolateCauldronTex[2] = reg.registerIcon("cauldron_bottom");
        	 ChocolateCauldronTex[3] = reg.registerIcon("cauldron_side");
                
        	ChocolateLiquidTex[0] = reg.registerIcon("killerjdog51:blockLightChocolateMilkCauldronChocolateMilk");
        	ChocolateLiquidTex[1] = reg.registerIcon("killerjdog51:blockChocolateMilkCauldronChocolateLumpA");
        	ChocolateLiquidTex[2] = reg.registerIcon("killerjdog51:blockChocolateMilkCauldronChocolateLumpB");
        	ChocolateLiquidTex[3] = reg.registerIcon("killerjdog51:blockChocolateMilkCauldronDarkChocolateMilk");
                

        }
 
        /**
         * From the specified side and block metadata retrieves the blocks texture. Args: side, metadata
         */
        @SideOnly(Side.CLIENT)
        @Override
        public IIcon getIcon(int s, int par2)
        {
                return s == 1 ? ChocolateCauldronTex[1] : (s == 0 ? ChocolateCauldronTex[2] : ChocolateCauldronTex[3]);
        }
 
        /**
         * Returns the ID of the items to drop on destruction.
         */
        public Item idDropped(int par1, Random par2Random, int par3)
        {
                return net.minecraft.init.Items.cauldron;
        }
 
        /**
         * Is this block (a) opaque and (b) a full 1m cube?  This determines whether or not to render the shared face of two
         * adjacent blocks and also whether the player can attach torches, redstone wire, etc to this block.
         */
        @Override
        public boolean isOpaqueCube()
        {
                return false;
        }
 
        /**
         * If this block doesn't render as an ordinary block it will return False (examples: signs, buttons, stairs, etc)
         */
        @Override
        public boolean renderAsNormalBlock()
        {
                return false;
        }
 
        /**
         * The type of render function that is called for this block
         */
        @Override
        public int getRenderType()
        {
                return brewing.ChocolatemilkCauldronRenderID;
        }
 
        /**
         * only called by clickMiddleMouseButton , and passed to inventory.setCurrentItem (along with isCreative)
         */
        @SideOnly(Side.CLIENT)
        public Item idPicked(World par1World, int par2, int par3, int par4)
        {
                return net.minecraft.init.Items.cauldron;
        }
 
        /**
         * Adds all intersecting collision boxes to a list. (Be sure to only add boxes to the list if they intersect the
         * mask.) Parameters: World, X, Y, Z, mask, list, colliding entity
         */
        @Override
        public void addCollisionBoxesToList(World world, int i, int j, int k, AxisAlignedBB axis, List list, Entity entity)
        {
                this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.3125F, 1.0F);
                super.addCollisionBoxesToList(world, i, j, k, axis, list, entity);
                float f = 0.125F;
                this.setBlockBounds(0.0F, 0.0F, 0.0F, f, 1.0F, 1.0F);
                super.addCollisionBoxesToList(world, i, j, k, axis, list, entity);
                this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, f);
                super.addCollisionBoxesToList(world, i, j, k, axis, list, entity);
                this.setBlockBounds(1.0F - f, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
                super.addCollisionBoxesToList(world, i, j, k, axis, list, entity);
                this.setBlockBounds(0.0F, 0.0F, 1.0F - f, 1.0F, 1.0F, 1.0F);
                super.addCollisionBoxesToList(world, i, j, k, axis, list, entity);
                this.setBlockBoundsForItemRender();
        }
 
        /**
         * Sets the block's bounds for rendering it as an item
         */
        @Override
        public void setBlockBoundsForItemRender()
        {
                this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
        }
 
        /**
         * How many world ticks before ticking
         */
        
 
        /**
         * Ticks the block if it's been scheduled
         */
        @Override
        public void updateTick(World world, int i, int j, int k, Random rand)
        {
                int meta = world.getBlockMetadata(i, j, k);
                boolean heat = world.getBlock(i, j - 1, k) == Blocks.fire || world.getBlock(i, j - 1, k) == Blocks.flowing_lava || world.getBlock(i, j - 1, k) == Blocks.lava;
 
                if (heat)
                {
                        if (meta > 1 && meta < 6)
                        {
                                ++meta;
                                world.setBlockMetadataWithNotify(i, j, k, meta, 2);
                        }
                        
                }
        }
 
        @SideOnly(Side.CLIENT)
 
        /**
         * A randomly called display update to be able to add particles or other items for display
         */
        @Override
        public void randomDisplayTick(World world, int i, int j, int k, Random par5Random)
        {
                boolean heat = world.getBlock(i, j - 1, k) == Blocks.fire || world.getBlock(i, j - 1, k) == Blocks.flowing_lava || world.getBlock(i, j - 1, k) == Blocks.lava;
 
                if (heat)
                {
                        double d0 = (double)((float)i + 0.5F);
                        double d1a = (double)((float)j + 1.4F);
                        double d1b = (double)((float)j + 1.0F);
                        double d2 = (double)((float)k + 0.5F);
 
                        world.spawnParticle("smoke", d0, d1a, d2, 0.0D, 0.0D, 0.0D);
                }
        }
        
        
 
        /**
         * Called upon block activation (right click on the block.)
         */    
 

        //0 = Chocolate Milk
        //1 = 1 Chocolate Lump
        //2 = 1 Chocolate Lump
        //3 = boil
        //4 = boil
        //5 = boil
        //6 = finish/flavored
        
        @Override
        public boolean onBlockActivated(World world, int i, int j, int k, EntityPlayer player, int par6, float par7, float par8, float par9)
        {
                if (world.isRemote)
                {
                        return true;
                }
                else
                {
                        ItemStack itemstack = player.inventory.getCurrentItem();
 
                        if (itemstack == null)
                        {
                                return true;
                        }
                        else
                        {
                                int meta = world.getBlockMetadata(i, j, k);
 
                                if (itemstack.getItem() == ItemRegistry.lightchocolatelump)
                                {      
                                        // If the cauldron doesn't have 3 sugar yet, then:
                                        if (meta < 2)
                                        
                                        {
                                                if (!player.capabilities.isCreativeMode)
                                                {
                                                        // I don't know why but you didn't change this line
                                                        // Previously, it will return a bucket when the sugar is used
                                                        // So yeah, fixed it. Currently, it will just decrease the sugar stack
                                                        --itemstack.stackSize;
 
                                                        if (itemstack.stackSize <= 0)
                                                        {
                                                                player.inventory.setInventorySlotContents(player.inventory.currentItem, (ItemStack)null);
                                                        }
                                                }
 
                                                world.setBlockMetadataWithNotify(i, j, k, meta + 1, 2);
                                        }
 
                                        return true;
                                }
 
                               
                                else if (itemstack.getItem() == Items.bucket)
                                {
                                        if (meta == 6)
                                        {
                                                ItemStack itemstack1 = new ItemStack(ItemRegistry.darkchocolatemilk, 1, 0);
                                                if (!player.inventory.addItemStackToInventory(itemstack1))
                                                {
                                                	world.spawnEntityInWorld(new EntityItem(world, (double)i + 0.5D, (double)j + 1.5D, (double)k + 0.5D, itemstack1));
                                                }
                                                else if (player instanceof EntityPlayerMP)
                                                {
                                                        ((EntityPlayerMP)player).sendContainerToPlayer(player.inventoryContainer);
                                                }
 
                                                if (!player.capabilities.isCreativeMode)
                                                {
                                                        --itemstack.stackSize;
 
                                                        if (itemstack.stackSize <= 0)
                                                        {
                                                        	player.inventory.setInventorySlotContents(player.inventory.currentItem, (ItemStack)null);
                                                        }
                                                }
 
                                                world.setBlock(i, j, k, Blocks.cauldron);
                                        }
                                        if (meta == 0)
                                        {
                                                ItemStack itemstack1 = new ItemStack(ItemRegistry.chocolatemilk, 1, 0);
                                                if (!player.inventory.addItemStackToInventory(itemstack1))
                                                {
                                                	world.spawnEntityInWorld(new EntityItem(world, (double)i + 0.5D, (double)j + 1.5D, (double)k + 0.5D, itemstack1));
                                                }
                                                else if (player instanceof EntityPlayerMP)
                                                {
                                                        ((EntityPlayerMP)player).sendContainerToPlayer(player.inventoryContainer);
                                                }
 
                                                if (!player.capabilities.isCreativeMode)
                                                {
                                                        --itemstack.stackSize;
 
                                                        if (itemstack.stackSize <= 0)
                                                        {
                                                        	player.inventory.setInventorySlotContents(player.inventory.currentItem, (ItemStack)null);
                                                        }
                                                }
 
                                                world.setBlock(i, j, k, Blocks.cauldron);
                                        }
                                        return true;
                                }
 
                                        else if (itemstack.getItem() == Items.bowl)
                                        {
                                                if (meta == 6)
                                                {
                                                        ItemStack itemstack1 = new ItemStack(ItemRegistry.bowldarkchocolatemilk, 1, 0);
                                                        if (!player.inventory.addItemStackToInventory(itemstack1))
                                                        {
                                                        	world.spawnEntityInWorld(new EntityItem(world, (double)i + 0.5D, (double)j + 1.5D, (double)k + 0.5D, itemstack1));
                                                        }
                                                        else if (player instanceof EntityPlayerMP)
                                                        {
                                                                ((EntityPlayerMP)player).sendContainerToPlayer(player.inventoryContainer);
                                                        }
         
                                                        if (!player.capabilities.isCreativeMode)
                                                        {
                                                                --itemstack.stackSize;
         
                                                                if (itemstack.stackSize <= 0)
                                                                {
                                                                	player.inventory.setInventorySlotContents(player.inventory.currentItem, (ItemStack)null);
                                                                }
                                                        }
         
                                                        world.setBlock(i, j, k, Blocks.cauldron);
                                                }
                                                
                                                        if (meta == 0)
                                                        {
                                                                ItemStack itemstack1 = new ItemStack(ItemRegistry.bowlchocolatemilk, 1, 0);
                                                                if (!player.inventory.addItemStackToInventory(itemstack1))
                                                                {
                                                                	world.spawnEntityInWorld(new EntityItem(world, (double)i + 0.5D, (double)j + 1.5D, (double)k + 0.5D, itemstack1));
                                                                }
                                                                else if (player instanceof EntityPlayerMP)
                                                                {
                                                                        ((EntityPlayerMP)player).sendContainerToPlayer(player.inventoryContainer);
                                                                }
                 
                                                                if (!player.capabilities.isCreativeMode)
                                                                {
                                                                        --itemstack.stackSize;
                 
                                                                        if (itemstack.stackSize <= 0)
                                                                        {
                                                                        	player.inventory.setInventorySlotContents(player.inventory.currentItem, (ItemStack)null);
                                                                        }
                                                                }
                 
                                                                world.setBlock(i, j, k, Blocks.cauldron);
                                                        }
         
                                                return true;    
                                        }        
                                        
                                return true;
                        }
                }
        }

		private int func_150027_b(int i1) {
			// TODO Auto-generated method stub
			return 0;
		}}