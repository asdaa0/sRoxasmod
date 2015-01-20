package com.sRoxas.sroxasmod.renderer;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.client.IItemRenderer;
import org.lwjgl.opengl.GL11;

public class ItemRenderWoodenTable implements IItemRenderer{

    TileEntitySpecialRenderer render;
    private TileEntity entity;

    public ItemRenderWoodenTable(TileEntitySpecialRenderer render, TileEntity entity) {
        this.entity = entity;
        this.render = render;
    }

    @Override
    public boolean handleRenderType(ItemStack item, ItemRenderType type) {
        return true;
    }

    @Override
    public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper) {
        return true;
    }

    @Override
    public void renderItem(ItemRenderType type, ItemStack item, Object... data) {
        if (type == ItemRenderType.ENTITY)
            GL11.glTranslatef(-0.5f, 0.1f, -0.5f);
        this.render.renderTileEntityAt(this.entity, 0.0d, 0.0d, 0.0d, 0.0f);
    }
}
