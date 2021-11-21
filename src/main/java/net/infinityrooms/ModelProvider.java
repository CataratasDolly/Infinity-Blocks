package net.infinityrooms;

import net.fabricmc.fabric.api.client.model.ModelProviderContext;
import net.fabricmc.fabric.api.client.model.ModelResourceProvider;
import net.infinityrooms.models.*;
import net.minecraft.client.render.model.UnbakedModel;
import net.minecraft.util.Identifier;

import java.util.ArrayList;

public class ModelProvider implements ModelResourceProvider {
    public ArrayList<String> colors = new ArrayList<>();

    @Override
    public UnbakedModel loadModelResource(Identifier identifier, ModelProviderContext modelProviderContext) {
        colors.add("white"); colors.add("orange"); colors.add("magenta"); colors.add("light_blue");
        colors.add("yellow"); colors.add("lime"); colors.add("pink"); colors.add("gray");
        colors.add("light_gray"); colors.add("cyan"); colors.add("purple"); colors.add("blue");
        colors.add("brown"); colors.add("green"); colors.add("red"); colors.add("black");

        for (int i = 0; i < 15; i++) {
            if (identifier.equals(new Identifier("infinityrooms:block/endless_" + colors.get(i) + "_model")) ||
            identifier.equals(new Identifier("infinityrooms:item/endless_" + colors.get(i)))) {
                return new BlockModel(colors.get(i));
            } else if (identifier.equals(new Identifier("infinityrooms:block/endless_" + colors.get(i) + "_door_model"))) {
                return new DoorModel(colors.get(i));
            } else if (identifier.equals(new Identifier("infinityrooms:block/endless_" + colors.get(i) + "_trapdoor_model"))) {
                return new TrapdoorModel(colors.get(i));
            } else if (identifier.equals(new Identifier("infinityrooms:block/endless_" + colors.get(i) + "_button_model"))) {
                return new ButtonModel(colors.get(i));
            } else if (identifier.equals(new Identifier("infinityrooms:block/endless_" + colors.get(i) + "_pressure_plate_model"))) {
                return new PressurePlateModel(colors.get(i));
            }
        }
        return null;
    }
}
