package com.sRoxas.sroxasmod.blocks;

import com.sRoxas.sroxasmod.creativetab.sRoxasmodTabs;
import com.sRoxas.sroxasmod.item.blocks.ItemBlockLamps;
import com.sRoxas.sroxasmod.reference.Names;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.material.Material;

import static com.sRoxas.sroxasmod.blocks.BlockDecsRoxasmod.*;
import static com.sRoxas.sroxasmod.blocks.BlockDecsRoxasmod.BlockLamps;

public class BlockssRoxasmod
{
    public static void init()
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

        BlockLamps = new BlockLamps().setCreativeTab(sRoxasmodTabs.sRoxasmodBlockTab).setLightLevel(1f);
        registerBlocks();
    }

    public static void registerBlocks(){
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

        GameRegistry.registerBlock(BlockLamps, ItemBlockLamps.class, BlockLamps.getUnlocalizedName().substring(5));

        // TileEntities
        GameRegistry.registerBlock(blockWoodenTable, "woodenTable");
        GameRegistry.registerBlock(doubleFurnaceIdle, "doubleFurnaceIdle");
        GameRegistry.registerBlock(doubleFurnaceActive, "doubleFurnaceActive");
    }
}
