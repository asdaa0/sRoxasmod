package com.sRoxas.sroxasmod.blocks;

import com.sRoxas.sroxasmod.creativetab.sRoxasmodTabs;
import com.sRoxas.sroxasmod.init.ModItems;
import com.sRoxas.sroxasmod.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

import java.util.List;
import java.util.Random;

public class BlockOres extends Block
{
    @SideOnly(Side.CLIENT)
    private IIcon[] texture;

    final static String[] subBlocks = new String[] {"purpleGem", "redGem", "blueGem", "greenGem", "pinkGem", "orangeGem"};

    protected BlockOres() {
        super(Material.rock);
        this.setHardness(2.5f);
        this.setResistance(5.0f);
        this.setCreativeTab(sRoxasmodTabs.sRoxasmodBlockTab);
    }

    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister)
    {
        texture = new IIcon[subBlocks.length];

        for (int i = 0; i < subBlocks.length; i++)
        {
            texture[i] = iconRegister.registerIcon(Reference.MOD_ID + ":" + subBlocks[i] + "Ore");
        }
    }

    @SideOnly(Side.CLIENT)
    public void getSubBlocks(Item block, CreativeTabs creativeTabs, List list)
    {
        for (int i = 0; i < subBlocks.length; i++)
        {
            list.add(new ItemStack(block, 1, i));
        }
    }

    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int meta)
    {
        return texture[meta];
    }

    public int damageDropped(int meta)
    {
        return meta;
    }

    public int quantityDropped(Random random)
    {
        return random.nextInt(3 - 1 + 1) + 1;
    }

    public Item getItemDropped(int i, Random random, int j)
    {
        if (subBlocks[i] == "purpleGem"){
            return ModItems.purpleGem;
        } else {
            return null;
        }
    }
}
