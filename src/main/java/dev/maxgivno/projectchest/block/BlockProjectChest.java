package dev.maxgivno.projectchest.block;

import dev.maxgivno.projectchest.creativetab.CreativeTab;
import net.minecraft.block.material.Material;

public class BlockProjectChest extends BlockBase {

    public BlockProjectChest() {
        super(Material.wood);
        this.setCreativeTab(CreativeTab.PCH_TAB);
    }
}
