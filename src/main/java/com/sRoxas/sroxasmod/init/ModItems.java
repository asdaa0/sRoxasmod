package com.sRoxas.sroxasmod.init;

import com.sRoxas.sroxasmod.item.*;
import com.sRoxas.sroxasmod.item.modPick;
import com.sRoxas.sroxasmod.reference.Names;
import com.sRoxas.sroxasmod.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraftforge.common.util.EnumHelper;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    // Ingots
    public static Item  reinforcedIronIngot;
    // Gems
    public static Item  reinforcedDiamond;
    public static Item  purpleGem;
    public static Item  redGem;
    public static Item  greenGem;
    public static Item  blueGem;
    public static Item  pinkGem;

    // Tools
    public static Item  reinforcedAxe;
    public static Item  reinforcedSword;
    public static Item  reinforcedPick;
    public static Item  reinforcedShovel;
    public static Item  reinforcedHoe;

    public static Item  purpleGemAxe;
    public static Item  purpleGemSword;
    public static Item  purpleGemPick;
    public static Item  purpleGemShovel;
    public static Item  purpleGemHoe;

    public static Item  redGemAxe;
    public static Item  redGemSword;
    public static Item  redGemPick;
    public static Item  redGemShovel;
    public static Item  redGemHoe;

    public static Item  greenGemAxe;
    public static Item  greenGemSword;
    public static Item  greenGemPick;
    public static Item  greenGemShovel;
    public static Item  greenGemHoe;

    public static Item  blueGemAxe;
    public static Item  blueGemSword;
    public static Item  blueGemPick;
    public static Item  blueGemShovel;
    public static Item  blueGemHoe;

    public static Item  pinkGemAxe;
    public static Item  pinkGemSword;
    public static Item  pinkGemPick;
    public static Item  pinkGemShovel;
    public static Item  pinkGemHoe;
    // Misc Items
    public static Item  cheese;
    public static Item  hardenedStick;

    private static Item.ToolMaterial ReinforcedMaterial = EnumHelper.addToolMaterial("REINFORCEDMATERIAL", 3, 5000, 10.0F, 2.5F, 25);
    private static Item.ToolMaterial purpleGemMaterial = EnumHelper.addToolMaterial("PURPLEGEMMATERIAL", 2, 1750, 8.0F, 3.0F, 22);
    private static Item.ToolMaterial redGemMaterial = EnumHelper.addToolMaterial("REDGEMMATERIAL", 2, 1600, 8.0F, 3.0F, 22);
    private static Item.ToolMaterial greenGemMaterial = EnumHelper.addToolMaterial("GREENGEMMATERIAL", 2, 1650, 8.0F, 3.0F, 22);
    private static Item.ToolMaterial blueGemMaterial = EnumHelper.addToolMaterial("BLUEGEMMATERIAL", 2, 1570, 8.0F, 3.0F, 22);
    private static Item.ToolMaterial pinkGemMaterial = EnumHelper.addToolMaterial("GREENGEMMATERIAL", 2, 1700, 8.0F, 3.0F, 22);

    public static void init()
    {
        // Ingots
        reinforcedIronIngot = new modIngot(Names.Items.REINFORCED_IRON_INGOT);

        // Gems
        reinforcedDiamond = new modGem(Names.Items.REINFORCED_DIAMOND);
        purpleGem = new modGem(Names.Items.PURPLE_GEM);
        redGem = new modGem(Names.Items.RED_GEM);
        greenGem = new modGem(Names.Items.GREEN_GEM);
        blueGem = new modGem(Names.Items.BLUE_GEM);
        pinkGem = new modGem(Names.Items.PINK_GEM);

        // Tools
        reinforcedAxe = new modAxe(ReinforcedMaterial, Names.Items.REINFORCED_AXE);
        reinforcedSword = new modSword(ReinforcedMaterial, Names.Items.REINFORCED_SWORD);
        reinforcedPick = new modPick(ReinforcedMaterial, Names.Items.REINFORCED_PICK);
        reinforcedShovel = new modShovel(ReinforcedMaterial, Names.Items.REINFORCED_SHOVEL);
        reinforcedHoe = new modHoe(ReinforcedMaterial, Names.Items.REINFORCED_HOE);

        purpleGemAxe = new modAxe(purpleGemMaterial, Names.Items.PURPLE_GEM_AXE);
        purpleGemSword = new modSword(purpleGemMaterial, Names.Items.PURPLE_GEM_SWORD);
        purpleGemPick = new modPick(purpleGemMaterial, Names.Items.PURPLE_GEM_PICK);
        purpleGemShovel = new modShovel(purpleGemMaterial, Names.Items.PURPLE_GEM_SHOVEL);
        purpleGemHoe = new modHoe(purpleGemMaterial, Names.Items.PURPLE_GEM_HOE);

        redGemAxe = new modAxe(redGemMaterial, Names.Items.RED_GEM_AXE);
        redGemSword = new modSword(redGemMaterial, Names.Items.RED_GEM_SWORD);
        redGemPick = new modPick(redGemMaterial, Names.Items.RED_GEM_PICK);
        redGemShovel = new modShovel(redGemMaterial, Names.Items.RED_GEM_SHOVEL);
        redGemHoe = new modHoe(redGemMaterial, Names.Items.RED_GEM_HOE);

        greenGemAxe = new modAxe(greenGemMaterial, Names.Items.GREEN_GEM_AXE);
        greenGemSword = new modSword(greenGemMaterial, Names.Items.GREEN_GEM_SWORD);
        greenGemPick = new modPick(greenGemMaterial, Names.Items.GREEN_GEM_PICK);
        greenGemShovel = new modShovel(greenGemMaterial, Names.Items.GREEN_GEM_SHOVEL);
        greenGemHoe = new modHoe(greenGemMaterial, Names.Items.GREEN_GEM_HOE);

        blueGemAxe = new modAxe(blueGemMaterial, Names.Items.BLUE_GEM_AXE);
        blueGemSword = new modSword(blueGemMaterial, Names.Items.BLUE_GEM_SWORD);
        blueGemPick = new modPick(blueGemMaterial, Names.Items.BLUE_GEM_PICK);
        blueGemShovel = new modShovel(blueGemMaterial, Names.Items.BLUE_GEM_SHOVEL);
        blueGemHoe = new modHoe(blueGemMaterial, Names.Items.BLUE_GEM_HOE);

        pinkGemAxe = new modAxe(pinkGemMaterial, Names.Items.PINK_GEM_AXE);
        pinkGemSword = new modSword(pinkGemMaterial, Names.Items.PINK_GEM_SWORD);
        pinkGemPick = new modPick(pinkGemMaterial, Names.Items.PINK_GEM_PICK);
        pinkGemShovel = new modShovel(pinkGemMaterial, Names.Items.PINK_GEM_SHOVEL);
        pinkGemHoe = new modHoe(pinkGemMaterial, Names.Items.PINK_GEM_HOE);

        // Misc Items
        cheese = new modmiscitem(Names.Items.CHEESE);
        hardenedStick = new modmiscitem(Names.Items.HARDENED_STICK);
        // model NAME = new ITEMCLASS(Names.Items.ITEMNAME);
        registerItems();
    }
    public static void registerItems()
    {
        // Ingots
        GameRegistry.registerItem(reinforcedIronIngot, Names.Items.REINFORCED_IRON_INGOT);
        // Gems
        GameRegistry.registerItem(reinforcedDiamond, Names.Items.REINFORCED_DIAMOND);
        GameRegistry.registerItem(purpleGem, Names.Items.PURPLE_GEM);
        GameRegistry.registerItem(redGem, Names.Items.RED_GEM);
        GameRegistry.registerItem(greenGem, Names.Items.GREEN_GEM);
        GameRegistry.registerItem(blueGem, Names.Items.BLUE_GEM);
        GameRegistry.registerItem(pinkGem, Names.Items.PINK_GEM);
        // Tools
        GameRegistry.registerItem(reinforcedAxe, Names.Items.REINFORCED_AXE);
        GameRegistry.registerItem(reinforcedSword, Names.Items.REINFORCED_SWORD);
        GameRegistry.registerItem(reinforcedPick, Names.Items.REINFORCED_PICK);
        GameRegistry.registerItem(reinforcedShovel, Names.Items.REINFORCED_SHOVEL);
        GameRegistry.registerItem(reinforcedHoe, Names.Items.REINFORCED_HOE);

        GameRegistry.registerItem(purpleGemAxe, Names.Items.PURPLE_GEM_AXE);
        GameRegistry.registerItem(purpleGemSword, Names.Items.PURPLE_GEM_SWORD);
        GameRegistry.registerItem(purpleGemPick, Names.Items.PURPLE_GEM_PICK);
        GameRegistry.registerItem(purpleGemShovel, Names.Items.PURPLE_GEM_SHOVEL);
        GameRegistry.registerItem(purpleGemHoe, Names.Items.PURPLE_GEM_HOE);

        GameRegistry.registerItem(redGemAxe, Names.Items.RED_GEM_AXE);
        GameRegistry.registerItem(redGemSword, Names.Items.RED_GEM_SWORD);
        GameRegistry.registerItem(redGemPick, Names.Items.RED_GEM_PICK);
        GameRegistry.registerItem(redGemShovel, Names.Items.RED_GEM_SHOVEL);
        GameRegistry.registerItem(redGemHoe, Names.Items.RED_GEM_HOE);

        GameRegistry.registerItem(greenGemAxe, Names.Items.GREEN_GEM_AXE);
        GameRegistry.registerItem(greenGemSword, Names.Items.GREEN_GEM_SWORD);
        GameRegistry.registerItem(greenGemPick, Names.Items.GREEN_GEM_PICK);
        GameRegistry.registerItem(greenGemShovel, Names.Items.GREEN_GEM_SHOVEL);
        GameRegistry.registerItem(greenGemHoe, Names.Items.GREEN_GEM_HOE);

        GameRegistry.registerItem(blueGemAxe, Names.Items.BLUE_GEM_AXE);
        GameRegistry.registerItem(blueGemSword, Names.Items.BLUE_GEM_SWORD);
        GameRegistry.registerItem(blueGemPick, Names.Items.BLUE_GEM_PICK);
        GameRegistry.registerItem(blueGemShovel, Names.Items.BLUE_GEM_SHOVEL);
        GameRegistry.registerItem(blueGemHoe, Names.Items.BLUE_GEM_HOE);

        GameRegistry.registerItem(pinkGemAxe, Names.Items.PINK_GEM_AXE);
        GameRegistry.registerItem(pinkGemSword, Names.Items.PINK_GEM_SWORD);
        GameRegistry.registerItem(pinkGemPick, Names.Items.PINK_GEM_PICK);
        GameRegistry.registerItem(pinkGemShovel, Names.Items.PINK_GEM_SHOVEL);
        GameRegistry.registerItem(pinkGemHoe, Names.Items.PINK_GEM_HOE);
        // Misc Items
        GameRegistry.registerItem(cheese, Names.Items.CHEESE);
        GameRegistry.registerItem(hardenedStick, Names.Items.HARDENED_STICK);

        //model GameRegistry.registerItem(ItemName, Names.Items.ITEM_NAME);
    }
}
