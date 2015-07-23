package com.chocolatemod.block;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockBreakable;
import net.minecraft.block.BlockPortal;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.Item;
import net.minecraft.item.ItemMonsterPlacer;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.ChunkCoordinates;
import net.minecraft.util.Direction;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import com.chocolatemod.liquids.LiquidRegistry;
import com.chocolatemod.main.MainRegistry;
import com.chocolatemod.worldgen.ChocolateTeleporter;
import com.chocolatemod.worldgen.WorldGenRegistry;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockChocolatePortal extends BlockBreakable
{
public BlockChocolatePortal()
{
super("killerjdog51:ChocolatePortal", Material.portal, false);
this.setTickRandomly(true);
this.setHardness(-1.0F);
this.setStepSound(soundTypeGlass);
this.setLightValue(0.75F);
	 this.setCreativeTab(MainRegistry.tabChocolateBlocks);
}




private void setLightValue(float f) {
	// TODO Auto-generated method stub
	
}




/**
* Ticks the block if it's been scheduled
*/
public void updateTick(World p_149674_1_, int p_149674_2_, int p_149674_3_, int p_149674_4_, Random p_149674_5_)
{
    super.updateTick(p_149674_1_, p_149674_2_, p_149674_3_, p_149674_4_, p_149674_5_);

    if (p_149674_1_.provider.isSurfaceWorld() && p_149674_1_.getGameRules().getGameRuleBooleanValue("doMobSpawning") && p_149674_5_.nextInt(2000) < p_149674_1_.difficultySetting.getDifficultyId())
    {
        int l;

        for (l = p_149674_3_; !World.doesBlockHaveSolidTopSurface(p_149674_1_, p_149674_2_, l, p_149674_4_) && l > 0; --l)
        {
            ;
        }

        if (l > 0 && !p_149674_1_.getBlock(p_149674_2_, l + 1, p_149674_4_).isNormalCube())
        {
            Entity entity = ItemMonsterPlacer.spawnCreature(p_149674_1_, 57, (double)p_149674_2_ + 0.5D, (double)l + 1.1D, (double)p_149674_4_ + 0.5D);

            if (entity != null)
            {
                entity.timeUntilPortal = entity.getPortalCooldown();
            }
        }
    }
}
/**
* Returns a bounding box from the pool of bounding boxes (this means this box can change after the pool has been
* cleared to be reused)
*/
public AxisAlignedBB getCollisionBoundingBoxFromPool(World par1World, int par2, int par3, int par4)
{
return null;
}
/**
* Updates the blocks bounds based on its current state. Args: world, x, y, z
*/
public void setBlockBoundsBasedOnState(IBlockAccess p_149719_1_, int p_149719_2_, int p_149719_3_, int p_149719_4_)
{
    int l = func_149999_b(p_149719_1_.getBlockMetadata(p_149719_2_, p_149719_3_, p_149719_4_));

    if (l == 0)
    {
        if (p_149719_1_.getBlock(p_149719_2_ - 1, p_149719_3_, p_149719_4_) != this && p_149719_1_.getBlock(p_149719_2_ + 1, p_149719_3_, p_149719_4_) != this)
        {
            l = 2;
        }
        else
        {
            l = 1;
        }

        if (p_149719_1_ instanceof World && !((World)p_149719_1_).isRemote)
        {
            ((World)p_149719_1_).setBlockMetadataWithNotify(p_149719_2_, p_149719_3_, p_149719_4_, l, 2);
        }
    }

    float f = 0.125F;
    float f1 = 0.125F;

    if (l == 1)
    {
        f = 0.5F;
    }

    if (l == 2)
    {
        f1 = 0.5F;
    }

    this.setBlockBounds(0.5F - f, 0.0F, 0.5F - f1, 0.5F + f, 1.0F, 0.5F + f1);
}
/**
* Is this block (a) opaque and (B) a full 1m cube? This determines whether or not to render the shared face of two
* adjacent blocks and also whether the player can attach torches, redstone wire, etc to this block.
*/
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
* Checks to see if this location is valid to create a portal and will return True if it does. Args: world, x, y, z
*/
@SideOnly(Side.CLIENT)
public Item getItem(World p_149694_1_, int p_149694_2_, int p_149694_3_, int p_149694_4_)
{
    return Item.getItemById(0);
}

public static class Size
    {
        private final World field_150867_a;
        private final int field_150865_b;
        private final int field_150866_c;
        private final int field_150863_d;
        private int field_150864_e = 0;
        private ChunkCoordinates field_150861_f;
        private int field_150862_g;
        private int field_150868_h;
        private static final String __OBFID = "CL_00000285";

        public Size(World p_i45415_1_, int p_i45415_2_, int p_i45415_3_, int p_i45415_4_, int p_i45415_5_)
        {
            this.field_150867_a = p_i45415_1_;
            this.field_150865_b = p_i45415_5_;
            this.field_150863_d = BlockPortal.field_150001_a[p_i45415_5_][0];
            this.field_150866_c = BlockPortal.field_150001_a[p_i45415_5_][1];

            for (int i1 = p_i45415_3_; p_i45415_3_ > i1 - 21 && p_i45415_3_ > 0 && this.func_150857_a(p_i45415_1_.getBlock(p_i45415_2_, p_i45415_3_ - 1, p_i45415_4_)); --p_i45415_3_)
            {
                ;
            }

            int j1 = this.func_150853_a(p_i45415_2_, p_i45415_3_, p_i45415_4_, this.field_150863_d) - 1;

            if (j1 >= 0)
            {
                this.field_150861_f = new ChunkCoordinates(p_i45415_2_ + j1 * Direction.offsetX[this.field_150863_d], p_i45415_3_, p_i45415_4_ + j1 * Direction.offsetZ[this.field_150863_d]);
                this.field_150868_h = this.func_150853_a(this.field_150861_f.posX, this.field_150861_f.posY, this.field_150861_f.posZ, this.field_150866_c);

                if (this.field_150868_h < 2 || this.field_150868_h > 21)
                {
                    this.field_150861_f = null;
                    this.field_150868_h = 0;
                }
            }

            if (this.field_150861_f != null)
            {
                this.field_150862_g = this.func_150858_a();
            }
        }

        protected int func_150853_a(int p_150853_1_, int p_150853_2_, int p_150853_3_, int p_150853_4_)
        {
            int j1 = Direction.offsetX[p_150853_4_];
            int k1 = Direction.offsetZ[p_150853_4_];
            int i1;
            Block block;

            for (i1 = 0; i1 < 22; ++i1)
            {
                block = this.field_150867_a.getBlock(p_150853_1_ + j1 * i1, p_150853_2_, p_150853_3_ + k1 * i1);

                if (!this.func_150857_a(block))
                {
                    break;
                }

                Block block1 = this.field_150867_a.getBlock(p_150853_1_ + j1 * i1, p_150853_2_ - 1, p_150853_3_ + k1 * i1);

                if (block1 != BlockRegistry.goldchocolateblock)
                {
                    break;
                }
            }

            block = this.field_150867_a.getBlock(p_150853_1_ + j1 * i1, p_150853_2_, p_150853_3_ + k1 * i1);
            return block == BlockRegistry.goldchocolateblock ? i1 : 0;
        }

        protected int func_150858_a()
        {
            int i;
            int j;
            int k;
            int l;
            label56:

            for (this.field_150862_g = 0; this.field_150862_g < 21; ++this.field_150862_g)
            {
                i = this.field_150861_f.posY + this.field_150862_g;

                for (j = 0; j < this.field_150868_h; ++j)
                {
                    k = this.field_150861_f.posX + j * Direction.offsetX[BlockPortal.field_150001_a[this.field_150865_b][1]];
                    l = this.field_150861_f.posZ + j * Direction.offsetZ[BlockPortal.field_150001_a[this.field_150865_b][1]];
                    Block block = this.field_150867_a.getBlock(k, i, l);

                    if (!this.func_150857_a(block))
                    {
                        break label56;
                    }

                    if (block == BlockRegistry.BlockChocolatePortal)
                    {
                        ++this.field_150864_e;
                    }

                    if (j == 0)
                    {
                        block = this.field_150867_a.getBlock(k + Direction.offsetX[BlockPortal.field_150001_a[this.field_150865_b][0]], i, l + Direction.offsetZ[BlockPortal.field_150001_a[this.field_150865_b][0]]);

                        if (block != BlockRegistry.goldchocolateblock)
                        {
                            break label56;
                        }
                    }
                    else if (j == this.field_150868_h - 1)
                    {
                        block = this.field_150867_a.getBlock(k + Direction.offsetX[BlockPortal.field_150001_a[this.field_150865_b][1]], i, l + Direction.offsetZ[BlockPortal.field_150001_a[this.field_150865_b][1]]);

                        if (block != BlockRegistry.goldchocolateblock)
                        {
                            break label56;
                        }
                    }
                }
            }

            for (i = 0; i < this.field_150868_h; ++i)
            {
                j = this.field_150861_f.posX + i * Direction.offsetX[BlockPortal.field_150001_a[this.field_150865_b][1]];
                k = this.field_150861_f.posY + this.field_150862_g;
                l = this.field_150861_f.posZ + i * Direction.offsetZ[BlockPortal.field_150001_a[this.field_150865_b][1]];

                if (this.field_150867_a.getBlock(j, k, l) != BlockRegistry.goldchocolateblock)
                {
                    this.field_150862_g = 0;
                    break;
                }
            }

            if (this.field_150862_g <= 21 && this.field_150862_g >= 3)
            {
                return this.field_150862_g;
            }
            else
            {
                this.field_150861_f = null;
                this.field_150868_h = 0;
                this.field_150862_g = 0;
                return 0;
            }
        }

        protected boolean func_150857_a(Block p_150857_1_)
        {
            return p_150857_1_.getMaterial() == Material.air || p_150857_1_ == LiquidRegistry.darkChocolateMilkBlock || p_150857_1_ == BlockRegistry.BlockChocolatePortal;
        }

        public boolean func_150860_b()
        {
            return this.field_150861_f != null && this.field_150868_h >= 2 && this.field_150868_h <= 21 && this.field_150862_g >= 3 && this.field_150862_g <= 21;
        }

        public void func_150859_c()
        {
            for (int i = 0; i < this.field_150868_h; ++i)
            {
                int j = this.field_150861_f.posX + Direction.offsetX[this.field_150866_c] * i;
                int k = this.field_150861_f.posZ + Direction.offsetZ[this.field_150866_c] * i;

                for (int l = 0; l < this.field_150862_g; ++l)
                {
                    int i1 = this.field_150861_f.posY + l;
                    this.field_150867_a.setBlock(j, i1, k, BlockRegistry.BlockChocolatePortal, this.field_150865_b, 2);
                }
            }
        }
    }
/**
* Returns the quantity of items to drop on block destruction.
*/
public int quantityDropped(Random par1Random)
{
return 0;
}
/**
* Triggered whenever an entity collides with this block (enters into the block). Args: world, x, y, z, entity
*/
public void onEntityCollidedWithBlock(World par1World, int par2, int par3, int par4, Entity par5Entity)
{
if ((par5Entity.ridingEntity == null) && (par5Entity.riddenByEntity == null) && ((par5Entity instanceof EntityPlayerMP)))
         {
         EntityPlayerMP thePlayer = (EntityPlayerMP)par5Entity;
         if (thePlayer.timeUntilPortal > 0)
         {
                 thePlayer.timeUntilPortal = 10;
         }
         else if (thePlayer.dimension != WorldGenRegistry.DimID)
         {
                 thePlayer.timeUntilPortal = 10;
                 thePlayer.mcServer.getConfigurationManager().transferPlayerToDimension(thePlayer, WorldGenRegistry.DimID);
         }
         else {
                 thePlayer.timeUntilPortal = 10;
                 thePlayer.mcServer.getConfigurationManager().transferPlayerToDimension(thePlayer, 0, new ChocolateTeleporter(thePlayer.mcServer.worldServerForDimension(0)));
         }
         }
}
@SideOnly(Side.CLIENT)
/**
* Returns which pass should this block be rendered on. 0 for solids and 1 for alpha
*/
public int getRenderBlockPass()
{
return 1;
}
/**
* A randomly called display update to be able to add particles or other items for display
*/
@SideOnly(Side.CLIENT)
public void randomDisplayTick(World p_149734_1_, int p_149734_2_, int p_149734_3_, int p_149734_4_, Random p_149734_5_)
{
    if (p_149734_5_.nextInt(100) == 0)
    {
        p_149734_1_.playSound((double)p_149734_2_ + 0.5D, (double)p_149734_3_ + 0.5D, (double)p_149734_4_ + 0.5D, "portal.portal", 0.5F, p_149734_5_.nextFloat() * 0.4F + 0.8F, false);
    }

    for (int l = 0; l < 4; ++l)
    {
        double d0 = (double)((float)p_149734_2_ + p_149734_5_.nextFloat());
        double d1 = (double)((float)p_149734_3_ + p_149734_5_.nextFloat());
        double d2 = (double)((float)p_149734_4_ + p_149734_5_.nextFloat());
        double d3 = 0.0D;
        double d4 = 0.0D;
        double d5 = 0.0D;
        int i1 = p_149734_5_.nextInt(2) * 2 - 1;
        d3 = ((double)p_149734_5_.nextFloat() - 0.5D) * 0.5D;
        d4 = ((double)p_149734_5_.nextFloat() - 0.5D) * 0.5D;
        d5 = ((double)p_149734_5_.nextFloat() - 0.5D) * 0.5D;

        if (p_149734_1_.getBlock(p_149734_2_ - 1, p_149734_3_, p_149734_4_) != this && p_149734_1_.getBlock(p_149734_2_ + 1, p_149734_3_, p_149734_4_) != this)
        {
            d0 = (double)p_149734_2_ + 0.5D + 0.25D * (double)i1;
            d3 = (double)(p_149734_5_.nextFloat() * 2.0F * (float)i1);
        }
        else
        {
            d2 = (double)p_149734_4_ + 0.5D + 0.25D * (double)i1;
            d5 = (double)(p_149734_5_.nextFloat() * 2.0F * (float)i1);
        }

        p_149734_1_.spawnParticle("portal", d0, d1, d2, d3, d4, d5);
    }
}

public static int func_149999_b(int p_149999_0_)
{
    return p_149999_0_ & 3;
}
@SideOnly(Side.CLIENT)
/**
* only called by clickMiddleMouseButton , and passed to inventory.setCurrentItem (along with isCreative)
*/
public int idPicked(World par1World, int par2, int par3, int par4)
{
return 0;
}




public boolean tryToCreatePortal(World par1World, int par2, int par3, int par4) {
	// TODO Auto-generated method stub
	return false;
}





}
