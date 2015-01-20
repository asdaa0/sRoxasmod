package com.sRoxas.sroxasmod.init;

import com.sRoxas.sroxasmod.blocks.BlockDecsRoxasmod;
import com.sRoxas.sroxasmod.item.ModItems;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;

public class Recipies {
    public static void init(CraftingManager craftManager) {
        // Furnace
        GameRegistry.addSmelting(new ItemStack(BlockDecsRoxasmod.chromiumOre), new ItemStack(ModItems.chromiumIngot), 0);
        GameRegistry.addSmelting(new ItemStack(BlockDecsRoxasmod.copperOre), new ItemStack(ModItems.copperIngot), 0);
        GameRegistry.addSmelting(new ItemStack(BlockDecsRoxasmod.germaniumOre), new ItemStack(ModItems.germaniumIngot), 0);
        GameRegistry.addSmelting(new ItemStack(BlockDecsRoxasmod.nickelOre), new ItemStack(ModItems.nickelIngot), 0);
        GameRegistry.addSmelting(new ItemStack(BlockDecsRoxasmod.palladiumOre), new ItemStack(ModItems.palladiumIngot), 0);
        GameRegistry.addSmelting(new ItemStack(BlockDecsRoxasmod.platinumOre), new ItemStack(ModItems.platinumIngot), 0);
        GameRegistry.addSmelting(new ItemStack(BlockDecsRoxasmod.siliconOre), new ItemStack(ModItems.siliconIngot), 0);
        GameRegistry.addSmelting(new ItemStack(BlockDecsRoxasmod.tinOre), new ItemStack(ModItems.tinIngot), 0);
        GameRegistry.addSmelting(new ItemStack(BlockDecsRoxasmod.leadOre), new ItemStack(ModItems.leadIngot), 0);


        // Misc Items
        craftManager.addShapelessRecipe(new ItemStack(BlockDecsRoxasmod.BambooPlanks, 16), new Object[]{Blocks.log, Blocks.log});
        craftManager.addShapelessRecipe(new ItemStack(ModItems.cheese, 4), new Object[]{Items.milk_bucket});
        craftManager.addRecipe(new ItemStack(BlockDecsRoxasmod.blockWoodenTable), new Object[]{"SSS", "P P", 'S', new ItemStack(Blocks.wooden_slab), 'P', new ItemStack(Blocks.planks)});

        // Reinforced Items/Blocks
        craftManager.addRecipe(new ItemStack(ModItems.reinforcedIronIngot, 1), new Object[]{" O ", "OIO", " O ", 'O', new ItemStack(Blocks.obsidian), 'I', new ItemStack(Items.iron_ingot)});
        craftManager.addRecipe(new ItemStack(ModItems.reinforcedDiamond, 1), new Object[]{"OIO", "IDI", "OIO", 'I', new ItemStack(ModItems.reinforcedIronIngot), 'D', new ItemStack(Items.diamond), 'O', new ItemStack(Blocks.obsidian)});
        craftManager.addRecipe(new ItemStack(ModItems.hardenedStick, 1), new Object[]{"I  ", " O ", "  I", 'O', new ItemStack(Blocks.obsidian), 'I', new ItemStack(ModItems.reinforcedIronIngot)});
        craftManager.addRecipe(new ItemStack(BlockDecsRoxasmod.BlockOfReinforcedDiamondEncrustedIron, 1), new Object[]{"OIO", "IDI", "OIO", 'I', new ItemStack(ModItems.reinforcedIronIngot), 'D', new ItemStack(ModItems.reinforcedDiamond), 'O', new ItemStack(Blocks.obsidian)});
        craftManager.addRecipe(new ItemStack(BlockDecsRoxasmod.BlockOfReinforcedIron, 1), new Object[]{"III", "III", "III", 'I', new ItemStack(ModItems.reinforcedIronIngot)});

        // Tools
        craftManager.addRecipe(new ItemStack(ModItems.reinforcedAxe, 1), new Object[]{"BB", "BS", " S", 'B', new ItemStack(BlockDecsRoxasmod.BlockOfReinforcedIron), 'S', new ItemStack(ModItems.hardenedStick)});
        craftManager.addRecipe(new ItemStack(ModItems.reinforcedSword, 1), new Object[]{"B", "B", "S", 'B', new ItemStack(BlockDecsRoxasmod.BlockOfReinforcedIron), 'S', new ItemStack(ModItems.hardenedStick)});
        craftManager.addRecipe(new ItemStack(ModItems.reinforcedPick, 1), new Object[]{"BBB", " S ", " S ", 'B', new ItemStack(BlockDecsRoxasmod.BlockOfReinforcedIron), 'S', new ItemStack(ModItems.hardenedStick)});
        craftManager.addRecipe(new ItemStack(ModItems.reinforcedShovel, 1), new Object[]{"B", "S", "S", 'B', new ItemStack(BlockDecsRoxasmod.BlockOfReinforcedIron), 'S', new ItemStack(ModItems.hardenedStick)});
        craftManager.addRecipe(new ItemStack(ModItems.reinforcedHoe, 1), new Object[]{"BB", " S", " S", 'B', new ItemStack(BlockDecsRoxasmod.BlockOfReinforcedIron), 'S', new ItemStack(ModItems.hardenedStick)});

        craftManager.addRecipe(new ItemStack(ModItems.purpleGemAxe, 1), new Object[]{"BB", "BS", " S", 'B', new ItemStack(ModItems.purpleGem), 'S', new ItemStack(Items.stick)});
        craftManager.addRecipe(new ItemStack(ModItems.purpleGemSword, 1), new Object[]{"B", "B", "S", 'B', new ItemStack(ModItems.purpleGem), 'S', new ItemStack(Items.stick)});
        craftManager.addRecipe(new ItemStack(ModItems.purpleGemPick, 1), new Object[]{"BBB", " S ", " S ", 'B', new ItemStack(ModItems.purpleGem), 'S', new ItemStack(Items.stick)});
        craftManager.addRecipe(new ItemStack(ModItems.purpleGemShovel, 1), new Object[]{"B", "S", "S", 'B', new ItemStack(ModItems.purpleGem), 'S', new ItemStack(Items.stick)});
        craftManager.addRecipe(new ItemStack(ModItems.purpleGemHoe, 1), new Object[]{"BB", " S", " S", 'B', new ItemStack(ModItems.purpleGem), 'S', new ItemStack(Items.stick)});

        craftManager.addRecipe(new ItemStack(ModItems.redGemAxe, 1), new Object[]{"BB", "BS", " S", 'B', new ItemStack(ModItems.redGem), 'S', new ItemStack(Items.stick)});
        craftManager.addRecipe(new ItemStack(ModItems.redGemSword, 1), new Object[]{"B", "B", "S", 'B', new ItemStack(ModItems.redGem), 'S', new ItemStack(Items.stick)});
        craftManager.addRecipe(new ItemStack(ModItems.redGemPick, 1), new Object[]{"BBB", " S ", " S ", 'B', new ItemStack(ModItems.redGem), 'S', new ItemStack(Items.stick)});
        craftManager.addRecipe(new ItemStack(ModItems.redGemShovel, 1), new Object[]{"B", "S", "S", 'B', new ItemStack(ModItems.redGem), 'S', new ItemStack(Items.stick)});
        craftManager.addRecipe(new ItemStack(ModItems.redGemHoe, 1), new Object[]{"BB", " S", " S", 'B', new ItemStack(ModItems.redGem), 'S', new ItemStack(Items.stick)});

        craftManager.addRecipe(new ItemStack(ModItems.greenGemAxe, 1), new Object[]{"BB", "BS", " S", 'B', new ItemStack(ModItems.greenGem), 'S', new ItemStack(Items.stick)});
        craftManager.addRecipe(new ItemStack(ModItems.greenGemSword, 1), new Object[]{"B", "B", "S", 'B', new ItemStack(ModItems.greenGem), 'S', new ItemStack(Items.stick)});
        craftManager.addRecipe(new ItemStack(ModItems.greenGemPick, 1), new Object[]{"BBB", " S ", " S ", 'B', new ItemStack(ModItems.greenGem), 'S', new ItemStack(Items.stick)});
        craftManager.addRecipe(new ItemStack(ModItems.greenGemShovel, 1), new Object[]{"B", "S", "S", 'B', new ItemStack(ModItems.greenGem), 'S', new ItemStack(Items.stick)});
        craftManager.addRecipe(new ItemStack(ModItems.greenGemHoe, 1), new Object[]{"BB", " S", " S", 'B', new ItemStack(ModItems.greenGem), 'S', new ItemStack(Items.stick)});

        craftManager.addRecipe(new ItemStack(ModItems.blueGemAxe, 1), new Object[]{"BB", "BS", " S", 'B', new ItemStack(ModItems.blueGem), 'S', new ItemStack(Items.stick)});
        craftManager.addRecipe(new ItemStack(ModItems.blueGemSword, 1), new Object[]{"B", "B", "S", 'B', new ItemStack(ModItems.blueGem), 'S', new ItemStack(Items.stick)});
        craftManager.addRecipe(new ItemStack(ModItems.blueGemPick, 1), new Object[]{"BBB", " S ", " S ", 'B', new ItemStack(ModItems.blueGem), 'S', new ItemStack(Items.stick)});
        craftManager.addRecipe(new ItemStack(ModItems.blueGemShovel, 1), new Object[]{"B", "S", "S", 'B', new ItemStack(ModItems.blueGem), 'S', new ItemStack(Items.stick)});
        craftManager.addRecipe(new ItemStack(ModItems.blueGemHoe, 1), new Object[]{"BB", " S", " S", 'B', new ItemStack(ModItems.blueGem), 'S', new ItemStack(Items.stick)});

        craftManager.addRecipe(new ItemStack(ModItems.pinkGemAxe, 1), new Object[]{"BB", "BS", " S", 'B', new ItemStack(ModItems.pinkGem), 'S', new ItemStack(Items.stick)});
        craftManager.addRecipe(new ItemStack(ModItems.pinkGemSword, 1), new Object[]{"B", "B", "S", 'B', new ItemStack(ModItems.pinkGem), 'S', new ItemStack(Items.stick)});
        craftManager.addRecipe(new ItemStack(ModItems.pinkGemPick, 1), new Object[]{"BBB", " S ", " S ", 'B', new ItemStack(ModItems.pinkGem), 'S', new ItemStack(Items.stick)});
        craftManager.addRecipe(new ItemStack(ModItems.pinkGemShovel, 1), new Object[]{"B", "S", "S", 'B', new ItemStack(ModItems.pinkGem), 'S', new ItemStack(Items.stick)});
        craftManager.addRecipe(new ItemStack(ModItems.pinkGemHoe, 1), new Object[]{"BB", " S", " S", 'B', new ItemStack(ModItems.pinkGem), 'S', new ItemStack(Items.stick)});

        craftManager.addRecipe(new ItemStack(ModItems.orangeGemAxe, 1), new Object[]{"BB", "BS", " S", 'B', new ItemStack(ModItems.orangeGem), 'S', new ItemStack(Items.stick)});
        craftManager.addRecipe(new ItemStack(ModItems.orangeGemSword, 1), new Object[]{"B", "B", "S", 'B', new ItemStack(ModItems.orangeGem), 'S', new ItemStack(Items.stick)});
        craftManager.addRecipe(new ItemStack(ModItems.orangeGemPick, 1), new Object[]{"BBB", " S ", " S ", 'B', new ItemStack(ModItems.orangeGem), 'S', new ItemStack(Items.stick)});
        craftManager.addRecipe(new ItemStack(ModItems.orangeGemShovel, 1), new Object[]{"B", "S", "S", 'B', new ItemStack(ModItems.orangeGem), 'S', new ItemStack(Items.stick)});
        craftManager.addRecipe(new ItemStack(ModItems.orangeGemHoe, 1), new Object[]{"BB", " S", " S", 'B', new ItemStack(ModItems.orangeGem), 'S', new ItemStack(Items.stick)});

        craftManager.addRecipe(new ItemStack(ModItems.chromiumAxe, 1), new Object[]{"BB", "BS", " S", 'B', new ItemStack(ModItems.chromiumIngot), 'S', new ItemStack(Items.stick)});
        craftManager.addRecipe(new ItemStack(ModItems.chromiumSword, 1), new Object[]{"B", "B", "S", 'B', new ItemStack(ModItems.chromiumIngot), 'S', new ItemStack(Items.stick)});
        craftManager.addRecipe(new ItemStack(ModItems.chromiumPick, 1), new Object[]{"BBB", " S ", " S ", 'B', new ItemStack(ModItems.chromiumIngot), 'S', new ItemStack(Items.stick)});
        craftManager.addRecipe(new ItemStack(ModItems.chromiumShovel, 1), new Object[]{"B", "S", "S", 'B', new ItemStack(ModItems.chromiumIngot), 'S', new ItemStack(Items.stick)});
        craftManager.addRecipe(new ItemStack(ModItems.chromiumHoe, 1), new Object[]{"BB", " S", " S", 'B', new ItemStack(ModItems.chromiumIngot), 'S', new ItemStack(Items.stick)});

        craftManager.addRecipe(new ItemStack(ModItems.copperAxe, 1), new Object[]{"BB", "BS", " S", 'B', new ItemStack(ModItems.copperIngot), 'S', new ItemStack(Items.stick)});
        craftManager.addRecipe(new ItemStack(ModItems.copperSword, 1), new Object[]{"B", "B", "S", 'B', new ItemStack(ModItems.copperIngot), 'S', new ItemStack(Items.stick)});
        craftManager.addRecipe(new ItemStack(ModItems.copperPick, 1), new Object[]{"BBB", " S ", " S ", 'B', new ItemStack(ModItems.copperIngot), 'S', new ItemStack(Items.stick)});
        craftManager.addRecipe(new ItemStack(ModItems.copperShovel, 1), new Object[]{"B", "S", "S", 'B', new ItemStack(ModItems.copperIngot), 'S', new ItemStack(Items.stick)});
        craftManager.addRecipe(new ItemStack(ModItems.copperHoe, 1), new Object[]{"BB", " S", " S", 'B', new ItemStack(ModItems.copperIngot), 'S', new ItemStack(Items.stick)});

        craftManager.addRecipe(new ItemStack(ModItems.germaniumAxe, 1), new Object[]{"BB", "BS", " S", 'B', new ItemStack(ModItems.germaniumIngot), 'S', new ItemStack(Items.stick)});
        craftManager.addRecipe(new ItemStack(ModItems.germaniumSword, 1), new Object[]{"B", "B", "S", 'B', new ItemStack(ModItems.germaniumIngot), 'S', new ItemStack(Items.stick)});
        craftManager.addRecipe(new ItemStack(ModItems.germaniumPick, 1), new Object[]{"BBB", " S ", " S ", 'B', new ItemStack(ModItems.germaniumIngot), 'S', new ItemStack(Items.stick)});
        craftManager.addRecipe(new ItemStack(ModItems.germaniumShovel, 1), new Object[]{"B", "S", "S", 'B', new ItemStack(ModItems.germaniumIngot), 'S', new ItemStack(Items.stick)});
        craftManager.addRecipe(new ItemStack(ModItems.germaniumHoe, 1), new Object[]{"BB", " S", " S", 'B', new ItemStack(ModItems.germaniumIngot), 'S', new ItemStack(Items.stick)});

        craftManager.addRecipe(new ItemStack(ModItems.leadAxe, 1), new Object[]{"BB", "BS", " S", 'B', new ItemStack(ModItems.leadIngot), 'S', new ItemStack(Items.stick)});
        craftManager.addRecipe(new ItemStack(ModItems.leadSword, 1), new Object[]{"B", "B", "S", 'B', new ItemStack(ModItems.leadIngot), 'S', new ItemStack(Items.stick)});
        craftManager.addRecipe(new ItemStack(ModItems.leadPick, 1), new Object[]{"BBB", " S ", " S ", 'B', new ItemStack(ModItems.leadIngot), 'S', new ItemStack(Items.stick)});
        craftManager.addRecipe(new ItemStack(ModItems.leadShovel, 1), new Object[]{"B", "S", "S", 'B', new ItemStack(ModItems.leadIngot), 'S', new ItemStack(Items.stick)});
        craftManager.addRecipe(new ItemStack(ModItems.leadHoe, 1), new Object[]{"BB", " S", " S", 'B', new ItemStack(ModItems.leadIngot), 'S', new ItemStack(Items.stick)});

        craftManager.addRecipe(new ItemStack(ModItems.nickelAxe, 1), new Object[]{"BB", "BS", " S", 'B', new ItemStack(ModItems.nickelIngot), 'S', new ItemStack(Items.stick)});
        craftManager.addRecipe(new ItemStack(ModItems.nickelSword, 1), new Object[]{"B", "B", "S", 'B', new ItemStack(ModItems.nickelIngot), 'S', new ItemStack(Items.stick)});
        craftManager.addRecipe(new ItemStack(ModItems.nickelPick, 1), new Object[]{"BBB", " S ", " S ", 'B', new ItemStack(ModItems.nickelIngot), 'S', new ItemStack(Items.stick)});
        craftManager.addRecipe(new ItemStack(ModItems.nickelShovel, 1), new Object[]{"B", "S", "S", 'B', new ItemStack(ModItems.nickelIngot), 'S', new ItemStack(Items.stick)});
        craftManager.addRecipe(new ItemStack(ModItems.nickelHoe, 1), new Object[]{"BB", " S", " S", 'B', new ItemStack(ModItems.nickelIngot), 'S', new ItemStack(Items.stick)});

        craftManager.addRecipe(new ItemStack(ModItems.palladiumAxe, 1), new Object[]{"BB", "BS", " S", 'B', new ItemStack(ModItems.palladiumIngot), 'S', new ItemStack(Items.stick)});
        craftManager.addRecipe(new ItemStack(ModItems.palladiumSword, 1), new Object[]{"B", "B", "S", 'B', new ItemStack(ModItems.palladiumIngot), 'S', new ItemStack(Items.stick)});
        craftManager.addRecipe(new ItemStack(ModItems.palladiumPick, 1), new Object[]{"BBB", " S ", " S ", 'B', new ItemStack(ModItems.palladiumIngot), 'S', new ItemStack(Items.stick)});
        craftManager.addRecipe(new ItemStack(ModItems.palladiumShovel, 1), new Object[]{"B", "S", "S", 'B', new ItemStack(ModItems.palladiumIngot), 'S', new ItemStack(Items.stick)});
        craftManager.addRecipe(new ItemStack(ModItems.palladiumHoe, 1), new Object[]{"BB", " S", " S", 'B', new ItemStack(ModItems.palladiumIngot), 'S', new ItemStack(Items.stick)});

        craftManager.addRecipe(new ItemStack(ModItems.platinumAxe, 1), new Object[]{"BB", "BS", " S", 'B', new ItemStack(ModItems.platinumIngot), 'S', new ItemStack(Items.stick)});
        craftManager.addRecipe(new ItemStack(ModItems.platinumSword, 1), new Object[]{"B", "B", "S", 'B', new ItemStack(ModItems.platinumIngot), 'S', new ItemStack(Items.stick)});
        craftManager.addRecipe(new ItemStack(ModItems.platinumPick, 1), new Object[]{"BBB", " S ", " S ", 'B', new ItemStack(ModItems.platinumIngot), 'S', new ItemStack(Items.stick)});
        craftManager.addRecipe(new ItemStack(ModItems.platinumShovel, 1), new Object[]{"B", "S", "S", 'B', new ItemStack(ModItems.platinumIngot), 'S', new ItemStack(Items.stick)});
        craftManager.addRecipe(new ItemStack(ModItems.platinumHoe, 1), new Object[]{"BB", " S", " S", 'B', new ItemStack(ModItems.platinumIngot), 'S', new ItemStack(Items.stick)});

        craftManager.addRecipe(new ItemStack(ModItems.siliconAxe, 1), new Object[]{"BB", "BS", " S", 'B', new ItemStack(ModItems.siliconIngot), 'S', new ItemStack(Items.stick)});
        craftManager.addRecipe(new ItemStack(ModItems.siliconSword, 1), new Object[]{"B", "B", "S", 'B', new ItemStack(ModItems.siliconIngot), 'S', new ItemStack(Items.stick)});
        craftManager.addRecipe(new ItemStack(ModItems.siliconPick, 1), new Object[]{"BBB", " S ", " S ", 'B', new ItemStack(ModItems.siliconIngot), 'S', new ItemStack(Items.stick)});
        craftManager.addRecipe(new ItemStack(ModItems.siliconShovel, 1), new Object[]{"B", "S", "S", 'B', new ItemStack(ModItems.siliconIngot), 'S', new ItemStack(Items.stick)});
        craftManager.addRecipe(new ItemStack(ModItems.siliconHoe, 1), new Object[]{"BB", " S", " S", 'B', new ItemStack(ModItems.siliconIngot), 'S', new ItemStack(Items.stick)});

        craftManager.addRecipe(new ItemStack(ModItems.tinAxe, 1), new Object[]{"BB", "BS", " S", 'B', new ItemStack(ModItems.tinIngot), 'S', new ItemStack(Items.stick)});
        craftManager.addRecipe(new ItemStack(ModItems.tinSword, 1), new Object[]{"B", "B", "S", 'B', new ItemStack(ModItems.tinIngot), 'S', new ItemStack(Items.stick)});
        craftManager.addRecipe(new ItemStack(ModItems.tinPick, 1), new Object[]{"BBB", " S ", " S ", 'B', new ItemStack(ModItems.tinIngot), 'S', new ItemStack(Items.stick)});
        craftManager.addRecipe(new ItemStack(ModItems.tinShovel, 1), new Object[]{"B", "S", "S", 'B', new ItemStack(ModItems.tinIngot), 'S', new ItemStack(Items.stick)});
        craftManager.addRecipe(new ItemStack(ModItems.tinHoe, 1), new Object[]{"BB", " S", " S", 'B', new ItemStack(ModItems.tinIngot), 'S', new ItemStack(Items.stick)});
    }
}