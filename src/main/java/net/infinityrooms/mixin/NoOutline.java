package net.infinityrooms.mixin;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.GameRenderer;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.BlockPos;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import static net.infinityrooms.InfinityRooms.*;

@Mixin(GameRenderer.class)
public class NoOutline {

    @Final
    @Shadow
    private MinecraftClient client;

    @Inject(method = "shouldRenderBlockOutline", at = @At(value = "HEAD", target = "Lnet/minecraft/client/render/GameRenderer;shouldRenderBlockOutline()Z"), cancellable = true)
    public void shouldRenderBlockOutline(CallbackInfoReturnable<Boolean> cir) {
        HitResult hitResult = this.client.crosshairTarget;
        if (hitResult != null && hitResult.getType() == HitResult.Type.BLOCK) {
            BlockPos blockPos = ((BlockHitResult) hitResult).getBlockPos();
            assert this.client.world != null;
            BlockState blockState = this.client.world.getBlockState(blockPos);
            Block lookingAt = blockState.getBlock();

            if (lookingAt == InfinityWhite || lookingAt == InfinityOrange || lookingAt == InfinityMagenta || lookingAt == InfinityLightBlue ||
                    lookingAt == InfinityYellow || lookingAt == InfinityLime || lookingAt == InfinityPink || lookingAt == InfinityGray ||
                    lookingAt == InfinityLightGray || lookingAt == InfinityCyan || lookingAt == InfinityPurple || lookingAt == InfinityBlue ||
                    lookingAt == InfinityBrown || lookingAt == InfinityGreen || lookingAt == InfinityRed || lookingAt == InfinityBlack) {
                cir.setReturnValue(false);
            }
        }
    }
}
