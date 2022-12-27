package github.rin_chan.donutmod.item;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;

public class SimpleFilledItem extends Item {

	public SimpleFilledItem() {
		super(new Item.Properties()
				.food(new FoodProperties.Builder()
						.nutrition(8)
						.saturationMod(9F)
					.alwaysEat()
					.build()
				)
			);
	}
}
