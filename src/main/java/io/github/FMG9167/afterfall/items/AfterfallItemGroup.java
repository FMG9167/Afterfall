package io.github.FMG9167.afterfall.items;

import io.github.FMG9167.afterfall.Afterfall;
import io.github.FMG9167.afterfall.blocks.AfterfallBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class AfterfallItemGroup {
    public static final ItemGroup AFTERFALL = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Afterfall.MOD_ID, "afterfall"),
            FabricItemGroup.builder().icon(() -> new ItemStack(Items.SAND))
                    .displayName(Text.translatable("itemgroup.afterfall.afterfall"))
                    .entries((displayContext, entries) -> {
                        entries.add(AfterfallBlocks.DEAD_SAPLING);
                        entries.add(AfterfallBlocks.DEAD_LOG);
                        entries.add(AfterfallBlocks.DEAD_WOOD);
                        entries.add(AfterfallBlocks.STRIPPED_DEAD_LOG);
                        entries.add(AfterfallBlocks.STRIPPED_DEAD_WOOD);
                        entries.add(AfterfallBlocks.DEAD_PLANKS);
                    }).build());

    public static void registerItemGroups() {
    }
}
