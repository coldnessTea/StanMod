package com.stan.stanmod;

import net.minecraft.block.Block;

import com.stan.stanmod.help.Reference;

import cpw.mods.fml.common.registry.GameRegistry;

public class RegisterHelper 
{
	public static void registerBlock(Block block)
	{
		GameRegistry.registerBlock(block, Reference.MODID + "_" + block.getUnlocalizedName().substring(5));
	}
}
