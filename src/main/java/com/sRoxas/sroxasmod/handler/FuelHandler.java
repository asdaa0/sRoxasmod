package com.sRoxas.sroxasmod.handler;

import com.sRoxas.sroxasmod.blocks.BlockDecsRoxasmod;
import com.sRoxas.sroxasmod.item.ModItems;
import cpw.mods.fml.common.IFuelHandler;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class FuelHandler implements IFuelHandler {

    @Override
    public int getBurnTime(ItemStack fuel) {
        if(fuel.getItem() == ModItems.redGem) return 800;
        if(fuel.getItem() == Item.getItemFromBlock(BlockDecsRoxasmod.BambooPlanks)) return 25;

        return 0;
    }
}
