package net.goy288.mymod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class MyMod implements ModInitializer {
    // The block that will make up the majority of the console dimension.
    public static final Block GRID_BLOCK = 
        new Block(FabricBlockSettings.of(Material.METAL).build());
    @Override
    public void onInitialize() {
        // Register the new block as console:grid_block
        Registry.register(Registry.BLOCK, 
            new Identifier("my-mod", "grid_block"), GRID_BLOCK);
        // Make sure that the new block is registered as an item.
        Registry.register(Registry.ITEM, 
            new Identifier("my-mod", "grid_block"), 
            new BlockItem(GRID_BLOCK, new Item.Settings().group(ItemGroup.MISC)));
    }
}