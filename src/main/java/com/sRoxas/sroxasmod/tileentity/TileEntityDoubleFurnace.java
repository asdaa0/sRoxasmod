package com.sRoxas.sroxasmod.tileentity;

import com.sRoxas.sroxasmod.blocks.BlockDoubleFurnace;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.inventory.ISidedInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.tileentity.TileEntity;

public class TileEntityDoubleFurnace extends TileEntity implements ISidedInventory{

    private String localizeName;

    private static final int[] slots_top = new int[]{0};
    private static final int[] slots_bottom = new int[]{2};
    private static final int[] slots_side = new int[]{1};

    private ItemStack[] furnaceItemStacks = new ItemStack [3];

    public int furnaceSpeed = 300;
    /** The number of ticks that the furnace will keep burning */
    public int burnTime;
    /** The number of ticks that a fresh copy of the currently-burning item would keep the furnace burning for */
    public int currentItemBurnTime;
    /** The number of ticks that the current item has been cooking for */
    public int cookTime;

    public void setGuiDisplayName(String displayname) {
        this.localizeName = displayname;
    }

    public String getInventoryName() {
        return this.hasCustomInventoryName() ? this.localizeName : "container.doubleFurnace";
    }

    public boolean hasCustomInventoryName() {
        return this.localizeName != null && this.localizeName.length() > 0;
    }

    public int getSizeInventory() {
        return this.furnaceItemStacks.length;
    }

    @Override
    public int[] getAccessibleSlotsFromSide(int i) {
        return i == 0 ? slots_bottom : (i == 1 ? slots_top : slots_side);
    }

    @Override
    public ItemStack getStackInSlot(int i) {
        return this.furnaceItemStacks[i];
    }

    @Override
    public ItemStack decrStackSize(int i, int j) {
        if(this.furnaceItemStacks[i] != null) {
            ItemStack itemStack;

            if(this.furnaceItemStacks[i].stackSize <= j) {
                itemStack = this.furnaceItemStacks[i];
                this.furnaceItemStacks[i] = null;
                return itemStack;
            }else {
                itemStack = this.furnaceItemStacks[i].splitStack(j);

                if(this.furnaceItemStacks[i].stackSize == 0) {
                    this.furnaceItemStacks[i] = null;
                }
            }
        }
        return null;
    }

    @Override
    public ItemStack getStackInSlotOnClosing(int i) {
        if(this.furnaceItemStacks[i] != null) {
            ItemStack itemStack = this.furnaceItemStacks[i];
            this.furnaceItemStacks[i] = null;
            return itemStack;
        }
        return null;
    }

    @Override
    public void setInventorySlotContents(int i, ItemStack itemStack) {
        this.furnaceItemStacks[i] = itemStack;

        if(itemStack != null && itemStack.stackSize > this.getInventoryStackLimit()) {
            itemStack.stackSize = this.getInventoryStackLimit();
        }
    }

    @Override
    public int getInventoryStackLimit() {
        return 64;
    }

    @Override
    public boolean isUseableByPlayer(EntityPlayer player) {return this.worldObj.getTileEntity(this.xCoord, this.yCoord, this.zCoord) != this ? false: player.getDistanceSq((double)this.xCoord + 0.5d, (double)this.yCoord + 0.5d, (double)this.zCoord + 0.5d) <=64.0d;}
    public void openInventory() {}
    public void closeInventory() {}

    @Override
    public boolean isItemValidForSlot(int i, ItemStack itemStack) {
        return i == 2 ? false : (i == 1 ? isItemFuel(itemStack) : true);
    }

    public static boolean isItemFuel (ItemStack itemStack) {
        return getItemBurnTime(itemStack) > 0;
    }

    private static int getItemBurnTime(ItemStack itemStack) {
        if(itemStack == null) {
            return 0;
        }else{
            Item item = itemStack.getItem();

            if(item instanceof ItemBlock && Block.getBlockFromItem(item) != Blocks.air) {
                Block block = Block.getBlockFromItem(item);
                if(block == Blocks.sapling) return 100;
                if(block == Blocks.planks) return 300;
                if(block == Blocks.coal_block) return 14400;
            }
            if(item == Items.stick) return 100;
            if(item == Items.coal) return 1600;
            if(item == Items.blaze_rod) return 2400;
            if(item == Items.lava_bucket) return 20000;
        }
        return GameRegistry.getFuelValue(itemStack);
    }

