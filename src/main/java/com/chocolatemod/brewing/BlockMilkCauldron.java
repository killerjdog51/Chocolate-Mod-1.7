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
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
 
public class BlockMilkCauldron extends Block
{
        public static IIcon[] milkCauldronTex;
        public static IIcon[] milkLiquidTex;
 
        public BlockMilkCauldron()
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
                milkCauldronTex = new IIcon[4];
                milkLiquidTex = new IIcon[8];
 
                milkCauldronTex[0] = reg.registerIcon("cauldron_inner");
                milkCauldronTex[1] = reg.registerIcon("cauldron_top");
                milkCauldronTex[2] = reg.registerIcon("cauldron_bottom");
                milkCauldronTex[3] = reg.registerIcon("cauldron_side");
                
                milkLiquidTex[0] = reg.registerIcon("killerjdog51:blockMilkCauldronMilk");
                milkLiquidTex[1] = reg.registerIcon("killerjdog51:blockMilkCauldronSugarA");
                milkLiquidTex[2] = reg.registerIcon("killerjdog51:blockMilkCauldronSugarB");
                milkLiquidTex[3] = reg.registerIcon("killerjdog51:blockMilkCauldronSugarC");
                milkLiquidTex[4] = reg.registerIcon("killerjdog51:blockMilkCauldronMix");
                milkLiquidTex[5] = reg.registerIcon("killerjdog51:blockMilkCauldronchocolatebeansA");
                milkLiquidTex[6] = reg.registerIcon("killerjdog51:blockMilkCauldronchocolatebeansB");
                milkLiquidTex[7] = reg.registerIcon("killerjdog51:blockWhiteChocolateMilkCauldronLightChocolateMilk");
                
        }
 
        /**
         * From the specified side and block metadata retrieves the blocks texture. Args: side, metadata
         */
        @SideOnly(Side.CLIENT)
        
        public IIcon getIcon(int s, int par2)
        {
                return s == 1 ? milkCauldronTex[1] : (s == 0 ? milkCauldronTex[2] : milkCauldronTex[3]);
        }
 
        /**
         * Returns the ID of the items to drop on destruction.
         */
        public Item idDropped(int par1, Random par2Random, int par3)
        {
                return Items.cauldron;
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
                return brewing.milkCauldronRenderID;
        }
 
        /**
         * only called by clickMiddleMouseButton , and passed to inventory.setCurrentItem (along with isCreative)
         */
        @SideOnly(Side.CLIENT)
        public Item idPicked(World par1World, int par2, int par3, int par4)
        {
                return Items.cauldron;
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
                        if (meta > 1 && meta < 5)
                        {
                                ++meta;
                                world.setBlockMetadataWithNotify(i, j, k, meta, 2);
                        }
                        else if (meta > 6 && meta < 10)
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
 
        //0 = milk
        //1 = 1 sugar
        //2 = 2 sugar
        //3 = 3 sugar
        //4 = boil
        //5 = mixture
        //6 = cocoa beans added
        //7 = Cocoa Beans added
        //8 = boil
        //9 = boil
        //10 = finished white chocolate milk
       
 
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
 
                                if (itemstack.getItem() == Items.sugar)
                                {      
                                        // If the cauldron doesn't have 3 sugar yet, then:
                                        if (meta < 3)
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
 
                                // This too. You didn't include a getItemDamage() condition. That means, it will possible to use any kind of dye (not just cocoa beans). Fixed it.
                                else if (itemstack.getItem() == Items.dye && itemstack.getItemDamage() == 3)
                                {
                                        if (meta == 5)
                                        {
                                                --itemstack.stackSize;
 
                                                if (itemstack.stackSize <= 0)
                                                {
                                                        player.inventory.setInventorySlotContents(player.inventory.currentItem, (ItemStack)null);
                                                }
                                                world.setBlockMetadataWithNotify(i, j, k, meta = 6, 2);
                                        }
                                        else  if (meta == 6)
                                        {
                                                ItemStack itemstack1 = new ItemStack(Items.bowl, 1, 0);
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
 
                                                world.setBlockMetadataWithNotify(i, j, k, meta = 7, 2);
                                        }
                                        return true;
                                }
                                else if (itemstack.getItem() == Items.bucket)
                                {
                                        if (meta == 10)
                                        {
                                                ItemStack itemstack1 = new ItemStack(ItemRegistry.lightchocolatemilk, 1, 0);
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
                                                if (meta == 9)
                                                {
                                                        ItemStack itemstack1 = new ItemStack(ItemRegistry.bowllightchocolatemilk, 1, 0);
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
                                                        ItemStack itemstack1 = new ItemStack(ItemRegistry.bowlmilk, 1, 0);
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
                
        }