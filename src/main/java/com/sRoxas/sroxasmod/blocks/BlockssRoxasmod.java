package com.sRoxas.sroxasmod.blocks;

import com.sRoxas.sroxasmod.itemblocks.ItemBlockOres;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

import static com.sRoxas.sroxasmod.blocks.BlockDecsRoxasmod.*;

public class BlockssRoxasmod
{
    public static void init()
    {
        BambooPlanks = new BlockBambooPlanks();
        BlockOfReinforcedIron = new BlockReinforcedIron();
        BlockOfReinforcedDiamondEncrustedIron = new BlockReinforcedDiamondEncrustedIron();
        registerBlocks();
    }

    private static void registerBlocks()
    {
        blockOres = new BlockOres().setBlockName("blockOres");

        GameRegistry.registerBlock(blockOres, ItemBlockOres.class, "blockOres");
        GameRegistry.registerBlock(BambooPlanks, "bambooPlanks");
        GameRegistry.registerBlock(BlockOfReinforcedIron, "blockOfReinforcedIron");
        GameRegistry.registerBlock(BlockOfReinforcedDiamondEncrustedIron, "blockOfReinforcedDiamondEncrustedIron");
    }
}
