package nanter.mineflow.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class MainTab extends CreativeTabs {

    public MainTab(String label) {
        super(label);
        setBackgroundImageName(label + ".png"); //the file name should be "tab_mineflow_main.png"
    }

    @Override
    public Item getTabIconItem() {
        return Items.EMERALD;
    }

    @Override
    public boolean hasSearchBar() {
        return true;
    }

}
