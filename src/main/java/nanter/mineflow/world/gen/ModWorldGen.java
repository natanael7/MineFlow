package nanter.mineflow.world.gen;


import nanter.mineflow.init.ModBlocks;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;
import net.minecraftforge.fml.common.registry.GameRegistry;

import java.util.Random;

public class ModWorldGen implements IWorldGenerator {
    private final int MIN_LAYER = 8;
    private final int MAX_LAYER = 64;
    private final int MIN_SIZE = 5;
    private final int MAX_SIZE = 8;
    private final int CHANCES = 30;

    public static void init(){
        GameRegistry.registerWorldGenerator(new ModWorldGen(), 3);
    }

    private ModWorldGen(){    }

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
        if (world.provider.getDimension() == 0) {
            generateOverworld(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
        }
    }

    private void generateOverworld(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
        final int SIZE = MIN_SIZE + random.nextInt(MAX_SIZE - MIN_SIZE + 1);
        generateOre(ModBlocks.COPPER_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, MIN_LAYER, MAX_LAYER, SIZE, CHANCES);
    }

    private void generateOre(IBlockState ore, World world, Random random, int x, int z, int minY, int maxY, int size, int chances) {
        int deltaY = maxY - minY;
        for (int i = 0; i < chances; i++) {
            BlockPos pos = new BlockPos(x + random.nextInt(16), minY + random.nextInt(deltaY), z + random.nextInt(16));
            WorldGenMinable worldGenMinable = new WorldGenMinable(ore, size);
            worldGenMinable.generate(world, random, pos);
        }
    }
}