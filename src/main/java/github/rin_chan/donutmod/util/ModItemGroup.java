package github.rin_chan.donutmod.util;

import github.rin_chan.donutmod.init.ItemRegistry;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModItemGroup extends CreativeModeTab{
	public static final ModItemGroup DONUTMOD = new ModItemGroup(CreativeModeTab.TABS.length, "donutmodTab");
	
	public ModItemGroup(int length, String label) {
		super(length, label);
	}
	
	@Override
	public ItemStack makeIcon() {
		return ItemRegistry.COOKIEDONUT.get().getDefaultInstance();
	}
}