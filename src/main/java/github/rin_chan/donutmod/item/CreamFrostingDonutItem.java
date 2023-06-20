package github.rin_chan.donutmod.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;

public class CreamFrostingDonutItem extends Item {

	public CreamFrostingDonutItem() {
		super(new Item.Properties()
				.food(new FoodProperties.Builder()
						.nutrition(6)
						.saturationMod(7F)
						.effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 1200, 0), 1.0F)
					.alwaysEat()
					.build()
				)
			);
	}
}
