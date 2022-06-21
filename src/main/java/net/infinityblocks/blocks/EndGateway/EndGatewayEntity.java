package net.infinityblocks.blocks.EndGateway;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;

import static net.infinityblocks.InfinityBlocks.EndGatewayBlockEntity;

public class EndGatewayEntity extends BlockEntity {

    public EndGatewayEntity(BlockPos pos, BlockState state) {
        super(EndGatewayBlockEntity, pos, state);
    }
}
