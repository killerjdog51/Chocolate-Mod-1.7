package com.chocolatemod.tools;

import com.chocolatemod.block.BlockRegistry;
import com.chocolatemod.brewing.brewing;
import com.chocolatemod.plants.PlantRegistry;
import com.google.common.collect.Sets;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;

import java.util.Set;

public class ChocolatePaxel extends ItemGemsTool {
	private static float damageVsEntity;

	protected ChocolatePaxel(ToolMaterial p_i45333_2_, Set field_150914_c) {
		super(damageVsEntity, p_i45333_2_, field_150914_c);
		field_150914_c = Sets.newHashSet(new Block[]{Blocks.planks, Blocks.bookshelf, Blocks.log, Blocks.log2, Blocks.chest, Blocks.pumpkin, Blocks.lit_pumpkin, Blocks.cobblestone, Blocks.double_stone_slab, Blocks.stone_slab, Blocks.stone, Blocks.sandstone, Blocks.mossy_cobblestone, Blocks.iron_ore, Blocks.iron_block, Blocks.coal_ore, Blocks.gold_block, Blocks.gold_ore, Blocks.diamond_ore, Blocks.diamond_block, Blocks.ice, Blocks.netherrack, Blocks.lapis_ore, Blocks.lapis_block, Blocks.redstone_ore, Blocks.lit_redstone_ore, Blocks.rail, Blocks.detector_rail, Blocks.golden_rail, Blocks.activator_rail, Blocks.grass, Blocks.dirt, Blocks.sand, Blocks.gravel, Blocks.snow_layer, Blocks.snow, Blocks.clay, Blocks.farmland, Blocks.soul_sand, Blocks.mycelium, BlockRegistry.chocoCoal, BlockRegistry.chocoCobbleStone, BlockRegistry.chocoCobbleStoneSlabdouble, BlockRegistry.chocoCobbleStoneSlabsingle, BlockRegistry.chocoCobbleStoneStairs, BlockRegistry.chocoDiamond, BlockRegistry.chocoGold, BlockRegistry.chocoGrass, BlockRegistry.chocoIron, BlockRegistry.chocoLapis, BlockRegistry.ChocolateBallMould, BlockRegistry.chocolateblock, BlockRegistry.chocolatebrick, BlockRegistry.chocolatebrickdouble, BlockRegistry.chocolatebrickfence, BlockRegistry.chocolatebricksingle, BlockRegistry.chocolatebrickstairs, BlockRegistry.chocolatechiseled, BlockRegistry.chocolatedouble, BlockRegistry.chocolatefence, BlockRegistry.ChocolateMould, BlockRegistry.chocolateOres, BlockRegistry.chocolatepane, BlockRegistry.chocolatepiller, BlockRegistry.chocolatesingle, BlockRegistry.chocolatestairs, BlockRegistry.chocoRedstone, BlockRegistry.chocoStone, BlockRegistry.cocoaDoor, BlockRegistry.CocoaPlanks, BlockRegistry.CocoaSlabdouble, BlockRegistry.CocoaSlabsingle, BlockRegistry.CocoaStairs, BlockRegistry.cookiesandcreamblock, BlockRegistry.darkchocolatebrickdouble, BlockRegistry.darkchocolatebrickfence, BlockRegistry.darkchocolatebricksingle, BlockRegistry.darkchocolatebrickstairs, BlockRegistry.darkchocolatedouble, BlockRegistry.darkchocolatefence, BlockRegistry.darkchocolatepane, BlockRegistry.darkchocolatesingle, BlockRegistry.darkchocolatestairs, BlockRegistry.fruitychocolateblock, BlockRegistry.goldchocolateblock, BlockRegistry.lightchocolatebrickdouble, BlockRegistry.lightchocolatebrickfence, BlockRegistry.lightchocolatebricksingle, BlockRegistry.lightchocolatebrickstairs, BlockRegistry.lightchocolatedouble, BlockRegistry.lightchocolatefence, BlockRegistry.lightchocolatepane, BlockRegistry.lightchocolatesingle, BlockRegistry.lightchocolatestairs, BlockRegistry.litChocoRedstone, BlockRegistry.mintychocolateblock, BlockRegistry.smallchocolatebrickdouble, BlockRegistry.smallchocolatebricksingle, BlockRegistry.smallchocolatebrickstairs, BlockRegistry.smalldarkchocolatebrickdouble, BlockRegistry.smalldarkchocolatebricksingle, BlockRegistry.smalldarkchocolatebrickstairs, BlockRegistry.smalllightchocolatebrickdouble, BlockRegistry.smalllightchocolatebricksingle, BlockRegistry.smalllightchocolatebrickstairs, BlockRegistry.smallwhitechocolatebrickdouble, BlockRegistry.smallwhitechocolatebricksingle, BlockRegistry.smallwhitechocolatebrickstairs, BlockRegistry.whitechocolatebrickdouble, BlockRegistry.whitechocolatebrickfence, BlockRegistry.whitechocolatebricksingle, BlockRegistry.whitechocolatebrickstairs, BlockRegistry.whitechocolatedouble, BlockRegistry.whitechocolatefence, BlockRegistry.whitechocolatepane, BlockRegistry.whitechocolatesingle, BlockRegistry.whitechocolatestairs, PlantRegistry.chocolatemushroomcapbrown, PlantRegistry.chocolatemushroomcapwhite, PlantRegistry.CocoaLog, brewing.BlockChocolateMilk, brewing.BlockMilkCauldron, brewing.LightBlockChocolateMilk});
	}

	public int getItemEnchantability() {
		return this.toolMaterial.getEnchantability();
	}

	public boolean func_150897_b(Block p_150897_1_) {
		return p_150897_1_ == Blocks.obsidian ? this.toolMaterial.getHarvestLevel() == 3 : (p_150897_1_ != Blocks.diamond_block && p_150897_1_ != Blocks.diamond_ore ? (p_150897_1_ != Blocks.emerald_ore && p_150897_1_ != Blocks.emerald_block ? (p_150897_1_ != Blocks.gold_block && p_150897_1_ != Blocks.gold_ore ? (p_150897_1_ != Blocks.iron_block && p_150897_1_ != Blocks.iron_ore ? (p_150897_1_ != Blocks.lapis_block && p_150897_1_ != Blocks.lapis_ore ? (p_150897_1_ != Blocks.redstone_ore && p_150897_1_ != Blocks.lit_redstone_ore ? (p_150897_1_.getMaterial() == Material.rock ? true : (p_150897_1_.getMaterial() == Material.iron ? true : p_150897_1_.getMaterial() == Material.anvil)) : this.toolMaterial.getHarvestLevel() >= 2) : this.toolMaterial.getHarvestLevel() >= 1) : this.toolMaterial.getHarvestLevel() >= 1) : this.toolMaterial.getHarvestLevel() >= 2) : this.toolMaterial.getHarvestLevel() >= 2) : this.toolMaterial.getHarvestLevel() >= 2);
	}

	public float func_150893_a(ItemStack p_150893_1_, Block p_150893_2_) {
		return p_150893_2_.getMaterial() != Material.iron && p_150893_2_.getMaterial() != Material.anvil && p_150893_2_.getMaterial() != Material.rock ? super.func_150893_a(p_150893_1_, p_150893_2_) : this.efficiencyOnProperMaterial;
	}

	public boolean hitEntity(ItemStack par1ItemStack, EntityLivingBase par2EntityLivingBase, EntityLivingBase par3EntityLivingBase) {
		par1ItemStack.damageItem(2, par3EntityLivingBase);
		return true;
	}
}