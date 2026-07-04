
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package liu_new_recipes.init;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import liu_new_recipes.LiuNewRecipesMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class LiuNewRecipesModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, LiuNewRecipesMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(LiuNewRecipesModItems.COPPER_NUGGET.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(LiuNewRecipesModItems.COPPER_SHOVEL.get());
			tabData.accept(LiuNewRecipesModItems.COPPER_PICKAXE.get());
			tabData.accept(LiuNewRecipesModItems.COPPER_AXE.get());
			tabData.accept(LiuNewRecipesModItems.COPPER_HOE.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(LiuNewRecipesModItems.COPPER_SWORD.get());
			tabData.accept(LiuNewRecipesModItems.COPPER_AXE.get());
			tabData.accept(LiuNewRecipesModItems.COPPER_HELMET.get());
			tabData.accept(LiuNewRecipesModItems.COPPER_CHESTPLATE.get());
			tabData.accept(LiuNewRecipesModItems.COPPER_LEGGINGS.get());
			tabData.accept(LiuNewRecipesModItems.COPPER_BOOTS.get());
		}
	}
}
