package com.chocolatemod.item;

import com.chocolatemod.block.BlockRegistry;
import com.chocolatemod.liquids.LiquidRegistry;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class ChocolatePortalPlacer extends Item {
	public ChocolatePortalPlacer() {
		super();

	}

	public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int X, int Y, int Z, int par7, float par8, float par9, float par10) {
		if (!par3World.isRemote) {
			int direction = MathHelper.floor_double(par2EntityPlayer.rotationYaw * 4.0F / 360.0F + 0.5D) & 0x3;
			if ((direction == 1) || (direction == 3)) {
				for (int y = 1; y < 5; y++) {
					for (int z = -1; z < 2; z++) {
						if (par3World.getBlockMetadata(X, Y + y, Z + z) != 0) {

						}
					}
				}
				par3World.setBlock(X, Y + 2, Z, BlockRegistry.goldchocolateblock);
				par3World.setBlock(X + 1, Y + 2, Z, BlockRegistry.goldchocolateblock);
				par3World.setBlock(X + 2, Y + 3, Z, BlockRegistry.goldchocolateblock);
				par3World.setBlock(X - 1, Y + 3, Z, BlockRegistry.goldchocolateblock);
				par3World.setBlock(X + 2, Y + 4, Z, BlockRegistry.goldchocolateblock);
				par3World.setBlock(X - 1, Y + 4, Z, BlockRegistry.goldchocolateblock);
				par3World.setBlock(X + 2, Y + 5, Z, BlockRegistry.goldchocolateblock);
				par3World.setBlock(X - 1, Y + 5, Z, BlockRegistry.goldchocolateblock);
				par3World.setBlock(X, Y + 6, Z, BlockRegistry.goldchocolateblock);
				par3World.setBlock(X + 1, Y + 6, Z, BlockRegistry.goldchocolateblock);
				par3World.setBlock(X, Y + 3, Z, LiquidRegistry.darkChocolateMilkBlock);

			} else {
				for (int y = 1; y < 5; y++) {
					for (int x = -1; x < 2; x++) {
						if (par3World.getBlockMetadata(X + x, Y + y, Z) != 0) {

						}
					}
				}
				par3World.setBlock(X, Y + 2, Z, BlockRegistry.goldchocolateblock);
				par3World.setBlock(X + 1, Y + 2, Z, BlockRegistry.goldchocolateblock);
				par3World.setBlock(X + 2, Y + 3, Z, BlockRegistry.goldchocolateblock);
				par3World.setBlock(X - 1, Y + 3, Z, BlockRegistry.goldchocolateblock);
				par3World.setBlock(X + 2, Y + 4, Z, BlockRegistry.goldchocolateblock);
				par3World.setBlock(X - 1, Y + 4, Z, BlockRegistry.goldchocolateblock);
				par3World.setBlock(X + 2, Y + 5, Z, BlockRegistry.goldchocolateblock);
				par3World.setBlock(X - 1, Y + 5, Z, BlockRegistry.goldchocolateblock);
				par3World.setBlock(X, Y + 6, Z, BlockRegistry.goldchocolateblock);
				par3World.setBlock(X + 1, Y + 6, Z, BlockRegistry.goldchocolateblock);
				par3World.setBlock(X, Y + 3, Z, LiquidRegistry.darkChocolateMilkBlock);

			}
			return true;
		}
		return true;
	}
}