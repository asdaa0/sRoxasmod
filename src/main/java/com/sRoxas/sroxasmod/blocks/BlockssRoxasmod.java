package com.sRoxas.sroxasmod.blocks;

import com.sRoxas.sroxasmod.blocks.lamps.BlockLamp;
import com.sRoxas.sroxasmod.reference.Names;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.material.Material;

import static com.sRoxas.sroxasmod.blocks.BlockDecsRoxasmod.*;

public class BlockssRoxasmod
{
    public static void init()
    {
        registerBlocks();
    }

    public static void registerBlocks()
    {
        purpleGemOre = new BlockGemOres("purpleGemOre");
        redGemOre = new BlockGemOres("redGemOre");
        blueGemOre = new BlockGemOres("blueGemOre");
        greenGemOre = new BlockGemOres("greenGemOre");
        pinkGemOre = new BlockGemOres("pinkGemOre");
        orangeGemOre = new BlockGemOres("orangeGemOre");

        chromiumOre = new BlockOres("chromiumOre");
        copperOre = new BlockOres("copperOre");
        germaniumOre = new BlockOres("germaniumOre");
        nickelOre = new BlockOres("nickelOre");
        palladiumOre = new BlockOres("palladiumOre");
        platinumOre = new BlockOres("platinumOre");
        siliconOre = new BlockOres("siliconOre");
        tinOre = new BlockOres("tinOre");
        leadOre = new BlockOres("leadOre");

        BambooPlanks = new modBlock(Material.wood, Names.Blocks.BAMBOO_PLANKS, 1.5f, 3f);
        BlockOfReinforcedIron = new modBlock(Material.iron, Names.Blocks.BLOCK_OF_REINFORCED_IRON, 3.0f, 10f, "pickaxe", 2);
        BlockOfReinforcedDiamondEncrustedIron = new modBlock(Material.iron, Names.Blocks.BLOCK_OF_DIAMOND_ENCRUSTED_IRON, 3.5f, 1000000f, "pickaxe", 3);

        blockWoodenTable = new BlockWoodenTable(Material.wood).setBlockName("WoodenTable");

        doubleFurnaceIdle = new BlockDoubleFurnace(false, "doubleFurnaceIdle");
        doubleFurnaceActive = new BlockDoubleFurnace(true, "doubleFurnaceActive");

        // Lamps
        blockWhiteLampOn = new BlockLamp(true, "White");
        blockWhiteLampOff = new BlockLamp(false, "White");
        blockOrangeLampOn = new BlockLamp(true, "Orange");
        blockOrangeLampOff = new BlockLamp(false, "Orange");
        blockMagentaLampOn = new BlockLamp(true, "Magenta");
        blockMagentaLampOff = new BlockLamp(false, "Magenta");
        blockLightBlueLampOn = new BlockLamp(true, "LightBlue");
        blockLightBlueLampOff = new BlockLamp(false, "LightBlue");
        blockCyanLampOn = new BlockLamp(true, "Cyan");
        blockCyanLampOff = new BlockLamp(false, "Cyan");
        blockPurpleLampOn = new BlockLamp(true, "Purple");
        blockPurpleLampOff = new BlockLamp(false, "Purple");
        blockGreenLampOn = new BlockLamp(true, "Green");
        blockGreenLampOff = new BlockLamp(false, "Green");

        /* The
        * Game
        * Registry
        * For
        * Blocks
        */

        // Blocks
        GameRegistry.registerBlock(chromiumOre, "chromiumOre");
        GameRegistry.registerBlock(copperOre, "copperOre");
        GameRegistry.registerBlock(germaniumOre, "germaniumOre");
        GameRegistry.registerBlock(nickelOre, "nickelOre");
        GameRegistry.registerBlock(palladiumOre, "palladiumOre");
        GameRegistry.registerBlock(platinumOre, "platinumOre");
        GameRegistry.registerBlock(siliconOre, "siliconOre");
        GameRegistry.registerBlock(tinOre, "tinOre");
        GameRegistry.registerBlock(leadOre, "leadOre");

        GameRegistry.registerBlock(purpleGemOre, "purpleGemOre");
        GameRegistry.registerBlock(redGemOre, "redGemOre");
        GameRegistry.registerBlock(blueGemOre, "blueGemOre");
        GameRegistry.registerBlock(greenGemOre, "greenGemOre");
        GameRegistry.registerBlock(pinkGemOre, "pinkGemOre");
        GameRegistry.registerBlock(orangeGemOre, "orangeGemOre");

        GameRegistry.registerBlock(BambooPlanks, "bambooPlanks");
        GameRegistry.registerBlock(BlockOfReinforcedIron, "blockOfReinforcedIron");
        GameRegistry.registerBlock(BlockOfReinforcedDiamondEncrustedIron, "blockOfReinforcedDiamondEncrustedIron");

        // Lamps
        GameRegistry.registerBlock(blockWhiteLampOn, "whiteLampOn");
        GameRegistry.registerBlock(blockWhiteLampOff, "whiteLampOff");
        GameRegistry.registerBlock(blockOrangeLampOn, "orangeLampOn");
        GameRegistry.registerBlock(blockOrangeLampOff, "orangeLampOff");
        GameRegistry.registerBlock(blockMagentaLampOn, "magentaLampOn");
        GameRegistry.registerBlock(blockMagentaLampOff, "magentaLampOff");
        GameRegistry.registerBlock(blockLightBlueLampOn, "lightBlueLampOn");
        GameRegistry.registerBlock(blockLightBlueLampOff, "lightBlueLampOff");
        GameRegistry.registerBlock(blockCyanLampOn, "cyanLampOn");
        GameRegistry.registerBlock(blockCyanLampOff, "cyanLampOff");
        GameRegistry.registerBlock(blockPurpleLampOn, "purpleLampOn");
        GameRegistry.registerBlock(blockPurpleLampOff, "purpleLampOff");
        GameRegistry.registerBlock(blockGreenLampOn, "greenLampOn");
        GameRegistry.registerBlock(blockGreenLampOff, "greenLampOff");

        // TileEntities
        GameRegistry.registerBlock(blockWoodenTable, "woodenTable");
        GameRegistry.registerBlock(doubleFurnaceIdle, "doubleFurnaceIdle");
        GameRegistry.registerBlock(doubleFurnaceActive, "doubleFurnaceActive");
    }
}
