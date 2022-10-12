
package net.mcreator.saintlouisbizzareadventure.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.Food;
import net.minecraft.block.BlockState;

import net.mcreator.saintlouisbizzareadventure.SaintLouisBizzareAdventureModElements;

@SaintLouisBizzareAdventureModElements.ModElement.Tag
public class FriteItem extends SaintLouisBizzareAdventureModElements.ModElement {
	@ObjectHolder("saint_louis_bizzare_adventure_:frite")
	public static final Item block = null;

	public FriteItem(SaintLouisBizzareAdventureModElements instance) {
		super(instance, 24);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(ItemGroup.FOOD).maxDamage(1).rarity(Rarity.UNCOMMON)
					.food((new Food.Builder()).hunger(5).saturation(-1f).setAlwaysEdible().meat().build()));
			setRegistryName("frite");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 2F;
		}
	}
}
