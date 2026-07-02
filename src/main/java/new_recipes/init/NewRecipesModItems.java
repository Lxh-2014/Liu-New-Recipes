
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package new_recipes.init;

import new_recipes.item.CopperShovelItem;
import new_recipes.item.CopperNuggetItem;

import new_recipes.NewRecipesMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

public class NewRecipesModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, NewRecipesMod.MODID);
	public static final RegistryObject<Item> COPPER_NUGGET = REGISTRY.register("copper_nugget", () -> new CopperNuggetItem());
	public static final RegistryObject<Item> COPPER_SHOVEL = REGISTRY.register("copper_shovel", () -> new CopperShovelItem());
	// Start of user code block custom items
	// End of user code block custom items
}
