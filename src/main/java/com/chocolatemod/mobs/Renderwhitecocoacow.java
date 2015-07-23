package com.chocolatemod.mobs;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;


public class Renderwhitecocoacow extends RenderLiving {
	public static final ResourceLocation whitecocoacowTextures = new ResourceLocation("killerjdog51:textures/entities/whitecoacoacow.png");

	public Renderwhitecocoacow(ModelBase par1ModelBase, float par2) {
		super(par1ModelBase, par2);
	}

	protected ResourceLocation getwhitecocoacowTextures(Entitywhitecocoacow par1Entitywhitecocoacow) {
		return whitecocoacowTextures;
	}

	/**
	 * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
	 */
	protected ResourceLocation getEntityTexture(Entity par1Entity) {
		return this.getwhitecocoacowTextures((Entitywhitecocoacow) par1Entity);
	}
}
