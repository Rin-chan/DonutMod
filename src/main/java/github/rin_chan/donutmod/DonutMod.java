package github.rin_chan.donutmod;

import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import github.rin_chan.donutmod.init.ItemRegistry;
import net.minecraft.world.entity.EntityType;
import net.minecraftforge.common.ForgeMod;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.EntityAttributeModificationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod(DonutMod.MODID)
public class DonutMod {
	public static final String MODID = "donutmod";
    private static final Logger LOGGER = LogUtils.getLogger();

    public DonutMod()
    {
        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
        
        ItemRegistry.init();
    }
    
    // You can use EventBusSubscriber to automatically subscribe events on the contained class (this is subscribing to the MOD
    // Event bus for receiving Registry Events)
    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents
    {
    	@SubscribeEvent
	    public static void onEntityAttributeModificationEvent(final EntityAttributeModificationEvent event) {
			event.add(EntityType.PLAYER, ForgeMod.REACH_DISTANCE.get());
		}
    }
}
