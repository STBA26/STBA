
package net.mcreator.saintlouisbizzareadventure.potion;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.potion.Potion;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class GojoPotionPotion {
	@ObjectHolder("saint_louis_bizzare_adventure_:gojo_potion")
	public static final Potion potionType = null;

	@SubscribeEvent
	public static void registerPotion(RegistryEvent.Register<Potion> event) {
		event.getRegistry().register(new PotionCustom());
	}

	public static class PotionCustom extends Potion {
		public PotionCustom() {
			super(new EffectInstance(Effects.SPEED, 1800, 5, false, true), new EffectInstance(Effects.STRENGTH, 1800, 5, false, true),
					new EffectInstance(Effects.JUMP_BOOST, 1800, 2, false, true), new EffectInstance(Effects.REGENERATION, 1800, 4, false, true),
					new EffectInstance(Effects.ABSORPTION, 1800, 2, false, true), new EffectInstance(Effects.RESISTANCE, 1800, 2, false, true),
					new EffectInstance(Effects.HEALTH_BOOST, 1800, 2, false, true));
			setRegistryName("gojo_potion");
		}
	}
}
