package io.github.FMG9167.afterfall;

import io.github.FMG9167.afterfall.entities.AfterfallEntities;
import io.github.FMG9167.afterfall.entities.mutant.MutantEntity;
import io.github.FMG9167.afterfall.entities.rogue.RogueEntity;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.WorldPreset;

public class Afterfall implements ModInitializer {
    public static final String MOD_ID = "afterfall";
    public static final RegistryKey<WorldPreset> TEST_PRESET = RegistryKey.of(
            RegistryKeys.WORLD_PRESET,
            Identifier.of(MOD_ID, "test_world")
    );

    @Override
    public void onInitialize() {
        FabricDefaultAttributeRegistry.register(AfterfallEntities.MUTANT, MutantEntity.createMutantAttributes());
        FabricDefaultAttributeRegistry.register(AfterfallEntities.ROGUE, RogueEntity.createRogueAttributes());
    }
}
