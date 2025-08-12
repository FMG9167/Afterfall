package io.github.FMG9167.afterfall.entities;

import io.github.FMG9167.afterfall.Afterfall;
import io.github.FMG9167.afterfall.entities.mutant.MutantEntity;
import io.github.FMG9167.afterfall.entities.rogue.RogueEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class AfterfallEntities {
    public static final EntityType<MutantEntity> MUTANT = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(Afterfall.MOD_ID, "mutant"),
            FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, MutantEntity::new)
                    .dimensions(EntityDimensions.fixed(2f, 2f)).build());

    public static final EntityType<RogueEntity> ROGUE = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(Afterfall.MOD_ID, "rogue"),
            FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, RogueEntity::new)
                    .dimensions(EntityDimensions.fixed(2f, 2f)).build());
    public static void registerModEntities() {
    }
}
