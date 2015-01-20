package com.sRoxas.sroxasmod.blocks;

import com.sRoxas.sroxasmod.creativetab.sRoxasmodTabs;
import com.sRoxas.sroxasmod.item.ModItems;
import com.sRoxas.sroxasmod.reference.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

import java.util.Random;

public class BlockGemOres extends Block
{
    private String name;
    protected BlockGemOres(String type) {
        super(Material.rock);
        this.setCreativeTab(sRoxasmodTabs.sRoxasmodBlockTab);
        this.setStepSound(soundTypeStone);
        this.setHardness(2.5F);
        this.setResistance(10.0F);
        this.textureName = Reference.MOD_ID + ":" + type;
        this.setBlockName(type);
        this.setHarvestLevel("pickaxe", 2);
        this.name = type;
    }
    
    public int quantityDropped(Random random)
    {
        if (this.name == "purpleGemOre"){
            return random.nextInt(3 - 1 + 1) + 1;
        }
        if (this.name == "redGemOre")
        {
            return random.nextInt(3 - 1 + 1) + 1;
        }
        if (this.name == "blueGemOre")
        {
            return random.nextInt(3 - 1 + 1) + 1;
        }
        if (this.name == "greenGemOre")
        {
            return random.nextInt(3 - 1 + 1) + 1;
        }
        if (this.name == "pinkGemOre")
        {
            return random.nextInt(3 - 1 + 1) + 1;
        }
        if (this.name == "orangeGemOre")
        {
            return random.nextInt(3 - 1 + 1) + 1;
        }
        return 0;
    }

    public Item getItemDropped(int i, Random random, int j)
    {
        if (this.name == "purpleGemOre"){
            return ModItems.purpleGem;
        } else if (this.name == "redGemOre")
        {
            return ModItems.redGem;
        } else if (this.name == "blueGemOre")
        {
            return ModItems.blueGem;
        } else if (this.name == "greenGemOre")
        {
            return ModItems.greenGem;
        } else if (this.name == "pinkGemOre")
        {
            return ModItems.pinkGem;
        } else if (this.name == "orangeGemOre")
        {
            return ModItems.orangeGem;
        }
        return null;
    }
}
