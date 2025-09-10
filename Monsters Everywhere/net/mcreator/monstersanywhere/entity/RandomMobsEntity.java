/*    */ package net.mcreator.monstersanywhere.entity;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.util.RandomSource;
/*    */ import net.minecraft.world.Difficulty;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.EntityType;
/*    */ import net.minecraft.world.entity.LivingEntity;
/*    */ import net.minecraft.world.entity.Mob;
/*    */ import net.minecraft.world.entity.MobSpawnType;
/*    */ import net.minecraft.world.entity.MobType;
/*    */ import net.minecraft.world.entity.PathfinderMob;
/*    */ import net.minecraft.world.entity.SpawnPlacements;
/*    */ import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
/*    */ import net.minecraft.world.entity.ai.attributes.Attributes;
/*    */ import net.minecraft.world.entity.ai.goal.Goal;
/*    */ import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
/*    */ import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
/*    */ import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
/*    */ import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
/*    */ import net.minecraft.world.entity.monster.Monster;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.level.ServerLevelAccessor;
/*    */ 
/*    */ public class RandomMobsEntity extends Monster {
/*    */   public RandomMobsEntity(EntityType<RandomMobsEntity> type, Level world) {
/* 27 */     super(type, world);
/* 28 */     setMaxUpStep(0.6F);
/* 29 */     this.xpReward = 0;
/* 30 */     setNoAi(false);
/*    */   }
/*    */ 
/*    */   
/*    */   protected void registerGoals() {
/* 35 */     super.registerGoals();
/* 36 */     this.goalSelector.addGoal(1, (Goal)new MeleeAttackGoal((PathfinderMob)this, 1.2D, false)
/*    */         {
/*    */           protected boolean canPerformAttack(LivingEntity entity) {
/* 39 */             return (isTimeToAttack() && this.mob.distanceToSqr((Entity)entity) < (this.mob.getBbWidth() * this.mob.getBbWidth() + entity.getBbWidth()) && this.mob.getSensing().hasLineOfSight((Entity)entity));
/*    */           }
/*    */         });
/* 42 */     this.goalSelector.addGoal(2, (Goal)new RandomStrollGoal((PathfinderMob)this, 1.0D));
/* 43 */     this.targetSelector.addGoal(3, (Goal)new HurtByTargetGoal((PathfinderMob)this, new Class[0]));
/* 44 */     this.goalSelector.addGoal(4, (Goal)new RandomLookAroundGoal((Mob)this));
/* 45 */     this.goalSelector.addGoal(5, (Goal)new FloatGoal((Mob)this));
/*    */   }
/*    */ 
/*    */   
/*    */   public MobType getMobType() {
/* 50 */     return MobType.UNDEFINED;
/*    */   }
/*    */ 
/*    */   
/*    */   protected float ridingOffset(Entity entity) {
/* 55 */     return -0.35F;
/*    */   }
/*    */ 
/*    */   
/*    */   public void baseTick() {
/* 60 */     super.baseTick();
/* 61 */     RandomMobsOnEntityTickUpdateProcedure.execute((LevelAccessor)level(), getX(), getY(), getZ(), (Entity)this);
/*    */   }
/*    */   
/*    */   public static void init() {
/* 65 */     SpawnPlacements.register((EntityType)MonstersAnywhereModEntities.RANDOM_MOBS.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (entityType, world, reason, pos, random) -> 
/* 66 */         (world.getDifficulty() != Difficulty.PEACEFUL && Monster.isDarkEnoughToSpawn(world, pos, random) && Mob.checkMobSpawnRules(entityType, (LevelAccessor)world, reason, pos, random)));
/*    */   }
/*    */   
/*    */   public static AttributeSupplier.Builder createAttributes() {
/* 70 */     AttributeSupplier.Builder builder = Mob.createMobAttributes();
/* 71 */     builder = builder.add(Attributes.MOVEMENT_SPEED, 0.3D);
/* 72 */     builder = builder.add(Attributes.MAX_HEALTH, 10.0D);
/* 73 */     builder = builder.add(Attributes.ARMOR, 0.0D);
/* 74 */     builder = builder.add(Attributes.ATTACK_DAMAGE, 3.0D);
/* 75 */     builder = builder.add(Attributes.FOLLOW_RANGE, 16.0D);
/* 76 */     return builder;
/*    */   }
/*    */ }



