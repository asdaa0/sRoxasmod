package com.sRoxas.sroxasmod.init;
import com.sRoxas.sroxasmod.block.BlockBambooPlanks;
import com.sRoxas.sroxasmod.block.BlockReinforcedDiamondEncrustedIron;
import com.sRoxas.sroxasmod.block.BlockReinforcedIron;
import com.sRoxas.sroxasmod.block.modBlock;
import com.sRoxas.sroxasmod.reference.Names;
import com.sRoxas.sroxasmod.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
    public static final modBlock BambooPlanks = new BlockBambooPlanks();
    public static final modBlock BlockOfReinforcedIron = new BlockReinforcedIron();
    public static final modBlock BlockOfReinforcedDiamondEncrustedIron = new BlockReinforcedDiamondEncrustedIron();

    public static void registerBlocks()
    {
        GameRegistry.registerBlock(BambooPlanks, Names.Blocks.BAMBOO_PLANKS);
        GameRegistry.registerBlock(BlockOfReinforcedIron, Names.Blocks.BLOCK_OF_REINFORCED_IRON);
        GameRegistry.registerBlock(BlockOfReinforcedDiamondEncrustedIron, Names.Blocks.BLOCK_OF_DIAMOND_ENCRUSTED_IRON);
    }
}