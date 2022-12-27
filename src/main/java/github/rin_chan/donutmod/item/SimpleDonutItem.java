package github.rin_chan.donutmod.item;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;

public class SimpleDonutItem extends Item {

	public SimpleDonutItem() {
		super(new Item.Properties()
				.food(new FoodProperties.Builder()
						.nutrition(6)
						.saturationMod(7F)
					.alwaysEat()
					.build()
				)
			);
	}
}
