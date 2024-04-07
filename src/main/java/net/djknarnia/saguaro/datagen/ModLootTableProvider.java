package net.djknarnia.saguaro.datagen;

import net.djknarnia.saguaro.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {

        /*
            Saguaro Blocks
         */
        addDrop(ModBlocks.SAGUARO_STEM);
        addDrop(ModBlocks.SAGUARO_WOOD);
        addDrop(ModBlocks.STRIPPED_SAGUARO_STEM);
        addDrop(ModBlocks.STRIPPED_SAGUARO_WOOD);

        addDrop(ModBlocks.SAGUARO_BEEHIVE_BLOCK);

        /*
            Hardened Clay Blocks
         */
        addDrop(ModBlocks.HARDENED_CLAY);
        addDrop(ModBlocks.HARDENED_CLAY_STAINED_WHITE);
        addDrop(ModBlocks.HARDENED_CLAY_STAINED_ORANGE);
        addDrop(ModBlocks.HARDENED_CLAY_STAINED_MAGENTA);
        addDrop(ModBlocks.HARDENED_CLAY_STAINED_LIGHT_BLUE);
        addDrop(ModBlocks.HARDENED_CLAY_STAINED_YELLOW);
        addDrop(ModBlocks.HARDENED_CLAY_STAINED_LIME);
        addDrop(ModBlocks.HARDENED_CLAY_STAINED_PINK);
        addDrop(ModBlocks.HARDENED_CLAY_STAINED_GRAY);
        addDrop(ModBlocks.HARDENED_CLAY_STAINED_LIGHT_GRAY);
        addDrop(ModBlocks.HARDENED_CLAY_STAINED_CYAN);
        addDrop(ModBlocks.HARDENED_CLAY_STAINED_PURPLE);
        addDrop(ModBlocks.HARDENED_CLAY_STAINED_BLUE);
        addDrop(ModBlocks.HARDENED_CLAY_STAINED_BROWN);
        addDrop(ModBlocks.HARDENED_CLAY_STAINED_GREEN);
        addDrop(ModBlocks.HARDENED_CLAY_STAINED_RED);
        addDrop(ModBlocks.HARDENED_CLAY_STAINED_BLACK);
        addDrop(ModBlocks.HARDENED_CLAY_REDSTONE_INFUSED);

        /*
            Clay Blocks
         */
        addDrop(ModBlocks.CLAY_MESA);
        addDrop(ModBlocks.CLAY_WHITE);
        addDrop(ModBlocks.CLAY_ORANGE);
        addDrop(ModBlocks.CLAY_MAGENTA);
        addDrop(ModBlocks.CLAY_LIGHT_BLUE);
        addDrop(ModBlocks.CLAY_YELLOW);
        addDrop(ModBlocks.CLAY_LIME);
        addDrop(ModBlocks.CLAY_PINK);
        addDrop(ModBlocks.CLAY_GRAY);
        addDrop(ModBlocks.CLAY_LIGHT_GRAY);
        addDrop(ModBlocks.CLAY_CYAN);
        addDrop(ModBlocks.CLAY_PURPLE);
        addDrop(ModBlocks.CLAY_BLUE);
        addDrop(ModBlocks.CLAY_BROWN);
        addDrop(ModBlocks.CLAY_GREEN);
        addDrop(ModBlocks.CLAY_RED);
        addDrop(ModBlocks.CLAY_BLACK);
        addDrop(ModBlocks.CLAY_REDSTONE_INFUSED);
    }
}
