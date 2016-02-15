package dev.maxgivno.projectchest.init;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class Recipes {

    public static void init() {
        initModRecipes();
    }

    public static void initModRecipes(){
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.projectChest), "www", "wqw", "www", 'w', "plankWood", 'q', Items.writable_book));
    }
}
