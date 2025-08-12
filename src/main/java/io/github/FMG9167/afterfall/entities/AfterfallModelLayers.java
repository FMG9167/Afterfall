package io.github.FMG9167.afterfall.entities;

import io.github.FMG9167.afterfall.Afterfall;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;

public class AfterfallModelLayers {
    public static final EntityModelLayer MUTANT =
            new EntityModelLayer(new Identifier(Afterfall.MOD_ID, "mutant"), "main");
    public static final EntityModelLayer ROGUE =
            new EntityModelLayer(new Identifier(Afterfall.MOD_ID, "rogue"), "main");
}
