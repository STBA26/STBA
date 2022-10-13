package net.mcreator.saintlouisbizzareadventure.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.entity.Entity;
import net.minecraft.block.Blocks;

import net.mcreator.saintlouisbizzareadventure.SaintLouisBizzareAdventureMod;

import java.util.Map;

public class NONLANCEFLAMMEBULLETHITBLOCKProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				SaintLouisBizzareAdventureMod.LOGGER.warn("Failed to load dependency world for procedure NONLANCEFLAMMEBULLETHITBLOCK!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				SaintLouisBizzareAdventureMod.LOGGER.warn("Failed to load dependency x for procedure NONLANCEFLAMMEBULLETHITBLOCK!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				SaintLouisBizzareAdventureMod.LOGGER.warn("Failed to load dependency y for procedure NONLANCEFLAMMEBULLETHITBLOCK!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				SaintLouisBizzareAdventureMod.LOGGER.warn("Failed to load dependency z for procedure NONLANCEFLAMMEBULLETHITBLOCK!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				SaintLouisBizzareAdventureMod.LOGGER.warn("Failed to load dependency entity for procedure NONLANCEFLAMMEBULLETHITBLOCK!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		world.setBlockState(new BlockPos(x, y, z), Blocks.FIRE.getDefaultState(), 3);
		entity.setFire((int) 15);
	}
}
