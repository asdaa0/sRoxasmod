package com.sRoxas.sroxasmod.blocks;

import com.sRoxas.sroxasmod.creativetab.sRoxasmodTabs;
import com.sRoxas.sroxasmod.reference.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class modBlock extends Block
{
    public modBlock(Material material, String name, float hardness, float resistance, String tool, int harvestLevel)
    {
        super(material);
        this.setCreativeTab(sRoxasmodTabs.sRoxasmodBlockTab);
        this.setBlockName(name);
        this.setHardness(hardness);
        this.setResistance(resistance);
        this.setHarvestLevel(tool, harvestLevel);
        this.textureName = Reference.MOD_ID + ":" + name;
    }
    public modBlock(Material material, String name, float hardness, float resistance)
    {
        super(material);
        this.setCreativeTab(sRoxasmodTabs.sRoxasmodBlockTab);
        this.setBlockName(name);
        this.setHardness(hardness);
        this.setResistance(resistance);
        this.textureName = Reference.MOD_ID + ":" + name;
    }
}
