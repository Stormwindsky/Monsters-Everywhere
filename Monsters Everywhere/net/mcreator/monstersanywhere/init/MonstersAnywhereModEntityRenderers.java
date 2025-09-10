/*    */ package net.mcreator.monstersanywhere.init;
/*    */ 
/*    */ import net.minecraft.client.renderer.entity.EntityRendererProvider;
/*    */ import net.minecraft.world.entity.EntityType;
/*    */ import net.neoforged.api.distmarker.Dist;
/*    */ import net.neoforged.bus.api.SubscribeEvent;
/*    */ import net.neoforged.fml.common.Mod;
/*    */ import net.neoforged.fml.common.Mod.EventBusSubscriber;
/*    */ import net.neoforged.neoforge.client.event.EntityRenderersEvent;
/*    */ 
/*    */ 
/*    */ 
/*    */ @EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
/*    */ public class MonstersAnywhereModEntityRenderers
/*    */ {
/*    */   @SubscribeEvent
/*    */   public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
/* 18 */     event.registerEntityRenderer((EntityType)MonstersAnywhereModEntities.RANDOM_MOBS.get(), net.mcreator.monstersanywhere.client.renderer.RandomMobsRenderer::new);
/*    */   }
/*    */ }



