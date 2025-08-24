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
        translationBuilder.add("itemgroup.afterfall.afterfall", "Afterfall");
        translationBuilder.add("block.afterfall.dead_log", "Dead Log");
        translationBuilder.add("block.afterfall.dead_wood", "Dead Wood");
        translationBuilder.add("block.afterfall.stripped_dead_log", "Stripped Dead Log");
        translationBuilder.add("block.afterfall.stripped_dead_wood", "Stripped Dead Wood");
        translationBuilder.add("block.afterfall.dead_planks", "Dead Planks");
        translationBuilder.add("block.afterfall.dead_sapling", "Dead Sapling");
    }
}
