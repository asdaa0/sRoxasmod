package com.sRoxas.sroxasmod.init;

import com.sRoxas.sroxasmod.item.ItemCheese;
import com.sRoxas.sroxasmod.item.ItemsRoxasmod;
import com.sRoxas.sroxasmod.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    public static final ItemsRoxasmod cheese = new ItemCheese();

    public static void init()
    {
        GameRegistry.registerItem(cheese, "cheese");
    }
}
