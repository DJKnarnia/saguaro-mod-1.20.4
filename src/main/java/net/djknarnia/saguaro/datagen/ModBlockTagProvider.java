package net.djknarnia.saguaro.datagen;

import net.djknarnia.saguaro.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.djknarnia.saguaro.util.ModTags;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {

        getOrCreateTagBuilder(BlockTags.LOGS_THAT_BURN)
                .add(ModBlocks.SAGUARO_STEM)
                .add(ModBlocks.SAGUARO_WOOD)
                .add(ModBlocks.STRIPPED_SAGUARO_STEM)
                .add(ModBlocks.STRIPPED_SAGUARO_WOOD);
    }
}
