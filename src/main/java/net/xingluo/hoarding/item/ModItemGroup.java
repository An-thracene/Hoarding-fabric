package net.xingluo.hoarding.item;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.xingluo.hoarding.Hoarding;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.xingluo.hoarding.block.ModBlocks;

public class ModItemGroup {
    public static final ItemGroup HOARDING = Registry.register(Registries.ITEM_GROUP,
        new Identifier(Hoarding.MOD_ID, "hoarding"),
        FabricItemGroup.builder().displayName(Text.translatable("itemGroup.hoarding.hoarding"))
                .icon(() -> new ItemStack(ModBlocks.ALLIUM_CRATE.asItem())).entries((displayContext, entries) -> {
                    entries.add(ModItems.PUMPKIN_SLICE);
                    entries.add(ModBlocks.CACTUS_BUNDLE);
                    entries.add(ModBlocks.GLISTERING_MELON);
                    entries.add(ModBlocks.BAKED_POTATO_CRATE);
                    entries.add(ModBlocks.ALLIUM_CRATE);
                    entries.add(ModBlocks.AZURE_BLUET_CRATE);
                    entries.add(ModBlocks.BLUE_ORCHID_CRATE);
                    entries.add(ModBlocks.CORNFLOWER_CRATE);
                    entries.add(ModBlocks.DANDELION_CRATE);
                    entries.add(ModBlocks.LILY_CRATE);
                    entries.add(ModBlocks.ORANGE_TULIP_CRATE);
                    entries.add(ModBlocks.OXEYE_DAISY_CRATE);
                    entries.add(ModBlocks.PINK_TULIP_CRATE);
                    entries.add(ModBlocks.POPPY_CRATE);
                    entries.add(ModBlocks.RED_TULIP_CRATE);
                    entries.add(ModBlocks.WHITE_TULIP_CRATE);
                    entries.add(ModBlocks.WITHER_ROSE_CRATE);
                    entries.add(ModBlocks.PINEAPPLE_CRATE);
                    entries.add(ModBlocks.COTTON_BAG);
                }).build());

    public static void registerModItemGroup(){
    }
}
