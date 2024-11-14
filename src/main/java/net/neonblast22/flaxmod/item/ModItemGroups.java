package net.neonblast22.flaxmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.neonblast22.flaxmod.FlaxMod;
import net.neonblast22.flaxmod.block.ModBlocks;

public class ModItemGroups
{
    public static final ItemGroup FLAX_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(FlaxMod.MOD_ID, "flax"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.flax"))
                .icon(() -> new ItemStack(ModItems.FLAX_BUNDLE)).entries((displayContext, entries) -> {
                    entries.add(ModItems.FLAX_BUNDLE);
                    entries.add(ModItems.DRIED_FLAX_BUNDLE);

                        entries.add(ModBlocks.FLAX_BLOCK);
                        entries.add(ModBlocks.DRIED_FLAX_BLOCK);
                }).build());

    public static void registerItemGroups()
    {
        FlaxMod.LOGGER.info("Registering Item Groups for " + FlaxMod.MOD_ID);
    }
}
