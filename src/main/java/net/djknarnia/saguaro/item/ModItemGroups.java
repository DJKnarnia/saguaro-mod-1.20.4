package net.djknarnia.saguaro.item;

import net.djknarnia.saguaro.SaguaroMod;
import net.djknarnia.saguaro.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup SAGUARO_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(SaguaroMod.MOD_ID, "saguaro"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.saguaro"))
                    .icon(() -> new ItemStack(ModItems.SAGUARO_FRUIT)).entries((displayContext, entries) -> {
                        /*
                            Saguaro Blocks
                         */
                        entries.add(ModItems.SAGUARO_FRUIT);
                        entries.add(ModBlocks.SAGUARO_STEM);
                        entries.add(ModBlocks.SAGUARO_WOOD);
                        entries.add(ModBlocks.STRIPPED_SAGUARO_STEM);
                        entries.add(ModBlocks.STRIPPED_SAGUARO_WOOD);
                        /*
                            Hardened Clay Blocks
                         */
                        entries.add(ModBlocks.HARDENED_CLAY);
                        entries.add(ModBlocks.HARDENED_CLAY_STAINED_WHITE);
                        entries.add(ModBlocks.HARDENED_CLAY_STAINED_ORANGE);
                        entries.add(ModBlocks.HARDENED_CLAY_STAINED_MAGENTA);
                        entries.add(ModBlocks.HARDENED_CLAY_STAINED_LIGHT_BLUE);
                        entries.add(ModBlocks.HARDENED_CLAY_STAINED_YELLOW);
                        entries.add(ModBlocks.HARDENED_CLAY_STAINED_LIME);
                        entries.add(ModBlocks.HARDENED_CLAY_STAINED_PINK);
                        entries.add(ModBlocks.HARDENED_CLAY_STAINED_GRAY);
                        entries.add(ModBlocks.HARDENED_CLAY_STAINED_LIGHT_GRAY);
                        entries.add(ModBlocks.HARDENED_CLAY_STAINED_CYAN);
                        entries.add(ModBlocks.HARDENED_CLAY_STAINED_PURPLE);
                        entries.add(ModBlocks.HARDENED_CLAY_STAINED_BLUE);
                        entries.add(ModBlocks.HARDENED_CLAY_STAINED_BROWN);
                        entries.add(ModBlocks.HARDENED_CLAY_STAINED_GREEN);
                        entries.add(ModBlocks.HARDENED_CLAY_STAINED_RED);
                        entries.add(ModBlocks.HARDENED_CLAY_STAINED_BLACK);
                        entries.add(ModBlocks.HARDENED_CLAY_REDSTONE_INFUSED);
                        /*
                            Clay Blocks
                         */
                        entries.add(ModBlocks.CLAY_MESA);
                        entries.add(ModBlocks.CLAY_WHITE);
                        entries.add(ModBlocks.CLAY_ORANGE);
                        entries.add(ModBlocks.CLAY_MAGENTA);
                        entries.add(ModBlocks.CLAY_LIGHT_BLUE);
                        entries.add(ModBlocks.CLAY_YELLOW);
                        entries.add(ModBlocks.CLAY_LIME);
                        entries.add(ModBlocks.CLAY_PINK);
                        entries.add(ModBlocks.CLAY_GRAY);
                        entries.add(ModBlocks.CLAY_LIGHT_GRAY);
                        entries.add(ModBlocks.CLAY_CYAN);
                        entries.add(ModBlocks.CLAY_PURPLE);
                        entries.add(ModBlocks.CLAY_BLUE);
                        entries.add(ModBlocks.CLAY_BROWN);
                        entries.add(ModBlocks.CLAY_GREEN);
                        entries.add(ModBlocks.CLAY_RED);
                        entries.add(ModBlocks.CLAY_BLACK);
                        entries.add(ModBlocks.CLAY_REDSTONE_INFUSED);

                    }).build());
    public static void registerItemGroups() {
        SaguaroMod.LOGGER.info("Registering Item Groups for " + SaguaroMod.MOD_ID);
    }
}
