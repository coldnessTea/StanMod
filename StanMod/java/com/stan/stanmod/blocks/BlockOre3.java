package com.stan.stanmod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

import com.stan.stanmod.help.Reference;

public class BlockOre3 extends Block
{
	public BlockOre3()
	{
		super(Material.rock);
		// Blocks identify ID
		setBlockName("ore3");
		
		// Blocks Attribute
		setBlockTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(CreativeTabs.tabBlock);
		setStepSound(soundTypeGrass);
		// Breakable hard
		setHardness(2.5F);
		setLightLevel(1.0F);

	}
}
