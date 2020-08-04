package com.gareton.andreycraft.events;

import com.gareton.andreycraft.AndreyCraft;
import com.gareton.andreycraft.init.BlockInit;

import net.minecraft.entity.LivingEntity;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.living.LivingEvent.LivingJumpEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@Mod.EventBusSubscriber(modid = AndreyCraft.MOD_ID, bus = Bus.FORGE)
public class JumpEvent {
	
	@SubscribeEvent
	public static void jumpEvent(LivingJumpEvent event)
	{
		/*
		TutorialMod.LOGGER.info("jumpEvent fired");
		LivingEntity livingEntity = event.getEntityLiving();
		World world = livingEntity.getEntityWorld();
		world.setBlockState(livingEntity.getPosition().add(0, -1, 0), BlockInit.kabachkovi_block.getDefaultState());
		livingEntity.addPotionEffect(new EffectInstance(Effects.JUMP_BOOST, 600, 255));
		livingEntity.addPotionEffect(new EffectInstance(Effects.RESISTANCE, 5000, 255));
		livingEntity.setGlowing(true);
		livingEntity.isPassenger()*/
	}
}
