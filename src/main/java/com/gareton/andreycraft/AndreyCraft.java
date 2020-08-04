package com.gareton.andreycraft;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.gareton.andreycraft.init.BlockInit;
import com.gareton.andreycraft.world.gen.KekanitOreGen;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;


@Mod(AndreyCraft.MOD_ID)
@Mod.EventBusSubscriber(modid = AndreyCraft.MOD_ID, bus = Bus.MOD)
public class AndreyCraft
{
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "andreycraft";
    public static AndreyCraft instance;

    public AndreyCraft() {

    	final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
    	modEventBus.addListener(this::setup);
    	modEventBus.addListener(this::doClientStuff);
        instance = this;
        
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)
    {
    }

    private void doClientStuff(final FMLClientSetupEvent event) {
    	

    }
    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event) {


    }
    
    @SubscribeEvent
    public static void loadCompleteEvent(FMLLoadCompleteEvent event)
    {
    	KekanitOreGen.generateOre();
    }
    
	public static class AndreyCraftItemGroup extends ItemGroup{
		
		public static final AndreyCraftItemGroup instance = new AndreyCraftItemGroup(ItemGroup.GROUPS.length, "andreycrafttab");
		
		private AndreyCraftItemGroup(int index, String label)
		{
			super(index, label);
		}
		
		@Override
		public ItemStack createIcon()
		{
			return new ItemStack(BlockInit.kabachkovi_block);
		}
	}
}
