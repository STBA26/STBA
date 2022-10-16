
package net.mcreator.saintlouisbizzareadventure;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.common.brewing.IBrewingRecipe;
import net.minecraftforge.common.brewing.BrewingRecipeRegistry;

import net.minecraft.potion.PotionUtils;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;

import net.mcreator.saintlouisbizzareadventure.potion.ImagineABigBlackManChasingYouPotion;

@SaintLouisBizzareAdventureModElements.ModElement.Tag
public class IABBMCUBrewingRecipe extends SaintLouisBizzareAdventureModElements.ModElement {
	public IABBMCUBrewingRecipe(SaintLouisBizzareAdventureModElements instance) {
		super(instance, 69);
	}

	@Override
	public void init(FMLCommonSetupEvent event) {
		BrewingRecipeRegistry.addRecipe(new CustomBrewingRecipe());
	}

	public static class CustomBrewingRecipe implements IBrewingRecipe {
		@Override
		public boolean isInput(ItemStack input) {
			return input.getItem() == Items.DIAMOND;
		}

		@Override
		public boolean isIngredient(ItemStack ingredient) {
			return ingredient.getItem() == Items.WATER_BUCKET;
		}

		@Override
		public ItemStack getOutput(ItemStack input, ItemStack ingredient) {
			if (isInput(input) && isIngredient(ingredient)) {
				return PotionUtils.addPotionToItemStack(new ItemStack(Items.POTION), ImagineABigBlackManChasingYouPotion.potionType);
			}
			return ItemStack.EMPTY;
		}
	}
}
