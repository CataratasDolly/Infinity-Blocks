package net.infinityrooms.models;

import net.fabricmc.fabric.api.renderer.v1.Renderer;
import net.fabricmc.fabric.api.renderer.v1.RendererAccess;
import net.fabricmc.fabric.api.renderer.v1.material.RenderMaterial;
import net.fabricmc.fabric.api.renderer.v1.mesh.MeshBuilder;
import net.fabricmc.fabric.api.renderer.v1.mesh.MutableQuadView;
import net.fabricmc.fabric.api.renderer.v1.mesh.QuadEmitter;
import net.fabricmc.fabric.api.renderer.v1.render.RenderContext;
import net.minecraft.block.BlockState;
import net.minecraft.block.enums.DoorHinge;
import net.minecraft.client.render.model.BakedModel;
import net.minecraft.client.render.model.ModelBakeSettings;
import net.minecraft.client.render.model.ModelLoader;
import net.minecraft.client.texture.Sprite;
import net.minecraft.client.util.SpriteIdentifier;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.BlockRenderView;

import java.util.*;
import java.util.function.Function;
import java.util.function.Supplier;

import static net.minecraft.block.DoorBlock.*;

public class DoorModel extends BlockModel {

    public DoorModel(String color) {
        super(color);
    }

    @Override
    public BakedModel bake(ModelLoader loader, Function<SpriteIdentifier, Sprite> textureGetter, ModelBakeSettings rotationContainer, Identifier modelId) {
        SPRITES[0] = textureGetter.apply(SPRITE_IDS[0]);
        return this;
    }

    @Override
    public void emitBlockQuads(BlockRenderView blockRenderView, BlockState blockState, BlockPos blockPos, Supplier<Random> supplier, RenderContext renderContext) {
        Renderer renderer = RendererAccess.INSTANCE.getRenderer();

        assert renderer != null;
        MeshBuilder builder = renderer.meshBuilder();
        RenderMaterial myMaterial = renderer.materialFinder().disableDiffuse(0, true).find();
        QuadEmitter emitter = renderContext.getEmitter();

        for(Direction direction : Direction.values()) {
            if (direction != Direction.DOWN) {
                emitter.material(myMaterial);
                if ((blockState.get(FACING) == Direction.NORTH && blockState.get(OPEN) &&
                        blockState.get(HINGE) == DoorHinge.LEFT) || (blockState.get(FACING) == Direction.SOUTH && blockState.get(OPEN) &&
                        blockState.get(HINGE) == DoorHinge.RIGHT) || (blockState.get(FACING) == Direction.EAST && !blockState.get(OPEN))) {
                    if (direction == Direction.UP) {
                        emitter.square(direction, 0.1825f, 1.0f, 0.0f, 0.0f, 0.0f);
                    } else if (direction == Direction.NORTH) {
                        emitter.square(direction, 0.8175f, 0.0f, 1.0f, 1.0f, 0.0f);
                    } else if (direction == Direction.SOUTH) {
                        emitter.square(direction, 0.0f, 0.0f, 0.1825f, 1.0f, 0.0f);
                    } else if (direction == Direction.WEST) {
                        emitter.square(direction, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f);
                    } else if (direction == Direction.EAST) {
                        emitter.square(direction, 0.0f, 0.0f, 1.0f, 1.0f, 0.8175f);
                    }
                } else if ((blockState.get(FACING) == Direction.EAST && blockState.get(OPEN) &&
                        blockState.get(HINGE) == DoorHinge.LEFT) || (blockState.get(FACING) == Direction.WEST && blockState.get(OPEN) &&
                        blockState.get(HINGE) == DoorHinge.RIGHT) || (blockState.get(FACING) == Direction.SOUTH && !blockState.get(OPEN))) {
                    if (direction == Direction.UP) {
                        emitter.square(direction, 0.0f, 0.8125f, 1.0f, 1.0f, 0.0f);
                    } else if (direction == Direction.NORTH) {
                        emitter.square(direction, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f);
                    } else if (direction == Direction.SOUTH) {
                        emitter.square(direction, 0.0f, 0.0f, 1.0f, 1.0f, 0.8175f);
                    } else if (direction == Direction.WEST) {
                        emitter.square(direction, 0.0f, 0.0f, 0.1825f, 1.0f, 0.0f);
                    } else if (direction == Direction.EAST) {
                        emitter.square(direction, 0.8125f, 0.0f, 1.0f, 1.0f, 0.0f);
                    }
                } else if ((blockState.get(FACING) == Direction.WEST && blockState.get(OPEN) &&
                        blockState.get(HINGE) == DoorHinge.LEFT) || (blockState.get(FACING) == Direction.EAST && blockState.get(OPEN) &&
                        blockState.get(HINGE) == DoorHinge.RIGHT) || (blockState.get(FACING) == Direction.NORTH && !blockState.get(OPEN))) {
                    if (direction == Direction.UP) {
                        emitter.square(direction, 1.0f, 0.1825f, 0.0f, 0.0f, 0.0f);
                    } else if (direction == Direction.NORTH) {
                        emitter.square(direction, 0.0f, 0.0f, 1.0f, 1.0f, 0.8175f);
                    } else if (direction == Direction.SOUTH) {
                        emitter.square(direction, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f);
                    } else if (direction == Direction.WEST) {
                        emitter.square(direction, 0.8125f, 0.0f, 1.0f, 1.0f, 0.0f);
                    } else if (direction == Direction.EAST) {
                        emitter.square(direction, 0.0f, 0.0f, 0.1825f, 1.0f, 0.0f);
                    }
                } else if ((blockState.get(FACING) == Direction.SOUTH && blockState.get(OPEN) &&
                        blockState.get(HINGE) == DoorHinge.LEFT) || (blockState.get(FACING) == Direction.NORTH && blockState.get(OPEN) &&
                        blockState.get(HINGE) == DoorHinge.RIGHT) || (blockState.get(FACING) == Direction.WEST && !blockState.get(OPEN))) {
                    if (direction == Direction.UP) {
                        emitter.square(direction, 1.0f, 1.0f, 0.8175f, 0.0f, 0.0f);
                    } else if (direction == Direction.NORTH) {
                        emitter.square(direction, 0.0f, 0.0f, 0.1825f, 1.0f, 0.0f);
                    } else if (direction == Direction.SOUTH) {
                        emitter.square(direction, 0.8175f, 0.0f, 1.0f, 1.0f, 0.0f);
                    } else if (direction == Direction.WEST) {
                        emitter.square(direction, 0.0f, 0.0f, 1.0f, 1.0f, 0.8175f);
                    } else if (direction == Direction.EAST) {
                        emitter.square(direction, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f);
                    }
                }
                emitter.spriteBake(0, SPRITES[0], MutableQuadView.BAKE_LOCK_UV);
                emitter.spriteColor(0, -1, -1, -1, -1);
                emitter.emit();
            }
        }
        mesh = builder.build();

        renderContext.meshConsumer().accept(mesh);
    }
}