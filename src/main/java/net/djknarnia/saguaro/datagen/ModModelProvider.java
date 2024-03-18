package net.djknarnia.saguaro.datagen;

import net.djknarnia.saguaro.block.ModBlocks;
import net.djknarnia.saguaro.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerLog(ModBlocks.SAGUARO_STEM).log(ModBlocks.SAGUARO_STEM).wood(ModBlocks.SAGUARO_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_SAGUARO_STEM).log(ModBlocks.STRIPPED_SAGUARO_STEM).wood(ModBlocks.STRIPPED_SAGUARO_WOOD);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.SAGUARO_FRUIT, Models.GENERATED);
    }
}
