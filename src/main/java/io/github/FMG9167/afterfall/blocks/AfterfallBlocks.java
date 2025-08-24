package io.github.FMG9167.afterfall.blocks;

import io.github.FMG9167.afterfall.Afterfall;
import io.github.FMG9167.afterfall.world.tree.DeadSaplingGenerator;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class AfterfallBlocks {

    private static Block registerBlock(String name, Block block) {
        Registry.register(Registries.ITEM, new Identifier(Afterfall.MOD_ID, name), new BlockItem(block, new FabricItemSettings()));
        return Registry.register(Registries.BLOCK, new Identifier(Afterfall.MOD_ID, name), block);
    }

    public static final Block DEAD_LOG = registerBlock("dead_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG).strength(3f)));
    public static final Block DEAD_WOOD = registerBlock("dead_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD).strength(3f)));
    public static final Block STRIPPED_DEAD_LOG = registerBlock("stripped_dead_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG).strength(3f)));
    public static final Block STRIPPED_DEAD_WOOD = registerBlock("stripped_dead_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD).strength(3f)));

    public static final Block DEAD_PLANKS = registerBlock("dead_planks",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).strength(3f)));
    public static final Block DEAD_SAPLING   = registerBlock("dead_sapling",
            new SaplingBlock(new DeadSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING).requires()));

    public static void registerModBlocks() {
    }
}
