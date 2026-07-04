
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package liu_new_recipes.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import liu_new_recipes.item.CopperSwordItem;
import liu_new_recipes.item.CopperShovelItem;
import liu_new_recipes.item.CopperPickaxeItem;
import liu_new_recipes.item.CopperNuggetItem;
import liu_new_recipes.item.CopperItem;
import liu_new_recipes.item.CopperHoeItem;
import liu_new_recipes.item.CopperAxeItem;

import liu_new_recipes.LiuNewRecipesMod;

public class LiuNewRecipesModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, LiuNewRecipesMod.MODID);
	public static final RegistryObject<Item> COPPER_NUGGET = REGISTRY.register("copper_nugget", () -> new CopperNuggetItem());
	public static final RegistryObject<Item> COPPER_SHOVEL = REGISTRY.register("copper_shovel", () -> new CopperShovelItem());
	public static final RegistryObject<Item> COPPER_PICKAXE = REGISTRY.register("copper_pickaxe", () -> new CopperPickaxeItem());
	public static final RegistryObject<Item> COPPER_AXE = REGISTRY.register("copper_axe", () -> new CopperAxeItem());
	public static final RegistryObject<Item> COPPER_HOE = REGISTRY.register("copper_hoe", () -> new CopperHoeItem());
	public static final RegistryObject<Item> COPPER_SWORD = REGISTRY.register("copper_sword", () -> new CopperSwordItem());
	public static final RegistryObject<Item> COPPER_HELMET = REGISTRY.register("copper_helmet", () -> new CopperItem.Helmet());
	public static final RegistryObject<Item> COPPER_CHESTPLATE = REGISTRY.register("copper_chestplate", () -> new CopperItem.Chestplate());
	public static final RegistryObject<Item> COPPER_LEGGINGS = REGISTRY.register("copper_leggings", () -> new CopperItem.Leggings());
	public static final RegistryObject<Item> COPPER_BOOTS = REGISTRY.register("copper_boots", () -> new CopperItem.Boots());
	// Start of user code block custom items
	// End of user code block custom items
}
