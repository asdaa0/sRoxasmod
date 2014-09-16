package com.sRoxas.sroxasmod.init;
import com.sRoxas.sroxasmod.block.BlockBambooPlanks;
import com.sRoxas.sroxasmod.block.modBlock;
import com.sRoxas.sroxasmod.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
    public static final modBlock BambooPlanks = new BlockBambooPlanks();

    public static void init()
    {
        GameRegistry.registerBlock(BambooPlanks, "bambooPlanks");
    }
}