    public void updateEntity() {
        boolean flag = this.burnTime > 0;
        boolean flag1 = false;

        if (this.isBurning()) {
            this.burnTime--;
        }
        if (!this.worldObj.isRemote) {
            if(this.burnTime == 0 && this.canSmelt()) {
                this.currentItemBurnTime = this.burnTime = getItemBurnTime(this.furnaceItemStacks[1]);

                if(this.isBurning()){
                    flag1 = true;

                    if(this.furnaceItemStacks[1] != null) {
                        this.furnaceItemStacks[1].stackSize--;

                        if(this.furnaceItemStacks[1].stackSize == 0) {
                            this.furnaceItemStacks[1] = this.furnaceItemStacks[1].getItem().getContainerItem(this.furnaceItemStacks[1]);
                        }
                    }
                }
            }
            if(this.isBurning() && this.canSmelt()) {
                this.cookTime++;

                if (this.cookTime == this.furnaceSpeed) {
                    this.cookTime = 0;
                    this.smeltItem();
                    flag1 = true;
                }
            }else {
                this.cookTime = 0;
            }

            if(flag != this.isBurning()) {
                flag1 = true;
                BlockDoubleFurnace.updateBlockFurnaceBlockState(this.burnTime > 0, this.worldObj, this.xCoord, this.yCoord, this.zCoord);
            }
        }
        if(flag1){
            this.markDirty();
        }
    }

    private boolean canSmelt() {
        if (this.furnaceItemStacks[0] == null) {
            return false;
        } else {
            ItemStack itemstack = FurnaceRecipes.smelting().getSmeltingResult(this.furnaceItemStacks[0]);

            if (itemstack == null) return false;
            if (this.furnaceItemStacks[2] == null) return true;
            if (this.furnaceItemStacks[2].isItemEqual(itemstack)) return true;

            int result = furnaceItemStacks[2].stackSize + itemstack.stackSize;
            return result <= getInventoryStackLimit() && result <= this.furnaceItemStacks[2].getMaxStackSize();
        }
    }

    public void smeltItem() {
        if (this.canSmelt()) {
            ItemStack itemStack = FurnaceRecipes.smelting().getSmeltingResult(this.furnaceItemStacks[0]);

            if (this.furnaceItemStacks[2] == null) {
                this.furnaceItemStacks[2] = itemStack.copy();
            } else if (this.furnaceItemStacks[2].isItemEqual(itemStack)) {
                this.furnaceItemStacks[2].stackSize += itemStack.stackSize;
                this.furnaceItemStacks[2].stackSize += itemStack.stackSize;
            }

            this.furnaceItemStacks[0].stackSize--;

            if (this.furnaceItemStacks[0].stackSize <= 0) {
                this.furnaceItemStacks[0] = null;
            }
        }
    }

    public boolean isBurning() {
        return this.burnTime > 0;
    }

    @Override
    public boolean canInsertItem(int i, ItemStack itemStack, int j) {
        return this.isItemValidForSlot(i, itemStack);
    }

    @Override
    public boolean canExtractItem(int i, ItemStack itemStack, int j) {
        return j != 0 || i != 1 || itemStack.getItem() != Items.bucket;
    }

    public int getBurnTimeRemainingScaled(int i) {
        if(this.currentItemBurnTime == 0) {
            this.currentItemBurnTime = this.furnaceSpeed;
        }
        return this.burnTime * i / this.currentItemBurnTime;
    }

    public int getCookProgressScaled(int i) {
        return this.cookTime * i / this.furnaceSpeed;
    }

    public void readFromNBT(NBTTagCompound nbt)
    {
        super.readFromNBT(nbt);
        NBTTagList list = nbt.getTagList("Item", 10);
        this.furnaceItemStacks = new ItemStack[this.getSizeInventory()];

        for (int i = 0; i < list.tagCount(); ++i)
        {
            NBTTagCompound compound = list.getCompoundTagAt(i);
            byte b = compound.getByte("Slot");

            if (b >= 0 && b < this.furnaceItemStacks.length)
            {
                this.furnaceItemStacks[b] = ItemStack.loadItemStackFromNBT(compound);
            }
        }

        this.burnTime = (int)nbt.getShort("BurnTime");
        this.cookTime = (int)nbt.getShort("CookTime");
        this.currentItemBurnTime = (int)nbt.getShort("CurrentBurnTime");

        if (nbt.hasKey("CustomName"))
        {
            this.localizeName = nbt.getString("CustomName");
        }
    }

    public void writeToNBT(NBTTagCompound nbt)
    {
        super.writeToNBT(nbt);
        nbt.setShort("BurnTime", (short) this.burnTime);
        nbt.setShort("CookTime", (short) this.cookTime);
        nbt.setShort("CurrentBurnTime", (short) this.currentItemBurnTime);
        NBTTagList list = new NBTTagList();

        for (int i = 0; i < this.furnaceItemStacks.length; ++i)
        {
            if (this.furnaceItemStacks[i] != null)
            {
                NBTTagCompound compound = new NBTTagCompound();
                compound.setByte("Slot", (byte) i);
                this.furnaceItemStacks[i].writeToNBT(compound);
                list.appendTag(compound);
            }
        }

        nbt.setTag("Item", list);

        if (this.hasCustomInventoryName())
        {
            nbt.setString("CustomName", this.localizeName);
        }
    }
}
