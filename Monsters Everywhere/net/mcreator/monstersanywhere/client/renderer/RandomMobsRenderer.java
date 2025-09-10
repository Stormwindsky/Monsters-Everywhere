/*    */ package net.mcreator.monstersanywhere.client.renderer;
/*    */ import net.mcreator.monstersanywhere.entity.RandomMobsEntity;
/*    */ import net.minecraft.client.model.HumanoidModel;
/*    */ import net.minecraft.client.model.geom.ModelLayers;
/*    */ import net.minecraft.client.renderer.entity.EntityRendererProvider;
/*    */ import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
/*    */ import net.minecraft.client.renderer.entity.RenderLayerParent;
/*    */ import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
/*    */ import net.minecraft.client.renderer.entity.layers.RenderLayer;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ 
/*    */ public class RandomMobsRenderer extends HumanoidMobRenderer<RandomMobsEntity, HumanoidModel<RandomMobsEntity>> {
/*    */   public RandomMobsRenderer(EntityRendererProvider.Context context) {
/* 15 */     super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5F);
/* 16 */     addLayer((RenderLayer)new HumanoidArmorLayer((RenderLayerParent)this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));
/*    */   }
/*    */ 
/*    */   
/*    */   public ResourceLocation getTextureLocation(RandomMobsEntity entity) {
/* 21 */     return new ResourceLocation("monsters_anywhere:textures/entities/costume1_5.png");
/*    */   }
/*    */ }



