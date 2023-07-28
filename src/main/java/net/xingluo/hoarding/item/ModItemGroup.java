package net.xingluo.hoarding.item;

import net.xingluo.hoarding.Hoarding;
import net.xingluo.hoarding.block.ModBlocks;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup HOARDING = FabricItemGroupBuilder
            .build(new Identifier(Hoarding.MOD_ID,"hoarding"),() -> new ItemStack(ModBlocks.ALLIUM_CRATE.asItem()));
}