package io.github.FMG9167.afterfall.client;

import io.github.FMG9167.afterfall.entities.AfterfallEntities;
import io.github.FMG9167.afterfall.entities.AfterfallModelLayers;
import io.github.FMG9167.afterfall.entities.mutant.MutantModel;
import io.github.FMG9167.afterfall.entities.mutant.MutantRenderer;
import io.github.FMG9167.afterfall.entities.rogue.RogueModel;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.entity.ZombieEntityRenderer;

public class AfterfallClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {

        EntityRendererRegistry.register(AfterfallEntities.MUTANT, MutantRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(AfterfallModelLayers.MUTANT, MutantModel::getTexturedModelData);

        EntityRendererRegistry.register(AfterfallEntities.ROGUE, ZombieEntityRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(AfterfallModelLayers.ROGUE, RogueModel::getTexturedModelData);

    }
}
