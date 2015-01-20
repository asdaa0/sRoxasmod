package com.sRoxas.sroxasmod.proxy;

import com.sRoxas.sroxasmod.blocks.BlockDecsRoxasmod;
import com.sRoxas.sroxasmod.client.settings.KeyBindings;
import com.sRoxas.sroxasmod.entity.EntitysRoxas;
import com.sRoxas.sroxasmod.renderer.ItemRenderWoodenTable;
import com.sRoxas.sroxasmod.renderer.RenderWoodenTable;
import com.sRoxas.sroxasmod.renderer.RendersRoxas;
import com.sRoxas.sroxasmod.tileentity.TileEntityWoodenTable;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.item.Item;
import net.minecraftforge.client.MinecraftForgeClient;

public class ClientProxy extends CommonProxy
{
    public void registerRenderThings()
    {
        //Obsidian Table
        TileEntitySpecialRenderer render = new RenderWoodenTable();
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityWoodenTable.class, render);
        MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockDecsRoxasmod.blockWoodenTable), new ItemRenderWoodenTable(render, new TileEntityWoodenTable()));
        RenderingRegistry.registerEntityRenderingHandler(EntitysRoxas.class, new RendersRoxas(new ModelBiped(), 0));
    }

    public void registerTileEntitySpecialRenderer()
    {

    }
    @Override
    public void registerKeyBindings()
    {
        ClientRegistry.registerKeyBinding(KeyBindings.charge);
        ClientRegistry.registerKeyBinding(KeyBindings.release);
    }
}
