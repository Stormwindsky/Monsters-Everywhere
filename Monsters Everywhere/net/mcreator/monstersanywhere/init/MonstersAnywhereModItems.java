/*    */ package net.mcreator.monstersanywhere.init;
/*    */ 
/*    */ import java.util.function.Supplier;
/*    */ import net.minecraft.core.Registry;
/*    */ import net.minecraft.core.registries.BuiltInRegistries;
/*    */ import net.minecraft.world.item.Item;
/*    */ import net.neoforged.bus.api.IEventBus;
/*    */ import net.neoforged.neoforge.common.DeferredSpawnEggItem;
/*    */ import net.neoforged.neoforge.registries.DeferredHolder;
/*    */ import net.neoforged.neoforge.registries.DeferredRegister;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class MonstersAnywhereModItems
/*    */ {
/* 18 */   public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create((Registry)BuiltInRegistries.ITEM, "monsters_anywhere");
/* 19 */   public static final DeferredHolder<Item, Item> RANDOM_MOBS_SPAWN_EGG = REGISTRY.register("random_mobs_spawn_egg", () -> new DeferredSpawnEggItem((Supplier)MonstersAnywhereModEntities.RANDOM_MOBS, -1, -1, new Item.Properties()));
/*    */ 
/*    */ 
/*    */   
/*    */   public static void register(IEventBus bus) {
/* 24 */     REGISTRY.register(bus);
/*    */   }
/*    */ }



