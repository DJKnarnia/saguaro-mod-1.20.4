package net.djknarnia.saguaro;

import net.djknarnia.saguaro.block.ModBlocks;
import net.djknarnia.saguaro.item.ModItemGroups;
import net.djknarnia.saguaro.item.ModItems;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SaguaroMod implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.

	public static final String MOD_ID = "saguaro";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		StrippableBlockRegistry.register(ModBlocks.SAGUARO_STEM, ModBlocks.STRIPPED_SAGUARO_STEM);
		StrippableBlockRegistry.register(ModBlocks.SAGUARO_WOOD, ModBlocks.STRIPPED_SAGUARO_WOOD);

		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.SAGUARO_STEM, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_SAGUARO_STEM, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.SAGUARO_WOOD, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_SAGUARO_WOOD, 5, 5);
	}
}