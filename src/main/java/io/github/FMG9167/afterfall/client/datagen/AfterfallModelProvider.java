package io.github.FMG9167.afterfall.client.datagen;

import io.github.FMG9167.afterfall.blocks.AfterfallBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;

public class AfterfallModelProvider extends FabricModelProvider {
    public AfterfallModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerLog(AfterfallBlocks.DEAD_LOG).log(AfterfallBlocks.DEAD_LOG).wood(AfterfallBlocks.DEAD_WOOD);
        blockStateModelGenerator.registerLog(AfterfallBlocks.STRIPPED_DEAD_LOG).log(AfterfallBlocks.STRIPPED_DEAD_LOG).wood(AfterfallBlocks.STRIPPED_DEAD_WOOD);
        blockStateModelGenerator.registerSimpleCubeAll(AfterfallBlocks.DEAD_PLANKS);
        blockStateModelGenerator.registerTintableCross(AfterfallBlocks.DEAD_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
    }

    @Override
    public String getName() {
        return "Afterfall Model Provider";
    }
}
