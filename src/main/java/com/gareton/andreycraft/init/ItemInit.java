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
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
	
	public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, AndreyCraft.MOD_ID);
	
	// Items
	
	public static final RegistryObject<Item> kabachok_item = ITEMS.register("kabachok_item", () -> new Item(new Item.Properties()
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
					.build())));
	
	public static final RegistryObject<Item> kekanite_ingot = ITEMS.register("kekanite_ingot", () -> new Item(new Item.Properties()
			.group(AndreyCraftItemGroup.instance)));
	
	public static final RegistryObject<Item> kekanite_nugget = ITEMS.register("kekanite_nugget", () -> new Item(new Item.Properties()
			.group(AndreyCraftItemGroup.instance)));
	
	// Tools
	public static final RegistryObject<Item> kabachkovi_sword = ITEMS.register("kabachkovi_sword", () -> new SwordItem(
			KabachokItemTier.KABACHOK, 1000, 5.0f, new Item.Properties()
			.group(AndreyCraftItemGroup.instance)));
	
	public static final RegistryObject<Item> kabachkovaya_pickaxe = ITEMS.register("kabachkovaya_pickaxe", () -> new PickaxeItem(
			KabachokItemTier.KABACHOK, 2, 100.0f, new Item.Properties()
			.group(AndreyCraftItemGroup.instance)));
			
	public static final RegistryObject<Item> kabachkovaya_shovel = ITEMS.register("kabachkovaya_shovel", () -> new ShovelItem(
			KabachokItemTier.KABACHOK, 2, 5.0f, new Item.Properties()
			.group(AndreyCraftItemGroup.instance)));
			
	public static final RegistryObject<Item> kabachkovi_axe = ITEMS.register("kabachkovi_axe", () -> new AxeItem(
			KabachokItemTier.KABACHOK, 2, 5.0f, new Item.Properties()
			.group(AndreyCraftItemGroup.instance)));
	
	public static final RegistryObject<Item> kabachkovaya_hoe = ITEMS.register("kabachkovaya_hoe", () -> new HoeItem(
			KabachokItemTier.KABACHOK, 5.0f, new Item.Properties()
			.group(AndreyCraftItemGroup.instance)));
	
	// Armor
	public static final RegistryObject<Item> kabachkovi_helmet = ITEMS.register("kabachkovi_helmet", () -> new ArmorItem(
			KabachokArmorMaterial.KABACHOK, EquipmentSlotType.HEAD,
			new Item.Properties().group(AndreyCraftItemGroup.instance)));
			
	public static final RegistryObject<Item> kabachkovi_chestplate = ITEMS.register("kabachkovi_chestplate", () -> new ArmorItem(
			KabachokArmorMaterial.KABACHOK, EquipmentSlotType.CHEST,
			new Item.Properties().group(AndreyCraftItemGroup.instance)));
			
	public static final RegistryObject<Item> kabachkovi_leggings = ITEMS.register("kabachkovi_leggings", () -> new ArmorItem(
			KabachokArmorMaterial.KABACHOK, EquipmentSlotType.LEGS,
			new Item.Properties().group(AndreyCraftItemGroup.instance)));
			
	public static final RegistryObject<Item> kabachkovi_boots = ITEMS.register("kabachkovi_boots", () -> new ArmorItem(
			KabachokArmorMaterial.KABACHOK, EquipmentSlotType.FEET,
			new Item.Properties().group(AndreyCraftItemGroup.instance)));
}
