package com.sRoxas.sroxasmod.blocks;

import com.sRoxas.sroxasmod.creativetab.sRoxasmodTabs;
import com.sRoxas.sroxasmod.reference.Names;
import com.sRoxas.sroxasmod.reference.Reference;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

import java.util.Random;

public class BlockBambooPlanks extends modBlock {
    public BlockBambooPlanks() {
        super(Material.wood);
        this.setBlockName(Names.Blocks.BAMBOO_PLANKS);
        this.setCreativeTab(sRoxasmodTabs.sRoxasmodBlockTab);
        this.setBlockTextureName(Reference.MOD_ID + ":" + Names.Blocks.BAMBOO_PLANKS);
        this.blockHardness = 2;
    }
    public Item getItemDropped(int p_149650_1_, Random random, int p_149650_3_)
    {
        return Item.getItemFromBlock(BlockDecsRoxasmod.BambooPlanks);
    }
}

