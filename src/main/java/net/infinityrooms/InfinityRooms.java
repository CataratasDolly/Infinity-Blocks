package net.infinityrooms;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class InfinityRooms implements ModInitializer {

    public static final Block InfinityWhite = block();
    public static final Block InfinityOrange = block();
    public static final Block InfinityMagenta = block();
    public static final Block InfinityLightBlue = block();
    public static final Block InfinityYellow = block();
    public static final Block InfinityLime = block();
    public static final Block InfinityPink = block();
    public static final Block InfinityGray = block();
    public static final Block InfinityLightGray = block();
    public static final Block InfinityCyan = block();
    public static final Block InfinityPurple = block();
    public static final Block InfinityBlue = block();
    public static final Block InfinityBrown = block();
    public static final Block InfinityGreen = block();
    public static final Block InfinityRed = block();
    public static final Block InfinityBlack = block();

    public static final ItemGroup INFINITY_GROUP = FabricItemGroupBuilder.build(
            new Identifier("infinityrooms", "infinityblocks"),
            () -> new ItemStack(InfinityBlack));

    private static Block block() {
        return new Block(FabricBlockSettings.of(Material.STONE).strength(1.5f, 6.0f).luminance(15).requiresTool());
    }

    public void register(String id, Block block) {
        Registry.register(Registry.BLOCK, new Identifier("infinityrooms", "infinity_" + id), block);
        Registry.register(Registry.ITEM, new Identifier("infinityrooms", "infinity_" + id), new BlockItem(block, new FabricItemSettings().group(INFINITY_GROUP)));
    }

    @Override
    public void onInitialize() {
        register("white", InfinityWhite);
        register("orange", InfinityOrange);
        register("magenta", InfinityMagenta);
        register("light_blue", InfinityLightBlue);
        register("yellow", InfinityYellow);
        register("lime", InfinityLime);
        register("pink", InfinityPink);
        register("gray", InfinityGray);
        register("light_gray", InfinityLightGray);
        register("cyan", InfinityCyan);
        register("purple", InfinityPurple);
        register("blue", InfinityBlue);
        register("brown", InfinityBrown);
        register("green", InfinityGreen);
        register("red", InfinityRed);
        register("black", InfinityBlack);
    }
}
