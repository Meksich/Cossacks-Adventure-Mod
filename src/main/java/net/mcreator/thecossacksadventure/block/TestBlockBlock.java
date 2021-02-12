
package net.mcreator.thecossacksadventure.block;

import net.minecraft.block.material.Material;

@TheCossacksAdventureModElements.ModElement.Tag
public class TestBlockBlock extends TheCossacksAdventureModElements.ModElement {

	@ObjectHolder("the_cossacks_adventure:test_block")
	public static final Block block = null;

	public TestBlockBlock(TheCossacksAdventureModElements instance) {
		super(instance, 1);

	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items
				.add(() -> new BlockItem(block, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName(block.getRegistryName()));
	}

	public static class CustomBlock extends Block {

		public CustomBlock() {
			super(

					Block.Properties.create(Material.ROCK).sound(SoundType.GROUND).hardnessAndResistance(1f, 10f).lightValue(0));

			setRegistryName("test_block");
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {

			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(this, 1));
		}

	}

}
