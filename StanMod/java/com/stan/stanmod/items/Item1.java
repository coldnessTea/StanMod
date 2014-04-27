package com.stan.stanmod.items;

import com.stan.stanmod.help.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;



public class Item1 extends Item 
{
	public Item1()
	{
		super();
		// Identify the Items ID
		setUnlocalizedName("Item1");
		// Set the Item's Textures
		setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
		// Set the Creative Tab classify
		setCreativeTab(CreativeTabs.tabMaterials);
		
	}
}
