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

        getOrCreateTagBuilder(BlockTags.BEEHIVES)
                .add(ModBlocks.SAGUARO_BEEHIVE_BLOCK);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.HARDENED_CLAY)
                .add(ModBlocks.HARDENED_CLAY_STAINED_WHITE)
                .add(ModBlocks.HARDENED_CLAY_STAINED_ORANGE)
                .add(ModBlocks.HARDENED_CLAY_STAINED_MAGENTA)
                .add(ModBlocks.HARDENED_CLAY_STAINED_LIGHT_BLUE)
                .add(ModBlocks.HARDENED_CLAY_STAINED_YELLOW)
                .add(ModBlocks.HARDENED_CLAY_STAINED_LIME)
                .add(ModBlocks.HARDENED_CLAY_STAINED_PINK)
                .add(ModBlocks.HARDENED_CLAY_STAINED_GRAY)
                .add(ModBlocks.HARDENED_CLAY_STAINED_LIGHT_GRAY)
                .add(ModBlocks.HARDENED_CLAY_STAINED_CYAN)
                .add(ModBlocks.HARDENED_CLAY_STAINED_PURPLE)
                .add(ModBlocks.HARDENED_CLAY_STAINED_BLUE)
                .add(ModBlocks.HARDENED_CLAY_STAINED_BROWN)
                .add(ModBlocks.HARDENED_CLAY_STAINED_GREEN)
                .add(ModBlocks.HARDENED_CLAY_STAINED_RED)
                .add(ModBlocks.HARDENED_CLAY_STAINED_BLACK)
                .add(ModBlocks.HARDENED_CLAY_REDSTONE_INFUSED);

        getOrCreateTagBuilder(BlockTags.SHOVEL_MINEABLE)
                .add(ModBlocks.CLAY_MESA)
                .add(ModBlocks.CLAY_WHITE)
                .add(ModBlocks.CLAY_ORANGE)
                .add(ModBlocks.CLAY_MAGENTA)
                .add(ModBlocks.CLAY_LIGHT_BLUE)
                .add(ModBlocks.CLAY_YELLOW)
                .add(ModBlocks.CLAY_LIME)
                .add(ModBlocks.CLAY_PINK)
                .add(ModBlocks.CLAY_GRAY)
                .add(ModBlocks.CLAY_LIGHT_GRAY)
                .add(ModBlocks.CLAY_CYAN)
                .add(ModBlocks.CLAY_PURPLE)
                .add(ModBlocks.CLAY_BLUE)
                .add(ModBlocks.CLAY_BROWN)
                .add(ModBlocks.CLAY_GREEN)
                .add(ModBlocks.CLAY_RED)
                .add(ModBlocks.CLAY_BLACK)
                .add(ModBlocks.CLAY_REDSTONE_INFUSED);
    }
}
