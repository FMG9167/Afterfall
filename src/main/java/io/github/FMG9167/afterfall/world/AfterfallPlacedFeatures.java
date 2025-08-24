package io.github.FMG9167.afterfall.world;

import io.github.FMG9167.afterfall.Afterfall;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.feature.VegetationPlacedFeatures;
import net.minecraft.world.gen.placementmodifier.PlacementModifier;

import java.util.List;

public class AfterfallPlacedFeatures {

    public static final RegistryKey<PlacedFeature> DEAD_PLACED_KEY = registerKey("dead_placed");

    public static void bootstrap(Registerable<PlacedFeature> featureRegistry) {
        var configuredFeatureRegistryEntryLookup = featureRegistry.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

        register(featureRegistry,
                DEAD_PLACED_KEY,
                configuredFeatureRegistryEntryLookup.getOrThrow(AfterfallConfiguredFeatures.DEAD_KEY),
                VegetationPlacedFeatures.treeModifiers(PlacedFeatures.createCountExtraModifier(0, 0.05f, 1))
        );
    }

    public static RegistryKey<PlacedFeature> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(Afterfall.MOD_ID, name));
    }

    private static void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key, RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }
}
