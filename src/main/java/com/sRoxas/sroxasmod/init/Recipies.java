package com.sRoxas.sroxasmod.init;

import com.sRoxas.sroxasmod.blocks.BlockDecsRoxasmod;
import com.sRoxas.sroxasmod.blocks.BlockssRoxasmod;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;

public class Recipies {
    public static void init(CraftingManager craftManager) {
        // Misc Items
        craftManager.addShapelessRecipe(new ItemStack(BlockDecsRoxasmod.BambooPlanks, 16), new Object[]{Blocks.log, Blocks.log});
        craftManager.addShapelessRecipe(new ItemStack(ModItems.cheese, 4), new Object[]{Items.milk_bucket});

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
    }
}