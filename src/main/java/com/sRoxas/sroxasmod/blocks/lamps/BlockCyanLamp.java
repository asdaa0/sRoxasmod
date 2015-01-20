package com.sRoxas.sroxasmod.blocks.lamps;

import com.sRoxas.sroxasmod.blocks.BlockDecsRoxasmod;
import com.sRoxas.sroxasmod.creativetab.sRoxasmodTabs;
import com.sRoxas.sroxasmod.reference.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import java.util.Random;

public class BlockCyanLamp extends Block {

    private final boolean isOn;

    public BlockCyanLamp(boolean isOn, String name) {
        super(Material.redstoneLight);
        this.setBlockName(name);

        this.isOn = isOn;

        if (isOn){
            this.setLightLevel(1.0f);
        }
        if(!isOn) {
            this.setCreativeTab(sRoxasmodTabs.sRoxasmodBlockTab);
        }
    }

    public void registerBlockIcons(IIconRegister iconRegister) {
        this.blockIcon = iconRegister.registerIcon(Reference.MOD_ID + ":" + (this.isOn ? "cyanLampOn" : "cyanLampOff"));
    }

    public void onBlockAdded(World world, int x, int y, int z) {

        if(!world.isRemote) {
            if(this.isOn && !world.isBlockIndirectlyGettingPowered(x, y, z)) {
                world.scheduleBlockUpdate(x, y, z, this, 4);
            }
            else if (!this.isOn && world.isBlockIndirectlyGettingPowered(x, y, z)) {
                world.setBlock(x, y, z, BlockDecsRoxasmod.blockCyanLampOn, 0, 2);
            }
        }
    }

    public void onNeighborBlockChange(World world, int x, int y, int z, Block par1) {
        if(!world.isRemote) {
            if(this.isOn && !world.isBlockIndirectlyGettingPowered(x, y, z)) {
                world.scheduleBlockUpdate(x, y, z, this, 4);
            }
            else if (!this.isOn && world.isBlockIndirectlyGettingPowered(x, y, z)) {
                world.setBlock(x, y, z, BlockDecsRoxasmod.blockCyanLampOn, 0, 2);
            }
        }
    }

    public void updateTick(World world, int x, int y, int z, Random random) {
        if (!world.isRemote && this.isOn && !world.isBlockIndirectlyGettingPowered(x, y, z)) {
            world.setBlock(x, y, z, BlockDecsRoxasmod.blockCyanLampOff, 0, 2);
        }
    }

    public Item getItemDropped(int i, Random random, int j) {
        return Item.getItemFromBlock(BlockDecsRoxasmod.blockCyanLampOff);
    }

    protected ItemStack createStackedBlock(int i) {
        return new ItemStack(BlockDecsRoxasmod.blockCyanLampOff);
    }
}
