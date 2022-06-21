package net.infinityblocks.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.model.ModelLoadingRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.BlockEntityRendererRegistry;
import net.infinityblocks.ModelProvider;
import net.infinityblocks.blocks.EndGateway.EndGatewayEntityRenderer;

import static net.infinityblocks.InfinityBlocks.EndGatewayBlockEntity;

@net.fabricmc.api.Environment(net.fabricmc.api.EnvType.CLIENT)
public class InfinityBlocksClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ModelLoadingRegistry.INSTANCE.registerResourceProvider(rm -> new ModelProvider());
        BlockEntityRendererRegistry.register(EndGatewayBlockEntity, EndGatewayEntityRenderer::new);
    }
}
