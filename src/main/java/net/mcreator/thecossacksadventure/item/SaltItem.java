
package net.mcreator.thecossacksadventure.item;

@TheCossacksAdventureModElements.ModElement.Tag
public class SaltItem extends TheCossacksAdventureModElements.ModElement {

	@ObjectHolder("the_cossacks_adventure:salt")
	public static final Item block = null;

	public SaltItem(TheCossacksAdventureModElements instance) {
		super(instance, 5);

	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {

		public ItemCustom() {
			super(new Item.Properties().group(ItemGroup.MISC).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("salt");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}

	}

}
