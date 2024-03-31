package net.djknarnia.saguaro.block.custom;

import net.djknarnia.saguaro.block.ModBlocks;
import net.minecraft.block.*;
import net.minecraft.entity.Entity;
import net.minecraft.registry.tag.FluidTags;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.text.MutableText;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3i;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.event.GameEvent;
import org.jetbrains.annotations.Nullable;

import java.util.function.Supplier;

public class HardenedClayBlock extends Block {
    private final Supplier<SoftenedClayBlock> softenedBlockSupplier;

    public HardenedClayBlock(Supplier<SoftenedClayBlock> softenedBlockSupplier, Settings settings) {
        super(settings);
        this.softenedBlockSupplier = softenedBlockSupplier;
    }

    public SoftenedClayBlock getSoftenedBlock() {
        return softenedBlockSupplier.get();
    }

    private static boolean shouldSoften(BlockView world, BlockPos pos, BlockState state) {
        return HardenedClayBlock.softensIn(state) || HardenedClayBlock.softensOnAnySide(world, pos);
    }

    static boolean softensOnAnySide(BlockView world, BlockPos pos) {
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

    static boolean softensIn(BlockState state) {
        return state.getFluidState().isIn(FluidTags.WATER);
    }

    @Override
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (world.hasRain(pos.up())) {
            world.setBlockState(pos, this.getSoftenedBlock().getDefaultState());
        }
    }

    @Override
    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        if (HardenedClayBlock.softensOnAnySide(world, pos)) {
            return this.getSoftenedBlock().getDefaultState();
        }
        return super.getStateForNeighborUpdate(state, direction, neighborState, world, pos, neighborPos);
    }

}
