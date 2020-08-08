package com.gareton.andreycraft.init;

import com.gareton.andreycraft.AndreyCraft;
import com.gareton.andreycraft.tileentity.TestChestTileEntity;

import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModTileEntityTypes {

	public static final DeferredRegister<TileEntityType<?>> TILE_ENTITY_TYPES = new DeferredRegister<>(
			ForgeRegistries.TILE_ENTITIES, AndreyCraft.MOD_ID);
	
	public static final RegistryObject<TileEntityType<TestChestTileEntity>> test_chest = TILE_ENTITY_TYPES
			.register("test_chest", () -> TileEntityType.Builder
					.create(TestChestTileEntity::new, BlockInit.test_chest.get()).build(null));
}
