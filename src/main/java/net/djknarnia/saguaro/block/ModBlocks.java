package net.djknarnia.saguaro.block;

import net.djknarnia.saguaro.SaguaroMod;
import net.djknarnia.saguaro.block.custom.HardenedClayBlock;
import net.djknarnia.saguaro.block.custom.SaguaroBlock;
import net.djknarnia.saguaro.block.custom.SoftenedClayBlock;
import net.djknarnia.saguaro.util.ModTags;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import java.util.function.Supplier;

public class ModBlocks {
    /*
        Saguaro Blocks
     */
    public static final SaguaroBlock SAGUARO_STEM = (SaguaroBlock) registerBlock("saguaro_stem",
            new SaguaroBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final SaguaroBlock SAGUARO_WOOD = (SaguaroBlock) registerBlock("saguaro_wood",
            new SaguaroBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD)));
    public static final Block STRIPPED_SAGUARO_STEM = registerBlock("stripped_saguaro_stem",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG)));
    public static final Block STRIPPED_SAGUARO_WOOD = registerBlock("stripped_saguaro_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD)));
    /*
        Suppliers
     */
    static Supplier<HardenedClayBlock> hardenedClayBlockSupplier = () -> ModBlocks.HARDENED_CLAY;
    static Supplier<SoftenedClayBlock> mesaClayBlockSupplier = () -> (SoftenedClayBlock) ModBlocks.CLAY_MESA;
    static Supplier<HardenedClayBlock> hardenedWhiteClayBlockSupplier = () -> ModBlocks.HARDENED_CLAY_STAINED_WHITE;
    static Supplier<SoftenedClayBlock> whiteClayBlockSupplier = () -> (SoftenedClayBlock) ModBlocks.CLAY_WHITE;
    static Supplier<HardenedClayBlock> hardenedOrangeClayBlockSupplier = () -> ModBlocks.HARDENED_CLAY_STAINED_ORANGE;
    static Supplier<SoftenedClayBlock> orangeClayBlockSupplier = () -> (SoftenedClayBlock) ModBlocks.CLAY_ORANGE;
    static Supplier<HardenedClayBlock> hardenedMagentaClayBlockSupplier = () -> ModBlocks.HARDENED_CLAY_STAINED_MAGENTA;
    static Supplier<SoftenedClayBlock> magentaClayBlockSupplier = () -> (SoftenedClayBlock) ModBlocks.CLAY_MAGENTA;
    static Supplier<HardenedClayBlock> hardenedLightBlueClayBlockSupplier = () -> ModBlocks.HARDENED_CLAY_STAINED_LIGHT_BLUE;
    static Supplier<SoftenedClayBlock> lightBlueClayBlockSupplier = () -> (SoftenedClayBlock) ModBlocks.CLAY_LIGHT_BLUE;
    static Supplier<HardenedClayBlock> hardenedYellowClayBlockSupplier = () -> ModBlocks.HARDENED_CLAY_STAINED_YELLOW;
    static Supplier<SoftenedClayBlock> yellowClayBlockSupplier = () -> (SoftenedClayBlock) ModBlocks.CLAY_YELLOW;
    static Supplier<HardenedClayBlock> hardenedLimeClayBlockSupplier = () -> ModBlocks.HARDENED_CLAY_STAINED_LIME;
    static Supplier<SoftenedClayBlock> limeClayBlockSupplier = () -> (SoftenedClayBlock) ModBlocks.CLAY_LIME;
    static Supplier<HardenedClayBlock> hardenedPinkClayBlockSupplier = () -> ModBlocks.HARDENED_CLAY_STAINED_PINK;
    static Supplier<SoftenedClayBlock> pinkClayBlockSupplier = () -> (SoftenedClayBlock) ModBlocks.CLAY_PINK;
    static Supplier<HardenedClayBlock> hardenedGrayClayBlockSupplier = () -> ModBlocks.HARDENED_CLAY_STAINED_GRAY;
    static Supplier<SoftenedClayBlock> grayClayBlockSupplier = () -> (SoftenedClayBlock) ModBlocks.CLAY_GRAY;
    static Supplier<HardenedClayBlock> hardenedLightGrayClayBlockSupplier = () -> ModBlocks.HARDENED_CLAY_STAINED_LIGHT_GRAY;
    static Supplier<SoftenedClayBlock> lightGrayClayBlockSupplier = () -> (SoftenedClayBlock) ModBlocks.CLAY_LIGHT_GRAY;
    static Supplier<HardenedClayBlock> hardenedCyanClayBlockSupplier = () -> ModBlocks.HARDENED_CLAY_STAINED_CYAN;
    static Supplier<SoftenedClayBlock> cyanClayBlockSupplier = () -> (SoftenedClayBlock) ModBlocks.CLAY_CYAN;
    static Supplier<HardenedClayBlock> hardenedPurpleClayBlockSupplier = () -> ModBlocks.HARDENED_CLAY_STAINED_PURPLE;
    static Supplier<SoftenedClayBlock> purpleClayBlockSupplier = () -> (SoftenedClayBlock) ModBlocks.CLAY_PURPLE;
    static Supplier<HardenedClayBlock> hardenedBlueClayBlockSupplier = () -> ModBlocks.HARDENED_CLAY_STAINED_BLUE;
    static Supplier<SoftenedClayBlock> blueClayBlockSupplier = () -> (SoftenedClayBlock) ModBlocks.CLAY_BLUE;
    static Supplier<HardenedClayBlock> hardenedBrownClayBlockSupplier = () -> ModBlocks.HARDENED_CLAY_STAINED_BROWN;
    static Supplier<SoftenedClayBlock> brownClayBlockSupplier = () -> (SoftenedClayBlock) ModBlocks.CLAY_BROWN;
    static Supplier<HardenedClayBlock> hardenedGreenClayBlockSupplier = () -> ModBlocks.HARDENED_CLAY_STAINED_GREEN;
    static Supplier<SoftenedClayBlock> greenClayBlockSupplier = () -> (SoftenedClayBlock) ModBlocks.CLAY_GREEN;
    static Supplier<HardenedClayBlock> hardenedRedClayBlockSupplier = () -> ModBlocks.HARDENED_CLAY_STAINED_RED;
    static Supplier<SoftenedClayBlock> redClayBlockSupplier = () -> (SoftenedClayBlock) ModBlocks.CLAY_RED;
    static Supplier<HardenedClayBlock> hardenedBlackClayBlockSupplier = () -> ModBlocks.HARDENED_CLAY_STAINED_BLACK;
    static Supplier<SoftenedClayBlock> blackClayBlockSupplier = () -> (SoftenedClayBlock) ModBlocks.CLAY_BLACK;
    static Supplier<HardenedClayBlock> hardenedRedstoneInfusedClayBlockSupplier = () -> ModBlocks.HARDENED_CLAY_REDSTONE_INFUSED;
    static Supplier<SoftenedClayBlock> redstoneInfusedClayBlockSupplier = () -> (SoftenedClayBlock) ModBlocks.CLAY_REDSTONE_INFUSED;

    /*
        Hardened Clay Blocks
    */
    public static HardenedClayBlock HARDENED_CLAY = (HardenedClayBlock) registerBlock("hardened_clay",
            new HardenedClayBlock(mesaClayBlockSupplier, FabricBlockSettings.copyOf(Blocks.SANDSTONE).mapColor(MapColor.RAW_IRON_PINK).ticksRandomly()));
    public static HardenedClayBlock HARDENED_CLAY_STAINED_WHITE = (HardenedClayBlock) registerBlock("hardened_clay_stained_white",
            new HardenedClayBlock(whiteClayBlockSupplier, FabricBlockSettings.copyOf(Blocks.SANDSTONE).mapColor(MapColor.TERRACOTTA_WHITE).ticksRandomly()));
    public static final HardenedClayBlock HARDENED_CLAY_STAINED_ORANGE = (HardenedClayBlock) registerBlock("hardened_clay_stained_orange",
            new HardenedClayBlock(orangeClayBlockSupplier, FabricBlockSettings.copyOf(Blocks.SANDSTONE).mapColor(MapColor.TERRACOTTA_ORANGE).ticksRandomly()));
    public static final HardenedClayBlock HARDENED_CLAY_STAINED_MAGENTA = (HardenedClayBlock) registerBlock("hardened_clay_stained_magenta",
            new HardenedClayBlock(magentaClayBlockSupplier, FabricBlockSettings.copyOf(Blocks.SANDSTONE).mapColor(MapColor.TERRACOTTA_MAGENTA).ticksRandomly()));
    public static final HardenedClayBlock HARDENED_CLAY_STAINED_LIGHT_BLUE = (HardenedClayBlock) registerBlock("hardened_clay_stained_light_blue",
            new HardenedClayBlock(lightBlueClayBlockSupplier, FabricBlockSettings.copyOf(Blocks.SANDSTONE).mapColor(MapColor.TERRACOTTA_LIGHT_BLUE).ticksRandomly()));
    public static final HardenedClayBlock HARDENED_CLAY_STAINED_YELLOW = (HardenedClayBlock) registerBlock("hardened_clay_stained_yellow",
            new HardenedClayBlock(yellowClayBlockSupplier, FabricBlockSettings.copyOf(Blocks.SANDSTONE).mapColor(MapColor.TERRACOTTA_YELLOW).ticksRandomly()));
    public static final HardenedClayBlock HARDENED_CLAY_STAINED_LIME = (HardenedClayBlock) registerBlock("hardened_clay_stained_lime",
            new HardenedClayBlock(limeClayBlockSupplier, FabricBlockSettings.copyOf(Blocks.SANDSTONE).mapColor(MapColor.TERRACOTTA_LIME).ticksRandomly()));
    public static final HardenedClayBlock HARDENED_CLAY_STAINED_PINK = (HardenedClayBlock) registerBlock("hardened_clay_stained_pink",
            new HardenedClayBlock(pinkClayBlockSupplier, FabricBlockSettings.copyOf(Blocks.SANDSTONE).mapColor(MapColor.TERRACOTTA_PINK).ticksRandomly()));
    public static final HardenedClayBlock HARDENED_CLAY_STAINED_GRAY = (HardenedClayBlock) registerBlock("hardened_clay_stained_gray",
            new HardenedClayBlock(grayClayBlockSupplier, FabricBlockSettings.copyOf(Blocks.SANDSTONE).mapColor(MapColor.TERRACOTTA_GRAY).ticksRandomly()));
    public static final HardenedClayBlock HARDENED_CLAY_STAINED_LIGHT_GRAY = (HardenedClayBlock) registerBlock("hardened_clay_stained_light_gray",
            new HardenedClayBlock(lightGrayClayBlockSupplier, FabricBlockSettings.copyOf(Blocks.SANDSTONE).mapColor(MapColor.TERRACOTTA_LIGHT_GRAY).ticksRandomly()));
    public static final HardenedClayBlock HARDENED_CLAY_STAINED_CYAN = (HardenedClayBlock) registerBlock("hardened_clay_stained_cyan",
            new HardenedClayBlock(cyanClayBlockSupplier, FabricBlockSettings.copyOf(Blocks.SANDSTONE).mapColor(MapColor.TERRACOTTA_CYAN).ticksRandomly()));
    public static final HardenedClayBlock HARDENED_CLAY_STAINED_PURPLE = (HardenedClayBlock) registerBlock("hardened_clay_stained_purple",
            new HardenedClayBlock(purpleClayBlockSupplier, FabricBlockSettings.copyOf(Blocks.SANDSTONE).mapColor(MapColor.TERRACOTTA_PURPLE).ticksRandomly()));
    public static final HardenedClayBlock HARDENED_CLAY_STAINED_BLUE = (HardenedClayBlock) registerBlock("hardened_clay_stained_blue",
            new HardenedClayBlock(blueClayBlockSupplier, FabricBlockSettings.copyOf(Blocks.SANDSTONE).mapColor(MapColor.TERRACOTTA_BLUE).ticksRandomly()));
    public static final HardenedClayBlock HARDENED_CLAY_STAINED_BROWN = (HardenedClayBlock) registerBlock("hardened_clay_stained_brown",
            new HardenedClayBlock(brownClayBlockSupplier, FabricBlockSettings.copyOf(Blocks.SANDSTONE).mapColor(MapColor.TERRACOTTA_BROWN).ticksRandomly()));
    public static final HardenedClayBlock HARDENED_CLAY_STAINED_GREEN = (HardenedClayBlock) registerBlock("hardened_clay_stained_green",
            new HardenedClayBlock(greenClayBlockSupplier, FabricBlockSettings.copyOf(Blocks.SANDSTONE).mapColor(MapColor.TERRACOTTA_GREEN).ticksRandomly()));
    public static final HardenedClayBlock HARDENED_CLAY_STAINED_RED = (HardenedClayBlock) registerBlock("hardened_clay_stained_red",
            new HardenedClayBlock(redClayBlockSupplier, FabricBlockSettings.copyOf(Blocks.SANDSTONE).mapColor(MapColor.TERRACOTTA_RED).ticksRandomly()));
    public static final HardenedClayBlock HARDENED_CLAY_STAINED_BLACK = (HardenedClayBlock) registerBlock("hardened_clay_stained_black",
            new HardenedClayBlock(blackClayBlockSupplier, FabricBlockSettings.copyOf(Blocks.SANDSTONE).mapColor(MapColor.TERRACOTTA_BLACK).ticksRandomly()));
    public static final HardenedClayBlock HARDENED_CLAY_REDSTONE_INFUSED = (HardenedClayBlock) registerBlock("hardened_clay_redstone_infused",
            new HardenedClayBlock(redstoneInfusedClayBlockSupplier, FabricBlockSettings.copyOf(Blocks.SANDSTONE).mapColor(MapColor.RED).ticksRandomly()));

    /*
        Clay Blocks
     */
    public static final SoftenedClayBlock CLAY_MESA = (SoftenedClayBlock) registerBlock("clay_mesa",
            new SoftenedClayBlock(hardenedClayBlockSupplier, FabricBlockSettings.copyOf(Blocks.MUD).mapColor(MapColor.RAW_IRON_PINK).ticksRandomly()));
    public static final SoftenedClayBlock CLAY_WHITE = (SoftenedClayBlock) registerBlock("clay_white",
            new SoftenedClayBlock(hardenedWhiteClayBlockSupplier, FabricBlockSettings.copyOf(Blocks.MUD).mapColor(MapColor.TERRACOTTA_WHITE).ticksRandomly()));
    public static final SoftenedClayBlock CLAY_ORANGE = (SoftenedClayBlock) registerBlock("clay_orange",
            new SoftenedClayBlock(hardenedOrangeClayBlockSupplier, FabricBlockSettings.copyOf(Blocks.CLAY).mapColor(MapColor.TERRACOTTA_ORANGE).ticksRandomly()));
    public static final SoftenedClayBlock CLAY_MAGENTA = (SoftenedClayBlock) registerBlock("clay_magenta",
            new SoftenedClayBlock(hardenedMagentaClayBlockSupplier, FabricBlockSettings.copyOf(Blocks.CLAY).mapColor(MapColor.TERRACOTTA_MAGENTA).ticksRandomly()));
    public static final SoftenedClayBlock CLAY_LIGHT_BLUE = (SoftenedClayBlock) registerBlock("clay_light_blue",
            new SoftenedClayBlock(hardenedLightBlueClayBlockSupplier, FabricBlockSettings.copyOf(Blocks.CLAY).mapColor(MapColor.TERRACOTTA_LIGHT_BLUE).ticksRandomly()));
    public static final SoftenedClayBlock CLAY_YELLOW = (SoftenedClayBlock) registerBlock("clay_yellow",
            new SoftenedClayBlock(hardenedYellowClayBlockSupplier, FabricBlockSettings.copyOf(Blocks.CLAY).mapColor(MapColor.TERRACOTTA_YELLOW).ticksRandomly()));
    public static final SoftenedClayBlock CLAY_LIME = (SoftenedClayBlock) registerBlock("clay_lime",
            new SoftenedClayBlock(hardenedLimeClayBlockSupplier, FabricBlockSettings.copyOf(Blocks.CLAY).mapColor(MapColor.TERRACOTTA_LIME).ticksRandomly()));
    public static final SoftenedClayBlock CLAY_PINK = (SoftenedClayBlock) registerBlock("clay_pink",
            new SoftenedClayBlock(hardenedPinkClayBlockSupplier, FabricBlockSettings.copyOf(Blocks.CLAY).mapColor(MapColor.TERRACOTTA_PINK).ticksRandomly()));
    public static final SoftenedClayBlock CLAY_GRAY = (SoftenedClayBlock) registerBlock("clay_gray",
            new SoftenedClayBlock(hardenedGrayClayBlockSupplier, FabricBlockSettings.copyOf(Blocks.CLAY).mapColor(MapColor.TERRACOTTA_GRAY).ticksRandomly()));
    public static final SoftenedClayBlock CLAY_LIGHT_GRAY = (SoftenedClayBlock) registerBlock("clay_light_gray",
            new SoftenedClayBlock(hardenedLightGrayClayBlockSupplier, FabricBlockSettings.copyOf(Blocks.CLAY).mapColor(MapColor.TERRACOTTA_LIGHT_GRAY).ticksRandomly()));
    public static final SoftenedClayBlock CLAY_CYAN = (SoftenedClayBlock) registerBlock("clay_cyan",
            new SoftenedClayBlock(hardenedCyanClayBlockSupplier, FabricBlockSettings.copyOf(Blocks.CLAY).mapColor(MapColor.TERRACOTTA_CYAN).ticksRandomly()));
    public static final SoftenedClayBlock CLAY_PURPLE = (SoftenedClayBlock) registerBlock("clay_purple",
            new SoftenedClayBlock(hardenedPurpleClayBlockSupplier, FabricBlockSettings.copyOf(Blocks.CLAY).mapColor(MapColor.TERRACOTTA_PURPLE).ticksRandomly()));
    public static final SoftenedClayBlock CLAY_BLUE = (SoftenedClayBlock) registerBlock("clay_blue",
            new SoftenedClayBlock(hardenedBlueClayBlockSupplier, FabricBlockSettings.copyOf(Blocks.CLAY).mapColor(MapColor.TERRACOTTA_BLUE).ticksRandomly()));
    public static final SoftenedClayBlock CLAY_BROWN = (SoftenedClayBlock) registerBlock("clay_brown",
            new SoftenedClayBlock(hardenedBrownClayBlockSupplier, FabricBlockSettings.copyOf(Blocks.CLAY).mapColor(MapColor.TERRACOTTA_BROWN).ticksRandomly()));
    public static final SoftenedClayBlock CLAY_GREEN = (SoftenedClayBlock) registerBlock("clay_green",
            new SoftenedClayBlock(hardenedGreenClayBlockSupplier, FabricBlockSettings.copyOf(Blocks.CLAY).mapColor(MapColor.TERRACOTTA_GREEN).ticksRandomly()));
    public static final SoftenedClayBlock CLAY_RED = (SoftenedClayBlock) registerBlock("clay_red",
            new SoftenedClayBlock(hardenedRedClayBlockSupplier, FabricBlockSettings.copyOf(Blocks.CLAY).mapColor(MapColor.TERRACOTTA_RED).ticksRandomly()));
    public static final SoftenedClayBlock CLAY_BLACK = (SoftenedClayBlock) registerBlock("clay_black",
            new SoftenedClayBlock(hardenedBlackClayBlockSupplier, FabricBlockSettings.copyOf(Blocks.CLAY).mapColor(MapColor.TERRACOTTA_BLACK).ticksRandomly()));
    public static final SoftenedClayBlock CLAY_REDSTONE_INFUSED = (SoftenedClayBlock) registerBlock("clay_redstone_infused",
            new SoftenedClayBlock(hardenedRedstoneInfusedClayBlockSupplier, FabricBlockSettings.copyOf(Blocks.CLAY).mapColor(MapColor.RED).ticksRandomly()));

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
