package github.rin_chan.donutmod.item;

import github.rin_chan.donutmod.util.ModItemGroup;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;

public class StrawberryFilledItem extends Item {

	public StrawberryFilledItem() {
		super(new Item.Properties()
				.tab(ModItemGroup.DONUTMOD)
				.food(new FoodProperties.Builder()
						.nutrition(8)
						.saturationMod(9F)
						.effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 1200, 1), 1.0F)
					.alwaysEat()
					.build()
				)
			);
	}
}
