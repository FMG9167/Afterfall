package io.github.FMG9167.afterfall.client.datagen;

import io.github.FMG9167.afterfall.blocks.AfterfallBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class AfterfallBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public AfterfallBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.LOGS)
                .add(AfterfallBlocks.DEAD_LOG)
                .add(AfterfallBlocks.DEAD_WOOD)
                .add(AfterfallBlocks.STRIPPED_DEAD_LOG)
                .add(AfterfallBlocks.STRIPPED_DEAD_WOOD);

        getOrCreateTagBuilder(BlockTags.SAPLINGS)
                .add(AfterfallBlocks.DEAD_SAPLING);
    }
}
