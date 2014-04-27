package com.stan.stanmod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

import com.stan.stanmod.help.Reference;

public class BlockOre2 extends Block 
{
	public BlockOre2()
	{
		super(Material.rock);
		// Blocks identify ID
		setBlockName("ore2");
		
		// Blocks Attribute
		setBlockTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(CreativeTabs.tabBlock);
		setStepSound(soundTypeGrass);
		setHardness(2.5F);
		setLightLevel(1.0F);

	}
}
