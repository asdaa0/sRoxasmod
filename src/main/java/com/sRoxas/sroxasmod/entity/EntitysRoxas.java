package com.sRoxas.sroxasmod.entity;

import com.sRoxas.sroxasmod.item.ModItems;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.*;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.world.World;

public class EntitysRoxas extends EntityAnimal {

    private boolean getHyped;

    public EntitysRoxas(World world) {
        super(world);
        this.setSize(0.9f, 1.9f);
        this.tasks.addTask(0, new EntityAIWander(this, 0.6d));
        this.tasks.addTask(1, new EntityAIPanic(this, 1.1d));
        this.tasks.addTask(2, new EntityAILookIdle(this));
        this.tasks.addTask(3, new EntityAISwimming(this));
        this.tasks.addTask(4, new EntityAITempt(this, 1.0d, ModItems.cheese, false));
        this.tasks.addTask(5, new EntityAIAttackOnCollide(this, EntityZombie.class, 1.0d, true));
        this.tasks.addTask(5, new EntityAIAttackOnCollide(this, EntitySkeleton.class, 1.0d, true));
        this.tasks.addTask(5, new EntityAIAttackOnCollide(this, EntitySpider.class, 1.0d, true));
        this.tasks.addTask(5, new EntityAIAttackOnCollide(this, EntityPlayer.class, 1.0d, true));
        this.tasks.addTask(6, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0f));
    }

    public boolean isAIEnabled() {
        return true;
    }

    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(20.0d);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.6d);
    }

    @Override
    public EntityAgeable createChild(EntityAgeable par1) {
        return new EntitysRoxas(worldObj);
    }

    protected Item getDropItem() {
        return ModItems.pinkGem;
    }

    protected void dropFewItems(boolean par1, int par2) {
        int j = this.rand.nextInt(3) + 1 + this.rand.nextInt(1 + par2);

        for (int k = 0; k < j; ++k) {
            if (k == 2) {
                this.dropItem(this.getDropItem(), this.rand.nextInt(4));
            }
        }
    }
}
