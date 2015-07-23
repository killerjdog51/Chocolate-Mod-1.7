package com.chocolatemod.plants;

import com.chocolatemod.item.ItemRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLeavesBase;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.IShearable;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BlockOldCocoaLeaf extends BlockLeavesBase implements IShearable {

	int[] field_150128_a;
	protected int field_150127_b;

	protected BlockOldCocoaLeaf(Material p_i45433_1_, boolean p_i45433_2_) {
		super(Material.leaves, false);
		this.setTickRandomly(true);
		this.setCreativeTab(CreativeTabs.tabDecorations);
		this.setHardness(0.2F);
		this.setLightOpacity(1);
		this.setStepSound(soundTypeGrass);
	}

	private IIcon[] field_150143_M;
	protected IIcon[][] field_150129_M = new IIcon[2][];

	public static final String[][] field_150130_N = new String[][]{{"killerjdog51:leaves_cocoa"}};
	public static final String[] field_150131_O = new String[]{"cocoa"};
	private static final String __OBFID = "CL_00000280";


	public int quantityDropped(Random p_149745_1_) {
		return p_149745_1_.nextInt(20) == 0 ? 1 : 0;
	}

	public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_) {
		return Item.getItemFromBlock(PlantRegistry.cocoasapling);
	}

	/**
	 * Drops the block items with a specified chance of dropping the specified items
	 */
	public void dropBlockAsItemWithChance(World p_149690_1_, int p_149690_2_, int p_149690_3_, int p_149690_4_, int p_149690_5_, float p_149690_6_, int p_149690_7_) {
		super.dropBlockAsItemWithChance(p_149690_1_, p_149690_2_, p_149690_3_, p_149690_4_, p_149690_5_, 1.0f, p_149690_7_);
	}


	protected void func_150124_c(World p_150124_1_, int p_150124_2_, int p_150124_3_, int p_150124_4_, int p_150124_5_, int p_150124_6_) {
		if ((p_150124_5_ & 3) == 0 && p_150124_1_.rand.nextInt(p_150124_6_) == 0) {
			this.dropBlockAsItem(p_150124_1_, p_150124_2_, p_150124_3_, p_150124_4_, new ItemStack(ItemRegistry.rawchocolatelump, 1, 0));
		}

	}

	public void breakBlock(World p_149749_1_, int p_149749_2_, int p_149749_3_, int p_149749_4_, Block p_149749_5_, int p_149749_6_) {
		byte b0 = 1;
		int i1 = b0 + 1;

		if (p_149749_1_.checkChunksExist(p_149749_2_ - i1, p_149749_3_ - i1, p_149749_4_ - i1, p_149749_2_ + i1, p_149749_3_ + i1, p_149749_4_ + i1)) {
			for (int j1 = -b0; j1 <= b0; ++j1) {
				for (int k1 = -b0; k1 <= b0; ++k1) {
					for (int l1 = -b0; l1 <= b0; ++l1) {
						Block block = p_149749_1_.getBlock(p_149749_2_ + j1, p_149749_3_ + k1, p_149749_4_ + l1);
						if (block.isLeaves(p_149749_1_, p_149749_2_ + j1, p_149749_3_ + k1, p_149749_4_ + l1)) {
							block.beginLeavesDecay(p_149749_1_, p_149749_2_ + j1, p_149749_3_ + k1, p_149749_4_ + l1);
						}
					}
				}
			}
		}
	}

	/**
	 * Ticks the block if it's been scheduled
	 */
	public void updateTick(World p_149674_1_, int p_149674_2_, int p_149674_3_, int p_149674_4_, Random p_149674_5_) {
		if (!p_149674_1_.isRemote) {
			int l = p_149674_1_.getBlockMetadata(p_149674_2_, p_149674_3_, p_149674_4_);

			if ((l & 8) != 0 && (l & 4) == 0) {
				byte b0 = 4;
				int i1 = b0 + 1;
				byte b1 = 32;
				int j1 = b1 * b1;
				int k1 = b1 / 2;

				if (this.field_150128_a == null) {
					this.field_150128_a = new int[b1 * b1 * b1];
				}

				int l1;

				if (p_149674_1_.checkChunksExist(p_149674_2_ - i1, p_149674_3_ - i1, p_149674_4_ - i1, p_149674_2_ + i1, p_149674_3_ + i1, p_149674_4_ + i1)) {
					int i2;
					int j2;

					for (l1 = -b0; l1 <= b0; ++l1) {
						for (i2 = -b0; i2 <= b0; ++i2) {
							for (j2 = -b0; j2 <= b0; ++j2) {
								Block block = p_149674_1_.getBlock(p_149674_2_ + l1, p_149674_3_ + i2, p_149674_4_ + j2);

								if (!block.canSustainLeaves(p_149674_1_, p_149674_2_ + l1, p_149674_3_ + i2, p_149674_4_ + j2)) {
									if (block.isLeaves(p_149674_1_, p_149674_2_ + l1, p_149674_3_ + i2, p_149674_4_ + j2)) {
										this.field_150128_a[(l1 + k1) * j1 + (i2 + k1) * b1 + j2 + k1] = -2;
									} else {
										this.field_150128_a[(l1 + k1) * j1 + (i2 + k1) * b1 + j2 + k1] = -1;
									}
								} else {
									this.field_150128_a[(l1 + k1) * j1 + (i2 + k1) * b1 + j2 + k1] = 0;
								}
							}
						}
					}

					for (l1 = 1; l1 <= 5; ++l1) {
						for (i2 = -b0; i2 <= b0; ++i2) {
							for (j2 = -b0; j2 <= b0; ++j2) {
								for (int k2 = -b0; k2 <= b0; ++k2) {
									if (this.field_150128_a[(i2 + k1) * j1 + (j2 + k1) * b1 + k2 + k1] == l1 - 1) {
										if (this.field_150128_a[(i2 + k1 - 1) * j1 + (j2 + k1) * b1 + k2 + k1] == -2) {
											this.field_150128_a[(i2 + k1 - 1) * j1 + (j2 + k1) * b1 + k2 + k1] = l1;
										}

										if (this.field_150128_a[(i2 + k1 + 1) * j1 + (j2 + k1) * b1 + k2 + k1] == -2) {
											this.field_150128_a[(i2 + k1 + 1) * j1 + (j2 + k1) * b1 + k2 + k1] = l1;
										}

										if (this.field_150128_a[(i2 + k1) * j1 + (j2 + k1 - 1) * b1 + k2 + k1] == -2) {
											this.field_150128_a[(i2 + k1) * j1 + (j2 + k1 - 1) * b1 + k2 + k1] = l1;
										}

										if (this.field_150128_a[(i2 + k1) * j1 + (j2 + k1 + 1) * b1 + k2 + k1] == -2) {
											this.field_150128_a[(i2 + k1) * j1 + (j2 + k1 + 1) * b1 + k2 + k1] = l1;
										}

										if (this.field_150128_a[(i2 + k1) * j1 + (j2 + k1) * b1 + (k2 + k1 - 1)] == -2) {
											this.field_150128_a[(i2 + k1) * j1 + (j2 + k1) * b1 + (k2 + k1 - 1)] = l1;
										}

										if (this.field_150128_a[(i2 + k1) * j1 + (j2 + k1) * b1 + k2 + k1 + 1] == -2) {
											this.field_150128_a[(i2 + k1) * j1 + (j2 + k1) * b1 + k2 + k1 + 1] = l1;
										}
									}
								}
							}
						}
					}
				}

				l1 = this.field_150128_a[k1 * j1 + k1 * b1 + k1];

				if (l1 >= 0) {
					p_149674_1_.setBlockMetadataWithNotify(p_149674_2_, p_149674_3_, p_149674_4_, l & -9, 5);
				} else {
					this.removeLeaves(p_149674_1_, p_149674_2_, p_149674_3_, p_149674_4_);
				}
			}
		}
	}

	@SideOnly(Side.CLIENT)
	public void randomDisplayTick(World p_149734_1_, int p_149734_2_, int p_149734_3_, int p_149734_4_, Random p_149734_5_) {
		if (p_149734_1_.canLightningStrikeAt(p_149734_2_, p_149734_3_ + 1, p_149734_4_) && !World.doesBlockHaveSolidTopSurface(p_149734_1_, p_149734_2_, p_149734_3_ - 1, p_149734_4_) && p_149734_5_.nextInt(15) == 1) {
			double d0 = (double) ((float) p_149734_2_ + p_149734_5_.nextFloat());
			double d1 = (double) p_149734_3_ - 0.05D;
			double d2 = (double) ((float) p_149734_4_ + p_149734_5_.nextFloat());
			p_149734_1_.spawnParticle("dripWater", d0, d1, d2, 0.0D, 0.0D, 0.0D);
		}
	}

	private void removeLeaves(World p_150126_1_, int p_150126_2_, int p_150126_3_, int p_150126_4_) {
		this.dropBlockAsItem(p_150126_1_, p_150126_2_, p_150126_3_, p_150126_4_, p_150126_1_.getBlockMetadata(p_150126_2_, p_150126_3_, p_150126_4_), 1);
		p_150126_1_.setBlockToAir(p_150126_2_, p_150126_3_, p_150126_4_);
	}


	public boolean isOpaqueCube() {
		return true;
	}

	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int p_149691_1_, int p_149691_2_) {
		return (this.field_150129_M[this.field_150127_b][0]);
	}

	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister) {
		this.blockIcon = iconRegister.registerIcon("killerjdog51:leaves_cocoa");
	}


	@SideOnly(Side.CLIENT)
	public void getSubBlocks(Item p_149666_1_, CreativeTabs p_149666_2_, List p_149666_3_) {
		p_149666_3_.add(new ItemStack(p_149666_1_, 1, 0));

	}

	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister p_149651_1_) {
		for (int i = 0; i < field_150130_N.length; ++i) {
			this.field_150129_M[i] = new IIcon[field_150130_N[i].length];

			for (int j = 0; j < field_150130_N[i].length; ++j) {
				this.field_150129_M[i][j] = p_149651_1_.registerIcon(field_150130_N[i][j]);
			}
		}
	}

	public String[] func_150125_e() {
		return field_150131_O;
	}

	protected int func_150123_b(int p_150123_1_) {
		return 20;
	}

	/**
	 * Returns an item stack containing a single instance of the current block type. 'i' is the block's subtype/damage
	 * and is ignored for blocks which do not support subtypes. Blocks which cannot be harvested should return null.
	 */
	protected ItemStack createStackedBlock(int p_149644_1_) {
		return new ItemStack(Item.getItemFromBlock(this), 1, p_149644_1_ & 0);
	}


	/**
	 * Called when the player destroys a block with an item that can harvest it. (i, j, k) are the coordinates of the
	 * block and l is the block's subtype/damage.
	 */
	public void harvestBlock(World p_149636_1_, EntityPlayer p_149636_2_, int p_149636_3_, int p_149636_4_, int p_149636_5_, int p_149636_6_) {
		{
			super.harvestBlock(p_149636_1_, p_149636_2_, p_149636_3_, p_149636_4_, p_149636_5_, p_149636_6_);
		}
	}

	public boolean isShearable(ItemStack item, IBlockAccess world, int x,
							   int y, int z) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList<ItemStack> getDrops(World world, int x, int y, int z, int metadata, int fortune) {
		ArrayList<ItemStack> ret = new ArrayList<ItemStack>();
		int chance = this.func_150123_b(metadata);

		if (fortune > 0) {
			chance -= 2 << fortune;
			if (chance < 10) chance = 10;
		}

		if (world.rand.nextInt(chance) == 0)
			ret.add(new ItemStack(this.getItemDropped(metadata, world.rand, fortune), 1, this.damageDropped(metadata)));

		chance = 200;
		if (fortune > 0) {
			chance -= 10 << fortune;
			if (chance < 40) chance = 40;
		}

		this.captureDrops(true);
		this.func_150124_c(world, x, y, z, metadata, chance); // Dammet mojang
		ret.addAll(this.captureDrops(false));
		return ret;
	}

	public ArrayList<ItemStack> onSheared(ItemStack item, IBlockAccess world, int x, int y, int z, int fortune) {
		ArrayList<ItemStack> ret = new ArrayList<ItemStack>();
		ret.add(new ItemStack(this, 1, world.getBlockMetadata(x, y, z) & 4));
		return ret;
	}

	@Override
	public void beginLeavesDecay(World world, int x, int y, int z) {

		int i2 = world.getBlockMetadata(x, y, z);

		if ((i2 & 8) == 1) {
			world.setBlockMetadataWithNotify(x, y, z, i2 | 8, 4);
		}
		world.setBlockMetadataWithNotify(x, y, z, world.getBlockMetadata(x, y, z) | 8, 4);
	}

	@Override
	public boolean isLeaves(IBlockAccess world, int x, int y, int z) {
		return true;
	}


}

