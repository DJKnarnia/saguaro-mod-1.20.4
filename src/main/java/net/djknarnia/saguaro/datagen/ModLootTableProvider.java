package net.djknarnia.saguaro.datagen;

import net.djknarnia.saguaro.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    protected ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.SAGUARO_STEM);
        addDrop(ModBlocks.SAGUARO_WOOD);
        addDrop(ModBlocks.STRIPPED_SAGUARO_STEM);
        addDrop(ModBlocks.STRIPPED_SAGUARO_WOOD);
    }
}
