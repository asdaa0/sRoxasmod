package com.sRoxas.sroxasmod.blocks;

import com.sRoxas.sroxasmod.creativetab.sRoxasmodTabs;
import com.sRoxas.sroxasmod.tileentity.TileEntityWoodenTable;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockWoodenTable extends BlockContainer {

    public BlockWoodenTable(Material material)
    {
        super(material);

        this.setHardness(2.5f);
        this.setResistance(5.0f);

        this.setCreativeTab(sRoxasmodTabs.sRoxasmodBlockTab);
    }

    public int getRenderType()
    {
        return -1;
    }

    public boolean isOpaqueCube()
    {
        return false;
    }

    public boolean renderAsNormalBlock()
    {
        return false;
    }

    @Override
    public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_)
    {
        return new TileEntityWoodenTable();
    }
}
