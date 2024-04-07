package net.djknarnia.saguaro.block.entity;

import net.djknarnia.saguaro.SaguaroMod;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.object.builder.v1.world.poi.PointOfInterestHelper;
import net.minecraft.block.*;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.poi.PointOfInterestType;

public class SaguaroBeehiveBlock extends BeehiveBlock {
    private static PointOfInterestType SAGUARO_BEEHIVE_POI = PointOfInterestHelper.register(new Identifier(SaguaroMod.MOD_ID, "saguaro_beehive_poi"), 0, 1);
    protected static final VoxelShape COLLISION_SHAPE = Block.createCuboidShape(0.001, 0.0, 0.001, 15.999, 15.999, 15.999);

    public SaguaroBeehiveBlock(FabricBlockSettings settings) {
        super(settings);
    }

    public VoxelShape getCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return COLLISION_SHAPE;
    }

    public VoxelShape getSidesShape(BlockState state, BlockView world, BlockPos pos) {
        return VoxelShapes.fullCube();
    }


    public VoxelShape getCameraCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return VoxelShapes.fullCube();
    }


    /*public void onEntityCollision(BlockState state, World world, BlockPos pos, Entity entity) {
        if (entity.getType() != EntityType.BEE || entity.getType() != EntityType.BAT) {
            entity.damage(world.getDamageSources().cactus(), 1.0f);
        }
    }*/
}
