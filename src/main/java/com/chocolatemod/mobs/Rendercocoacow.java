package com.chocolatemod.mobs;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;


public class Rendercocoacow extends RenderLiving {

	public static final ResourceLocation cocoacowTextures = new ResourceLocation("killerjdog51:textures/entities/coacoacow.png");

	public Rendercocoacow(ModelBase par1ModelBase, float par2) {
		super(par1ModelBase, par2);
	}

	protected ResourceLocation getcocoacowTextures(Entitycocoacow par1Entitycocoacow) {
		return cocoacowTextures;
	}

	/**
	 * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
	 */
	protected ResourceLocation getEntityTexture(Entity par1Entity) {
		return this.getcocoacowTextures((Entitycocoacow) par1Entity);
	}
}
