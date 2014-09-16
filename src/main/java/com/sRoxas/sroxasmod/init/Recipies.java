package com.sRoxas.sroxasmod.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class Recipies
{
    public static void init()
    {
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.hardenedStick, 2), "I  ", " I ", "  I", 'I', new ItemStack(Items.iron_ingot));
        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.BambooPlanks, 16), new ItemStack(Blocks.log), new ItemStack(Blocks.log), new ItemStack(Blocks.log), new ItemStack(Blocks.log));
    }
}
