
package net.mcreator.saintlouisbizzareadventure.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.AxeItem;

import net.mcreator.saintlouisbizzareadventure.SaintLouisBizzareAdventureModElements;

@SaintLouisBizzareAdventureModElements.ModElement.Tag
public class GigaChadAxeItem extends SaintLouisBizzareAdventureModElements.ModElement {
	@ObjectHolder("saint_louis_bizzare_adventure_:giga_chad_axe")
	public static final Item block = null;

	public GigaChadAxeItem(SaintLouisBizzareAdventureModElements instance) {
		super(instance, 37);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
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
		}.setRegistryName("giga_chad_axe"));
	}
}
