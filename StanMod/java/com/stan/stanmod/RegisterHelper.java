package com.stan.stanmod;

import net.minecraft.block.Block;
import net.minecraft.item.Item;

import com.stan.stanmod.help.Reference;

import cpw.mods.fml.common.registry.GameRegistry;

// Help me easier to make the code cleaner.
public class RegisterHelper 
{
	// Register for Block Class
	public static void registerBlock(Block block)
	{
		GameRegistry.registerBlock(block, Reference.MODID + "_" + block.getUnlocalizedName().substring(5));
	}
	
	// Register for Item Class
	public static void registerItem(Item item)
	{
		GameRegistry.registerItem(item, Reference.MODID + "_" + item.getUnlocalizedName().substring(5));
	}
}
