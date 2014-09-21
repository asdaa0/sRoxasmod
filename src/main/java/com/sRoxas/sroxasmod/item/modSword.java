package com.sRoxas.sroxasmod.item;

import com.sRoxas.sroxasmod.creativetab.sRoxasmodTabs;
import com.sRoxas.sroxasmod.reference.Reference;
import net.minecraft.item.ItemSword;

public class modSword extends ItemSword
{
    public modSword(ToolMaterial material, String name)
    {
        super(material);
        this.setUnlocalizedName(name);
        this.setCreativeTab(sRoxasmodTabs.sRoxasmodToolsTab);
        this.setTextureName(Reference.MOD_ID + ":" + name);
    }
}
