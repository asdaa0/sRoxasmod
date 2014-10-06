package com.sRoxas.sroxasmod.itemblocks;

import com.sRoxas.sroxasmod.init.ModItems;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

import java.util.Random;

public class ItemBlockOres extends ItemBlock
{

    final static String[] subBlocks = new String[] {"purpleGem", "redGem", "blueGem", "greenGem", "pinkGem", "orangeGem"};

    public ItemBlockOres(Block block) {
        super(block);
        this.setHasSubtypes(true);
    }

    public String getUnlocalizedName(ItemStack itemStack)
    {
        int i = itemStack.getItemDamage();
        if(i < 0 || i>= subBlocks.length)
        {
            i = 0;
        }
        return super.getUnlocalizedName() + "." + subBlocks[i] + "Ore";
    }

    public int getMetadata(int meta) {
        return meta;
    }
}
