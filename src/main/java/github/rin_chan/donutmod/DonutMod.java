package github.rin_chan.donutmod;

import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import github.rin_chan.donutmod.init.ItemRegistry;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

@Mod(DonutMod.MODID)
public class DonutMod {
	public static final String MODID = "donutmod";
	private static final Logger LOGGER = LogUtils.getLogger();
	
	// Create a Deferred Register to hold CreativeModeTabs which will all be registered under the "donutmod" namespace
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MODID);

    // Creates a creative tab with the id "donutmod:donutmodtab" for the items, that is placed after the combat tab
	public static final RegistryObject<CreativeModeTab> TAB = CREATIVE_MODE_TABS.register("donutmodtab", () -> CreativeModeTab.builder()
        .withTabsBefore(CreativeModeTabs.SPAWN_EGGS)
        .icon(() -> new ItemStack(ItemRegistry.COOKIEDONUT.get()))
        .displayItems((parameters, output) -> {
        	for (RegistryObject<Item> item:ItemRegistry.populateCreativeTab()) {
        		output.accept(item.get());
	    	}
        })
        .title(Component.translatable("itemGroup.donutmodtab"))
        .build());
	
	public DonutMod()
    {
		IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

		// Register the Deferred Register to the mod event bus so items get registered
		ItemRegistry.register(modEventBus);
        // Register the Deferred Register to the mod event bus so tabs get registered
        CREATIVE_MODE_TABS.register(modEventBus);
    }
}
