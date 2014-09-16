package com.sRoxas.sroxasmod.init;

import com.sRoxas.sroxasmod.item.ItemCheese;
import com.sRoxas.sroxasmod.item.ItemHardenedStick;
import com.sRoxas.sroxasmod.item.modItem;
import com.sRoxas.sroxasmod.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    public static final modItem cheese = new ItemCheese();
    public static final modItem hardenedStick = new ItemHardenedStick();

    public static void init()
    {
        GameRegistry.registerItem(cheese, "cheese");
        GameRegistry.registerItem(hardenedStick, "hardenedStick");
    }
}
