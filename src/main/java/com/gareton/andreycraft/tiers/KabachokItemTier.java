package com.gareton.andreycraft.tiers;

import java.util.function.Supplier;

import com.gareton.andreycraft.init.ItemInit;

import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;

public enum KabachokItemTier implements IItemTier
{	
	KABACHOK(4, 100000, 10000.0f, 1.0f, 20, () -> {
		return Ingredient.fromItems(ItemInit.kabachok_item);
	});
	
	private final int harvestLevel;
	private final int maxUses;
	private final float efficiency;
	private final float attackDamage;
	private final int enchantAbility;
	private final LazyValue<Ingredient> repairMaterial;
	
	private KabachokItemTier(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantAbility, Supplier<Ingredient> repairMaterial)
	{
		this.harvestLevel = harvestLevel;
		this.maxUses = maxUses;
		this.efficiency = efficiency;
		this.attackDamage = attackDamage;
		this.enchantAbility = enchantAbility;
		this.repairMaterial = new LazyValue<>(repairMaterial);
	}
	
	@Override
	public int getHarvestLevel()
	{
		return this.harvestLevel;
	}
	
	@Override
	public int getMaxUses()
	{
		return this.maxUses;
	}
	
	@Override
	public float getEfficiency()
	{
		return this.efficiency;
	}
	
	@Override
	public float getAttackDamage()
	{
		return this.attackDamage;
	}
	
	@Override
	public Ingredient getRepairMaterial()
	{
		return this.repairMaterial.getValue();
	}

	@Override
	public int getEnchantability() {
		return this.enchantAbility;
	}
	
}
