package com.chocolatemod.block;

import static net.minecraftforge.common.util.ForgeDirection.EAST;
import static net.minecraftforge.common.util.ForgeDirection.NORTH;
import static net.minecraftforge.common.util.ForgeDirection.SOUTH;
import static net.minecraftforge.common.util.ForgeDirection.WEST;

import java.util.List;
import java.util.Random;

import net.minecraft.block.BlockPane;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;

import com.chocolatemod.main.MainRegistry;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockWhiteChocolatePane extends BlockPane
{
	 private final String field_150100_a;
	    private final boolean field_150099_b;
	    private final String field_150101_M;
	    @SideOnly(Side.CLIENT)
	    private IIcon field_150102_N;
	    private static final String __OBFID = "CL_00000322";

   protected BlockWhiteChocolatePane(String p_i45432_1_, String p_i45432_2_, Material p_i45432_3_, boolean p_i45432_4_)
   {
   	super(p_i45432_2_, p_i45432_2_, p_i45432_3_, p_i45432_4_);
       this.field_150100_a = p_i45432_2_;
       this.field_150099_b = p_i45432_4_;
       this.field_150101_M = p_i45432_1_;
       this.setCreativeTab(MainRegistry.tabChocolateBlocks);
   }

   /**
    * Returns the ID of the items to drop on destruction.
    */
   public Object idDropped(int par1, Random par2Random, int par3)
   {
       return !this.field_150099_b ? BlockRegistry.whitechocolatepane : super.getItemDropped(par1, par2Random, par3);
   }

   /**
    * Is this block (a) opaque and (b) a full 1m cube?  This determines whether or not to render the shared face of two
    * adjacent blocks and also whether the player can attach torches, redstone wire, etc to this block.
    */
   public boolean isOpaqueCube()
   {
       return false;
   }

   /**
    * If this block doesn't render as an ordinary block it will return False (examples: signs, buttons, stairs, etc)
    */
   public boolean renderAsNormalBlock()
   {
       return false;
   }

   /**
    * The type of render function that is called for this block
    */
   public int getRenderType()
   {
       return this.blockMaterial == Material.glass ? 41 : 18;
   }

   /**
    * Returns true if the given side of this block type should be rendered, if the adjacent block is at the given
    * coordinates.  Args: blockAccess, x, y, z, side
    */
   @SideOnly(Side.CLIENT)
   public boolean shouldSideBeRendered(IBlockAccess p_149646_1_, int p_149646_2_, int p_149646_3_, int p_149646_4_, int p_149646_5_)
   {
       return p_149646_1_.getBlock(p_149646_2_, p_149646_3_, p_149646_4_) == this ? false : super.shouldSideBeRendered(p_149646_1_, p_149646_2_, p_149646_3_, p_149646_4_, p_149646_5_);
   }

   /**
    * Adds all intersecting collision boxes to a list. (Be sure to only add boxes to the list if they intersect the
    * mask.) Parameters: World, X, Y, Z, mask, list, colliding entity
    */
   public void addCollisionBoxesToList(World p_149743_1_, int p_149743_2_, int p_149743_3_, int p_149743_4_, AxisAlignedBB p_149743_5_, List p_149743_6_, Entity p_149743_7_)
   {
       boolean flag  = this.canPaneConnectTo(p_149743_1_, p_149743_2_, p_149743_3_, p_149743_4_ - 1, NORTH);
       boolean flag1 = this.canPaneConnectTo(p_149743_1_, p_149743_2_, p_149743_3_, p_149743_4_ + 1, SOUTH);
       boolean flag2 = this.canPaneConnectTo(p_149743_1_, p_149743_2_ - 1, p_149743_3_, p_149743_4_, WEST );
       boolean flag3 = this.canPaneConnectTo(p_149743_1_, p_149743_2_ + 1, p_149743_3_, p_149743_4_, EAST );

       if ((!flag2 || !flag3) && (flag2 || flag3 || flag || flag1))
       {
           if (flag2 && !flag3)
           {
               this.setBlockBounds(0.0F, 0.0F, 0.4375F, 0.5F, 1.0F, 0.5625F);
               super.addCollisionBoxesToList(p_149743_1_, p_149743_2_, p_149743_3_, p_149743_4_, p_149743_5_, p_149743_6_, p_149743_7_);
           }
           else if (!flag2 && flag3)
           {
               this.setBlockBounds(0.5F, 0.0F, 0.4375F, 1.0F, 1.0F, 0.5625F);
               super.addCollisionBoxesToList(p_149743_1_, p_149743_2_, p_149743_3_, p_149743_4_, p_149743_5_, p_149743_6_, p_149743_7_);
           }
       }
       else
       {
           this.setBlockBounds(0.0F, 0.0F, 0.4375F, 1.0F, 1.0F, 0.5625F);
           super.addCollisionBoxesToList(p_149743_1_, p_149743_2_, p_149743_3_, p_149743_4_, p_149743_5_, p_149743_6_, p_149743_7_);
       }

       if ((!flag || !flag1) && (flag2 || flag3 || flag || flag1))
       {
           if (flag && !flag1)
           {
               this.setBlockBounds(0.4375F, 0.0F, 0.0F, 0.5625F, 1.0F, 0.5F);
               super.addCollisionBoxesToList(p_149743_1_, p_149743_2_, p_149743_3_, p_149743_4_, p_149743_5_, p_149743_6_, p_149743_7_);
           }
           else if (!flag && flag1)
           {
               this.setBlockBounds(0.4375F, 0.0F, 0.5F, 0.5625F, 1.0F, 1.0F);
               super.addCollisionBoxesToList(p_149743_1_, p_149743_2_, p_149743_3_, p_149743_4_, p_149743_5_, p_149743_6_, p_149743_7_);
           }
       }
       else
       {
           this.setBlockBounds(0.4375F, 0.0F, 0.0F, 0.5625F, 1.0F, 1.0F);
           super.addCollisionBoxesToList(p_149743_1_, p_149743_2_, p_149743_3_, p_149743_4_, p_149743_5_, p_149743_6_, p_149743_7_);
       }
   }

   /**
    * Sets the block's bounds for rendering it as an item
    */
   public void setBlockBoundsForItemRender()
   {
       this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
   }

   /**
    * Updates the blocks bounds based on its current state. Args: world, x, y, z
    */
   public void setBlockBoundsBasedOnState(IBlockAccess p_149719_1_, int p_149719_2_, int p_149719_3_, int p_149719_4_)
   {
       float f = 0.4375F;
       float f1 = 0.5625F;
       float f2 = 0.4375F;
       float f3 = 0.5625F;
       boolean flag  = this.canPaneConnectTo(p_149719_1_, p_149719_2_, p_149719_3_, p_149719_4_ - 1, NORTH);
       boolean flag1 = this.canPaneConnectTo(p_149719_1_, p_149719_2_, p_149719_3_, p_149719_4_ + 1, SOUTH);
       boolean flag2 = this.canPaneConnectTo(p_149719_1_, p_149719_2_ - 1, p_149719_3_, p_149719_4_, WEST );
       boolean flag3 = this.canPaneConnectTo(p_149719_1_, p_149719_2_ + 1, p_149719_3_, p_149719_4_, EAST );

       if ((!flag2 || !flag3) && (flag2 || flag3 || flag || flag1))
       {
           if (flag2 && !flag3)
           {
               f = 0.0F;
           }
           else if (!flag2 && flag3)
           {
               f1 = 1.0F;
           }
       }
       else
       {
           f = 0.0F;
           f1 = 1.0F;
       }

       if ((!flag || !flag1) && (flag2 || flag3 || flag || flag1))
       {
           if (flag && !flag1)
           {
               f2 = 0.0F;
           }
           else if (!flag && flag1)
           {
               f3 = 1.0F;
           }
       }
       else
       {
           f2 = 0.0F;
           f3 = 1.0F;
       }

       this.setBlockBounds(f, 0.0F, f2, f1, 1.0F, f3);
   }

   

   @SideOnly(Side.CLIENT)
   public IIcon func_150097_e()
   {
       return this.field_150102_N;
   }

  
   /**
    * Returns an item stack containing a single instance of the current block type. 'i' is the block's subtype/damage
    * and is ignored for blocks which do not support subtypes. Blocks which cannot be harvested should return null.
    */
   protected ItemStack createStackedBlock(int p_149644_1_)
   {
       return new ItemStack(Item.getItemFromBlock(this), 1, p_149644_1_);
   }

   @SideOnly(Side.CLIENT)
   public void registerBlockIcons(IIconRegister p_149651_1_)
   {
       this.blockIcon = p_149651_1_.registerIcon(this.field_150101_M);
       this.field_150102_N = p_149651_1_.registerIcon(this.field_150100_a);
   }

   public boolean canPaneConnectTo(IBlockAccess world, int x, int y, int z, ForgeDirection dir)
   {
       return canPaneConnectToBlock(world.getBlock(x, y, z)) || 
               world.isSideSolid(x, y, z, dir.getOpposite(), false);
   }
}