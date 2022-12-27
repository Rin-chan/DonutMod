package github.rin_chan.donutmod.item;

import github.rin_chan.donutmod.util.ModItemGroup;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;

public class SimpleMochiItem extends Item {

	public SimpleMochiItem() {
		super(new Item.Properties()
				.tab(ModItemGroup.DONUTMOD)
				.food(new FoodProperties.Builder()
						.nutrition(6)
						.saturationMod(7F)
					.alwaysEat()
					.build()
				)
			);
	}
}
