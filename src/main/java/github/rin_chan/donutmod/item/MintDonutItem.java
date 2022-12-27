package github.rin_chan.donutmod.item;

import github.rin_chan.donutmod.util.ModItemGroup;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;

public class MintDonutItem extends Item {

	public MintDonutItem() {
		super(new Item.Properties()
				.tab(ModItemGroup.DONUTMOD)
				.food(new FoodProperties.Builder()
						.nutrition(6)
						.saturationMod(7F)
						.effect(() -> new MobEffectInstance(MobEffects.DAMAGE_BOOST, 1200, 0), 1.0F)
					.alwaysEat()
					.build()
				)
			);
	}
}
