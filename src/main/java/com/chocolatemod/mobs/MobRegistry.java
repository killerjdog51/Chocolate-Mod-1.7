package com.chocolatemod.mobs;

import com.chocolatemod.lib.Strings;
import com.chocolatemod.main.MainRegistry;
import com.chocolatemod.tools.entitychocolatearrow;
import cpw.mods.fml.common.registry.EntityRegistry;
import net.minecraft.entity.EntityList;

public class MobRegistry {
	public static void mainRegistry() {

		int ChocolatePig = EntityRegistry.findGlobalUniqueEntityId();

		int CocoaCowID = EntityRegistry.findGlobalUniqueEntityId();
		EntityRegistry.registerGlobalEntityID(Entitycocoacow.class, "Cocoa Cow", CocoaCowID);
		EntityRegistry.registerModEntity(Entitycocoacow.class, "Cocoa Cow", CocoaCowID, MainRegistry.modInstance, 64, 1, true);
		EntityList.entityEggs.put(Integer.valueOf(CocoaCowID), new EntityList.EntityEggInfo(CocoaCowID, 0x4A2709, 10592673));
		registerEntity(Entitycocoacow.class, "Cocoa Cow");

		int DarkCocoaCowID = EntityRegistry.findGlobalUniqueEntityId();
		EntityRegistry.registerGlobalEntityID(Entitydarkcocoacow.class, "Dark Cocoa Cow", DarkCocoaCowID);
		EntityRegistry.registerModEntity(Entitydarkcocoacow.class, "Dark Cocoa Cow", DarkCocoaCowID, MainRegistry.modInstance, 64, 1, true);
		EntityList.entityEggs.put(Integer.valueOf(DarkCocoaCowID), new EntityList.EntityEggInfo(DarkCocoaCowID, 0x261505, 10592673));
		registerEntity(Entitydarkcocoacow.class, "Dark Cocoa Cow");

		int LightCocoaCowID = EntityRegistry.findGlobalUniqueEntityId();
		EntityRegistry.registerGlobalEntityID(Entitylightcocoacow.class, "Light Cocoa Cow", LightCocoaCowID);
		EntityRegistry.registerModEntity(Entitylightcocoacow.class, "Light Cocoa Cow", LightCocoaCowID, MainRegistry.modInstance, 64, 1, true);
		EntityList.entityEggs.put(Integer.valueOf(LightCocoaCowID), new EntityList.EntityEggInfo(LightCocoaCowID, 0x824611, 10592673));
		registerEntity(Entitylightcocoacow.class, "Light Cocoa Cow");

		int WhiteCocoaCowID = EntityRegistry.findGlobalUniqueEntityId();
		EntityRegistry.registerGlobalEntityID(Entitywhitecocoacow.class, "White Cocoa Cow", WhiteCocoaCowID);
		EntityRegistry.registerModEntity(Entitywhitecocoacow.class, "White Cocoa Cow", WhiteCocoaCowID, MainRegistry.modInstance, 64, 1, true);
		EntityList.entityEggs.put(Integer.valueOf(WhiteCocoaCowID), new EntityList.EntityEggInfo(WhiteCocoaCowID, 0xe7d558, 10592673));
		registerEntity(Entitywhitecocoacow.class, "White Cocoa Cow");

		int AlbinoMooshroomID = EntityRegistry.findGlobalUniqueEntityId();
		EntityRegistry.registerGlobalEntityID(EntityAlbinoMooshroom.class, "Albino Mooshroom", AlbinoMooshroomID);
		EntityRegistry.registerModEntity(EntityAlbinoMooshroom.class, "Albino Mooshroom", AlbinoMooshroomID, MainRegistry.modInstance, 64, 1, true);
		EntityList.entityEggs.put(Integer.valueOf(AlbinoMooshroomID), new EntityList.EntityEggInfo(AlbinoMooshroomID, 0xD6D2D2, 0x4A2709));
		registerEntity(EntityAlbinoMooshroom.class, "Albino Mooshroom");

		int ChocolateChickenID = EntityRegistry.findGlobalUniqueEntityId();
		EntityRegistry.registerGlobalEntityID(Entitychocolatechicken.class, "Chocolate Chicken", ChocolateChickenID);
		EntityRegistry.registerModEntity(Entitychocolatechicken.class, "Chocolate Chicken", ChocolateChickenID, MainRegistry.modInstance, 64, 1, true);
		EntityList.entityEggs.put(Integer.valueOf(ChocolateChickenID), new EntityList.EntityEggInfo(ChocolateChickenID, 0x4A2709, 0x824611));
		createEntity(Entitychocolatechicken.class, "Chocolate Chicken");

		int ChocolateGlobID = EntityRegistry.findGlobalUniqueEntityId();
		EntityRegistry.registerGlobalEntityID(Entitychocolateglob.class, "Chocolate Glob", ChocolateGlobID);
		EntityRegistry.registerModEntity(Entitychocolateglob.class, "Chocolate Glob", ChocolateGlobID, MainRegistry.modInstance, 64, 1, true);
		EntityList.entityEggs.put(Integer.valueOf(ChocolateGlobID), new EntityList.EntityEggInfo(ChocolateGlobID, 0x4A2709, 0x824611));
		registerEntity(Entitychocolateglob.class, "Chocolate Glob");

		int DarkChocolateGlobID = EntityRegistry.findGlobalUniqueEntityId();
		EntityRegistry.registerGlobalEntityID(Entitydarkchocolateglob.class, "Dark Chocolate Glob", DarkChocolateGlobID);
		EntityRegistry.registerModEntity(Entitydarkchocolateglob.class, "Dark Chocolate Glob", DarkChocolateGlobID, MainRegistry.modInstance, 64, 1, true);
		EntityList.entityEggs.put(Integer.valueOf(DarkChocolateGlobID), new EntityList.EntityEggInfo(DarkChocolateGlobID, 0x261505, 0x824611));
		registerEntity(Entitydarkchocolateglob.class, "Dark Chocolate Glob");

		int LightChocolateGlobID = EntityRegistry.findGlobalUniqueEntityId();
		EntityRegistry.registerGlobalEntityID(Entitylightchocolateglob.class, "Light Chocolate Glob", LightChocolateGlobID);
		EntityRegistry.registerModEntity(Entitylightchocolateglob.class, "Light Chocolate Glob", LightChocolateGlobID, MainRegistry.modInstance, 64, 1, true);
		EntityList.entityEggs.put(Integer.valueOf(LightChocolateGlobID), new EntityList.EntityEggInfo(LightChocolateGlobID, 0x824611, 0x824611));
		registerEntity(Entitylightchocolateglob.class, "Light Chocolate Glob");

		int WhiteChocolateGlobID = EntityRegistry.findGlobalUniqueEntityId();
		EntityRegistry.registerGlobalEntityID(Entitywhitechocolateglob.class, "White Chocolate Glob", WhiteChocolateGlobID);
		EntityRegistry.registerModEntity(Entitywhitechocolateglob.class, "White Chocolate Glob", WhiteChocolateGlobID, MainRegistry.modInstance, 64, 1, true);
		EntityList.entityEggs.put(Integer.valueOf(WhiteChocolateGlobID), new EntityList.EntityEggInfo(WhiteChocolateGlobID, 0xe7d558, 0x824611));
		registerEntity(Entitywhitechocolateglob.class, "White Chocolate Glob");

		int ChocolateNinjaID = EntityRegistry.findGlobalUniqueEntityId();
		EntityRegistry.registerGlobalEntityID(Entitychocolateninja.class, "Chocolate Ninja", ChocolateNinjaID);
		EntityRegistry.registerModEntity(Entitychocolateninja.class, "Chocolate Ninja", ChocolateNinjaID, MainRegistry.modInstance, 64, 1, true);
		EntityList.entityEggs.put(Integer.valueOf(ChocolateNinjaID), new EntityList.EntityEggInfo(ChocolateNinjaID, 0x4A2709, 0x824611));
		registerEntity(Entitychocolateninja.class, "Chocolate Ninja");

		int ChocolateBarPigID = EntityRegistry.findGlobalUniqueEntityId();
		EntityRegistry.registerGlobalEntityID(Entitychocolatepig.class, "ChocolateBar Pig", ChocolateBarPigID);
		EntityRegistry.registerModEntity(Entitychocolatepig.class, "ChocolateBar Pig", ChocolateBarPigID, MainRegistry.modInstance, 64, 1, true);
		EntityList.entityEggs.put(Integer.valueOf(ChocolateBarPigID), new EntityList.EntityEggInfo(ChocolateBarPigID, 0x4A2709, 0x824611));
		registerEntity(Entitychocolatepig.class, "ChocolateBar Pig");

		int DarkChocolateBarPigID = EntityRegistry.findGlobalUniqueEntityId();
		EntityRegistry.registerGlobalEntityID(Entitydarkchocolatepig.class, "Dark ChocolateBar Pig", DarkChocolateBarPigID);
		EntityRegistry.registerModEntity(Entitydarkchocolatepig.class, "Dark ChocolateBar Pig", DarkChocolateBarPigID, MainRegistry.modInstance, 64, 1, true);
		EntityList.entityEggs.put(Integer.valueOf(DarkChocolateBarPigID), new EntityList.EntityEggInfo(DarkChocolateBarPigID, 0x261505, 0x824611));
		registerEntity(Entitydarkchocolatepig.class, "Dark ChocolateBar Pig");

		int LightChocolateBarPigID = EntityRegistry.findGlobalUniqueEntityId();
		EntityRegistry.registerGlobalEntityID(Entitylightchocolatepig.class, "Light ChocolateBar Pig", LightChocolateBarPigID);
		EntityRegistry.registerModEntity(Entitylightchocolatepig.class, "LightChocolateBar Pig", LightChocolateBarPigID, MainRegistry.modInstance, 64, 1, true);
		EntityList.entityEggs.put(Integer.valueOf(LightChocolateBarPigID), new EntityList.EntityEggInfo(LightChocolateBarPigID, 0x824611, 0x824611));
		registerEntity(Entitylightchocolatepig.class, "Light ChocolateBar Pig");

		int WhiteChocolateBarPigID = EntityRegistry.findGlobalUniqueEntityId();
		EntityRegistry.registerGlobalEntityID(Entitywhitechocolatepig.class, "White ChocolateBar Pig", WhiteChocolateBarPigID);
		EntityRegistry.registerModEntity(Entitywhitechocolatepig.class, "White ChocolateBar Pig", WhiteChocolateBarPigID, MainRegistry.modInstance, 64, 1, true);
		EntityList.entityEggs.put(Integer.valueOf(WhiteChocolateBarPigID), new EntityList.EntityEggInfo(WhiteChocolateBarPigID, 0xe7d558, 0x824611));
		registerEntity(Entitywhitechocolatepig.class, "White ChocolateBar Pig");

		EntityRegistry.registerModEntity(entitychocolatearrow.class, "ChocolateArrow", 1, Strings.MODID, 128, 1, true);
	}

	private static void createEntity(Class<Entitychocolatechicken> class1,
									 String string) {
		// TODO Auto-generated method stub

	}

	public static void registerEntity(Class class1, String string) {
		// TODO Auto-generated method stub

	}

	public static void registerMob() {


	}


}