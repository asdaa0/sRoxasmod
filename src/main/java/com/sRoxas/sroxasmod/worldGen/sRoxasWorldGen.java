package com.sRoxas.sroxasmod.worldGen;

import com.sRoxas.sroxasmod.blocks.BlockDecsRoxasmod;
import com.sRoxas.sroxasmod.blocks.BlockGemOres;
import com.sRoxas.sroxasmod.blocks.BlockOres;
import com.sRoxas.sroxasmod.reference.Reference;
import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

import java.util.Random;

public class sRoxasWorldGen implements IWorldGenerator{

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
    {
        //
        switch(world.provider.dimensionId)
        {
            case 0:  //surface
                generateSurface(world, random, chunkX * 16, chunkZ * 16);
            case 1:  //end
                generateEnd(world, random, chunkX * 16, chunkZ * 16);
            case -1:  //nether
                generateNether(world, random, chunkX * 16, chunkZ * 16);
        }
    }

    private void generateNether(World world, Random random, int i, int i1) {

    }

    private void generateEnd(World world, Random random, int i, int i1) {

    }

    private void generateSurface(World world, Random random, int x, int z)
    {
        this.addOreSpawn(BlockDecsRoxasmod.chromiumOre, world, random, x, z, 16, 16, 4 + random.nextInt(6), 15, 0, 68);
        this.addOreSpawn(BlockDecsRoxasmod.copperOre, world, random, x, z, 16, 16, 4 + random.nextInt(6), 15, 0, 68);
        this.addOreSpawn(BlockDecsRoxasmod.germaniumOre, world, random, x, z, 16, 16, 4 + random.nextInt(6), 15, 0, 68);
        this.addOreSpawn(BlockDecsRoxasmod.nickelOre, world, random, x, z, 16, 16, 4 + random.nextInt(6), 15, 0, 68);
        this.addOreSpawn(BlockDecsRoxasmod.palladiumOre, world, random, x, z, 16, 16, 4 + random.nextInt(6), 15, 0, 68);
        this.addOreSpawn(BlockDecsRoxasmod.platinumOre, world, random, x, z, 16, 16, 4 + random.nextInt(6), 15, 0, 68);
        this.addOreSpawn(BlockDecsRoxasmod.siliconOre, world, random, x, z, 16, 16, 4 + random.nextInt(6), 15, 0, 68);
        this.addOreSpawn(BlockDecsRoxasmod.tinOre, world, random, x, z, 16, 16, 4 + random.nextInt(6), 15, 0, 68);

        this.addOreSpawn(BlockDecsRoxasmod.purpleGemOre, world, random, x, z, 16, 16, 4 + random.nextInt(6), 15, 0, 68);
        this.addOreSpawn(BlockDecsRoxasmod.redGemOre, world, random, x, z, 16, 16, 4 + random.nextInt(6), 15, 0, 68);
        this.addOreSpawn(BlockDecsRoxasmod.blueGemOre, world, random, x, z, 16, 16, 4 + random.nextInt(6), 15, 0, 68);
        this.addOreSpawn(BlockDecsRoxasmod.greenGemOre, world, random, x, z, 16, 16, 4 + random.nextInt(6), 15, 0, 68);
        this.addOreSpawn(BlockDecsRoxasmod.pinkGemOre, world, random, x, z, 16, 16, 4 + random.nextInt(6), 15, 0, 68);
        this.addOreSpawn(BlockDecsRoxasmod.orangeGemOre, world, random, x, z, 16, 16, 4 + random.nextInt(6), 15, 0, 68);
    }

    private void addOreSpawn(Block block, int meta, World world, Random random, int blockXPos, int blockZPos, int maxX, int maxZ, int maxVeinSize, int chanceToSpawn, int minY, int maxY)
    {
        for (int i = 0; i < chanceToSpawn; i++) {
            int posX= blockXPos + random.nextInt(maxX);
            int posY= minY + random.nextInt(maxY - minY);
            int posZ= blockZPos + random.nextInt(maxZ);
            (new WorldGenMinable(block, meta, maxVeinSize, Blocks.stone)).generate(world, random, posX, posY, posZ);
        }
    }
    private void addOreSpawn(Block block, World world, Random random, int blockXPos, int blockZPos, int maxX, int maxZ, int maxVeinSize, int chanceToSpawn, int minY, int maxY)
    {
        for (int i = 0; i < chanceToSpawn; i++) {
            int posX= blockXPos + random.nextInt(maxX);
            int posY= minY + random.nextInt(maxY - minY);
            int posZ= blockZPos + random.nextInt(maxZ);
            (new WorldGenMinable(block, maxVeinSize, Blocks.stone)).generate(world, random, posX, posY, posZ);
        }
    }
}
