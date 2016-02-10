package dev.maxgivno.projectchest.proxy;

import dev.maxgivno.projectchest.init.ModBlocks;
import dev.maxgivno.projectchest.init.Recipes;

public class CommonProxy implements IProxy{
    @Override
    public void registerBlocks() {
        ModBlocks.init();
    }

    @Override
    public void registerRecipes() {
        Recipes.init();
    }

    @Override
    public void registerRenders() {

    }
}
