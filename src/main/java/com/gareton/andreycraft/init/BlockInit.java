package com.gareton.andreycraft.init;

import com.gareton.andreycraft.AndreyCraft;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {

	public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, AndreyCraft.MOD_ID);
	
	public static final RegistryObject<Block> kabachkovi_block = BLOCKS.register("kabachkovi_block", () -> new Block(Block.Properties
			.create(Material.IRON)
			.hardnessAndResistance(10.0f, 20.0f)
			.sound(SoundType.SLIME)
			.lightValue(10)
			.harvestTool(ToolType.SHOVEL)
			.harvestLevel(2)));
			
	public static final RegistryObject<Block> kekanite_ore = BLOCKS.register("kekanite_ore", () -> new Block(Block.Properties
			.create(Material.ROCK)
			.hardnessAndResistance(10.0f, 20.0f)
			.sound(SoundType.STONE)
			.harvestTool(ToolType.PICKAXE)
			.harvestLevel(4)));
			
	public static final RegistryObject<Block> kekanite_block = BLOCKS.register("kekanite_block", () -> new Block(Block.Properties
			.create(Material.ROCK)
			.hardnessAndResistance(10.0f, 20.0f)
			.sound(SoundType.STONE)
			.harvestTool(ToolType.PICKAXE)
			.harvestLevel(4)));
}
