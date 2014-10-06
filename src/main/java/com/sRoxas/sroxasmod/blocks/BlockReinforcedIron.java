package com.sRoxas.sroxasmod.blocks;

import com.sRoxas.sroxasmod.creativetab.sRoxasmodTabs;
import com.sRoxas.sroxasmod.reference.Names;
import com.sRoxas.sroxasmod.reference.Reference;
import net.minecraft.item.Item;

import java.util.Random;

public class BlockReinforcedIron extends modBlock
{
    public BlockReinforcedIron()
    {
        super();
        this.setBlockName(Names.Blocks.BLOCK_OF_REINFORCED_IRON);
        this.setCreativeTab(sRoxasmodTabs.sRoxasmodBlockTab);
        this.setBlockTextureName(Reference.MOD_ID + ":" + Names.Blocks.BLOCK_OF_REINFORCED_IRON);
        this.blockHardness = 5;
    }
    public Item getItemDropped(int p_149650_1_, Random random, int p_149650_3_)
    {
        return Item.getItemFromBlock(BlockDecsRoxasmod.BlockOfReinforcedIron);
    }
}
