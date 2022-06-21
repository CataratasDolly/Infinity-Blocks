package net.infinityblocks.mixin;

import net.minecraft.block.Block;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.GameRenderer;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.HitResult;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import static net.infinityblocks.InfinityBlocks.*;

@Mixin(GameRenderer.class)
public class NoOutline {

    @Final
    @Shadow
    private MinecraftClient client;

    @Inject(method = "shouldRenderBlockOutline", at = @At(value = "HEAD", target = "Lnet/minecraft/client/render/GameRenderer;shouldRenderBlockOutline()Z"), cancellable = true)
    public void shouldRenderBlockOutline(CallbackInfoReturnable<Boolean> cir) {
        HitResult hitResult = this.client.crosshairTarget;
        if (hitResult != null && hitResult.getType() == HitResult.Type.BLOCK) {
            assert this.client.world != null;
            Block see = this.client.world.getBlockState(((BlockHitResult) hitResult).getBlockPos()).getBlock();

            if (see == EndlessWhite || see == EndlessOrange || see == EndlessMagenta || see == EndlessLightBlue ||
                    see == EndlessYellow || see == EndlessLime || see == EndlessPink || see == EndlessGray ||
                    see == EndlessLightGray || see == EndlessCyan || see == EndlessPurple || see == EndlessBlue ||
                    see == EndlessBrown || see == EndlessGreen || see == EndlessRed || see == EndlessBlack ||
                    see == EndlessWhiteDoor || see == EndlessOrangeDoor || see == EndlessMagentaDoor ||
                    see == EndlessLightBlueDoor || see == EndlessYellowDoor || see == EndlessLimeDoor ||
                    see == EndlessPinkDoor || see == EndlessGrayDoor || see == EndlessLightGrayDoor ||
                    see == EndlessCyanDoor || see == EndlessPurpleDoor || see == EndlessBlueDoor ||
                    see == EndlessBrownDoor || see == EndlessGreenDoor || see == EndlessRedDoor ||
                    see == EndlessBlackDoor || see == EndlessWhiteTrapdoor || see == EndlessOrangeTrapdoor ||
                    see == EndlessMagentaTrapdoor || see == EndlessLightBlueTrapdoor || see == EndlessYellowTrapdoor ||
                    see == EndlessLimeTrapdoor || see == EndlessPinkTrapdoor || see == EndlessGrayTrapdoor ||
                    see == EndlessLightGrayTrapdoor || see == EndlessCyanTrapdoor || see == EndlessPurpleTrapdoor ||
                    see == EndlessBlueTrapdoor || see == EndlessBrownTrapdoor || see == EndlessGreenTrapdoor ||
                    see == EndlessRedTrapdoor || see == EndlessBlackTrapdoor || see == EndlessWhiteButton ||
                    see == EndlessOrangeButton || see == EndlessMagentaButton || see == EndlessLightBlueButton ||
                    see == EndlessYellowButton || see == EndlessLimeButton || see == EndlessPinkButton ||
                    see == EndlessBlueButton || see == EndlessBrownButton || see == EndlessGreenButton ||
                    see == EndlessRedButton || see == EndlessBlackButton || see == EndlessGrayButton ||
                    see == EndlessLightGrayButton || see == EndlessCyanButton || see == EndlessPurpleButton ||
                    see == EndlessWhitePressurePlate || see == EndlessOrangePressurePlate || see == EndlessMagentaPressurePlate ||
                    see == EndlessLightBluePressurePlate || see == EndlessLimePressurePlate || see == EndlessPinkPressurePlate ||
                    see == EndlessRedPressurePlate || see == EndlessGreenPressurePlate || see == EndlessLightGrayPressurePlate ||
                    see == EndlessGrayPressurePlate || see == EndlessCyanPressurePlate || see == EndlessPurplePressurePlate ||
                    see == EndlessBluePressurePlate || see == EndlessYellowPressurePlate || see == EndlessBrownPressurePlate ||
                    see == EndlessBlackPressurePlate || see == EngGatewayBlock) {
                cir.setReturnValue(false);
            }
        }
    }
}
