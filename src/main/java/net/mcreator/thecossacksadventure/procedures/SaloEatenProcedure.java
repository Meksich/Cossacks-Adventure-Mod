package net.mcreator.thecossacksadventure.procedures;

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
			((PlayerEntity) entity).sendStatusMessage(
					new StringTextComponent("\u041C\u043C\u043C\u043C\u043C, \u0441\u0430\u043B\u044C\u0446\u0435\u0435\u0435\u0435..."), (true));
		}

	}

}
