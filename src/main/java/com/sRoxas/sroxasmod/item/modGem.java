package com.sRoxas.sroxasmod.item;

import com.sRoxas.sroxasmod.creativetab.sRoxasmodTabs;
import com.sRoxas.sroxasmod.reference.Reference;
import net.minecraft.item.Item;

public class modGem extends Item
{
    public modGem(String name)
    {
        super();
        this.setUnlocalizedName(name);
        this.setCreativeTab(sRoxasmodTabs.sRoxasmodItemTab);
        this.setTextureName(Reference.MOD_ID + ":" + name);
        this.setMaxStackSize(32);
    }
}
