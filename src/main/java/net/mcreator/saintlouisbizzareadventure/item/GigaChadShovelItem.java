
package net.mcreator.saintlouisbizzareadventure.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.saintlouisbizzareadventure.SaintLouisBizzareAdventureModElements;

@SaintLouisBizzareAdventureModElements.ModElement.Tag
public class GigaChadShovelItem extends SaintLouisBizzareAdventureModElements.ModElement {
	@ObjectHolder("saint_louis_bizzare_adventure_:giga_chad_shovel")
	public static final Item block = null;

	public GigaChadShovelItem(SaintLouisBizzareAdventureModElements instance) {
		super(instance, 15);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ShovelItem(new IItemTier() {
			public int getMaxUses() {
				return 660;
			}

			public float getEfficiency() {
				return 9f;
			}

			public float getAttackDamage() {
				return 2f;
			}

			public int getHarvestLevel() {
				return 4;
			}

			public int getEnchantability() {
				return 28;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(GigaChadIngotItem.block));
			}
		}, 1, -3f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("giga_chad_shovel"));
	}
}
