package com.chocolatemod.liquids;

import com.chocolatemod.block.BlockRegistry;
import com.chocolatemod.main.MainRegistry;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fluids.Fluid;

public class BlockMoltenCaramel extends BlockFluidClassic {

        @SideOnly(Side.CLIENT)
        protected IIcon stillIcon;
        @SideOnly(Side.CLIENT)
        protected IIcon flowingIcon;
        
        public BlockMoltenCaramel(Fluid fluid, Material material) {
                super(fluid, material);
                setCreativeTab(MainRegistry.tabChocolateBlocks);
                this.setDensity(8000);
                this.setLightLevel(.5F);
                this.tickRate = fluid.getViscosity() / 20;
                }
        
        @Override
        public IIcon getIcon(int side, int meta) {
                return (side == 0 || side == 1)? stillIcon : flowingIcon;
        }
        
        @SideOnly(Side.CLIENT)
        @Override
        public void registerBlockIcons(IIconRegister register) {
                stillIcon = register.registerIcon("killerjdog51:moltencaramel_still");
                flowingIcon = register.registerIcon("killerjdog51:moltencaramel_flow");
        }
        
        @Override
        public boolean canDisplace(IBlockAccess world, int x, int y, int z) {
                if (world.getBlock(x,  y,  z).getMaterial().isLiquid()) return false;
                return super.canDisplace(world, x, y, z);
        }
        
        @Override
        public boolean displaceIfPossible(World world, int x, int y, int z) {
                if (world.getBlock(x,  y,  z).getMaterial().isLiquid()) return false;
                return super.displaceIfPossible(world, x, y, z);
        }
        
        

        @Override
        public void onNeighborBlockChange(World world, int x, int y, int z, Block block)
        {
           this.updateBlockState(world, x, y, z);
        }
        
        void updateBlockState(World world, int x, int y, int z)
        {
           if (world.getBlock(x, y, z) == this)
           {
              boolean flag = false;

              if (flag || world.getBlock(x, y, z - 1).getMaterial() == Material.water)
              {
                 flag = true;
              }
              if (flag || world.getBlock(x, y, z + 1).getMaterial() == Material.water)
              {
                 flag = true;
              }
              if (flag || world.getBlock(x - 1, y, z).getMaterial() == Material.water)
              {
                 flag = true;
              }
              if (flag || world.getBlock(x + 1, y, z).getMaterial() == Material.water)
              {
                 flag = true;
              }
              if (flag || world.getBlock(x, y + 1, z).getMaterial() == Material.water)
              {
                 flag = true;
              }
              if (flag)
              {
                 int meta = world.getBlockMetadata(x, y, z);

                 if (meta == 0)
                 {
                    world.setBlock(x, y, z, BlockRegistry.caramelBlock, 5, 3);
                 }
                 else if (meta <= 7)
                 {
                    world.setBlock(x, y, z, BlockRegistry.caramelBlock, 0, 3);
                 }
                 world.playSoundEffect(x + 0.5F, y + 0.5F, z + 0.5F, "random.fizz", 0.5F, 2.6F + (world.rand.nextFloat() - world.rand.nextFloat()) * 0.8F);

                 for (int i = 0; i < 8; i++)
                 {
                    world.spawnParticle("largesmoke", x + Math.random(), y + 1.2D, z + Math.random(), 0.0D, 0.0D, 0.0D);
                 }
              }
           }
        }

        /*@Override
        public void updateTick(World world, int x, int y, int z, Random rand)
        {
           super.updateTick(world, x, y, z, rand);

           if (this.getMaterial(world, x, y - 1, z))
           {
              if (this.blockMaterial == Material.lava && world.getBlock(x, y - 1, z).getMaterial() == Material.water)
              {
                 world.setBlock(x, y - 1, z, Blocks.cobblestone, 2, 3);
                 world.playSoundEffect(x + 0.5F, y + 0.5F, z + 0.5F, "random.fizz", 0.5F, 2.6F + (world.rand.nextFloat() - world.rand.nextFloat()) * 0.8F);

                 for (int i = 0; i < 8; ++i)
                 {
                    world.spawnParticle("largesmoke", x + Math.random(), y + 1.2D, z + Math.random(), 0.0D, 0.0D, 0.0D);
                 }
                 return;
              }
           }
        }

        private boolean getMaterial(World world, int x, int y, int z)
        {
           Material localMaterial = world.getBlock(x, y, z).getMaterial();

           if (localMaterial == this.blockMaterial)
           {
              return false;
           }
           if (localMaterial == Material.lava)
           {
              return false;
           }
           return !this.displace(world, x, y, z);
        }

        private boolean displace(World world, int x, int y, int z)
        {
           Block localBlock = world.getBlock(x, y, z);

           if (localBlock == Blocks.wooden_door || localBlock == Blocks.iron_door || localBlock == Blocks.standing_sign || localBlock == Blocks.ladder || localBlock == Blocks.reeds)
           {
              return true;
           }
           if (localBlock.getMaterial() == Material.portal)
           {
              return true;
           }
           return localBlock.getMaterial().blocksMovement();
        }*/
}