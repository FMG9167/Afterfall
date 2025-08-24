package io.github.FMG9167.afterfall.client.datagen;

import io.github.FMG9167.afterfall.blocks.AfterfallBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class AfterfallItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public AfterfallItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture, @Nullable BlockTagProvider blockTagProvider) {
        super(output, completableFuture, blockTagProvider);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(ItemTags.PLANKS)
                .add(AfterfallBlocks.DEAD_PLANKS.asItem());

        getOrCreateTagBuilder(ItemTags.LOGS)
                .add(AfterfallBlocks.DEAD_LOG.asItem())
                .add(AfterfallBlocks.DEAD_WOOD.asItem())
                .add(AfterfallBlocks.STRIPPED_DEAD_LOG.asItem())
                .add(AfterfallBlocks.STRIPPED_DEAD_WOOD.asItem());

        getOrCreateTagBuilder(ItemTags.SAPLINGS)
                .add(AfterfallBlocks.DEAD_SAPLING.asItem());
    }
}
