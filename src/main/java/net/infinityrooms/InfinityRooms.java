package net.infinityrooms;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tag.FabricItemTags;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class InfinityRooms implements ModInitializer {

    public static final Block EndlessWhite = block();
    public static final Block EndlessOrange = block();
    public static final Block EndlessMagenta = block();
    public static final Block EndlessLightBlue = block();
    public static final Block EndlessYellow = block();
    public static final Block EndlessLime = block();
    public static final Block EndlessPink = block();
    public static final Block EndlessGray = block();
    public static final Block EndlessLightGray = block();
    public static final Block EndlessCyan = block();
    public static final Block EndlessPurple = block();
    public static final Block EndlessBlue = block();
    public static final Block EndlessBrown = block();
    public static final Block EndlessGreen = block();
    public static final Block EndlessRed = block();
    public static final Block EndlessBlack = block();
    public static final Block EndlessWhiteDoor = doorBlock();
    public static final Block EndlessOrangeDoor = doorBlock();
    public static final Block EndlessMagentaDoor = doorBlock();
    public static final Block EndlessLightBlueDoor = doorBlock();
    public static final Block EndlessYellowDoor = doorBlock();
    public static final Block EndlessLimeDoor = doorBlock();
    public static final Block EndlessPinkDoor = doorBlock();
    public static final Block EndlessGrayDoor = doorBlock();
    public static final Block EndlessLightGrayDoor = doorBlock();
    public static final Block EndlessCyanDoor = doorBlock();
    public static final Block EndlessPurpleDoor = doorBlock();
    public static final Block EndlessBlueDoor = doorBlock();
    public static final Block EndlessBrownDoor = doorBlock();
    public static final Block EndlessGreenDoor = doorBlock();
    public static final Block EndlessRedDoor = doorBlock();
    public static final Block EndlessBlackDoor = doorBlock();
    public static final Block EndlessWhiteTrapdoor = trapdoorBlock();
    public static final Block EndlessOrangeTrapdoor = trapdoorBlock();
    public static final Block EndlessMagentaTrapdoor = trapdoorBlock();
    public static final Block EndlessLightBlueTrapdoor = trapdoorBlock();
    public static final Block EndlessYellowTrapdoor = trapdoorBlock();
    public static final Block EndlessLimeTrapdoor = trapdoorBlock();
    public static final Block EndlessPinkTrapdoor = trapdoorBlock();
    public static final Block EndlessGrayTrapdoor = trapdoorBlock();
    public static final Block EndlessLightGrayTrapdoor = trapdoorBlock();
    public static final Block EndlessCyanTrapdoor = trapdoorBlock();
    public static final Block EndlessPurpleTrapdoor = trapdoorBlock();
    public static final Block EndlessBlueTrapdoor = trapdoorBlock();
    public static final Block EndlessBrownTrapdoor = trapdoorBlock();
    public static final Block EndlessGreenTrapdoor = trapdoorBlock();
    public static final Block EndlessRedTrapdoor = trapdoorBlock();
    public static final Block EndlessBlackTrapdoor = trapdoorBlock();

    public static final ItemGroup INFINITY_GROUP = FabricItemGroupBuilder.build(
            new Identifier("infinityrooms", "endlessblocks"),
            () -> new ItemStack(EndlessBlack));

    private static Block block() {
        return new Block(FabricBlockSettings.of(Material.STONE).strength(1.5f, 6.0f).luminance(15).requiresTool().breakByTool(FabricItemTags.PICKAXES));
    }

    private static Block doorBlock() {
        return new EndlessDoor(FabricBlockSettings.of(Material.STONE).strength(1.5f, 6.0f).luminance(15).requiresTool());
    }

    private static Block trapdoorBlock() {
        return new EndlessTrapdoor(FabricBlockSettings.of(Material.STONE).strength(1.5f, 6.0f).luminance(15).requiresTool());
    }

    public void register(String id, Block block) {
        Registry.register(Registry.BLOCK, new Identifier("infinityrooms", "endless_" + id), block);
        Registry.register(Registry.ITEM, new Identifier("infinityrooms", "endless_" + id), new BlockItem(block, new FabricItemSettings().group(INFINITY_GROUP)));
    }

    @Override
    public void onInitialize() {
        register("white", EndlessWhite);
        register("orange", EndlessOrange);
        register("magenta", EndlessMagenta);
        register("light_blue", EndlessLightBlue);
        register("yellow", EndlessYellow);
        register("lime", EndlessLime);
        register("pink", EndlessPink);
        register("gray", EndlessGray);
        register("light_gray", EndlessLightGray);
        register("cyan", EndlessCyan);
        register("purple", EndlessPurple);
        register("blue", EndlessBlue);
        register("brown", EndlessBrown);
        register("green", EndlessGreen);
        register("red", EndlessRed);
        register("black", EndlessBlack);
        register("white_door", EndlessWhiteDoor);
        register("orange_door", EndlessOrangeDoor);
        register("magenta_door", EndlessMagentaDoor);
        register("light_blue_door", EndlessLightBlueDoor);
        register("yellow_door", EndlessYellowDoor);
        register("lime_door", EndlessLimeDoor);
        register("pink_door", EndlessPinkDoor);
        register("gray_door", EndlessGrayDoor);
        register("light_gray_door", EndlessLightGrayDoor);
        register("cyan_door", EndlessCyanDoor);
        register("purple_door", EndlessPurpleDoor);
        register("blue_door", EndlessBlueDoor);
        register("brown_door", EndlessBrownDoor);
        register("green_door", EndlessGreenDoor);
        register("red_door", EndlessRedDoor);
        register("black_door", EndlessBlackDoor);
        register("white_trapdoor", EndlessWhiteTrapdoor);
        register("orange_trapdoor", EndlessOrangeTrapdoor);
        register("magenta_trapdoor", EndlessMagentaTrapdoor);
        register("light_blue_trapdoor", EndlessLightBlueTrapdoor);
        register("yellow_trapdoor", EndlessYellowTrapdoor);
        register("lime_trapdoor", EndlessLimeTrapdoor);
        register("pink_trapdoor", EndlessPinkTrapdoor);
        register("gray_trapdoor", EndlessGrayTrapdoor);
        register("light_gray_trapdoor", EndlessLightGrayTrapdoor);
        register("cyan_trapdoor", EndlessCyanTrapdoor);
        register("purple_trapdoor", EndlessPurpleTrapdoor);
        register("blue_trapdoor", EndlessBlueTrapdoor);
        register("brown_trapdoor", EndlessBrownTrapdoor);
        register("green_trapdoor", EndlessGreenTrapdoor);
        register("red_trapdoor", EndlessRedTrapdoor);
        register("black_trapdoor", EndlessBlackTrapdoor);
    }
}
