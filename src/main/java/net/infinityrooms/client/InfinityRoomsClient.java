package net.infinityrooms.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.model.ModelLoadingRegistry;
import net.infinityrooms.ModelProvider;

@net.fabricmc.api.Environment(net.fabricmc.api.EnvType.CLIENT)
public class InfinityRoomsClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ModelLoadingRegistry.INSTANCE.registerResourceProvider(rm -> new ModelProvider());
    }
}
