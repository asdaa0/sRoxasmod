package com.sRoxas.sroxasmod.blocks;

import com.sRoxas.sroxasmod.reference.Reference;
import com.sRoxas.sroxasmod.utility.LogHelper;
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

/**
 * @author Blue
 */
public class BlockLamps extends Block {
    @SideOnly(Side.CLIENT)
    private IIcon[] texture;

    public BlockLamps(){
        super(Material.redstoneLight);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister){
        texture = new IIcon[16];
        for(int i = 0; i < 16; i++) {
            texture[i] = iconRegister.registerIcon(Reference.MOD_PREFIX + "BlockLamp" + i);
            LogHelper.info(Reference.MOD_PREFIX + "BlockLamp" + i);
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void getSubBlocks(Item par1, CreativeTabs creativeTabs, List list){
        for(int var4 = 0; var4 < 16; ++var4) {
            list.add(new ItemStack(BlockDecsRoxasmod.BlockLamps, 1, var4));
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int meta){
        return texture[meta];
    }

    @Override
    public int damageDropped(int meta){
        return meta;
    }

}
