package com.chocolatemod.main;

import cpw.mods.fml.common.network.IGuiHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
//import fisherman77.zeuscraft.common.Zeuscraft;

public class CommonProxy implements IGuiHandler { //THIS IS IMPORTANT, CANNOT BE A PROXY/GUI HANDLER WITHOUT THIS!!

	public void registerRenderInformation() //Client side texture registering
	{
	}

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) { //For GUI's
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) { //For GUI's
		return null;
	}

	public void registerTiles() { //For registering TileEntities
	}

	public void registerBlocks() {
	}

	public void registerItems() {
	}

	public void addRecipes() { //For adding your Item's recipes
	}

	public void registerRenderers() {

	}

	public void registerSounds() {

	}
}