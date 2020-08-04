package com.gareton.andreycraft.init;

import com.gareton.andreycraft.AndreyCraft;
import com.gareton.andreycraft.AndreyCraft.AndreyCraftItemGroup;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ObjectHolder;

@ObjectHolder(AndreyCraft.MOD_ID)
@Mod.EventBusSubscriber(modid = AndreyCraft.MOD_ID, bus = Bus.MOD)
public class BlockInit {

	public static final Block kabachkovi_block = null;
	public static final Block kekanite_ore = null;
	public static final Block kekanite_block = null;
	
	@SubscribeEvent
	public static void registerBlocks(final RegistryEvent.Register<Block> event)
	{
		event.getRegistry().register(new Block(Block.Properties
				.create(Material.IRON)
				.hardnessAndResistance(10.0f, 20.0f)
				.sound(SoundType.SLIME)
				.lightValue(10)
				.harvestTool(ToolType.SHOVEL)
				.harvestLevel(2))
				.setRegistryName("kabachkovi_block"));
		
		event.getRegistry().register(new Block(Block.Properties
				.create(Material.ROCK)
				.hardnessAndResistance(10.0f, 20.0f)
				.sound(SoundType.STONE)
				.harvestTool(ToolType.PICKAXE)
				.harvestLevel(4))
				.setRegistryName("kekanite_ore"));
		
		event.getRegistry().register(new Block(Block.Properties
				.create(Material.ROCK)
				.hardnessAndResistance(10.0f, 20.0f)
				.sound(SoundType.STONE)
				.harvestTool(ToolType.PICKAXE)
				.harvestLevel(4))
				.setRegistryName("kekanite_block"));
	}
	
	@SubscribeEvent
	public static void registerBlockItems(final RegistryEvent.Register<Item> event)
	{
		event.getRegistry().register(new BlockItem(kabachkovi_block, new Item.Properties()
				.maxStackSize(64)
				.group(AndreyCraftItemGroup.instance))
				.setRegistryName("kabachkovi_block"));
		
		event.getRegistry().register(new BlockItem(kekanite_ore, new Item.Properties()
				.maxStackSize(64)
				.group(AndreyCraftItemGroup.instance))
				.setRegistryName("kekanite_ore"));
		
		event.getRegistry().register(new BlockItem(kekanite_block, new Item.Properties()
				.maxStackSize(64)
				.group(AndreyCraftItemGroup.instance))
				.setRegistryName("kekanite_block"));
	}
	

}
