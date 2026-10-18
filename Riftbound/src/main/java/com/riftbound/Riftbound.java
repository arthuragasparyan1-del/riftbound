package com.riftbound;

import net.fabricmc.api.ModInitializer;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class Riftbound implements ModInitializer {
    public static final String MOD_ID = "riftbound";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public static final Block RIFTSTONE = Registry.register(
            BuiltInRegistries.BLOCK,
            Identifier.fromNamespaceAndPath(MOD_ID, "riftstone"),
            new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.AMETHYST_BLOCK))
    );

    public static final Item RIFTSTONE_ITEM = Registry.register(
            BuiltInRegistries.ITEM,
            Identifier.fromNamespaceAndPath(MOD_ID, "riftstone"),
            new BlockItem(RIFTSTONE, new Item.Properties())
    );

    public static final Item RIFT_CRYSTAL = Registry.register(
            BuiltInRegistries.ITEM,
            Identifier.fromNamespaceAndPath(MOD_ID, "rift_crystal"),
            new Item(new Item.Properties())
    );

    @Override
    public void onInitialize() {
        LOGGER.info("Riftbound is starting. The first materials have crossed the rift.");
    }
}
