package com.sRoxas.sroxasmod.gui;

import com.sRoxas.sroxasmod.container.ContainerDoubleFurnace;
import com.sRoxas.sroxasmod.reference.Reference;
import com.sRoxas.sroxasmod.tileentity.TileEntityDoubleFurnace;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class GuiDoubleOven extends GuiContainer{

    public static final ResourceLocation bground = new ResourceLocation(Reference.MOD_ID + ":" + "textures/gui/GuiDoubleFurnace.png");

    public TileEntityDoubleFurnace doubleFurnace;

    public GuiDoubleOven(InventoryPlayer inventoryPlayer, TileEntityDoubleFurnace entity) {
        super(new ContainerDoubleFurnace(inventoryPlayer, entity));

        this.doubleFurnace = entity;

        this.xSize = 176;
        this.ySize = 166;
    }

    public void drawGuiContainerForegroundLayer(int par, int par2) {
        String name = "Doubling Furnace";

        this.fontRendererObj.drawString(name, this.xSize/2 - this.fontRendererObj.getStringWidth(name)/2, 6, 4210752);
        this.fontRendererObj.drawString(I18n.format("container.inventory", new Object[0]), 8, this.ySize - 96 + 2, 4210752);
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float var1, int var2, int var3) {
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        this.mc.getTextureManager().bindTexture(bground);
        int k = (this.width - this.xSize) / 2;
        int l = (this.height - this.ySize) / 2;
        this.drawTexturedModalRect(k, l, 0, 0, this.xSize, this.ySize);

        if (this.doubleFurnace.isBurning())
        {
            int i1 = this.doubleFurnace.getBurnTimeRemainingScaled(13);
            this.drawTexturedModalRect(k + 56, l + 36 + 12 - i1, 176, 12 - i1, 14, i1 + 1);
            i1 = this.doubleFurnace.getCookProgressScaled(24);
            this.drawTexturedModalRect(k + 79, l + 34, 176, 14, i1 + 1, 16);
        }
    }
}
