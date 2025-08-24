package io.github.FMG9167.afterfall.client;

import io.github.FMG9167.afterfall.client.datagen.*;
import io.github.FMG9167.afterfall.world.AfterfallConfiguredFeatures;
import io.github.FMG9167.afterfall.world.AfterfallPlacedFeatures;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.registry.RegistryBuilder;
import net.minecraft.registry.RegistryKeys;

public class AfterfallDataGenerator implements DataGeneratorEntrypoint {

    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
        pack.addProvider(AfterfallBlockLootTableProvider::new);
        pack.addProvider(AfterfallTranslationProvider::new);
        pack.addProvider(AfterfallModelProvider::new);
        pack.addProvider(AfterfallAdvancementProvider::new);
        pack.addProvider(AfterfallWorldGenerator::new);
    }

    @Override
    public void buildRegistry(RegistryBuilder registryBuilder) {
        registryBuilder.addRegistry(RegistryKeys.CONFIGURED_FEATURE, AfterfallConfiguredFeatures::bootstrap);
        registryBuilder.addRegistry(RegistryKeys.PLACED_FEATURE, AfterfallPlacedFeatures::bootstrap);
    }
}
