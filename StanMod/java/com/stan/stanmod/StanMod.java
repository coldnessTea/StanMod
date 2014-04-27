package com.stan.stanmod;

import net.minecraft.block.Block;

import com.stan.stanmod.blocks.BlockOre1;
import com.stan.stanmod.blocks.BlockOre2;
import com.stan.stanmod.help.Reference;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;


@Mod(modid = Reference.MODID, version = Reference.VERSION)
public class StanMod 
{
	public static Block ore1,ore2;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		ore1 = new BlockOre1();
		ore2 = new BlockOre2();
		
		RegisterHelper.registerBlock(ore1);
		RegisterHelper.registerBlock(ore2);
	}
	
	
}
