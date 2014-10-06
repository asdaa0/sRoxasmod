package com.sRoxas.sroxasmod.blocks;

import com.sRoxas.sroxasmod.creativetab.sRoxasmodTabs;
import com.sRoxas.sroxasmod.reference.Names;
import com.sRoxas.sroxasmod.reference.Reference;
import net.minecraft.item.Item;

import java.util.Random;

public class BlockReinforcedDiamondEncrustedIron extends modBlock
{
    public BlockReinforcedDiamondEncrustedIron()
    {
        super();
        this.setBlockName(Names.Blocks.BLOCK_OF_DIAMOND_ENCRUSTED_IRON);
        this.setCreativeTab(sRoxasmodTabs.sRoxasmodBlockTab);
        this.setBlockTextureName(Reference.MOD_ID + ":" + Names.Blocks.BLOCK_OF_DIAMOND_ENCRUSTED_IRON);
    }
    public Item getItemDropped(int p_149650_1_, Random random, int p_149650_3_)
    {
        return Item.getItemFromBlock(BlockDecsRoxasmod.BlockOfReinforcedDiamondEncrustedIron);
    }
}
