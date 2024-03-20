package net.djknarnia.saguaro.block;

import net.djknarnia.saguaro.SaguaroMod;
import net.djknarnia.saguaro.block.custom.HardenedClayBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {

    /*
        Saguaro Blocks
     */
    public static final Block SAGUARO_STEM = registerBlock("saguaro_stem",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block SAGUARO_WOOD = registerBlock("saguaro_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD)));
    public static final Block STRIPPED_SAGUARO_STEM = registerBlock("stripped_saguaro_stem",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG)));
    public static final Block STRIPPED_SAGUARO_WOOD = registerBlock("stripped_saguaro_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD)));
    /*
        Hardened Clay Blocks
    */
    public static final HardenedClayBlock HARDENED_CLAY = (HardenedClayBlock) registerBlock("hardened_clay",
            new HardenedClayBlock(Blocks.CLAY, FabricBlockSettings.copyOf(Blocks.SANDSTONE).mapColor(MapColor.RAW_IRON_PINK)));
    public static final Block HARDENED_CLAY_STAINED_WHITE = registerBlock("hardened_clay_stained_white",
            new Block(FabricBlockSettings.copyOf(Blocks.SANDSTONE).mapColor(MapColor.TERRACOTTA_WHITE)));
    public static final Block HARDENED_CLAY_STAINED_ORANGE = registerBlock("hardened_clay_stained_orange",
            new Block(FabricBlockSettings.copyOf(Blocks.SANDSTONE).mapColor(MapColor.TERRACOTTA_ORANGE)));
    public static final Block HARDENED_CLAY_STAINED_MAGENTA = registerBlock("hardened_clay_stained_magenta",
            new Block(FabricBlockSettings.copyOf(Blocks.SANDSTONE).mapColor(MapColor.TERRACOTTA_MAGENTA)));
    public static final Block HARDENED_CLAY_STAINED_LIGHT_BLUE = registerBlock("hardened_clay_stained_light_blue",
            new Block(FabricBlockSettings.copyOf(Blocks.SANDSTONE).mapColor(MapColor.TERRACOTTA_LIGHT_BLUE)));
    public static final Block HARDENED_CLAY_STAINED_YELLOW = registerBlock("hardened_clay_stained_yellow",
            new Block(FabricBlockSettings.copyOf(Blocks.SANDSTONE).mapColor(MapColor.TERRACOTTA_YELLOW)));
    public static final Block HARDENED_CLAY_STAINED_LIME = registerBlock("hardened_clay_stained_lime",
            new Block(FabricBlockSettings.copyOf(Blocks.SANDSTONE).mapColor(MapColor.TERRACOTTA_LIME)));
    public static final Block HARDENED_CLAY_STAINED_PINK = registerBlock("hardened_clay_stained_pink",
            new Block(FabricBlockSettings.copyOf(Blocks.SANDSTONE).mapColor(MapColor.TERRACOTTA_PINK)));
    public static final Block HARDENED_CLAY_STAINED_GRAY = registerBlock("hardened_clay_stained_gray",
            new Block(FabricBlockSettings.copyOf(Blocks.SANDSTONE).mapColor(MapColor.TERRACOTTA_GRAY)));
    public static final Block HARDENED_CLAY_STAINED_LIGHT_GRAY = registerBlock("hardened_clay_stained_light_gray",
            new Block(FabricBlockSettings.copyOf(Blocks.SANDSTONE).mapColor(MapColor.TERRACOTTA_LIGHT_GRAY)));
    public static final Block HARDENED_CLAY_STAINED_CYAN = registerBlock("hardened_clay_stained_cyan",
            new Block(FabricBlockSettings.copyOf(Blocks.SANDSTONE).mapColor(MapColor.TERRACOTTA_CYAN)));
    public static final Block HARDENED_CLAY_STAINED_PURPLE = registerBlock("hardened_clay_stained_purple",
            new Block(FabricBlockSettings.copyOf(Blocks.SANDSTONE).mapColor(MapColor.TERRACOTTA_PURPLE)));
    public static final Block HARDENED_CLAY_STAINED_BLUE = registerBlock("hardened_clay_stained_blue",
            new Block(FabricBlockSettings.copyOf(Blocks.SANDSTONE).mapColor(MapColor.TERRACOTTA_BLUE)));
    public static final Block HARDENED_CLAY_STAINED_BROWN = registerBlock("hardened_clay_stained_brown",
            new Block(FabricBlockSettings.copyOf(Blocks.SANDSTONE).mapColor(MapColor.TERRACOTTA_BROWN)));
    public static final Block HARDENED_CLAY_STAINED_GREEN = registerBlock("hardened_clay_stained_green",
            new Block(FabricBlockSettings.copyOf(Blocks.SANDSTONE).mapColor(MapColor.TERRACOTTA_GREEN)));
    public static final Block HARDENED_CLAY_STAINED_RED = registerBlock("hardened_clay_stained_red",
            new Block(FabricBlockSettings.copyOf(Blocks.SANDSTONE).mapColor(MapColor.TERRACOTTA_RED)));
    public static final Block HARDENED_CLAY_STAINED_BLACK = registerBlock("hardened_clay_stained_black",
            new Block(FabricBlockSettings.copyOf(Blocks.SANDSTONE).mapColor(MapColor.TERRACOTTA_BLACK)));
    public static final Block HARDENED_CLAY_REDSTONE_INFUSED = registerBlock("hardened_clay_redstone_infused",
            new Block(FabricBlockSettings.copyOf(Blocks.SANDSTONE).mapColor(MapColor.RED)));

    /*
        Clay Blocks
     */
    public static final Block CLAY_MESA = registerBlock("clay_mesa",
            new Block(FabricBlockSettings.copyOf(Blocks.CLAY).mapColor(MapColor.RAW_IRON_PINK)));
    public static final Block CLAY_WHITE = registerBlock("clay_white",
            new Block(FabricBlockSettings.copyOf(Blocks.CLAY).mapColor(MapColor.TERRACOTTA_WHITE)));
    public static final Block CLAY_ORANGE = registerBlock("clay_orange",
            new Block(FabricBlockSettings.copyOf(Blocks.CLAY).mapColor(MapColor.TERRACOTTA_ORANGE)));
    public static final Block CLAY_MAGENTA = registerBlock("clay_magenta",
            new Block(FabricBlockSettings.copyOf(Blocks.CLAY).mapColor(MapColor.TERRACOTTA_MAGENTA)));
    public static final Block CLAY_LIGHT_BLUE = registerBlock("clay_light_blue",
            new Block(FabricBlockSettings.copyOf(Blocks.CLAY).mapColor(MapColor.TERRACOTTA_LIGHT_BLUE)));
    public static final Block CLAY_YELLOW = registerBlock("clay_yellow",
            new Block(FabricBlockSettings.copyOf(Blocks.CLAY).mapColor(MapColor.TERRACOTTA_YELLOW)));
    public static final Block CLAY_LIME = registerBlock("clay_lime",
            new Block(FabricBlockSettings.copyOf(Blocks.CLAY).mapColor(MapColor.TERRACOTTA_LIME)));
    public static final Block CLAY_PINK = registerBlock("clay_pink",
            new Block(FabricBlockSettings.copyOf(Blocks.CLAY).mapColor(MapColor.TERRACOTTA_PINK)));
    public static final Block CLAY_GRAY = registerBlock("clay_gray",
            new Block(FabricBlockSettings.copyOf(Blocks.CLAY).mapColor(MapColor.TERRACOTTA_GRAY)));
    public static final Block CLAY_LIGHT_GRAY = registerBlock("clay_light_gray",
            new Block(FabricBlockSettings.copyOf(Blocks.CLAY).mapColor(MapColor.TERRACOTTA_LIGHT_GRAY)));
    public static final Block CLAY_CYAN = registerBlock("clay_cyan",
            new Block(FabricBlockSettings.copyOf(Blocks.CLAY).mapColor(MapColor.TERRACOTTA_CYAN)));
    public static final Block CLAY_PURPLE = registerBlock("clay_purple",
            new Block(FabricBlockSettings.copyOf(Blocks.CLAY).mapColor(MapColor.TERRACOTTA_PURPLE)));
    public static final Block CLAY_BLUE = registerBlock("clay_blue",
            new Block(FabricBlockSettings.copyOf(Blocks.CLAY).mapColor(MapColor.TERRACOTTA_BLUE)));
    public static final Block CLAY_BROWN = registerBlock("clay_brown",
            new Block(FabricBlockSettings.copyOf(Blocks.CLAY).mapColor(MapColor.TERRACOTTA_BROWN)));
    public static final Block CLAY_GREEN = registerBlock("clay_green",
            new Block(FabricBlockSettings.copyOf(Blocks.CLAY).mapColor(MapColor.TERRACOTTA_GREEN)));
    public static final Block CLAY_RED = registerBlock("clay_red",
            new Block(FabricBlockSettings.copyOf(Blocks.CLAY).mapColor(MapColor.TERRACOTTA_RED)));
    public static final Block CLAY_BLACK = registerBlock("clay_black",
            new Block(FabricBlockSettings.copyOf(Blocks.CLAY).mapColor(MapColor.TERRACOTTA_BLACK)));
    public static final Block CLAY_REDSTONE_INFUSED = registerBlock("clay_redstone_infused",
            new Block(FabricBlockSettings.copyOf(Blocks.CLAY).mapColor(MapColor.RED)));

    /*
        Registration Functions
     */
    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(SaguaroMod.MOD_ID, name), block);
    }
    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, new Identifier(SaguaroMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        SaguaroMod.LOGGER.info("Registering Mod Blocks for " + SaguaroMod.MOD_ID);
    }

}
