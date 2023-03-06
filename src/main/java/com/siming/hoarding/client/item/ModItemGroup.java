package com.siming.hoarding.client.item;

import com.siming.hoarding.Hoarding;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup HOARDING = FabricItemGroupBuilder
            .build(new Identifier(Hoarding.MOD_ID,"hoarding"),() -> new ItemStack(ModItems.PUMPKIN_SLICE));
}