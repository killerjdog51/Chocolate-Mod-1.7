package com.chocolatemod.mobs;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;

@SideOnly(Side.CLIENT)
public class Renderlightchocolatepig extends RenderLiving {
	private static final ResourceLocation saddledPigTextures = new ResourceLocation("textures/entity/pig/pig_saddle.png");
	private static final ResourceLocation chocolatepigTextures = new ResourceLocation("killerjdog51:textures/entities/lightchocolatepig.png");
	private static final String __OBFID = "CL_00001019";

	public Renderlightchocolatepig(ModelBase par1ModelBase, ModelBase par2ModelBase, float par3) {
		super(par1ModelBase, par3);
		this.setRenderPassModel(par2ModelBase);
	}

	/**
	 * Queries whether should render the specified pass or not.
	 */
	protected int shouldRenderPass(Entitylightchocolatepig par1EntityPig, int par2, float par3) {
		if (par2 == 0 && par1EntityPig.getSaddled()) {
			this.bindTexture(saddledPigTextures);
			return 1;
		} else {
			return -1;
		}
	}

	/**
	 * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
	 */
	protected ResourceLocation getEntityTexture(Entitylightchocolatepig par1EntityPig) {
		return chocolatepigTextures;
	}

	/**
	 * Queries whether should render the specified pass or not.
	 */
	protected int shouldRenderPass(EntityLivingBase par1EntityLivingBase, int par2, float par3) {
		return this.shouldRenderPass((Entitylightchocolatepig) par1EntityLivingBase, par2, par3);
	}

	/**
	 * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
	 */
	protected ResourceLocation getEntityTexture(Entity par1Entity) {
		return this.getEntityTexture((Entitylightchocolatepig) par1Entity);
	}
}