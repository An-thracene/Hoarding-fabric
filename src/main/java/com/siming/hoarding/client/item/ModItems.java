package com.siming.hoarding.client.item;

import com.siming.hoarding.Hoarding;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item PUMPKIN_SLICE = registerItem("pumpkin_slice",
            new Item(new FabricItemSettings()
                    .food(new FoodComponent.Builder().hunger(1).saturationModifier(1.0f).build())
                    .group(ModItemGroup.HOARDING)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Hoarding.MOD_ID, name), item);
    }
    public static void registerModItems(){
        Hoarding.LOGGER.debug("Registering Mod Items for " + Hoarding.MOD_ID);
    }
}
