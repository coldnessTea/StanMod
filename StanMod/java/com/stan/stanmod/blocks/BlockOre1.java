package com.stan.stanmod.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.stan.stanmod.StanMod;
import com.stan.stanmod.help.Reference;

// New Block 1
public class BlockOre1 extends Block 
{
	public BlockOre1()
	{
		// The Block basic material.
		super(Material.rock);
		
		// Blocks identify ID.
		setBlockName("ore1");
		
		// Blocks Attribute.
		setBlockTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
		
		// Which Tab be classified
		setCreativeTab(CreativeTabs.tabBlock);
		
		// Step on the block's sound, and also put sound.
		setStepSound(soundTypeGrass);
		
		// Breakable hard.
		setHardness(2.5F);
		
		// At night, the block's light.
		setLightLevel(1.0F);
		
		// Which level tools can break this ore.
		setHarvestLevel("shovel",2);
	}
	
	// Attention! Override the father class is the best way to modified the Item which you want it drop specified items.
	@Override
	// Item Drop function.
	public Item getItemDropped(int metadata, Random rand, int fortune)
    {
		// Drop the new item of item1.
        return StanMod.item1;
    }
}
