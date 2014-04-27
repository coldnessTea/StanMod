package com.stan.stanmod;

import net.minecraft.block.Block;
import net.minecraft.item.Item;

import com.stan.stanmod.blocks.BlockOre1;
import com.stan.stanmod.blocks.BlockOre2;
import com.stan.stanmod.blocks.BlockOre3;
import com.stan.stanmod.help.Reference;
import com.stan.stanmod.items.Item1;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

// It is not require but it is better to code it down.
@Mod(modid = Reference.MODID, version = Reference.VERSION)

public class StanMod 
{
	// New Blocks Variables.
	public static Block ore1,ore2,ore3;
	
	// New Items Variables.
	public static Item item1;
	
	// Handler for Forge.
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		// New Blocks for adding classes.
		ore1 = new BlockOre1();
		ore2 = new BlockOre2();
		ore3 = new BlockOre3();
		
		// New Items for adding classes.
		item1 = new Item1();

		// Blocks Registration for the game.
		RegisterHelper.registerBlock(ore1);
		RegisterHelper.registerBlock(ore2);
		RegisterHelper.registerBlock(ore3);
		
		// Items Registration for the game.
		RegisterHelper.registerItem(item1);
	}
	
	
}
