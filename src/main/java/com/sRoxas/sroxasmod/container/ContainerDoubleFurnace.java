package com.sRoxas.sroxasmod.container;

import com.sRoxas.sroxasmod.tileentity.TileEntityDoubleFurnace;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ICrafting;
import net.minecraft.inventory.Slot;
import net.minecraft.inventory.SlotFurnace;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;

public class ContainerDoubleFurnace extends Container {

    private TileEntityDoubleFurnace doubleFurnace;
    public int lastBurnTime;
    public int lastCurrentItemBurnTime;
    public int lastCookTime;

    public ContainerDoubleFurnace(InventoryPlayer inventory, TileEntityDoubleFurnace tileentity) {
        this.doubleFurnace = tileentity;

        this.addSlotToContainer(new Slot(tileentity, 0, 56, 17));
        this.addSlotToContainer(new Slot(tileentity, 1, 56, 53));
        this.addSlotToContainer(new SlotFurnace(inventory.player, tileentity,2, 116, 35));

        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 9; j++) {
                this.addSlotToContainer(new Slot(inventory, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
            }
        }

        for(int i = 0; i < 9; i++) {
            this.addSlotToContainer(new Slot(inventory, i, 8 + i * 18, 142));
        }
    }

    public void addCraftingToCrafters(ICrafting iCrafting){
        super.addCraftingToCrafters(iCrafting);

        iCrafting.sendProgressBarUpdate(this, 0, this.doubleFurnace.cookTime);
        iCrafting.sendProgressBarUpdate(this, 1, this.doubleFurnace.burnTime);
        iCrafting.sendProgressBarUpdate(this, 2, this.doubleFurnace.currentItemBurnTime);
    }

    public void detectAndSendChanges() {
        super.detectAndSendChanges();
        for(int i = 0; i < this.crafters.size(); i++){
            ICrafting iCrafting = (ICrafting) this.crafters.get(i);

            if(this.lastCookTime != this.doubleFurnace.cookTime) {
                iCrafting.sendProgressBarUpdate(this, 0,this.doubleFurnace.cookTime);
            }
            if(this.lastBurnTime != this.doubleFurnace.burnTime) {
                iCrafting.sendProgressBarUpdate(this, 1,this.doubleFurnace.burnTime);
            }
            if(this.lastCurrentItemBurnTime != this.doubleFurnace.currentItemBurnTime) {
                iCrafting.sendProgressBarUpdate(this, 2,this.doubleFurnace.currentItemBurnTime);
            }
        }

        this.lastCookTime = this.doubleFurnace.cookTime;
        this.lastBurnTime = this.doubleFurnace.burnTime;
        this.lastCurrentItemBurnTime = this.doubleFurnace.currentItemBurnTime;
    }

    @SideOnly(Side.CLIENT)
    public void updateProgressBar(int i, int i1){
        if (i == 0) {
            this.doubleFurnace.cookTime = i1;
        }
        if (i == 0) {
            this.doubleFurnace.burnTime = i1;
        }
        if (i == 0) {
            this.doubleFurnace.currentItemBurnTime = i1;
        }
    }
    public ItemStack transferStackInSlot(EntityPlayer entityPlayer, int i)
    {
        ItemStack itemstack = null;
        Slot slot = (Slot)this.inventorySlots.get(i);

        if (slot != null && slot.getHasStack())
        {
            ItemStack itemstack1 = slot.getStack();
            itemstack = itemstack1.copy();

            if (i == 2)
            {
                if (!this.mergeItemStack(itemstack1, 3, 39, true))
                {
                    return null;
                }

                slot.onSlotChange(itemstack1, itemstack);
            }
            else if (i != 1 && i != 0)
            {
                if (FurnaceRecipes.smelting().getSmeltingResult(itemstack1) != null)
                {
                    if (!this.mergeItemStack(itemstack1, 0, 1, false))
                    {
                        return null;
                    }
                }
                else if (TileEntityDoubleFurnace.isItemFuel(itemstack1))
                {
                    if (!this.mergeItemStack(itemstack1, 1, 2, false))
                    {
                        return null;
                    }
                }
                else if (i >= 3 && i < 30)
                {
                    if (!this.mergeItemStack(itemstack1, 30, 39, false))
                    {
                        return null;
                    }
                }
                else if (i >= 30 && i < 39 && !this.mergeItemStack(itemstack1, 3, 30, false))
                {
                    return null;
                }
            }
            else if (!this.mergeItemStack(itemstack1, 3, 39, false))
            {
                return null;
            }

            if (itemstack1.stackSize == 0)
            {
                slot.putStack((ItemStack)null);
            }
            else
            {
                slot.onSlotChanged();
            }

            if (itemstack1.stackSize == itemstack.stackSize)
            {
                return null;
            }

            slot.onPickupFromSlot(entityPlayer, itemstack1);
        }

        return itemstack;
    }






    public boolean canInteractWith(EntityPlayer p_75145_1_) {
        return true;
    }
}
