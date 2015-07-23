package com.chocolatemod.mobs;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.MathHelper;
import net.minecraft.util.ResourceLocation;

@SideOnly(Side.CLIENT)
public class Renderchocolatechicken extends RenderLiving {
	private static final ResourceLocation chocolatechickenTextures = new ResourceLocation("killerjdog51:textures/entities/chocolatechicken.png");

	public Renderchocolatechicken(ModelBase par1ModelBase, float par2) {
		super(par1ModelBase, par2);
	}

	public void renderchocolatechicken(Entitychocolatechicken par1Entitychocolatechicken, double par2, double par4, double par6, float par8, float par9) {
		super.doRender(par1Entitychocolatechicken, par2, par4, par6, par8, par9);
	}

	protected ResourceLocation getchocolatechickenTextures(Entitychocolatechicken par1Entitychocolatechicken) {
		return chocolatechickenTextures;
	}

	protected float getWingRotation(Entitychocolatechicken par1Entitychocolatechicken, float par2) {
		float var3 = par1Entitychocolatechicken.field_70888_h + (par1Entitychocolatechicken.field_70886_e - par1Entitychocolatechicken.field_70888_h) * par2;
		float var4 = par1Entitychocolatechicken.field_70884_g + (par1Entitychocolatechicken.destPos - par1Entitychocolatechicken.field_70884_g) * par2;
		return (MathHelper.sin(var3) + 1.0F) * var4;
	}

	public void doRenderLiving(EntityLiving par1EntityLiving, double par2, double par4, double par6, float par8, float par9) {
		this.renderchocolatechicken((Entitychocolatechicken) par1EntityLiving, par2, par4, par6, par8, par9);
	}

	/**
	 * Defines what float the third param in setRotationAngles of ModelBase is
	 */
	protected float handleRotationFloat(EntityLivingBase par1EntityLivingBase, float par2) {
		return this.getWingRotation((Entitychocolatechicken) par1EntityLivingBase, par2);
	}

	public void renderPlayer(EntityLivingBase par1EntityLivingBase, double par2, double par4, double par6, float par8, float par9) {
		this.renderchocolatechicken((Entitychocolatechicken) par1EntityLivingBase, par2, par4, par6, par8, par9);
	}

	/**
	 * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
	 */
	protected ResourceLocation getEntityTexture(Entity par1Entity) {
		return this.getchocolatechickenTextures((Entitychocolatechicken) par1Entity);
	}

	/**
	 * Actually renders the given argument. This is a synthetic bridge method, always casting down its argument and then
	 * handing it off to a worker function which does the actual work. In all probabilty, the class Render is generic
	 * (Render<T extends Entity) and this method has signature public void doRender(T entity, double d, double d1,
	 * double d2, float f, float f1). But JAD is pre 1.5 so doesn't do that.
	 */
	public void doRender(Entity par1Entity, double par2, double par4, double par6, float par8, float par9) {
		this.renderchocolatechicken((Entitychocolatechicken) par1Entity, par2, par4, par6, par8, par9);
	}
}
