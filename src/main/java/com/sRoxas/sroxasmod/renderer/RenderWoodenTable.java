package com.sRoxas.sroxasmod.renderer;

import com.sRoxas.sroxasmod.model.ModelWoodenTable;
import com.sRoxas.sroxasmod.reference.Reference;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class RenderWoodenTable extends TileEntitySpecialRenderer {

    private static final ResourceLocation texture = new ResourceLocation(Reference.MOD_ID + ":" + "models/WoodenTable.png");

    private ModelWoodenTable model;

    public RenderWoodenTable(){
        this.model = new ModelWoodenTable();
    }

    @Override
    public void renderTileEntityAt(TileEntity tileEntity, double x, double y, double z, float f) {
        GL11.glPushMatrix();
            GL11.glTranslatef((float)x + 0.5f, (float)y + 1.5f, (float)z + 0.5f);
            GL11.glRotatef(180, 0f, 0f, 1f);

            this.bindTexture(texture);

            GL11.glPushMatrix();
                this.model.renderModel(0.0625f);
            GL11.glPopMatrix();
        GL11.glPopMatrix();
    }
}
