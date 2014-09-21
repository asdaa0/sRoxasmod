package com.sRoxas.sroxasmod.item;

import com.sRoxas.sroxasmod.creativetab.sRoxasmodTabs;
import com.sRoxas.sroxasmod.reference.Reference;
import net.minecraft.item.Item;

public class modIngot extends Item
{
    public modIngot(String name)
    {
        super();
        this.setUnlocalizedName(name);
        this.setCreativeTab(sRoxasmodTabs.sRoxasmodItemTab);
        this.setTextureName(Reference.MOD_ID + ":" + name);
    }
}
