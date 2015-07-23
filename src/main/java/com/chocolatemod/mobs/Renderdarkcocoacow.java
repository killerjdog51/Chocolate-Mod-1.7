package com.chocolatemod.mobs;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;


public class Renderdarkcocoacow extends RenderLiving {
	public static final ResourceLocation darkcocoacowTextures = new ResourceLocation("killerjdog51:textures/entities/darkcoacoacow.png");

	public Renderdarkcocoacow(ModelBase par1ModelBase, float par2) {
		super(par1ModelBase, par2);
	}

	protected ResourceLocation getdarkcocoacowTextures(Entitydarkcocoacow par1Entitydarkcocoacow) {
		return darkcocoacowTextures;
	}

	/**
	 * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
	 */
	protected ResourceLocation getEntityTexture(Entity par1Entity) {
		return this.getdarkcocoacowTextures((Entitydarkcocoacow) par1Entity);
	}
}
