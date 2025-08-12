package io.github.FMG9167.afterfall.client;

import io.github.FMG9167.afterfall.client.datagen.AfterfallAdvancementProvider;
import io.github.FMG9167.afterfall.client.datagen.AfterfallBlockLootTableProvider;
import io.github.FMG9167.afterfall.client.datagen.AfterfallModelProvider;
import io.github.FMG9167.afterfall.client.datagen.AfterfallTranslationProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class AfterfallDataGenerator implements DataGeneratorEntrypoint {

    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
        pack.addProvider(AfterfallBlockLootTableProvider::new);
        pack.addProvider(AfterfallTranslationProvider::new);
        pack.addProvider(AfterfallModelProvider::new);
        pack.addProvider(AfterfallAdvancementProvider::new);
    }
}
