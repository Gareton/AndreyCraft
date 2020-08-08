package com.gareton.andreycraft.init;

import com.gareton.andreycraft.AndreyCraft;
import com.gareton.andreycraft.container.TestChestContainer;

import net.minecraft.inventory.container.ContainerType;
import net.minecraftforge.common.extensions.IForgeContainerType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModContainerTypes {

	public static final DeferredRegister<ContainerType<?>> CONTAINER_TYPES = new DeferredRegister<>(ForgeRegistries.CONTAINERS, AndreyCraft.MOD_ID);
	
	public static final RegistryObject<ContainerType<TestChestContainer>> test_chest = CONTAINER_TYPES
			.register("test_chest", () -> IForgeContainerType.create(TestChestContainer::new));
}
