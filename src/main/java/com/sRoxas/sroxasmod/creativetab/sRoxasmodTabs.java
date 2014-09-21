package com.sRoxas.sroxasmod.creativetab;

import com.sRoxas.sroxasmod.init.ModItems;
import com.sRoxas.sroxasmod.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class sRoxasmodTabs
{
    public static final CreativeTabs sRoxasmodBlockTab = new CreativeTabs(Reference.MOD_ID.toLowerCase() + "blocks") {
        @Override
        public Item getTabIconItem()
        {
            return ModItems.cheese;
        }
    };

    public static final CreativeTabs sRoxasmodItemTab = new CreativeTabs(Reference.MOD_ID.toLowerCase() + "items") {
        @Override
        public Item getTabIconItem()
        {
            return ModItems.hardenedStick;
        }
    };

    public static final CreativeTabs sRoxasmodToolsTab = new CreativeTabs(Reference.MOD_ID.toLowerCase() + "tools") {
        @Override
        public Item getTabIconItem()
        {
            return Items.apple;
        }
    };
}
