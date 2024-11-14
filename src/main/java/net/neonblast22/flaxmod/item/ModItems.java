package net.neonblast22.flaxmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.neonblast22.flaxmod.FlaxMod;

public class ModItems {
    public static final Item FLAX_BUNDLE = registerItem("flax_bundle", new Item(new FabricItemSettings()));
    public static final Item DRIED_FLAX_BUNDLE = registerItem("dried_flax_bundle", new Item(new FabricItemSettings()));

    private static Item registerItem(String name, Item item)
    {
        return Registry.register(Registries.ITEM, new Identifier(FlaxMod.MOD_ID, name), item);
    }

    public static void registerModItems()
    {
        FlaxMod.LOGGER.info("Registering Mod Items for " + FlaxMod.MOD_ID);
    }
}
