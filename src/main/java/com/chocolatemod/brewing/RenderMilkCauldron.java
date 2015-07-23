package com.chocolatemod.brewing;

import cpw.mods.fml.client.registry.ISimpleBlockRenderingHandler;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.EntityRenderer;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;

public class RenderMilkCauldron implements ISimpleBlockRenderingHandler {
	@Override
	public void renderInventoryBlock(Block block, int metadata, int modelID, RenderBlocks renderer) {
	}

	@Override
	public boolean renderWorldBlock(IBlockAccess world, int i, int j, int k, Block block, int modelId, RenderBlocks renderer) {
		renderer.renderStandardBlock(block, i, j, k);
		Tessellator tessellator = Tessellator.instance;
		tessellator.setBrightness(block.getMixedBrightnessForBlock(world, i, j, k));
		float f = 1.0F;
		int l = block.colorMultiplier(world, i, j, k);
		float f1 = (float) (l >> 16 & 255) / 255.0F;
		float f2 = (float) (l >> 8 & 255) / 255.0F;
		float f3 = (float) (l & 255) / 255.0F;
		float f4;

		if (EntityRenderer.anaglyphEnable) {
			float f5 = (f1 * 30.0F + f2 * 59.0F + f3 * 11.0F) / 100.0F;
			f4 = (f1 * 30.0F + f2 * 70.0F) / 100.0F;
			float f6 = (f1 * 30.0F + f3 * 70.0F) / 100.0F;
			f1 = f5;
			f2 = f4;
			f3 = f6;
		}

		// xpos south
		// xneg north
		// zpos west
		// zneg east
		// ypos top
		// yneg bottom

		tessellator.setColorOpaque_F(f * f1, f * f2, f * f3);
		IIcon icon = block.getBlockTextureFromSide(2);
		f4 = 0.125F;
		renderer.renderFaceXPos(block, (double) ((float) i - 1.0F + f4), (double) j, (double) k, icon);
		renderer.renderFaceXNeg(block, (double) ((float) i + 1.0F - f4), (double) j, (double) k, icon);
		renderer.renderFaceZPos(block, (double) i, (double) j, (double) ((float) k - 1.0F + f4), icon);
		renderer.renderFaceZNeg(block, (double) i, (double) j, (double) ((float) k + 1.0F - f4), icon);
		IIcon icon1 = BlockMilkCauldron.milkCauldronTex[0];
		renderer.renderFaceYPos(block, (double) i, (double) ((float) j - 1.0F + 0.25F), (double) k, icon1);
		renderer.renderFaceYNeg(block, (double) i, (double) ((float) j + 1.0F - 0.75F), (double) k, icon1);

		int meta = world.getBlockMetadata(i, j, k);
		IIcon icon2 = BlockMilkCauldron.milkCauldronTex[0];

		switch (meta) {
			case 0:
				icon2 = BlockMilkCauldron.milkLiquidTex[0];
				break;
			case 1:
				icon2 = BlockMilkCauldron.milkLiquidTex[1];
				break;
			case 2:
				icon2 = BlockMilkCauldron.milkLiquidTex[2];
				break;
			case 3:
			case 4:
				icon2 = BlockMilkCauldron.milkLiquidTex[3];
				break;
			case 5:
				icon2 = BlockMilkCauldron.milkLiquidTex[4];
				break;
			case 6:
				icon2 = BlockMilkCauldron.milkLiquidTex[5];
				break;
			case 7:
			case 8:
			case 9:
				icon2 = BlockMilkCauldron.milkLiquidTex[6];
				break;
			case 10:
				icon2 = BlockMilkCauldron.milkLiquidTex[7];
				break;
		}

		if (meta < 25) {
			renderer.renderFaceYPos(block, (double) i, (double) ((float) j - 1.0F + (6.0F + (float) 3 * 3.0F) / 16.0F), (double) k, icon2);
		}


		return true;
	}

	public boolean shouldRender3DInInventory() {
		return false;
	}

	@Override
	public int getRenderId() {
		return brewing.milkCauldronRenderID;
	}

	@Override
	public boolean shouldRender3DInInventory(int modelId) {
		// TODO Auto-generated method stub
		return false;
	}
}