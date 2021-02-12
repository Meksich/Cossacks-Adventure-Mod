package net.mcreator.thecossacksadventure.procedures;

import net.minecraft.util.text.StringTextComponent;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.thecossacksadventure.TheCossacksAdventureModElements;

import java.util.Map;

@TheCossacksAdventureModElements.ModElement.Tag
public class SaloEatenProcedure extends TheCossacksAdventureModElements.ModElement {
	public SaloEatenProcedure(TheCossacksAdventureModElements instance) {
		super(instance, 6);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure SaloEaten!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof PlayerEntity)
			((PlayerEntity) entity).addExperienceLevel((int) 5);
		if (entity instanceof PlayerEntity && !entity.world.isRemote) {
			((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("Mmmm, salooo..."), (true));
		}
	}
}
