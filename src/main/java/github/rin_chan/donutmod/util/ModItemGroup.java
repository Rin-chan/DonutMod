package github.rin_chan.donutmod.util;

import github.rin_chan.donutmod.DonutMod;
import github.rin_chan.donutmod.init.ItemRegistry;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.RegistryObject;

@Mod.EventBusSubscriber(modid = DonutMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModItemGroup {
    public static CreativeModeTab TAB;

    @SubscribeEvent
    public static void register(CreativeModeTabEvent.Register event) {
    	TAB = event.registerCreativeModeTab(
	        new ResourceLocation("donutmodtab", DonutMod.MODID), builder -> builder
                .icon(() -> new ItemStack(ItemRegistry.COOKIEDONUT.get()))
                .displayItems((enabledFlags, populator, hasPermissions) -> {
        	    	for (RegistryObject<Item> item:ItemRegistry.populateCreativeTab()) {
        	    		populator.accept(item.get());
        	    	}
        	    })
                .title(Component.translatable("itemGroup.donutmodtab"))
        );
    }
}
