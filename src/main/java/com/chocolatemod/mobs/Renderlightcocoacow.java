package com.chocolatemod.mobs;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;


public class Renderlightcocoacow extends RenderLiving {
	public static final ResourceLocation lightcocoacowTextures = new ResourceLocation("killerjdog51:textures/entities/lightcoacoacow.png");

	public Renderlightcocoacow(ModelBase par1ModelBase, float par2) {
		super(par1ModelBase, par2);
	}

	protected ResourceLocation getlightcocoacowTextures(Entitylightcocoacow par1Entitylightcocoacow) {
		return lightcocoacowTextures;
	}

	/**
	 * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
	 */
	protected ResourceLocation getEntityTexture(Entity par1Entity) {
		return this.getlightcocoacowTextures((Entitylightcocoacow) par1Entity);
	}
}
