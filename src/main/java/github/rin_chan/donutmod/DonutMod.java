package github.rin_chan.donutmod;

import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import github.rin_chan.donutmod.init.ItemRegistry;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.ForgeMod;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.event.entity.EntityAttributeModificationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.RegistryObject;

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
}
