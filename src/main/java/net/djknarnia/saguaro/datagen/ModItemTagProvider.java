package net.djknarnia.saguaro.datagen;

import net.djknarnia.saguaro.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {

        getOrCreateTagBuilder(ItemTags.LOGS_THAT_BURN)
                .add(ModBlocks.SAGUARO_STEM.asItem())
                .add(ModBlocks.SAGUARO_WOOD.asItem())
                .add(ModBlocks.STRIPPED_SAGUARO_STEM.asItem())
                .add(ModBlocks.STRIPPED_SAGUARO_WOOD.asItem());
    }
}