package net.neonblast22.flaxmod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.neonblast22.flaxmod.FlaxMod;

public class ModBlocks
{
    public static final Block FLAX_BLOCK = registerBlock("flax_block",
            new Block(FabricBlockSettings.copyOf(Blocks.HAY_BLOCK)));
    public static final Block DRIED_FLAX_BLOCK = registerBlock("dried_flax_block",
            new Block(FabricBlockSettings.copyOf(Blocks.HAY_BLOCK)));

    private static Block registerBlock(String name, Block block)
    {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(FlaxMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block)
    {
        return Registry.register(Registries.ITEM, new Identifier(FlaxMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks()
    {
        FlaxMod.LOGGER.info("Registering Blocks for mod: " + FlaxMod.MOD_ID);

        FlammableBlockRegistry.getDefaultInstance().add(FLAX_BLOCK, 60, 20);
        FlammableBlockRegistry.getDefaultInstance().add(DRIED_FLAX_BLOCK, 100, 50);
    }
}
