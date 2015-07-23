package com.chocolatemod.main;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelPig;
import net.minecraft.client.renderer.entity.RenderArrow;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraftforge.client.MinecraftForgeClient;

import com.chocolatemod.mobs.EntityAlbinoMooshroom;
import com.chocolatemod.mobs.Entitychocolatechicken;
import com.chocolatemod.mobs.Entitychocolateglob;
import com.chocolatemod.mobs.Entitychocolateninja;
import com.chocolatemod.mobs.Entitychocolatepig;
import com.chocolatemod.mobs.Entitycocoacow;
import com.chocolatemod.mobs.Entitydarkchocolateglob;
import com.chocolatemod.mobs.Entitydarkchocolatepig;
import com.chocolatemod.mobs.Entitydarkcocoacow;
import com.chocolatemod.mobs.Entitylightchocolateglob;
import com.chocolatemod.mobs.Entitylightchocolatepig;
import com.chocolatemod.mobs.Entitylightcocoacow;
import com.chocolatemod.mobs.Entitywhitechocolateglob;
import com.chocolatemod.mobs.Entitywhitechocolatepig;
import com.chocolatemod.mobs.Entitywhitecocoacow;
import com.chocolatemod.mobs.ModelAlbinoMooshroom;
import com.chocolatemod.mobs.Modelchocolatechicken;
import com.chocolatemod.mobs.Modelchocolateglob;
import com.chocolatemod.mobs.Modelchocolateninja;
import com.chocolatemod.mobs.Modelcocoacow;
import com.chocolatemod.mobs.Modeldarkcocoacow;
import com.chocolatemod.mobs.Modellightcocoacow;
import com.chocolatemod.mobs.Modelwhitecocoacow;
import com.chocolatemod.mobs.RenderAlbinoMooshroom;
import com.chocolatemod.mobs.Renderchocolatechicken;
import com.chocolatemod.mobs.Renderchocolateglob;
import com.chocolatemod.mobs.Renderchocolateninja;
import com.chocolatemod.mobs.Renderchocolatepig;
import com.chocolatemod.mobs.Rendercocoacow;
import com.chocolatemod.mobs.Renderdarkchocolateglob;
import com.chocolatemod.mobs.Renderdarkchocolatepig;
import com.chocolatemod.mobs.Renderdarkcocoacow;
import com.chocolatemod.mobs.Renderlightchocolateglob;
import com.chocolatemod.mobs.Renderlightchocolatepig;
import com.chocolatemod.mobs.Renderlightcocoacow;
import com.chocolatemod.mobs.Renderwhitechocolateglob;
import com.chocolatemod.mobs.Renderwhitechocolatepig;
import com.chocolatemod.mobs.Renderwhitecocoacow;
import com.chocolatemod.tools.BowRenderer;
import com.chocolatemod.tools.Renderchocolatearrow;
import com.chocolatemod.tools.Tools;
import com.chocolatemod.tools.entitychocolatearrow;

import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;


public class ClientProxy extends CommonProxy {

public void registerRenderInformation() {

}
@Override
public void registerRenderers(){
	
	RenderingRegistry.registerEntityRenderingHandler(Entitycocoacow.class, new Rendercocoacow(new Modelcocoacow(), 0.5F));
	RenderingRegistry.registerEntityRenderingHandler(Entitydarkcocoacow.class, new Renderdarkcocoacow(new Modeldarkcocoacow(), 0.5F));
	RenderingRegistry.registerEntityRenderingHandler(Entitylightcocoacow.class, new Renderlightcocoacow(new Modellightcocoacow(), 0.5F));
	RenderingRegistry.registerEntityRenderingHandler(Entitywhitecocoacow.class, new Renderwhitecocoacow(new Modelwhitecocoacow(), 0.5F));
	RenderingRegistry.registerEntityRenderingHandler(EntityAlbinoMooshroom.class, new RenderAlbinoMooshroom(new ModelAlbinoMooshroom(), 0.5F));
	RenderingRegistry.registerEntityRenderingHandler(Entitychocolatechicken.class, new Renderchocolatechicken(new Modelchocolatechicken(), 0.5F));
	RenderingRegistry.registerEntityRenderingHandler(Entitychocolateglob.class, new Renderchocolateglob(new Modelchocolateglob(16), new Modelchocolateglob(0), 0.25F));
	RenderingRegistry.registerEntityRenderingHandler(Entitydarkchocolateglob.class, new Renderdarkchocolateglob(new Modelchocolateglob(16), new Modelchocolateglob(0), 0.25F));
	RenderingRegistry.registerEntityRenderingHandler(Entitylightchocolateglob.class, new Renderlightchocolateglob(new Modelchocolateglob(16), new Modelchocolateglob(0), 0.25F));
	RenderingRegistry.registerEntityRenderingHandler(Entitywhitechocolateglob.class, new Renderwhitechocolateglob(new Modelchocolateglob(16), new Modelchocolateglob(0), 0.25F));
	RenderingRegistry.registerEntityRenderingHandler(Entitychocolateninja.class, new Renderchocolateninja(new ModelBiped(), 0.5F));
	RenderingRegistry.registerEntityRenderingHandler(Entitychocolatepig.class, new Renderchocolatepig(new ModelPig(), new ModelPig(0.5F), 0.7F));
	RenderingRegistry.registerEntityRenderingHandler(Entitydarkchocolatepig.class, new Renderdarkchocolatepig(new ModelPig(), new ModelPig(0.5F), 0.7F));
	RenderingRegistry.registerEntityRenderingHandler(Entitylightchocolatepig.class, new Renderlightchocolatepig(new ModelPig(), new ModelPig(0.5F), 0.7F));
	RenderingRegistry.registerEntityRenderingHandler(Entitywhitechocolatepig.class, new Renderwhitechocolatepig(new ModelPig(), new ModelPig(0.5F), 0.7F));
    RenderingRegistry.registerEntityRenderingHandler(entitychocolatearrow.class, new Renderchocolatearrow());

	RenderingRegistry.addNewArmourRendererPrefix("ChocolateArmor");
	RenderingRegistry.addNewArmourRendererPrefix("DarkChocolateArmor");
	RenderingRegistry.addNewArmourRendererPrefix("LightChocolateArmor");
	RenderingRegistry.addNewArmourRendererPrefix("WhiteChocolateArmor");
	
	//MinecraftForgeClient.registerItemRenderer(Tools.ChocolateBow, new BowRenderer());
	//MinecraftForgeClient.registerItemRenderer(Tools.DarkChocolateBow, new BowRenderer());
	//MinecraftForgeClient.registerItemRenderer(Tools.LightChocolateBow, new BowRenderer());
	//MinecraftForgeClient.registerItemRenderer(Tools.WhiteChocolateBow, new BowRenderer());

	}
	}


