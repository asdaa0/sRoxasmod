package com.sRoxas.sroxasmod.handler;

import com.sRoxas.sroxasmod.blocks.BlockDecsRoxasmod;
import com.sRoxas.sroxasmod.container.ContainerDoubleFurnace;
import com.sRoxas.sroxasmod.gui.GuiDoubleOven;
import com.sRoxas.sroxasmod.tileentity.TileEntityDoubleFurnace;
import cpw.mods.fml.common.network.IGuiHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class GuiHandler implements IGuiHandler {

    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        TileEntity entity =  world.getTileEntity(x, y, z);

        if(entity != null) {
            switch (ID) {
                case BlockDecsRoxasmod.guiIDDoubleFurnace:
                    if(entity instanceof TileEntityDoubleFurnace) {
                        return new ContainerDoubleFurnace(player.inventory, (TileEntityDoubleFurnace) entity);
                    }
            }
        }
        return null;
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        TileEntity entity =  world.getTileEntity(x, y, z);

        if(entity != null) {
            switch (ID) {
                case BlockDecsRoxasmod.guiIDDoubleFurnace:
                    if(entity instanceof TileEntityDoubleFurnace) {
                        return new GuiDoubleOven(player.inventory, (TileEntityDoubleFurnace) entity);
                    }
            }
        }
        return null;
    }
}
