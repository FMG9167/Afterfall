package io.github.FMG9167.afterfall.items;

import io.github.FMG9167.afterfall.Afterfall;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class AfterfallItems {
    public static Item register(Item item, String id) {
        return Registry.register(Registries.ITEM, new Identifier(Afterfall.MOD_ID, id), item);
    }

    public static void initialize() {
    }
}
