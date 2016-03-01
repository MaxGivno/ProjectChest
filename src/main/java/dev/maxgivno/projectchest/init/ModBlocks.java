package dev.maxgivno.projectchest.init;

import dev.maxgivno.projectchest.block.BlockBase;
import dev.maxgivno.projectchest.block.BlockProjectChest;
import dev.maxgivno.projectchest.reference.ModInfo;
import net.minecraftforge.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(ModInfo.MOD_ID)
public class ModBlocks {
    public static final BlockBase projectchest = new BlockProjectChest();

    public static void init() {
        GameRegistry.registerBlock(projectchest, "projectchest");
    }
}
