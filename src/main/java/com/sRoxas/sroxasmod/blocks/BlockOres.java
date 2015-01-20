package com.sRoxas.sroxasmod.blocks;

import com.sRoxas.sroxasmod.creativetab.sRoxasmodTabs;
import com.sRoxas.sroxasmod.reference.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockOres extends Block
{
    protected BlockOres(String type) {
        super(Material.rock);
        this.setCreativeTab(sRoxasmodTabs.sRoxasmodBlockTab);
        this.setStepSound(soundTypeStone);
        this.setHardness(2.5F);
        this.setResistance(10.0F);
        this.textureName = Reference.MOD_ID + ":" + type;
        this.setBlockName(type);


        if (type == "copperOre" || type == "tinOre"){
            this.setHarvestLevel("pickaxe", 1);
        } else {
            this.setHarvestLevel("pickaxe", 2);
        }
    }
}
