/*    */ package net.mcreator.monstersanywhere.init;
/*    */ 
/*    */ import net.mcreator.monstersanywhere.entity.RandomMobsEntity;
/*    */ import net.minecraft.core.registries.Registries;
/*    */ import net.minecraft.world.entity.EntityType;
/*    */ import net.minecraft.world.entity.MobCategory;
/*    */ import net.neoforged.bus.api.SubscribeEvent;
/*    */ import net.neoforged.fml.common.Mod;
/*    */ import net.neoforged.fml.common.Mod.EventBusSubscriber;
/*    */ import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
/*    */ import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;
/*    */ import net.neoforged.neoforge.registries.DeferredHolder;
/*    */ import net.neoforged.neoforge.registries.DeferredRegister;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
/*    */ public class MonstersAnywhereModEntities
/*    */ {
/* 24 */   public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(Registries.ENTITY_TYPE, "monsters_anywhere");
/* 25 */   public static final DeferredHolder<EntityType<?>, EntityType<RandomMobsEntity>> RANDOM_MOBS = register("random_mobs", 
/* 26 */       EntityType.Builder.of(RandomMobsEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
/*    */       
/* 28 */       .sized(0.6F, 1.8F));
/*    */   
/*    */   private static <T extends net.minecraft.world.entity.Entity> DeferredHolder<EntityType<?>, EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
/* 31 */     return REGISTRY.register(registryname, () -> entityTypeBuilder.build(registryname));
/*    */   }
/*    */   
/*    */   @SubscribeEvent
/*    */   public static void init(FMLCommonSetupEvent event) {
/* 36 */     event.enqueueWork(() -> RandomMobsEntity.init());
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   @SubscribeEvent
/*    */   public static void registerAttributes(EntityAttributeCreationEvent event) {
/* 43 */     event.put((EntityType)RANDOM_MOBS.get(), RandomMobsEntity.createAttributes().build());
/*    */   }
/*    */ }

