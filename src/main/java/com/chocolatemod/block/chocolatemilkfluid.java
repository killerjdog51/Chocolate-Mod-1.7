package com.chocolatemod.block;

import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;


public class chocolatemilkfluid extends Fluid {
	public chocolatemilkfluid() {
		super("Chocolate Milk");
		setDensity(50); // How tick the fluid is, affects movement inside the liquid.
		setViscosity(1000); // How fast the fluid flows.
		FluidRegistry.registerFluid(this); // Registering inside it self, keeps things neat :)
	}

}