package net.djknarnia.saguaro.block;

import net.djknarnia.saguaro.SaguaroMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.MapColor;
import net.minecraft.block.PillarBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block SAGUARO_STEM = registerBlock("saguaro_stem",
            new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_LOG).strength(4f)));
    public static final Block SAGUARO_WOOD = registerBlock("saguaro_wood",
            new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_WOOD).strength(4f)));
    public static final Block STRIPPED_SAGUARO_STEM = registerBlock("stripped_saguaro_stem",
            new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_LOG).strength(4f)));
    public static final Block STRIPPED_SAGUARO_WOOD = registerBlock("stripped_saguaro_wood",
            new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD).strength(4f)));
    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(SaguaroMod.MOD_ID, name), block);
    }
    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(SaguaroMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        SaguaroMod.LOGGER.info("Registering Mod Blocks for " + SaguaroMod.MOD_ID);
    }

}
