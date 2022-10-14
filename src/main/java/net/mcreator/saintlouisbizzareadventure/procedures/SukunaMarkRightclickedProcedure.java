package net.mcreator.saintlouisbizzareadventure.procedures;

import net.minecraftforge.fml.common.ObfuscationReflectionHelper;

import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.FoodStats;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.saintlouisbizzareadventure.SaintLouisBizzareAdventureMod;

import java.util.Map;

public class SukunaMarkRightclickedProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				SaintLouisBizzareAdventureMod.LOGGER.warn("Failed to load dependency entity for procedure SukunaMarkRightclicked!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SPEED, (int) 800, (int) 2));
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.HASTE, (int) 800, (int) 4));
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.RESISTANCE, (int) 800, (int) 2));
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.ABSORPTION, (int) 800, (int) 2));
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.WATER_BREATHING, (int) 800, (int) 1));
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.NAUSEA, (int) 120, (int) 1));
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.NIGHT_VISION, (int) 800, (int) 1));
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.FIRE_RESISTANCE, (int) 800, (int) 10));
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.HEALTH_BOOST, (int) 800, (int) 5));
		if (entity instanceof PlayerEntity) {
			ObfuscationReflectionHelper.setPrivateValue(FoodStats.class, ((PlayerEntity) entity).getFoodStats(), (float) 1000, "field_75125_b");
		}
		if (entity instanceof PlayerEntity)
			((PlayerEntity) entity).getFoodStats().setFoodLevel((int) 20);
		if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
			((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("Faite attention tu vien d'utiliser Sukuna!!"), (true));
		}
	}
}
