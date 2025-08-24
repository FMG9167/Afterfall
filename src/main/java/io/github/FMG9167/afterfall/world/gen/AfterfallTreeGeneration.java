package io.github.FMG9167.afterfall.world.gen;

import io.github.FMG9167.afterfall.world.AfterfallPlacedFeatures;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.gen.GenerationStep;

public class AfterfallTreeGeneration {
    public static void generateTrees() {
        BiomeModifications.addFeature(BiomeSelectors.all(), GenerationStep.Feature.VEGETAL_DECORATION, AfterfallPlacedFeatures.DEAD_PLACED_KEY);
    }
}
