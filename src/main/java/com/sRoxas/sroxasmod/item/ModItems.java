package com.sRoxas.sroxasmod.item;

import com.sRoxas.sroxasmod.handler.FuelHandler;
import com.sRoxas.sroxasmod.item.*;
import com.sRoxas.sroxasmod.reference.Names;
import com.sRoxas.sroxasmod.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    // Ingots
    public static Item  reinforcedIronIngot;
    public static Item  chromiumIngot;
    public static Item  tinIngot;
    public static Item  copperIngot;
    public static Item  palladiumIngot;
    public static Item  nickelIngot;
    public static Item  platinumIngot;
    public static Item  germaniumIngot;
    public static Item  siliconIngot;
    public static Item  leadIngot;

    // Gems
    public static Item  reinforcedDiamond;
    public static Item  purpleGem;
    public static Item  redGem;
    public static Item  greenGem;
    public static Item  blueGem;
    public static Item  pinkGem;
    public static Item  orangeGem;

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

    public static Item  orangeGemAxe;
    public static Item  orangeGemSword;
    public static Item  orangeGemPick;
    public static Item  orangeGemShovel;
    public static Item  orangeGemHoe;

    public static Item  chromiumAxe;
    public static Item  chromiumSword;
    public static Item  chromiumPick;
    public static Item  chromiumShovel;
    public static Item  chromiumHoe;

    public static Item  tinAxe;
    public static Item  tinSword;
    public static Item  tinPick;
    public static Item  tinShovel;
    public static Item  tinHoe;

    public static Item  copperAxe;
    public static Item  copperSword;
    public static Item  copperPick;
    public static Item  copperShovel;
    public static Item  copperHoe;

    public static Item  palladiumAxe;
    public static Item  palladiumSword;
    public static Item  palladiumPick;
    public static Item  palladiumShovel;
    public static Item  palladiumHoe;

    public static Item  nickelAxe;
    public static Item  nickelSword;
    public static Item  nickelPick;
    public static Item  nickelShovel;
    public static Item  nickelHoe;

    public static Item  platinumAxe;
    public static Item  platinumSword;
    public static Item  platinumPick;
    public static Item  platinumShovel;
    public static Item  platinumHoe;

    public static Item  germaniumAxe;
    public static Item  germaniumSword;
    public static Item  germaniumPick;
    public static Item  germaniumShovel;
    public static Item  germaniumHoe;

    public static Item  siliconAxe;
    public static Item  siliconSword;
    public static Item  siliconPick;
    public static Item  siliconShovel;
    public static Item  siliconHoe;

    public static Item  leadAxe;
    public static Item  leadSword;
    public static Item  leadPick;
    public static Item  leadShovel;
    public static Item  leadHoe;
    // Misc Items
    public static Item  cheese;
    public static Item  hardenedStick;

    private static Item.ToolMaterial ReinforcedMaterial = EnumHelper.addToolMaterial("REINFORCEDMATERIAL", 3, 5000, 10.0F, 2.5F, 25);
    private static Item.ToolMaterial purpleGemMaterial = EnumHelper.addToolMaterial("PURPLEGEMMATERIAL", 2, 1750, 8.0F, 3.0F, 22);
    private static Item.ToolMaterial redGemMaterial = EnumHelper.addToolMaterial("REDGEMMATERIAL", 2, 1600, 8.0F, 3.0F, 22);
    private static Item.ToolMaterial greenGemMaterial = EnumHelper.addToolMaterial("GREENGEMMATERIAL", 2, 1650, 8.0F, 3.0F, 22);
    private static Item.ToolMaterial blueGemMaterial = EnumHelper.addToolMaterial("BLUEGEMMATERIAL", 2, 1570, 8.0F, 3.0F, 22);
    private static Item.ToolMaterial pinkGemMaterial = EnumHelper.addToolMaterial("PINKGEMMATERIAL", 2, 1700, 8.0F, 3.0F, 22);
    private static Item.ToolMaterial orangeGemMaterial = EnumHelper.addToolMaterial("ORANGEGEMMATERIAL", 2, 1700, 8.0F, 3.0F, 22);
    private static Item.ToolMaterial group6Material = EnumHelper.addToolMaterial("GROUP6MATERIAL", 2, 1700, 8.0F, 3.0F, 22);
    private static Item.ToolMaterial group10Material = EnumHelper.addToolMaterial("GROUP10MATERIAL", 2, 700, 10.0f, 5.0F, 10);
    private static Item.ToolMaterial group11Material = EnumHelper.addToolMaterial("GROUP11MATERIAL", 0, 127, 12.0f, 0.0F, 22);
    private static Item.ToolMaterial group14Material = EnumHelper.addToolMaterial("GROUP14MATERIAL", 2, 347, 2.0f, 2.0f, 21);

    public static void init()
    {
        // Ingots
        reinforcedIronIngot = new modIngot(Names.Items.REINFORCED_IRON_INGOT);
        chromiumIngot = new modIngot(Names.Items.CHROMIUM_INGOT);
        tinIngot = new modIngot(Names.Items.TIN_INGOT);
        copperIngot = new modIngot(Names.Items.COPPER_INGOT);
        palladiumIngot = new modIngot(Names.Items.PALLADIUM_INGOT);
        nickelIngot = new modIngot(Names.Items.NICKEL_INGOT);
        platinumIngot = new modIngot(Names.Items.PLATINUM_INGOT);
        germaniumIngot = new modIngot(Names.Items.GERMANIUM_INGOT);
        siliconIngot = new modIngot(Names.Items.SILICON_INGOT);
        leadIngot = new modIngot(Names.Items.LEAD_INGOT);

        // Gems
        reinforcedDiamond = new modGem(Names.Items.REINFORCED_DIAMOND);
        purpleGem = new modGem(Names.Items.PURPLE_GEM);
        redGem = new modGem(Names.Items.RED_GEM);
        greenGem = new modGem(Names.Items.GREEN_GEM);
        blueGem = new modGem(Names.Items.BLUE_GEM);
        pinkGem = new modGem(Names.Items.PINK_GEM);
        orangeGem = new modGem (Names.Items.ORANGE_GEM);

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

        orangeGemAxe = new modAxe(orangeGemMaterial, Names.Items.ORANGE_GEM_AXE);
        orangeGemSword = new modSword(orangeGemMaterial, Names.Items.ORANGE_GEM_SWORD);
        orangeGemPick = new modPick(orangeGemMaterial, Names.Items.ORANGE_GEM_PICK);
        orangeGemShovel = new modShovel(orangeGemMaterial, Names.Items.ORANGE_GEM_SHOVEL);
        orangeGemHoe = new modHoe(orangeGemMaterial, Names.Items.ORANGE_GEM_HOE);

        chromiumAxe = new modAxe(group6Material, Names.Items.CHROMIUM_AXE);
        chromiumSword = new modSword(group6Material, Names.Items.CHROMIUM_SWORD);
        chromiumPick = new modPick(group6Material, Names.Items.CHROMIUM_PICK);
        chromiumShovel = new modShovel(group6Material, Names.Items.CHROMIUM_SHOVEL);
        chromiumHoe = new modHoe(group6Material, Names.Items.CHROMIUM_HOE);

        tinAxe = new modAxe(group14Material, Names.Items.TIN_AXE);
        tinSword = new modSword(group14Material, Names.Items.TIN_SWORD);
        tinPick = new modPick(group14Material, Names.Items.TIN_PICK);
        tinShovel = new modShovel(group14Material, Names.Items.TIN_SHOVEL);
        tinHoe = new modHoe(group14Material, Names.Items.TIN_HOE);

        copperAxe = new modAxe(group11Material, Names.Items.COPPER_AXE);
        copperSword = new modSword(group11Material, Names.Items.COPPER_SWORD);
        copperPick = new modPick(group11Material, Names.Items.COPPER_PICK);
        copperShovel = new modShovel(group11Material, Names.Items.COPPER_SHOVEL);
        copperHoe = new modHoe(group11Material, Names.Items.COPPER_HOE);

        platinumAxe = new modAxe(group10Material, Names.Items.PLATINUM_AXE);
        platinumSword = new modSword(group10Material, Names.Items.PLATINUM_SWORD);
        platinumPick = new modPick(group10Material, Names.Items.PLATINUM_PICK);
        platinumShovel = new modShovel(group10Material, Names.Items.PLATINUM_SHOVEL);
        platinumHoe = new modHoe(group10Material, Names.Items.PLATINUM_HOE);

        nickelAxe = new modAxe(group10Material, Names.Items.NICKEL_AXE);
        nickelSword = new modSword(group10Material, Names.Items.NICKEL_SWORD);
        nickelPick = new modPick(group10Material, Names.Items.NICKEL_PICK);
        nickelShovel = new modShovel(group10Material, Names.Items.NICKEL_SHOVEL);
        nickelHoe = new modHoe(group10Material, Names.Items.NICKEL_HOE);

        germaniumAxe = new modAxe(group14Material, Names.Items.GERMANIUM_AXE);
        germaniumSword = new modSword(group14Material, Names.Items.GERMANIUM_SWORD);
        germaniumPick = new modPick(group14Material, Names.Items.GERMANIUM_PICK);
        germaniumShovel = new modShovel(group14Material, Names.Items.GERMANIUM_SHOVEL);
        germaniumHoe = new modHoe(group14Material, Names.Items.GERMANIUM_HOE);

        siliconAxe = new modAxe(group14Material, Names.Items.SILICON_AXE);
        siliconSword = new modSword(group14Material, Names.Items.SILICON_SWORD);
        siliconPick = new modPick(group14Material, Names.Items.SILICON_PICK);
        siliconShovel = new modShovel(group14Material, Names.Items.SILICON_SHOVEL);
        siliconHoe = new modHoe(group14Material, Names.Items.SILICON_HOE);

        palladiumAxe = new modAxe(group10Material, Names.Items.PALLADIUM_AXE);
        palladiumSword = new modSword(group10Material, Names.Items.PALLADIUM_SWORD);
        palladiumPick = new modPick(group10Material, Names.Items.PALLADIUM_PICK);
        palladiumShovel = new modShovel(group10Material, Names.Items.PALLADIUM_SHOVEL);
        palladiumHoe = new modHoe(group10Material, Names.Items.PALLADIUM_HOE);

        leadAxe = new modAxe(group14Material, Names.Items.LEAD_AXE);
        leadSword = new modSword(group14Material, Names.Items.LEAD_SWORD);
        leadPick = new modPick(group14Material, Names.Items.LEAD_PICK);
        leadShovel = new modShovel(group14Material, Names.Items.LEAD_SHOVEL);
        leadHoe = new modHoe(group14Material, Names.Items.LEAD_HOE);

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
        GameRegistry.registerItem(chromiumIngot, Names.Items.CHROMIUM_INGOT);
        GameRegistry.registerItem(tinIngot, Names.Items.TIN_INGOT);
        GameRegistry.registerItem(copperIngot, Names.Items.COPPER_INGOT);
        GameRegistry.registerItem(palladiumIngot, Names.Items.PALLADIUM_INGOT);
        GameRegistry.registerItem(nickelIngot, Names.Items.NICKEL_INGOT);
        GameRegistry.registerItem(platinumIngot, Names.Items.PLATINUM_INGOT);
        GameRegistry.registerItem(germaniumIngot, Names.Items.GERMANIUM_INGOT);
        GameRegistry.registerItem(siliconIngot, Names.Items.SILICON_INGOT);
        GameRegistry.registerItem(leadIngot, Names.Items.LEAD_INGOT);
        // Gems
        GameRegistry.registerItem(reinforcedDiamond, Names.Items.REINFORCED_DIAMOND);
        GameRegistry.registerItem(purpleGem, Names.Items.PURPLE_GEM);
        GameRegistry.registerItem(redGem, Names.Items.RED_GEM);
        GameRegistry.registerItem(greenGem, Names.Items.GREEN_GEM);
        GameRegistry.registerItem(blueGem, Names.Items.BLUE_GEM);
        GameRegistry.registerItem(pinkGem, Names.Items.PINK_GEM);
        GameRegistry.registerItem(orangeGem,Names.Items.ORANGE_GEM);
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

        GameRegistry.registerItem(orangeGemAxe, Names.Items.ORANGE_GEM_AXE);
        GameRegistry.registerItem(orangeGemSword, Names.Items.ORANGE_GEM_SWORD);
        GameRegistry.registerItem(orangeGemPick, Names.Items.ORANGE_GEM_PICK);
        GameRegistry.registerItem(orangeGemShovel, Names.Items.ORANGE_GEM_SHOVEL);
        GameRegistry.registerItem(orangeGemHoe, Names.Items.ORANGE_GEM_HOE);

        GameRegistry.registerItem(chromiumAxe, Names.Items.CHROMIUM_AXE);
        GameRegistry.registerItem(chromiumSword, Names.Items.CHROMIUM_SWORD);
        GameRegistry.registerItem(chromiumPick, Names.Items.CHROMIUM_PICK);
        GameRegistry.registerItem(chromiumShovel, Names.Items.CHROMIUM_SHOVEL);
        GameRegistry.registerItem(chromiumHoe, Names.Items.CHROMIUM_HOE);

        GameRegistry.registerItem(copperAxe, Names.Items.COPPER_AXE);
        GameRegistry.registerItem(copperSword, Names.Items.COPPER_SWORD);
        GameRegistry.registerItem(copperPick, Names.Items.COPPER_PICK);
        GameRegistry.registerItem(copperShovel, Names.Items.COPPER_SHOVEL);
        GameRegistry.registerItem(copperHoe, Names.Items.COPPER_HOE);

        GameRegistry.registerItem(germaniumAxe, Names.Items.GERMANIUM_AXE);
        GameRegistry.registerItem(germaniumSword, Names.Items.GERMANIUM_SWORD);
        GameRegistry.registerItem(germaniumPick, Names.Items.GERMANIUM_PICK);
        GameRegistry.registerItem(germaniumShovel, Names.Items.GERMANIUM_SHOVEL);
        GameRegistry.registerItem(germaniumHoe, Names.Items.GERMANIUM_HOE);

        GameRegistry.registerItem(leadAxe, Names.Items.LEAD_AXE);
        GameRegistry.registerItem(leadSword, Names.Items.LEAD_SWORD);
        GameRegistry.registerItem(leadPick, Names.Items.LEAD_PICK);
        GameRegistry.registerItem(leadShovel, Names.Items.LEAD_SHOVEL);
        GameRegistry.registerItem(leadHoe, Names.Items.LEAD_HOE);

        GameRegistry.registerItem(nickelAxe, Names.Items.NICKEL_AXE);
        GameRegistry.registerItem(nickelSword, Names.Items.NICKEL_SWORD);
        GameRegistry.registerItem(nickelPick, Names.Items.NICKEL_PICK);
        GameRegistry.registerItem(nickelShovel, Names.Items.NICKEL_SHOVEL);
        GameRegistry.registerItem(nickelHoe, Names.Items.NICKEL_HOE);

        GameRegistry.registerItem(palladiumAxe, Names.Items.PALLADIUM_AXE);
        GameRegistry.registerItem(palladiumSword, Names.Items.PALLADIUM_SWORD);
        GameRegistry.registerItem(palladiumPick, Names.Items.PALLADIUM_PICK);
        GameRegistry.registerItem(palladiumShovel, Names.Items.PALLADIUM_SHOVEL);
        GameRegistry.registerItem(palladiumHoe, Names.Items.PALLADIUM_HOE);

        GameRegistry.registerItem(platinumAxe, Names.Items.PLATINUM_AXE);
        GameRegistry.registerItem(platinumSword, Names.Items.PLATINUM_SWORD);
        GameRegistry.registerItem(platinumPick, Names.Items.PLATINUM_PICK);
        GameRegistry.registerItem(platinumShovel, Names.Items.PLATINUM_SHOVEL);
        GameRegistry.registerItem(platinumHoe, Names.Items.PLATINUM_HOE);

        GameRegistry.registerItem(siliconAxe, Names.Items.SILICON_AXE);
        GameRegistry.registerItem(siliconSword, Names.Items.SILICON_SWORD);
        GameRegistry.registerItem(siliconPick, Names.Items.SILICON_PICK);
        GameRegistry.registerItem(siliconShovel, Names.Items.SILICON_SHOVEL);
        GameRegistry.registerItem(siliconHoe, Names.Items.SILICON_HOE);

        GameRegistry.registerItem(tinAxe, Names.Items.TIN_AXE);
        GameRegistry.registerItem(tinSword, Names.Items.TIN_SWORD);
        GameRegistry.registerItem(tinPick, Names.Items.TIN_PICK);
        GameRegistry.registerItem(tinShovel, Names.Items.TIN_SHOVEL);
        GameRegistry.registerItem(tinHoe, Names.Items.TIN_HOE);

        // Misc Items
        GameRegistry.registerItem(cheese, Names.Items.CHEESE);
        GameRegistry.registerItem(hardenedStick, Names.Items.HARDENED_STICK);

        GameRegistry.registerFuelHandler(new FuelHandler());

        //model GameRegistry.registerItem(ItemName, Names.Items.ITEM_NAME);
    }
}
