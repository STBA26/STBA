
package net.mcreator.saintlouisbizzareadventure;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.common.brewing.IBrewingRecipe;
import net.minecraftforge.common.brewing.BrewingRecipeRegistry;

import net.minecraft.potion.PotionUtils;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;

import net.mcreator.saintlouisbizzareadventure.potion.GojoPotionPotion;
import net.mcreator.saintlouisbizzareadventure.item.NumberTWELVECOCKItem;
import net.mcreator.saintlouisbizzareadventure.block.GigaChadOreBlock;

@SaintLouisBizzareAdventureModElements.ModElement.Tag
public class GojopotiocraftBrewingRecipe extends SaintLouisBizzareAdventureModElements.ModElement {
	public GojopotiocraftBrewingRecipe(SaintLouisBizzareAdventureModElements instance) {
		super(instance, 64);
	}

	@Override
	public void init(FMLCommonSetupEvent event) {
		BrewingRecipeRegistry.addRecipe(new CustomBrewingRecipe());
	}

	public static class CustomBrewingRecipe implements IBrewingRecipe {
		@Override
		public boolean isInput(ItemStack input) {
			return input.getItem() == GigaChadOreBlock.block.asItem();
		}

		@Override
		public boolean isIngredient(ItemStack ingredient) {
			return ingredient.getItem() == NumberTWELVECOCKItem.block;
		}

		@Override
		public ItemStack getOutput(ItemStack input, ItemStack ingredient) {
			if (isInput(input) && isIngredient(ingredient)) {
				return PotionUtils.addPotionToItemStack(new ItemStack(Items.POTION), GojoPotionPotion.potionType);
			}
			return ItemStack.EMPTY;
		}
	}
}
