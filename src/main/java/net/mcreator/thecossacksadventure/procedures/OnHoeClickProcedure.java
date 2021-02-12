package net.mcreator.thecossacksadventure.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.item.ItemStack;
import net.minecraft.item.HoeItem;

import net.mcreator.thecossacksadventure.block.BlackSoilBlock;
import net.mcreator.thecossacksadventure.TheCossacksAdventureModElements;

import java.util.Map;

@TheCossacksAdventureModElements.ModElement.Tag
public class OnHoeClickProcedure extends TheCossacksAdventureModElements.ModElement {
	public OnHoeClickProcedure(TheCossacksAdventureModElements instance) {
		super(instance, 2);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("itemstack") == null) {
			if (!dependencies.containsKey("itemstack"))
				System.err.println("Failed to load dependency itemstack for procedure OnHoeClick!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				System.err.println("Failed to load dependency world for procedure OnHoeClick!");
			return;
		}
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		IWorld world = (IWorld) dependencies.get("world");
		if (((itemstack).getItem() instanceof HoeItem)) {
			world.setBlockState(new BlockPos((int) 0, (int) 0, (int) 0), BlackSoilBlock.block.getDefaultState(), 3);
		}
	}
}
