package com.chocolatemod.food;

import com.chocolatemod.main.MainRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;

import java.util.List;

public class chocolateball3 extends ItemFood {

	/**
	 * List of item names
	 */
	public static final String[] itemMetaNames = new String[]{"default.fruity.nuts", "dark.fruity.nuts", "light.fruity.nuts", "white.fruity.nuts", "default.fruity.minty", "dark.fruity.minty", "light.fruity.minty", "white.fruity.minty", "default.minty.nuts", "dark.minty.nuts", "light.minty.nuts", "white.minty.nuts"};
	public static final String[] field_94595_b = new String[]{"default_fruit_nuts", "dark_fruit_nuts", "light_fruit_nuts", "white_fruit_nuts", "default_fruit_minty", "dark_fruit_minty", "light_fruit_minty", "white_fruit_minty", "default_minty_nuts", "dark_minty_nuts", "light_minty_nuts", "white_minty_nuts"};

	@SideOnly(Side.CLIENT)
	private IIcon[] field_94594_d;

	public chocolateball3(int i, float f, boolean b) {
		super(i, f, b);
		this.setHasSubtypes(true);
		this.setMaxDamage(0);
		this.setCreativeTab(MainRegistry.tabChocolateFood);
	}

	@SideOnly(Side.CLIENT)

/**
 * Gets an icon index based on an item's damage value
 */
	public IIcon getIconFromDamage(int par1) {
		int j = MathHelper.clamp_int(par1, 0, 11);
		return this.field_94594_d[j];
	}

	/**
	 * Returns the unlocalized name of this item. This version accepts an ItemStack so different stacks can have
	 * different names based on their damage or NBT.
	 */
	public String getUnlocalizedName(ItemStack par1ItemStack) {
		int i = MathHelper.clamp_int(par1ItemStack.getItemDamage(), 0, 11);
		return super.getUnlocalizedName() + "." + itemMetaNames[i];
	}

	@SideOnly(Side.CLIENT)

/**
 * returns a list of items with the same ID, but different meta (eg: dye returns 16 items)
 */
	public void getSubItems(Item par1, CreativeTabs par2CreativeTabs, List par3List) {
		for (int j = 0; j < 12; ++j) {
			par3List.add(new ItemStack(par1, 1, j));
		}
	}

	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister par1IconRegister) {
		this.field_94594_d = new IIcon[field_94595_b.length];

		for (int i = 0; i < field_94595_b.length; ++i) {
			this.field_94594_d[i] = par1IconRegister.registerIcon(this.getIconString() + "_" + field_94595_b[i]);
		}
	}
}
