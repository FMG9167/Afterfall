package io.github.FMG9167.afterfall;

import io.github.FMG9167.afterfall.blocks.AfterfallBlocks;
import io.github.FMG9167.afterfall.entities.AfterfallEntities;
import io.github.FMG9167.afterfall.entities.mutant.MutantEntity;
import io.github.FMG9167.afterfall.entities.rogue.RogueEntity;
import io.github.FMG9167.afterfall.items.AfterfallItemGroup;
import io.github.FMG9167.afterfall.items.AfterfallItems;
import io.github.FMG9167.afterfall.world.gen.AfterfallWorldGeneration;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
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
        AfterfallItems.initialize();
        AfterfallBlocks.registerModBlocks();
        AfterfallItemGroup.registerItemGroups();
        AfterfallWorldGeneration.generateAfterfallWorldGen();

        StrippableBlockRegistry.register(AfterfallBlocks.DEAD_LOG, AfterfallBlocks.STRIPPED_DEAD_LOG);
        StrippableBlockRegistry.register(AfterfallBlocks.DEAD_WOOD, AfterfallBlocks.STRIPPED_DEAD_WOOD);
    }
}
