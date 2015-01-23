package com.sRoxas.sroxasmod.item.blocks;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

/**
 * @author Blue
 */
public class ItemBlockLamps extends ItemBlock {

    private final static String[] SUBNAMES = {"White", "Orange", "Magenta", "Lightblue", "Yellow", "Lightgreen", "Pink", "Darkgrey", "Lightgrey", "Cyan", "Purple", "Blue", "Brown", "Green", "Red", "Black"};

    public ItemBlockLamps(Block block){
        super(block);
        setHasSubtypes(true);
    }

    @Override
    public String getItemStackDisplayName(ItemStack is){
        return SUBNAMES[is.getItemDamage()] + " Lamp";
    }

    @Override
    public int getMetadata(int meta){
        return meta;
    }

}
