package net.djknarnia.saguaro.item;

import net.djknarnia.saguaro.SaguaroMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item SAGUARO_FRUIT = registerItem("saguaro_fruit", new Item(new FabricItemSettings().food(ModFoodComponents.SAGUARO_FRUIT)));
    private static void addItemsToFoodItemGroup(FabricItemGroupEntries entries) {
        entries.add(SAGUARO_FRUIT);
    }
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(SaguaroMod.MOD_ID, name), item);
    }
    public static void registerModItems() {
        SaguaroMod.LOGGER.info("Registering Mod Items for " + SaguaroMod.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(ModItems::addItemsToFoodItemGroup);
    }

}
