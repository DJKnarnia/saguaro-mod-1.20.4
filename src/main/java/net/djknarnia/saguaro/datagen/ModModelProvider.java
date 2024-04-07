package net.djknarnia.saguaro.datagen;

import net.djknarnia.saguaro.block.ModBlocks;
import net.djknarnia.saguaro.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.Block;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.item.Item;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        /*
            Saguaro Blocks
         */
        blockStateModelGenerator.registerLog(ModBlocks.SAGUARO_STEM).log(ModBlocks.SAGUARO_STEM).wood(ModBlocks.SAGUARO_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_SAGUARO_STEM).log(ModBlocks.STRIPPED_SAGUARO_STEM).wood(ModBlocks.STRIPPED_SAGUARO_WOOD);
        blockStateModelGenerator.registerRotatable(ModBlocks.SAGUARO_BEEHIVE_BLOCK);

        /*
            Hardened Clay Blocks
         */
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.HARDENED_CLAY);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.HARDENED_CLAY_STAINED_WHITE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.HARDENED_CLAY_STAINED_ORANGE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.HARDENED_CLAY_STAINED_MAGENTA);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.HARDENED_CLAY_STAINED_LIGHT_BLUE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.HARDENED_CLAY_STAINED_YELLOW);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.HARDENED_CLAY_STAINED_LIME);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.HARDENED_CLAY_STAINED_PINK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.HARDENED_CLAY_STAINED_GRAY);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.HARDENED_CLAY_STAINED_LIGHT_GRAY);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.HARDENED_CLAY_STAINED_CYAN);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.HARDENED_CLAY_STAINED_PURPLE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.HARDENED_CLAY_STAINED_BLUE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.HARDENED_CLAY_STAINED_BROWN);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.HARDENED_CLAY_STAINED_GREEN);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.HARDENED_CLAY_STAINED_RED);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.HARDENED_CLAY_STAINED_BLACK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.HARDENED_CLAY_REDSTONE_INFUSED);
        /*
            Clay Blocks
         */
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CLAY_MESA);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CLAY_WHITE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CLAY_ORANGE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CLAY_MAGENTA);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CLAY_LIGHT_BLUE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CLAY_YELLOW);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CLAY_LIME);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CLAY_PINK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CLAY_GRAY);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CLAY_LIGHT_GRAY);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CLAY_CYAN);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CLAY_PURPLE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CLAY_BLUE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CLAY_BROWN);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CLAY_GREEN);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CLAY_RED);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CLAY_BLACK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CLAY_REDSTONE_INFUSED);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.SAGUARO_FRUIT, Models.GENERATED);
    }
}
