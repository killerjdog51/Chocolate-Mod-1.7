package com.chocolatemod.main;

import com.chocolatemod.mobs.*;
import com.chocolatemod.tools.Renderchocolatearrow;
import com.chocolatemod.tools.entitychocolatearrow;
import cpw.mods.fml.client.registry.RenderingRegistry;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelPig;


public class ClientProxy extends CommonProxy {

	public void registerRenderInformation() {

	}

	@Override
	public void registerRenderers() {

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


