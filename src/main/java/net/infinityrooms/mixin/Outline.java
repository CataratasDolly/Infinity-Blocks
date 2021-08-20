package net.infinityrooms.mixin;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.client.render.*;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArgs;
import org.spongepowered.asm.mixin.injection.invoke.arg.Args;

import java.util.OptionalDouble;

import static net.infinityrooms.InfinityRooms.*;

@Mixin(WorldRenderer.class)
public class Outline {

    private static final RenderLayer InvisibleLine = RenderLayer.of("lines", VertexFormats.POSITION_COLOR, 0, 0, RenderLayer.MultiPhaseParameters.builder().lineWidth(new RenderPhase.LineWidth(OptionalDouble.empty())).build(false));

    @Shadow
    @Final
    private BufferBuilderStorage bufferBuilders;

    @ModifyArgs(method = "drawBlockOutline", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/render/WorldRenderer;drawShapeOutline(Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumer;Lnet/minecraft/util/shape/VoxelShape;DDDFFFF)V"))
    public void drawBlockOutline(Args args, MatrixStack matrixStack, VertexConsumer vertexConsumer, Entity entity, double d, double e, double f, BlockPos blockPos, BlockState blockState) {
        Block lookingAt = blockState.getBlock();
        if (lookingAt == InfinityWhite || lookingAt == InfinityOrange || lookingAt == InfinityMagenta || lookingAt == InfinityLightBlue ||
            lookingAt == InfinityYellow || lookingAt == InfinityLime || lookingAt == InfinityPink || lookingAt == InfinityGray ||
            lookingAt == InfinityLightGray || lookingAt == InfinityCyan || lookingAt == InfinityPurple || lookingAt == InfinityBlue ||
            lookingAt == InfinityBrown || lookingAt == InfinityGreen || lookingAt == InfinityRed || lookingAt == InfinityBlack) {
            VertexConsumer buffer = bufferBuilders.getEntityVertexConsumers().getBuffer(InvisibleLine);
            args.set(1, buffer);
        }
    }
}
