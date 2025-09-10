/*    */ package net.mcreator.monstersanywhere.procedures;
/*    */ 
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.server.level.ServerLevel;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.EntityType;
/*    */ import net.minecraft.world.entity.MobSpawnType;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ 
/*    */ public class RandomMobsOnEntityTickUpdateProcedure {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/* 12 */     if (entity == null)
/*    */       return; 
/* 14 */     if (!entity.level().isClientSide())
/* 15 */       entity.discard(); 
/* 16 */     if (Math.random() < 0.7D)
/* 17 */     { if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 18 */         Entity entityToSpawn = EntityType.ZOMBIE.spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
/* 19 */         if (entityToSpawn != null) {
/* 20 */           entityToSpawn.setYRot(world.getRandom().nextFloat() * 360.0F);
/*    */         } }
/*    */       
/*    */        }
/* 24 */     else if (Math.random() < 0.7D)
/* 25 */     { if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 26 */         Entity entityToSpawn = EntityType.SKELETON.spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
/* 27 */         if (entityToSpawn != null) {
/* 28 */           entityToSpawn.setYRot(world.getRandom().nextFloat() * 360.0F);
/*    */         } }
/*    */       
/*    */        }
/* 32 */     else if (Math.random() < 0.7D)
/* 33 */     { if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 34 */         Entity entityToSpawn = EntityType.CREEPER.spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
/* 35 */         if (entityToSpawn != null) {
/* 36 */           entityToSpawn.setYRot(world.getRandom().nextFloat() * 360.0F);
/*    */         } }
/*    */       
/*    */        }
/* 40 */     else if (Math.random() < 0.7D)
/* 41 */     { if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 42 */         Entity entityToSpawn = EntityType.SPIDER.spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
/* 43 */         if (entityToSpawn != null) {
/* 44 */           entityToSpawn.setYRot(world.getRandom().nextFloat() * 360.0F);
/*    */         } }
/*    */       
/*    */        }
/* 48 */     else if (Math.random() < 0.7D)
/* 49 */     { if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 50 */         Entity entityToSpawn = EntityType.WITCH.spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
/* 51 */         if (entityToSpawn != null) {
/* 52 */           entityToSpawn.setYRot(world.getRandom().nextFloat() * 360.0F);
/*    */         } }
/*    */       
/*    */        }
/* 56 */     else if (Math.random() < 0.7D && 
/* 57 */       world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 58 */       Entity entityToSpawn = EntityType.ZOMBIE_VILLAGER.spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
/* 59 */       if (entityToSpawn != null)
/* 60 */         entityToSpawn.setYRot(world.getRandom().nextFloat() * 360.0F);  }
/*    */   
/*    */   }
/*    */ }
