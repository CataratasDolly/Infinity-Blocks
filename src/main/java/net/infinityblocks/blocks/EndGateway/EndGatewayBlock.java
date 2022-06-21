package net.infinityblocks.blocks.EndGateway;

import net.minecraft.block.Block;
import net.minecraft.block.BlockEntityProvider;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;

public class EndGatewayBlock extends Block implements BlockEntityProvider {

    public EndGatewayBlock(Settings settings) {
        super(settings);
    }

    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new EndGatewayEntity(pos, state);
    }
}
