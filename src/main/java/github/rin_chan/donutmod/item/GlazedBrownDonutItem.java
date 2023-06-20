package github.rin_chan.donutmod.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;

public class GlazedBrownDonutItem extends Item {

	public GlazedBrownDonutItem() {
		super(new Item.Properties()
				.food(new FoodProperties.Builder()
						.nutrition(6)
						.saturationMod(7F)
						.effect(() -> new MobEffectInstance(MobEffects.DIG_SPEED, 1200, 1), 1.0F)
					.alwaysEat()
					.build()
				)
			);
	}
}
