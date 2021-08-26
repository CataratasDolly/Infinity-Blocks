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
import static net.infinityrooms.InfinityRooms.EndlessBlackDoor;

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

            if (lookingAt == EndlessWhite || lookingAt == EndlessOrange || lookingAt == EndlessMagenta || lookingAt == EndlessLightBlue ||
                    lookingAt == EndlessYellow || lookingAt == EndlessLime || lookingAt == EndlessPink || lookingAt == EndlessGray ||
                    lookingAt == EndlessLightGray || lookingAt == EndlessCyan || lookingAt == EndlessPurple || lookingAt == EndlessBlue ||
                    lookingAt == EndlessBrown || lookingAt == EndlessGreen || lookingAt == EndlessRed || lookingAt == EndlessBlack ||
                    lookingAt == EndlessWhiteDoor || lookingAt == EndlessOrangeDoor || lookingAt == EndlessMagentaDoor ||
                    lookingAt == EndlessLightBlueDoor || lookingAt == EndlessYellowDoor || lookingAt == EndlessLimeDoor ||
                    lookingAt == EndlessPinkDoor || lookingAt == EndlessGrayDoor || lookingAt == EndlessLightGrayDoor ||
                    lookingAt == EndlessCyanDoor || lookingAt == EndlessPurpleDoor || lookingAt == EndlessBlueDoor ||
                    lookingAt == EndlessBrownDoor || lookingAt == EndlessGreenDoor || lookingAt == EndlessRedDoor ||
                    lookingAt == EndlessBlackDoor) {
                cir.setReturnValue(false);
            }
        }
    }
}
