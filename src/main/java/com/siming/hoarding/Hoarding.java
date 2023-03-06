package com.siming.hoarding;

import com.siming.hoarding.client.block.ModBlocks;
import com.siming.hoarding.client.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Hoarding implements ModInitializer {
    /**
     * Runs the mod initializer.
     */
    public static final String MOD_ID = "hoarding";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        ModItems.registerModItems();
        ModBlocks.registerModBlocks();
    }
}
