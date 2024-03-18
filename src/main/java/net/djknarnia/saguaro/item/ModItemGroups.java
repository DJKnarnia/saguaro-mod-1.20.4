package net.djknarnia.saguaro.item;

import net.djknarnia.saguaro.SaguaroMod;
import net.djknarnia.saguaro.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup RUBY_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(SaguaroMod.MOD_ID, "saguaro"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.saguaro"))
                    .icon(() -> new ItemStack(ModItems.SAGUARO_FRUIT)).entries((displayContext, entries) -> {
                        entries.add(ModItems.SAGUARO_FRUIT);
                        entries.add(ModBlocks.SAGUARO_STEM);
                        entries.add(ModBlocks.SAGUARO_WOOD);
                        entries.add(ModBlocks.STRIPPED_SAGUARO_STEM);
                        entries.add(ModBlocks.STRIPPED_SAGUARO_WOOD);
                    }).build());
    public static void registerItemGroups() {
        SaguaroMod.LOGGER.info("Registering Item Groups for " + SaguaroMod.MOD_ID);
    }
}
