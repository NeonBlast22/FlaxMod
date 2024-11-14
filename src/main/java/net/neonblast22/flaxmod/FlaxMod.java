package net.neonblast22.flaxmod;

import net.fabricmc.api.ModInitializer;

import net.neonblast22.flaxmod.item.ModItemGroups;
import net.neonblast22.flaxmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FlaxMod implements ModInitializer {
	public static final String MOD_ID = "flaxmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
	}
}