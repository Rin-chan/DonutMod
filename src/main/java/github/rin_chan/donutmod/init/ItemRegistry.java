package github.rin_chan.donutmod.init;

import java.util.Collection;

import github.rin_chan.donutmod.DonutMod;
import github.rin_chan.donutmod.item.BrownDonutItem;
import github.rin_chan.donutmod.item.BrownMochiItem;
import github.rin_chan.donutmod.item.ChocolateFilledItem;
import github.rin_chan.donutmod.item.ChocolateFrostingDonutItem;
import github.rin_chan.donutmod.item.CookieCreamDonutItem;
import github.rin_chan.donutmod.item.CookieDonutItem;
import github.rin_chan.donutmod.item.CreamFrostingDonutItem;
import github.rin_chan.donutmod.item.EasterDonutItem;
import github.rin_chan.donutmod.item.GlazedBrownDonutItem;
import github.rin_chan.donutmod.item.GlazedBrownMochiItem;
import github.rin_chan.donutmod.item.GlazedPurpleDonutItem;
import github.rin_chan.donutmod.item.GlazedPurpleMochiItem;
import github.rin_chan.donutmod.item.GlazedRedDonutItem;
import github.rin_chan.donutmod.item.GlazedRedMochiItem;
import github.rin_chan.donutmod.item.GlazedSimpleDonutItem;
import github.rin_chan.donutmod.item.GlazedSimpleFilledItem;
import github.rin_chan.donutmod.item.GlazedSimpleMochiItem;
import github.rin_chan.donutmod.item.KinderFilledItem;
import github.rin_chan.donutmod.item.KinderMochiItem;
import github.rin_chan.donutmod.item.MatchaDonutItem;
import github.rin_chan.donutmod.item.MatchaMochiItem;
import github.rin_chan.donutmod.item.MeMSprinkleDonutItem;
import github.rin_chan.donutmod.item.MintDonutItem;
import github.rin_chan.donutmod.item.OrangeChocolateDonutItem;
import github.rin_chan.donutmod.item.OrangeChocolateMochiItem;
import github.rin_chan.donutmod.item.PurpleDonutItem;
import github.rin_chan.donutmod.item.PurpleMochiItem;
import github.rin_chan.donutmod.item.RedDonutItem;
import github.rin_chan.donutmod.item.RedMochiItem;
import github.rin_chan.donutmod.item.RedVelvetDonutItem;
import github.rin_chan.donutmod.item.RedVelvetMochiItem;
import github.rin_chan.donutmod.item.SesameMochiItem;
import github.rin_chan.donutmod.item.SimpleDonutItem;
import github.rin_chan.donutmod.item.SimpleFilledItem;
import github.rin_chan.donutmod.item.SimpleMochiItem;
import github.rin_chan.donutmod.item.SmoreDonutItem;
import github.rin_chan.donutmod.item.SpookyDonutItem;
import github.rin_chan.donutmod.item.SpookyMochiItem;
import github.rin_chan.donutmod.item.SprinkleChocolateDonutItem;
import github.rin_chan.donutmod.item.StrawberryDonutItem;
import github.rin_chan.donutmod.item.StrawberryFilledItem;
import github.rin_chan.donutmod.item.StrawberryMochiItem;
import github.rin_chan.donutmod.item.UbeFrostingDonutItem;
import github.rin_chan.donutmod.item.UbeMochiItem;
import github.rin_chan.donutmod.item.WhiteSprinkleDonutItem;
import github.rin_chan.donutmod.item.XmasDonutItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemRegistry {
	private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, DonutMod.MODID);
	
	public static final RegistryObject<BrownDonutItem> BROWNDONUT = ITEMS.register("browndonut", BrownDonutItem::new);
	public static final RegistryObject<BrownMochiItem> BROWNMOCHI = ITEMS.register("brownmochi", BrownMochiItem::new);
	public static final RegistryObject<ChocolateFilledItem> CHOCOLATEFILLED = ITEMS.register("chocolatefilled", ChocolateFilledItem::new);
	public static final RegistryObject<ChocolateFrostingDonutItem> CHOCOLATEFROSTINGDONUT = ITEMS.register("chocolatefrostingdonut", ChocolateFrostingDonutItem::new);
	public static final RegistryObject<CookieCreamDonutItem> COOKIECREAMDONUT = ITEMS.register("cookiecreamdonut", CookieCreamDonutItem::new);
	public static final RegistryObject<CookieDonutItem> COOKIEDONUT = ITEMS.register("cookiedonut", CookieDonutItem::new);
	public static final RegistryObject<CreamFrostingDonutItem> CREAMFROSTINGDONUT = ITEMS.register("creamfrostingdonut", CreamFrostingDonutItem::new);
	public static final RegistryObject<EasterDonutItem> EASTERDONUT = ITEMS.register("easterdonut", EasterDonutItem::new);
	public static final RegistryObject<GlazedBrownDonutItem> GLAZEDBROWNDONUT = ITEMS.register("glazedbrowndonut", GlazedBrownDonutItem::new);
	public static final RegistryObject<GlazedBrownMochiItem> GLAZEDBROWNMOCHI = ITEMS.register("glazedbrownmochi", GlazedBrownMochiItem::new);
	public static final RegistryObject<GlazedPurpleDonutItem> GLAZEDPURPLEDONUT = ITEMS.register("glazedpurpledonut", GlazedPurpleDonutItem::new);
	public static final RegistryObject<GlazedPurpleMochiItem> GLAZEDPURPLEMOCHI = ITEMS.register("glazedpurplemochi", GlazedPurpleMochiItem::new);
	public static final RegistryObject<GlazedRedDonutItem> GLAZEDREDDONUT = ITEMS.register("glazedreddonut", GlazedRedDonutItem::new);
	public static final RegistryObject<GlazedRedMochiItem> GLAZEDREDMOCHI = ITEMS.register("glazedredmochi", GlazedRedMochiItem::new);
	public static final RegistryObject<GlazedSimpleDonutItem> GLAZEDSIMPLEDONUT = ITEMS.register("glazedsimpledonut", GlazedSimpleDonutItem::new);
	public static final RegistryObject<GlazedSimpleFilledItem> GLAZEDSIMPLEFILLED = ITEMS.register("glazedsimplefilled", GlazedSimpleFilledItem::new);
	public static final RegistryObject<GlazedSimpleMochiItem> GLAZEDSIMPLEMOCHI = ITEMS.register("glazedsimplemochi", GlazedSimpleMochiItem::new);
	public static final RegistryObject<KinderFilledItem> KINDERFILLED = ITEMS.register("kinderfilled", KinderFilledItem::new);
	public static final RegistryObject<KinderMochiItem> KINDERMOCHI = ITEMS.register("kindermochi", KinderMochiItem::new);
	public static final RegistryObject<MatchaDonutItem> MATCHADONUT = ITEMS.register("matchadonut", MatchaDonutItem::new);
	public static final RegistryObject<MatchaMochiItem> MATCHAMOCHI = ITEMS.register("matchamochi", MatchaMochiItem::new);
	public static final RegistryObject<MeMSprinkleDonutItem> MEMSPRINKLEDONUT = ITEMS.register("memsprinkledonut", MeMSprinkleDonutItem::new);
	public static final RegistryObject<MintDonutItem> MINTDONUT = ITEMS.register("mintdonut", MintDonutItem::new);
	public static final RegistryObject<OrangeChocolateDonutItem> ORANGECHOCOLATEDONUT = ITEMS.register("orangechocolatedonut", OrangeChocolateDonutItem::new);
	public static final RegistryObject<OrangeChocolateMochiItem> ORANGECHOCOLATEMOCHI = ITEMS.register("orangechocolatemochi", OrangeChocolateMochiItem::new);
	public static final RegistryObject<PurpleDonutItem> PURPLEDONUT = ITEMS.register("purpledonut", PurpleDonutItem::new);
	public static final RegistryObject<PurpleMochiItem> PURPLEMOCHI = ITEMS.register("purplemochi", PurpleMochiItem::new);
	public static final RegistryObject<RedDonutItem> REDDONUT = ITEMS.register("reddonut", RedDonutItem::new);
	public static final RegistryObject<RedMochiItem> REDMOCHI = ITEMS.register("redmochi", RedMochiItem::new);
	public static final RegistryObject<RedVelvetDonutItem> REDVELVETDONUT = ITEMS.register("redvelvetdonut", RedVelvetDonutItem::new);
	public static final RegistryObject<RedVelvetMochiItem> REDVELVETMOCHI = ITEMS.register("redvelvetmochi", RedVelvetMochiItem::new);
	public static final RegistryObject<SesameMochiItem> SESAMEMOCHI = ITEMS.register("sesamemochi", SesameMochiItem::new);
	public static final RegistryObject<SimpleDonutItem> SIMPLEDONUT = ITEMS.register("simpledonut", SimpleDonutItem::new);
	public static final RegistryObject<SimpleFilledItem> SIMPLEFILLED = ITEMS.register("simplefilled", SimpleFilledItem::new);
	public static final RegistryObject<SimpleMochiItem> SIMPLEMOCHI = ITEMS.register("simplemochi", SimpleMochiItem::new);
	public static final RegistryObject<SmoreDonutItem> SMOREDONUT = ITEMS.register("smoredonut", SmoreDonutItem::new);
	public static final RegistryObject<SpookyDonutItem> SPOOKYDONUT = ITEMS.register("spookydonut", SpookyDonutItem::new);
	public static final RegistryObject<SpookyMochiItem> SPOOKYMOCHI = ITEMS.register("spookymochi", SpookyMochiItem::new);
	public static final RegistryObject<SprinkleChocolateDonutItem> SPRINKLECHOCOLATEDONUT = ITEMS.register("sprinklechocolatedonut", SprinkleChocolateDonutItem::new);
	public static final RegistryObject<StrawberryDonutItem> STRAWBERRYDONUT = ITEMS.register("strawberrydonut", StrawberryDonutItem::new);
	public static final RegistryObject<StrawberryFilledItem> STRAWBERRYFILLED = ITEMS.register("strawberryfilled", StrawberryFilledItem::new);
	public static final RegistryObject<StrawberryMochiItem> STRAWBERRYMOCHI = ITEMS.register("strawberrymochi", StrawberryMochiItem::new);
	public static final RegistryObject<UbeFrostingDonutItem> UBEFROSTINGDONUT = ITEMS.register("ubefrostingdonut", UbeFrostingDonutItem::new);
	public static final RegistryObject<UbeMochiItem> UBEMOCHI = ITEMS.register("ubemochi", UbeMochiItem::new);
	public static final RegistryObject<WhiteSprinkleDonutItem> WHITESPRINKLEDONUT = ITEMS.register("whitesprinkledonut", WhiteSprinkleDonutItem::new);
	public static final RegistryObject<XmasDonutItem> XMASDONUT = ITEMS.register("xmasdonut", XmasDonutItem::new);
	
	public static void register(IEventBus modEventBus) {
		ITEMS.register(modEventBus);
		return;
    }
	
	public static Collection<RegistryObject<Item>> populateCreativeTab() {
		return ITEMS.getEntries();
    }
}
