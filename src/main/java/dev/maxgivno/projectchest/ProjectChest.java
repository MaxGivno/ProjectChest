package dev.maxgivno.projectchest;

import dev.maxgivno.projectchest.proxy.IProxy;
import dev.maxgivno.projectchest.reference.ModInfo;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = ModInfo.MOD_ID, name = ModInfo.MOD_NAME, certificateFingerprint = ModInfo.FINGERPRINT, dependencies = ModInfo.DEPENDENCIES, version = ModInfo.VERSION_BUILD)
public class ProjectChest {
    @Mod.Instance(ModInfo.MOD_ID)
    public static ProjectChest instance;

    @SidedProxy(clientSide = ModInfo.CLIENT_PROXY_CLASS, serverSide = ModInfo.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        //Register Blocks
        proxy.registerBlocks();

        //Register Items

        //Register Recipes
        proxy.registerRecipes();

        //Register Fuel Registry

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        //Register ItemBlocks
        proxy.registerRenders();

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }
}
