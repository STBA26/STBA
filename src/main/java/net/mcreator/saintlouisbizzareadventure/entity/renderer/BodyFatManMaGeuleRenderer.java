
package net.mcreator.saintlouisbizzareadventure.entity.renderer;

@OnlyIn(Dist.CLIENT)
public class BodyFatManMaGeuleRenderer {

	public static class ModelRegisterHandler {

		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(BodyFatManMaGeuleEntity.entity,
					renderManager -> new MobRenderer(renderManager, new PigModel(), 0.5f) {

						@Override
						public ResourceLocation getEntityTexture(Entity entity) {
							return new ResourceLocation("saint_louis_bizzare_adventure_:textures/entities/bodyfatmanmageule.png");
						}

					});

		}
	}

}
