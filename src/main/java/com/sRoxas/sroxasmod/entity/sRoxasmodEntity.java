package com.sRoxas.sroxasmod.entity;

import com.sRoxas.sroxasmod.sRoxasmod;
import cpw.mods.fml.common.registry.EntityRegistry;
import net.minecraft.entity.EntityList;

public class sRoxasmodEntity {
    public static void init(){
        registerEntity();
    }

    public static void registerEntity(){
        createEntity(EntitysRoxas.class, "sRoxas", 0x8DA4D7, 0xD7C08D);
    }

    public static void createEntity(Class entityClass, String entityName, int solidColour, int spotColour){
        int randomId = EntityRegistry.findGlobalUniqueEntityId();

        EntityRegistry.registerGlobalEntityID(entityClass, entityName, randomId);
        EntityRegistry.registerModEntity(entityClass, entityName, randomId, sRoxasmod.instance, 64, 1, true);
        createEgg(randomId, solidColour, spotColour);
    }

    private static void createEgg(int randomID, int solidColour, int spotColour) {
        EntityList.entityEggs.put(Integer.valueOf(randomID), new EntityList.EntityEggInfo(randomID, solidColour, spotColour));
    }
}
