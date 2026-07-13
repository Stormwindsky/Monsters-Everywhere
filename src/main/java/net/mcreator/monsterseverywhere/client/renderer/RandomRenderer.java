
package net.mcreator.monsterseverywhere.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.mcreator.monsterseverywhere.entity.RandomEntity;

public class RandomRenderer extends HumanoidMobRenderer<RandomEntity, HumanoidModel<RandomEntity>> {
	public RandomRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel<RandomEntity>(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));
	}

	@Override
	public ResourceLocation getTextureLocation(RandomEntity entity) {
		return new ResourceLocation("monsters_everywhere:textures/entities/noskin.png");
	}
}
