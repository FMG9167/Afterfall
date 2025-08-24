package io.github.FMG9167.afterfall.client.datagen;

import io.github.FMG9167.afterfall.blocks.AfterfallBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

public class AfterfallBlockLootTableProvider extends FabricBlockLootTableProvider {
    public AfterfallBlockLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(AfterfallBlocks.DEAD_LOG);
        addDrop(AfterfallBlocks.DEAD_WOOD);
        addDrop(AfterfallBlocks.STRIPPED_DEAD_LOG);
        addDrop(AfterfallBlocks.STRIPPED_DEAD_WOOD);

        addDrop(AfterfallBlocks.DEAD_PLANKS);
        addDrop(AfterfallBlocks.DEAD_SAPLING);
    }
}
