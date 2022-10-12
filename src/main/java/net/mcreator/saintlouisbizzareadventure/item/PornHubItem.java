
package net.mcreator.saintlouisbizzareadventure.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.Food;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.block.BlockState;

import net.mcreator.saintlouisbizzareadventure.block.CumBlock;
import net.mcreator.saintlouisbizzareadventure.SaintLouisBizzareAdventureModElements;

@SaintLouisBizzareAdventureModElements.ModElement.Tag
public class PornHubItem extends SaintLouisBizzareAdventureModElements.ModElement {
	@ObjectHolder("saint_louis_bizzare_adventure_:porn_hub")
	public static final Item block = null;

	public PornHubItem(SaintLouisBizzareAdventureModElements instance) {
		super(instance, 23);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(ItemGroup.FOOD).maxStackSize(1).isImmuneToFire().rarity(Rarity.RARE)
					.food((new Food.Builder()).hunger(10).saturation(0.1f)

							.meat().build()));
			setRegistryName("porn_hub");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}

		@Override
		public ItemStack onItemUseFinish(ItemStack itemstack, World world, LivingEntity entity) {
			ItemStack retval = new ItemStack(CumBlock.block);
			super.onItemUseFinish(itemstack, world, entity);
			if (itemstack.isEmpty()) {
				return retval;
			} else {
				if (entity instanceof PlayerEntity) {
					PlayerEntity player = (PlayerEntity) entity;
					if (!player.isCreative() && !player.inventory.addItemStackToInventory(retval))
						player.dropItem(retval, false);
				}
				return itemstack;
			}
		}
	}
}
