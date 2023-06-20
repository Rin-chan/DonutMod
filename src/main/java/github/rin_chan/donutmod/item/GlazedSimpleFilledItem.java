package github.rin_chan.donutmod.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;

public class GlazedSimpleFilledItem extends Item {

	public GlazedSimpleFilledItem() {
		super(new Item.Properties()
				.food(new FoodProperties.Builder()
						.nutrition(8)
						.saturationMod(9F)
						.effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1200, 2), 1.0F)
					.alwaysEat()
					.build()
				)
			);
	}
}
