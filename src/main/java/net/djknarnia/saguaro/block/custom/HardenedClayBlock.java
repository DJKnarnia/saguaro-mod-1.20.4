package net.djknarnia.saguaro.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.registry.tag.FluidTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3i;
import net.minecraft.world.BlockView;
import net.minecraft.world.WorldAccess;

public class HardenedClayBlock extends Block {
    private Block softenedState = Blocks.CLAY;

    public HardenedClayBlock(Block softened, Settings settings) {
        super(settings);
        this.softenedState = softened;
    }

    private static boolean shouldSoften(BlockView world, BlockPos pos, BlockState state) {
        return HardenedClayBlock.softensIn(state) || HardenedClayBlock.softensOnAnySide(world, pos);
    }

    private static boolean softensOnAnySide(BlockView world, BlockPos pos) {
        boolean bl = false;
        BlockPos.Mutable mutable = pos.mutableCopy();
        for (Direction direction : Direction.values()) {
            BlockState blockState = world.getBlockState(mutable);
            if (direction == Direction.DOWN && !HardenedClayBlock.softensIn(blockState)) continue;
            mutable.set((Vec3i)pos, direction);
            blockState = world.getBlockState(mutable);
            if (!HardenedClayBlock.softensIn(blockState) || blockState.isSideSolidFullSquare(world, pos, direction.getOpposite())) continue;
            bl = true;
            break;
        }
        return bl;
    }

    private static boolean softensIn(BlockState state) {
        return state.getFluidState().isIn(FluidTags.WATER);
    }

    @Override
    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        if (HardenedClayBlock.softensOnAnySide(world, pos)) {
            return this.softenedState.getDefaultState();
        }
        return super.getStateForNeighborUpdate(state, direction, neighborState, world, pos, neighborPos);
    }

}
