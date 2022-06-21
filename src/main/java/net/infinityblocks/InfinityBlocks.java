package net.infinityblocks;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.infinityblocks.blocks.EndGateway.EndGatewayEntity;
import net.infinityblocks.blocks.EndGateway.EndGatewayBlock;
import net.infinityblocks.blocks.EndlessButton;
import net.infinityblocks.blocks.EndlessDoor;
import net.infinityblocks.blocks.EndlessPressurePlate;
import net.infinityblocks.blocks.EndlessTrapdoor;
import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class InfinityBlocks implements ModInitializer {

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
    public static final Block EndlessWhiteButton = buttonBlock();
    public static final Block EndlessOrangeButton = buttonBlock();
    public static final Block EndlessMagentaButton = buttonBlock();
    public static final Block EndlessLightBlueButton = buttonBlock();
    public static final Block EndlessYellowButton = buttonBlock();
    public static final Block EndlessLimeButton = buttonBlock();
    public static final Block EndlessPinkButton = buttonBlock();
    public static final Block EndlessGrayButton = buttonBlock();
    public static final Block EndlessLightGrayButton = buttonBlock();
    public static final Block EndlessCyanButton = buttonBlock();
    public static final Block EndlessPurpleButton = buttonBlock();
    public static final Block EndlessBlueButton = buttonBlock();
    public static final Block EndlessBrownButton = buttonBlock();
    public static final Block EndlessGreenButton = buttonBlock();
    public static final Block EndlessRedButton = buttonBlock();
    public static final Block EndlessBlackButton = buttonBlock();
    public static final Block EndlessWhitePressurePlate = pressurePlateBlock();
    public static final Block EndlessOrangePressurePlate = pressurePlateBlock();
    public static final Block EndlessMagentaPressurePlate = pressurePlateBlock();
    public static final Block EndlessLightBluePressurePlate = pressurePlateBlock();
    public static final Block EndlessYellowPressurePlate = pressurePlateBlock();
    public static final Block EndlessLimePressurePlate = pressurePlateBlock();
    public static final Block EndlessPinkPressurePlate = pressurePlateBlock();
    public static final Block EndlessGrayPressurePlate = pressurePlateBlock();
    public static final Block EndlessLightGrayPressurePlate = pressurePlateBlock();
    public static final Block EndlessCyanPressurePlate = pressurePlateBlock();
    public static final Block EndlessPurplePressurePlate = pressurePlateBlock();
    public static final Block EndlessBluePressurePlate = pressurePlateBlock();
    public static final Block EndlessBrownPressurePlate = pressurePlateBlock();
    public static final Block EndlessGreenPressurePlate = pressurePlateBlock();
    public static final Block EndlessRedPressurePlate = pressurePlateBlock();
    public static final Block EndlessBlackPressurePlate = pressurePlateBlock();
    public static final Block EngGatewayBlock = new EndGatewayBlock(FabricBlockSettings.of(Material.STONE).strength(1.5f, 6.0f).luminance(15).requiresTool());
    public static BlockEntityType<EndGatewayEntity> EndGatewayBlockEntity;

    public static final ItemGroup INFINITY_GROUP = FabricItemGroupBuilder.build(
            new Identifier("infinityblocks", "endlessblocks"),
            () -> new ItemStack(EndlessBlack));

    private static Block block() {
        return new Block(FabricBlockSettings.of(Material.STONE).strength(1.5f, 6.0f).luminance(15).requiresTool());
    }

    private static Block doorBlock() {
        return new EndlessDoor(FabricBlockSettings.of(Material.STONE).strength(1.5f, 6.0f).luminance(15));
    }

    private static Block trapdoorBlock() {
        return new EndlessTrapdoor(FabricBlockSettings.of(Material.STONE).strength(1.5f, 6.0f).luminance(15));
    }

    private static Block buttonBlock() {
        return new EndlessButton(FabricBlockSettings.of(Material.DECORATION).strength(0.5f).noCollision().luminance(15));
    }

    private static Block pressurePlateBlock() {
        return new EndlessPressurePlate(PressurePlateBlock.ActivationRule.MOBS, FabricBlockSettings.of(Material.STONE)
                .strength(0.5f).noCollision().luminance(15).requiresTool());
    }

    public void register(String id, Block block) {
        Registry.register(Registry.BLOCK, new Identifier("infinityblocks", "endless_" + id), block);
        Registry.register(Registry.ITEM, new Identifier("infinityblocks", "endless_" + id), new BlockItem(block, new FabricItemSettings().group(INFINITY_GROUP)));
    }

    @Override
    public void onInitialize() {
        EndGatewayBlockEntity = Registry.register(Registry.BLOCK_ENTITY_TYPE, "infinityblocks:void_block_entity", FabricBlockEntityTypeBuilder.create(EndGatewayEntity::new, EngGatewayBlock).build(null));

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
        register("end_gateway", EngGatewayBlock);
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
        register("white_button", EndlessWhiteButton);
        register("orange_button", EndlessOrangeButton);
        register("magenta_button", EndlessMagentaButton);
        register("light_blue_button", EndlessLightBlueButton);
        register("yellow_button", EndlessYellowButton);
        register("lime_button", EndlessLimeButton);
        register("pink_button", EndlessPinkButton);
        register("gray_button", EndlessGrayButton);
        register("light_gray_button", EndlessLightGrayButton);
        register("cyan_button", EndlessCyanButton);
        register("purple_button", EndlessPurpleButton);
        register("blue_button", EndlessBlueButton);
        register("brown_button", EndlessBrownButton);
        register("green_button", EndlessGreenButton);
        register("red_button", EndlessRedButton);
        register("black_button", EndlessBlackButton);
        register("white_pressure_plate", EndlessWhitePressurePlate);
        register("orange_pressure_plate", EndlessOrangePressurePlate);
        register("magenta_pressure_plate", EndlessMagentaPressurePlate);
        register("light_blue_pressure_plate", EndlessLightBluePressurePlate);
        register("yellow_pressure_plate", EndlessYellowPressurePlate);
        register("lime_pressure_plate", EndlessLimePressurePlate);
        register("pink_pressure_plate", EndlessPinkPressurePlate);
        register("gray_pressure_plate", EndlessGrayPressurePlate);
        register("light_gray_pressure_plate", EndlessLightGrayPressurePlate);
        register("cyan_pressure_plate", EndlessCyanPressurePlate);
        register("purple_pressure_plate", EndlessPurplePressurePlate);
        register("blue_pressure_plate", EndlessBluePressurePlate);
        register("brown_pressure_plate", EndlessBrownPressurePlate);
        register("green_pressure_plate", EndlessGreenPressurePlate);
        register("red_pressure_plate", EndlessRedPressurePlate);
        register("black_pressure_plate", EndlessBlackPressurePlate);
    }
}
