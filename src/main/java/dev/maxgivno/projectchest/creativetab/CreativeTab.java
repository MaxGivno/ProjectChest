package dev.maxgivno.projectchest.creativetab;

import dev.maxgivno.projectchest.reference.ModInfo;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

public class CreativeTab{
    public static final CreativeTabs PCH_TAB = new CreativeTabs(ModInfo.LOWERCASE_MOD_ID) {
        @Override
        public Item getTabIconItem() {
            return Item.getItemFromBlock(Blocks.chest);
        }
    };
}
