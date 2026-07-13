
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.monsterseverywhere.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.item.Item;

import net.mcreator.monsterseverywhere.MonstersEverywhereMod;

public class MonstersEverywhereModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MonstersEverywhereMod.MODID);
	public static final RegistryObject<Item> RANDOM_SPAWN_EGG = REGISTRY.register("random_spawn_egg", () -> new ForgeSpawnEggItem(MonstersEverywhereModEntities.RANDOM, -10092442, -6750055, new Item.Properties()));
	public static final RegistryObject<Item> RANDOM_NETHER_SPAWN_EGG = REGISTRY.register("random_nether_spawn_egg", () -> new ForgeSpawnEggItem(MonstersEverywhereModEntities.RANDOM_NETHER, -10092544, -13434880, new Item.Properties()));
	// Start of user code block custom items
	// End of user code block custom items
}
