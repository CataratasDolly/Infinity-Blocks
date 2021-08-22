package net.infinityrooms;

import net.fabricmc.fabric.api.client.model.ModelProviderContext;
import net.fabricmc.fabric.api.client.model.ModelResourceProvider;
import net.infinityrooms.models.*;
import net.minecraft.client.render.model.UnbakedModel;
import net.minecraft.util.Identifier;

public class ModelProvider implements ModelResourceProvider {
    public static final Identifier MODEL_WHITE = new Identifier("infinityrooms:block/infinity_white_model");
    public static final Identifier MODEL_ORANGE = new Identifier("infinityrooms:block/infinity_orange_model");
    public static final Identifier MODEL_MAGENTA = new Identifier("infinityrooms:block/infinity_magenta_model");
    public static final Identifier MODEL_LIGHT_BLUE = new Identifier("infinityrooms:block/infinity_light_blue_model");
    public static final Identifier MODEL_YELLOW = new Identifier("infinityrooms:block/infinity_yellow_model");
    public static final Identifier MODEL_LIME = new Identifier("infinityrooms:block/infinity_lime_model");
    public static final Identifier MODEL_PINK = new Identifier("infinityrooms:block/infinity_pink_model");
    public static final Identifier MODEL_GRAY = new Identifier("infinityrooms:block/infinity_gray_model");
    public static final Identifier MODEL_LIGHT_GRAY = new Identifier("infinityrooms:block/infinity_light_gray_model");
    public static final Identifier MODEL_CYAN = new Identifier("infinityrooms:block/infinity_cyan_model");
    public static final Identifier MODEL_PURPLE = new Identifier("infinityrooms:block/infinity_purple_model");
    public static final Identifier MODEL_BLUE = new Identifier("infinityrooms:block/infinity_blue_model");
    public static final Identifier MODEL_BROWN = new Identifier("infinityrooms:block/infinity_brown_model");
    public static final Identifier MODEL_GREEN = new Identifier("infinityrooms:block/infinity_green_model");
    public static final Identifier MODEL_RED = new Identifier("infinityrooms:block/infinity_red_model");
    public static final Identifier MODEL_BLACK = new Identifier("infinityrooms:block/infinity_black_model");

    @Override
    public UnbakedModel loadModelResource(Identifier identifier, ModelProviderContext modelProviderContext) {
        if(identifier.equals(MODEL_WHITE)) {
            return new WhiteModel();
        } else if (identifier.equals(MODEL_ORANGE)) {
            return new OrangeModel();
        } else if (identifier.equals(MODEL_MAGENTA)) {
            return new MagentaModel();
        } else if (identifier.equals(MODEL_LIGHT_BLUE)) {
            return new LightBlueModel();
        } else if (identifier.equals(MODEL_YELLOW)) {
            return new YellowModel();
        } else if (identifier.equals(MODEL_LIME)) {
            return new LimeModel();
        } else if (identifier.equals(MODEL_PINK)) {
            return new PinkModel();
        } else if (identifier.equals(MODEL_GRAY)) {
            return new GrayModel();
        } else if (identifier.equals(MODEL_LIGHT_GRAY)) {
            return new LightGrayModel();
        } else if (identifier.equals(MODEL_CYAN)) {
            return new CyanModel();
        } else if (identifier.equals(MODEL_PURPLE)) {
            return new PurpleModel();
        } else if (identifier.equals(MODEL_BLUE)) {
            return new BlueModel();
        } else if (identifier.equals(MODEL_BROWN)) {
            return new BrownModel();
        } else if (identifier.equals(MODEL_GREEN)) {
            return new GreenModel();
        } else if (identifier.equals(MODEL_RED)) {
            return new RedModel();
        } else {
            return null;
        }
    }
}
