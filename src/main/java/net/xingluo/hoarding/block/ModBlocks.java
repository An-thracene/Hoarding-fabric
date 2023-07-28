package net.xingluo.hoarding.block;

import net.minecraft.registry.Registries;
import net.xingluo.hoarding.Hoarding;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.util.Identifier;
import net.minecraft.registry.Registry;

public class ModBlocks {

    public static final Block BAKED_POTATO_CRATE =registerBlock("baked_potato_crate",
            new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS)
                    .strength(2.0f,3.0f)));
    public static final Block CACTUS_BUNDLE =registerBlock("cactus_bundle",
            new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS)
                    .strength(2.0f,3.0f)));
    public static final Block GLISTERING_MELON =registerBlock("glistering_melon",
            new Block(FabricBlockSettings.copy(Blocks.MELON)
                    .strength(1.0f)));
    public static final Block ALLIUM_CRATE =registerBlock("allium_crate",
            new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS)
                    .strength(2.0f,3.0f)));
    public static final Block AZURE_BLUET_CRATE =registerBlock("azure_bluet_crate",
            new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS)
                    .strength(2.0f,3.0f)));
    public static final Block BLUE_ORCHID_CRATE =registerBlock("blue_orchid_crate",
            new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS)
                    .strength(2.0f,3.0f)));
    public static final Block CORNFLOWER_CRATE =registerBlock("cornflower_crate",
            new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS)
                    .strength(2.0f,3.0f)));
    public static final Block DANDELION_CRATE =registerBlock("dandelion_crate",
            new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS)
                    .strength(2.0f,3.0f)));
    public static final Block LILY_CRATE =registerBlock("lily_crate",
            new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS)
                    .strength(2.0f,3.0f)));
    public static final Block ORANGE_TULIP_CRATE =registerBlock("orange_tulip_crate",
            new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS)
                    .strength(2.0f,3.0f)));
    public static final Block OXEYE_DAISY_CRATE =registerBlock("oxeye_daisy_crate",
            new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS)
                    .strength(2.0f,3.0f)));
    public static final Block PINK_TULIP_CRATE =registerBlock("pink_tulip_crate",
            new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS)
                    .strength(2.0f,3.0f)));
    public static final Block POPPY_CRATE =registerBlock("poppy_crate",
            new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS)
                    .strength(2.0f,3.0f)));
    public static final Block RED_TULIP_CRATE =registerBlock("red_tulip_crate",
            new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS)
                    .strength(2.0f,3.0f)));
    public static final Block WHITE_TULIP_CRATE =registerBlock("white_tulip_crate",
            new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS)
                    .strength(2.0f,3.0f)));
    public static final Block WITHER_ROSE_CRATE =registerBlock("wither_rose_crate",
            new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS)
                    .strength(2.0f,3.0f)));
    public static final Block COTTON_BAG =registerBlock("cotton_bag",
            new Block(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block PINEAPPLE_CRATE =registerBlock("pineapple_crate",
            new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS)
                    .strength(2.0f,3.0f)));
    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(Hoarding.MOD_ID, name), block);
    }
    private static void registerBlockItem(String name, Block block){
        Registry.register(Registries.ITEM, new Identifier(Hoarding.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        Hoarding.LOGGER.debug("Registering Mod Blocks for " + Hoarding.MOD_ID);
    }
}
