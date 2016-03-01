package dev.maxgivno.projectchest.block;

import dev.maxgivno.projectchest.creativetab.CreativeTab;
import dev.maxgivno.projectchest.reference.Names;
import net.minecraft.block.material.Material;

public class BlockProjectChest extends BlockBase {

    public BlockProjectChest() {
        super(Material.wood);
        this.setUnlocalizedName(Names.Blocks.PROJECT_CHEST);
        this.setCreativeTab(CreativeTab.PCH_TAB);
    }

    @Override
    public int getRenderType() {
        return 2;
    }
}
