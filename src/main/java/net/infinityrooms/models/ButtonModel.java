package net.infinityrooms.models;

import net.fabricmc.fabric.api.renderer.v1.Renderer;
import net.fabricmc.fabric.api.renderer.v1.RendererAccess;
import net.fabricmc.fabric.api.renderer.v1.material.RenderMaterial;
import net.fabricmc.fabric.api.renderer.v1.mesh.MeshBuilder;
import net.fabricmc.fabric.api.renderer.v1.mesh.MutableQuadView;
import net.fabricmc.fabric.api.renderer.v1.mesh.QuadEmitter;
import net.fabricmc.fabric.api.renderer.v1.render.RenderContext;
import net.minecraft.block.BlockState;
import net.minecraft.block.enums.WallMountLocation;
import net.minecraft.client.render.model.BakedModel;
import net.minecraft.client.render.model.ModelBakeSettings;
import net.minecraft.client.render.model.ModelLoader;
import net.minecraft.client.texture.Sprite;
import net.minecraft.client.util.SpriteIdentifier;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.BlockRenderView;

import java.util.Random;
import java.util.function.Function;
import java.util.function.Supplier;

import static net.infinityrooms.EndlessButton.*;

public class ButtonModel extends BlockModel {

    public ButtonModel(String color) {
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
            emitter.material(myMaterial);

            float var = 0.0f;
            if (blockState.get(POWERED)) {
                var = 0.0625f;
            }
            if ((blockState.get(FACE) == WallMountLocation.FLOOR) && (blockState.get(FACING) == Direction.NORTH || blockState.get(FACING) == Direction.SOUTH)) {
                if (direction == Direction.UP) {
                    emitter.square(direction, 0.3125f, 0.375f, 0.6875f, 0.625f, 0.875f + var);
                } else if (direction == Direction.NORTH || direction == Direction.SOUTH) {
                    emitter.square(direction, 0.3125f, 0.0f, 0.6875f, 0.125f - var, 0.375f);
                } else if (direction == Direction.WEST || direction == Direction.EAST) {
                    emitter.square(direction, 0.625f, 0.125f - var, 0.375f, 0.0f, 0.3125f);
                }
            } else if ((blockState.get(FACE) == WallMountLocation.FLOOR) && (blockState.get(FACING) == Direction.EAST || blockState.get(FACING) == Direction.WEST)) {
                if (direction == Direction.UP) {
                    emitter.square(direction, 0.375f, 0.3125f, 0.625f, 0.6875f, 0.875f + var);
                } else if (direction == Direction.NORTH || direction == Direction.SOUTH) {
                    emitter.square(direction, 0.625f, 0.125f - var, 0.375f, 0.0f, 0.3125f);
                } else if (direction == Direction.WEST || direction == Direction.EAST) {
                    emitter.square(direction, 0.3125f, 0.0f, 0.6875f, 0.125f - var, 0.375f);
                }
            } else if ((blockState.get(FACE) == WallMountLocation.WALL) && blockState.get(FACING) == Direction.NORTH) {
                if (direction == Direction.UP) {
                    emitter.square(direction, 0.3125f, 0.0f, 0.6875f, 0.125f - var, 0.375f);
                } else if (direction == Direction.DOWN) {
                    emitter.square(direction, 0.3125f, 0.875f + var, 0.6875f, 1.0f, 0.375f);
                } else if (direction == Direction.SOUTH) {
                    emitter.square(direction, 0.3125f, 0.625f, 0.6875f, 0.375f, 0.125f - var);
                } else if (direction == Direction.EAST) {
                    emitter.square(direction, 0.0f, 0.375f, 0.125f - var, 0.625f, 0.3125f);
                } else if (direction == Direction.WEST) {
                    emitter.square(direction, 0.875f + var, 0.375f, 1.0f, 0.625f, 0.3125f);
                }
            } else if ((blockState.get(FACE) == WallMountLocation.WALL) && blockState.get(FACING) == Direction.SOUTH) {
                if (direction == Direction.UP) {
                    emitter.square(direction, 0.3125f, 0.875f + var, 0.6875f, 1.0f, 0.375f);
                } else if (direction == Direction.DOWN) {
                    emitter.square(direction, 0.3125f, 0.0f, 0.6875f, 0.125f - var, 0.375f);
                } else if (direction == Direction.NORTH) {
                    emitter.square(direction, 0.3125f, 0.625f, 0.6875f, 0.375f, 0.125f - var);
                } else if (direction == Direction.EAST) {
                    emitter.square(direction, 0.875f + var, 0.375f, 1.0f, 0.625f, 0.3125f);
                } else if (direction == Direction.WEST) {
                    emitter.square(direction, 0.0f, 0.375f, 0.125f - var, 0.625f, 0.3125f);
                }
            } else if ((blockState.get(FACE) == WallMountLocation.WALL) && blockState.get(FACING) == Direction.EAST) {
                if (direction == Direction.UP || direction == Direction.DOWN) {
                    emitter.square(direction, 0.0f, 0.3125f, 0.125f - var, 0.6875f, 0.375f);
                } else if (direction == Direction.NORTH) {
                    emitter.square(direction, 0.875f + var, 0.375f, 1.0f, 0.625f, 0.3125f);
                } else if (direction == Direction.SOUTH) {
                    emitter.square(direction, 0.0f, 0.375f, 0.125f - var, 0.625f, 0.3125f);
                } else if (direction == Direction.EAST) {
                    emitter.square(direction, 0.3125f, 0.375f, 0.6875f, 0.625f, 0.875f + var);
                }
            } else if ((blockState.get(FACE) == WallMountLocation.WALL) && blockState.get(FACING) == Direction.WEST) {
                if (direction == Direction.UP || direction == Direction.DOWN) {
                    emitter.square(direction, 0.875f + var, 0.3125f, 1.0f, 0.6875f, 0.375f);
                } else if (direction == Direction.SOUTH) {
                    emitter.square(direction, 0.875f + var, 0.375f, 1.0f, 0.625f, 0.3125f);
                } else if (direction == Direction.NORTH) {
                    emitter.square(direction, 0.0f, 0.375f, 0.125f - var, 0.625f, 0.3125f);
                } else if (direction == Direction.WEST) {
                    emitter.square(direction, 0.3125f, 0.375f, 0.6875f, 0.625f, 0.875f + var);
                }
            } else if ((blockState.get(FACE) == WallMountLocation.CEILING) && (blockState.get(FACING) == Direction.NORTH || blockState.get(FACING) == Direction.SOUTH)) {
                if (direction == Direction.DOWN) {
                    emitter.square(direction, 0.3125f, 0.375f, 0.6875f, 0.625f, 0.875f + var);
                } else if (direction == Direction.NORTH || direction == Direction.SOUTH) {
                    emitter.square(direction, 0.3125f, 0.875f + var, 0.6875f, 1.0f, 0.375f);
                } else if (direction == Direction.WEST || direction == Direction.EAST) {
                    emitter.square(direction, 0.625f, 1.0f, 0.375f, 0.875f + var, 0.3125f);
                }
            } else if ((blockState.get(FACE) == WallMountLocation.CEILING) && (blockState.get(FACING) == Direction.EAST || blockState.get(FACING) == Direction.WEST)) {
                if (direction == Direction.DOWN) {
                    emitter.square(direction, 0.375f, 0.3125f, 0.625f, 0.6875f, 0.875f + var);
                } else if (direction == Direction.NORTH || direction == Direction.SOUTH) {
                    emitter.square(direction, 0.625f, 1.0f, 0.375f, 0.875f + var, 0.3125f);
                } else if (direction == Direction.WEST || direction == Direction.EAST) {
                    emitter.square(direction, 0.3125f, 0.875f + var, 0.6875f, 1.0f, 0.375f);
                }
            }
            emitter.spriteBake(0, SPRITES[0], MutableQuadView.BAKE_LOCK_UV);
            emitter.spriteColor(0, -1, -1, -1, -1);
            emitter.emit();
        }
        mesh = builder.build();

        renderContext.meshConsumer().accept(mesh);
    }
}
