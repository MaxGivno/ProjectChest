package dev.maxgivno.projectchest.block;

import dev.maxgivno.projectchest.creativetab.CreativeTab;
import dev.maxgivno.projectchest.reference.Names;
import dev.maxgivno.projectchest.tileentity.TileEntityProjectChest;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockProjectChest extends BlockBase {

    public BlockProjectChest() {
        super(Material.wood);
        this.setUnlocalizedName(Names.Blocks.PROJECT_CHEST);
        this.setCreativeTab(CreativeTab.PCH_TAB);
    }

    @Override
    public TileEntity createNewTileEntity(World var1, int var2) {
        return new TileEntityProjectChest();
    }

    @Override
    public boolean isOpaqueCube() {
        return false;
    }


}
