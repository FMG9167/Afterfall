package io.github.FMG9167.afterfall.client.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

public class AfterfallTranslationProvider extends FabricLanguageProvider {
    public AfterfallTranslationProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {
        translationBuilder.add("generator.afterfall.test_world", "Test World");
    }
}
