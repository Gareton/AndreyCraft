package com.gareton.andreycraft.init;

import com.gareton.andreycraft.AndreyCraft;
import com.gareton.andreycraft.AndreyCraft.AndreyCraftItemGroup;
import com.gareton.andreycraft.materials.KabachokArmorMaterial;
import com.gareton.andreycraft.tiers.KabachokItemTier;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.AxeItem;
import net.minecraft.item.Food;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(modid = AndreyCraft.MOD_ID, bus = Bus.MOD)
@ObjectHolder(AndreyCraft.MOD_ID)
public class ItemInit {

	public static final Item kabachok_item = null;
	public static final Item kekanite_ingot = null;
	public static final Item kekanite_nugget = null;
	
	// Tools
	public static final Item kabachkovi_sword = null;
	public static final Item kabachkovaya_pickaxe = null;
	public static final Item kabachkovaya_shovel = null;
	public static final Item kabachkovi_axe = null;
	public static final Item kabachkovaya_hoe = null;
	
	// Armor
	public static final Item kabachkovi_helmet = null;
	public static final Item kabachkovi_chestplate = null;
	public static final Item kabachkovi_leggings = null;
	public static final Item kabachkovi_boots = null;
	
	@SubscribeEvent
	public static void registerItems(final RegistryEvent.Register<Item> event)
	{	
		event.getRegistry().register(new Item(new Item.Properties()
		.group(AndreyCraftItemGroup.instance)
		.food(new Food.Builder()
				.hunger(6)
				.saturation(1.2f)
				.effect(new EffectInstance(Effects.ABSORPTION, 6000), 1.0f)
				.effect(new EffectInstance(Effects.INVISIBILITY, 6000), 1.0f)
				.effect(new EffectInstance(Effects.STRENGTH, 6000), 1.0f)
				.effect(new EffectInstance(Effects.NAUSEA, 6000), 1.0f)
				.effect(new EffectInstance(Effects.GLOWING, 6000), 1.0f)
				.effect(new EffectInstance(Effects.JUMP_BOOST, 6000), 1.0f)
				.effect(new EffectInstance(Effects.SPEED, 6000), 1.0f)
				.effect(new EffectInstance(Effects.RESISTANCE, 6000), 1.0f)
				.effect(new EffectInstance(Effects.REGENERATION, 6000), 1.0f)
				.build())).setRegistryName("kabachok_item"));
		
		event.getRegistry().register(new Item(new Item.Properties()
				.group(AndreyCraftItemGroup.instance))
				.setRegistryName("kekanite_ingot"));
		
		event.getRegistry().register(new Item(new Item.Properties()
				.group(AndreyCraftItemGroup.instance))
				.setRegistryName("kekanite_nugget"));
		
		// Tools
		
		event.getRegistry().register(new SwordItem(KabachokItemTier.KABACHOK, 1000, 5.0f, new Item.Properties()
				.group(AndreyCraftItemGroup.instance))
				.setRegistryName("kabachkovi_sword"));
		
		event.getRegistry().register(new PickaxeItem(KabachokItemTier.KABACHOK, 2, 100.0f, new Item.Properties()
				.group(AndreyCraftItemGroup.instance))
				.setRegistryName("kabachkovaya_pickaxe"));
		
		event.getRegistry().register(new ShovelItem(KabachokItemTier.KABACHOK, 2, 5.0f, new Item.Properties()
				.group(AndreyCraftItemGroup.instance))
				.setRegistryName("kabachkovaya_shovel"));
		
		event.getRegistry().register(new AxeItem(KabachokItemTier.KABACHOK, 2, 5.0f, new Item.Properties()
				.group(AndreyCraftItemGroup.instance))
				.setRegistryName("kabachkovi_axe"));
		
		event.getRegistry().register(new HoeItem(KabachokItemTier.KABACHOK, 5.0f, new Item.Properties()
				.group(AndreyCraftItemGroup.instance))
				.setRegistryName("kabachkovaya_hoe"));
		
		// Armor
		
		event.getRegistry().register(new ArmorItem(KabachokArmorMaterial.KABACHOK, EquipmentSlotType.HEAD,
				new Item.Properties().group(AndreyCraftItemGroup.instance)).setRegistryName("kabachkovi_helmet"));
		
		event.getRegistry().register(new ArmorItem(KabachokArmorMaterial.KABACHOK, EquipmentSlotType.CHEST,
				new Item.Properties().group(AndreyCraftItemGroup.instance)).setRegistryName("kabachkovi_chestplate"));
		
		event.getRegistry().register(new ArmorItem(KabachokArmorMaterial.KABACHOK, EquipmentSlotType.LEGS,
				new Item.Properties().group(AndreyCraftItemGroup.instance)).setRegistryName("kabachkovi_leggings"));
		
		event.getRegistry().register(new ArmorItem(KabachokArmorMaterial.KABACHOK, EquipmentSlotType.FEET,
				new Item.Properties().group(AndreyCraftItemGroup.instance)).setRegistryName("kabachkovi_boots"));
	}
	
	
	
	
	
}
