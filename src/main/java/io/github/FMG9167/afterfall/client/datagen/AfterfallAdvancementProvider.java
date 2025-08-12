package io.github.FMG9167.afterfall.client.datagen;

import io.github.FMG9167.afterfall.Afterfall;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricAdvancementProvider;
import net.minecraft.advancement.Advancement;
import net.minecraft.advancement.AdvancementFrame;
import net.minecraft.advancement.criterion.TickCriterion;
import net.minecraft.item.Items;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import java.util.function.Consumer;

public class AfterfallAdvancementProvider extends FabricAdvancementProvider {
    public AfterfallAdvancementProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateAdvancement(Consumer<Advancement> consumer) {
        Advancement.Builder enteringTheApocalypse = Advancement.Builder.create()
                .display(
                        Items.SAND,
                        Text.literal("Welcome to the Apocalypse!"),
                        Text.literal("Survive this desolate world"),
                        Identifier.of("minecraft","textures/gui/advancements/backgrounds/adventure.png"),
                        AdvancementFrame.GOAL,
                        true,
                        true,
                        true
                )
                .criterion("started", TickCriterion.Conditions.createTick())
                .build(consumer, Afterfall.MOD_ID + ":afterfall").createTask();
    }
}
