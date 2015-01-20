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

public class BlockLamp extends Block {

    private final boolean isOn;
    private final String colour;

    public BlockLamp(boolean isOn, String colour) {
        super(Material.redstoneLight);

        this.isOn = isOn;
        this.colour = colour;

        if(isOn) {
            this.setBlockName(colour + "LampOn");
            this.setLightLevel(1.0f);
        }
        if(!isOn) {
            this.setBlockName(colour + "LampOff");
            this.setCreativeTab(sRoxasmodTabs.sRoxasmodBlockTab);
        }
    }

    public void registerBlockIcons(IIconRegister iconRegister) {
        this.blockIcon = iconRegister.registerIcon(Reference.MOD_ID + ":" + (this.isOn ? this.colour + "LampOn" : this.colour + "LampOff"));
    }

    public void onBlockAdded(World world, int x, int y, int z) {

        if(!world.isRemote) {
            if(this.isOn && !world.isBlockIndirectlyGettingPowered(x, y, z)) {
                world.scheduleBlockUpdate(x, y, z, this, 4);
            }
            else if (!this.isOn && world.isBlockIndirectlyGettingPowered(x, y, z)) {
                if (this.colour == "Cyan") {
                    world.setBlock(x, y, z, BlockDecsRoxasmod.blockCyanLampOn, 0, 2);
                }
                if (this.colour == "Purple") {
                    world.setBlock(x, y, z, BlockDecsRoxasmod.blockPurpleLampOn, 0, 2);
                }
                if (this.colour == "Green") {
                    world.setBlock(x, y, z, BlockDecsRoxasmod.blockGreenLampOn, 0, 2);
                }
                if (this.colour == "White") {
                    world.setBlock(x, y, z, BlockDecsRoxasmod.blockWhiteLampOn, 0, 2);
                }
                if (this.colour == "Orange") {
                    world.setBlock(x, y, z, BlockDecsRoxasmod.blockOrangeLampOn, 0, 2);
                }
                if (this.colour == "Magenta") {
                    world.setBlock(x, y, z, BlockDecsRoxasmod.blockMagentaLampOn, 0, 2);
                }
                if (this.colour == "LightBlue") {
                    world.setBlock(x, y, z, BlockDecsRoxasmod.blockLightBlueLampOn, 0, 2);
                }
            }
        }
    }
    public void onNeighborBlockChange(World world, int x, int y, int z, Block par1) {
        if(!world.isRemote) {
            if(this.isOn && !world.isBlockIndirectlyGettingPowered(x, y, z)) {
                world.scheduleBlockUpdate(x, y, z, this, 4);
            }
            else if (!this.isOn && world.isBlockIndirectlyGettingPowered(x, y, z)) {
                if (this.colour == "Cyan") {
                    world.setBlock(x, y, z, BlockDecsRoxasmod.blockCyanLampOn, 0, 2);
                }
                if (this.colour == "Purple") {
                    world.setBlock(x, y, z, BlockDecsRoxasmod.blockPurpleLampOn, 0, 2);
                }
                if (this.colour == "Green") {
                    world.setBlock(x, y, z, BlockDecsRoxasmod.blockGreenLampOn, 0, 2);
                }
                if (this.colour == "White") {
                    world.setBlock(x, y, z, BlockDecsRoxasmod.blockWhiteLampOn, 0, 2);
                }
                if (this.colour == "Orange") {
                    world.setBlock(x, y, z, BlockDecsRoxasmod.blockOrangeLampOn, 0, 2);
                }
                if (this.colour == "Magenta") {
                    world.setBlock(x, y, z, BlockDecsRoxasmod.blockMagentaLampOn, 0, 2);
                }
                if (this.colour == "LightBlue") {
                    world.setBlock(x, y, z, BlockDecsRoxasmod.blockLightBlueLampOn, 0, 2);
                }
            }
        }
    }
    public void updateTick(World world, int x, int y, int z, Random random) {
        if (!world.isRemote && this.isOn && !world.isBlockIndirectlyGettingPowered(x, y, z)) {
            if (this.colour == "Cyan") {
                world.setBlock(x, y, z, BlockDecsRoxasmod.blockCyanLampOff, 0, 2);
            }
            if (this.colour == "Purple") {
                world.setBlock(x, y, z, BlockDecsRoxasmod.blockPurpleLampOff, 0, 2);
            }
            if (this.colour == "Green") {
                world.setBlock(x, y, z, BlockDecsRoxasmod.blockGreenLampOff, 0, 2);
            }
            if (this.colour == "White") {
                world.setBlock(x, y, z, BlockDecsRoxasmod.blockWhiteLampOff, 0, 2);
            }
            if (this.colour == "Orange") {
                world.setBlock(x, y, z, BlockDecsRoxasmod.blockOrangeLampOff, 0, 2);
            }
            if (this.colour == "Magenta") {
                world.setBlock(x, y, z, BlockDecsRoxasmod.blockMagentaLampOff, 0, 2);
            }
            if (this.colour == "LightBlue") {
                world.setBlock(x, y, z, BlockDecsRoxasmod.blockLightBlueLampOff, 0, 2);
            }
        }
    }

    public Item getItemDropped(int i, Random random, int j) {
        if (this.colour == "Cyan") {
            return Item.getItemFromBlock(BlockDecsRoxasmod.blockCyanLampOff);
        }
        if (this.colour == "Purple") {
            return Item.getItemFromBlock(BlockDecsRoxasmod.blockPurpleLampOff);
        }
        if (this.colour == "Green") {
            return Item.getItemFromBlock(BlockDecsRoxasmod.blockGreenLampOff);
        }
        if (this.colour == "White") {
            return Item.getItemFromBlock(BlockDecsRoxasmod.blockWhiteLampOff);
        }
        if (this.colour == "Orange") {
            return Item.getItemFromBlock(BlockDecsRoxasmod.blockOrangeLampOff);
        }
        if (this.colour == "Magenta") {
            return Item.getItemFromBlock(BlockDecsRoxasmod.blockMagentaLampOff);
        }
        if (this.colour == "LightBlue") {
            return Item.getItemFromBlock(BlockDecsRoxasmod.blockLightBlueLampOff);
        }
        return null;
    }

    protected ItemStack createStackedBlock(int i) {
        if(this.colour == "Cyan") {
            return new ItemStack(BlockDecsRoxasmod.blockCyanLampOff);
        }
        if(this.colour == "Purple") {
            return new ItemStack(BlockDecsRoxasmod.blockPurpleLampOff);
        }
        if(this.colour == "Green") {
            return new ItemStack(BlockDecsRoxasmod.blockGreenLampOff);
        }
        if(this.colour == "White") {
            return new ItemStack(BlockDecsRoxasmod.blockWhiteLampOff);
        }
        if(this.colour == "Orange") {
            return new ItemStack(BlockDecsRoxasmod.blockOrangeLampOff);
        }
        if(this.colour == "Magenta") {
            return new ItemStack(BlockDecsRoxasmod.blockMagentaLampOff);
        }
        if(this.colour == "LightBlue") {
            return new ItemStack(BlockDecsRoxasmod.blockLightBlueLampOff);
        }
        return null;
    }
}
