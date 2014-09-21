package com.sRoxas.sroxasmod;

import com.sRoxas.sroxasmod.client.handler.KeyInputEventHandler;
import com.sRoxas.sroxasmod.handler.ConfigurationHandler;
import com.sRoxas.sroxasmod.init.ModBlocks;
import com.sRoxas.sroxasmod.init.ModItems;
import com.sRoxas.sroxasmod.init.Recipies;
import com.sRoxas.sroxasmod.proxy.IProxy;
import com.sRoxas.sroxasmod.reference.Reference;
import com.sRoxas.sroxasmod.utility.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.item.crafting.CraftingManager;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class sRoxasmod
{
    @Mod.Instance(Reference.MOD_ID)
    public static sRoxasmod instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preinit(FMLPreInitializationEvent event)
    {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());

        proxy.registerKeyBindings();

        ModItems.init();
        LogHelper.info("sRoxasmod's Items have finished loading");

        ModBlocks.registerBlocks();
        LogHelper.info("sRoxasmod's Blocks have finished loading");

        LogHelper.info("Pre Initialization Complete");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        FMLCommonHandler.instance().bus().register(new KeyInputEventHandler());
        Recipies.init(CraftingManager.getInstance());
        LogHelper.info("Initialization Complete");
    }

    @Mod.EventHandler
    public void postinit(FMLPostInitializationEvent event)
    {
        LogHelper.info("Post Initialization Complete");
    }
}
