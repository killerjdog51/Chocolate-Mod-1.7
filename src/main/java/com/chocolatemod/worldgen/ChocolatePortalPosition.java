package com.chocolatemod.worldgen;

import net.minecraft.util.ChunkCoordinates;

public class ChocolatePortalPosition extends ChunkCoordinates {
	public long field_85087_d;
	final ChocolateTeleporter field_85088_e;

	public ChocolatePortalPosition(ChocolateTeleporter ChocolateTeleporter, int par2, int par3, int par4, long par5) {
		super(par2, par3, par4);
		this.field_85088_e = ChocolateTeleporter;
		this.field_85087_d = par5;
	}
}