package io.github.FMG9167.afterfall.world;

import io.github.FMG9167.afterfall.Afterfall;
import io.github.FMG9167.afterfall.blocks.AfterfallBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.ForkingTrunkPlacer;

public class AfterfallConfiguredFeatures {

    public static final RegistryKey<ConfiguredFeature<?, ?>> DEAD_KEY = registerKey("dead");


    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> featureRegistry) {
        register(featureRegistry, DEAD_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(AfterfallBlocks.DEAD_LOG),
                new ForkingTrunkPlacer(5,8,8),

                BlockStateProvider.of(Blocks.AIR),
                new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(1),2),

                new TwoLayersFeatureSize(1, 0, 2)).build());
    }


    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(Afterfall.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
