
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package liu_new_recipes.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import liu_new_recipes.LiuNewRecipesMod;

public class LiuNewRecipesModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, LiuNewRecipesMod.MODID);
	public static final RegistryObject<SoundEvent> ITEM_ARMOR_EQUIP_COPPER = REGISTRY.register("item.armor.equip_copper", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("liu_new_recipes", "item.armor.equip_copper")));
}
